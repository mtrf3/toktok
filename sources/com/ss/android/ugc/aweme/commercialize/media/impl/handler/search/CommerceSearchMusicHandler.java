package com.ss.android.ugc.aweme.commercialize.media.impl.handler.search;

import X.H92;
import X.H99;
import X.HKA;
import X.ORS;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import java.util.ArrayList;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class CommerceSearchMusicHandler implements HKA {
    @Override // X.HKA
    public final void LU() {
        H92.LJLIL.getClass();
        ((ArrayList) H92.LJLLILLLL).add(new H99());
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner source, Lifecycle.Event event) {
        o.LJIIIZ(source, "source");
        o.LJIIIZ(event, "event");
        if (event == Lifecycle.Event.ON_DESTROY) {
            H92.LJLIL.getClass();
            ORS.LJJZ(H92.LJLLILLLL);
        }
    }
}
