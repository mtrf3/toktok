package com.ss.android.ugc.aweme.ecommerce.base.pdp.module.header.opt;

import X.C70660RoG;
import X.InterfaceC70422pa;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class HeaderDisplayImageOpt {
    public static String LIZJ = "";
    public final InterfaceC70422pa LIZ;
    public final String LIZIZ;

    public HeaderDisplayImageOpt(InterfaceC70422pa coroutineScope, String str, Lifecycle lifecycle) {
        o.LJIIIZ(coroutineScope, "coroutineScope");
        o.LJIIIZ(lifecycle, "lifecycle");
        this.LIZ = coroutineScope;
        this.LIZIZ = str;
        lifecycle.addObserver(new LifecycleEventObserver() { // from class: com.ss.android.ugc.aweme.ecommerce.base.pdp.module.header.opt.HeaderDisplayImageOpt.1
            @Override // androidx.lifecycle.LifecycleEventObserver
            public final void onStateChanged(LifecycleOwner source, Lifecycle.Event event) {
                o.LJIIIZ(source, "source");
                o.LJIIIZ(event, "event");
                if (event == Lifecycle.Event.ON_DESTROY) {
                    C70660RoG.LIZLLL(HeaderDisplayImageOpt.this.LIZIZ);
                }
            }
        });
    }
}
