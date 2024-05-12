package com.bytedance.android.livesdk.hotword;

import X.UXG;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class ExitLiveObserver implements LifecycleEventObserver {
    public static final ExitLiveObserver LJLIL = new ExitLiveObserver();
    public static WeakReference<HotWordGiftViewModel> LJLILLLLZI;

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner source, Lifecycle.Event event) {
        WeakReference<HotWordGiftViewModel> weakReference;
        HotWordGiftViewModel hotWordGiftViewModel;
        o.LJIIIZ(source, "source");
        o.LJIIIZ(event, "event");
        if (event == Lifecycle.Event.ON_DESTROY && (weakReference = LJLILLLLZI) != null && (hotWordGiftViewModel = weakReference.get()) != null) {
            UXG uxg = hotWordGiftViewModel.LJLJJI;
            if (uxg != null) {
                uxg.LJIIIIZZ();
            } else {
                o.LJIJI("freqController");
                throw null;
            }
        }
    }
}
