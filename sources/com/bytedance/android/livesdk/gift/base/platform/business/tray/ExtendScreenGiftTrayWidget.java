package com.bytedance.android.livesdk.gift.base.platform.business.tray;

import X.C78091Ukp;
import X.C78093Ukr;
import android.content.Context;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class ExtendScreenGiftTrayWidget extends LiveGiftRemoteTrayDisplayWidget {
    @Override // com.bytedance.android.livesdk.gift.base.platform.business.tray.LiveGiftRemoteTrayDisplayWidget, com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.d38;
    }

    @Override // com.bytedance.android.livesdk.gift.base.platform.business.tray.LiveGiftRemoteTrayDisplayWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.android.livesdk.gift.base.platform.business.tray.LiveGiftRemoteTrayDisplayWidget
    public final C78093Ukr LJLZ() {
        Context context = this.context;
        o.LJIIIIZZ(context, "context");
        return new C78091Ukp(context);
    }
}
