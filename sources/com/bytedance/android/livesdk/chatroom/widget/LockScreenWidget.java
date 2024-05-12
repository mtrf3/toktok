package com.bytedance.android.livesdk.chatroom.widget;

import X.BNM;
import X.C16880lQ;
import X.C73943T0h;
import X.InterfaceC29856Bng;
import Y.AfS36S0101000_5;
import android.view.View;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.live.gift.ResetSilentTimerEvent;
import com.bytedance.android.livesdk.LockScreenEvent;
import com.bytedance.android.livesdk.livesetting.performance.EnableRecycleSingleWidgetSetting;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.bytedance.ies.sdk.widgets.WidgetExtendsKt;
import com.zhiliaoapp.musically.R;

/* loaded from: classes6.dex */
public class LockScreenWidget extends LiveRecyclableWidget implements View.OnClickListener {
    public LiveIconView LJLIL;
    public boolean LJLILLLLZI;

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.dpc;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onInit(Object[] objArr) {
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onUnload() {
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget
    public final boolean needRecycle() {
        return EnableRecycleSingleWidgetSetting.INSTANCE.getValue();
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            dataChannel.pv0(LockScreenEvent.class);
        }
        DataChannel dataChannel2 = this.dataChannel;
        if (dataChannel2 != null) {
            dataChannel2.pv0(ResetSilentTimerEvent.class);
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onLoad(Object[] objArr) {
        C16880lQ.LJIIJ(this, getView());
        this.LJLIL = (LiveIconView) getView().findViewById(R.id.awo);
        ((InterfaceC29856Bng) C73943T0h.LIZ().LJ(BNM.class).LIZJ(WidgetExtendsKt.autoDispose(this))).LIZIZ(new AfS36S0101000_5(2, this, 47));
        this.LJLIL.setIconAttr(R.attr.avv);
    }
}
