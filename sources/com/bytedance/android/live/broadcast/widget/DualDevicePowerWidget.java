package com.bytedance.android.live.broadcast.widget;

import X.C15380j0;
import X.C15490jB;
import X.C16880lQ;
import X.C259710f;
import Y.IDCListenerS135S0100000;
import android.content.Context;
import android.view.View;
import android.widget.TextView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.zhiliaoapp.musically.R;

/* loaded from: classes.dex */
public final class DualDevicePowerWidget extends LiveRecyclableWidget {
    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.d5o;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onLoad(Object[] objArr) {
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onUnload() {
    }

    @Override // com.bytedance.android.widget.Widget
    public final int getThemeOverlay(Context context) {
        return C259710f.LIZ.LIZJ();
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onInit(Object[] objArr) {
        View view = getView();
        if (view != null) {
            TextView textView = (TextView) view.findViewById(R.id.i08);
            if (textView != null) {
                textView.setText(C15380j0.LJIILJJIL(R.string.mwc));
            }
            View findViewById = view.findViewById(R.id.i03);
            if (findViewById != null) {
                C15490jB.LJ(findViewById, "tiktok_live_game_demand_2", "ttlive_dual_device_power.png");
            }
        }
        View view2 = getView();
        if (view2 != null) {
            C16880lQ.LJIIJ(new IDCListenerS135S0100000(this, 45), view2);
        }
    }
}
