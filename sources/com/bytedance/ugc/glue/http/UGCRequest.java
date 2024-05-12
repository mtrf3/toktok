package com.bytedance.ugc.glue.http;

import java.util.HashMap;
import org.json.JSONObject;

/* loaded from: classes17.dex */
public class UGCRequest<T> {
    public static String HOST = "";
    public static String SCHEME = "https";
    public static boolean USE_GET_METHOD;
    public UGCCallback<T> callback;
    public UGCCallbackWithHeader<T> callbackWithHeader;
    public String url;
    public final HashMap<String, String> getParams = new HashMap<>();
    public final HashMap<String, String> params = new HashMap<>();
    public JSONObject jsonParams = null;
    public String scheme = SCHEME;
    public String host = HOST;
    public boolean useGetMethod = USE_GET_METHOD;

    public UGCCallback<T> getCallback() {
        return this.callback;
    }

    public UGCCallbackWithHeader<T> getCallbackWithHeader() {
        return this.callbackWithHeader;
    }

    public HashMap<String, String> getGetParams() {
        return this.getParams;
    }

    public String getHost() {
        return this.host;
    }

    public JSONObject getJsonParams() {
        return this.jsonParams;
    }

    public HashMap<String, String> getParams() {
        return this.params;
    }

    public String getScheme() {
        return this.scheme;
    }

    public String getUrl() {
        return this.url;
    }

    public boolean isUseGetMethod() {
        return this.useGetMethod;
    }

    public void send() {
        UGCHttpService.send(this);
    }

    public void setCallback(UGCCallback<T> uGCCallback) {
        this.callback = uGCCallback;
    }

    public void setCallbackWithHeader(UGCCallbackWithHeader<T> uGCCallbackWithHeader) {
        this.callbackWithHeader = uGCCallbackWithHeader;
    }

    public void addGetParam(String str, Object obj) {
        if (obj != null) {
            this.getParams.put(str, String.valueOf(obj));
        }
    }

    public void addParam(String str, Object obj) {
        if (obj != null) {
            this.params.put(str, String.valueOf(obj));
        }
    }
}
