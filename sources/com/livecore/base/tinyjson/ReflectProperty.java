package com.livecore.base.tinyjson;

import com.livecore.base.tinyjson.annotations.Serialized;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class ReflectProperty {
    public final ReflectType reflectType;
    public final Serialized serialized;

    public final ReflectType getReflectType() {
        return this.reflectType;
    }

    public final Serialized getSerialized() {
        return this.serialized;
    }

    public ReflectProperty(Serialized serialized, ReflectType reflectType) {
        o.LJIIIZ(reflectType, "reflectType");
        this.serialized = serialized;
        this.reflectType = reflectType;
    }
}
