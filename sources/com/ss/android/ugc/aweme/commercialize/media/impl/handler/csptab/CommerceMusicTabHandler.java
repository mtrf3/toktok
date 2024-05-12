package com.ss.android.ugc.aweme.commercialize.media.impl.handler.csptab;

import X.H92;
import X.H95;
import X.H97;
import X.HDG;
import X.N3A;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class CommerceMusicTabHandler implements HDG {
    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner source, Lifecycle.Event event) {
        o.LJIIIZ(source, "source");
        o.LJIIIZ(event, "event");
    }

    @Override // X.HDG
    public final void kd0(N3A chooseMusicTab) {
        boolean z;
        o.LJIIIZ(chooseMusicTab, "chooseMusicTab");
        H92.LJLIL.getClass();
        H97 LIZJ = H92.LIZJ();
        if (LIZJ != null && (LIZJ instanceof H95)) {
            H95 h95 = (H95) LIZJ;
            if (chooseMusicTab == N3A.FAVORITES) {
                z = true;
            } else {
                z = false;
            }
            h95.LIZ = z;
        }
    }
}
