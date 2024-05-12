package Y;

import X.AbstractC029409q;
import X.ActivityC45651qj;
import X.B5G;
import X.B83;
import X.B9K;
import X.BAF;
import X.BEF;
import X.BVA;
import X.BWG;
import X.BY3;
import X.BZI;
import X.C03510Bv;
import X.C03880Dg;
import X.C04130Ef;
import X.C05170If;
import X.C05590Jv;
import X.C06040Lo;
import X.C0JT;
import X.C0N7;
import X.C15380j0;
import X.C15540jG;
import X.C15650jR;
import X.C16880lQ;
import X.C18230nb;
import X.C1A;
import X.C1CR;
import X.C1CT;
import X.C1EW;
import X.C1I;
import X.C28289B8j;
import X.C28341BAj;
import X.C28506BGs;
import X.C28705BOj;
import X.C28787BRn;
import X.C28906BWc;
import X.C28911BWh;
import X.C29306Beo;
import X.C29320Bf2;
import X.C29324Bf6;
import X.C29325Bf7;
import X.C29326Bf8;
import X.C29364Bfk;
import X.C29374Bfu;
import X.C29494Bhq;
import X.C29552Bim;
import X.C29564Biy;
import X.C29682Bks;
import X.C29683Bkt;
import X.C29702BlC;
import X.C29834BnK;
import X.C30337BvR;
import X.C30459BxP;
import X.C30687C2p;
import X.C30695C2x;
import X.C30868C9o;
import X.C30954CCw;
import X.C30963CDf;
import X.C31073CHl;
import X.C31415CUp;
import X.C31684Cc4;
import X.C31689Cc9;
import X.C31847Ceh;
import X.C32364Cn2;
import X.C32566CqI;
import X.C32567CqJ;
import X.C32570CqM;
import X.C40241i0;
import X.C40581iY;
import X.C41051jJ;
import X.C47061t0;
import X.C47071t1;
import X.C65300Pk0;
import X.C68322mC;
import X.C73969T1h;
import X.C74726TUk;
import X.C75017TcL;
import X.C75505TkD;
import X.C75536Tki;
import X.C75642TmQ;
import X.C75648TmW;
import X.C75770ToU;
import X.C79146V4k;
import X.C7N;
import X.CC4;
import X.CCG;
import X.CDR;
import X.CJR;
import X.CJW;
import X.CL8;
import X.CN1;
import X.CQ1;
import X.CQ3;
import X.CQO;
import X.CQQ;
import X.CU2;
import X.CUU;
import X.CUW;
import X.CVC;
import X.EnumC29835BnL;
import X.EnumC74778TWk;
import X.EnumC75692TnE;
import X.InterfaceC06390Mx;
import X.InterfaceC28707BOl;
import X.InterfaceC29405BgP;
import X.InterfaceC30237Btp;
import X.InterfaceC30442Bx8;
import X.InterfaceC31687Cc7;
import X.InterfaceC31710CcU;
import X.J9A;
import X.TZQ;
import X.X1D;
import android.animation.AnimatorSet;
import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.ICommentService;
import com.bytedance.android.live.actionhandler.IActionHandlerService;
import com.bytedance.android.live.base.model.emoji.EmoteModel;
import com.bytedance.android.live.base.model.user.FollowInfo;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.broadcast.model.PopMsgContainer;
import com.bytedance.android.live.browser.IBrowserService;
import com.bytedance.android.live.browser.IHybridContainerService;
import com.bytedance.android.live.design.app.LiveDialog;
import com.bytedance.android.live.function.IRoomFunctionService;
import com.bytedance.android.live.gift.IGiftService;
import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.live.liveinteract.api.LinkInRoomAnchorInviteGuestEvent;
import com.bytedance.android.live.liveinteract.api.LinkInRoomAnchorPermitGuestEvent;
import com.bytedance.android.live.liveinteract.api.dataholder.LinkCrossRoomDataHolder;
import com.bytedance.android.live.liveinteract.multihost.biz.quickpairing.RandomLinkMicManager;
import com.bytedance.android.live.microom.IMicRoomService;
import com.bytedance.android.live.publicscreen.impl.GreetingReceivedEvent;
import com.bytedance.android.live.slot.BottomLeftSlotWidget;
import com.bytedance.android.live.slot.IIconSlot;
import com.bytedance.android.livesdk.broadcast.preview.widget.notify.PreviewCommonNotifyWidget;
import com.bytedance.android.livesdk.broadcast.trymode.TryModeBroadcastFragment;
import com.bytedance.android.livesdk.broadcast.video.LiveBroadcastFragment;
import com.bytedance.android.livesdk.broadcast.video.VideoWidget;
import com.bytedance.android.livesdk.broadcast.voicechat.VoiceChatBroadcastFragment;
import com.bytedance.android.livesdk.chatroom.event.ISendCommentEvent;
import com.bytedance.android.livesdk.chatroom.model.LatestBanRecordInfo;
import com.bytedance.android.livesdk.chatroom.viewmodule.QuickCommentWidget;
import com.bytedance.android.livesdk.dataChannel.OpenCoHostEvent;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.impl.revenue.starcomment.manage.AudienceStarCommentManageDialog;
import com.bytedance.android.livesdk.impl.revenue.subscription.ui.SubscriptionCommunityFragment;
import com.bytedance.android.livesdk.interaction.AudienceInteractionFeaturesDialog;
import com.bytedance.android.livesdk.interaction.poll.selectpoll.SelectPollViewModel;
import com.bytedance.android.livesdk.interaction.poll.selectpoll.widget.GiftSelectPollWidget;
import com.bytedance.android.livesdk.interaction.poll.ui.GiftPollWarnDialog;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicMultiGuestV3MaskAvatarSizeTestSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveAudienceLinkmicLowestAgeSetting;
import com.bytedance.android.livesdk.livesetting.subscription.SubscribeGoalsLynxUrlSetting;
import com.bytedance.android.livesdk.model.Gift;
import com.bytedance.android.livesdk.model.message.GiftCollectionUpdateMessage;
import com.bytedance.android.livesdk.model.message.LinkMicAnchorGuideMessage;
import com.bytedance.android.livesdk.model.message.LinkMicAudienceNoticeMessage;
import com.bytedance.android.livesdk.model.message.PollOptionInfo;
import com.bytedance.android.livesdk.model.message.PunishEventInfo;
import com.bytedance.android.livesdk.model.message.Question;
import com.bytedance.android.livesdk.model.message.battle.BattleNoticeRuleGuide;
import com.bytedance.android.livesdk.qa.QAApi;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.model.live.debug.Answer;
import com.bytedance.android.livesdkapi.host.IHostAction;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.ies.sdk.widgets.ConstraintProperty;
import com.bytedance.ies.sdk.widgets.LayeredElementContext;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.zhiliaoapp.musically.R;
import defpackage.b0;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS171S0100000_5;
import kotlin.jvm.internal.AqS94S0300000_5;
import kotlin.jvm.internal.o;
import webcast.api.sub.SubGoal;

