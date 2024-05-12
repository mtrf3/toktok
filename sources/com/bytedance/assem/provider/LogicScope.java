package com.bytedance.assem.provider;

import X.C16880lQ;
import X.C1A7;
import X.C221108m2;
import X.C55247LmF;
import X.C55252LmK;
import X.C62822Ol8;
import X.InterfaceC55235Lm3;
import android.os.Looper;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import kotlin.jvm.internal.AqS159S0100000_9;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class LogicScope implements InterfaceC55235Lm3 {
    public final LifecycleOwner LJLIL;
    public final String LJLILLLLZI;
    public final C62822Ol8 LJLJI;

    @Override // X.InterfaceC55235Lm3
    public final C55252LmK getTree() {
        return (C55252LmK) this.LJLJI.getValue();
    }

    @Override // X.InterfaceC55235Lm3
    public final Object getHost() {
        return this.LJLIL;
    }

    @Override // X.InterfaceC55235Lm3
    public final String getKey() {
        return this.LJLILLLLZI;
    }

    public LogicScope(LifecycleOwner lifecycleOwner) {
        o.LJIIIZ(lifecycleOwner, "lifecycleOwner");
        this.LJLIL = lifecycleOwner;
        this.LJLILLLLZI = "assem_logic_scope";
        this.LJLJI = C221108m2.LIZIZ(new AqS159S0100000_9(this, 32));
        Looper LLJJJJ = C16880lQ.LLJJJJ();
        o.LJIIIIZZ(LLJJJJ, "getMainLooper()");
        C1A7.LIZLLL(LLJJJJ, false).post(new Runnable() { // from class: com.bytedance.assem.provider.LogicScope.1
            @Override // java.lang.Runnable
            public final void run() {
                boolean LIZ;
                try {
                    Lifecycle lifecycle = LogicScope.this.LJLIL.getLifecycle();
                    final LogicScope logicScope = LogicScope.this;
                    lifecycle.addObserver(new LifecycleEventObserver() { // from class: com.bytedance.assem.provider.LogicScope.1.1
                        @Override // androidx.lifecycle.LifecycleEventObserver
                        public final void onStateChanged(LifecycleOwner source, Lifecycle.Event event) {
                            o.LJIIIZ(source, "source");
                            o.LJIIIZ(event, "event");
                            if (event == Lifecycle.Event.ON_DESTROY) {
                                C55247LmF.LIZJ(LogicScope.this);
                            }
                        }
                    });
                } finally {
                    if (LIZ) {
                    }
                }
            }
        });
    }
}
