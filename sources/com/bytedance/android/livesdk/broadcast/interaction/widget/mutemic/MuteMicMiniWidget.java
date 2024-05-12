package com.bytedance.android.livesdk.broadcast.interaction.widget.mutemic;

import X.BZI;
import X.C16880lQ;
import X.C259710f;
import X.C259910h;
import X.C28787BRn;
import X.C29306Beo;
import X.C29828BnE;
import X.C29829BnF;
import X.C31981Cgr;
import X.C31985Cgv;
import X.C41071jL;
import X.CN1;
import X.EnumC06880Ou;
import X.InterfaceC30442Bx8;
import X.WM7;
import Y.ACListenerS25S0100000_5;
import android.content.Context;
import android.widget.TextView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.broadcast.api.IBroadcastService;
import com.bytedance.android.live.broadcast.shortcutpanel.BaseSubShortCutPanelWidget;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.livesdk.dataChannel.DisableMuteMicEvent;
import com.bytedance.android.livesdk.dataChannel.MuteMicChannel;
import com.bytedance.android.livesdk.dataChannel.MuteMicMiniWidgetClosedEvent;
import com.bytedance.android.livesdk.dataChannel.MuteMicSwitchClosedEvent;
import com.bytedance.android.livesdk.dataChannel.ResumeMiniWidget;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS171S0100000_5;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class MuteMicMiniWidget extends BaseSubShortCutPanelWidget {
    public C41071jL LJLJJI;

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.dpj;
    }

    @Override // com.bytedance.android.live.broadcast.shortcutpanel.BaseSubShortCutPanelWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void hide() {
        InterfaceC30442Bx8.Z2.LIZ(Boolean.FALSE);
        super.hide();
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            dataChannel.pv0(MuteMicMiniWidgetClosedEvent.class);
        }
        DataChannel dataChannel2 = this.dataChannel;
        String closeMethod = this.LJLJI;
        o.LJIIIZ(closeMethod, "closeMethod");
        BZI LIZ = C28787BRn.LIZ("livesdk_live_take_mute_shortcut_panel_close");
        LIZ.LJIILLIIL(dataChannel2);
        LIZ.LJIJJ(closeMethod, "close_method");
        LIZ.LJIJJ(Integer.valueOf(C29306Beo.LJJIFFI(Boolean.valueOf(C29829BnF.LIZ)) ? 1 : 0), "is_open");
        LIZ.LJIJJ(Long.valueOf(System.currentTimeMillis() - C29828BnE.LIZIZ), "use_time");
        LIZ.LJIJJ(((IBroadcastService) CN1.LIZ(IBroadcastService.class)).getBroadcastScene(), WM7.SCENE_SERVICE);
        LIZ.LJJIIJZLJL();
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void onCreate() {
        super.onCreate();
        LiveIconView liveIconView = (LiveIconView) findViewById(R.id.ld4);
        if (liveIconView != null) {
            liveIconView.setIconAttr(R.attr.aul);
            liveIconView.setIconTint(C259910h.LIZIZ(R.attr.ar8, liveIconView.getContext()));
        }
        ((TextView) findViewById(R.id.ldn)).setTextColor(C259910h.LIZIZ(R.attr.bmu, this.context));
        C41071jL c41071jL = (C41071jL) findViewById(R.id.gus);
        if (c41071jL != null) {
            C16880lQ.LJJIIJZLJL(c41071jL, new ACListenerS25S0100000_5(this, 91));
        } else {
            c41071jL = null;
        }
        this.LJLJJI = c41071jL;
        LiveIconView liveIconView2 = (LiveIconView) findViewById(R.id.bfj);
        if (liveIconView2 != null) {
            liveIconView2.setIconTint(C259910h.LIZIZ(R.attr.ar8, liveIconView2.getContext()));
            C29306Beo.LJJJLL(liveIconView2, 500L, new AqS171S0100000_5(this, 151));
        }
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            dataChannel.lv0(this, MuteMicChannel.class, new AqS171S0100000_5(this, 152));
            dataChannel.lv0(this, MuteMicSwitchClosedEvent.class, new AqS171S0100000_5(this, 153));
            dataChannel.lv0(this, ResumeMiniWidget.class, new AqS171S0100000_5(this, 154));
            dataChannel.lv0(this, DisableMuteMicEvent.class, new AqS171S0100000_5(this, 155));
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void show() {
        super.show();
        InterfaceC30442Bx8.Z2.LIZ(Boolean.TRUE);
        DataChannel dataChannel = this.dataChannel;
        C29828BnE.LIZIZ = System.currentTimeMillis();
        BZI LIZ = C28787BRn.LIZ("livesdk_live_take_mute_shortcut_panel_show");
        LIZ.LJIILLIIL(dataChannel);
        LIZ.LJIJJ(Integer.valueOf(C29306Beo.LJJIFFI(InterfaceC30442Bx8.B1.LIZJ()) ? 1 : 0), "is_sound_shortcut_panel_on");
        LIZ.LJIJJ(((IBroadcastService) CN1.LIZ(IBroadcastService.class)).getBroadcastScene(), WM7.SCENE_SERVICE);
        LIZ.LJJIIJZLJL();
    }

    @Override // com.bytedance.android.live.broadcast.shortcutpanel.BaseSubShortCutPanelWidget
    public final EnumC06880Ou LJLZ() {
        return EnumC06880Ou.MUTE_MIC;
    }

    @Override // com.bytedance.android.widget.Widget
    public final int getThemeOverlay(Context context) {
        o.LJIIIZ(context, "context");
        return C259710f.LIZ.LIZJ();
    }

    public MuteMicMiniWidget(C31981Cgr c31981Cgr, C31985Cgv c31985Cgv) {
        super(c31981Cgr, c31985Cgv);
    }
}
