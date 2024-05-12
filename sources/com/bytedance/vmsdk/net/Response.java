package com.bytedance.vmsdk.net;

import X.KMP;
import com.bytedance.vmsdk.jsbridge.utils.JavaOnlyMap;
import com.bytedance.vmsdk.jsbridge.utils.ReadableMap;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Map;

/* loaded from: classes7.dex */
public class Response {
    public final String TAG = "Response";
    public final byte[] body;
    public ReadableMap headers;
    public long mNativeResponse;
    public final String mimeType;
    public final int status;
    public final String url;

    public static native long nativeCreateResponse(Response response);

    public byte[] getBodyBytes() {
        return this.body;
    }

    public ReadableMap getHeaders() {
        return this.headers;
    }

    public int getStatusCode() {
        return this.status;
    }

    public String getUrl() {
        return this.url;
    }

    public byte[] getBodyBytesInternal(InputStream inputStream) {
        int read;
        byte[] bArr = new byte[1024];
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            do {
                read = inputStream.read(bArr, 0, 1024);
                if (read > 0) {
                    byteArrayOutputStream.write(bArr, 0, read);
                }
            } while (read > 0);
            return byteArrayOutputStream.toByteArray();
        } catch (IOException unused) {
            return null;
        }
    }

    public Response(String str, int i, Map map, InputStream inputStream, String str2) {
        if (str != null) {
            if (i >= 200) {
                this.url = str;
                this.status = i;
                this.mimeType = str2;
                this.headers = JavaOnlyMap.from(map);
                if (inputStream == null) {
                    this.body = null;
                } else {
                    this.body = getBodyBytesInternal(inputStream);
                }
                this.mNativeResponse = nativeCreateResponse(this);
                return;
            }
            throw new IllegalArgumentException(KMP.LJ("Invalid status code: ", i));
        }
        throw new IllegalArgumentException("url == null");
    }
}
