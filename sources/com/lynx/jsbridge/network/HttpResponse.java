package com.lynx.jsbridge.network;

import com.lynx.react.bridge.JavaOnlyMap;

/* loaded from: classes7.dex */
public class HttpResponse {
    public int LIZ;
    public int LIZIZ;
    public String LIZJ = "";
    public String LIZLLL;
    public JavaOnlyMap LJ;
    public byte[] LJFF;
    public String LJI;

    public byte[] getBody() {
        return this.LJFF;
    }

    public int getClientCode() {
        return this.LIZIZ;
    }

    public String getErrorMessage() {
        return this.LJI;
    }

    public JavaOnlyMap getHttpHeaderFields() {
        return this.LJ;
    }

    public String getMIMEType() {
        return this.LIZLLL;
    }

    public int getStatusCode() {
        return this.LIZ;
    }

    public String getUrl() {
        return this.LIZJ;
    }
}
