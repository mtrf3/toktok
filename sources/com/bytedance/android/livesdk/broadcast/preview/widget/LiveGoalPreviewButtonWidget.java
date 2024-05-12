package com.bytedance.android.livesdk.broadcast.preview.widget;

import X.B83;
import X.BCD;
import X.BCN;
import X.BCX;
import X.BHC;
import X.BII;
import X.BZI;
import X.C06510Nj;
import X.C199097rd;
import X.C221108m2;
import X.C28472BFk;
import X.C28509BGv;
import X.C28787BRn;
import X.C29306Beo;
import X.C29374Bfu;
import X.C62822Ol8;
import X.C72818Shy;
import X.CN1;
import X.EnumC12540eQ;
import X.InterfaceC72822Si2;
import X.InterfaceC78280Uns;
import Y.AObserverS73S0100000_5;
import android.net.Uri;
import android.view.View;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.LiveModeChannel;
import com.bytedance.android.live.actionhandler.IActionHandlerService;
import com.bytedance.android.live.gift.IGiftService;
import com.bytedance.android.live.usermanage.IUserManageService;
import com.bytedance.android.livesdk.broadcast.preview.base.PreviewToolBaseWidget;
import com.bytedance.android.livesdk.broadcast.preview.widget.livegoal.LiveGoalPreviewViewModel;
import com.bytedance.android.livesdk.livesetting.broadcast.LivePreviewComponentsSimplifyTypeSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveSimplifiedGoLivePageSetting;
import com.bytedance.android.livesdk.livesetting.gift.LiveStreamGoalPresetWebLinkSetting;
import com.bytedance.android.livesdk.livesetting.performance.LiveGiftGoalAnchorV2Setting;
import com.bytedance.android.livesdk.livesetting.performance.UnusedLogOfflineSetting;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.UriProtector;
import com.google.android.play.core.appupdate.u;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS155S0100000_5;
import kotlin.jvm.internal.AqS171S0100000_5;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class LiveGoalPreviewButtonWidget extends PreviewToolBaseWidget implements InterfaceC72822Si2 {
    public boolean LJLJJL;
    public final int LJLJI = R.string.lr6;
    public final int LJLJJI = R.drawable.cz2;
    public String LJLJJLL = "";
    public final C62822Ol8 LJLJL = C221108m2.LIZIZ(new AqS155S0100000_5(this, 131));

    @Override // com.bytedance.android.livesdk.broadcast.preview.base.PreviewToolBaseWidget, com.bytedance.android.live.broadcast.preview.PreviewWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.android.livesdk.broadcast.preview.base.PreviewToolBaseWidget, com.bytedance.android.live.broadcast.preview.PreviewWidget
    public final void LJZL() {
        String str;
        long j;
        DataChannel dataChannel = this.dataChannel;
        String str2 = "";
        if (dataChannel == null || (str = (String) dataChannel.kv0(C28472BFk.class)) == null) {
            str = "";
        }
        this.LJLJJLL = str;
        super.LJZL();
        ((IGiftService) CN1.LIZ(IGiftService.class)).syncGiftList(1);
        String LIZJ = ((C29374Bfu) B83.LIZ().LIZIZ()).LIZJ(((C29374Bfu) B83.LIZ().LIZIZ()).getCurrentUserId());
        if (LIZJ != null) {
            str2 = LIZJ;
        }
        if (LiveGiftGoalAnchorV2Setting.INSTANCE.getValue()) {
            C72818Shy.LIZLLL("live_goal_update_event", this);
            ((LiveGoalPreviewViewModel) this.LJLJL.getValue()).LJLILLLLZI.observe(this, new AObserverS73S0100000_5(this, 16));
            LiveGoalPreviewViewModel liveGoalPreviewViewModel = (LiveGoalPreviewViewModel) this.LJLJL.getValue();
            Long l = (Long) this.dataChannel.kv0(BCN.class);
            if (l != null) {
                j = l.longValue();
            } else {
                j = 0;
            }
            liveGoalPreviewViewModel.gv0(j, str2);
            return;
        }
        LLIIIJ(false);
    }

    @Override // com.bytedance.android.live.broadcast.preview.PreviewWidget
    public final void onShow() {
        if (UnusedLogOfflineSetting.INSTANCE.isEnable("livesdk_golive_add_stream_goal_show")) {
            BZI LIZ = C28787BRn.LIZ("livesdk_golive_add_stream_goal_show");
            LIZ.LJIIZILJ();
            LLIIIILZ(LIZ);
            LIZ.LJJIIJZLJL();
        }
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            dataChannel.ov0(this, LiveModeChannel.class, new AqS171S0100000_5(this, 166));
        }
    }

    @Override // com.bytedance.android.live.broadcast.preview.PreviewWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void show() {
        if (BCD.LIZJ(this.dataChannel, BHC.LJLIL, null) == EnumC12540eQ.ON) {
            super.show();
        }
    }

    @Override // com.bytedance.android.live.broadcast.preview.PreviewWidget
    public final void LJZ() {
        super.LJZ();
        if (BCD.LIZJ(this.dataChannel, BHC.LJLIL, null) == EnumC12540eQ.ON) {
            if (!C29306Beo.LJJIIJ(getView())) {
                show();
            }
        } else {
            if (!C29306Beo.LJJIIJ(getView())) {
                return;
            }
            hide();
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void onDestroy() {
        super.onDestroy();
        C72818Shy.LJII("live_goal_update_event", this);
    }

    @Override // com.bytedance.android.livesdk.broadcast.preview.base.PreviewToolBaseWidget
    public final int LLFFF() {
        return this.LJLJJI;
    }

    @Override // com.bytedance.android.livesdk.broadcast.preview.base.PreviewToolBaseWidget
    public final int LLFII() {
        return this.LJLJI;
    }

    public final void LLIIIILZ(BZI bzi) {
        String str;
        LiveMode liveMode;
        C06510Nj.LIZ((C29374Bfu) B83.LIZ().LIZIZ(), bzi, "anchor_id");
        bzi.LJIJJ(this.LJLJJLL, "enter_from");
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null && (liveMode = (LiveMode) dataChannel.kv0(BCX.class)) != null) {
            str = liveMode.logStreamingType;
        } else {
            str = null;
        }
        bzi.LJIJ(str);
    }

    public final void LLIIIJ(boolean z) {
        this.LJLJJL = z;
        if (z) {
            BZI LIZ = C28787BRn.LIZ("livesdk_golive_edit_live_goal_show");
            LLIIIILZ(LIZ);
            LIZ.LJJIIJZLJL();
        } else {
            BZI LIZ2 = C28787BRn.LIZ("livesdk_golive_add_live_goal_show");
            LLIIIILZ(LIZ2);
            LIZ2.LJJIIJZLJL();
        }
    }

    @Override // com.bytedance.android.livesdk.broadcast.preview.base.PreviewToolBaseWidget
    public final void onClick(View view) {
        String str;
        String str2;
        Boolean bool;
        LiveMode liveMode;
        LiveMode liveMode2;
        LiveMode liveMode3;
        o.LJIIIZ(view, "view");
        boolean z = this.LJLJJL;
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null && (liveMode3 = (LiveMode) dataChannel.kv0(BCX.class)) != null && C28509BGv.LJI(liveMode3) && LivePreviewComponentsSimplifyTypeSetting.INSTANCE.showBottomLiveGoalBtn()) {
            str = "bottom";
        } else {
            str = "outside";
        }
        if (z) {
            str2 = "livesdk_golive_edit_live_goal_click";
        } else {
            str2 = "livesdk_golive_add_stream_goal_click";
        }
        BZI LIZ = C28787BRn.LIZ(str2);
        LLIIIILZ(LIZ);
        LIZ.LJIIZILJ();
        LIZ.LJIJJ(str, "position");
        LIZ.LJJIIJZLJL();
        ((IUserManageService) CN1.LIZ(IUserManageService.class)).Ye0(0L, this.dataChannel, 8);
        String value = LiveStreamGoalPresetWebLinkSetting.INSTANCE.getValue();
        try {
            Uri.Builder buildUpon = UriProtector.parse(value).buildUpon();
            DataChannel dataChannel2 = this.dataChannel;
            String str3 = null;
            if (dataChannel2 != null && (liveMode2 = (LiveMode) dataChannel2.kv0(LiveModeChannel.class)) != null) {
                bool = Boolean.valueOf(C28509BGv.LJI(liveMode2));
            } else {
                bool = null;
            }
            if (!C29306Beo.LJJIFFI(bool) || !LiveSimplifiedGoLivePageSetting.INSTANCE.enableSimplifiedGoLivePageV1orV2()) {
                buildUpon.appendQueryParameter("entrance", "golive");
            } else {
                buildUpon.appendQueryParameter("entrance", "golive_settings");
            }
            DataChannel dataChannel3 = this.dataChannel;
            if (dataChannel3 != null && (liveMode = (LiveMode) dataChannel3.kv0(BCX.class)) != null) {
                str3 = liveMode.logStreamingType;
            }
            buildUpon.appendQueryParameter("live_type", str3);
            String uri = buildUpon.build().toString();
            o.LJIIIIZZ(uri, "builder.build().toString()");
            value = uri;
        } catch (Exception unused) {
        }
        ((IActionHandlerService) CN1.LIZ(IActionHandlerService.class)).handle(this.context, value);
    }

    @Override // X.InterfaceC72822Si2
    public final void onReceiveJsEvent(C199097rd c199097rd) {
        Integer num;
        if (o.LJ("live_goal_update_event", c199097rd.LJLIL)) {
            InterfaceC78280Uns interfaceC78280Uns = c199097rd.LJLILLLLZI;
            if (interfaceC78280Uns != null) {
                num = Integer.valueOf(u.LJJIJIIJI(interfaceC78280Uns, "goalStatus", 0));
            } else {
                num = null;
            }
            int code = BII.ONGOING.getCode();
            if (num == null || num.intValue() != code) {
                int code2 = BII.DELETED.getCode();
                if (num == null || num.intValue() != code2) {
                    return;
                }
                LLIIIJ(false);
                return;
            }
            LLIIIJ(true);
        }
    }
}
