package com.bytedance.ies.bullet.kit.lynx.api;

/* loaded from: classes7.dex */
public interface BulletDynamic {
    BulletReadableArray asArray();

    boolean asBoolean();

    double asDouble();

    int asInt();

    BulletReadableMap asMap();

    String asString();

    BulletReadableType getType();

    boolean isNull();

    void recycle();
}
