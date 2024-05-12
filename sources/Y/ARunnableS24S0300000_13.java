package Y;

import X.AbstractC75323ThH;
import X.ActivityC45651qj;
import X.C0WE;
import X.C0WF;
import X.C15580jK;
import X.C16880lQ;
import X.C29306Beo;
import X.C2A4;
import X.C31012CFc;
import X.C32014ChO;
import X.C42951mN;
import X.C47061t0;
import X.C47121t6;
import X.C74719TUd;
import X.C75145TeP;
import X.C75378TiA;
import X.C75745To5;
import X.C75993Ts5;
import X.C76001TsD;
import X.C76002TsE;
import X.C76012TsO;
import X.C76113Tu1;
import X.C76179Tv5;
import X.C76180Tv6;
import X.C76641U6b;
import X.C76642U6c;
import X.C76671U7f;
import X.C76696U8e;
import X.C76762UAs;
import X.C76846UDy;
import X.C76929UHd;
import X.C76997UJt;
import X.C77520Ubc;
import X.C77557UcD;
import X.C77591Ucl;
import X.C78368UpI;
import X.C78391Upf;
import X.C78392Upg;
import X.C78886Uxe;
import X.C78924UyG;
import X.C79004UzY;
import X.C87277YNd;
import X.C8E;
import X.CN1;
import X.InterfaceC21020s6;
import X.InterfaceC24140x8;
import X.InterfaceC65784Pro;
import X.InterfaceC74605TPt;
import X.InterfaceC75414Tik;
import X.InterfaceC75579TlP;
import X.InterfaceC76622U5i;
import X.InterfaceC76768UAy;
import X.InterfaceC78395Upj;
import X.InterfaceC88472Yns;
import X.LAV;
import X.TV3;
import X.U1X;
import X.U4R;
import X.U62;
import X.U64;
import X.U66;
import X.U6A;
import X.U6H;
import X.U6I;
import X.U6J;
import X.U6K;
import X.U6L;
import X.U6M;
import X.U6S;
import X.U7F;
import X.U7T;
import X.U7U;
import X.U7V;
import X.U8H;
import X.UB4;
import X.UC0;
import X.ViewOnClickListenerC75325ThJ;
import android.graphics.Outline;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.view.ViewParent;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.live.gift.SpecialGiftComboVisibilityChannel;
import com.bytedance.android.live.liveinteract.api.OnSelfWindowCreatedEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.main.guest.MultiGuestV3GuestPresenter;
import com.bytedance.android.live.wallet.IWalletService;
import com.bytedance.android.livesdk.comp.api.linkcore.model.ApplyData;
import com.bytedance.android.livesdk.comp.api.linkcore.model.ApplyMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.CancelApplyData;
import com.bytedance.android.livesdk.comp.api.linkcore.model.CancelApplyMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.CancelInviteData;
import com.bytedance.android.livesdk.comp.api.linkcore.model.CancelInviteMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.CreateChannelMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.CustomLinkMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.DestroyChannelMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.ExtraDataWrapper;
import com.bytedance.android.livesdk.comp.api.linkcore.model.InviteData;
import com.bytedance.android.livesdk.comp.api.linkcore.model.InviteMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.InviteResult;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LeaveChannelData;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LeaveGroupMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LeaveMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkFinishReason;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkUser;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LiveRoomUser;
import com.bytedance.android.livesdk.comp.api.linkcore.model.PermitApplyData;
import com.bytedance.android.livesdk.comp.api.linkcore.model.PermitApplyGroupMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.ReplyInviteData;
import com.bytedance.android.livesdk.comp.api.linkcore.model.ReplyInviteGroupMessage;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveBroadcastTaskResourceIdSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicMultiGuestV3MaskAvatarSizeTestSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveAudienceLinkmicLowestAgeSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicFloatWindowOptimizeSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestFlyMicViewUsePoolSetting;
import com.bytedance.android.livesdk.model.message.LinkMessage;
import com.bytedance.android.livesdk.model.message.linkcore.InviteResponse;
import com.bytedance.android.livesdk.model.message.linkcore.LinkLayerMessage;
import com.bytedance.android.livesdk.model.message.linkcore.LinkMicCommonResp;
import com.bytedance.android.livesdk.widgets.LiveNewSpecialGiftWidget;
import com.bytedance.globalpayment.iap.common.ability.model.OrderInfo;
import com.bytedance.globalpayment.iap.model.IapPaymentMethod;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.facebook.fresco.animation.drawable.AnimatedDrawable2;
import com.ss.ttlivestreamer.livestreamv2.core.LiveCore;
import com.ss.ugc.live.sdk.message.data.IMessage;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.AqS179S0100000_13;
import org.json.JSONObject;
import tikcast.linkmic.common.GroupPlayer;
import webcast.im.PermitJoinGroupContent;

