package com.ss.android.ugc.aweme.main.assems.tabs;

import X.C62814Ol0;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.tiktok.homepage.mainfragment.TopTabProtocol;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class TabAbilityAssem$registerDynamicFeatureProtocol$lambda$0$$inlined$registerProtocol$default$1 implements LifecycleEventObserver {
    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner source, Lifecycle.Event event) {
        o.LJIIIZ(source, "source");
        o.LJIIIZ(event, "event");
        if (event != Lifecycle.Event.ON_DESTROY) {
            return;
        }
        C62814Ol0.LJJIJL(null, TopTabProtocol.class, null);
        throw null;
    }
}
