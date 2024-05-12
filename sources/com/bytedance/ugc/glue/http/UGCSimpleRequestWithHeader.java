package com.bytedance.ugc.glue.http;

/* loaded from: classes17.dex */
public abstract class UGCSimpleRequestWithHeader<T> extends UGCRequest<T> implements UGCCallbackWithHeader<T> {
    public UGCSimpleRequestWithHeader() {
        setCallbackWithHeader(this);
    }
}
