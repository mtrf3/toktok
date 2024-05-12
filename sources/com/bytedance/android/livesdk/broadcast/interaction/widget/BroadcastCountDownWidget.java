package com.bytedance.android.livesdk.broadcast.interaction.widget;

import X.AbstractC73672Svk;
import X.C1EW;
import X.C29306Beo;
import X.C30284Bua;
import X.C73411SrX;
import X.CountDownTimerC30285Bub;
import X.InterfaceC30283BuZ;
import Y.AfS57S0100000_5;
import android.view.View;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.livesdk.livesetting.performance.LiveBroadcastPoorDeviceDowngradeSetting;
import com.bytedance.ies.sdk.widgets.LiveWidget;
import com.zhiliaoapp.musically.R;
import java.util.concurrent.TimeUnit;

/* loaded from: classes6.dex */
public final class BroadcastCountDownWidget extends LiveWidget {
    public InterfaceC30283BuZ LJLIL;
    public C73411SrX LJLILLLLZI;

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        if (LiveBroadcastPoorDeviceDowngradeSetting.INSTANCE.enable()) {
            return R.layout.cux;
        }
        return R.layout.cuw;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void onCreate() {
        C30284Bua c30284Bua;
        super.onCreate();
        if (LiveBroadcastPoorDeviceDowngradeSetting.INSTANCE.enable()) {
            C29306Beo.LJJLJLI(getView());
            this.LJLILLLLZI = (C73411SrX) C1EW.LIZ(AbstractC73672Svk.LJJIJIIJIL(0L, 4L, 0L, 1L, TimeUnit.SECONDS)).LJJJJZI(new AfS57S0100000_5(this, 294));
            return;
        }
        View view = getView();
        if (!(view instanceof C30284Bua) || (c30284Bua = (C30284Bua) view) == null) {
            return;
        }
        c30284Bua.setCountDownListener(this.LJLIL);
        c30284Bua.setVisibility(0);
        new CountDownTimerC30285Bub(c30284Bua, c30284Bua.LJLJJI).start();
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void onDestroy() {
        super.onDestroy();
        C73411SrX c73411SrX = this.LJLILLLLZI;
        if (c73411SrX != null) {
            c73411SrX.dispose();
        }
    }
}
