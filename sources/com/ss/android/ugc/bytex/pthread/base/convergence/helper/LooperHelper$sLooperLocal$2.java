package com.ss.android.ugc.bytex.pthread.base.convergence.helper;

import X.AbstractC65781Prl;
import X.InterfaceC65784Pro;
import android.os.Looper;
import java.lang.reflect.Field;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class LooperHelper$sLooperLocal$2 extends AbstractC65781Prl implements InterfaceC65784Pro<ThreadLocal<Looper>> {
    public static final LooperHelper$sLooperLocal$2 INSTANCE = new LooperHelper$sLooperLocal$2();

    public LooperHelper$sLooperLocal$2() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final ThreadLocal<Looper> invoke() {
        Field field = Looper.class.getDeclaredField("sThreadLocal");
        o.LJFF(field, "field");
        field.setAccessible(true);
        Object obj = field.get(null);
        return (ThreadLocal) (obj instanceof ThreadLocal ? obj : null);
    }
}
