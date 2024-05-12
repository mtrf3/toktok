package com.bytedance.ugc.glue.http;

/* loaded from: classes17.dex */
public abstract class UGCSimpleRequest<T> extends UGCRequest<T> implements UGCCallback<T> {
    public UGCSimpleRequest() {
        setCallback(this);
    }
}