/* loaded from: classes14.dex */
public class ARunnableS24S0300000_13 implements Runnable {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                return;
            case 1:
                run$1(this);
                return;
            case 2:
                run$2(this);
                return;
            case 3:
                run$3(this);
                return;
            case 4:
                run$4(this);
                return;
            case 5:
                run$5(this);
                return;
            case 6:
                run$6(this);
                return;
            case 7:
                run$7(this);
                return;
            case 8:
                run$8(this);
                return;
            case 9:
                run$9(this);
                return;
            case 10:
                run$10(this);
                return;
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                run$11(this);
                return;
            case 12:
                run$12(this);
                return;
            case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                run$13(this);
                return;
            case 14:
                run$14(this);
                return;
            case 15:
                run$15(this);
                return;
            case LiveAudienceLinkmicLowestAgeSetting.DEFAULT /* 16 */:
                run$16(this);
                return;
            case 17:
                run$17(this);
                return;
            case 18:
                run$18(this);
                return;
            case 19:
                run$19(this);
                return;
            case 20:
                run$20(this);
                return;
            case 21:
                run$21(this);
                return;
            case 22:
                run$22(this);
                return;
            case 23:
                run$23(this);
                return;
            case 24:
                run$24(this);
                return;
            case 25:
                run$25(this);
                return;
            case 26:
                run$26(this);
                return;
            case 27:
                run$27(this);
                return;
            case 28:
                run$28(this);
                return;
            case 29:
                run$29(this);
                return;
            case 30:
                run$30(this);
                return;
            case 31:
                run$31(this);
                return;
            case 32:
                run$32(this);
                return;
            case 33:
                run$33(this);
                return;
            case 34:
                run$34(this);
                return;
            case 35:
                run$35(this);
                return;
            case 36:
                run$36(this);
                return;
            case 37:
                run$37(this);
                return;
            case 38:
                run$38(this);
                return;
            case 39:
                run$39(this);
                return;
            case LinkMicMultiGuestV3MaskAvatarSizeTestSetting.SIZE_40 /* 40 */:
                run$40(this);
                return;
            case 41:
                run$41(this);
                return;
            case 42:
                run$42(this);
                return;
            case LiveBroadcastTaskResourceIdSetting.DEFAULT /* 43 */:
                run$43(this);
                return;
            default:
                return;
        }
    }

    public final void LIZ$0() {
        AbstractC75323ThH abstractC75323ThH;
        DataChannel dataChannel;
        TextView textView;
        LiveIconView liveIconView;
        C47061t0 c47061t0;
        C75378TiA c75378TiA;
        MutableLiveData<Integer> LJIIJJI;
        Integer value;
        View findViewById;
        C76696U8e LJJIII;
        TV3.LJIIL((ViewGroup) this.l0, new AqS179S0100000_13((ViewOnClickListenerC75325ThJ) this.l2, 42));
        InterfaceC75579TlP LJJJIL = C78886Uxe.LJJJIL(C8E.LJ());
        String str = null;
        if (LJJJIL != null && (LJJIII = ((U8H) LJJJIL).LJJIII()) != null) {
            str = LJJIII.getLayoutId();
        }
        int LIZ = (int) (LAV.LIZ(str) * ((ViewGroup) this.l0).getWidth());
        ViewGroup viewGroup = (ViewGroup) this.l1;
        if (viewGroup != null && (findViewById = viewGroup.findViewById(R.id.hsi)) != null) {
            C79004UzY.LJJJLZIJ(LIZ, LIZ, findViewById);
        }
        float f = LIZ;
        int i = (int) (1.8229166f * f);
        int i2 = (LIZ - i) / 2;
        int height = ((ViewGroup) this.l0).getHeight() - ((LIZ + i) / 2);
        int width = (((ViewGroup) this.l0).getWidth() - i) / 2;
        ViewGroup viewGroup2 = (ViewGroup) this.l1;
        if (viewGroup2 != null && (c47061t0 = (C47061t0) viewGroup2.findViewById(R.id.hba)) != null) {
            ViewOnClickListenerC75325ThJ viewOnClickListenerC75325ThJ = (ViewOnClickListenerC75325ThJ) this.l2;
            C79004UzY.LJJJLZIJ(i, i, c47061t0);
            C79004UzY.LJJJLL(c47061t0, Integer.valueOf(width), Integer.valueOf(i2), Integer.valueOf(width), Integer.valueOf(height));
            viewOnClickListenerC75325ThJ.LJLJLLL = new C75378TiA(c47061t0, true);
            AbstractC75323ThH abstractC75323ThH2 = viewOnClickListenerC75325ThJ.LJLLI;
            if ((abstractC75323ThH2 == null || (LJIIJJI = abstractC75323ThH2.LJIIJJI()) == null || (value = LJIIJJI.getValue()) == null || value.intValue() != 0) && (c75378TiA = viewOnClickListenerC75325ThJ.LJLJLLL) != null) {
                c75378TiA.LIZJ = true;
            }
        }
        ViewGroup viewGroup3 = (ViewGroup) this.l1;
        if (viewGroup3 != null && (liveIconView = (LiveIconView) viewGroup3.findViewById(R.id.hb3)) != null) {
            int i3 = (int) (f * 0.3125f);
            C79004UzY.LJJJLZIJ(i3, i3, liveIconView);
            liveIconView.setIconHeightRatio(0.6f);
            liveIconView.setIconWidthRatio(0.6f);
        }
        float width2 = ((ViewGroup) this.l0).getWidth() * 0.8f;
        ViewGroup viewGroup4 = (ViewGroup) this.l1;
        if (viewGroup4 != null && (textView = (TextView) viewGroup4.findViewById(R.id.h1d)) != null) {
            textView.setMaxWidth((int) width2);
        }
        if (((ViewOnClickListenerC75325ThJ) this.l2).LJFF() && (abstractC75323ThH = ((ViewOnClickListenerC75325ThJ) this.l2).LJLLI) != null && (dataChannel = abstractC75323ThH.LIZ) != null) {
            dataChannel.pv0(OnSelfWindowCreatedEvent.class);
        }
    }

    public final void LIZ$1() {
        String str;
        C76696U8e LJJIII;
        TV3.LJIIL((ViewGroup) this.l0, new AqS179S0100000_13((C75145TeP) this.l2, 43));
        C16880lQ.LJIIL((ViewGroup) this.l1, new ACListenerS33S0100000_13((C75145TeP) this.l2, 2));
        InterfaceC75579TlP LJJJIL = C78886Uxe.LJJJIL(C8E.LJ());
        if (LJJJIL != null && (LJJIII = ((U8H) LJJJIL).LJJIII()) != null) {
            str = LJJIII.getLayoutId();
        } else {
            str = null;
        }
        int LIZ = (int) (LAV.LIZ(str) * ((ViewGroup) this.l0).getWidth());
        int i = (int) (LIZ * 0.375f);
        View findViewById = ((ViewGroup) this.l1).findViewById(R.id.cv5);
        if (findViewById != null) {
            C79004UzY.LJJJLZIJ(LIZ, LIZ, findViewById);
        }
        View findViewById2 = ((ViewGroup) this.l1).findViewById(R.id.cvl);
        if (findViewById2 != null) {
            C79004UzY.LJJJLZIJ(i, i, findViewById2);
        }
    }

    public final void LIZ$10() {
        U66 LLJILJILJ = ((U64) this.l0).LLJILJILJ();
        C76012TsO c76012TsO = (C76012TsO) this.l1;
        LeaveChannelData.Builder builder = new LeaveChannelData.Builder();
        builder.setNotSuggestToUid(c76012TsO.LIZIZ);
        builder.setLeaveSource(LinkFinishReason.Companion.stateToString(1));
        builder.setLeaveReason(1);
        LLJILJILJ.LLLZZ(builder.build(), new U6L((InterfaceC75414Tik) this.l2));
    }

    public final void LIZ$11() {
        U66 LLJILJILJ = ((U64) this.l0).LLJILJILJ();
        C75993Ts5 c75993Ts5 = (C75993Ts5) this.l1;
        LiveRoomUser.Builder builder = new LiveRoomUser.Builder();
        builder.setRoomId(c75993Ts5.LIZ);
        builder.setUserId(c75993Ts5.LIZIZ);
        builder.setLinkMicId(c75993Ts5.LIZLLL);
        LiveRoomUser build = builder.build();
        C75993Ts5 c75993Ts52 = (C75993Ts5) this.l1;
        PermitApplyData.Builder builder2 = new PermitApplyData.Builder(build);
        builder2.setPermitStatus(c75993Ts52.LJ);
        builder2.setCustom(c75993Ts52.LJI);
        LLJILJILJ.LLLZIL(builder2.build(), new U6M((InterfaceC75414Tik) this.l2));
    }

    public final void LIZ$12() {
        U7F u7f = (U7F) this.l0;
        CopyOnWriteArrayList<InterfaceC76622U5i> copyOnWriteArrayList = u7f.LJIILJJIL;
        LinkMessage linkMessage = (LinkMessage) this.l1;
        ReplyInviteData replyInviteData = (ReplyInviteData) this.l2;
        Iterator<InterfaceC76622U5i> it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            List<UB4> LJJLIIIJLJLI = it.next().LJJLIIIJLJLI(u7f);
            if (LJJLIIIJLJLI != null) {
                for (UB4 ub4 : LJJLIIIJLJLI) {
                    if (ub4 != null) {
                        ub4.LIZJ(replyInviteData.getInviter().getUserId(), linkMessage);
                    }
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LIZ$13() {
        U7F u7f = (U7F) this.l0;
        CopyOnWriteArrayList<InterfaceC76622U5i> copyOnWriteArrayList = u7f.LJIILJJIL;
        LinkUser linkUser = (LinkUser) this.l1;
        IMessage iMessage = (IMessage) this.l2;
        Iterator<InterfaceC76622U5i> it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            LinkMessage linkMessage = (LinkMessage) iMessage;
            it.next().LJJJJJ(u7f, new InviteMessage(linkUser, null, 0 == true ? 1 : 0, new CustomLinkMessage(linkMessage.scene, null, new ExtraDataWrapper(null, linkMessage.inviteContent, linkMessage.expireTimestamp, linkMessage)), 0, 0 == true ? 1 : 0, 48, 0 == true ? 1 : 0));
        }
    }

    public final void LIZ$14() {
        U7F u7f = (U7F) this.l0;
        CopyOnWriteArrayList<InterfaceC76622U5i> copyOnWriteArrayList = u7f.LJIILJJIL;
        LinkUser linkUser = (LinkUser) this.l1;
        IMessage iMessage = (IMessage) this.l2;
        Iterator<InterfaceC76622U5i> it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            LinkMessage linkMessage = (LinkMessage) iMessage;
            it.next().LJLLILLLL(u7f, new ApplyMessage(linkUser, new CustomLinkMessage(linkMessage.scene, null, new ExtraDataWrapper(null, linkMessage.inviteContent, linkMessage.expireTimestamp, linkMessage))));
        }
    }

    public final void LIZ$15() {
        U7F u7f = (U7F) this.l0;
        CopyOnWriteArrayList<InterfaceC76622U5i> copyOnWriteArrayList = u7f.LJIILJJIL;
        LinkUser linkUser = (LinkUser) this.l1;
        IMessage iMessage = (IMessage) this.l2;
        Iterator<InterfaceC76622U5i> it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            LinkMessage linkMessage = (LinkMessage) iMessage;
            it.next().LLILLIZIL(u7f, new CancelApplyMessage(linkUser, new CustomLinkMessage(linkMessage.scene, null, new ExtraDataWrapper(null, linkMessage.cancelContent, linkMessage.expireTimestamp, linkMessage))));
        }
    }

    public final void LIZ$16() {
        U7F u7f = (U7F) this.l0;
        CopyOnWriteArrayList<InterfaceC76622U5i> copyOnWriteArrayList = u7f.LJIILJJIL;
        LinkUser linkUser = (LinkUser) this.l1;
        IMessage iMessage = (IMessage) this.l2;
        Iterator<InterfaceC76622U5i> it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            LinkMessage linkMessage = (LinkMessage) iMessage;
            it.next().LJJLIIIJJI(u7f, new CancelInviteMessage(linkUser, new CustomLinkMessage(linkMessage.scene, null, new ExtraDataWrapper(null, linkMessage.cancelContent, linkMessage.expireTimestamp, linkMessage))));
        }
    }

    public final void LIZ$17() {
        U7F u7f = (U7F) this.l0;
        CopyOnWriteArrayList<InterfaceC76622U5i> copyOnWriteArrayList = u7f.LJIILJJIL;
        LinkUser linkUser = (LinkUser) this.l1;
        IMessage iMessage = (IMessage) this.l2;
        Iterator<InterfaceC76622U5i> it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            LinkMessage linkMessage = (LinkMessage) iMessage;
            it.next().LJLILLLLZI(u7f, new DestroyChannelMessage(linkUser, new CustomLinkMessage(linkMessage.scene, null, new ExtraDataWrapper(null, linkMessage.closeContent, linkMessage.expireTimestamp, linkMessage))));
        }
    }

    public final void LIZ$18() {
        U7F u7f = (U7F) this.l0;
        CopyOnWriteArrayList<InterfaceC76622U5i> copyOnWriteArrayList = u7f.LJIILJJIL;
        LinkUser linkUser = (LinkUser) this.l1;
        IMessage iMessage = (IMessage) this.l2;
        Iterator<InterfaceC76622U5i> it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            LinkMessage linkMessage = (LinkMessage) iMessage;
            it.next().LJLILLLLZI(u7f, new DestroyChannelMessage(linkUser, new CustomLinkMessage(linkMessage.scene, null, new ExtraDataWrapper(null, linkMessage.leaveContent, linkMessage.expireTimestamp, linkMessage))));
        }
    }

    public final void LIZ$19() {
        U7F u7f = (U7F) this.l0;
        CopyOnWriteArrayList<InterfaceC76622U5i> copyOnWriteArrayList = u7f.LJIILJJIL;
        LinkUser linkUser = (LinkUser) this.l1;
        IMessage iMessage = (IMessage) this.l2;
        Iterator<InterfaceC76622U5i> it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            LinkMessage linkMessage = (LinkMessage) iMessage;
            it.next().LLIL(u7f, new CreateChannelMessage(linkUser, new CustomLinkMessage(linkMessage.scene, null, new ExtraDataWrapper(null, linkMessage.enterContent, linkMessage.expireTimestamp, linkMessage))));
        }
    }

    public final void LIZ$2() {
        View view;
        ViewGroup viewGroup;
        C74719TUd c74719TUd = (C74719TUd) this.l0;
        View view2 = (View) this.l1;
        ViewGroup viewGroup2 = (ViewGroup) this.l2;
        c74719TUd.getClass();
        Object parent = viewGroup2.getParent();
        if (!(parent instanceof ViewGroup) || (view = (View) parent) == null) {
            return;
        }
        ViewParent parent2 = view.getParent();
        if (!(parent2 instanceof ViewGroup) || (viewGroup = (ViewGroup) parent2) == null) {
            return;
        }
        int LJI = (int) c74719TUd.LJI();
        final int stroke_width = LivesdkLinkmicFloatWindowOptimizeSetting.INSTANCE.getSTROKE_WIDTH();
        final float f = LJI;
        viewGroup2.setOutlineProvider(new ViewOutlineProvider(f, stroke_width) { // from class: X.0jH
            public final float LIZ;
            public final int LIZIZ;

            {
                this.LIZ = f;
                this.LIZIZ = stroke_width;
            }

            @Override // android.view.ViewOutlineProvider
            public final void getOutline(View view3, Outline outline) {
                outline.setRoundRect(new Rect(view3.getPaddingLeft() - this.LIZIZ, view3.getPaddingTop() - this.LIZIZ, (view3.getWidth() - view3.getPaddingRight()) + this.LIZIZ, (view3.getHeight() - view3.getPaddingBottom()) + this.LIZIZ), this.LIZ);
            }
        });
        viewGroup2.setClipToOutline(true);
        Iterator<View> it = C78924UyG.LIZLLL(viewGroup2).iterator();
        while (true) {
            IDObjectS0S0101000 iDObjectS0S0101000 = (IDObjectS0S0101000) it;
            if (iDObjectS0S0101000.hasNext()) {
                C15580jK.LIZIZ((int) c74719TUd.LJI(), (View) iDObjectS0S0101000.next());
            } else {
                c74719TUd.LJLILLLLZI.LIZ(c74719TUd.LJI());
                int stroke_width2 = LivesdkLinkmicFloatWindowOptimizeSetting.INSTANCE.getSTROKE_WIDTH() / 2;
                int i = stroke_width2 * 2;
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(viewGroup2.getWidth() + i, viewGroup2.getHeight() + i);
                layoutParams.leftMargin = view.getLeft() - stroke_width2;
                layoutParams.topMargin = view.getTop() - stroke_width2;
                view2.setLayoutParams(layoutParams);
                view2.setBackground(c74719TUd.LJIILJJIL(view2));
                C87277YNd.LJJIJ(view2);
                TV3.LJIILIIL(-1, view2, viewGroup);
                c74719TUd.LJIIJ().put(view2, viewGroup2);
                return;
            }
        }
    }

    public final void LIZ$3() {
        Integer num;
        InterfaceC24140x8 interfaceC24140x8;
        InterfaceC21020s6 liveStream;
        LiveCore liveCore;
        LiveCore.Builder builder;
        InterfaceC24140x8 interfaceC24140x82;
        InterfaceC21020s6 liveStream2;
        LiveCore liveCore2;
        LiveCore.Builder builder2;
        InterfaceC74605TPt interfaceC74605TPt = ((MultiGuestV3GuestPresenter) this.l0).liveVideoClient;
        Integer num2 = null;
        if ((interfaceC74605TPt instanceof InterfaceC24140x8) && (interfaceC24140x82 = (InterfaceC24140x8) interfaceC74605TPt) != null && (liveStream2 = interfaceC24140x82.getLiveStream()) != null && (liveCore2 = liveStream2.getLiveCore()) != null && (builder2 = liveCore2.getBuilder()) != null) {
            num = Integer.valueOf(builder2.getCaptureAdaptedWidth());
        } else {
            num = null;
        }
        InterfaceC74605TPt interfaceC74605TPt2 = ((MultiGuestV3GuestPresenter) this.l0).liveVideoClient;
        if ((interfaceC74605TPt2 instanceof InterfaceC24140x8) && (interfaceC24140x8 = (InterfaceC24140x8) interfaceC74605TPt2) != null && (liveStream = interfaceC24140x8.getLiveStream()) != null && (liveCore = liveStream.getLiveCore()) != null && (builder = liveCore.getBuilder()) != null) {
            num2 = Integer.valueOf(builder.getCaptureAdaptedHeight());
        }
        ((C0WF) this.l2).LJJ(C0WE.LIZJ(((SurfaceView) this.l1).getWidth(), ((SurfaceView) this.l1).getHeight(), num, num2, false));
    }

    public final void LIZ$4() {
        U4R.LIZLLL("Linker", "Permit join group message callback for business.");
        CopyOnWriteArrayList<InterfaceC76622U5i> copyOnWriteArrayList = ((U7T) this.l0).LJII;
        PermitJoinGroupContent permitJoinGroupContent = (PermitJoinGroupContent) this.l1;
        IMessage iMessage = (IMessage) this.l2;
        Iterator<InterfaceC76622U5i> it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            InterfaceC76622U5i next = it.next();
            int i = permitJoinGroupContent.type;
            if (i == 102) {
                LinkLayerMessage linkLayerMessage = (LinkLayerMessage) iMessage;
                next.LJJJ(new ReplyInviteGroupMessage(linkLayerMessage, permitJoinGroupContent.agreeStatus, permitJoinGroupContent.approver, linkLayerMessage.bizContent));
            } else if (i == 100) {
                LinkLayerMessage linkLayerMessage2 = (LinkLayerMessage) iMessage;
                next.LL(new PermitApplyGroupMessage(linkLayerMessage2, permitJoinGroupContent.agreeStatus, permitJoinGroupContent.approver, linkLayerMessage2.bizContent));
            }
        }
    }

    public final void LIZ$5() {
        U4R.LIZLLL("Linker", "Leave join group message callback for business.");
        CopyOnWriteArrayList<InterfaceC76622U5i> copyOnWriteArrayList = ((U7T) this.l0).LJII;
        IMessage iMessage = (IMessage) this.l1;
        GroupPlayer groupPlayer = (GroupPlayer) this.l2;
        Iterator<InterfaceC76622U5i> it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            it.next().LJLIL(new LeaveGroupMessage((LinkLayerMessage) iMessage, groupPlayer));
        }
    }

    public final void LIZ$6() {
        InterfaceC65784Pro<Boolean> interfaceC65784Pro;
        U66 LLJILJILJ = ((U64) this.l0).LLJILJILJ();
        C76179Tv5 c76179Tv5 = (C76179Tv5) this.l1;
        ApplyData.Builder builder = new ApplyData.Builder();
        builder.setExpireTimeInSeconds(c76179Tv5.LJ);
        LiveRoomUser.Builder builder2 = new LiveRoomUser.Builder();
        builder2.setRoomId(c76179Tv5.LIZ);
        builder2.setUserId(c76179Tv5.LIZIZ);
        builder.setTargetUser(builder2.build());
        builder.setCustom(c76179Tv5.LJI);
        ApplyData build = builder.build();
        U6H u6h = new U6H((InterfaceC75414Tik) this.l2);
        C75745To5 c75745To5 = ((U6S) ((U64) this.l0).LJLLILLLL.getValue()).LIZ.LJLL;
        if (c75745To5 == null || (interfaceC65784Pro = c75745To5.LJIIIIZZ) == null) {
            interfaceC65784Pro = C76641U6b.LJLIL;
        }
        LLJILJILJ.LLLZLZ(build, u6h, interfaceC65784Pro);
    }

    public final void LIZ$7() {
        U66 LLJILJILJ = ((U64) this.l0).LLJILJILJ();
        C76002TsE c76002TsE = (C76002TsE) this.l1;
        CancelApplyData.Builder builder = new CancelApplyData.Builder();
        builder.setReason(c76002TsE.LIZJ);
        LiveRoomUser.Builder builder2 = new LiveRoomUser.Builder();
        builder2.setRoomId(c76002TsE.LIZ);
        builder2.setUserId(c76002TsE.LIZIZ);
        builder.setTargetUser(builder2.build());
        LLJILJILJ.h(builder.build(), new U6I((InterfaceC75414Tik) this.l2));
    }

    public final void LIZ$8() {
        U66 LLJILJILJ = ((U64) this.l0).LLJILJILJ();
        C76001TsD c76001TsD = (C76001TsD) this.l1;
        LiveRoomUser.Builder builder = new LiveRoomUser.Builder();
        builder.setRoomId(c76001TsD.LIZ);
        builder.setUserId(c76001TsD.LIZIZ);
        LiveRoomUser build = builder.build();
        C76001TsD c76001TsD2 = (C76001TsD) this.l1;
        CancelInviteData.Builder builder2 = new CancelInviteData.Builder(build, -1L);
        builder2.setReason(c76001TsD2.LIZLLL);
        builder2.setCustom(c76001TsD2.LJ);
        LLJILJILJ.LLLLZ(builder2.build(), new U6J((InterfaceC75414Tik) this.l2));
    }

    public final void LIZ$9() {
        InterfaceC65784Pro<Boolean> interfaceC65784Pro;
        U66 LLJILJILJ = ((U64) this.l0).LLJILJILJ();
        C76180Tv6 c76180Tv6 = (C76180Tv6) this.l1;
        LiveRoomUser.Builder builder = new LiveRoomUser.Builder();
        builder.setRoomId(c76180Tv6.LIZ);
        builder.setUserId(c76180Tv6.LIZIZ);
        LiveRoomUser build = builder.build();
        C76180Tv6 c76180Tv62 = (C76180Tv6) this.l1;
        InviteData.Builder builder2 = new InviteData.Builder(build);
        builder2.setMaxPosition(4);
        builder2.setExpireTimeInSeconds(c76180Tv62.LJFF);
        builder2.setCustom(c76180Tv62.LJII);
        InviteData build2 = builder2.build();
        U6K u6k = new U6K((InterfaceC75414Tik) this.l2);
        C75745To5 c75745To5 = ((U6S) ((U64) this.l0).LJLLILLLL.getValue()).LIZ.LJLL;
        if (c75745To5 == null || (interfaceC65784Pro = c75745To5.LJIIIIZZ) == null) {
            interfaceC65784Pro = C76642U6c.LJLIL;
        }
        LLJILJILJ.LLLLLLLZIL(build2, u6k, interfaceC65784Pro);
    }

    public static final void run$0(ARunnableS24S0300000_13 aRunnableS24S0300000_13) {
        boolean LIZ;
        try {
            ((C76997UJt) aRunnableS24S0300000_13.l0).LIZIZ = ((((View) aRunnableS24S0300000_13.l1).getMeasuredHeight() - ((View) aRunnableS24S0300000_13.l2).getY()) - ((View) aRunnableS24S0300000_13.l2).getMeasuredHeight()) - ((C76997UJt) aRunnableS24S0300000_13.l0).LIZ;
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$1(ARunnableS24S0300000_13 aRunnableS24S0300000_13) {
        boolean LIZ;
        try {
            aRunnableS24S0300000_13.LIZ$0();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$10(ARunnableS24S0300000_13 aRunnableS24S0300000_13) {
        boolean LIZ;
        int i;
        try {
            U1X u1x = (U1X) aRunnableS24S0300000_13.l0;
            C47121t6 c47121t6 = u1x.LJZI;
            if (c47121t6 != null) {
                i = c47121t6.getWidth();
            } else {
                i = 0;
            }
            u1x.LJLILLLLZI = i;
            ViewGroup.LayoutParams layoutParams = (ViewGroup.LayoutParams) aRunnableS24S0300000_13.l1;
            if (layoutParams != null) {
                layoutParams.width = 0;
            }
            ((C47121t6) aRunnableS24S0300000_13.l2).setLayoutParams(layoutParams);
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$11(ARunnableS24S0300000_13 aRunnableS24S0300000_13) {
        boolean LIZ;
        try {
            aRunnableS24S0300000_13.LIZ$4();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$12(ARunnableS24S0300000_13 aRunnableS24S0300000_13) {
        boolean LIZ;
        try {
            U7T u7t = (U7T) aRunnableS24S0300000_13.l0;
            CopyOnWriteArrayList<InterfaceC76622U5i> copyOnWriteArrayList = u7t.LJII;
            LinkUser linkUser = (LinkUser) aRunnableS24S0300000_13.l1;
            IMessage iMessage = (IMessage) aRunnableS24S0300000_13.l2;
            Iterator<InterfaceC76622U5i> it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                it.next().LJLLILLLL(u7t, new ApplyMessage(linkUser, U7V.LJIILL((LinkLayerMessage) iMessage, null)));
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$13(ARunnableS24S0300000_13 aRunnableS24S0300000_13) {
        boolean LIZ;
        try {
            U7T u7t = (U7T) aRunnableS24S0300000_13.l0;
            CopyOnWriteArrayList<InterfaceC76622U5i> copyOnWriteArrayList = u7t.LJII;
            LinkUser linkUser = (LinkUser) aRunnableS24S0300000_13.l1;
            IMessage iMessage = (IMessage) aRunnableS24S0300000_13.l2;
            Iterator<InterfaceC76622U5i> it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                it.next().LLILLIZIL(u7t, new CancelApplyMessage(linkUser, U7V.LJIILL((LinkLayerMessage) iMessage, null)));
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$14(ARunnableS24S0300000_13 aRunnableS24S0300000_13) {
        boolean LIZ;
        try {
            U7T u7t = (U7T) aRunnableS24S0300000_13.l0;
            CopyOnWriteArrayList<InterfaceC76622U5i> copyOnWriteArrayList = u7t.LJII;
            LinkUser linkUser = (LinkUser) aRunnableS24S0300000_13.l1;
            IMessage iMessage = (IMessage) aRunnableS24S0300000_13.l2;
            Iterator<InterfaceC76622U5i> it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                it.next().LJJLIIIJJI(u7t, new CancelInviteMessage(linkUser, U7V.LJIILL((LinkLayerMessage) iMessage, null)));
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$15(ARunnableS24S0300000_13 aRunnableS24S0300000_13) {
        boolean LIZ;
        try {
            U7T u7t = (U7T) aRunnableS24S0300000_13.l0;
            CopyOnWriteArrayList<InterfaceC76622U5i> copyOnWriteArrayList = u7t.LJII;
            LinkUser linkUser = (LinkUser) aRunnableS24S0300000_13.l1;
            IMessage iMessage = (IMessage) aRunnableS24S0300000_13.l2;
            Iterator<InterfaceC76622U5i> it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                it.next().LLIL(u7t, new CreateChannelMessage(linkUser, U7V.LJIILL((LinkLayerMessage) iMessage, null)));
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void run$16(ARunnableS24S0300000_13 aRunnableS24S0300000_13) {
        boolean LIZ;
        Map<String, byte[]> map;
        try {
            C32014ChO.LJFF(U7T.LJJJJI(939), "invite success");
            InterfaceC76768UAy interfaceC76768UAy = (InterfaceC76768UAy) aRunnableS24S0300000_13.l1;
            if (interfaceC76768UAy != null) {
                LinkMicCommonResp linkMicCommonResp = ((InviteResponse) aRunnableS24S0300000_13.l2).commonResp;
                String str = null;
                Object[] objArr = 0;
                if (linkMicCommonResp != null) {
                    map = linkMicCommonResp.extra;
                } else {
                    map = null;
                }
                interfaceC76768UAy.LIZIZ(new InviteResult(map, str, 2, objArr == true ? 1 : 0));
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void run$17(ARunnableS24S0300000_13 aRunnableS24S0300000_13) {
        boolean LIZ;
        Map<String, byte[]> map;
        try {
            C32014ChO.LJFF(U7T.LJJJJI(994), "moderatorInvite success");
            InterfaceC76768UAy interfaceC76768UAy = (InterfaceC76768UAy) aRunnableS24S0300000_13.l1;
            if (interfaceC76768UAy != null) {
                LinkMicCommonResp linkMicCommonResp = ((InviteResponse) aRunnableS24S0300000_13.l2).commonResp;
                String str = null;
                Object[] objArr = 0;
                if (linkMicCommonResp != null) {
                    map = linkMicCommonResp.extra;
                } else {
                    map = null;
                }
                interfaceC76768UAy.LIZIZ(new InviteResult(map, str, 2, objArr == true ? 1 : 0));
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$18(ARunnableS24S0300000_13 aRunnableS24S0300000_13) {
        boolean LIZ;
        try {
            aRunnableS24S0300000_13.LIZ$5();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$19(ARunnableS24S0300000_13 aRunnableS24S0300000_13) {
        boolean LIZ;
        try {
            U7T u7t = (U7T) aRunnableS24S0300000_13.l0;
            CopyOnWriteArrayList<InterfaceC76622U5i> copyOnWriteArrayList = u7t.LJII;
            LinkUser linkUser = (LinkUser) aRunnableS24S0300000_13.l1;
            IMessage iMessage = (IMessage) aRunnableS24S0300000_13.l2;
            Iterator<InterfaceC76622U5i> it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                it.next().LJIJJ(u7t, new LeaveMessage(linkUser, U7V.LJIILL((LinkLayerMessage) iMessage, null)));
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$2(ARunnableS24S0300000_13 aRunnableS24S0300000_13) {
        boolean LIZ;
        try {
            aRunnableS24S0300000_13.LIZ$1();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$20(ARunnableS24S0300000_13 aRunnableS24S0300000_13) {
        boolean LIZ;
        try {
            aRunnableS24S0300000_13.LIZ$6();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$21(ARunnableS24S0300000_13 aRunnableS24S0300000_13) {
        boolean LIZ;
        try {
            aRunnableS24S0300000_13.LIZ$7();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$22(ARunnableS24S0300000_13 aRunnableS24S0300000_13) {
        boolean LIZ;
        try {
            aRunnableS24S0300000_13.LIZ$8();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$23(ARunnableS24S0300000_13 aRunnableS24S0300000_13) {
        boolean LIZ;
        try {
            aRunnableS24S0300000_13.LIZ$9();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$24(ARunnableS24S0300000_13 aRunnableS24S0300000_13) {
        boolean LIZ;
        try {
            aRunnableS24S0300000_13.LIZ$10();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$25(ARunnableS24S0300000_13 aRunnableS24S0300000_13) {
        boolean LIZ;
        try {
            List<U62> list = ((U64) aRunnableS24S0300000_13.l0).LJLJLJ;
            List<LinkUser> list2 = (List) aRunnableS24S0300000_13.l1;
            List<LinkUser> list3 = (List) aRunnableS24S0300000_13.l2;
            Iterator it = ((CopyOnWriteArrayList) list).iterator();
            while (it.hasNext()) {
                ((U62) it.next()).LJIIIIZZ(list2, list3);
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$26(ARunnableS24S0300000_13 aRunnableS24S0300000_13) {
        boolean LIZ;
        try {
            aRunnableS24S0300000_13.LIZ$11();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$27(ARunnableS24S0300000_13 aRunnableS24S0300000_13) {
        boolean LIZ;
        try {
            ((U64) aRunnableS24S0300000_13.l0).LLJILJILJ().LLLLLLZ((C76113Tu1) aRunnableS24S0300000_13.l1, new U6A((U64) aRunnableS24S0300000_13.l0, (InterfaceC75414Tik) aRunnableS24S0300000_13.l2));
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$28(ARunnableS24S0300000_13 aRunnableS24S0300000_13) {
        boolean LIZ;
        try {
            aRunnableS24S0300000_13.LIZ$12();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$29(ARunnableS24S0300000_13 aRunnableS24S0300000_13) {
        boolean LIZ;
        try {
            aRunnableS24S0300000_13.LIZ$13();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$3(ARunnableS24S0300000_13 aRunnableS24S0300000_13) {
        boolean LIZ;
        try {
            aRunnableS24S0300000_13.LIZ$2();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$30(ARunnableS24S0300000_13 aRunnableS24S0300000_13) {
        boolean LIZ;
        try {
            aRunnableS24S0300000_13.LIZ$14();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$31(ARunnableS24S0300000_13 aRunnableS24S0300000_13) {
        boolean LIZ;
        try {
            aRunnableS24S0300000_13.LIZ$15();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$32(ARunnableS24S0300000_13 aRunnableS24S0300000_13) {
        boolean LIZ;
        try {
            aRunnableS24S0300000_13.LIZ$16();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$33(ARunnableS24S0300000_13 aRunnableS24S0300000_13) {
        boolean LIZ;
        try {
            aRunnableS24S0300000_13.LIZ$17();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$34(ARunnableS24S0300000_13 aRunnableS24S0300000_13) {
        boolean LIZ;
        try {
            aRunnableS24S0300000_13.LIZ$18();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$35(ARunnableS24S0300000_13 aRunnableS24S0300000_13) {
        boolean LIZ;
        try {
            aRunnableS24S0300000_13.LIZ$19();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$36(ARunnableS24S0300000_13 aRunnableS24S0300000_13) {
        boolean LIZ;
        try {
            ((U8H) aRunnableS24S0300000_13.l0).LJIIL((View) aRunnableS24S0300000_13.l1, (InterfaceC88472Yns) aRunnableS24S0300000_13.l2);
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$37(ARunnableS24S0300000_13 aRunnableS24S0300000_13) {
        boolean LIZ;
        try {
            if (((C76929UHd) aRunnableS24S0300000_13.l0).isAttachedToWindow()) {
                ((TextView) aRunnableS24S0300000_13.l1).setTranslationX(0.0f);
                ((TextView) aRunnableS24S0300000_13.l1).setAlpha(1.0f);
                ((TextView) aRunnableS24S0300000_13.l1).setVisibility(8);
                ((ArrayList) ((C76929UHd) aRunnableS24S0300000_13.l0).LJLJL).remove((ViewPropertyAnimator) aRunnableS24S0300000_13.l2);
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$38(ARunnableS24S0300000_13 aRunnableS24S0300000_13) {
        boolean LIZ;
        try {
            ActivityC45651qj LIZ2 = C29306Beo.LIZ(((C77520Ubc) aRunnableS24S0300000_13.l0).LIZ);
            if (LIZ2 != null) {
                ((IWalletService) CN1.LIZ(IWalletService.class)).createRechargeDialogFragment(LIZ2, null, (Bundle) aRunnableS24S0300000_13.l1, (C77591Ucl) aRunnableS24S0300000_13.l2).show(LIZ2.getSupportFragmentManager(), "RechargeDialog");
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$39(ARunnableS24S0300000_13 aRunnableS24S0300000_13) {
        boolean LIZ;
        try {
            U4R.LIZLLL("RtcRoomMsgSuccessRateMonitor", "onCreate");
            C76671U7f c76671U7f = (C76671U7f) aRunnableS24S0300000_13.l0;
            c76671U7f.LIZIZ = (U66) aRunnableS24S0300000_13.l1;
            U7U u7u = (U7U) aRunnableS24S0300000_13.l2;
            c76671U7f.LIZJ = u7u;
            u7u.LJJJJIZL(c76671U7f);
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$4(ARunnableS24S0300000_13 aRunnableS24S0300000_13) {
        boolean LIZ;
        try {
            aRunnableS24S0300000_13.LIZ$3();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$40(ARunnableS24S0300000_13 aRunnableS24S0300000_13) {
        boolean LIZ;
        try {
            U66 u66 = (U66) aRunnableS24S0300000_13.l0;
            if (u66 != null) {
                JSONObject LJIJI = UC0.LJIJI(u66);
                long LIZIZ = C31012CFc.LIZIZ();
                long currentTimeMillis = System.currentTimeMillis();
                C76762UAs c76762UAs = (C76762UAs) aRunnableS24S0300000_13.l1;
                c76762UAs.LIZLLL.LIZIZ(new ARunnableS0S0400200_13(c76762UAs, (U66) aRunnableS24S0300000_13.l0, LJIJI, (InterfaceC88472Yns) aRunnableS24S0300000_13.l2, LIZIZ, currentTimeMillis, 2));
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$41(ARunnableS24S0300000_13 aRunnableS24S0300000_13) {
        C78392Upg c78392Upg = (C78392Upg) aRunnableS24S0300000_13.l0;
        InterfaceC78395Upj interfaceC78395Upj = (InterfaceC78395Upj) aRunnableS24S0300000_13.l2;
        c78392Upg.getClass();
        if (interfaceC78395Upj != null) {
            interfaceC78395Upj.LIZIZ();
        }
    }

    public static final void run$42(ARunnableS24S0300000_13 aRunnableS24S0300000_13) {
        ((C78391Upf) aRunnableS24S0300000_13.l0).LIZJ((C78368UpI) aRunnableS24S0300000_13.l1, (OrderInfo) aRunnableS24S0300000_13.l2);
    }

    public static final void run$43(ARunnableS24S0300000_13 aRunnableS24S0300000_13) {
        ((C78391Upf) aRunnableS24S0300000_13.l0).LIZIZ((IapPaymentMethod) aRunnableS24S0300000_13.l1, (C78368UpI) aRunnableS24S0300000_13.l2);
    }

    public static final void run$5(ARunnableS24S0300000_13 aRunnableS24S0300000_13) {
        boolean LIZ;
        C42951mN<C2A4> c42951mN;
        try {
            AnimatedDrawable2 animatedDrawable2 = (AnimatedDrawable2) aRunnableS24S0300000_13.l0;
            if (animatedDrawable2 != null) {
                animatedDrawable2.setVisible(false, false);
            }
            C16880lQ.LJLLLL((C2A4) aRunnableS24S0300000_13.l2, ((C76846UDy) aRunnableS24S0300000_13.l1).LIZIZ.LJJIJIL());
            if (MultiGuestFlyMicViewUsePoolSetting.INSTANCE.isEnable() && (c42951mN = ((C76846UDy) aRunnableS24S0300000_13.l1).LJIIIZ) != null) {
                c42951mN.LIZ((C2A4) aRunnableS24S0300000_13.l2);
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$6(ARunnableS24S0300000_13 aRunnableS24S0300000_13) {
        boolean LIZ;
        C42951mN<C2A4> c42951mN;
        try {
            C16880lQ.LJLLLL((C2A4) aRunnableS24S0300000_13.l1, (FrameLayout) aRunnableS24S0300000_13.l0);
            C16880lQ.LJLLLL((FrameLayout) aRunnableS24S0300000_13.l0, ((C76846UDy) aRunnableS24S0300000_13.l2).LIZIZ.LJJIJIL());
            if (MultiGuestFlyMicViewUsePoolSetting.INSTANCE.isEnable() && (c42951mN = ((C76846UDy) aRunnableS24S0300000_13.l2).LJIIIIZZ) != null) {
                c42951mN.LIZ((C2A4) aRunnableS24S0300000_13.l1);
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$7(ARunnableS24S0300000_13 aRunnableS24S0300000_13) {
        boolean LIZ;
        C42951mN<C2A4> c42951mN;
        try {
            FrameLayout frameLayout = (FrameLayout) aRunnableS24S0300000_13.l0;
            if (frameLayout != null) {
                C16880lQ.LJLLLL((C2A4) aRunnableS24S0300000_13.l1, frameLayout);
            }
            C16880lQ.LJLLLL((FrameLayout) aRunnableS24S0300000_13.l0, ((C76846UDy) aRunnableS24S0300000_13.l2).LIZIZ.LJJIJIL());
            if (MultiGuestFlyMicViewUsePoolSetting.INSTANCE.isEnable() && (c42951mN = ((C76846UDy) aRunnableS24S0300000_13.l2).LJIIIIZZ) != null) {
                c42951mN.LIZ((C2A4) aRunnableS24S0300000_13.l1);
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$8(ARunnableS24S0300000_13 aRunnableS24S0300000_13) {
        boolean LIZ;
        try {
            C29306Beo.LJI((C77557UcD) aRunnableS24S0300000_13.l0);
            C29306Beo.LJI((View) aRunnableS24S0300000_13.l1);
            ((LiveNewSpecialGiftWidget) aRunnableS24S0300000_13.l2).dataChannel.rv0(SpecialGiftComboVisibilityChannel.class, Boolean.FALSE);
            ((LiveNewSpecialGiftWidget) aRunnableS24S0300000_13.l2).LJLJJL = false;
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$9(ARunnableS24S0300000_13 aRunnableS24S0300000_13) {
        boolean LIZ;
        try {
            C29306Beo.LJI((C77557UcD) aRunnableS24S0300000_13.l0);
            C29306Beo.LJI((View) aRunnableS24S0300000_13.l1);
            ((LiveNewSpecialGiftWidget) aRunnableS24S0300000_13.l2).dataChannel.rv0(SpecialGiftComboVisibilityChannel.class, Boolean.FALSE);
            ((LiveNewSpecialGiftWidget) aRunnableS24S0300000_13.l2).LJLJJL = false;
        } finally {
            if (LIZ) {
            }
        }
    }

    public ARunnableS24S0300000_13(Object obj, Object obj2, Object obj3, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
        this.l2 = obj3;
    }

    public ARunnableS24S0300000_13(C78392Upg c78392Upg, IapPaymentMethod iapPaymentMethod, C78368UpI c78368UpI, List list, InterfaceC78395Upj interfaceC78395Upj, int i) {
        this.$t = i;
        this.l0 = c78392Upg;
        this.l1 = list;
        this.l2 = interfaceC78395Upj;
    }
}
