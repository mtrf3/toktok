package com.bytedance.provider.preload;

import X.C141335gf;
import X.C3C5;
import X.C55249LmH;
import X.InterfaceC55235Lm3;
import X.LQ5;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import java.util.HashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class PreLoader {
    public static final HashMap<LifecycleOwner, LQ5> LIZ = new HashMap<>();

    public static InterfaceC55235Lm3 LIZ(LifecycleOwner lifecycleOwner, String str) {
        o.LJIIIZ(lifecycleOwner, "lifecycleOwner");
        LQ5 lq5 = LIZ.get(lifecycleOwner);
        InterfaceC55235Lm3 interfaceC55235Lm3 = null;
        if (lq5 == null || !o.LJ(str, lq5.LJLIL)) {
            return null;
        }
        try {
            try {
                interfaceC55235Lm3 = lq5.get(500L, TimeUnit.MILLISECONDS);
            } catch (Throwable th) {
                C3C5.m7constructorimpl(C141335gf.LIZ(th));
            }
        } catch (Throwable unused) {
            C3C5.m7constructorimpl(Boolean.valueOf(lq5.cancel(true)));
        }
        LIZ.remove(lifecycleOwner);
        return interfaceC55235Lm3;
    }

    public static void LIZIZ(final LifecycleOwner lifecycleOwner, String str) {
        o.LJIIIZ(lifecycleOwner, "lifecycleOwner");
        Executor executor = C55249LmH.LIZ;
        if (executor == null) {
            return;
        }
        LQ5 lq5 = new LQ5(lifecycleOwner, str);
        executor.execute(lq5);
        LIZ.put(lifecycleOwner, lq5);
        lifecycleOwner.getLifecycle().addObserver(new LifecycleEventObserver() { // from class: com.bytedance.provider.preload.PreLoader$preVScope$1
            @Override // androidx.lifecycle.LifecycleEventObserver
            public final void onStateChanged(LifecycleOwner source, Lifecycle.Event event) {
                o.LJIIIZ(source, "source");
                o.LJIIIZ(event, "event");
                if (event == Lifecycle.Event.ON_DESTROY) {
                    PreLoader.LIZ.remove(LifecycleOwner.this);
                }
            }
        });
    }
}
