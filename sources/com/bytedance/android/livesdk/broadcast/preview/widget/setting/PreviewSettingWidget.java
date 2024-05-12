package com.bytedance.android.livesdk.broadcast.preview.widget.setting;

import X.BZI;
import X.C09;
import X.C12840eu;
import X.C15380j0;
import X.C199097rd;
import X.C1YG;
import X.C1YH;
import X.C28509BGv;
import X.C28787BRn;
import X.C29006BZy;
import X.C29007BZz;
import X.C29008Ba0;
import X.C29306Beo;
import X.C29494Bhq;
import X.C30326BvG;
import X.C30770C5u;
import X.C32044Chs;
import X.C48459J0d;
import X.C5H3;
import X.C72818Shy;
import X.C78540Us4;
import X.C78996UzQ;
import X.InterfaceC30442Bx8;
import X.InterfaceC72822Si2;
import Y.ARunnableS41S0100000_5;
import android.view.View;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.LiveModeChannel;
import com.bytedance.android.livesdk.LiveDialogFragment;
import com.bytedance.android.livesdk.broadcast.PreviewBlockInfoChannel;
import com.bytedance.android.livesdk.broadcast.preview.base.PreviewToolBaseWidget;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveSimplifiedGoLivePageSetting;
import com.bytedance.android.livesdk.livesetting.other.LiveSheetMigrationAnchorGuideSettings;
import com.bytedance.android.livesdk.livesetting.performance.UnusedLogOfflineSetting;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.zhiliaoapp.musically.R;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class PreviewSettingWidget extends PreviewToolBaseWidget implements InterfaceC72822Si2 {
    public final C5H3 LJLJI = C78996UzQ.LJJIJIIJI(C29008Ba0.LJLIL);
    public long LJLJJI = -1;
    public final int LJLJJL = R.string.svw;
    public final int LJLJJLL = R.drawable.d08;

    @Override // com.bytedance.android.livesdk.broadcast.preview.base.PreviewToolBaseWidget, com.bytedance.android.live.broadcast.preview.PreviewWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public final void LLIIIILZ() {
        LiveMode liveMode;
        if (!UnusedLogOfflineSetting.INSTANCE.isEnable("livesdk_live_takepage_settings_show")) {
            return;
        }
        BZI LIZ = C28787BRn.LIZ("livesdk_live_takepage_settings_show");
        LIZ.LJIILLIIL(this.dataChannel);
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel == null || (liveMode = (LiveMode) dataChannel.kv0(LiveModeChannel.class)) == null) {
            liveMode = LiveMode.VIDEO;
        }
        LIZ.LJIJJ(C28509BGv.LIZ(liveMode), "live_type");
        LIZ.LJIJJ(Integer.valueOf(C29306Beo.LJJIFFI(Boolean.valueOf(LLFZ())) ? 1 : 0), "have_red_dot");
        LIZ.LJJIIJZLJL();
    }

    public final void LLIIIJ() {
        FragmentManager fragmentManager;
        if (LiveSheetMigrationAnchorGuideSettings.INSTANCE.getValue()) {
            if (C12840eu.LIZ.LIZ(this.LJLJJI)) {
                return;
            }
            this.LJLJJI = C32044Chs.LJIIIZ((FragmentManager) this.dataChannel.kv0(C29494Bhq.class), BasePreviewSettingMainFragmentSheet.class, "base_preview_setting_main", null, null);
        } else if (!((LiveDialogFragment) this.LJLJI.getValue()).isShowing() && (fragmentManager = (FragmentManager) this.dataChannel.kv0(C29494Bhq.class)) != null) {
            ((DialogFragment) this.LJLJI.getValue()).show(fragmentManager, "PreviewSettingWidget");
        }
    }

    public final void LLIIIL() {
        LiveMode liveMode;
        BZI LIZ = C28787BRn.LIZ("livesdk_live_takepage_settings_click");
        LIZ.LJIILLIIL(this.dataChannel);
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel == null || (liveMode = (LiveMode) dataChannel.kv0(LiveModeChannel.class)) == null) {
            liveMode = LiveMode.VIDEO;
        }
        LIZ.LJIJJ(C28509BGv.LIZ(liveMode), "live_type");
        LIZ.LJIJJ(Integer.valueOf(C29306Beo.LJJIFFI(Boolean.valueOf(LLFZ())) ? 1 : 0), "have_red_dot");
        LIZ.LJIJJ(Integer.valueOf(PreviewToolBaseWidget.LL(getView())), "index");
        LIZ.LJJIIJZLJL();
        C48459J0d<Boolean> c48459J0d = InterfaceC30442Bx8.LJZL;
        Boolean bool = Boolean.FALSE;
        c48459J0d.LIZ(bool);
        InterfaceC30442Bx8.LJJJZ.LIZ(bool);
        C48459J0d<Map<String, Boolean>> c48459J0d2 = InterfaceC30442Bx8.LLD;
        Map<String, Boolean> LIZJ = c48459J0d2.LIZJ();
        LIZJ.put(CardStruct.IStatusCode.DEFAULT, bool);
        c48459J0d2.LIZ(LIZJ);
        LLF();
        LLIIIJ();
    }

    @Override // com.bytedance.android.live.broadcast.preview.PreviewWidget
    public final void onHide() {
        LiveMode liveMode;
        DataChannel dataChannel = this.dataChannel;
        Boolean bool = null;
        if (dataChannel != null && (liveMode = (LiveMode) dataChannel.kv0(LiveModeChannel.class)) != null) {
            bool = Boolean.valueOf(C28509BGv.LJI(liveMode));
        }
        if (C29306Beo.LJJIFFI(bool)) {
            DataChannel dataChannel2 = this.dataChannel;
            if ((dataChannel2 == null || dataChannel2.kv0(PreviewBlockInfoChannel.class) == null) && C78540Us4.LJIIJJI() && C29306Beo.LJJIFFI(InterfaceC30442Bx8.LJLLLLLL.LIZJ())) {
                C30770C5u.LIZIZ(C09.GUIDE_PRACTICE_MODE);
            }
        }
    }

    @Override // com.bytedance.android.live.broadcast.preview.PreviewWidget
    public final void LJZ() {
        super.LJZ();
        if (C29306Beo.LJJIIJ(getView())) {
            LLIIIILZ();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x002f, code lost:
    
        if (r1.booleanValue() != false) goto L8;
     */
    @Override // com.bytedance.android.livesdk.broadcast.preview.base.PreviewToolBaseWidget, com.bytedance.android.live.broadcast.preview.PreviewWidget
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJZL() {
        /*
            r5 = this;
            super.LJZL()
            com.bytedance.android.livesdk.livesetting.other.LiveRedDotOfflineEnableSetting r0 = com.bytedance.android.livesdk.livesetting.other.LiveRedDotOfflineEnableSetting.INSTANCE
            boolean r0 = r0.getValue()
            if (r0 != 0) goto L34
            X.J0d<java.lang.Boolean> r0 = X.InterfaceC30442Bx8.LJZL
            java.lang.Object r1 = r0.LIZJ()
            java.lang.String r0 = "LIVE_SHOW_PREVIEW_SETTING_RED_DOT.value"
            kotlin.jvm.internal.o.LJIIIIZZ(r1, r0)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r0 = r1.booleanValue()
            if (r0 != 0) goto L31
            X.J0d<java.lang.Boolean> r0 = X.InterfaceC30442Bx8.LJJJZ
            java.lang.Object r1 = r0.LIZJ()
            java.lang.String r0 = "LIVE_SHOW_PREVIEW_MATURE_SETTING_RED_DOT.value"
            kotlin.jvm.internal.o.LJIIIIZZ(r1, r0)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r0 = r1.booleanValue()
            if (r0 == 0) goto L34
        L31:
            r5.LLII()
        L34:
            com.bytedance.ies.sdk.datachannel.DataChannel r1 = r5.dataChannel
            java.lang.Class<com.bytedance.android.livesdk.dataChannel.RoomCreateInfoChannel> r0 = com.bytedance.android.livesdk.dataChannel.RoomCreateInfoChannel.class
            java.lang.Object r0 = r1.kv0(r0)
            com.bytedance.android.live.broadcast.model.RoomCreateInfo r0 = (com.bytedance.android.live.broadcast.model.RoomCreateInfo) r0
            r4 = 1
            if (r0 == 0) goto L5e
            boolean r0 = r0.anchorStarCommentPermission
            if (r0 != r4) goto L5e
            X.J0d<java.util.Map<java.lang.String, java.lang.Boolean>> r0 = X.InterfaceC30442Bx8.LLD
            java.lang.Object r1 = r0.LIZJ()
            java.util.Map r1 = (java.util.Map) r1
            java.lang.String r0 = "0"
            java.lang.Object r1 = r1.get(r0)
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            boolean r0 = kotlin.jvm.internal.o.LJ(r1, r0)
            if (r0 != 0) goto L5e
            r5.LLII()
        L5e:
            java.lang.String r0 = "ttlive_show_setting_dialog"
            X.C72818Shy.LIZLLL(r0, r5)
            com.bytedance.ies.sdk.datachannel.DataChannelGlobal r3 = com.bytedance.ies.sdk.datachannel.DataChannelGlobal.LJLJJI
            java.lang.Class<com.bytedance.android.livesdk.dataChannel.PreviewLiveSettingEvent> r2 = com.bytedance.android.livesdk.dataChannel.PreviewLiveSettingEvent.class
            kotlin.jvm.internal.AqS171S0100000_5 r1 = new kotlin.jvm.internal.AqS171S0100000_5
            r0 = 231(0xe7, float:3.24E-43)
            r1.<init>(r5, r0)
            r3.nv0(r5, r5, r2, r1)
            com.bytedance.android.livesdk.livesetting.subscription.LiveOpenModeratorPinPerksCardsSetting r0 = com.bytedance.android.livesdk.livesetting.subscription.LiveOpenModeratorPinPerksCardsSetting.INSTANCE
            boolean r0 = r0.isEnable()
            if (r0 == 0) goto Lc8
            com.bytedance.ies.sdk.datachannel.DataChannel r1 = r5.dataChannel
            java.lang.Class<com.bytedance.android.livesdk.broadcast.PreviewSourceParamsDataChannel> r0 = com.bytedance.android.livesdk.broadcast.PreviewSourceParamsDataChannel.class
            java.lang.Object r1 = r1.kv0(r0)
            org.json.JSONObject r1 = (org.json.JSONObject) r1
            if (r1 == 0) goto Lc8
            java.lang.String r0 = "open_mod_setting"
            int r0 = r1.optInt(r0)
            if (r0 != r4) goto Lbc
            r5.LLIIIJ()
            java.lang.String r0 = "open_settings_page"
            int r0 = r1.optInt(r0)
            if (r0 != r4) goto Lbc
            com.bytedance.android.livesdk.livesetting.other.LiveSheetMigrationAnchorGuideSettings r0 = com.bytedance.android.livesdk.livesetting.other.LiveSheetMigrationAnchorGuideSettings.INSTANCE
            boolean r0 = r0.getValue()
            if (r0 == 0) goto Lc9
            com.bytedance.android.live.moderator.IModeratorService r0 = X.C7N.LJIILLIIL()
            com.bytedance.android.livesdk.moderator.ModeratorListFragmentSheet r0 = r0.rA()
            if (r0 == 0) goto Lbc
            com.bytedance.ies.sdk.datachannel.DataChannel r1 = r5.dataChannel
            java.lang.Class<X.Bhq> r0 = X.C29494Bhq.class
            java.lang.Object r3 = r1.kv0(r0)
            androidx.fragment.app.FragmentManager r3 = (androidx.fragment.app.FragmentManager) r3
            java.lang.Class<com.bytedance.android.livesdk.moderator.ModeratorListFragmentSheet> r2 = com.bytedance.android.livesdk.moderator.ModeratorListFragmentSheet.class
            r1 = 0
            java.lang.String r0 = "moderator_list"
            X.C32044Chs.LJIIIZ(r3, r2, r0, r1, r1)
        Lbc:
            com.bytedance.ies.sdk.datachannel.DataChannel r2 = r5.dataChannel
            java.lang.Class<com.bytedance.android.livesdk.broadcast.PreviewSourceParamsDataChannel> r1 = com.bytedance.android.livesdk.broadcast.PreviewSourceParamsDataChannel.class
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            r2.rv0(r1, r0)
        Lc8:
            return
        Lc9:
            com.bytedance.ies.sdk.datachannel.DataChannel r2 = r5.dataChannel
            if (r2 == 0) goto Lbc
            java.lang.Class<com.bytedance.android.livesdk.dataChannel.BroadcastDialogPageChannel> r1 = com.bytedance.android.livesdk.dataChannel.BroadcastDialogPageChannel.class
            X.BBP r0 = X.BBP.MODERATOR_LIST
            r2.rv0(r1, r0)
            goto Lbc
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.broadcast.preview.widget.setting.PreviewSettingWidget.LJZL():void");
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void onDestroy() {
        super.onDestroy();
        C72818Shy.LJII("ttlive_show_setting_dialog", this);
    }

    @Override // com.bytedance.android.live.broadcast.preview.PreviewWidget
    public final void onShow() {
        Boolean bool;
        DataChannel dataChannel;
        LiveMode liveMode;
        View view;
        LLIIIILZ();
        if (!InterfaceC30442Bx8.m1.LIZJ().booleanValue() && (view = this.contentView) != null) {
            view.post(new ARunnableS41S0100000_5(this, 71));
        }
        DataChannel dataChannel2 = this.dataChannel;
        if (dataChannel2 != null && (liveMode = (LiveMode) dataChannel2.kv0(LiveModeChannel.class)) != null) {
            bool = Boolean.valueOf(C28509BGv.LJI(liveMode));
        } else {
            bool = null;
        }
        if (C29306Beo.LJJIFFI(bool) && (((dataChannel = this.dataChannel) == null || dataChannel.kv0(PreviewBlockInfoChannel.class) == null) && C78540Us4.LJIIJJI() && C29306Beo.LJJIFFI(InterfaceC30442Bx8.LJLLLLLL.LIZJ()))) {
            C1YG c1yg = new C1YG(getView());
            c1yg.LIZ(R.string.mce);
            c1yg.LIZLLL = 48;
            c1yg.LJIIIIZZ = C15380j0.LIZ(266.0f);
            c1yg.LJIIIZ = true;
            c1yg.LJIIL = C29006BZy.LJLIL;
            C30326BvG.LIZJ(new ARunnableS41S0100000_5(new C1YH(c1yg), 72), null, 1000L);
        }
        if (LiveSimplifiedGoLivePageSetting.INSTANCE.enableSimplifiedGoLivePageV2()) {
            C48459J0d<Boolean> c48459J0d = InterfaceC30442Bx8.LJLZ;
            if (C29306Beo.LJJIFFI(c48459J0d.LIZJ())) {
                C1YG c1yg2 = new C1YG(getView());
                c1yg2.LIZ(R.string.lr9);
                c1yg2.LIZLLL = 48;
                c1yg2.LJIIIIZZ = C15380j0.LIZ(266.0f);
                c1yg2.LJIIIZ = true;
                c1yg2.LJIIL = C29007BZz.LJLIL;
                C30326BvG.LIZJ(new ARunnableS41S0100000_5(new C1YH(c1yg2), 73), null, 1000L);
                c48459J0d.LIZ(Boolean.FALSE);
            }
        }
    }

    @Override // com.bytedance.android.livesdk.broadcast.preview.base.PreviewToolBaseWidget
    public final int LLFFF() {
        return this.LJLJJLL;
    }

    @Override // com.bytedance.android.livesdk.broadcast.preview.base.PreviewToolBaseWidget
    public final int LLFII() {
        return this.LJLJJL;
    }

    @Override // com.bytedance.android.livesdk.broadcast.preview.base.PreviewToolBaseWidget
    public final void onClick(View view) {
        o.LJIIIZ(view, "view");
        LLIIIL();
    }

    @Override // X.InterfaceC72822Si2
    public final void onReceiveJsEvent(C199097rd c199097rd) {
        if (o.LJ(c199097rd.LJLIL, "ttlive_show_setting_dialog")) {
            LLIIIL();
        }
    }
}
