package me.anon.f95zone.api;

import java.util.ArrayList;

public class Request
{
    private final String BASE = "https://f95zone.to/";
    private String endpoint;
    private ArrayList<String> parameters;
    
    public Request(String endpoint, String... parameters)
    {
        this.endpoint = endpoint;
        for (String arg : parameters)
            this.parameters.add(arg);
    }
    
    public JSONResponse getJSONResponse()
    {
        return new JSONResponse();
    }
    
    public String getRawResponse()
    {
        return "";
    }
}
