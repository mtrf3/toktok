package X;

import android.content.Context;
import android.os.Build;
import android.view.View;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.broadcast.model.RoomCreateInfo;
import com.bytedance.android.livesdk.broadcast.preview.PreviewCastWidget;
import com.bytedance.android.livesdk.broadcast.preview.widget.LiveAccessRecallWidget;
import com.bytedance.android.livesdk.broadcast.preview.widget.LiveGoalPreviewWidget;
import com.bytedance.android.livesdk.broadcast.preview.widget.PreviewApplyWidget;
import com.bytedance.android.livesdk.broadcast.preview.widget.PreviewChangeOrientationWidget;
import com.bytedance.android.livesdk.broadcast.preview.widget.PreviewCloseWidget;
import com.bytedance.android.livesdk.broadcast.preview.widget.PreviewCustomPollWidget;
import com.bytedance.android.livesdk.broadcast.preview.widget.PreviewDefinitionSelectionWidget;
import com.bytedance.android.livesdk.broadcast.preview.widget.PreviewHelpWidget;
import com.bytedance.android.livesdk.broadcast.preview.widget.PreviewLiveCenterWidget;
import com.bytedance.android.livesdk.broadcast.preview.widget.PreviewPromoteWidget;
import com.bytedance.android.livesdk.broadcast.preview.widget.PreviewSubscriptionWidget;
import com.bytedance.android.livesdk.broadcast.preview.widget.PreviewTitleWidget;
import com.bytedance.android.livesdk.broadcast.preview.widget.cover.PreviewCoverWidget;
import com.bytedance.android.livesdk.broadcast.preview.widget.levelup.GamePreviewLevelUpNotifyWidget;
import com.bytedance.android.livesdk.broadcast.preview.widget.livestudio.PreviewLiveStudioTipsWidget;
import com.bytedance.android.livesdk.broadcast.preview.widget.notify.PreviewCommonNotifyWidget;
import com.bytedance.android.livesdk.broadcast.preview.widget.partnership.GameDropsPreviewBanner;
import com.bytedance.android.livesdk.broadcast.preview.widget.partnership.GameEventPreviewBanner;
import com.bytedance.android.livesdk.broadcast.preview.widget.partnership.GameGpppaPreviewBanner;
import com.bytedance.android.livesdk.broadcast.preview.widget.partnership.PreviewGameDropsWidget;
import com.bytedance.android.livesdk.broadcast.preview.widget.partnership.PreviewPartnershipWidget;
import com.bytedance.android.livesdk.broadcast.preview.widget.replay.PreviewReplayWidget;
import com.bytedance.android.livesdk.broadcast.preview.widget.setting.PreviewSettingWidget;
import com.bytedance.android.livesdk.broadcast.preview.widget.share.PreviewShareWidget;
import com.bytedance.android.livesdk.broadcast.preview.widget.start_live.PreviewStartLiveWidget;
import com.bytedance.android.livesdk.comp.api.game.service.IGameService;
import com.bytedance.android.livesdk.dataChannel.AccessRecallVisibilityChannel;
import com.bytedance.android.livesdk.dataChannel.BlockVisibilityChannel;
import com.bytedance.android.livesdk.dataChannel.CustomPollEnableChannel;
import com.bytedance.android.livesdk.dataChannel.LiveStudioTagShowChannel;
import com.bytedance.android.livesdk.dataChannel.PreviewStartLiveContinueMsgChannel;
import com.bytedance.android.livesdk.dataChannel.ReplayEnableChannel;
import com.bytedance.android.livesdk.dataChannel.ReplayInfluenceBannerChannel;
import com.bytedance.android.livesdk.dataChannel.RoomCreateInfoChannel;
import com.bytedance.android.livesdk.livesetting.game.MultiDeviceInterruptGuideSetting;
import com.bytedance.android.livesdk.livesetting.game.partnership.GameLivePartnershipDropsSetting;
import com.bytedance.android.livesdk.livesetting.gift.LiveGoalAnchorAccessControlSetting;
import com.bytedance.android.livesdk.livesetting.gift.LiveGoalReverseControlSetting;
import com.bytedance.bpea.cert.token.TokenCert;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.Bvb, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C30347Bvb extends C0N0 {
    public final Fragment LJLILLLLZI;
    public final DataChannel LJLJI;
    public final C30387BwF LJLJJI;
    public final C25260yw LJLJJL;
    public InterfaceC30388BwG LJLJJLL;
    public boolean LJLJL;
    public final java.util.Map<Integer, View> LJLJLJ;

    public final View LJFF(int i) {
        java.util.Map<Integer, View> map = this.LJLJLJ;
        View view = map.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        if (findViewById == null) {
            return null;
        }
        map.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // X.C0N0
    public final void LIZ() {
        C25260yw c25260yw = this.LJLJJL;
        if (c25260yw != null) {
            c25260yw.LIZJ.clear();
            c25260yw.LIZLLL.clear();
            c25260yw.LJI = true;
        }
        C0N9.LIZ(C65352Pkq.LIZ(PreviewReplayWidget.class), (C31809Ce5) LJFF(R.id.ivy), new InterfaceC65350Pko[]{C65352Pkq.LIZ(BlockVisibilityChannel.class), C65352Pkq.LIZ(AccessRecallVisibilityChannel.class), C65352Pkq.LIZ(ReplayEnableChannel.class)}, true);
        C0N9.LIZ(C65352Pkq.LIZ(GamePreviewLevelUpNotifyWidget.class), (C31809Ce5) LJFF(R.id.a2t), new InterfaceC65350Pko[]{C65352Pkq.LIZ(BlockVisibilityChannel.class), C65352Pkq.LIZ(AccessRecallVisibilityChannel.class)}, true);
        C65776Prg m80 = ((IGameService) CN1.LIZ(IGameService.class)).m80();
        if ((m80 instanceof InterfaceC65350Pko) && m80 != null) {
            C0N9.LIZ(m80, (C31809Ce5) LJFF(R.id.gze), new InterfaceC65350Pko[]{C65352Pkq.LIZ(BlockVisibilityChannel.class), C65352Pkq.LIZ(AccessRecallVisibilityChannel.class)}, true);
        }
        C0N9.LIZ(C65352Pkq.LIZ(PreviewLiveStudioTipsWidget.class), (C31809Ce5) LJFF(R.id.fzl), new InterfaceC65350Pko[]{C65352Pkq.LIZ(BlockVisibilityChannel.class), C65352Pkq.LIZ(AccessRecallVisibilityChannel.class), C65352Pkq.LIZ(LiveStudioTagShowChannel.class)}, true);
        C65776Prg n70 = ((IGameService) CN1.LIZ(IGameService.class)).n70();
        if ((n70 instanceof InterfaceC65350Pko) && n70 != null) {
            C0N9.LIZ(n70, (C31809Ce5) LJFF(R.id.dqp), new InterfaceC65350Pko[]{C65352Pkq.LIZ(AccessRecallVisibilityChannel.class), C65352Pkq.LIZ(BlockVisibilityChannel.class)}, true);
        }
        C0N9.LIZ(C65352Pkq.LIZ(GameGpppaPreviewBanner.class), (C31809Ce5) LJFF(R.id.dy1), new InterfaceC65350Pko[]{C65352Pkq.LIZ(AccessRecallVisibilityChannel.class), C65352Pkq.LIZ(BlockVisibilityChannel.class)}, true);
        if (GameLivePartnershipDropsSetting.INSTANCE.getConfig().enable) {
            C0N9.LIZ(C65352Pkq.LIZ(GameDropsPreviewBanner.class), (C31809Ce5) LJFF(R.id.iew), new InterfaceC65350Pko[]{C65352Pkq.LIZ(AccessRecallVisibilityChannel.class), C65352Pkq.LIZ(BlockVisibilityChannel.class)}, true);
        }
        C0N9.LIZ(C65352Pkq.LIZ(GameEventPreviewBanner.class), (C31809Ce5) LJFF(R.id.dqf), new InterfaceC65350Pko[]{C65352Pkq.LIZ(AccessRecallVisibilityChannel.class), C65352Pkq.LIZ(BlockVisibilityChannel.class)}, true);
        if (!C35001Yy.LIZJ(getContext())) {
            C65776Prg sj = C7N.LIZJ().sj();
            if ((sj instanceof InterfaceC65350Pko) && sj != null) {
                C0N9.LIZ(sj, (C31809Ce5) LJFF(R.id.agf), new InterfaceC65350Pko[]{C65352Pkq.LIZ(BlockVisibilityChannel.class), C65352Pkq.LIZ(ReplayInfluenceBannerChannel.class), C65352Pkq.LIZ(AccessRecallVisibilityChannel.class)}, true);
            }
        }
    }

    @Override // X.C0N0
    public final void LIZLLL() {
        C25260yw c25260yw = this.LJLJJL;
        if (c25260yw != null) {
            c25260yw.LIZIZ();
        }
    }

    @Override // X.C0N0
    public final void LIZIZ() {
        String LIZ = C86881Y7x.LIZIZ().LIZ("pm_mt_mobile_gaming_background_tips");
        if (LIZ == null) {
            LIZ = C15380j0.LJIILJJIL(R.string.n16);
        }
        TextView textView = (TextView) findViewById(R.id.dqh);
        if (textView != null) {
            textView.setText(LIZ);
        }
        View findViewById = findViewById(R.id.i3g);
        findViewById.setFadingEdgeLength(0);
        findViewById.getLayoutParams().height = -2;
        C25260yw c25260yw = this.LJLJJL;
        if (c25260yw != null) {
            c25260yw.LJI = false;
        }
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Long, O] */
    /* JADX WARN: Type inference failed for: r1v49, types: [java.lang.Long, O] */
    @Override // X.C0N0
    public final void LIZJ() {
        DataChannel dataChannel;
        InterfaceC30388BwG c30401BwT;
        DataChannel dataChannel2;
        RoomCreateInfo roomCreateInfo;
        ActivityC45651qj mo49getActivity;
        boolean LIZIZ = new AnonymousClass078(getContext()).LIZIZ();
        if (Build.VERSION.SDK_INT >= 33 && !LIZIZ && (mo49getActivity = this.LJLILLLLZI.mo49getActivity()) != null) {
            C61099NyR.LIZIZ.LIZIZ(mo49getActivity, TokenCert.Companion.with("bpea-game_broadcast_post_notification_on_preview_page")).LIZ("android.permission.POST_NOTIFICATIONS").LIZJ(new C30372Bw0());
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (this.LJLJL) {
            ((C32537Cpp) DataChannelGlobal.LJLJJI.gv0(C29253Bdx.class)).LIZ = Long.valueOf(currentTimeMillis);
            this.LJLJL = false;
        }
        ((C32537Cpp) DataChannelGlobal.LJLJJI.gv0(C29254Bdy.class)).LIZ = Long.valueOf(currentTimeMillis);
        C0N9.LIZ(C65352Pkq.LIZ(PreviewCoverWidget.class), (C31809Ce5) LJFF(R.id.byb), new InterfaceC65350Pko[0], true);
        C0N9.LIZ(C65352Pkq.LIZ(PreviewCloseWidget.class), (C31809Ce5) LJFF(R.id.bg2), new InterfaceC65350Pko[0], true);
        C0N9.LIZ(C65352Pkq.LIZ(PreviewTitleWidget.class), (C31809Ce5) LJFF(R.id.lau), new InterfaceC65350Pko[0], true);
        C0N9.LIZ(C65352Pkq.LIZ(PreviewCommonNotifyWidget.class), (C31809Ce5) LJFF(R.id.h64), new InterfaceC65350Pko[0], true);
        C0N9.LIZ(C65352Pkq.LIZ(PreviewDefinitionSelectionWidget.class), (C31809Ce5) LJFF(R.id.c64), new InterfaceC65350Pko[0], true);
        C0N9.LIZ(C65352Pkq.LIZ(PreviewLiveCenterWidget.class), (C31809Ce5) LJFF(R.id.fws), new InterfaceC65350Pko[0], true);
        C0N9.LIZ(C65352Pkq.LIZ(PreviewPartnershipWidget.class), (C31809Ce5) LJFF(R.id.hih), new InterfaceC65350Pko[0], true);
        C0N9.LIZ(C65352Pkq.LIZ(PreviewGameDropsWidget.class), (C31809Ce5) LJFF(R.id.dqe), new InterfaceC65350Pko[0], true);
        C0N9.LIZ(C65352Pkq.LIZ(PreviewShareWidget.class), (C31809Ce5) LJFF(R.id.jvi), new InterfaceC65350Pko[0], true);
        C0N9.LIZ(C65352Pkq.LIZ(PreviewSettingWidget.class), (C31809Ce5) LJFF(R.id.jr7), new InterfaceC65350Pko[0], true);
        C0N9.LIZ(C65352Pkq.LIZ(PreviewStartLiveWidget.class), (C31809Ce5) LJFF(R.id.kd6), new InterfaceC65350Pko[0], true);
        C0N9.LIZ(C65352Pkq.LIZ(PreviewHelpWidget.class), (C31809Ce5) LJFF(R.id.e53), new InterfaceC65350Pko[0], true);
        C0N9.LIZ(C65352Pkq.LIZ(PreviewSubscriptionWidget.class), (C31809Ce5) LJFF(R.id.kq8), new InterfaceC65350Pko[0], true);
        C65776Prg nk = C7N.LJIIJ().nk();
        Boolean bool = null;
        if (!(nk instanceof InterfaceC65350Pko)) {
            nk = null;
        }
        if (nk != null) {
            C0N9.LIZ(nk, (C31809Ce5) LJFF(R.id.e2q), new InterfaceC65350Pko[]{C65352Pkq.LIZ(BlockVisibilityChannel.class), C65352Pkq.LIZ(AccessRecallVisibilityChannel.class)}, true);
        }
        C0N9.LIZ(C65352Pkq.LIZ(LiveAccessRecallWidget.class), (C31809Ce5) LJFF(R.id.h9a), new InterfaceC65350Pko[]{C65352Pkq.LIZ(BlockVisibilityChannel.class)}, true);
        EnumC12540eQ LIZJ = BCD.LIZJ(this.LJLJI, BHG.LJLIL, null);
        EnumC12540eQ enumC12540eQ = EnumC12540eQ.ON;
        if (LIZJ == enumC12540eQ && (!User.sSubPermission || (dataChannel2 = this.LJLJI) == null || (roomCreateInfo = (RoomCreateInfo) dataChannel2.kv0(RoomCreateInfoChannel.class)) == null || roomCreateInfo.roomAuthCustomizablePoll != 1)) {
            C0N9.LIZ(C65352Pkq.LIZ(PreviewCustomPollWidget.class), (C31809Ce5) LJFF(R.id.c2n), new InterfaceC65350Pko[]{C65352Pkq.LIZ(CustomPollEnableChannel.class)}, true);
        }
        C0N9.LIZ(C65352Pkq.LIZ(PreviewApplyWidget.class), (C31809Ce5) LJFF(R.id.a6x), new InterfaceC65350Pko[0], true);
        PreviewApplyWidget previewApplyWidget = (PreviewApplyWidget) C0N9.LIZIZ(C65352Pkq.LIZ(PreviewApplyWidget.class));
        if (previewApplyWidget != null) {
            previewApplyWidget.LJLJL = (C119774mz) LJFF(R.id.dj8);
        }
        if (BCD.LIZJ(this.LJLJI, BHO.LJLIL, null) == enumC12540eQ) {
            C0N9.LIZ(C65352Pkq.LIZ(PreviewPromoteWidget.class), (C31809Ce5) LJFF(R.id.ibt), new InterfaceC65350Pko[]{C65352Pkq.LIZ(AccessRecallVisibilityChannel.class), C65352Pkq.LIZ(BlockVisibilityChannel.class)}, true);
        }
        if (!LiveGoalReverseControlSetting.INSTANCE.enableReverse() && LiveGoalAnchorAccessControlSetting.INSTANCE.showPreviewWidget()) {
            C0N9.LIZ(C65352Pkq.LIZ(LiveGoalPreviewWidget.class), (C31809Ce5) LJFF(R.id.klh), new InterfaceC65350Pko[]{C65352Pkq.LIZ(AccessRecallVisibilityChannel.class), C65352Pkq.LIZ(BlockVisibilityChannel.class)}, true);
        }
        C0N9.LIZ(C65352Pkq.LIZ(PreviewCastWidget.class), (C31809Ce5) LJFF(R.id.gk3), new InterfaceC65350Pko[0], true);
        C0N9.LIZ(C65352Pkq.LIZ(PreviewChangeOrientationWidget.class), (C31809Ce5) LJFF(R.id.b98), new InterfaceC65350Pko[0], true);
        if (this.LJLJJLL == null) {
            if (MultiDeviceInterruptGuideSetting.INSTANCE.isEnable()) {
                c30401BwT = new C30402BwU(this.LJLILLLLZI, this.LJLJI);
            } else {
                c30401BwT = new C30401BwT(this.LJLILLLLZI, this.LJLJI);
            }
            this.LJLJJLL = c30401BwT;
        }
        InterfaceC30388BwG interfaceC30388BwG = this.LJLJJLL;
        if (interfaceC30388BwG != null) {
            bool = Boolean.valueOf(interfaceC30388BwG.LIZ());
        }
        Boolean bool2 = Boolean.TRUE;
        if (!o.LJ(bool, bool2) && (dataChannel = this.LJLJI) != null && o.LJ(dataChannel.kv0(PreviewStartLiveContinueMsgChannel.class), bool2)) {
            C28957BYb c28957BYb = C28957BYb.LJLIL;
            Context context = getContext();
            o.LJIIIIZZ(context, "context");
            c28957BYb.LIZJ(context, this.LJLJI);
        }
    }

    public final Fragment getFragment() {
        return this.LJLILLLLZI;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C30347Bvb(androidx.fragment.app.Fragment r4, X.C61 r5) {
        /*
            r3 = this;
            java.lang.String r0 = "fragment"
            kotlin.jvm.internal.o.LJIIIZ(r4, r0)
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            r3.LJLJLJ = r0
            android.content.Context r1 = r4.getContext()
            kotlin.jvm.internal.o.LJI(r1)
            r0 = 2131564050(0x7f0d1612, float:1.8753574E38)
            r3.<init>(r1, r0)
            r3.LJLILLLLZI = r4
            com.bytedance.ies.sdk.datachannel.DataChannel r1 = X.C51029K0z.LJIILIIL(r4)
            r3.LJLJI = r1
            X.BwF r0 = new X.BwF
            r0.<init>()
            r3.LJLJJI = r0
            if (r5 == 0) goto L7d
            X.0yw r0 = r5.LIZIZ
        L2c:
            r3.LJLJJL = r0
            r0 = 1
            r3.LJLJL = r0
            java.lang.Class<com.bytedance.android.livesdk.comp.api.game.service.IGameService> r0 = com.bytedance.android.livesdk.comp.api.game.service.IGameService.class
            X.0Mx r0 = X.CN1.LIZ(r0)
            com.bytedance.android.livesdk.comp.api.game.service.IGameService r0 = (com.bytedance.android.livesdk.comp.api.game.service.IGameService) r0
            r0.Rt(r4, r1)
            boolean r0 = X.C30922CBq.LIZIZ
            if (r0 == 0) goto L47
            java.lang.String r1 = "PreviewEventCenterWidget"
            java.lang.String r0 = "register"
            X.C0NB.LJIIIZ(r1, r0)
        L47:
            X.Bvq r1 = new X.Bvq
            r1.<init>()
            java.lang.String r0 = "enter_game_live_guide"
            X.C72818Shy.LIZLLL(r0, r1)
            X.10g r0 = X.C259710f.LIZ
            boolean r0 = r0.LJIIIZ()
            if (r0 != 0) goto L67
            r0 = 2131373493(0x7f0a2db5, float:1.8367079E38)
            android.view.View r1 = r3.findViewById(r0)
            if (r1 == 0) goto L67
            X.Bw1 r0 = X.ViewOnTouchListenerC30373Bw1.LJLIL
            r1.setOnTouchListener(r0)
        L67:
            android.content.Context r2 = r3.getContext()
            r0 = 2131374210(0x7f0a3082, float:1.8368533E38)
            android.view.View r1 = r3.LJFF(r0)
            X.1t0 r1 = (X.C47061t0) r1
            java.lang.String r0 = "radio_cover"
            kotlin.jvm.internal.o.LJIIIIZZ(r1, r0)
            X.C22960vE.LIZ(r2, r1)
            return
        L7d:
            r0 = 0
            goto L2c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C30347Bvb.<init>(androidx.fragment.app.Fragment, X.C61):void");
    }
}
