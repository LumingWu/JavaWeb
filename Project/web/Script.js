$(document).ready(function () {
    var domain = "http://localhost:8081/";

    var firstname = $("#firstname");
    var lastname = $("#lastname");
    var nameresponse = $("#nameresponse");
    
    function validateName(){
        if (firstname.val().length) {
            if (lastname.val().length) {
                nameresponse.text("");
            } else {
                nameresponse.text("Last name cannot be blank.");
            }
        } else if (lastname.val().length) {
            nameresponse.text("First name cannot be blank.");
        } else {
            nameresponse.text("First and last name cannot be blank.");
        }
    }
    firstname.blur(validateName);
    lastname.blur(validateName);


    var email = $("#email");
    var emailresponse = $("#emailresponse");

    email.blur(function () {
        if (email.val().indexOf("@") + 1) {
            emailresponse.text("");
        } else {
            emailresponse.text("This is not a valid email address.");
        }
    });


    var password = $("#password");
    var verifypassword = $("#verifypassword");
    var passwordresponse = $("#passwordresponse");
    var verifypasswordresponse = $("#verifypasswordresponse");

    password.blur(function () {
        if (password.val().length) {
            passwordresponse.text("");
        } else {
            passwordresponse.text("The password you entered is not valid.");
        }
        if (verifypasswordresponse.text().length || verifypassword.val().length) {
            validateVerifyPassword();
        }
    });


    function validateVerifyPassword() {
        if (verifypassword.val().length) {
            if (verifypassword.val() === password.val()) {
                verifypasswordresponse.text("");
            } else {
                verifypasswordresponse.text("The passwords did not match.");
            }
        } else {
            verifypasswordresponse.text("The password you entered is not valid.");
        }
    }
    verifypassword.blur(validateVerifyPassword);

    var displayname = $("#displayname");
    var displaynameresponse = $("#displaynameresponse");

    displayname.blur(function () {
        if (displayname.val().length) {
            displaynameresponse.text("");
        } else {
            displaynameresponse.text("This display name is not valid. Please choose another.");
        }
    });


    var country = $("#country");
    var countryresponse = $("#countryresponse");

    country.blur(function () {
        countryresponse.load(domain + "CountryServlet?country=" + encodeURI(country.val()));
    });

    var language = $("#language");
    var languageresponse = $("#languageresponse");

    language.blur(function () {
        if (language.val().length) {
            languageresponse.text("");
        } else {
            languageresponse.text("Select one.");
        }
    });

    var securityquestion = $("#securityquestion");
    var securityquestionresponse = $("#securityquestionresponse");

    securityquestion.blur(function () {
        if (securityquestion.val().length) {
            securityquestionresponse.text("");
        } else {
            securityquestionresponse.text("Select one.");
        }
    });


    var securityanswer = $("#securityanswer");
    var securityanswerresponse = $("#securityanswerresponse");

    securityanswer.blur(function () {
        if (securityanswer.val().length) {
            securityanswerresponse.text("");
        } else {
            securityanswerresponse.text("Security answer cannot be blank.");
        }
    });

});