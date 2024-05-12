package com.bytedance.ies.lynx.lynx_adapter.wrapper;

/* loaded from: classes7.dex */
public interface DynamicWrapper {
    ReadableArrayWrapper asArray();

    boolean asBoolean();

    double asDouble();

    int asInt();

    ReadableMapWrapper asMap();

    String asString();

    ReadableTypeWrapper getType();

    boolean isNull();

    void recycle();
}
