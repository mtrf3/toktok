package com.bytedance.sdk.xbridge.registry.core.model.idl;

import java.util.List;
import java.util.Map;

/* loaded from: classes14.dex */
public interface IDLXDynamic {
    List<Object> asArray();

    boolean asBoolean();

    byte[] asByteArray();

    double asDouble();

    int asInt();

    long asLong();

    Map<String, Object> asMap();

    String asString();

    XDynamicType getType();

    boolean isNull();

    void recycle();
}
