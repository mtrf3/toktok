package com.byted.cast.common.config.pojo;

import X.InterfaceC65349Pkn;

/* loaded from: classes29.dex */
public class CollectInfo<T> {

    @InterfaceC65349Pkn("key")
    public String key;

    @InterfaceC65349Pkn("value")
    public T value;

    public CollectInfo(String str, T t) {
        this.key = str;
        this.value = t;
    }
}
