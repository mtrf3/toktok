package com.ss.android.ugc.aweme.ecommerce.base.osp.payment.base;

import X.AbstractC71743SDr;
import X.C16880lQ;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import java.io.Closeable;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class AutoCloseObserver implements LifecycleEventObserver {
    public final Lifecycle LJLIL;
    public final Closeable LJLILLLLZI;

    public AutoCloseObserver(Lifecycle lifecycle, AbstractC71743SDr abstractC71743SDr) {
        this.LJLIL = lifecycle;
        this.LJLILLLLZI = abstractC71743SDr;
        if (lifecycle.getCurrentState() == Lifecycle.State.DESTROYED) {
            abstractC71743SDr.close();
        } else {
            lifecycle.addObserver(this);
        }
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner source, Lifecycle.Event event) {
        o.LJIIIZ(source, "source");
        o.LJIIIZ(event, "event");
        if (C16880lQ.LLJJIJIL(this.LJLIL.getCurrentState(), Lifecycle.State.DESTROYED) <= 0) {
            this.LJLIL.removeObserver(this);
            this.LJLILLLLZI.close();
        }
    }
}
