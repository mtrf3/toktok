package com.bytedance.android.livesdk.shorttouch.ui;

import X.C77111UOd;
import X.UOJ;
import X.UOS;
import X.UOW;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class LandscapeShortTouchPreviewWidget extends ShortTouchPreviewWidget {
    @Override // com.bytedance.android.livesdk.shorttouch.ui.ShortTouchPreviewWidget, com.bytedance.android.live.performance.widget.PerformProcessWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.android.livesdk.shorttouch.ui.ShortTouchPreviewWidget, X.InterfaceC77110UOc
    public final void LJJIJIL(UOW message) {
        o.LJIIIZ(message, "message");
        UOJ uoj = C77111UOd.LIZ;
        if (uoj.LIZIZ(UOS.ID, message.LJLILLLLZI) != null) {
            LJLZ(message);
        } else {
            uoj.LIZLLL();
        }
    }
}
