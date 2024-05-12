package com.ss.android.ugc.bytex.pthread.base.proxy;

import java.util.Timer;
import kotlin.jvm.internal.o;

/* loaded from: classes3.dex */
public class PthreadTimer extends Timer {
    public PthreadTimer() {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PthreadTimer(String name) {
        super(name);
        o.LJIIJ(name, "name");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PthreadTimer(String name, boolean z) {
        super(name, z);
        o.LJIIJ(name, "name");
    }

    public PthreadTimer(boolean z) {
        super(z);
    }
}
