package com.ss.android.ugc.aweme.delegate;

import X.C62814Ol0;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.mob.event.IHomePageMobProvider;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class NearbyBottomTabProtocolDelegate$registerNearbyHomePageParamWhenViewPost$1$run$lambda$1$lambda$0$$inlined$registerProtocol$default$1 implements LifecycleEventObserver {
    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner source, Lifecycle.Event event) {
        o.LJIIIZ(source, "source");
        o.LJIIIZ(event, "event");
        if (event != Lifecycle.Event.ON_DESTROY) {
            return;
        }
        C62814Ol0.LJJIJL(null, IHomePageMobProvider.class, null);
        throw null;
    }
}
