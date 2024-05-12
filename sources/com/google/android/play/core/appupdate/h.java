package com.google.android.play.core.appupdate;

import X.AbstractC65291Pjr;
import X.C113554cx;
import X.C65265PjR;
import X.OSZ;
import X.T7P;
import android.app.Activity;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes12.dex */
public final class h {
    public final Object LIZ;

    public h(int i) {
        if (i != 3) {
            T7P t7p = T7P.INVITATION;
            Boolean bool = Boolean.FALSE;
            this.LIZ = C113554cx.LJJLIIIIJ(new OSZ(t7p, bool), new OSZ(T7P.RECOMMEND, bool), new OSZ(T7P.MIXED, bool));
            return;
        }
        this.LIZ = new AtomicReference(null);
    }

    public final boolean LIZIZ(T7P type) {
        kotlin.jvm.internal.o.LJIIIZ(type, "type");
        Boolean bool = (Boolean) ((Map) this.LIZ).get(type);
        ((Map) this.LIZ).put(type, Boolean.TRUE);
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public final void LIZJ(List types) {
        kotlin.jvm.internal.o.LJIIIZ(types, "types");
        Iterator it = types.iterator();
        while (it.hasNext()) {
            ((Map) this.LIZ).put(it.next(), Boolean.FALSE);
        }
    }

    public /* synthetic */ h(Object obj) {
        this.LIZ = obj;
    }

    public final boolean LIZ(Activity activity, AbstractC65291Pjr abstractC65291Pjr) {
        boolean z = true;
        if (((AtomicReference) this.LIZ).get() != null) {
            C65265PjR.LIZIZ().getClass();
            return false;
        }
        if (!abstractC65291Pjr.LIZ(activity)) {
            return false;
        }
        AtomicReference atomicReference = (AtomicReference) this.LIZ;
        while (true) {
            if (atomicReference.compareAndSet(null, abstractC65291Pjr)) {
                break;
            }
            if (atomicReference.get() != null) {
                z = false;
                C65265PjR.LIZIZ().getClass();
                break;
            }
        }
        return z;
    }
}
