package com.ss.android.ugc.aweme.ecommerce.mall.common.customdot.toptab;

import X.C78866UxK;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class TopTabCustomDotHandler$onAttachToAssem$1 implements LifecycleEventObserver {
    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner source, Lifecycle.Event event) {
        o.LJIIIZ(source, "source");
        o.LJIIIZ(event, "event");
        if (event != Lifecycle.Event.ON_CREATE) {
            if (event != Lifecycle.Event.ON_DESTROY) {
                return;
            }
            C78866UxK.LJJLIIIJJIZ(null);
            throw null;
        }
        C78866UxK.LJJLIIIJJIZ(null);
        throw null;
    }
}
