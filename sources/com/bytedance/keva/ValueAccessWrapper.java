package com.bytedance.keva;

/* loaded from: classes17.dex */
public class ValueAccessWrapper {
    public long accessTime;
    public Object value;

    public ValueAccessWrapper(Object obj, long j) {
        this.value = obj;
        this.accessTime = j;
    }
}
