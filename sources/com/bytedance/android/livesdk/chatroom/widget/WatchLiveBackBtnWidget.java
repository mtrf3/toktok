package com.bytedance.android.livesdk.chatroom.widget;

import X.BNM;
import X.C16880lQ;
import X.C73943T0h;
import X.InterfaceC29856Bng;
import Y.ACListenerS25S0100000_5;
import Y.AfS57S0100000_5;
import android.view.View;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.livesdk.livesetting.performance.EnableRecycleSingleWidgetSetting;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.bytedance.ies.sdk.widgets.WidgetExtendsKt;
import com.zhiliaoapp.musically.R;

/* loaded from: classes6.dex */
public final class WatchLiveBackBtnWidget extends LiveRecyclableWidget {
    public EnterRoomConfig LJLIL;

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.dnk;
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

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onLoad(Object[] objArr) {
        View findViewById;
        View view = getView();
        if (view != null && (findViewById = view.findViewById(R.id.aeo)) != null) {
            C16880lQ.LJIIJ(new ACListenerS25S0100000_5(this, 143), findViewById);
        }
        ((InterfaceC29856Bng) C73943T0h.LIZ().LJ(BNM.class).LIZJ(WidgetExtendsKt.autoDispose(this))).LIZIZ(new AfS57S0100000_5(this, 96));
    }
}
