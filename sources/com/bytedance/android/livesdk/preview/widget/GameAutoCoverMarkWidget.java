package com.bytedance.android.livesdk.preview.widget;

import X.C221108m2;
import X.C62822Ol8;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.livesdk.comp.api.game.ForceGameAutoCoverChannel;
import com.bytedance.android.livesdk.comp.api.game.GameAutoCoverChannel;
import com.bytedance.android.livesdk.dataChannel.BroadcastCoverData;
import com.bytedance.android.livesdk.dataChannel.RoomCreateInfoChannel;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.widgets.LiveWidget;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS155S0100000_5;
import kotlin.jvm.internal.AqS171S0100000_5;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class GameAutoCoverMarkWidget extends LiveWidget {
    public final C62822Ol8 LJLIL = C221108m2.LIZIZ(new AqS155S0100000_5(this, 256));

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.dob;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void onCreate() {
        View findViewById;
        super.onCreate();
        View view = getView();
        if (view != null && (findViewById = view.findViewById(R.id.l_y)) != null) {
            findViewById.setAlpha(0.1f);
        }
        View view2 = getView();
        if (view2 != null) {
            view2.setAlpha(0.0f);
        }
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            dataChannel.ov0(this, RoomCreateInfoChannel.class, new AqS171S0100000_5(this, 620));
        }
        DataChannel dataChannel2 = this.dataChannel;
        if (dataChannel2 != null) {
            dataChannel2.ov0(this, BroadcastCoverData.class, new AqS171S0100000_5(this, 621));
        }
        DataChannel dataChannel3 = this.dataChannel;
        if (dataChannel3 != null) {
            dataChannel3.ov0(this, GameAutoCoverChannel.class, new AqS171S0100000_5(this, 622));
        }
        DataChannel dataChannel4 = this.dataChannel;
        if (dataChannel4 != null) {
            dataChannel4.ov0(this, ForceGameAutoCoverChannel.class, new AqS171S0100000_5(this, 623));
        }
    }

    public final void LJLZ(boolean z) {
        ViewPropertyAnimator animate;
        ViewPropertyAnimator duration;
        ViewPropertyAnimator animate2;
        View view = getView();
        if (view != null && (animate2 = view.animate()) != null) {
            animate2.cancel();
        }
        float f = 0.0f;
        Float f2 = null;
        if (!z) {
            View view2 = getView();
            if (view2 != null) {
                f2 = Float.valueOf(view2.getAlpha());
            }
            if (o.LIZJ(f2, 0.0f)) {
                return;
            }
        } else if (z) {
            View view3 = getView();
            if (view3 != null) {
                f2 = Float.valueOf(view3.getAlpha());
            }
            if (o.LIZJ(f2, 1.0f)) {
                return;
            }
        }
        View view4 = getView();
        if (view4 != null && (animate = view4.animate()) != null) {
            if (z) {
                f = 1.0f;
            }
            ViewPropertyAnimator alpha = animate.alpha(f);
            if (alpha != null && (duration = alpha.setDuration(300L)) != null) {
                duration.start();
            }
        }
    }
}
