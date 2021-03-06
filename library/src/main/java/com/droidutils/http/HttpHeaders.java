package com.droidutils.http;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Mkhitar on 07.09.2014.
 */
public class HttpHeaders {

    public static final String ACCEPT = "Accept";
    public static final String ACCEPT_CHARSET = "Accept-Charset";
    public static final String ACCEPT_ENCODING = "Accept-Encoding";
    public static final String ACCEPT_LANGUAGE = "Accept-Language";
    public static final String ALLOW = "Allow";
    public static final String AUTHORIZATION = "Authorization";
    public static final String CACHE_CONTROL = "Cache-Control";
    public static final String CONTENT_DISPOSITION = "Content-Disposition";
    public static final String CONTENT_ENCODING = "Content-Encoding";
    public static final String CONTENT_LENGTH = "Content-Length";
    public static final String CONTENT_TYPE = "Content-Type";
    public static final String DATE = "Date";
    public static final String ETAG = "ETag";
    public static final String EXPIRES = "Expires";
    public static final String IF_MODIFIED_SINCE = "If-Modified-Since";
    public static final String IF_NONE_MATCH = "If-None-Match";
    public static final String LAST_MODIFIED = "Last-Modified";
    public static final String LOCATION = "Location";
    public static final String PRAGMA = "Pragma";
    public static final String USER_AGENT = "User-Agent";

    private List<HttpHeader> mHeaders;

    public HttpHeaders() {
        mHeaders = new ArrayList<HttpHeader>();
    }

    public void clearHeaders() {
        mHeaders.clear();
    }

    public void add(String key, String value) {
        mHeaders.add(new HttpHeader(key, value));
    }

    public void add(HttpHeader header) {
        mHeaders.add(header);
    }

    public List<HttpHeader> getHeaders() {
        return mHeaders;
    }
}
