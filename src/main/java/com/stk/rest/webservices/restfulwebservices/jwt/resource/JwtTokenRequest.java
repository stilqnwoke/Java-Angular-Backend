package com.stk.rest.webservices.restfulwebservices.jwt.resource;

import java.io.Serializable;

public class JwtTokenRequest implements Serializable {

    private static final long serialVersionUID = -5616176897013108345L;

    private String username;
    private String password;

//    {
//        "token": "eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJzdGt3ZSIsImV4cCI6MTY0MzE5Mjc2NywiaWF0IjoxNjQyNTg3OTY3fQ.PsbwaQME2Mo7TxRp7vKbApv3BtwW2NNFMsBb5A2hcNrC7EcfrB5moEuGTObu4vt5s6v89b5cpAo6nhLITHT8kg"
//    }

    public JwtTokenRequest() {
        super();
    }

    public JwtTokenRequest(String username, String password) {
        this.setUsername(username);
        this.setPassword(password);
    }

    public String getUsername() {
        return this.username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
