package com.bytedance.android.livesdk.widget;

import X.BZI;
import X.C08660Vq;
import X.C08680Vs;
import X.C16880lQ;
import X.C28787BRn;
import X.C73943T0h;
import X.UPJ;
import Y.ACListenerS25S0100000_5;
import android.view.View;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.livesdk.livesetting.other.LiveLogMonitorSampleSetting;
import com.bytedance.ies.sdk.widgets.LiveWidget;
import com.zhiliaoapp.musically.R;

/* loaded from: classes6.dex */
public final class LCCCloseWidget extends LiveWidget {
    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.dp1;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public final void LJLZ() {
        UPJ.LJFF(6, C73943T0h.LIZ());
        if (LiveLogMonitorSampleSetting.INSTANCE.isReport("livesdk_exit_liveroom_click", 0.1d)) {
            BZI LIZ = C28787BRn.LIZ("livesdk_exit_liveroom_click");
            LIZ.LJIILLIIL(this.dataChannel);
            LIZ.LJIJJ(Integer.valueOf(C08680Vs.LJIILJJIL.LJFF()), C08680Vs.LJIIZILJ);
            LIZ.LJIJJ(C08660Vq.LIZ(), C08680Vs.LJIJ);
            LIZ.LJJIIJZLJL();
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void onCreate() {
        super.onCreate();
        View view = getView();
        if (view != null) {
            C16880lQ.LJIIJ(new ACListenerS25S0100000_5(this, 253), view);
        }
    }
}
