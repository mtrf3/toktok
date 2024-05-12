package com.bytedance.express.command;

import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public final class Instruction {
    public final int i;
    public final Object v;

    public final int getI() {
        return this.i;
    }

    public final Object getV() {
        return this.v;
    }

    public Instruction(int i, Object v) {
        o.LJIIJ(v, "v");
        this.i = i;
        this.v = v;
    }
}
