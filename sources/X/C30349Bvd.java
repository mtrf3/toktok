package X;

import android.view.View;
import com.bytedance.android.live.effect.api.IEffectService;
import com.bytedance.android.live.slot.ISlotService;
import com.bytedance.android.livesdk.broadcast.preview.widget.LiveGoalPreviewWidget;
import com.bytedance.android.livesdk.broadcast.preview.widget.PreviewApplyWidget;
import com.bytedance.android.livesdk.broadcast.preview.widget.PreviewCloseWidget;
import com.bytedance.android.livesdk.broadcast.preview.widget.PreviewCustomPollWidget;
import com.bytedance.android.livesdk.broadcast.preview.widget.PreviewFilterStyleWidget;
import com.bytedance.android.livesdk.broadcast.preview.widget.PreviewLiveCenterWidget;
import com.bytedance.android.livesdk.broadcast.preview.widget.PreviewPromoteWidget;
import com.bytedance.android.livesdk.broadcast.preview.widget.PreviewStickerHintWidget;
import com.bytedance.android.livesdk.broadcast.preview.widget.PreviewSubscriptionWidget;
import com.bytedance.android.livesdk.broadcast.preview.widget.PreviewTitleWidget;
import com.bytedance.android.livesdk.broadcast.preview.widget.cover.PreviewCoverWidget;
import com.bytedance.android.livesdk.broadcast.preview.widget.levelup.PreviewLevelUpNotifyWidget;
import com.bytedance.android.livesdk.broadcast.preview.widget.livegoal.PreviewLiveGoalEffectWidget;
import com.bytedance.android.livesdk.broadcast.preview.widget.livepro.PreviewLiveProNotifyWidget;
import com.bytedance.android.livesdk.broadcast.preview.widget.livevoice.PreviewLiveVoiceMicListWidget;
import com.bytedance.android.livesdk.broadcast.preview.widget.notify.PreviewCommonNotifyWidget;
import com.bytedance.android.livesdk.broadcast.preview.widget.replay.PreviewReplayWidget;
import com.bytedance.android.livesdk.broadcast.preview.widget.setting.PreviewSettingWidget;
import com.bytedance.android.livesdk.broadcast.preview.widget.share.PreviewShareWidget;
import com.bytedance.android.livesdk.broadcast.preview.widget.start_live.PreviewStartLiveWidget;
import com.bytedance.android.livesdk.dataChannel.AccessRecallVisibilityChannel;
import com.bytedance.android.livesdk.dataChannel.BlockVisibilityChannel;
import com.bytedance.android.livesdk.dataChannel.CustomPollEnableChannel;
import com.bytedance.android.livesdk.dataChannel.EffectDialogShowChannel;
import com.bytedance.android.livesdk.dataChannel.LevelupNotifyBannerChannel;
import com.bytedance.android.livesdk.dataChannel.LiveGoalDialogShowChannel;
import com.bytedance.android.livesdk.dataChannel.LiveProNotifyBannerChannel;
import com.bytedance.android.livesdk.dataChannel.LiveSimplifiedVisibilityChannel;
import com.bytedance.android.livesdk.dataChannel.ReplayEnableChannel;
import com.bytedance.android.livesdk.dataChannel.ReplayInfluenceBannerChannel;
import com.bytedance.android.livesdk.dataChannel.StickerDialogShowChannel;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveSimplifiedGoLivePageSetting;
import com.bytedance.android.livesdk.livesetting.gift.LiveGoalAnchorAccessControlSetting;
import com.bytedance.android.livesdk.livesetting.gift.LiveGoalReverseControlSetting;
import com.bytedance.android.livesdk.livesetting.performance.LiveGoal2GreenScreenSetting;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.google.android.play.core.appupdate.u;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.Bvd, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C30349Bvd extends C0N0 implements InterfaceC72822Si2 {
    public final DataChannel LJLILLLLZI;
    public final java.util.Map<Integer, View> LJLJI;

    public final View LJFF(int i) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLJI;
        View view = (View) linkedHashMap.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        if (findViewById == null) {
            return null;
        }
        linkedHashMap.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    static {
        ((ISlotService) CN1.LIZ(ISlotService.class)).registerSlot(new C30614Bzu());
    }

    @Override // X.C0N0
    public final void LIZJ() {
        C0N9.LIZ(C65352Pkq.LIZ(PreviewCoverWidget.class), (C31809Ce5) LJFF(R.id.byb), new InterfaceC65350Pko[]{C65352Pkq.LIZ(StickerDialogShowChannel.class), C65352Pkq.LIZ(EffectDialogShowChannel.class), C65352Pkq.LIZ(LiveGoalDialogShowChannel.class), C65352Pkq.LIZ(LiveSimplifiedVisibilityChannel.class)}, true);
        C0N9.LIZ(C65352Pkq.LIZ(PreviewCloseWidget.class), (C31809Ce5) LJFF(R.id.bg2), new InterfaceC65350Pko[]{C65352Pkq.LIZ(StickerDialogShowChannel.class), C65352Pkq.LIZ(EffectDialogShowChannel.class), C65352Pkq.LIZ(LiveGoalDialogShowChannel.class)}, true);
        C0N9.LIZ(C65352Pkq.LIZ(PreviewTitleWidget.class), (C31809Ce5) LJFF(R.id.lau), new InterfaceC65350Pko[]{C65352Pkq.LIZ(StickerDialogShowChannel.class), C65352Pkq.LIZ(EffectDialogShowChannel.class), C65352Pkq.LIZ(LiveGoalDialogShowChannel.class), C65352Pkq.LIZ(LiveSimplifiedVisibilityChannel.class)}, true);
        C0N9.LIZ(C65352Pkq.LIZ(PreviewCommonNotifyWidget.class), (C31809Ce5) LJFF(R.id.h64), new InterfaceC65350Pko[0], true);
        C0N9.LIZ(C65352Pkq.LIZ(PreviewReplayWidget.class), (C31809Ce5) LJFF(R.id.ivy), new InterfaceC65350Pko[]{C65352Pkq.LIZ(StickerDialogShowChannel.class), C65352Pkq.LIZ(EffectDialogShowChannel.class), C65352Pkq.LIZ(LiveGoalDialogShowChannel.class), C65352Pkq.LIZ(BlockVisibilityChannel.class), C65352Pkq.LIZ(ReplayEnableChannel.class)}, true);
        C0N9.LIZ(C65352Pkq.LIZ(PreviewShareWidget.class), (C31809Ce5) LJFF(R.id.jvi), new InterfaceC65350Pko[]{C65352Pkq.LIZ(StickerDialogShowChannel.class), C65352Pkq.LIZ(EffectDialogShowChannel.class), C65352Pkq.LIZ(LiveGoalDialogShowChannel.class)}, true);
        C0N9.LIZ(C65352Pkq.LIZ(PreviewSettingWidget.class), (C31809Ce5) LJFF(R.id.jr7), new InterfaceC65350Pko[]{C65352Pkq.LIZ(StickerDialogShowChannel.class), C65352Pkq.LIZ(EffectDialogShowChannel.class), C65352Pkq.LIZ(LiveGoalDialogShowChannel.class)}, true);
        if (!LiveGoalReverseControlSetting.INSTANCE.enableReverse() && LiveGoalAnchorAccessControlSetting.INSTANCE.showPreviewWidget() && !LiveSimplifiedGoLivePageSetting.INSTANCE.enableSimplifiedGoLivePageV1orV2()) {
            C0N9.LIZ(C65352Pkq.LIZ(LiveGoalPreviewWidget.class), (C31809Ce5) LJFF(R.id.klh), new InterfaceC65350Pko[]{C65352Pkq.LIZ(StickerDialogShowChannel.class), C65352Pkq.LIZ(EffectDialogShowChannel.class), C65352Pkq.LIZ(LiveGoalDialogShowChannel.class), C65352Pkq.LIZ(BlockVisibilityChannel.class)}, true);
        }
        C0N9.LIZ(C65352Pkq.LIZ(PreviewLevelUpNotifyWidget.class), (C31809Ce5) LJFF(R.id.a2t), new InterfaceC65350Pko[]{C65352Pkq.LIZ(BlockVisibilityChannel.class), C65352Pkq.LIZ(StickerDialogShowChannel.class), C65352Pkq.LIZ(EffectDialogShowChannel.class), C65352Pkq.LIZ(LiveGoalDialogShowChannel.class)}, true);
        C0N9.LIZ(C65352Pkq.LIZ(PreviewLiveProNotifyWidget.class), (C31809Ce5) LJFF(R.id.fy1), new InterfaceC65350Pko[]{C65352Pkq.LIZ(LevelupNotifyBannerChannel.class), C65352Pkq.LIZ(StickerDialogShowChannel.class), C65352Pkq.LIZ(EffectDialogShowChannel.class), C65352Pkq.LIZ(LiveGoalDialogShowChannel.class)}, true);
        C0N9.LIZ(C65352Pkq.LIZ(PreviewLiveCenterWidget.class), (C31809Ce5) LJFF(R.id.fws), new InterfaceC65350Pko[]{C65352Pkq.LIZ(StickerDialogShowChannel.class), C65352Pkq.LIZ(EffectDialogShowChannel.class), C65352Pkq.LIZ(LiveGoalDialogShowChannel.class)}, true);
        C0N9.LIZ(C65352Pkq.LIZ(PreviewStartLiveWidget.class), (C31809Ce5) LJFF(R.id.kd6), new InterfaceC65350Pko[]{C65352Pkq.LIZ(StickerDialogShowChannel.class), C65352Pkq.LIZ(EffectDialogShowChannel.class), C65352Pkq.LIZ(LiveGoalDialogShowChannel.class)}, true);
        C0N9.LIZ(C65352Pkq.LIZ(PreviewApplyWidget.class), (C31809Ce5) LJFF(R.id.a6x), new InterfaceC65350Pko[0], true);
        PreviewApplyWidget previewApplyWidget = (PreviewApplyWidget) C0N9.LIZIZ(C65352Pkq.LIZ(PreviewApplyWidget.class));
        if (previewApplyWidget != null) {
            previewApplyWidget.LJLJL = (C119774mz) LJFF(R.id.dj8);
        }
        C65776Prg sj = C7N.LIZJ().sj();
        if ((sj instanceof InterfaceC65350Pko) && sj != null) {
            C0N9.LIZ(sj, (C31809Ce5) LJFF(R.id.agf), new InterfaceC65350Pko[]{C65352Pkq.LIZ(BlockVisibilityChannel.class), C65352Pkq.LIZ(ReplayInfluenceBannerChannel.class), C65352Pkq.LIZ(LiveGoalDialogShowChannel.class), C65352Pkq.LIZ(LiveProNotifyBannerChannel.class)}, true);
        }
        C0N9.LIZ(C65352Pkq.LIZ(PreviewSubscriptionWidget.class), (C31809Ce5) LJFF(R.id.kq8), new InterfaceC65350Pko[]{C65352Pkq.LIZ(StickerDialogShowChannel.class), C65352Pkq.LIZ(EffectDialogShowChannel.class), C65352Pkq.LIZ(LiveGoalDialogShowChannel.class)}, true);
        EnumC12540eQ LIZJ = BCD.LIZJ(this.LJLILLLLZI, BHG.LJLIL, null);
        EnumC12540eQ enumC12540eQ = EnumC12540eQ.ON;
        if (LIZJ == enumC12540eQ) {
            C0N9.LIZ(C65352Pkq.LIZ(PreviewCustomPollWidget.class), (C31809Ce5) LJFF(R.id.c2n), new InterfaceC65350Pko[]{C65352Pkq.LIZ(StickerDialogShowChannel.class), C65352Pkq.LIZ(EffectDialogShowChannel.class), C65352Pkq.LIZ(LiveGoalDialogShowChannel.class), C65352Pkq.LIZ(CustomPollEnableChannel.class)}, true);
        }
        C0N9.LIZ(C65352Pkq.LIZ(PreviewFilterStyleWidget.class), (C31809Ce5) LJFF(R.id.d_c), new InterfaceC65350Pko[0], true);
        C0N9.LIZ(C65352Pkq.LIZ(PreviewStickerHintWidget.class), (C31809Ce5) LJFF(R.id.drp), new InterfaceC65350Pko[0], true);
        if (!LiveSimplifiedGoLivePageSetting.INSTANCE.enableSimplifiedGoLivePageV1orV2()) {
            C65776Prg nk = C7N.LJIIJ().nk();
            if ((nk instanceof InterfaceC65350Pko) && nk != null) {
                C0N9.LIZ(nk, (C31809Ce5) LJFF(R.id.e2q), new InterfaceC65350Pko[]{C65352Pkq.LIZ(StickerDialogShowChannel.class), C65352Pkq.LIZ(EffectDialogShowChannel.class), C65352Pkq.LIZ(LiveGoalDialogShowChannel.class), C65352Pkq.LIZ(BlockVisibilityChannel.class), C65352Pkq.LIZ(AccessRecallVisibilityChannel.class)}, true);
            }
        }
        C29306Beo.LJJLIIIJJI(LJFF(R.id.b1g), false);
        if (BCD.LIZJ(this.LJLILLLLZI, BHO.LJLIL, null) == enumC12540eQ) {
            C0N9.LIZ(C65352Pkq.LIZ(PreviewPromoteWidget.class), (C31809Ce5) LJFF(R.id.ibt), new InterfaceC65350Pko[]{C65352Pkq.LIZ(StickerDialogShowChannel.class), C65352Pkq.LIZ(EffectDialogShowChannel.class), C65352Pkq.LIZ(LiveGoalDialogShowChannel.class), C65352Pkq.LIZ(AccessRecallVisibilityChannel.class), C65352Pkq.LIZ(BlockVisibilityChannel.class)}, true);
        }
        if (LiveGoal2GreenScreenSetting.INSTANCE.getEnable()) {
            C0N9.LIZ(C65352Pkq.LIZ(PreviewLiveGoalEffectWidget.class), (C31809Ce5) LJFF(R.id.fx0), new InterfaceC65350Pko[]{C65352Pkq.LIZ(LiveGoalDialogShowChannel.class)}, true);
        }
        C0N9.LIZ(C65352Pkq.LIZ(PreviewLiveVoiceMicListWidget.class), (C31809Ce5) LJFF(R.id.fhj), new InterfaceC65350Pko[0], true);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C30349Bvd(androidx.fragment.app.Fragment r6) {
        /*
            r5 = this;
            java.lang.String r0 = "fragment"
            kotlin.jvm.internal.o.LJIIIZ(r6, r0)
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            r5.LJLJI = r0
            android.content.Context r1 = r6.requireContext()
            java.lang.String r0 = "fragment.requireContext()"
            kotlin.jvm.internal.o.LJIIIIZZ(r1, r0)
            r0 = 2131564064(0x7f0d1620, float:1.8753603E38)
            r5.<init>(r1, r0)
            com.bytedance.ies.sdk.datachannel.DataChannel r2 = X.C51029K0z.LJIILIIL(r6)
            r5.LJLILLLLZI = r2
            com.bytedance.android.livesdk.livesetting.performance.LiveGoal2GreenScreenSetting r0 = com.bytedance.android.livesdk.livesetting.performance.LiveGoal2GreenScreenSetting.INSTANCE
            boolean r0 = r0.getEnable()
            r1 = 1
            if (r0 == 0) goto L49
            java.lang.Class<com.bytedance.android.live.effect.api.IEffectService> r0 = com.bytedance.android.live.effect.api.IEffectService.class
            X.0Mx r0 = X.CN1.LIZ(r0)
            com.bytedance.android.live.effect.api.IEffectService r0 = (com.bytedance.android.live.effect.api.IEffectService) r0
            X.0Tl r0 = r0.getLiveGoalEffectHelper()
            r0.getClass()
            X.C31691Mf.LIZJ = r2
            X.C31691Mf.LIZLLL = r1
            X.1wu r0 = X.C49481wu.LJLIL
            X.C31691Mf.LJI(r0)
            X.0WR r0 = X.C30355Bvj.LJ()
            r0.LJ(r2)
        L49:
            X.AbstractC30707C3j.LIZ()
            java.lang.String r0 = "live_open_onboaring_tips"
            X.C72818Shy.LIZLLL(r0, r5)
            java.lang.String r0 = "live_goal_update_event"
            X.C72818Shy.LIZLLL(r0, r5)
            if (r2 == 0) goto L68
            java.lang.Class<X.2Dr> r0 = X.C54952Dr.class
            java.lang.Object r4 = r2.kv0(r0)
            java.lang.String r4 = (java.lang.String) r4
            if (r4 == 0) goto L68
            int r0 = r4.length()
            if (r0 != 0) goto L69
        L68:
            return
        L69:
            com.bytedance.android.live.effect.api.IEffectService r0 = X.C7N.LJII()
            r0.getLiveGoalEffectHelper()
            X.C31691Mf.LJIILJJIL()
            X.XIA r0 = X.C78613UtF.LIZJ
            X.2gm r3 = X.C48841JEv.LIZ(r0)
            X.Bvg r2 = new X.Bvg
            r1 = 0
            r2.<init>(r4, r1)
            r0 = 3
            X.XKX.LIZLLL(r3, r1, r1, r2, r0)
            goto L68
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C30349Bvd.<init>(androidx.fragment.app.Fragment):void");
    }

    @Override // X.InterfaceC72822Si2
    public final void onReceiveJsEvent(C199097rd c199097rd) {
        InterfaceC78280Uns interfaceC78280Uns;
        String str = c199097rd.LJLIL;
        String str2 = null;
        if (o.LJ(str, "live_open_onboaring_tips")) {
            InterfaceC78280Uns interfaceC78280Uns2 = c199097rd.LJLILLLLZI;
            if (interfaceC78280Uns2 != null) {
                str2 = u.LJJIJIL(interfaceC78280Uns2, "enter_from", "");
            }
            BQT.LIZ(this.LJLILLLLZI, str2);
            return;
        }
        if (!o.LJ(str, "live_goal_update_event") || (interfaceC78280Uns = c199097rd.LJLILLLLZI) == null) {
            return;
        }
        InterfaceC08090Tl liveGoalEffectHelper = ((IEffectService) CN1.LIZ(IEffectService.class)).getLiveGoalEffectHelper();
        if (u.LJJIIZI(interfaceC78280Uns, "isQuit", false)) {
            ((C31691Mf) liveGoalEffectHelper).LJIILL();
            return;
        }
        if (u.LJJIJIIJI(interfaceC78280Uns, "live_goal_background_position", 0) == 0) {
            ((C31691Mf) liveGoalEffectHelper).LJIIJJI();
        } else {
            C31691Mf.LJJI();
            C31691Mf.LJJ();
        }
        liveGoalEffectHelper.getClass();
        C31691Mf.LJI(C49521wy.LJLIL);
        C31691Mf.LJ = null;
    }
}
