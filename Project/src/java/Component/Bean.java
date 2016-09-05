package Component;

import java.io.Serializable;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Map.Entry;
import java.util.Set;

public class Bean implements Serializable {

    private Hashtable<String, String> _properties = new Hashtable<String, String>();

    public Bean() {

    }
    
    public boolean isValid() {
        return !_properties.get("email").equals("");
    }

    public void setProperty(String name, String value) {
        _properties.put(name, value);
    }

    public String getProperty(String name) {
        return _properties.get(name);
    }

    public Enumeration<String> getPropertyNames() {
        return _properties.keys();
    }

    public Hashtable<String, String> getProperties() {
        return _properties;
    }

    public Set<Entry<String, String>> getSet() {
        return _properties.entrySet();
    }

    // Standard bean methods
    public String getFirstname() {
        return getProperty("firstname");
    }

    public String getLastname() {
        return getProperty("lastname");
    }

    public String getEmail() {
        return getProperty("email");
    }

    public String getPassword() {
        return getProperty("password");
    }

    public String getVerifypassword() {
        return getProperty("verifypassword");
    }

    public String getDisplayname() {
        return getProperty("displayname");
    }

    public String getCountry() {
        return getProperty("country");
    }

    public String getCity() {
        return getProperty("city");
    }

    public String getLanguage() {
        return getProperty("language");
    }

    public String getSecurityquestion() {
        return getProperty("securityquestion");
    }

    public String getSecurityanswer() {
        return getProperty("securityanswer");
    }

    public String getContact1() {
        return getProperty("contact1");
    }

    public String getContact2() {
        return getProperty("contact2");
    }

    public void setFirstname(String value) {
        setProperty("firstname", value);
    }

    public void setLastname(String value) {
        setProperty("lastname", value);
    }

    public void setEmail(String value) {
        setProperty("email", value);
    }

    public void setPassword(String value) {
        setProperty("password", value);
    }

    public void setVerifypassword(String value) {
        setProperty("verifypassword", value);
    }

    public void setDisplayname(String value) {
        setProperty("displayname", value);
    }

    public void setCountry(String value) {
        setProperty("country", value);
    }

    public void setCity(String value) {
        setProperty("city", value);
    }

    public void setLanguage(String value) {
        setProperty("language", value);
    }

    public void setSecurityquestion(String value) {
        setProperty("securityquestion", value);
    }

    public void setSecurityanswer(String value) {
        setProperty("securityanswer", value);
    }

    public void setContact1(String value) {
        setProperty("contact1", value);
    }

    public void setContact2(String value) {
        setProperty("contact2", value);
    }
}
