package com.bytedance.android.livesdk.chatroom.widget;

import X.BCN;
import X.BNM;
import X.BZI;
import X.C16880lQ;
import X.C28787BRn;
import X.C73943T0h;
import X.C74740TUy;
import X.CN1;
import X.InterfaceC29856Bng;
import Y.AfS36S0101000_5;
import android.view.View;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.definition.IDefinitionService;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.live.gift.ResetSilentTimerEvent;
import com.bytedance.android.livesdk.dataChannel.AudienceShowOrientationBeginTime;
import com.bytedance.android.livesdk.livesetting.performance.EnableRecycleSingleWidgetSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.LandscapeWatchLiveEntranceOpt;
import com.bytedance.android.livesdk.watch.OrientationChangeEvent;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.bytedance.ies.sdk.widgets.WidgetExtendsKt;
import com.zhiliaoapp.musically.R;
import defpackage.g0;

/* loaded from: classes6.dex */
public class OrientationChangeWidget extends LiveRecyclableWidget implements View.OnClickListener {
    public EnterRoomConfig LJLIL;

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.dns;
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
        int i;
        IDefinitionService iDefinitionService;
        int i2 = 0;
        if (getContext() != null && g0.LJIILJJIL(getContext()) != null) {
            i = g0.LJIILJJIL(getContext()).getRequestedOrientation();
        } else {
            i = 0;
        }
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            dataChannel.pv0(OrientationChangeEvent.class);
        }
        DataChannel dataChannel2 = this.dataChannel;
        if (dataChannel2 != null) {
            dataChannel2.pv0(ResetSilentTimerEvent.class);
        }
        BZI LIZ = C28787BRn.LIZ("livesdk_screen_rotate");
        LIZ.LJIILLIIL(this.dataChannel);
        LIZ.LJIJJ("landscape_to_portrait", "type");
        LIZ.LJIJJ("landscape", "room_orientation");
        if (C74740TUy.LIZLLL().LJ() || C74740TUy.LIZLLL().LJFF()) {
            i2 = 1;
        }
        LIZ.LJIJJ(Integer.valueOf(i2), "is_multi_guest");
        LIZ.LJIIIZ("live");
        LIZ.LJIIL("click");
        LIZ.LJIIJJI("live_landscape");
        LIZ.LJJIIJZLJL();
        DataChannel dataChannel3 = this.dataChannel;
        if (dataChannel3 != null) {
            Object kv0 = dataChannel3.kv0(BCN.class);
            Long l = (Long) this.dataChannel.kv0(AudienceShowOrientationBeginTime.class);
            if (kv0 != null && l != null && (iDefinitionService = (IDefinitionService) CN1.LIZ(IDefinitionService.class)) != null) {
                iDefinitionService.Hu(1, l.longValue(), String.valueOf(kv0), i, "click");
                this.dataChannel.rv0(AudienceShowOrientationBeginTime.class, Long.valueOf(System.currentTimeMillis()));
            }
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onLoad(Object[] objArr) {
        int i;
        LiveIconView liveIconView;
        int group = LandscapeWatchLiveEntranceOpt.INSTANCE.getGroup();
        if (group != 1) {
            if (group == 3) {
                i = R.drawable.d5i;
            }
            C16880lQ.LJIIJ(this, getView());
            ((InterfaceC29856Bng) C73943T0h.LIZ().LJ(BNM.class).LIZJ(WidgetExtendsKt.autoDispose(this))).LIZIZ(new AfS36S0101000_5(1, this, 22));
        }
        i = R.drawable.d2y;
        if (getView() != null && (liveIconView = (LiveIconView) findViewById(R.id.egd)) != null) {
            liveIconView.setIcon(i);
        }
        C16880lQ.LJIIJ(this, getView());
        ((InterfaceC29856Bng) C73943T0h.LIZ().LJ(BNM.class).LIZJ(WidgetExtendsKt.autoDispose(this))).LIZIZ(new AfS36S0101000_5(1, this, 22));
    }
}
