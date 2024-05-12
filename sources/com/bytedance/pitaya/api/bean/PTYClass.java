package com.bytedance.pitaya.api.bean;

import X.JFR;
import com.bytedance.pitaya.jniwrapper.ReflectionCall;
import java.util.UUID;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public abstract class PTYClass implements ReflectionCall {
    public static final JFR Companion = new JFR();
    public final String bindID;
    public final int classType;

    public PTYClass() {
        this(0, 1, null);
    }

    public final String getBindID$pitayacore_release() {
        return this.bindID;
    }

    public final int getClassType() {
        return this.classType;
    }

    public String toString() {
        return this.bindID;
    }

    public PTYClass(int i) {
        this.classType = i;
        String uuid = UUID.randomUUID().toString();
        o.LJFF(uuid, "UUID.randomUUID().toString()");
        this.bindID = uuid;
    }

    public /* synthetic */ PTYClass(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 4 : i);
    }
}
