package com.ss.android.ugc.aweme.shortvideo.ui.task;

import X.C43985HOb;
import X.C45866HzK;
import X.C78934UyQ;
import X.EnumC45752HxU;
import X.InterfaceC45863HzH;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class PreloadMusicListTask implements GenericLifecycleObserver, InterfaceC45863HzH {
    @Override // X.InterfaceC45863HzH
    public final /* synthetic */ boolean LIZ() {
        return false;
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_DESTROY) {
            onDestroy();
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public final void onDestroy() {
        C78934UyQ.LJLIL.getMusicService().LJ();
    }

    @Override // X.InterfaceC45863HzH
    public final EnumC45752HxU LIZIZ() {
        int LIZ = C45866HzK.LIZ();
        if (LIZ != 1) {
            if (LIZ != 2) {
                EnumC45752HxU enumC45752HxU = EnumC45752HxU.P1;
                o.LJIIIIZZ(enumC45752HxU, "super.getTaskPriority()");
                return enumC45752HxU;
            }
            return EnumC45752HxU.P3;
        }
        return EnumC45752HxU.P1;
    }

    @Override // X.InterfaceC45863HzH
    public final void run() {
        Integer num;
        if (C43985HOb.LIZ()) {
            if (C78934UyQ.LJLIL.getMusicService().LIZ()) {
                num = 24;
            } else {
                num = null;
            }
            C78934UyQ.LJLIL.getMusicService().LJJII(num);
        }
    }

    public PreloadMusicListTask(Lifecycle lifecycle) {
        o.LJIIIZ(lifecycle, "lifecycle");
        lifecycle.addObserver(this);
    }
}
