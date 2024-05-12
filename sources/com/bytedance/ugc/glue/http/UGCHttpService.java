package com.bytedance.ugc.glue.http;

/* loaded from: classes17.dex */
public class UGCHttpService {
    public static UGCHttpService instance = new UGCHttpService();

    public static UGCHttpService getInstance() {
        return instance;
    }

    public final void register() {
        instance = this;
    }

    public static <T> void send(UGCRequest<T> uGCRequest) {
        getInstance().sendImpl(uGCRequest);
    }

    public <T> void sendImpl(UGCRequest<T> uGCRequest) {
        UGCCallback<T> callback = uGCRequest.getCallback();
        if (callback != null) {
            callback.onResponse(0, null);
        }
    }
}
