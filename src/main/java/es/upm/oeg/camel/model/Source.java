package es.upm.oeg.camel.model;

import lombok.Data;

@Data
public class Source {

    private String name;
    private String uri;
    private String url;
    private String protocol;
}
