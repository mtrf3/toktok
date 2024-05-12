package com.bytedance.vmsdk.net;

import X.C16880lQ;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public class Request {
    public InputStream body;
    public Map<String, String> headers;
    public String method;
    public String url;

    public String getBodyString() {
        int read;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[4096];
        do {
            try {
                read = this.body.read(bArr, 0, 4096);
                if (read > 0) {
                    byteArrayOutputStream.write(bArr, 0, read);
                }
            } catch (IOException e) {
                C16880lQ.LLLLIIL(e);
                return "";
            }
        } while (read > 0);
        return byteArrayOutputStream.toString();
    }

    public InputStream getBody() {
        return this.body;
    }

    public Map<String, String> getHeaders() {
        return this.headers;
    }

    public String getMethod() {
        return this.method;
    }

    public String getUrl() {
        return this.url;
    }

    public Request(String str, JSONObject jSONObject, byte[] bArr) {
        String str2;
        ByteArrayInputStream byteArrayInputStream;
        try {
            this.url = str;
            if (jSONObject.has("method")) {
                str2 = JSONObjectProtectorUtils.getString(jSONObject, "method");
            } else {
                str2 = "GET";
            }
            this.method = str2;
            if (bArr == null || bArr.length == 0) {
                if (jSONObject.has("body")) {
                    byteArrayInputStream = new ByteArrayInputStream(JSONObjectProtectorUtils.getString(jSONObject, "body").getBytes());
                } else {
                    byteArrayInputStream = null;
                }
                this.body = byteArrayInputStream;
            } else {
                this.body = new ByteArrayInputStream(bArr);
            }
            JSONObject jSONObject2 = (JSONObject) jSONObject.opt("headers");
            this.headers = new HashMap();
            if (jSONObject2 != null) {
                Iterator<String> keys = jSONObject2.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    this.headers.put(next, JSONObjectProtectorUtils.getString(jSONObject2, next));
                }
            }
        } catch (JSONException e) {
            C16880lQ.LLLLIIL(e);
        }
    }
}
