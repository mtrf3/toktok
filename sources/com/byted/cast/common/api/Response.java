package com.byted.cast.common.api;

import X.X1D;
import java.util.Map;

/* loaded from: classes29.dex */
public class Response {
    public String body;
    public int code;
    public Map<String, String> headers;
    public String msg;

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Response{headers=");
        LIZ.append(this.headers);
        LIZ.append(", body='");
        LIZ.append(this.body);
        LIZ.append('\'');
        LIZ.append(", code=");
        LIZ.append(this.code);
        LIZ.append(", msg='");
        LIZ.append(this.msg);
        LIZ.append('\'');
        LIZ.append('}');
        return X1D.LIZIZ(LIZ);
    }

    public Response(String str, int i, String str2) {
        this.body = str;
        this.code = i;
        this.msg = str2;
    }

    public Response(Map<String, String> map, String str, int i, String str2) {
        this.headers = map;
        this.body = str;
        this.code = i;
        this.msg = str2;
    }
}