/* loaded from: classes6.dex */
public class ACListenerS31S0300000_5 implements View.OnClickListener {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.$t) {
            case 0:
                onClick$0(this, view);
                return;
            case 1:
                onClick$1(this, view);
                return;
            case 2:
                onClick$2(this, view);
                return;
            case 3:
                onClick$3(this, view);
                return;
            case 4:
                onClick$4(this, view);
                return;
            case 5:
                onClick$5(this, view);
                return;
            case 6:
                onClick$6(this, view);
                return;
            case 7:
                onClick$7(this, view);
                return;
            case 8:
                onClick$8(this, view);
                return;
            case 9:
                onClick$9(this, view);
                return;
            case 10:
                onClick$10(this, view);
                return;
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                onClick$11(this, view);
                return;
            case 12:
                onClick$12(this, view);
                return;
            case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                onClick$13(this, view);
                return;
            case 14:
                onClick$14(this, view);
                return;
            case 15:
                onClick$15(this, view);
                return;
            case LiveAudienceLinkmicLowestAgeSetting.DEFAULT /* 16 */:
                onClick$16(this, view);
                return;
            case 17:
                onClick$17(this, view);
                return;
            case 18:
                onClick$18(this, view);
                return;
            case 19:
                onClick$19(this, view);
                return;
            case 20:
                onClick$20(this, view);
                return;
            case 21:
                onClick$21(this, view);
                return;
            case 22:
                onClick$22(this, view);
                return;
            case 23:
                onClick$23(this, view);
                return;
            case 24:
                onClick$24(this, view);
                return;
            case 25:
                onClick$25(this, view);
                return;
            case 26:
                onClick$26(this, view);
                return;
            case 27:
                onClick$27(this, view);
                return;
            case 28:
                onClick$28(this, view);
                return;
            case 29:
                onClick$29(this, view);
                return;
            case 30:
                onClick$30(this, view);
                return;
            case 31:
                onClick$31(this, view);
                return;
            case 32:
                onClick$32(this, view);
                return;
            case 33:
                onClick$33(this, view);
                return;
            case 34:
                onClick$34(this, view);
                return;
            case 35:
                onClick$35(this, view);
                return;
            case 36:
                onClick$36(this, view);
                return;
            case 37:
                onClick$37(this, view);
                return;
            case 38:
                onClick$38(this, view);
                return;
            case 39:
                onClick$39(this, view);
                return;
            case LinkMicMultiGuestV3MaskAvatarSizeTestSetting.SIZE_40 /* 40 */:
                onClick$40(this, view);
                return;
            case 41:
                onClick$41(this, view);
                return;
            default:
                return;
        }
    }

    public static final void onClick$0(ACListenerS31S0300000_5 aCListenerS31S0300000_5, View v) {
        C32567CqJ c32567CqJ = (C32567CqJ) aCListenerS31S0300000_5.l0;
        o.LJIIIIZZ(v, "v");
        c32567CqJ.LJLLLLLL(v, C29306Beo.LJJIIJ(((C32566CqI) aCListenerS31S0300000_5.l1).LJLJJI), (C32570CqM) aCListenerS31S0300000_5.l2);
    }

    public static final void onClick$1(ACListenerS31S0300000_5 aCListenerS31S0300000_5, View v) {
        C32567CqJ c32567CqJ = (C32567CqJ) aCListenerS31S0300000_5.l0;
        o.LJIIIIZZ(v, "v");
        c32567CqJ.LJLLLLLL(v, C29306Beo.LJJIIJ(((C32566CqI) aCListenerS31S0300000_5.l1).LJLJJI), (C32570CqM) aCListenerS31S0300000_5.l2);
    }

    public static final void onClick$10(ACListenerS31S0300000_5 aCListenerS31S0300000_5, View view) {
        ((LiveBroadcastFragment) aCListenerS31S0300000_5.l0)._$_findCachedViewById(R.id.epj).setVisibility(8);
        ((LiveBroadcastFragment) aCListenerS31S0300000_5.l0)._$_findCachedViewById(R.id.epj).setClickable(false);
        ((AnimatorSet) aCListenerS31S0300000_5.l1).cancel();
        ((C15540jG) aCListenerS31S0300000_5.l2).LIZ();
    }

    public static final void onClick$11(ACListenerS31S0300000_5 aCListenerS31S0300000_5, View view) {
        String string;
        String str;
        C30459BxP c30459BxP = (C30459BxP) aCListenerS31S0300000_5.l0;
        InterfaceC30237Btp interfaceC30237Btp = (InterfaceC30237Btp) aCListenerS31S0300000_5.l1;
        DataChannel dataChannel = (DataChannel) aCListenerS31S0300000_5.l2;
        c30459BxP.getClass();
        InterfaceC30442Bx8.LLLLLLLLL.LIZ(Boolean.FALSE);
        interfaceC30237Btp.LIZ(R.id.ldl).setVisibility(8);
        if (c30459BxP.LJLIL && c30459BxP.LJLJJI.isVideoEnable()) {
            VideoWidget videoWidget = c30459BxP.LJLJJI;
            boolean z = !videoWidget.mIsMirror;
            videoWidget.mIsMirror = z;
            videoWidget.mCameraCapture.LIZJ(z);
            VideoWidget videoWidget2 = c30459BxP.LJLJJI;
            Context context = videoWidget2.context;
            if (videoWidget2.mIsMirror) {
                string = context.getResources().getString(R.string.mjd);
            } else {
                string = context.getResources().getString(R.string.mjc);
            }
            C30868C9o.LJFF(context, string);
            BZI LIZ = C28787BRn.LIZ("pm_live_mirror_click");
            LIZ.LJIILLIIL(dataChannel);
            LIZ.LJIIIZ("live_take");
            LIZ.LJIIL("click");
            LIZ.LJIIJJI("live_take_detail");
            LIZ.LJIJJ(Integer.valueOf(c30459BxP.LJLJJI.mIsMirror ? 1 : 0), "is_open");
            LIZ.LJJIIJZLJL();
            c30459BxP.LIZ(false);
            C29702BlC LIZ2 = C18230nb.LIZ("ttlive_change_mirror");
            LIZ2.LJ("broadcast");
            if (c30459BxP.LJLJJI.mIsMirror) {
                str = "open";
            } else {
                str = "close";
            }
            LIZ2.LIZLLL("isMirror", str);
            LIZ2.LJIIIZ();
        }
    }

    public static final void onClick$12(ACListenerS31S0300000_5 aCListenerS31S0300000_5, View view) {
        ((VoiceChatBroadcastFragment) aCListenerS31S0300000_5.l0)._$_findCachedViewById(R.id.epj).setVisibility(8);
        ((VoiceChatBroadcastFragment) aCListenerS31S0300000_5.l0)._$_findCachedViewById(R.id.epj).setClickable(false);
        ((AnimatorSet) aCListenerS31S0300000_5.l1).cancel();
        ((C15540jG) aCListenerS31S0300000_5.l2).LIZ();
    }

    public static final void onClick$13(ACListenerS31S0300000_5 aCListenerS31S0300000_5, View view) {
        ((VoiceChatBroadcastFragment) aCListenerS31S0300000_5.l0)._$_findCachedViewById(R.id.epj).setVisibility(8);
        ((VoiceChatBroadcastFragment) aCListenerS31S0300000_5.l0)._$_findCachedViewById(R.id.epj).setClickable(false);
        ((AnimatorSet) aCListenerS31S0300000_5.l1).cancel();
        ((C15540jG) aCListenerS31S0300000_5.l2).LIZ();
    }

    public static final void onClick$14(ACListenerS31S0300000_5 aCListenerS31S0300000_5, View view) {
        ((C30695C2x) aCListenerS31S0300000_5.l0).LIZJ.setVisibility(8);
        ((C30695C2x) aCListenerS31S0300000_5.l0).LIZJ.setClickable(false);
        ((AnimatorSet) aCListenerS31S0300000_5.l1).cancel();
        ((C15540jG) aCListenerS31S0300000_5.l2).LIZ();
    }

    public static final void onClick$15(ACListenerS31S0300000_5 aCListenerS31S0300000_5, View view) {
        ((C30695C2x) aCListenerS31S0300000_5.l0).LIZJ.setVisibility(8);
        ((C30695C2x) aCListenerS31S0300000_5.l0).LIZJ.setClickable(false);
        ((AnimatorSet) aCListenerS31S0300000_5.l1).cancel();
        ((C15540jG) aCListenerS31S0300000_5.l2).LIZ();
    }

    public static final void onClick$16(ACListenerS31S0300000_5 aCListenerS31S0300000_5, View view) {
        View view2 = ((C30695C2x) aCListenerS31S0300000_5.l0).LJII;
        if (view2 != null) {
            view2.setAlpha(1.0f);
        }
        ((C30695C2x) aCListenerS31S0300000_5.l0).LIZJ.setVisibility(8);
        ((C30695C2x) aCListenerS31S0300000_5.l0).LIZJ.setClickable(false);
        ((AnimatorSet) aCListenerS31S0300000_5.l1).cancel();
        ((C15540jG) aCListenerS31S0300000_5.l2).LIZ();
    }

    public static final void onClick$17(ACListenerS31S0300000_5 aCListenerS31S0300000_5, View view) {
        String str;
        ISendCommentEvent.Sender sender;
        ((ICommentService) CN1.LIZ(ICommentService.class)).Lt0((QuickCommentWidget) aCListenerS31S0300000_5.l0);
        Room room = ((QuickCommentWidget) aCListenerS31S0300000_5.l0).LJLJI;
        if (room != null) {
            EmoteModel emoteModel = (EmoteModel) aCListenerS31S0300000_5.l1;
            CJR cjr = (CJR) aCListenerS31S0300000_5.l2;
            ArrayList arrayList = new ArrayList();
            arrayList.add(emoteModel);
            ICommentService iCommentService = (ICommentService) CN1.LIZ(ICommentService.class);
            long id = room.getId();
            CJW cjw = cjr.LJLILLLLZI;
            if (cjw != null) {
                str = cjw.LIZLLL;
            } else {
                str = null;
            }
            if (o.LJ(str, "1")) {
                sender = ISendCommentEvent.Sender.QUICKEMOTECOMMENT;
            } else {
                sender = ISendCommentEvent.Sender.QUICKCOMMENT;
            }
            iCommentService.qr(id, arrayList, sender);
        }
        QuickCommentWidget quickCommentWidget = (QuickCommentWidget) aCListenerS31S0300000_5.l0;
        if (!quickCommentWidget.isShowing()) {
            quickCommentWidget.LJLZ();
        } else {
            quickCommentWidget.animateHide();
        }
    }

    public static final void onClick$18(ACListenerS31S0300000_5 aCListenerS31S0300000_5, View view) {
        List<?> list = ((C31415CUp) ((AbstractC029409q) aCListenerS31S0300000_5.l0)).LJLIL;
        o.LJIIIIZZ(list, "adapter.items");
        if (list.indexOf(ListProtector.get((List) aCListenerS31S0300000_5.l1, ((AudienceStarCommentManageDialog) aCListenerS31S0300000_5.l2).LJLJJI)) >= 0) {
            Object obj = ListProtector.get((List) aCListenerS31S0300000_5.l1, ((AudienceStarCommentManageDialog) aCListenerS31S0300000_5.l2).LJLJJI);
            o.LJII(obj, "null cannot be cast to non-null type com.bytedance.android.livesdk.revenue.StarCommentData");
            ((CVC) obj).LJLLLL = false;
            AbstractC029409q abstractC029409q = (AbstractC029409q) aCListenerS31S0300000_5.l0;
            List<?> list2 = ((C31415CUp) abstractC029409q).LJLIL;
            o.LJIIIIZZ(list2, "adapter.items");
            abstractC029409q.notifyItemChanged(list2.indexOf(ListProtector.get((List) aCListenerS31S0300000_5.l1, ((AudienceStarCommentManageDialog) aCListenerS31S0300000_5.l2).LJLJJI)), "");
            AudienceStarCommentManageDialog audienceStarCommentManageDialog = (AudienceStarCommentManageDialog) aCListenerS31S0300000_5.l2;
            audienceStarCommentManageDialog.LJLJJI = (audienceStarCommentManageDialog.LJLJJI + 1) % ((List) aCListenerS31S0300000_5.l1).size();
            Object obj2 = ListProtector.get((List) aCListenerS31S0300000_5.l1, ((AudienceStarCommentManageDialog) aCListenerS31S0300000_5.l2).LJLJJI);
            o.LJII(obj2, "null cannot be cast to non-null type com.bytedance.android.livesdk.revenue.StarCommentData");
            ((CVC) obj2).LJLLLL = true;
            AudienceStarCommentManageDialog audienceStarCommentManageDialog2 = (AudienceStarCommentManageDialog) aCListenerS31S0300000_5.l2;
            Object obj3 = ListProtector.get((List) aCListenerS31S0300000_5.l1, audienceStarCommentManageDialog2.LJLJJI);
            o.LJII(obj3, "null cannot be cast to non-null type com.bytedance.android.livesdk.revenue.StarCommentData");
            audienceStarCommentManageDialog2.LJLJJL = ((CVC) obj3).LJLIL;
            AbstractC029409q abstractC029409q2 = (AbstractC029409q) aCListenerS31S0300000_5.l0;
            List<?> list3 = ((C31415CUp) abstractC029409q2).LJLIL;
            o.LJIIIIZZ(list3, "adapter.items");
            abstractC029409q2.notifyItemChanged(list3.indexOf(ListProtector.get((List) aCListenerS31S0300000_5.l1, ((AudienceStarCommentManageDialog) aCListenerS31S0300000_5.l2).LJLJJI)), "");
            TextView textView = (TextView) ((AudienceStarCommentManageDialog) aCListenerS31S0300000_5.l2)._$_findCachedViewById(R.id.jn8);
            Object obj4 = ListProtector.get((List) aCListenerS31S0300000_5.l1, ((AudienceStarCommentManageDialog) aCListenerS31S0300000_5.l2).LJLJJI);
            o.LJII(obj4, "null cannot be cast to non-null type com.bytedance.android.livesdk.revenue.StarCommentData");
            textView.setText(C15380j0.LJIILL(R.string.o59, Integer.valueOf(((AudienceStarCommentManageDialog) aCListenerS31S0300000_5.l2).LJLJJI + 1), Integer.valueOf(((List) aCListenerS31S0300000_5.l1).size()), Long.valueOf(((CVC) obj4).LIZ())));
            TextView textView2 = (TextView) ((AudienceStarCommentManageDialog) aCListenerS31S0300000_5.l2)._$_findCachedViewById(R.id.jn7);
            Object obj5 = ListProtector.get((List) aCListenerS31S0300000_5.l1, ((AudienceStarCommentManageDialog) aCListenerS31S0300000_5.l2).LJLJJI);
            o.LJII(obj5, "null cannot be cast to non-null type com.bytedance.android.livesdk.revenue.StarCommentData");
            textView2.setText(String.valueOf(((CVC) obj5).LJLLL));
            RecyclerView recyclerView = (RecyclerView) ((AudienceStarCommentManageDialog) aCListenerS31S0300000_5.l2)._$_findCachedViewById(R.id.isn);
            List<?> list4 = ((C31415CUp) ((AbstractC029409q) aCListenerS31S0300000_5.l0)).LJLIL;
            o.LJIIIIZZ(list4, "adapter.items");
            recyclerView.LJLIL(list4.indexOf(ListProtector.get((List) aCListenerS31S0300000_5.l1, ((AudienceStarCommentManageDialog) aCListenerS31S0300000_5.l2).LJLJJI)));
            if (((AudienceStarCommentManageDialog) aCListenerS31S0300000_5.l2).LJLJJI == ((List) aCListenerS31S0300000_5.l1).size() - 1) {
                ((AudienceStarCommentManageDialog) aCListenerS31S0300000_5.l2)._$_findCachedViewById(R.id.ec3).setScaleY(-1.0f);
            } else {
                ((AudienceStarCommentManageDialog) aCListenerS31S0300000_5.l2)._$_findCachedViewById(R.id.ec3).setScaleY(1.0f);
            }
        }
    }

    public static final void onClick$19(ACListenerS31S0300000_5 aCListenerS31S0300000_5, View view) {
        ((TryModeBroadcastFragment) aCListenerS31S0300000_5.l0)._$_findCachedViewById(R.id.epj).setVisibility(8);
        ((TryModeBroadcastFragment) aCListenerS31S0300000_5.l0)._$_findCachedViewById(R.id.epj).setClickable(false);
        ((AnimatorSet) aCListenerS31S0300000_5.l1).cancel();
        ((C15540jG) aCListenerS31S0300000_5.l2).LIZ();
    }

    public static final void onClick$2(ACListenerS31S0300000_5 aCListenerS31S0300000_5, View view) {
        Boolean bool;
        ActivityC45651qj LIZIZ;
        BEF bef;
        DataChannel dataChannel = ((AudienceInteractionFeaturesDialog) aCListenerS31S0300000_5.l0).dataChannel;
        if (dataChannel != null) {
            bool = Boolean.valueOf(C79146V4k.LJJJI(dataChannel));
        } else {
            bool = null;
        }
        if (C29306Beo.LJJIFFI(bool) && (bef = (BEF) aCListenerS31S0300000_5.l1) != null && bef.LJLJJI) {
            C30868C9o.LIZJ(R.string.o8z);
            return;
        }
        ((AudienceInteractionFeaturesDialog) aCListenerS31S0300000_5.l0).dismiss();
        C04130Ef.LJ(((AudienceInteractionFeaturesDialog) aCListenerS31S0300000_5.l0).dataChannel, "interaction_panel", false, false, false, null, 252);
        Context context = ((View) aCListenerS31S0300000_5.l2).getContext();
        if (context != null && (LIZIZ = C29306Beo.LIZIZ(context)) != null) {
            AudienceInteractionFeaturesDialog audienceInteractionFeaturesDialog = (AudienceInteractionFeaturesDialog) aCListenerS31S0300000_5.l0;
            InterfaceC06390Mx LIZ = CN1.LIZ(IRoomFunctionService.class);
            o.LJIIIIZZ(LIZ, "getService(IRoomFunctionService::class.java)");
            C06040Lo.LIZ((IRoomFunctionService) LIZ, "interaction_panel", LIZIZ, audienceInteractionFeaturesDialog.dataChannel, 24);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0030, code lost:
    
        if (r0 == null) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0032, code lost:
    
        r0 = "sslocal://webcast_lynxview_popup?url=https%3A%2F%2Flf16-gecko-source.tiktokcdn.com%2Fobj%2Fbyte-gurd-source-sg%2Ftiktok%2Ffe%2Flive%2Ftiktok_live_revenue_golden_envelope%2Fpages%2Fportal_go%2Ftemplate.js&gravity=bottom&height=684rpx&landscape_screen_size_as_portrait=1&bd_hybrid_monitor_bid=tiktok_live_revenue%2Ftreasure_box";
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x033d, code lost:
    
        if (r0 == null) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void onClick$20(Y.ACListenerS31S0300000_5 r15, android.view.View r16) {
        /*
            Method dump skipped, instructions count: 833
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.ACListenerS31S0300000_5.onClick$20(Y.ACListenerS31S0300000_5, android.view.View):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:107:0x01ca, code lost:
    
        if (kotlin.jvm.internal.o.LJ(r0, "sub_gift_anchor_remaining_present_notice") != false) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0171, code lost:
    
        if (kotlin.jvm.internal.o.LJ(r0, "unfinished_on_boarding") != false) goto L84;
     */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0224  */
    /* JADX WARN: Removed duplicated region for block: B:177:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:182:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x035f  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0362  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0374  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x0390  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x0396  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x03ec  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x03b5  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x0402  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x040f  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x0412  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x019c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void onClick$21(Y.ACListenerS31S0300000_5 r17, android.view.View r18) {
        /*
            Method dump skipped, instructions count: 1102
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.ACListenerS31S0300000_5.onClick$21(Y.ACListenerS31S0300000_5, android.view.View):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void onClick$22(ACListenerS31S0300000_5 aCListenerS31S0300000_5, View view) {
        ConstraintProperty constraintPropertyById;
        T t = ((C68322mC) aCListenerS31S0300000_5.l0).element;
        if (t == 0) {
            return;
        }
        GiftSelectPollWidget giftSelectPollWidget = (GiftSelectPollWidget) aCListenerS31S0300000_5.l1;
        SelectPollViewModel selectPollViewModel = giftSelectPollWidget.LJLLILLLL;
        if (selectPollViewModel != null) {
            Gift gift = (Gift) t;
            String voteOption = giftSelectPollWidget.LJLJI;
            o.LJIIIZ(voteOption, "voteOption");
            Room room = (Room) selectPollViewModel.LJLIL.kv0(RoomChannel.class);
            try {
                Boolean LIZJ = InterfaceC30442Bx8.LIZJ.LIZJ();
                o.LJIIIIZZ(LIZJ, "GIFT_POLL_WARN_DIALOG_SHOW.value");
                if (LIZJ.booleanValue()) {
                    GiftPollWarnDialog giftPollWarnDialog = new GiftPollWarnDialog();
                    giftPollWarnDialog.LJLIL = gift;
                    giftPollWarnDialog.LJLJI = selectPollViewModel;
                    giftPollWarnDialog.LJLILLLLZI = new AqS94S0300000_5(room, gift, selectPollViewModel, 14);
                    FragmentManager fragmentManager = (FragmentManager) selectPollViewModel.LJLIL.kv0(C29494Bhq.class);
                    if (fragmentManager != null) {
                        CCG.LIZJ(gift.id, selectPollViewModel.LJLIL);
                        giftPollWarnDialog.show(fragmentManager, "gift warn dialog");
                    }
                } else if (room != null) {
                    ((IGiftService) CN1.LIZ(IGiftService.class)).sendGiftPoll(gift.id, CC4.LIZIZ, room, selectPollViewModel.LJLIL, selectPollViewModel.LJLJI);
                }
            } catch (Throwable th) {
                selectPollViewModel.gv0().setValue(th);
            }
        }
        ((GiftSelectPollWidget) aCListenerS31S0300000_5.l1).LJZI(false);
        LayeredElementContext layeredElementContext = ((GiftSelectPollWidget) aCListenerS31S0300000_5.l1).getLayeredElementContext();
        if (layeredElementContext != null && (constraintPropertyById = layeredElementContext.getConstraintPropertyById(((GiftSelectPollWidget) aCListenerS31S0300000_5.l1).getId())) != null) {
            constraintPropertyById.alpha(0.3f);
        }
        if (((GiftSelectPollWidget) aCListenerS31S0300000_5.l1).dataChannel.kv0(RoomChannel.class) == null) {
            return;
        }
        GiftSelectPollWidget giftSelectPollWidget2 = (GiftSelectPollWidget) aCListenerS31S0300000_5.l1;
        String str = ((PollOptionInfo) aCListenerS31S0300000_5.l2).displayContent;
        giftSelectPollWidget2.getClass();
        o.LJIIIZ(str, "<set-?>");
        giftSelectPollWidget2.LJLJI = str;
        GiftSelectPollWidget giftSelectPollWidget3 = (GiftSelectPollWidget) aCListenerS31S0300000_5.l1;
        giftSelectPollWidget3.LJLJJI = ((PollOptionInfo) aCListenerS31S0300000_5.l2).optionIndex;
        giftSelectPollWidget3.LJLZ();
    }

    public static final void onClick$23(ACListenerS31S0300000_5 aCListenerS31S0300000_5, View view) {
        BWG bwg = (BWG) aCListenerS31S0300000_5.l0;
        Question question = (Question) aCListenerS31S0300000_5.l1;
        CQQ cqq = (CQQ) aCListenerS31S0300000_5.l2;
        bwg.getClass();
        if (BAF.LJFF(bwg.LJLLILLLL)) {
            C30868C9o.LIZJ(R.string.ksh);
            return;
        }
        if (C1I.LIZJ) {
            C47071t1 c47071t1 = new C47071t1(cqq.LIZ);
            c47071t1.LJIILL = true;
            c47071t1.LJIILLIIL(R.string.msd);
            c47071t1.LJFF(R.string.msc);
            c47071t1.LJIIIZ(R.string.msa, new IDcS93S0200000_5(bwg, question, 14));
            c47071t1.LJIIJJI(R.string.msb);
            LiveDialog LIZ = c47071t1.LIZ();
            if (new C03880Dg(2).LIZJ(300000, "com/bytedance/android/live/design/app/LiveDialog", "show", LIZ, new Object[0], "void", new C65300Pk0(false, "()V", "6286192542303261670")).LIZ) {
                return;
            }
            LIZ.show();
            return;
        }
        bwg.P(question);
    }

    public static final void onClick$24(ACListenerS31S0300000_5 aCListenerS31S0300000_5, View view) {
        int i;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("has_shown_sub_goal_intro_");
        LIZ.append(((C29374Bfu) B83.LIZ().LIZIZ()).getCurrentUserId());
        String LIZIZ = X1D.LIZIZ(LIZ);
        Boolean bool = (Boolean) ((IBrowserService) CN1.LIZ(IBrowserService.class)).Wn(((SubscriptionCommunityFragment) aCListenerS31S0300000_5.l0).getContext(), LIZIZ);
        String str = "1";
        if (bool == null) {
            SubscriptionCommunityFragment subscriptionCommunityFragment = (SubscriptionCommunityFragment) aCListenerS31S0300000_5.l0;
            Map<String, String> vl = subscriptionCommunityFragment.vl(null);
            C30954CCw c30954CCw = (C30954CCw) aCListenerS31S0300000_5.l2;
            vl.put("type", "sub_goal");
            SubGoal subGoal = c30954CCw.LIZLLL;
            if (subGoal == null || subGoal.goalCount <= 0) {
                str = CardStruct.IStatusCode.DEFAULT;
            }
            vl.put("has_ongoing_goal", str);
            subscriptionCommunityFragment.Dl(LIZIZ, vl);
        } else if (bool.booleanValue()) {
            SubGoal subGoal2 = (SubGoal) aCListenerS31S0300000_5.l1;
            if (subGoal2 != null && subGoal2.goalCount > 0) {
                C31847Ceh.LJIIIIZZ(((SubscriptionCommunityFragment) aCListenerS31S0300000_5.l0).getContext(), SubscribeGoalsLynxUrlSetting.INSTANCE.getAnchor_detail_popup(), ((SubscriptionCommunityFragment) aCListenerS31S0300000_5.l0).vl(null));
            } else {
                C31847Ceh.LJIIIIZZ(((SubscriptionCommunityFragment) aCListenerS31S0300000_5.l0).getContext(), SubscribeGoalsLynxUrlSetting.INSTANCE.getManagement_popup(), ((SubscriptionCommunityFragment) aCListenerS31S0300000_5.l0).vl(null));
            }
        } else {
            SubscriptionCommunityFragment subscriptionCommunityFragment2 = (SubscriptionCommunityFragment) aCListenerS31S0300000_5.l0;
            Map<String, String> vl2 = subscriptionCommunityFragment2.vl(null);
            C30954CCw c30954CCw2 = (C30954CCw) aCListenerS31S0300000_5.l2;
            vl2.put("type", "sub_goal");
            SubGoal subGoal3 = c30954CCw2.LIZLLL;
            if (subGoal3 == null || subGoal3.goalCount <= 0) {
                str = CardStruct.IStatusCode.DEFAULT;
            }
            vl2.put("has_ongoing_goal", str);
            subscriptionCommunityFragment2.Dl(LIZIZ, vl2);
        }
        SubscriptionCommunityFragment subscriptionCommunityFragment3 = (SubscriptionCommunityFragment) aCListenerS31S0300000_5.l0;
        SubGoal subGoal4 = (SubGoal) aCListenerS31S0300000_5.l1;
        if (subGoal4 != null && subGoal4.goalCount > 0) {
            i = 1;
        } else {
            i = 0;
        }
        subscriptionCommunityFragment3.getClass();
        BZI LIZ2 = C28787BRn.LIZ("livesdk_sub_goal_button_click");
        LIZ2.LJIILLIIL(subscriptionCommunityFragment3.dataChannel);
        C0JT.LIZJ(LIZ2, subscriptionCommunityFragment3.LLILLL, "show_entrance", i, "is_ongoing");
        ((SubscriptionCommunityFragment) aCListenerS31S0300000_5.l0).dismiss();
    }

    public static final void onClick$25(ACListenerS31S0300000_5 aCListenerS31S0300000_5, View view) {
        String str;
        BVA bva = (BVA) aCListenerS31S0300000_5.l0;
        ImageView imageView = (ImageView) aCListenerS31S0300000_5.l1;
        TextView textView = (TextView) aCListenerS31S0300000_5.l2;
        if (bva.LJLJJLL) {
            return;
        }
        bva.LJLJJLL = true;
        int i = !bva.LJLJJI.booleanValue() ? 1 : 0;
        if (!bva.LJLJJI.booleanValue()) {
            long j = bva.LJLJJL + 1;
            bva.LJLJJL = j;
            BVA.M(imageView, textView, R.drawable.d_k, R.attr.bnd, j);
        } else {
            long j2 = bva.LJLJJL - 1;
            bva.LJLJJL = j2;
            BVA.M(imageView, textView, R.drawable.cz7, R.attr.bnz, j2);
        }
        Question question = bva.LJLIL;
        if (Boolean.valueOf(!bva.LJLJJI.booleanValue()).booleanValue()) {
            str = "livesdk_qa_question_like";
        } else {
            str = "livesdk_qa_question_cancel_like";
        }
        BZI LIZ = C28787BRn.LIZ(str);
        LIZ.LJIIZILJ();
        LIZ.LJIJJ(Long.valueOf(question.questionId), "question_id");
        LIZ.LJIJJ(question.content, "question_content");
        LIZ.LJIJJ(Long.valueOf(question.user.getId()), "question_user_id");
        LIZ.LJIJJ("qa_list", "like_enter_from");
        LIZ.LJIJJ(bva.LJLJLJ.LLD, "qa_list_enter_from");
        LIZ.LJJIIJZLJL();
        bva.LJLJL.LIZ(C1EW.LIZ(((QAApi) C1A.LIZJ(QAApi.class)).likeQuestion(bva.LJLIL.questionId, i, 1)).LJJJLIIL(new AfS36S0101000_5(2, bva, 56), new AfS44S0300000_5(textView, bva, imageView, 13)));
    }

    public static final void onClick$26(ACListenerS31S0300000_5 aCListenerS31S0300000_5, View view) {
        View findViewById;
        View view2 = ((VoiceChatBroadcastFragment) aCListenerS31S0300000_5.l0).getView();
        if (view2 != null && (findViewById = view2.findViewById(R.id.fva)) != null) {
            findViewById.setAlpha(1.0f);
        }
        ((VoiceChatBroadcastFragment) aCListenerS31S0300000_5.l0)._$_findCachedViewById(R.id.epj).setVisibility(8);
        ((VoiceChatBroadcastFragment) aCListenerS31S0300000_5.l0)._$_findCachedViewById(R.id.epj).setClickable(false);
        ((AnimatorSet) aCListenerS31S0300000_5.l1).cancel();
        ((C15540jG) aCListenerS31S0300000_5.l2).LIZ();
    }

    public static final void onClick$27(ACListenerS31S0300000_5 aCListenerS31S0300000_5, View view) {
        ((VoiceChatBroadcastFragment) aCListenerS31S0300000_5.l0)._$_findCachedViewById(R.id.epj).setVisibility(8);
        ((VoiceChatBroadcastFragment) aCListenerS31S0300000_5.l0)._$_findCachedViewById(R.id.epj).setClickable(false);
        ((AnimatorSet) aCListenerS31S0300000_5.l1).cancel();
        ((C15540jG) aCListenerS31S0300000_5.l2).LIZ();
    }

    public static final void onClick$28(ACListenerS31S0300000_5 aCListenerS31S0300000_5, View view) {
        IIconSlot iIconSlot = (IIconSlot) ((InterfaceC31710CcU) aCListenerS31S0300000_5.l0).LLJJJIL();
        if (iIconSlot == null) {
            return;
        }
        InterfaceC31687Cc7 LIZ = iIconSlot.LIZ();
        if (LIZ != null) {
            LIZ.LIZ(((C31689Cc9) aCListenerS31S0300000_5.l2).LJLJJI.LJFF(), "during_live");
        } else {
            iIconSlot.getScheme();
            if (!TextUtils.isEmpty(null)) {
                IHostAction LJIIJJI = C7N.LJIIJJI();
                iIconSlot.getScheme();
                LJIIJJI.openLiveBrowser((String) null, ((IIconSlot.SlotViewModel) aCListenerS31S0300000_5.l1).LJLLI.getValue(), ((C31689Cc9) aCListenerS31S0300000_5.l2).LJLILLLLZI);
            }
        }
        C31684Cc4.LJ((InterfaceC31710CcU) aCListenerS31S0300000_5.l0);
    }

    public static final void onClick$29(ACListenerS31S0300000_5 aCListenerS31S0300000_5, View view) {
        C30963CDf c30963CDf = (C30963CDf) aCListenerS31S0300000_5.l0;
        C47061t0 view2 = (C47061t0) aCListenerS31S0300000_5.l1;
        EmoteModel emoteModel = (EmoteModel) aCListenerS31S0300000_5.l2;
        c30963CDf.getClass();
        o.LJIIIZ(view2, "view");
        if (emoteModel == null) {
            return;
        }
        PopupWindow popupWindow = c30963CDf.LJLJJLL;
        if (popupWindow != null) {
            popupWindow.dismiss();
        }
        View LIZ = C28289B8j.LIZ(c30963CDf.LJLIL, R.layout.dgz, null, false);
        PopupWindow popupWindow2 = new PopupWindow(LIZ, -2, -2);
        popupWindow2.setOutsideTouchable(true);
        C15650jR.LIZ().LJIIIZ(emoteModel.image).LJIIJJI(LIZ.findViewById(R.id.cwz));
        int LIZ2 = C15380j0.LIZ(87.0f);
        int measuredWidth = view2.getMeasuredWidth();
        C16880lQ.LLJLIL(popupWindow2, view2, (measuredWidth - LIZ2) / 2, ((-measuredWidth) - LIZ2) - C15380j0.LIZ(5.0f), 3);
        c30963CDf.LJLJJLL = popupWindow2;
        c30963CDf.LJLJI.xl(CDR.LIZ(1).LJLJJI);
    }

    public static final void onClick$3(ACListenerS31S0300000_5 aCListenerS31S0300000_5, View view) {
        IActionHandlerService iActionHandlerService = (IActionHandlerService) CN1.LIZ(IActionHandlerService.class);
        Context context = (Context) aCListenerS31S0300000_5.l0;
        String str = ((PopMsgContainer) aCListenerS31S0300000_5.l1).jumpUrl;
        if (str == null) {
            str = "";
        }
        iActionHandlerService.handle(context, UriProtector.parse(str));
        C30337BvR.LIZ((DataChannel) aCListenerS31S0300000_5.l2, "click_link");
    }

    public static final void onClick$30(ACListenerS31S0300000_5 aCListenerS31S0300000_5, View view) {
        long j;
        User user = (User) aCListenerS31S0300000_5.l0;
        if (user != null) {
            C29320Bf2 c29320Bf2 = (C29320Bf2) aCListenerS31S0300000_5.l1;
            CQQ cqq = (CQQ) aCListenerS31S0300000_5.l2;
            if (!user.isFollowing()) {
                long j2 = cqq.LJIIJJI;
                DataChannel dataChannel = cqq.LJIIIIZZ;
                Long valueOf = Long.valueOf(user.getId());
                c29320Bf2.getClass();
                LinkCrossRoomDataHolder LIZIZ = B5G.LIZIZ();
                InterfaceC29405BgP LIZIZ2 = B83.LIZ().LIZIZ();
                C29364Bfk c29364Bfk = new C29364Bfk();
                if (valueOf != null) {
                    j = valueOf.longValue();
                } else {
                    j = 0;
                }
                c29364Bfk.LIZIZ(j);
                c29364Bfk.LJ(j2);
                ((C29374Bfu) LIZIZ2).LJIIIIZZ(c29364Bfk.LIZJ()).LJJJ(C73969T1h.LIZIZ()).LJJJLIIL(new AfS54S0200000_5(dataChannel, LIZIZ, 58), C28341BAj.LJLIL);
            }
            String string = cqq.LIZ.getString(R.string.km_, C05170If.LIZ(user));
            o.LJIIIIZZ(string, "publicScreenContext.cont…e(user)\n                )");
            Context context = cqq.LIZ;
            o.LJII(context, "null cannot be cast to non-null type android.app.Activity");
            C30868C9o.LJIIIZ(R.drawable.d0p, (Activity) context, string);
        }
    }

    public static final void onClick$31(ACListenerS31S0300000_5 aCListenerS31S0300000_5, View view) {
        Long l;
        C75536Tki c75536Tki;
        if (view == null || view.getContext() == null || ((CQQ) aCListenerS31S0300000_5.l0).LJIIIIZZ == null) {
            return;
        }
        B5G.LIZIZ().LJJJ = new C75648TmW("anchor_host_notice");
        LinkCrossRoomDataHolder LIZIZ = B5G.LIZIZ();
        DataChannel dataChannel = ((CQQ) aCListenerS31S0300000_5.l0).LJIIIIZZ;
        if (dataChannel != null && (c75536Tki = (C75536Tki) dataChannel.kv0(C75505TkD.class)) != null) {
            l = Long.valueOf(c75536Tki.LJLIL);
        } else {
            l = null;
        }
        LIZIZ.LJJLIIIIJ = String.valueOf(l);
        B5G.LIZIZ().LJJLJ = "anchor_host_notice";
        if ((!((IInteractService) CN1.LIZ(IInteractService.class)).ta0() || C74726TUk.LIZ()) && (!((IInteractService) CN1.LIZ(IInteractService.class)).h80() || ((IInteractService) CN1.LIZ(IInteractService.class)).ZQ())) {
            ((C29324Bf6) aCListenerS31S0300000_5.l1).getClass();
            B5G.LIZIZ().LJ();
            C29324Bf6 c29324Bf6 = (C29324Bf6) aCListenerS31S0300000_5.l1;
            DataChannel dataChannel2 = ((CQQ) aCListenerS31S0300000_5.l0).LJIIIIZZ;
            c29324Bf6.getClass();
            if ((dataChannel2 == null || !((IRoomFunctionService) CN1.LIZ(IRoomFunctionService.class)).nU(dataChannel2)) && !((IMicRoomService) CN1.LIZ(IMicRoomService.class)).oT() && (((LinkMicAnchorGuideMessage) ((C29326Bf8) aCListenerS31S0300000_5.l2).LJIJJLI).connectType != 1 || (!RandomLinkMicManager.LJIIJJI() && RandomLinkMicManager.LJLJLJ != EnumC75692TnE.LINKING))) {
                if (((LinkMicAnchorGuideMessage) ((C29326Bf8) aCListenerS31S0300000_5.l2).LJIJJLI).connectType == 2 && (RandomLinkMicManager.LJIIJJI() || RandomLinkMicManager.LJLJLJ == EnumC75692TnE.LINKING)) {
                    RandomLinkMicManager.LJIILL(EnumC29835BnL.PREVIEW_DIALOG);
                    return;
                }
                int i = ((LinkMicAnchorGuideMessage) ((C29326Bf8) aCListenerS31S0300000_5.l2).LJIJJLI).connectType;
                if (i == 1) {
                    DataChannel dataChannel3 = ((CQQ) aCListenerS31S0300000_5.l0).LJIIIIZZ;
                    if (dataChannel3 != null) {
                        dataChannel3.qv0(OpenCoHostEvent.class, "anchor_host_notice");
                    }
                    B5G.LIZIZ().LJJJ = new C75648TmW("anchor_host_notice");
                    if (((IInteractService) CN1.LIZ(IInteractService.class)).ZQ()) {
                        C75642TmQ.LJJJZ("connection_invite", null, 6);
                    }
                    J9A.LIZJ(C28787BRn.LIZ("livesdk_anchor_host_notice"), ((CQQ) aCListenerS31S0300000_5.l0).LJIIIIZZ, "click", "event_type");
                    return;
                }
                if (i != 2) {
                    return;
                }
                if (B5G.LIZIZ().LIZJ) {
                    C30868C9o.LIZJ(R.string.kh8);
                    return;
                }
                C75770ToU.LIZ(((C29324Bf6) aCListenerS31S0300000_5.l1).LIZ, new C29834BnK((CQQ) aCListenerS31S0300000_5.l0), false);
                if (!C31073CHl.LIZJ()) {
                    return;
                }
                C75648TmW c75648TmW = new C75648TmW("anchor_host_notice");
                c75648TmW.LIZIZ = true;
                B5G.LIZIZ().LJJJ = c75648TmW;
                C75642TmQ.LJJJZ("connection_invite", null, 6);
                DataChannel dataChannel4 = ((CQQ) aCListenerS31S0300000_5.l0).LJIIIIZZ;
                if (dataChannel4 == null) {
                    return;
                }
                dataChannel4.qv0(OpenCoHostEvent.class, "anchor_host_notice");
                return;
            }
        }
        C30868C9o.LIZJ(R.string.kh8);
    }

    public static final void onClick$32(ACListenerS31S0300000_5 aCListenerS31S0300000_5, View view) {
        Long l;
        Room room;
        DataChannel dataChannel = ((CQQ) aCListenerS31S0300000_5.l0).LJIIIIZZ;
        Long l2 = null;
        if (dataChannel != null && (room = (Room) dataChannel.kv0(RoomChannel.class)) != null) {
            l = Long.valueOf(room.getOwnerUserId());
            l2 = Long.valueOf(room.getId());
        } else {
            l = null;
        }
        long j = ((GiftCollectionUpdateMessage) ((CQ1) aCListenerS31S0300000_5.l1).LJIJJLI).giftCollection.gift.id;
        StringBuilder LIZ = X1D.LIZ();
        b0.LJ(LIZ, ((GiftCollectionUpdateMessage) ((CQ1) aCListenerS31S0300000_5.l1).LJIJJLI).giftCollection.schemaUrl, "&gift_id=", j);
        LIZ.append("&anchor_id=");
        LIZ.append(l);
        LIZ.append("&room_id=");
        LIZ.append(l2);
        ((IActionHandlerService) CN1.LIZ(IActionHandlerService.class)).handle(C16880lQ.LLLLL(((CQQ) aCListenerS31S0300000_5.l0).LIZ), UriProtector.parse(new C32364Cn2(X1D.LIZIZ(LIZ)).LIZLLL()));
        CQ3 cq3 = (CQ3) aCListenerS31S0300000_5.l2;
        long j2 = ((GiftCollectionUpdateMessage) ((CQ1) aCListenerS31S0300000_5.l1).LJIJJLI).giftCollection.round;
        cq3.getClass();
        BZI LIZ2 = C28787BRn.LIZ("travel_gift_massage_click");
        LIZ2.LJIIZILJ();
        LIZ2.LJIJJ(Long.valueOf(j2), "round");
        LIZ2.LJIJJ(Integer.valueOf(CQ3.N()), "is_anchor");
        LIZ2.LJIJJ(Long.valueOf(j), "gift_id");
        LIZ2.LJJIIJZLJL();
    }

    public static final void onClick$33(ACListenerS31S0300000_5 aCListenerS31S0300000_5, View view) {
        ViewGroup viewGroup;
        ((CQQ) aCListenerS31S0300000_5.l0).LJIIJ.LJFF(((CQO) aCListenerS31S0300000_5.l1).LJLILLLLZI());
        BZI LIZ = C28787BRn.LIZ("livesdk_anchor_wave");
        LIZ.LJIILLIIL(((CQQ) aCListenerS31S0300000_5.l0).LJIIIIZZ);
        LIZ.LJIJJ(Long.valueOf(((CQO) aCListenerS31S0300000_5.l1).LJLILLLLZI()), "to_user_id");
        LIZ.LJIJJ(Long.valueOf(((CQO) aCListenerS31S0300000_5.l1).getMessageId()), "msg_id");
        LIZ.LJJIIJZLJL();
        CUU cuu = (CUU) aCListenerS31S0300000_5.l2;
        View view2 = cuu.itemView;
        if (view2 instanceof ViewGroup) {
            viewGroup = (ViewGroup) view2;
        } else {
            viewGroup = null;
        }
        if (viewGroup != null) {
            C1CT c1ct = new C1CT();
            C1CR c1cr = new C1CR();
            c1cr.LJLJJLL.add(cuu.LJLJLLL);
            c1cr.LJLJI = 200L;
            c1ct.LJJIJL(c1cr);
            C40581iY c40581iY = new C40581iY();
            c40581iY.LJLJJLL.add(cuu.LJZ);
            c40581iY.LJLJI = 200L;
            c1ct.LJJIJL(c40581iY);
            C40241i0 c40241i0 = new C40241i0(2);
            c40241i0.LJLJJLL.add(cuu.LJLZ);
            c40241i0.LJLJI = 200L;
            c1ct.LJJIJL(c40241i0);
            C40241i0 c40241i02 = new C40241i0(1);
            c40241i02.LJLJJLL.add(cuu.LJZI);
            c40241i02.LJLJI = 200L;
            c1ct.LJJIJL(c40241i02);
            C1CR c1cr2 = new C1CR();
            c1cr2.LJLJJLL.add(cuu.LJZI);
            c1cr2.LJLJI = 200L;
            c1ct.LJJIJL(c1cr2);
            CUW cuw = new CUW();
            cuw.LJLJJLL.add(cuu.LL);
            cuw.LJLJJLL.add(cuu.LJZL);
            cuw.LJLILLLLZI = 200L;
            c1ct.LJJIJL(cuw);
            C03510Bv.LIZ(viewGroup, c1ct);
        }
        CU2 LJJLI = ((CQO) aCListenerS31S0300000_5.l1).LJJLI();
        if (LJJLI != null) {
            LJJLI.LIZ = true;
        }
        ((CUU) aCListenerS31S0300000_5.l2).Q((CQO) aCListenerS31S0300000_5.l1);
        DataChannel dataChannel = ((CQQ) aCListenerS31S0300000_5.l0).LJIIIIZZ;
        if (dataChannel != null) {
            dataChannel.pv0(GreetingReceivedEvent.class);
        }
        C16880lQ.LJIJI(((CUU) aCListenerS31S0300000_5.l2).LJLZ, null);
    }

    public static final void onClick$34(ACListenerS31S0300000_5 aCListenerS31S0300000_5, View view) {
        int followStatus;
        long id = ((LinkMicAudienceNoticeMessage.LinkMicAudienceInviteGuide) aCListenerS31S0300000_5.l0).user.getId();
        ((C29564Biy) aCListenerS31S0300000_5.l1).getClass();
        EnumC74778TWk LIZLLL = CL8.LIZLLL();
        FollowInfo followInfo = ((LinkMicAudienceNoticeMessage.LinkMicAudienceInviteGuide) aCListenerS31S0300000_5.l0).user.getFollowInfo();
        if (followInfo == null) {
            followStatus = 0;
        } else {
            followStatus = (int) followInfo.getFollowStatus();
        }
        C75017TcL.LJIJJ(followStatus, id, LIZLLL, true);
        DataChannel dataChannel = ((CQQ) aCListenerS31S0300000_5.l2).LJIIIIZZ;
        if (view == null || view.getContext() == null || dataChannel == null) {
            return;
        }
        if (B5G.LIZIZ().LJ() != 2) {
            C30868C9o.LIZJ(R.string.mhi);
            return;
        }
        if (((LinkMicAudienceNoticeMessage.LinkMicAudienceInviteGuide) aCListenerS31S0300000_5.l0).user == null) {
            return;
        }
        if (((IInteractService) CN1.LIZ(IInteractService.class)).DD().contains(Long.valueOf(((LinkMicAudienceNoticeMessage.LinkMicAudienceInviteGuide) aCListenerS31S0300000_5.l0).user.getId()))) {
            User user = ((LinkMicAudienceNoticeMessage.LinkMicAudienceInviteGuide) aCListenerS31S0300000_5.l0).user;
            o.LJIIIIZZ(user, "inviteGuide.user");
            dataChannel.qv0(LinkInRoomAnchorPermitGuestEvent.class, new C29552Bim(user));
            return;
        }
        dataChannel.qv0(LinkInRoomAnchorInviteGuestEvent.class, new TZQ(((LinkMicAudienceNoticeMessage.LinkMicAudienceInviteGuide) aCListenerS31S0300000_5.l0).user, "mutual_notice", 2, "mutual_notice_invite"));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void onClick$35(ACListenerS31S0300000_5 aCListenerS31S0300000_5, View view) {
        ((C41051jJ) aCListenerS31S0300000_5.l0).setChecked(!((C41051jJ) aCListenerS31S0300000_5.l0).isChecked());
        C28705BOj c28705BOj = (C28705BOj) aCListenerS31S0300000_5.l1;
        long questionId = ((com.bytedance.android.livesdkapi.depend.model.live.debug.Question) aCListenerS31S0300000_5.l2).getQuestionId();
        Object tag = view.getTag();
        o.LJII(tag, "null cannot be cast to non-null type kotlin.String");
        boolean isChecked = ((C41051jJ) aCListenerS31S0300000_5.l0).isChecked();
        Answer answer = c28705BOj.LJLJI.LJLJJI.get(Long.valueOf(questionId));
        if (answer == null) {
            answer = new Answer(questionId, new HashSet());
        }
        if (isChecked) {
            answer.getAnswers().add(tag);
        } else {
            answer.getAnswers().remove(tag);
        }
        c28705BOj.LJLJI.LJLJJI.put(Long.valueOf(questionId), answer);
        InterfaceC28707BOl interfaceC28707BOl = c28705BOj.LJLJI.LJLJJL;
        if (interfaceC28707BOl != null) {
            interfaceC28707BOl.eg();
        }
    }

    public static final void onClick$36(ACListenerS31S0300000_5 aCListenerS31S0300000_5, View view) {
        ((C30687C2p) aCListenerS31S0300000_5.l0).LIZJ.setVisibility(8);
        ((C30687C2p) aCListenerS31S0300000_5.l0).LIZJ.setClickable(false);
        ((AnimatorSet) aCListenerS31S0300000_5.l1).cancel();
        ((C15540jG) aCListenerS31S0300000_5.l2).LIZ();
    }

    public static final void onClick$37(ACListenerS31S0300000_5 aCListenerS31S0300000_5, View view) {
        ((C30687C2p) aCListenerS31S0300000_5.l0).LIZJ.setVisibility(8);
        ((C30687C2p) aCListenerS31S0300000_5.l0).LIZJ.setClickable(false);
        ((AnimatorSet) aCListenerS31S0300000_5.l1).cancel();
        ((C15540jG) aCListenerS31S0300000_5.l2).LIZ();
    }

    public static final void onClick$38(ACListenerS31S0300000_5 aCListenerS31S0300000_5, View view) {
        ((C30687C2p) aCListenerS31S0300000_5.l0).LJII.setAlpha(1.0f);
        ((C30687C2p) aCListenerS31S0300000_5.l0).LIZJ.setVisibility(8);
        ((C30687C2p) aCListenerS31S0300000_5.l0).LIZJ.setClickable(false);
        ((AnimatorSet) aCListenerS31S0300000_5.l1).cancel();
        ((C15540jG) aCListenerS31S0300000_5.l2).LIZ();
    }

    public static final void onClick$39(ACListenerS31S0300000_5 aCListenerS31S0300000_5, View view) {
        ((C30687C2p) aCListenerS31S0300000_5.l0).LIZJ.setVisibility(8);
        ((C30687C2p) aCListenerS31S0300000_5.l0).LIZJ.setClickable(false);
        ((AnimatorSet) aCListenerS31S0300000_5.l1).cancel();
        ((C15540jG) aCListenerS31S0300000_5.l2).LIZ();
    }

    public static final void onClick$4(ACListenerS31S0300000_5 aCListenerS31S0300000_5, View view) {
        BottomLeftSlotWidget bottomLeftSlotWidget = (BottomLeftSlotWidget) aCListenerS31S0300000_5.l0;
        IIconSlot iIconSlot = (IIconSlot) aCListenerS31S0300000_5.l1;
        InterfaceC31710CcU interfaceC31710CcU = (InterfaceC31710CcU) aCListenerS31S0300000_5.l2;
        bottomLeftSlotWidget.getClass();
        InterfaceC31687Cc7 LIZ = iIconSlot.LIZ();
        if (LIZ != null) {
            LIZ.LIZ(bottomLeftSlotWidget.getView(), "during_live");
        } else {
            iIconSlot.getScheme();
            if (!TextUtils.isEmpty(null)) {
                IActionHandlerService iActionHandlerService = (IActionHandlerService) CN1.LIZ(IActionHandlerService.class);
                Context context = bottomLeftSlotWidget.context;
                iIconSlot.getScheme();
                iActionHandlerService.handleWithoutHost(context, UriProtector.parse(null).toString());
            }
        }
        C31684Cc4.LJ(interfaceC31710CcU);
    }

    public static final void onClick$40(ACListenerS31S0300000_5 aCListenerS31S0300000_5, View view) {
        if (view != null && view.getContext() != null) {
            CQQ cqq = (CQQ) aCListenerS31S0300000_5.l0;
            if (cqq.LJIIIIZZ == null) {
                return;
            }
            Context context = cqq.LIZ;
            int LJIJ = (int) C15380j0.LJIJ(B9K.LIZJ(context));
            C29325Bf7 c29325Bf7 = (C29325Bf7) aCListenerS31S0300000_5.l1;
            String str = ((BattleNoticeRuleGuide) aCListenerS31S0300000_5.l2).ruleUrl;
            o.LJIIIIZZ(str, "ruleGuide.ruleUrl");
            c29325Bf7.getClass();
            C29682Bks LIZ = C29683Bkt.LIZ(str);
            BY3 by3 = BY3.DP;
            LIZ.LJIL(LJIJ, by3);
            LIZ.LJIIJ(402, by3);
            C29682Bks.LJIJI(LIZ, 8);
            LIZ.LJIIIZ("bottom");
            String uri = LIZ.LIZ().toString();
            o.LJIIIIZZ(uri, "SparkPopupSchemaBuilder.…      .build().toString()");
            IHybridContainerService iHybridContainerService = (IHybridContainerService) CN1.LIZ(IHybridContainerService.class);
            if (iHybridContainerService != null) {
                C05590Jv.LJ(iHybridContainerService, context, uri);
            }
            if (!((IInteractService) CN1.LIZ(IInteractService.class)).mT()) {
                return;
            }
            InterfaceC30442Bx8.LLJJIJIL.LIZ(Boolean.FALSE);
        }
    }

    public static final void onClick$41(ACListenerS31S0300000_5 aCListenerS31S0300000_5, View view) {
        int i;
        String str;
        String str2;
        Context context = (Context) aCListenerS31S0300000_5.l0;
        LatestBanRecordInfo latestBanRecordInfo = (LatestBanRecordInfo) aCListenerS31S0300000_5.l1;
        if (latestBanRecordInfo != null) {
            i = latestBanRecordInfo.banSource;
            str = latestBanRecordInfo.detailUrl;
        } else {
            i = 1;
            str = null;
        }
        C28906BWc.LIZ(context, i, str, "link_mic", new AqS171S0100000_5(context, 906));
        ((LiveDialog) aCListenerS31S0300000_5.l2).dismiss();
        BZI LIZ = C28787BRn.LIZ("livesdk_guest_linkmic_ban_details_click");
        LIZ.LJIIZILJ();
        LIZ.LIZJ("click");
        if (C29306Beo.LJIIJJI(DataChannelGlobal.LJLJJI)) {
            str2 = "anchor";
        } else {
            str2 = "guest";
        }
        LIZ.LJIJJ(str2, "user_type");
        LIZ.LJJIIJZLJL();
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0068, code lost:
    
        if (r1 != null) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0064, code lost:
    
        if (r1 != null) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0060, code lost:
    
        if (r1 != null) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void onClick$5(Y.ACListenerS31S0300000_5 r7, android.view.View r8) {
        /*
            java.lang.Object r3 = r7.l0
            com.bytedance.android.livesdk.broadcast.preview.widget.LiveAccessRecallWidget r3 = (com.bytedance.android.livesdk.broadcast.preview.widget.LiveAccessRecallWidget) r3
            java.lang.Object r0 = r7.l1
            X.BGs r0 = (X.C28506BGs) r0
            android.content.Context r2 = r0.getContext()
            java.lang.String r0 = "context"
            kotlin.jvm.internal.o.LJIIIIZZ(r2, r0)
            java.lang.Object r0 = r7.l2
            X.BWh r0 = (X.C28911BWh) r0
            r6 = 0
            if (r0 == 0) goto L6b
            java.lang.String r1 = r0.LJ
        L1a:
            r3.getClass()
            boolean r0 = X.C29306Beo.LJIJJLI(r1)
            if (r0 == 0) goto L2e
            java.lang.Class<com.bytedance.android.live.actionhandler.IActionHandlerService> r0 = com.bytedance.android.live.actionhandler.IActionHandlerService.class
            X.0Mx r0 = X.CN1.LIZ(r0)
            com.bytedance.android.live.actionhandler.IActionHandlerService r0 = (com.bytedance.android.live.actionhandler.IActionHandlerService) r0
            r0.handle(r2, r1)
        L2e:
            java.lang.Object r0 = r7.l0
            com.bytedance.android.livesdk.broadcast.preview.widget.LiveAccessRecallWidget r0 = (com.bytedance.android.livesdk.broadcast.preview.widget.LiveAccessRecallWidget) r0
            com.bytedance.ies.sdk.datachannel.DataChannel r5 = r0.dataChannel
            java.lang.String r0 = "dataChannel"
            kotlin.jvm.internal.o.LJIIIIZZ(r5, r0)
            java.lang.Object r1 = r7.l2
            X.BWh r1 = (X.C28911BWh) r1
            if (r1 == 0) goto L5f
            com.bytedance.android.livesdk.model.message.PunishEventInfo r0 = r1.LJFF
            if (r0 == 0) goto L5f
            java.lang.String r4 = r0.punishId
        L45:
            com.bytedance.android.livesdk.model.message.PunishEventInfo r0 = r1.LJFF
            if (r0 == 0) goto L63
            java.lang.String r3 = r0.punishType
        L4b:
            com.bytedance.android.livesdk.model.message.PunishEventInfo r0 = r1.LJFF
            if (r0 == 0) goto L67
            java.lang.String r2 = r0.punishReason
        L51:
            com.bytedance.android.livesdk.model.message.PunishEventInfo r0 = r1.LJFF
            if (r0 == 0) goto L5b
            long r0 = r0.violationUid
            java.lang.Long r6 = java.lang.Long.valueOf(r0)
        L5b:
            X.C0N7.LJIILJJIL(r5, r4, r3, r2, r6)
            return
        L5f:
            r4 = r6
            if (r1 == 0) goto L63
            goto L45
        L63:
            r3 = r6
            if (r1 == 0) goto L67
            goto L4b
        L67:
            r2 = r6
            if (r1 == 0) goto L5b
            goto L51
        L6b:
            r1 = r6
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.ACListenerS31S0300000_5.onClick$5(Y.ACListenerS31S0300000_5, android.view.View):void");
    }

    public static final void onClick$6(ACListenerS31S0300000_5 aCListenerS31S0300000_5, View view) {
        String str;
        String str2;
        String str3;
        PreviewCommonNotifyWidget previewCommonNotifyWidget = (PreviewCommonNotifyWidget) aCListenerS31S0300000_5.l0;
        Context context = ((C28506BGs) aCListenerS31S0300000_5.l1).getContext();
        o.LJIIIIZZ(context, "context");
        String str4 = ((C28911BWh) aCListenerS31S0300000_5.l2).LJ;
        previewCommonNotifyWidget.getClass();
        if (C29306Beo.LJIJJLI(str4)) {
            ((IActionHandlerService) CN1.LIZ(IActionHandlerService.class)).handle(context, str4);
        }
        DataChannel dataChannel = ((PreviewCommonNotifyWidget) aCListenerS31S0300000_5.l0).dataChannel;
        o.LJIIIIZZ(dataChannel, "dataChannel");
        PunishEventInfo punishEventInfo = ((C28911BWh) aCListenerS31S0300000_5.l2).LJFF;
        Long l = null;
        if (punishEventInfo != null) {
            str = punishEventInfo.punishId;
            str2 = punishEventInfo.punishType;
            str3 = punishEventInfo.punishReason;
            l = Long.valueOf(punishEventInfo.violationUid);
        } else {
            str = null;
            str2 = null;
            str3 = null;
        }
        C0N7.LJIILJJIL(dataChannel, str, str2, str3, l);
    }

    public static final void onClick$7(ACListenerS31S0300000_5 aCListenerS31S0300000_5, View view) {
        View findViewById;
        View view2 = ((LiveBroadcastFragment) aCListenerS31S0300000_5.l0).getView();
        if (view2 != null && (findViewById = view2.findViewById(R.id.fva)) != null) {
            findViewById.setAlpha(1.0f);
        }
        ((LiveBroadcastFragment) aCListenerS31S0300000_5.l0)._$_findCachedViewById(R.id.epj).setVisibility(8);
        ((LiveBroadcastFragment) aCListenerS31S0300000_5.l0)._$_findCachedViewById(R.id.epj).setClickable(false);
        ((AnimatorSet) aCListenerS31S0300000_5.l1).cancel();
        ((C15540jG) aCListenerS31S0300000_5.l2).LIZ();
    }

    public static final void onClick$8(ACListenerS31S0300000_5 aCListenerS31S0300000_5, View view) {
        ((LiveBroadcastFragment) aCListenerS31S0300000_5.l0)._$_findCachedViewById(R.id.epj).setVisibility(8);
        ((LiveBroadcastFragment) aCListenerS31S0300000_5.l0)._$_findCachedViewById(R.id.epj).setClickable(false);
        ((AnimatorSet) aCListenerS31S0300000_5.l1).cancel();
        ((C15540jG) aCListenerS31S0300000_5.l2).LIZ();
    }

    public static final void onClick$9(ACListenerS31S0300000_5 aCListenerS31S0300000_5, View view) {
        ((LiveBroadcastFragment) aCListenerS31S0300000_5.l0)._$_findCachedViewById(R.id.epj).setVisibility(8);
        ((LiveBroadcastFragment) aCListenerS31S0300000_5.l0)._$_findCachedViewById(R.id.epj).setClickable(false);
        ((AnimatorSet) aCListenerS31S0300000_5.l1).cancel();
        ((C15540jG) aCListenerS31S0300000_5.l2).LIZ();
    }

    public ACListenerS31S0300000_5(Object obj, Object obj2, Object obj3, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
        this.l2 = obj3;
    }
}
