package com.bytedance.helios.binder.impl;

import X.C16880lQ;
import X.C65852Psu;
import X.C66059PwF;
import X.EV0;
import X.InterfaceC64482PSk;
import X.PQ4;
import android.content.Context;
import android.os.Parcel;
import com.bytedance.helios.api.config.BinderConfig;
import com.bytedance.helios.binder.BinderEntry;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public final class BinderMonitor implements PQ4 {
    public String LIZJ;
    public static final Companion LJFF = new Companion();
    public static final BinderMonitor LJ = new BinderMonitor();
    public final List<InterfaceC64482PSk> LIZ = new CopyOnWriteArrayList();
    public final HashMap<String, EV0> LIZIZ = new HashMap<>();
    public final AtomicBoolean LIZLLL = new AtomicBoolean(false);

    public static final BinderMonitor get() {
        return LJFF.get();
    }

    /* loaded from: classes12.dex */
    public static final class Companion {
        public final BinderMonitor get() {
            return BinderMonitor.LJ;
        }
    }

    public final void LIZIZ(BinderConfig binderConfig, Context context) {
        o.LJIIIZ(binderConfig, "binderConfig");
        o.LJIIIZ(context, "context");
        if (!binderConfig.enabled || this.LIZLLL.getAndSet(true)) {
            return;
        }
        this.LIZJ = context.getPackageName();
        BinderEntry.LIZIZ.LIZ(this);
    }

    @Override // X.PQ4
    public final boolean LIZ(String descriptor, int i, Parcel data, Parcel parcel) {
        Map<Integer, Method> LIZ;
        Method method;
        o.LJIIIZ(descriptor, "descriptor");
        o.LJIIIZ(data, "data");
        EV0 ev0 = this.LIZIZ.get(descriptor);
        if (ev0 != null && (LIZ = ev0.LIZ()) != null && (method = LIZ.get(Integer.valueOf(i))) != null) {
            Iterator it = ((CopyOnWriteArrayList) this.LIZ).iterator();
            while (it.hasNext()) {
                InterfaceC64482PSk interfaceC64482PSk = (InterfaceC64482PSk) it.next();
                try {
                    if (interfaceC64482PSk.LIZIZ().contains(descriptor) && interfaceC64482PSk.LIZ(descriptor, method, data, parcel)) {
                        return true;
                    }
                } catch (Throwable th) {
                    C66059PwF.LIZIZ(new C65852Psu(C16880lQ.LLLLIIIILLL(), th, "BinderMonitor", (Map) null, 24));
                }
            }
            return false;
        }
        return false;
    }
}
