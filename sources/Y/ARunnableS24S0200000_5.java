package Y;

import X.AbstractC30139BsF;
import X.AbstractC32415Cnr;
import X.B35;
import X.B4Q;
import X.B73;
import X.B83;
import X.B8U;
import X.B9K;
import X.BAF;
import X.BCN;
import X.BD2;
import X.BNJ;
import X.BNK;
import X.BWZ;
import X.BYI;
import X.C05170If;
import X.C0A2;
import X.C0N7;
import X.C0NB;
import X.C0RV;
import X.C0WE;
import X.C0WR;
import X.C11;
import X.C15380j0;
import X.C16880lQ;
import X.C1A;
import X.C1DH;
import X.C1EW;
import X.C28212B5k;
import X.C28467BFf;
import X.C28790BRq;
import X.C28872BUu;
import X.C29306Beo;
import X.C29374Bfu;
import X.C29598BjW;
import X.C29697Bl7;
import X.C29726Bla;
import X.C29929Bor;
import X.C29930Bos;
import X.C2A4;
import X.C2A8;
import X.C30087BrP;
import X.C30125Bs1;
import X.C30179Bst;
import X.C30180Bsu;
import X.C30187Bt1;
import X.C30286Buc;
import X.C30289Buf;
import X.C30293Buj;
import X.C30297Bun;
import X.C30307Bux;
import X.C30324BvE;
import X.C30355Bvj;
import X.C30658C1m;
import X.C30791C6p;
import X.C30868C9o;
import X.C30876C9w;
import X.C30922CBq;
import X.C30926CBu;
import X.C30953CCv;
import X.C30987CEd;
import X.C30988CEe;
import X.C31256COm;
import X.C31319CQx;
import X.C31415CUp;
import X.C31521CYr;
import X.C31592Caa;
import X.C31634CbG;
import X.C31635CbH;
import X.C31661Mc;
import X.C31691Mf;
import X.C31699CcJ;
import X.C31824CeK;
import X.C31847Ceh;
import X.C32328CmS;
import X.C32364Cn2;
import X.C32399Cnb;
import X.C32409Cnl;
import X.C32506CpK;
import X.C32537Cpp;
import X.C32676Cs4;
import X.C32727Cst;
import X.C32753CtJ;
import X.C34K;
import X.C36;
import X.C39202Fa2;
import X.C46104I7o;
import X.C47061t0;
import X.C47261Igj;
import X.C48459J0d;
import X.C55612Gf;
import X.C61447O9r;
import X.C61898ORa;
import X.C62819Ol5;
import X.C68322mC;
import X.C72242sW;
import X.C73318Sq2;
import X.C74050T4k;
import X.C75234Tfq;
import X.C79258V8s;
import X.C7N;
import X.C83741Wtl;
import X.C87095YGd;
import X.C8I2;
import X.C9H;
import X.CAA;
import X.CF8;
import X.CF9;
import X.CKO;
import X.CN1;
import X.CQQ;
import X.CR6;
import X.CYQ;
import X.EnumC30204BtI;
import X.EnumC31874Cf8;
import X.HandlerC28345BAn;
import X.InterfaceC05190Ih;
import X.InterfaceC08090Tl;
import X.InterfaceC30138BsE;
import X.InterfaceC30182Bsw;
import X.InterfaceC30237Btp;
import X.InterfaceC30313Bv3;
import X.InterfaceC30359Bvn;
import X.InterfaceC30442Bx8;
import X.InterfaceC31095CIh;
import X.InterfaceC32261ClN;
import X.InterfaceC88472Yns;
import X.ND2;
import X.OJY;
import X.OSZ;
import X.Q7L;
import X.U2I;
import X.X1D;
import X.XKX;
import X.Y90;
import android.animation.AnimatorSet;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.SystemClock;
import android.text.Spannable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.ViewModelKt;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.banner.IBannerService;
import com.bytedance.android.live.base.model.user.BadgeStruct;
import com.bytedance.android.live.base.model.user.SubscribeInfo;
import com.bytedance.android.live.base.model.user.UploadResult;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.broadcast.BroadcastSettingResponse;
import com.bytedance.android.live.broadcast.api.ExposureCompensationVisibleChannel;
import com.bytedance.android.live.broadcast.api.RefreshExposureCompensationViewChannel;
import com.bytedance.android.live.broadcast.api.StartPushStreamChannel;
import com.bytedance.android.live.decoration.IDecorationService;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.live.effect.api.IEffectService;
import com.bytedance.android.live.effect.api.LiveGameEffectFetchFailedEvent;
import com.bytedance.android.live.effect.api.LiveGameEffectFetchedChannel;
import com.bytedance.android.live.effect.api.LiveGoalEffectChannel;
import com.bytedance.android.live.effect.api.MoveLiveGoalEffectEvent;
import com.bytedance.android.live.effect.api.OpenLiveGoalPanelChannel;
import com.bytedance.android.live.effect.model.StreamSize;
import com.bytedance.android.live.function.IRoomFunctionService;
import com.bytedance.android.live.gift.IGiftService;
import com.bytedance.android.live.interaction.drawguess.DrawGuessCaptureImageChannel;
import com.bytedance.android.live.interaction.drawguess.DrawGuessExitGameEvent;
import com.bytedance.android.live.interaction.drawguess.DrawGuessFreelyStartChannel;
import com.bytedance.android.live.interaction.drawguess.DrawGuessIsCountingDownRoundStart;
import com.bytedance.android.live.interaction.drawguess.DrawGuessStartGameEvent;
import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.live.liveinteract.api.LinkCrossRoomStateChangeEvent;
import com.bytedance.android.live.liveinteract.api.LinkRandomLinkMicChangeTipTextEvent;
import com.bytedance.android.live.publicscreen.impl.GreetingReceivedEvent;
import com.bytedance.android.live.qa.IQAService;
import com.bytedance.android.live.rank.impl.entrance.widget.RankEntranceWidget;
import com.bytedance.android.live.slot.FrameL2SlotWidget;
import com.bytedance.android.live.slot.SlotBarrageWidget;
import com.bytedance.android.live.toolbar.IToolbarService;
import com.bytedance.android.livesdk.broadcast.guide.GuidanceViewModel;
import com.bytedance.android.livesdk.broadcast.interaction.widget.BroadcastFilterStyleWidget;
import com.bytedance.android.livesdk.broadcast.interaction.widget.CaptchaLiveWidget;
import com.bytedance.android.livesdk.broadcast.interaction.widget.MockVideoControlWidget;
import com.bytedance.android.livesdk.broadcast.interaction.widget.ShortCutPanelPalletWidget;
import com.bytedance.android.livesdk.broadcast.interaction.widget.ShortCutPanelWidget;
import com.bytedance.android.livesdk.broadcast.interaction.widget.livecenter.LiveCenterEntranceWidget;
import com.bytedance.android.livesdk.broadcast.interaction.widget.mutemic.MuteMicWidget;
import com.bytedance.android.livesdk.broadcast.interaction.widget.netspeed.NetSpeedMonitorWidget;
import com.bytedance.android.livesdk.broadcast.interaction.widget.pause.PauseLiveWidget;
import com.bytedance.android.livesdk.broadcast.preview.LiveBroadcastPreviewFragment;
import com.bytedance.android.livesdk.broadcast.preview.widget.PreviewBaseSlotWidget;
import com.bytedance.android.livesdk.broadcast.preview.widget.start_live.PreviewStartLiveWidget;
import com.bytedance.android.livesdk.broadcast.trymode.TryModeBroadcastFragment;
import com.bytedance.android.livesdk.broadcast.trymode.TryModeBroadcastInteractionFragment;
import com.bytedance.android.livesdk.broadcast.video.LiveBroadcastFragment;
import com.bytedance.android.livesdk.broadcast.video.VideoBroadcastInteractionFragment;
import com.bytedance.android.livesdk.broadcast.video.VideoWidget;
import com.bytedance.android.livesdk.broadcast.voicechat.VoiceChatBroadcastInteractionFragment;
import com.bytedance.android.livesdk.chatroom.api.RoomRetrofitApi;
import com.bytedance.android.livesdk.chatroom.api.SubTimerSticker;
import com.bytedance.android.livesdk.chatroom.api.TimerDetail;
import com.bytedance.android.livesdk.chatroom.model.InputAttrs;
import com.bytedance.android.livesdk.chatroom.ui.LiveEmojiInputDialogFragment;
import com.bytedance.android.livesdk.chatroom.ui.LivePlayFragment;
import com.bytedance.android.livesdk.chatroom.viewmodule.CommentWidget;
import com.bytedance.android.livesdk.chatroom.viewmodule.DecorationWrapperWidget;
import com.bytedance.android.livesdk.chatroom.viewmodule.NewTopRightBannerWidget;
import com.bytedance.android.livesdk.chatroom.viewmodule.QuickCommentWidget;
import com.bytedance.android.livesdk.dataChannel.LiveCenterAlpha;
import com.bytedance.android.livesdk.dataChannel.LiveCenterStatusChannel;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.dataChannel.StickerCancelChannel;
import com.bytedance.android.livesdk.dataChannel.StickerSelectedEvent;
import com.bytedance.android.livesdk.game.GameCategoryListFragment;
import com.bytedance.android.livesdk.hashtag.PreviewHashtagListFragment;
import com.bytedance.android.livesdk.impl.revenue.starcomment.extendscreen.StarCommentExtendWidget;
import com.bytedance.android.livesdk.impl.revenue.subscription.ui.setting.SubscriptionSettingFragmentNew;
import com.bytedance.android.livesdk.impl.revenue.subscription.widget.SubscribeTimeStickerWidget;
import com.bytedance.android.livesdk.interaction.drawguess.ui.DrawGuessStatusWidget;
import com.bytedance.android.livesdk.interaction.poll.ui.progresseffect.widget.LiveGiftPollEffectWidget;
import com.bytedance.android.livesdk.interaction.poll.ui.progresseffect.widget.LiveNormalPollEffectWidget;
import com.bytedance.android.livesdk.like.widget.SelfLikeWidget;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveAnchorEnableInnerBeautyMaxValue;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveAnchorEnableVideoMockPushStream;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveAudioMuteTypeSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveBroadcastTaskResourceIdSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveCenterLayoutStyleSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveEffectShortcutPanelTypeSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveKaraokeSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveMemoryOptSetting;
import com.bytedance.android.livesdk.livesetting.gift.GiftHighTrafficDropMessageSetting;
import com.bytedance.android.livesdk.livesetting.gift.GiftReceiveMsgThreadSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicMultiGuestV3MaskAvatarSizeTestSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveAudienceLinkmicLowestAgeSetting;
import com.bytedance.android.livesdk.livesetting.other.ToolBarRefactor;
import com.bytedance.android.livesdk.livesetting.other.subscribe_enhance.SubscriptionExpireRemindHourSetting;
import com.bytedance.android.livesdk.livesetting.performance.LiveBroadcastPoorDeviceDelayDurationSetting;
import com.bytedance.android.livesdk.livesetting.performance.LiveBroadcastPoorDeviceDowngradeSetting;
import com.bytedance.android.livesdk.livesetting.performance.LiveGoal2GreenScreenSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.LiveSubscribeEntryShareOutUrl;
import com.bytedance.android.livesdk.livesetting.watchlive.LiveSubscribeEntryShareUrl;
import com.bytedance.android.livesdk.livesetting.watchlive.TestDisableMixStreamTypeSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.TestEnableLiveCoreSetting;
import com.bytedance.android.livesdk.model.Creator;
import com.bytedance.android.livesdk.model.GameTag;
import com.bytedance.android.livesdk.model.Gift;
import com.bytedance.android.livesdk.model.Hashtag;
import com.bytedance.android.livesdk.model.RoomDecoration;
import com.bytedance.android.livesdk.model.message.ActivityQuizCardMessage;
import com.bytedance.android.livesdk.model.message.ActivityQuizCardMessageSEIWrapper;
import com.bytedance.android.livesdk.model.message.BarrageMessage;
import com.bytedance.android.livesdk.model.message.CapsuleMessage;
import com.bytedance.android.livesdk.model.message.GiftCollectionUpdateMessage;
import com.bytedance.android.livesdk.model.message.GiftMessage;
import com.bytedance.android.livesdk.model.message.LinkMicAnchorGuideMessage;
import com.bytedance.android.livesdk.model.message.LinkMicAudienceNoticeMessage;
import com.bytedance.android.livesdk.model.message.LinkMicBattleNoticeMessage;
import com.bytedance.android.livesdk.model.message.OperateToastMessage;
import com.bytedance.android.livesdk.model.message.SubTimerStickerMessage;
import com.bytedance.android.livesdk.performance.LivePerformanceManager;
import com.bytedance.android.livesdk.postrechargeretention.PostRechargeRetentionViewModel;
import com.bytedance.android.livesdk.qa.QAApi;
import com.bytedance.android.livesdk.qa.QuestionCardWidget;
import com.bytedance.android.livesdk.qa.QuestionEx;
import com.bytedance.android.livesdk.quiz.ActQuizWidget;
import com.bytedance.android.livesdk.rank.impl.widget.OnlineAudienceRankWidget;
import com.bytedance.android.livesdk.slot.FullBottomContainerHeightChannel;
import com.bytedance.android.livesdk.widget.LiveDetectInfoView;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import com.bytedance.android.livesdkapi.host.IHostShare;
import com.bytedance.android.widget.Widget;
import com.bytedance.bpea.basics.Cert;
import com.bytedance.common.utility.Logger;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.ies.sdk.widgets.Layer2PriorityManager;
import com.bytedance.ies.sdk.widgets.LayeredWidgetManager;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.bytedance.ies.sdk.widgets.LiveWidget;
import com.bytedance.ies.sdk.widgets.RecyclableWidgetManager;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.retrofit2.mime.MultipartTypedOutput;
import com.bytedance.retrofit2.mime.TypedFile;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.ss.android.ugc.aweme.feed.adapter.widget.player.LivePreviewPlayerVM;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.ss.ttlivestreamer.livestreamv2.core.LiveCore;
import com.ss.ugc.live.sdk.message.data.IMessage;
import com.zhiliaoapp.musically.R;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS171S0100000_5;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public class ARunnableS24S0200000_5 implements Runnable {
    public final int $t;
    public Object l0;
    public Object l1;

    public final void LIZ$0() {
        C48459J0d<Boolean> c48459J0d = InterfaceC30442Bx8.s3;
        List LJJIJIIJI = C47261Igj.LJJIJIIJI(c48459J0d.LIZJ(), InterfaceC30442Bx8.u3.LIZJ(), c48459J0d.LIZJ(), InterfaceC30442Bx8.v3.LIZJ(), InterfaceC30442Bx8.t3.LIZJ());
        ArrayList arrayList = (ArrayList) this.l0;
        if (arrayList != null) {
            C30293Buj c30293Buj = (C30293Buj) this.l1;
            int i = 0;
            for (Object obj : LJJIJIIJI) {
                int i2 = i + 1;
                if (i >= 0) {
                    Boolean toDownload = (Boolean) obj;
                    Object obj2 = ListProtector.get(arrayList, i);
                    o.LJIIIIZZ(obj2, "urlList[index]");
                    String str = (String) obj2;
                    o.LJIIIIZZ(toDownload, "toDownload");
                    if (toDownload.booleanValue() && str.length() > 0) {
                        C79258V8s.LIZ.LIZIZ(new C31824CeK((String) ListProtector.get(c30293Buj.LIZ, i), EnumC31874Cf8.TRY_MODE_WEBP, null, null, str, null, false, 3, false, 620), C36.LJLIL);
                    }
                    i = i2;
                } else {
                    C47261Igj.LJJJJJ();
                    throw null;
                }
            }
        }
    }

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
            case 44:
                run$44(this);
                return;
            case 45:
                run$45(this);
                return;
            case 46:
                run$46(this);
                return;
            case 47:
                run$47(this);
                return;
            case LinkMicMultiGuestV3MaskAvatarSizeTestSetting.SIZE_48 /* 48 */:
                run$48(this);
                return;
            case C61447O9r.LJIIJ:
                run$49(this);
                return;
            case 50:
                run$50(this);
                return;
            case 51:
                run$51(this);
                return;
            case 52:
                run$52(this);
                return;
            case 53:
                run$53(this);
                return;
            case 54:
                run$54(this);
                return;
            case 55:
                run$55(this);
                return;
            case 56:
                run$56(this);
                return;
            case 57:
                run$57(this);
                return;
            case 58:
                run$58(this);
                return;
            case 59:
                run$59(this);
                return;
            case 60:
                run$60(this);
                return;
            case 61:
                run$61(this);
                return;
            case BaseNotice.CREATOR /* 62 */:
                run$62(this);
                return;
            case 63:
                run$63(this);
                return;
            case 64:
                run$64(this);
                return;
            case 65:
                run$65(this);
                return;
            case 66:
                run$66(this);
                return;
            case 67:
                run$67(this);
                return;
            case 68:
                run$68(this);
                return;
            case 69:
                run$69(this);
                return;
            case 70:
                run$70(this);
                return;
            case 71:
                run$71(this);
                return;
            case SubscriptionExpireRemindHourSetting.DEFAULT /* 72 */:
                run$72(this);
                return;
            case 73:
                run$73(this);
                return;
            case 74:
                run$74(this);
                return;
            case 75:
                run$75(this);
                return;
            case 76:
                run$76(this);
                return;
            case 77:
                run$77(this);
                return;
            case 78:
                run$78(this);
                return;
            case 79:
                run$79(this);
                return;
            case 80:
                run$80(this);
                return;
            case 81:
                run$81(this);
                return;
            case 82:
                run$82(this);
                return;
            case 83:
                run$83(this);
                return;
            case 84:
                run$84(this);
                return;
            case LiveAnchorEnableInnerBeautyMaxValue.DEFAULT /* 85 */:
                run$85(this);
                return;
            case 86:
                run$86(this);
                return;
            case 87:
                run$87(this);
                return;
            case 88:
                run$88(this);
                return;
            case 89:
                run$89(this);
                return;
            case 90:
                run$90(this);
                return;
            case 91:
                run$91(this);
                return;
            case 92:
                run$92(this);
                return;
            default:
                return;
        }
    }

    public final void LIZ$1() {
        LiveIconView liveIconView;
        int LIZ;
        ViewGroup.LayoutParams layoutParams;
        int LIZ2;
        ViewGroup.LayoutParams layoutParams2;
        C11 c11 = (C11) this.l0;
        if (c11.LJLJLLL <= 0) {
            LiveIconView liveIconView2 = (LiveIconView) this.l1;
            if (liveIconView2 != null && (layoutParams2 = liveIconView2.getLayoutParams()) != null) {
                LIZ2 = layoutParams2.width;
            } else {
                LIZ2 = (int) B9K.LIZ(((C11) this.l0).LJLJLJ, 24.0f);
            }
            c11.LJLJLLL = LIZ2;
        }
        C11 c112 = (C11) this.l0;
        if (c112.LJLL <= 0) {
            LiveIconView liveIconView3 = (LiveIconView) this.l1;
            if (liveIconView3 != null && (layoutParams = liveIconView3.getLayoutParams()) != null) {
                LIZ = layoutParams.height;
            } else {
                LIZ = (int) B9K.LIZ(((C11) this.l0).LJLJLJ, 24.0f);
            }
            c112.LJLL = LIZ;
        }
        if (((C11) this.l0).LJLLI < 0 && (liveIconView = (LiveIconView) this.l1) != null) {
            ((C11) this.l0).LJLLI = liveIconView.getPaddingTop();
        }
    }

    public final void LIZ$10() {
        Room room;
        User owner;
        SubscribeInfo subscribeInfo;
        TimerDetail timerDetail;
        ConstraintLayout constraintLayout;
        SubscribeTimeStickerWidget subscribeTimeStickerWidget = (SubscribeTimeStickerWidget) this.l0;
        IMessage iMessage = (IMessage) this.l1;
        subscribeTimeStickerWidget.getClass();
        if (iMessage instanceof SubTimerStickerMessage) {
            SubTimerStickerMessage subTimerStickerMessage = (SubTimerStickerMessage) iMessage;
            SubTimerSticker subTimerSticker = subTimerStickerMessage.sticker;
            if (subTimerSticker != null) {
                int i = subTimerSticker.type;
                if (i != 0) {
                    if (i != 1) {
                        if (i != 2) {
                            if (i != 3) {
                                if (i == 4) {
                                    subscribeTimeStickerWidget.LJLL = subTimerSticker.totalTime;
                                    long LIZ = C30953CCv.LIZ(subTimerSticker.remainingTime, subTimerSticker.timestamp, true);
                                    subscribeTimeStickerWidget.LJLJLLL = LIZ;
                                    C8I2 c8i2 = subscribeTimeStickerWidget.LJLLL;
                                    if (c8i2 != null) {
                                        c8i2.setTotalTime(subscribeTimeStickerWidget.LJLL);
                                        c8i2.setRemainTime(LIZ);
                                    }
                                    U2I u2i = subscribeTimeStickerWidget.LJLLLL;
                                    if (u2i != null) {
                                        u2i.LIZ(subscribeTimeStickerWidget.LJLJLLL, false);
                                    }
                                }
                            } else {
                                subscribeTimeStickerWidget.LLFFF(subTimerSticker, true);
                            }
                        } else if (!subscribeTimeStickerWidget.LJLJL && (constraintLayout = subscribeTimeStickerWidget.LJLLILLLL) != null) {
                            subscribeTimeStickerWidget.LLIIIILZ(constraintLayout, constraintLayout.getMeasuredWidth(), constraintLayout.getMeasuredHeight(), subTimerSticker.stickerX, subTimerSticker.stickerY, subTimerSticker.screenW, subTimerSticker.screenH);
                        }
                    } else {
                        int i2 = subTimerSticker.opType;
                        if (i2 != 0) {
                            if (i2 != 1) {
                                if (i2 != 2) {
                                    if (i2 == 3) {
                                        subscribeTimeStickerWidget.LJLZ();
                                        subscribeTimeStickerWidget.LL(subTimerSticker, "delete");
                                    }
                                }
                            } else {
                                if (subscribeTimeStickerWidget.LJLJL) {
                                    long j = subTimerSticker.remainingTime;
                                    long j2 = subTimerSticker.totalTime;
                                    Iterator<AnimatorSet> it = subscribeTimeStickerWidget.LLFF.iterator();
                                    while (it.hasNext()) {
                                        AnimatorSet next = it.next();
                                        if (next != null) {
                                            next.cancel();
                                        }
                                    }
                                    subscribeTimeStickerWidget.LJLJLLL = j;
                                    subscribeTimeStickerWidget.LJLL = j2;
                                    C8I2 c8i22 = subscribeTimeStickerWidget.LJLLL;
                                    if (c8i22 != null) {
                                        c8i22.setTotalTime(j2);
                                        c8i22.setRemainTime(j);
                                    }
                                    U2I u2i2 = subscribeTimeStickerWidget.LJLLLL;
                                    if (u2i2 != null) {
                                        u2i2.LIZ(j, false);
                                    }
                                    C73318Sq2 c73318Sq2 = subscribeTimeStickerWidget.LJLLI;
                                    if (c73318Sq2 != null) {
                                        c73318Sq2.dispose();
                                    }
                                } else {
                                    subscribeTimeStickerWidget.LJLZ();
                                }
                                if (!subscribeTimeStickerWidget.LJLJL) {
                                    subscribeTimeStickerWidget.LL(subTimerSticker, "suspened");
                                }
                            }
                        }
                        subscribeTimeStickerWidget.LLIIIJ(true, subscribeTimeStickerWidget.LJZ(subTimerSticker.timeIncreasePerSub, subTimerSticker.anchorSideTitle, subTimerSticker.userSideTitle), C30953CCv.LIZ(subTimerSticker.remainingTime, subTimerSticker.timestamp, false), subTimerSticker.totalTime, subTimerSticker.stickerX, subTimerSticker.stickerY, subTimerSticker.screenW, subTimerSticker.screenH);
                        if (!subscribeTimeStickerWidget.LJLJL) {
                            subscribeTimeStickerWidget.LL(subTimerSticker, null);
                        }
                    }
                } else {
                    C74050T4k c74050T4k = subscribeTimeStickerWidget.LJLLJ;
                    if (c74050T4k != null) {
                        c74050T4k.setText(subscribeTimeStickerWidget.LJZ(subTimerSticker.timeIncreasePerSub, subTimerSticker.anchorSideTitle, subTimerSticker.userSideTitle));
                    }
                    subscribeTimeStickerWidget.LL(subTimerSticker, null);
                }
            }
            SubTimerSticker subTimerSticker2 = subTimerStickerMessage.sticker;
            if (subTimerSticker2 != null && (room = subscribeTimeStickerWidget.LJLJJL) != null && (owner = room.getOwner()) != null && (subscribeInfo = owner.getSubscribeInfo()) != null && (timerDetail = subscribeInfo.timerDetail) != null) {
                timerDetail.timerId = subTimerSticker2.timerId;
                timerDetail.timerStatus = subTimerSticker2.timerStatus;
                timerDetail.anchorSideTitle = subTimerSticker2.anchorSideTitle;
                timerDetail.userSideTitle = subTimerSticker2.userSideTitle;
                timerDetail.subCount = Math.max(subTimerSticker2.subIncreaseCount, timerDetail.subCount);
                long j3 = subTimerSticker2.timeIncreasePerSub;
                timerDetail.timeIncreasePerSubS = j3;
                timerDetail.timeIncreaseCapS = subTimerSticker2.subIncreaseCount * j3;
                timerDetail.totalTimeS = subTimerSticker2.totalTime;
                timerDetail.remainingTimeS = subTimerSticker2.remainingTime;
                timerDetail.timestampS = subTimerSticker2.timestamp;
                timerDetail.stickerX = subTimerSticker2.stickerX;
                timerDetail.stickerY = subTimerSticker2.stickerY;
                timerDetail.screenW = subTimerSticker2.screenW;
                timerDetail.screenH = subTimerSticker2.screenH;
            }
        }
    }

    public final void LIZ$11() {
        MultipartTypedOutput multipartTypedOutput = new MultipartTypedOutput();
        multipartTypedOutput.addPart("file", new TypedFile("multipart/form-data", (File) this.l0));
        HandlerC28345BAn LJLZ = ((LiveDetectInfoView) this.l1).LJLZ();
        C1EW.LIZ(((RoomRetrofitApi) Q7L.LIZIZ(RoomRetrofitApi.class)).uploadImage(multipartTypedOutput)).LJJJLIIL(new AfS36S0101000_5(1, LJLZ, 47), new AfS36S0101000_5(0, LJLZ, 20));
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Integer, O] */
    public final void LIZ$12() {
        DataChannel dataChannel = ((TryModeBroadcastInteractionFragment) this.l0).LJLLJ;
        if (dataChannel != null) {
            ((C32537Cpp) dataChannel.gv0(C30180Bsu.class)).LIZ = Integer.valueOf(((View) this.l1).getHeight());
            TryModeBroadcastInteractionFragment tryModeBroadcastInteractionFragment = (TryModeBroadcastInteractionFragment) this.l0;
            C30876C9w c30876C9w = tryModeBroadcastInteractionFragment.LJZI;
            if (c30876C9w != null) {
                c30876C9w.setOnSizeChangedListener(new C30187Bt1(tryModeBroadcastInteractionFragment));
                return;
            }
            return;
        }
        o.LJIJI("mDataChannel");
        throw null;
    }

    public final void LIZ$13() {
        User user;
        Object obj;
        Gift gift;
        C31592Caa c31592Caa = (C31592Caa) this.l0;
        int i = 0;
        boolean z = false;
        if (!c31592Caa.LIZ.LIZ.isEmpty() || !((C31592Caa) this.l0).LIZIZ.LIZ.isEmpty()) {
            GiftHighTrafficDropMessageSetting giftHighTrafficDropMessageSetting = GiftHighTrafficDropMessageSetting.INSTANCE;
            int i2 = giftHighTrafficDropMessageSetting.getConfig().insertSmallGiftNum;
            int LIZ = ((C31592Caa) this.l0).LIZ.LIZ();
            if (i2 > LIZ) {
                i2 = LIZ;
            }
            if (i2 < 1) {
                i2 = 1;
            }
            int i3 = giftHighTrafficDropMessageSetting.getConfig().insertBigGiftNum;
            int LIZ2 = ((C31592Caa) this.l0).LIZIZ.LIZ();
            if (i3 > LIZ2) {
                i3 = LIZ2;
            }
            if (i3 < 1) {
                i3 = 1;
            }
            int i4 = 0;
            do {
                GiftMessage poll = ((C31592Caa) this.l0).LIZ.LIZ.poll();
                StringBuilder LIZ3 = X1D.LIZ();
                LIZ3.append("poll gift -> ");
                Object obj2 = null;
                if (poll != null) {
                    user = poll.fromUser;
                } else {
                    user = null;
                }
                LIZ3.append(C05170If.LIZ(user));
                LIZ3.append(" / ");
                if (poll != null && (gift = poll.mGift) != null) {
                    obj = Long.valueOf(gift.id);
                } else {
                    obj = null;
                }
                LIZ3.append(obj);
                LIZ3.append(" / ");
                if (poll != null) {
                    obj2 = Integer.valueOf(poll.comboCount);
                }
                LIZ3.append(obj2);
                Logger.i("Haha", X1D.LIZIZ(LIZ3));
                if (poll != null) {
                    ((InterfaceC88472Yns) this.l1).invoke(poll);
                }
                i4++;
            } while (i4 < i2);
            do {
                GiftMessage poll2 = ((C31592Caa) this.l0).LIZIZ.LIZ.poll();
                if (poll2 != null) {
                    ((InterfaceC88472Yns) this.l1).invoke(poll2);
                }
                i++;
            } while (i < i3);
            if (GiftReceiveMsgThreadSetting.INSTANCE.getMultiThread()) {
                C39202Fa2 c39202Fa2 = C39202Fa2.LIZ;
                ARunnableS24S0200000_5 aRunnableS24S0200000_5 = new ARunnableS24S0200000_5((C31592Caa) this.l0, (InterfaceC88472Yns) this.l1, 47);
                long j = GiftHighTrafficDropMessageSetting.INSTANCE.getConfig().insertInterval;
                Handler handler = C39202Fa2.LIZLLL;
                if (handler == null) {
                    HandlerThread handlerThread = C39202Fa2.LIZJ;
                    if (handlerThread == null) {
                        synchronized (c39202Fa2) {
                            handlerThread = new HandlerThread("Common_Handler_Thread");
                            C39202Fa2.LIZJ = handlerThread;
                            handlerThread.start();
                        }
                    }
                    handler = new Handler(handlerThread.getLooper());
                    C39202Fa2.LIZLLL = handler;
                }
                handler.postDelayed(aRunnableS24S0200000_5, j);
            } else {
                C31592Caa c31592Caa2 = (C31592Caa) this.l0;
                c31592Caa2.LIZLLL.postDelayed(new ARunnableS24S0200000_5(c31592Caa2, (InterfaceC88472Yns) this.l1, 48), GiftHighTrafficDropMessageSetting.INSTANCE.getConfig().insertInterval);
            }
            z = true;
        }
        c31592Caa.LIZJ = z;
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [X.OSZ, O] */
    public final void LIZ$14() {
        int i;
        Resources resources;
        DataChannel dataChannel = ((LivePreviewPlayerVM) this.l0).getDataChannel();
        if (dataChannel != null) {
            Integer valueOf = Integer.valueOf(((ViewGroup) this.l1).getWidth());
            int height = ((ViewGroup) this.l1).getHeight();
            Context context = ((ViewGroup) this.l1).getContext();
            if (context != null && (resources = context.getResources()) != null) {
                i = resources.getDimensionPixelSize(R.dimen.a8c);
            } else {
                i = 0;
            }
            ((C32537Cpp) dataChannel.gv0(BD2.class)).LIZ = new OSZ(valueOf, Integer.valueOf(height + i));
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Integer, O] */
    public final void LIZ$15() {
        DataChannel dataChannel = ((C30087BrP) this.l0).LJLLI;
        if (dataChannel != null) {
            ((C32537Cpp) dataChannel.gv0(C30180Bsu.class)).LIZ = Integer.valueOf(((View) this.l1).getHeight());
            C30087BrP c30087BrP = (C30087BrP) this.l0;
            InterfaceC30182Bsw interfaceC30182Bsw = c30087BrP.LJLJLJ;
            if (interfaceC30182Bsw != null) {
                interfaceC30182Bsw.setOnSizeChangedListener(new C30179Bst(c30087BrP));
                return;
            }
            return;
        }
        o.LJIJI("mDataChannel");
        throw null;
    }

    public final void LIZ$16() {
        ((PreviewBaseSlotWidget) this.l0).LLII((BroadcastSettingResponse) this.l1);
        HashMap hashMap = new HashMap();
        hashMap.put("param_live_slot_start_time_long", String.valueOf(((PreviewBaseSlotWidget) this.l0).LJLJL));
        hashMap.put("param_live_slot_api_end_time_long", String.valueOf(((PreviewBaseSlotWidget) this.l0).LJLJLJ));
        InterfaceC31095CIh interfaceC31095CIh = ((PreviewBaseSlotWidget) this.l0).LJLJI;
        if (interfaceC31095CIh != null) {
            interfaceC31095CIh.putData("param_live_show_time", hashMap);
        }
        if (!((PreviewBaseSlotWidget) this.l0).LLFZ((BroadcastSettingResponse) this.l1)) {
            ((PreviewBaseSlotWidget) this.l0).LLFII();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1, types: [com.bytedance.android.livesdk.model.RoomSticker, com.bytedance.android.livesdk.model.Sticker, O] */
    public final void LIZ$17() {
        Integer num;
        List<??> list = (List) this.l0;
        DecorationWrapperWidget decorationWrapperWidget = (DecorationWrapperWidget) this.l1;
        for (?? r3 : list) {
            decorationWrapperWidget.LJZ(r3);
            if (!decorationWrapperWidget.LJLJLLL) {
                C29598BjW.LIZLLL(decorationWrapperWidget.dataChannel, r3);
            }
            if (decorationWrapperWidget.LJLJLLL) {
                if (r3 != 0) {
                    num = Integer.valueOf(r3.type);
                } else {
                    num = null;
                }
                if (num != null) {
                    if (num.intValue() == 5 || num.intValue() == 6) {
                        decorationWrapperWidget.LJLIL = true;
                    } else if (num.intValue() == 4) {
                        decorationWrapperWidget.LJLILLLLZI = true;
                    }
                }
                C29598BjW.LIZIZ(decorationWrapperWidget.dataChannel, r3);
                if (r3 != 0) {
                    DataChannel dataChannel = decorationWrapperWidget.dataChannel;
                    if (dataChannel != null) {
                        ((C32537Cpp) dataChannel.gv0(C55612Gf.class)).LIZ = r3;
                    }
                    C29598BjW.LIZ = SystemClock.elapsedRealtime();
                }
                decorationWrapperWidget.LJZL(r3, true);
                if (r3 != 0 && C46104I7o.LJJIJL(r3)) {
                    decorationWrapperWidget.LL(r3);
                }
            }
        }
    }

    public final void LIZ$18() {
        Long l;
        DataChannel dataChannel = ((QuestionCardWidget) this.l0).dataChannel;
        if (dataChannel != null && (l = (Long) dataChannel.kv0(BCN.class)) != null) {
            ((QuestionCardWidget) this.l0).LJLJLJ.LIZ(C1EW.LIZ(((QAApi) C1A.LIZJ(QAApi.class)).startAnswer(l.longValue(), ((QuestionEx) this.l1).question.questionId, 3)).LJJJLIIL(new AfS57S0100000_5((QuestionCardWidget) this.l0, 252), C28872BUu.LJLIL));
        }
    }

    public final void LIZ$19() {
        Boolean bool;
        InterfaceC30237Btp interfaceC30237Btp;
        InterfaceC30237Btp interfaceC30237Btp2 = ((BNJ) this.l0).LJLILLLLZI;
        View view = null;
        if (interfaceC30237Btp2 != null) {
            view = interfaceC30237Btp2.LIZ(R.id.lsd);
        }
        if (view != null) {
            view.setBackgroundResource(0);
        }
        DataChannel dataChannel = (DataChannel) this.l1;
        if (dataChannel != null && (bool = (Boolean) dataChannel.kv0(BNK.class)) != null && bool.booleanValue() && (interfaceC30237Btp = ((BNJ) this.l0).LJLILLLLZI) != null) {
            ViewGroup.LayoutParams layoutParams = interfaceC30237Btp.getLayoutParams();
            o.LJII(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.height = C15380j0.LIZ(36.0f);
            marginLayoutParams.width = C15380j0.LIZ(44.0f);
            marginLayoutParams.setMarginStart(0);
            marginLayoutParams.setMarginEnd(0);
            interfaceC30237Btp.setLayoutParams(marginLayoutParams);
        }
        LiveIconView liveIconView = ((BNJ) this.l0).LJLJI;
        if (liveIconView == null) {
            return;
        }
        liveIconView.setBackground(new ColorDrawable(0));
    }

    public final void LIZ$2() {
        if (((C31699CcJ) this.l0).LJLJLJ <= 0 && ((FrameLayout) this.l1).getLayoutParams().width > 0) {
            ((C31699CcJ) this.l0).LJLJLJ = ((FrameLayout) this.l1).getLayoutParams().width;
        }
        if (((C31699CcJ) this.l0).LJLJLLL <= 0 && ((FrameLayout) this.l1).getLayoutParams().height > 0) {
            ((C31699CcJ) this.l0).LJLJLLL = ((FrameLayout) this.l1).getLayoutParams().height;
        }
    }

    public final void LIZ$20() {
        Long l;
        List list = (List) this.l0;
        GameCategoryListFragment gameCategoryListFragment = (GameCategoryListFragment) this.l1;
        int i = 0;
        for (Object obj : list) {
            int i2 = i + 1;
            C0A2 c0a2 = null;
            if (i >= 0) {
                Long l2 = ((GameTag) obj).id;
                GameTag gameTag = gameCategoryListFragment.LJLJI;
                if (gameTag != null) {
                    l = gameTag.id;
                } else {
                    l = null;
                }
                if (o.LJ(l2, l)) {
                    RecyclerView recyclerView = (RecyclerView) gameCategoryListFragment._$_findCachedViewById(R.id.j_1);
                    if (recyclerView != null) {
                        c0a2 = recyclerView.getLayoutManager();
                    }
                    if (c0a2 instanceof LinearLayoutManager) {
                        ((LinearLayoutManager) c0a2).LJFF(i, 0);
                    }
                }
                i = i2;
            } else {
                C47261Igj.LJJJJJ();
                throw null;
            }
        }
    }

    public final void LIZ$23() {
        C29929Bor c29929Bor = new C29929Bor();
        String str = ((C30988CEe) this.l0).LIZ;
        SubscriptionSettingFragmentNew subscriptionSettingFragmentNew = (SubscriptionSettingFragmentNew) this.l1;
        C32364Cn2 c32364Cn2 = new C32364Cn2(LiveSubscribeEntryShareUrl.INSTANCE.getValue());
        subscriptionSettingFragmentNew.getClass();
        SubscriptionSettingFragmentNew.vl(c32364Cn2);
        c32364Cn2.LIZJ("show_entrance", "host_share_notification");
        String uri = UriProtector.parse(c32364Cn2.LIZLLL()).toString();
        SubscriptionSettingFragmentNew subscriptionSettingFragmentNew2 = (SubscriptionSettingFragmentNew) this.l1;
        C32364Cn2 c32364Cn22 = new C32364Cn2(LiveSubscribeEntryShareOutUrl.INSTANCE.getValue());
        subscriptionSettingFragmentNew2.getClass();
        SubscriptionSettingFragmentNew.vl(c32364Cn22);
        c32364Cn22.LIZJ("show_entrance", "share_link");
        c32364Cn22.LIZJ("cover_url", ((C30988CEe) this.l0).LIZIZ);
        String LIZ = C87095YGd.LIZ(((IHostAppContext) CN1.LIZ(IHostAppContext.class)).currentLocale());
        o.LJIIIIZZ(LIZ, "getWebcastLanguage(\n    …                        )");
        c32364Cn22.LIZJ("lang", LIZ);
        String uri2 = UriProtector.parse(c32364Cn22.LIZLLL()).toString();
        String LJIILL = C15380j0.LJIILL(R.string.o9j, C05170If.LIZLLL(((C29374Bfu) B83.LIZ().LIZIZ()).LJ()));
        List LJJIJ = C47261Igj.LJJIJ(C05170If.LIZLLL(((C29374Bfu) B83.LIZ().LIZIZ()).LJ()));
        String LJIILJJIL = C15380j0.LJIILJJIL(R.string.o9g);
        String LJIILJJIL2 = C15380j0.LJIILJJIL(R.string.o9f);
        String LJIILJJIL3 = C15380j0.LJIILJJIL(R.string.o9h);
        String LJIILL2 = C15380j0.LJIILL(R.string.o9n, C05170If.LIZLLL(((C29374Bfu) B83.LIZ().LIZIZ()).LJ()));
        o.LJIIIIZZ(uri, "toString()");
        o.LJIIIIZZ(uri2, "toString()");
        C62819Ol5.LJ(c29929Bor, str, uri, uri2, LJIILL, "www.tiktok.com", LJIILJJIL, LJIILJJIL2, LJIILJJIL3, "dm_linkShare_liveSub_title", LJJIJ, "dm_linkShare_liveSub_preview_sender", "dm_push_preview_shared_a_link", "im_quote_link", LJIILL2, null, 699392);
        ((IHostShare) CN1.LIZ(IHostShare.class)).shareSubscribeLink(((SubscriptionSettingFragmentNew) this.l1).mo49getActivity(), new C29930Bos(c29929Bor), new C30987CEd((SubscriptionSettingFragmentNew) this.l1));
    }

    public final void LIZ$24() {
        Long l;
        List list = (List) this.l0;
        if (list != null) {
            PreviewHashtagListFragment previewHashtagListFragment = (PreviewHashtagListFragment) this.l1;
            int i = 0;
            for (Object obj : list) {
                int i2 = i + 1;
                C0A2 c0a2 = null;
                if (i >= 0) {
                    Long l2 = ((Hashtag) obj).id;
                    Hashtag hashtag = previewHashtagListFragment.LJLILLLLZI;
                    if (hashtag != null) {
                        l = hashtag.id;
                    } else {
                        l = null;
                    }
                    if (o.LJ(l2, l)) {
                        RecyclerView recyclerView = (RecyclerView) previewHashtagListFragment._$_findCachedViewById(R.id.lic);
                        if (recyclerView != null) {
                            c0a2 = recyclerView.getLayoutManager();
                        }
                        if (c0a2 instanceof LinearLayoutManager) {
                            ((LinearLayoutManager) c0a2).LJFF(i, 0);
                        }
                    }
                    i = i2;
                } else {
                    C47261Igj.LJJJJJ();
                    throw null;
                }
            }
        }
    }

    public final void LIZ$3() {
        int LJIIL;
        int LJIIJJI;
        int i;
        int i2;
        C0RV liveGoalAreaHelper = ((IEffectService) CN1.LIZ(IEffectService.class)).getLiveGoalAreaHelper();
        if (((View) this.l0).getWidth() > 0) {
            LJIIL = ((View) this.l0).getWidth();
        } else {
            LJIIL = C15380j0.LJIIL();
        }
        if (((View) this.l0).getHeight() > 0) {
            LJIIJJI = ((View) this.l0).getHeight();
        } else {
            LJIIJJI = C15380j0.LJIIJJI();
        }
        LiveBroadcastPreviewFragment liveBroadcastPreviewFragment = (LiveBroadcastPreviewFragment) this.l1;
        Integer num = liveBroadcastPreviewFragment.LLFII;
        Integer num2 = liveBroadcastPreviewFragment.LLFZ;
        liveGoalAreaHelper.getClass();
        if (num != null) {
            i = num.intValue();
        } else {
            i = 720;
        }
        if (num2 != null) {
            i2 = num2.intValue();
        } else {
            i2 = 1280;
        }
        C31661Mc.LIZJ = new StreamSize(LJIIL, LJIIJJI, i, i2);
    }

    public final void LIZ$4() {
        int i;
        int i2;
        Object obj;
        int LJIIL;
        int LJIIJJI;
        View view;
        View view2;
        View view3;
        View view4;
        LiveCore liveCore;
        LiveCore.Builder builder;
        LiveCore liveCore2;
        LiveCore.Builder builder2;
        CKO cko = ((LiveBroadcastFragment) this.l0).LLIIIL;
        if (cko != null && (liveCore2 = cko.LJ) != null && (builder2 = liveCore2.getBuilder()) != null) {
            i = builder2.getCaptureAdaptedWidth();
        } else {
            i = 720;
        }
        CKO cko2 = ((LiveBroadcastFragment) this.l0).LLIIIL;
        if (cko2 != null && (liveCore = cko2.LJ) != null && (builder = liveCore.getBuilder()) != null) {
            i2 = builder.getCaptureAdaptedHeight();
        } else {
            i2 = 1280;
        }
        C30658C1m c30658C1m = (C30658C1m) this.l1;
        if (c30658C1m.LJLJJLL) {
            VideoWidget videoWidget = ((LiveBroadcastFragment) this.l0).LLIIIZ;
            Object obj2 = null;
            if (videoWidget != null && (view4 = videoWidget.getView()) != null) {
                obj = view4.getParent();
            } else {
                obj = null;
            }
            if ((obj instanceof ViewGroup) && (view3 = (View) obj) != null) {
                LJIIL = view3.getWidth();
            } else {
                LJIIL = C15380j0.LJIIL();
            }
            VideoWidget videoWidget2 = ((LiveBroadcastFragment) this.l0).LLIIIZ;
            if (videoWidget2 != null && (view2 = videoWidget2.getView()) != null) {
                obj2 = view2.getParent();
            }
            if ((obj2 instanceof ViewGroup) && (view = (View) obj2) != null) {
                LJIIJJI = view.getHeight();
            } else {
                LJIIJJI = C15380j0.LJIIJJI();
            }
            String LIZ = C0WE.LIZ(LJIIL, LJIIJJI, i, i2, ((LiveBroadcastFragment) this.l0).getContext(), false);
            C30355Bvj.LIZJ().LJJ(LIZ);
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("setEffectAreaJsonStr: ");
            LIZ2.append(LIZ);
            C0NB.LIZIZ("LiveGoalEffect", X1D.LIZIZ(LIZ2));
        } else {
            String LIZJ = C0WE.LIZJ(c30658C1m.LJLIL, c30658C1m.LJLILLLLZI, Integer.valueOf(i), Integer.valueOf(i2), false);
            C30355Bvj.LIZJ().LJJ(LIZJ);
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append("setEffectAreaJsonStr: ");
            LIZ3.append(LIZJ);
            C0NB.LIZIZ("LiveGoalEffect", X1D.LIZIZ(LIZ3));
        }
        ((IEffectService) CN1.LIZ(IEffectService.class)).getLiveGoalEffectHelper();
        if (C31691Mf.LJIIIZ()) {
            InterfaceC08090Tl liveGoalEffectHelper = ((IEffectService) CN1.LIZ(IEffectService.class)).getLiveGoalEffectHelper();
            C30658C1m c30658C1m2 = (C30658C1m) this.l1;
            ((C31691Mf) liveGoalEffectHelper).LJIJ(c30658C1m2.LJLJJLL, true, Integer.valueOf(c30658C1m2.LJLIL), Integer.valueOf(((C30658C1m) this.l1).LJLILLLLZI));
        }
    }

    public final void LIZ$5() {
        Integer num;
        ((LiveBroadcastFragment) this.l0).Km();
        ((LiveBroadcastFragment) this.l0).hm(1);
        ((LiveBroadcastFragment) this.l0).Am((Cert) this.l1);
        Creator creator = ((LiveBroadcastFragment) this.l0).xl().creator;
        if (creator != null && (num = creator.roomContinue) != null) {
            LiveBroadcastFragment liveBroadcastFragment = (LiveBroadcastFragment) this.l0;
            OJY.LJIIL(10001, liveBroadcastFragment.Al(), liveBroadcastFragment.getRoomId(), liveBroadcastFragment.LLF, num.intValue());
        }
    }

    public final void LIZ$6() {
        C30087BrP c30087BrP = ((VideoBroadcastInteractionFragment) this.l0).LJLZ;
        if (c30087BrP != null) {
            c30087BrP.LIZLLL((Bundle) this.l1);
            GuidanceViewModel guidanceViewModel = (GuidanceViewModel) ViewModelProviders.of((VideoBroadcastInteractionFragment) this.l0).get(GuidanceViewModel.class);
            VideoBroadcastInteractionFragment videoBroadcastInteractionFragment = (VideoBroadcastInteractionFragment) this.l0;
            DataChannel dataChannel = videoBroadcastInteractionFragment.LJZ;
            if (dataChannel != null) {
                Room room = videoBroadcastInteractionFragment.LJZL;
                if (room != null) {
                    guidanceViewModel.getClass();
                    guidanceViewModel.LJLIL = dataChannel;
                    guidanceViewModel.LJLJI = videoBroadcastInteractionFragment;
                    guidanceViewModel.LJLILLLLZI = room;
                    XKX.LIZLLL(ViewModelKt.getViewModelScope(guidanceViewModel), null, null, new C30324BvE(guidanceViewModel, dataChannel, videoBroadcastInteractionFragment, null), 3);
                    VideoBroadcastInteractionFragment videoBroadcastInteractionFragment2 = (VideoBroadcastInteractionFragment) this.l0;
                    guidanceViewModel.LJLJL.observe(videoBroadcastInteractionFragment2, new AObserverS73S0100000_5(videoBroadcastInteractionFragment2, 20));
                    guidanceViewModel.LJLJLJ.observe(videoBroadcastInteractionFragment2, new AObserverS73S0100000_5(videoBroadcastInteractionFragment2, 21));
                    return;
                }
                o.LJIJI("mRoom");
                throw null;
            }
            o.LJIJI("mDataChannel");
            throw null;
        }
        o.LJIJI("commonInteractionFunctionHelper");
        throw null;
    }

    public final void LIZ$7() {
        View findViewById;
        VideoBroadcastInteractionFragment videoBroadcastInteractionFragment = (VideoBroadcastInteractionFragment) this.l0;
        Layer2PriorityManager layer2PriorityManager = (Layer2PriorityManager) this.l1;
        videoBroadcastInteractionFragment.getClass();
        if (TestDisableMixStreamTypeSetting.INSTANCE.getValue()) {
            LayeredWidgetManager layeredWidgetManager = videoBroadcastInteractionFragment.LJZI;
            if (layeredWidgetManager != null) {
                layeredWidgetManager.load(videoBroadcastInteractionFragment._$_findCachedViewById(R.id.klj), C7N.LJIJI().rF());
            } else {
                o.LJIJI("mWidgetManager");
                throw null;
            }
        }
        LiveGiftPollEffectWidget bv0 = C7N.LJIJI().bv0();
        IRoomFunctionService LJIJI = C7N.LJIJI();
        LayeredWidgetManager layeredWidgetManager2 = videoBroadcastInteractionFragment.LJZI;
        if (layeredWidgetManager2 != null) {
            LiveNormalPollEffectWidget E10 = LJIJI.E10(layeredWidgetManager2);
            if (E10 != null) {
                LayeredWidgetManager layeredWidgetManager3 = videoBroadcastInteractionFragment.LJZI;
                if (layeredWidgetManager3 != null) {
                    layeredWidgetManager3.load(R.id.fxi, E10);
                } else {
                    o.LJIJI("mWidgetManager");
                    throw null;
                }
            }
            if (bv0 != null) {
                LayeredWidgetManager layeredWidgetManager4 = videoBroadcastInteractionFragment.LJZI;
                if (layeredWidgetManager4 != null) {
                    layeredWidgetManager4.load(R.id.fwx, bv0);
                } else {
                    o.LJIJI("mWidgetManager");
                    throw null;
                }
            }
            LayeredWidgetManager layeredWidgetManager5 = videoBroadcastInteractionFragment.LJZI;
            if (layeredWidgetManager5 != null) {
                layeredWidgetManager5.load(R.id.dno, C7N.LJIJJLI().getFreeFrameSlotWidget());
                DataChannel dataChannel = videoBroadcastInteractionFragment.LJZ;
                if (dataChannel != null) {
                    dataChannel.ov0(videoBroadcastInteractionFragment, StartPushStreamChannel.class, new AqS171S0100000_5(videoBroadcastInteractionFragment, 258));
                    dataChannel.mv0(LinkCrossRoomStateChangeEvent.class, videoBroadcastInteractionFragment, new AqS171S0100000_5(videoBroadcastInteractionFragment, 259));
                    dataChannel.mv0(LinkRandomLinkMicChangeTipTextEvent.class, videoBroadcastInteractionFragment, new AqS171S0100000_5(videoBroadcastInteractionFragment, 260));
                    dataChannel.lv0(videoBroadcastInteractionFragment, DrawGuessCaptureImageChannel.class, new AqS171S0100000_5(videoBroadcastInteractionFragment, 261));
                    dataChannel.ov0(videoBroadcastInteractionFragment, StickerSelectedEvent.class, new AqS171S0100000_5(videoBroadcastInteractionFragment, 262));
                    dataChannel.ov0(videoBroadcastInteractionFragment, StickerCancelChannel.class, new AqS171S0100000_5(videoBroadcastInteractionFragment, 263));
                    dataChannel.lv0(videoBroadcastInteractionFragment, LiveGoalEffectChannel.class, C30289Buf.LJLIL);
                    dataChannel.lv0(videoBroadcastInteractionFragment, MoveLiveGoalEffectEvent.class, C30286Buc.LJLIL);
                    dataChannel.lv0(videoBroadcastInteractionFragment, ExposureCompensationVisibleChannel.class, new AqS171S0100000_5(videoBroadcastInteractionFragment, 253));
                    dataChannel.lv0(videoBroadcastInteractionFragment, RefreshExposureCompensationViewChannel.class, new AqS171S0100000_5(videoBroadcastInteractionFragment, 254));
                    if (LiveMemoryOptSetting.INSTANCE.enableMemoryOpt()) {
                        DataChannel dataChannel2 = videoBroadcastInteractionFragment.LJZ;
                        if (dataChannel2 != null) {
                            dataChannel2.lv0(videoBroadcastInteractionFragment, LiveCenterAlpha.class, new AqS171S0100000_5(videoBroadcastInteractionFragment, 255));
                            dataChannel2.lv0(videoBroadcastInteractionFragment, LiveCenterStatusChannel.class, new AqS171S0100000_5(videoBroadcastInteractionFragment, 256));
                        } else {
                            o.LJIJI("mDataChannel");
                            throw null;
                        }
                    }
                    LayeredWidgetManager layeredWidgetManager6 = videoBroadcastInteractionFragment.LJZI;
                    if (layeredWidgetManager6 != null) {
                        layeredWidgetManager6.load(R.id.j6m, C7N.LJI().SF(layer2PriorityManager));
                        LayeredWidgetManager layeredWidgetManager7 = videoBroadcastInteractionFragment.LJZI;
                        if (layeredWidgetManager7 != null) {
                            View pause_live_bg = videoBroadcastInteractionFragment._$_findCachedViewById(R.id.hiz);
                            o.LJIIIIZZ(pause_live_bg, "pause_live_bg");
                            layeredWidgetManager7.load(R.id.hj2, new PauseLiveWidget(pause_live_bg));
                            LayeredWidgetManager layeredWidgetManager8 = videoBroadcastInteractionFragment.LJZI;
                            if (layeredWidgetManager8 != null) {
                                View captcha_live_bg = videoBroadcastInteractionFragment._$_findCachedViewById(R.id.b4h);
                                o.LJIIIIZZ(captcha_live_bg, "captcha_live_bg");
                                layeredWidgetManager8.load(R.id.b4i, new CaptchaLiveWidget(captcha_live_bg));
                                LayeredWidgetManager layeredWidgetManager9 = videoBroadcastInteractionFragment.LJZI;
                                if (layeredWidgetManager9 != null) {
                                    layeredWidgetManager9.load(R.id.epn, ((IInteractService) CN1.LIZ(IInteractService.class)).EF());
                                    DataChannel dataChannel3 = videoBroadcastInteractionFragment.LJZ;
                                    if (dataChannel3 != null) {
                                        if (C1DH.LJJIIJ(dataChannel3)) {
                                            LayeredWidgetManager layeredWidgetManager10 = videoBroadcastInteractionFragment.LJZI;
                                            if (layeredWidgetManager10 != null) {
                                                layeredWidgetManager10.load(R.id.ijo, ((IQAService) CN1.LIZ(IQAService.class)).ck());
                                            } else {
                                                o.LJIJI("mWidgetManager");
                                                throw null;
                                            }
                                        }
                                        if (TestEnableLiveCoreSetting.INSTANCE.enable()) {
                                            videoBroadcastInteractionFragment.Al();
                                        } else {
                                            View view = videoBroadcastInteractionFragment.getView();
                                            if (view != null && (findViewById = view.findViewById(R.id.l2s)) != null) {
                                                C29306Beo.LJJLJLI(findViewById);
                                                C16880lQ.LJIIJ(new ACListenerS25S0100000_5(videoBroadcastInteractionFragment, 123), findViewById);
                                            }
                                        }
                                        if (!LiveCenterLayoutStyleSetting.INSTANCE.enableNewStyle()) {
                                            LayeredWidgetManager layeredWidgetManager11 = videoBroadcastInteractionFragment.LJZI;
                                            if (layeredWidgetManager11 != null) {
                                                layeredWidgetManager11.load(R.id.fvk, new LiveCenterEntranceWidget());
                                            } else {
                                                o.LJIJI("mWidgetManager");
                                                throw null;
                                            }
                                        } else {
                                            LayeredWidgetManager layeredWidgetManager12 = videoBroadcastInteractionFragment.LJZI;
                                            if (layeredWidgetManager12 != null) {
                                                NetSpeedMonitorWidget netSpeedMonitorWidget = new NetSpeedMonitorWidget();
                                                videoBroadcastInteractionFragment.LJLJLJ = netSpeedMonitorWidget;
                                                layeredWidgetManager12.load(R.id.gyq, netSpeedMonitorWidget);
                                            } else {
                                                o.LJIJI("mWidgetManager");
                                                throw null;
                                            }
                                        }
                                        DataChannel dataChannel4 = videoBroadcastInteractionFragment.LJZ;
                                        if (dataChannel4 != null) {
                                            if (C30791C6p.LIZ((Room) dataChannel4.kv0(RoomChannel.class)) && videoBroadcastInteractionFragment.LJLJLJ == null) {
                                                LayeredWidgetManager layeredWidgetManager13 = videoBroadcastInteractionFragment.LJZI;
                                                if (layeredWidgetManager13 != null) {
                                                    NetSpeedMonitorWidget netSpeedMonitorWidget2 = new NetSpeedMonitorWidget();
                                                    videoBroadcastInteractionFragment.LJLJLJ = netSpeedMonitorWidget2;
                                                    layeredWidgetManager13.load(R.id.gyq, netSpeedMonitorWidget2);
                                                } else {
                                                    o.LJIJI("mWidgetManager");
                                                    throw null;
                                                }
                                            }
                                            if (LiveBroadcastPoorDeviceDowngradeSetting.INSTANCE.enable()) {
                                                B73.LIZ().postDelayed(new ARunnableS41S0100000_5(videoBroadcastInteractionFragment, 94), LiveBroadcastPoorDeviceDelayDurationSetting.INSTANCE.value());
                                            } else {
                                                LayeredWidgetManager layeredWidgetManager14 = videoBroadcastInteractionFragment.LJZI;
                                                if (layeredWidgetManager14 != null) {
                                                    BroadcastFilterStyleWidget broadcastFilterStyleWidget = new BroadcastFilterStyleWidget();
                                                    videoBroadcastInteractionFragment.LJLJL = broadcastFilterStyleWidget;
                                                    layeredWidgetManager14.load(R.id.d_c, broadcastFilterStyleWidget);
                                                } else {
                                                    o.LJIJI("mWidgetManager");
                                                    throw null;
                                                }
                                            }
                                            LayeredWidgetManager layeredWidgetManager15 = videoBroadcastInteractionFragment.LJZI;
                                            if (layeredWidgetManager15 != null) {
                                                IDecorationService iDecorationService = (IDecorationService) CN1.LIZ(IDecorationService.class);
                                                LayeredWidgetManager layeredWidgetManager16 = videoBroadcastInteractionFragment.LJZI;
                                                if (layeredWidgetManager16 != null) {
                                                    layeredWidgetManager15.load(R.id.fvv, iDecorationService.Sp0(layeredWidgetManager16));
                                                    if (LiveGoal2GreenScreenSetting.INSTANCE.getEnable()) {
                                                        LayeredWidgetManager layeredWidgetManager17 = videoBroadcastInteractionFragment.LJZI;
                                                        if (layeredWidgetManager17 != null) {
                                                            layeredWidgetManager17.load(R.id.fx0, ((IEffectService) CN1.LIZ(IEffectService.class)).getLiveGoalEffectWidget());
                                                        } else {
                                                            o.LJIJI("mWidgetManager");
                                                            throw null;
                                                        }
                                                    }
                                                    if (LiveKaraokeSetting.INSTANCE.enable() && !BYI.LIZIZ(BWZ.PAID_LIVE_EVENT) && !BYI.LIZIZ(BWZ.SUB_ONLY) && !BYI.LIZIZ(BWZ.COMMERCE)) {
                                                        LayeredWidgetManager layeredWidgetManager18 = videoBroadcastInteractionFragment.LJZI;
                                                        if (layeredWidgetManager18 != null) {
                                                            layeredWidgetManager18.load(R.id.fdl, ((IEffectService) CN1.LIZ(IEffectService.class)).getKaraokeHoverWidget());
                                                        } else {
                                                            o.LJIJI("mWidgetManager");
                                                            throw null;
                                                        }
                                                    }
                                                    DataChannel dataChannel5 = videoBroadcastInteractionFragment.LJZ;
                                                    if (dataChannel5 != null) {
                                                        ((IEffectService) CN1.LIZ(IEffectService.class)).getLiveEffectDataProvider().LJFF(dataChannel5);
                                                        DataChannel dataChannel6 = videoBroadcastInteractionFragment.LJZ;
                                                        if (dataChannel6 != null) {
                                                            ((IEffectService) CN1.LIZ(IEffectService.class)).getLiveEffectDataProvider().LJI(dataChannel6);
                                                            ARunnableS41S0100000_5 aRunnableS41S0100000_5 = new ARunnableS41S0100000_5(videoBroadcastInteractionFragment, 95);
                                                            DataChannel dataChannel7 = videoBroadcastInteractionFragment.LJZ;
                                                            if (dataChannel7 != null) {
                                                                B73.LIZIZ(aRunnableS41S0100000_5, dataChannel7);
                                                                DataChannel dataChannel8 = videoBroadcastInteractionFragment.LJZ;
                                                                if (dataChannel8 != null) {
                                                                    dataChannel8.lv0(videoBroadcastInteractionFragment, LiveGameEffectFetchedChannel.class, C30307Bux.LJLIL);
                                                                    dataChannel8.lv0(videoBroadcastInteractionFragment, LiveGameEffectFetchFailedEvent.class, C30297Bun.LJLIL);
                                                                    dataChannel8.lv0(videoBroadcastInteractionFragment, DrawGuessStartGameEvent.class, new AqS171S0100000_5(videoBroadcastInteractionFragment, 265));
                                                                    dataChannel8.lv0(videoBroadcastInteractionFragment, DrawGuessExitGameEvent.class, new AqS171S0100000_5(videoBroadcastInteractionFragment, 268));
                                                                    dataChannel8.lv0(videoBroadcastInteractionFragment, DrawGuessIsCountingDownRoundStart.class, new AqS171S0100000_5(videoBroadcastInteractionFragment, 270));
                                                                    dataChannel8.lv0(videoBroadcastInteractionFragment, DrawGuessFreelyStartChannel.class, new AqS171S0100000_5(videoBroadcastInteractionFragment, 272));
                                                                    C0WR liveEffectDataProvider = ((IEffectService) CN1.LIZ(IEffectService.class)).getLiveEffectDataProvider();
                                                                    DataChannel dataChannel9 = videoBroadcastInteractionFragment.LJZ;
                                                                    if (dataChannel9 != null) {
                                                                        liveEffectDataProvider.LIZIZ(dataChannel9);
                                                                        videoBroadcastInteractionFragment.LJLJLLL = C7N.LJIJI().mR(videoBroadcastInteractionFragment);
                                                                        videoBroadcastInteractionFragment.LJLL = C7N.LJIJI().Qz();
                                                                        videoBroadcastInteractionFragment.LJLLI = C7N.LJIJI().yG();
                                                                        LayeredWidgetManager layeredWidgetManager19 = videoBroadcastInteractionFragment.LJZI;
                                                                        if (layeredWidgetManager19 != null) {
                                                                            layeredWidgetManager19.load(R.id.ch9, videoBroadcastInteractionFragment.LJLJLLL);
                                                                            LayeredWidgetManager layeredWidgetManager20 = videoBroadcastInteractionFragment.LJZI;
                                                                            if (layeredWidgetManager20 != null) {
                                                                                layeredWidgetManager20.load(R.id.ch5, videoBroadcastInteractionFragment.LJLL);
                                                                                LayeredWidgetManager layeredWidgetManager21 = videoBroadcastInteractionFragment.LJZI;
                                                                                if (layeredWidgetManager21 != null) {
                                                                                    layeredWidgetManager21.load(R.id.ch8, videoBroadcastInteractionFragment.LJLLI);
                                                                                    if (LiveEffectShortcutPanelTypeSetting.INSTANCE.getValue() != 0) {
                                                                                        LayeredWidgetManager layeredWidgetManager22 = videoBroadcastInteractionFragment.LJZI;
                                                                                        if (layeredWidgetManager22 != null) {
                                                                                            layeredWidgetManager22.load(R.id.jz8, new ShortCutPanelPalletWidget());
                                                                                        } else {
                                                                                            o.LJIJI("mWidgetManager");
                                                                                            throw null;
                                                                                        }
                                                                                    }
                                                                                    LayeredWidgetManager layeredWidgetManager23 = videoBroadcastInteractionFragment.LJZI;
                                                                                    if (layeredWidgetManager23 != null) {
                                                                                        layeredWidgetManager23.load(R.id.jz6, new ShortCutPanelWidget());
                                                                                        LiveWidget pinCardWidget = ((IGiftService) CN1.LIZ(IGiftService.class)).getPinCardWidget();
                                                                                        LayeredWidgetManager layeredWidgetManager24 = videoBroadcastInteractionFragment.LJZI;
                                                                                        if (layeredWidgetManager24 != null) {
                                                                                            layeredWidgetManager24.load(R.id.hpi, (Widget) pinCardWidget, false);
                                                                                            if (LiveAudioMuteTypeSetting.INSTANCE.canShowMuteMicLayout()) {
                                                                                                LayeredWidgetManager layeredWidgetManager25 = videoBroadcastInteractionFragment.LJZI;
                                                                                                if (layeredWidgetManager25 != null) {
                                                                                                    layeredWidgetManager25.load(R.id.guv, new MuteMicWidget());
                                                                                                } else {
                                                                                                    o.LJIJI("mWidgetManager");
                                                                                                    throw null;
                                                                                                }
                                                                                            }
                                                                                            if (C30922CBq.LIZIZ && LiveAnchorEnableVideoMockPushStream.INSTANCE.getValue()) {
                                                                                                LayeredWidgetManager layeredWidgetManager26 = videoBroadcastInteractionFragment.LJZI;
                                                                                                if (layeredWidgetManager26 != null) {
                                                                                                    layeredWidgetManager26.load(R.id.gl4, new MockVideoControlWidget());
                                                                                                } else {
                                                                                                    o.LJIJI("mWidgetManager");
                                                                                                    throw null;
                                                                                                }
                                                                                            }
                                                                                            DataChannelGlobal.LJLJJI.nv0(videoBroadcastInteractionFragment, videoBroadcastInteractionFragment, OpenLiveGoalPanelChannel.class, new AqS171S0100000_5(videoBroadcastInteractionFragment, 257));
                                                                                            return;
                                                                                        }
                                                                                        o.LJIJI("mWidgetManager");
                                                                                        throw null;
                                                                                    }
                                                                                    o.LJIJI("mWidgetManager");
                                                                                    throw null;
                                                                                }
                                                                                o.LJIJI("mWidgetManager");
                                                                                throw null;
                                                                            }
                                                                            o.LJIJI("mWidgetManager");
                                                                            throw null;
                                                                        }
                                                                        o.LJIJI("mWidgetManager");
                                                                        throw null;
                                                                    }
                                                                    o.LJIJI("mDataChannel");
                                                                    throw null;
                                                                }
                                                                o.LJIJI("mDataChannel");
                                                                throw null;
                                                            }
                                                            o.LJIJI("mDataChannel");
                                                            throw null;
                                                        }
                                                        o.LJIJI("mDataChannel");
                                                        throw null;
                                                    }
                                                    o.LJIJI("mDataChannel");
                                                    throw null;
                                                }
                                                o.LJIJI("mWidgetManager");
                                                throw null;
                                            }
                                            o.LJIJI("mWidgetManager");
                                            throw null;
                                        }
                                        o.LJIJI("mDataChannel");
                                        throw null;
                                    }
                                    o.LJIJI("mDataChannel");
                                    throw null;
                                }
                                o.LJIJI("mWidgetManager");
                                throw null;
                            }
                            o.LJIJI("mWidgetManager");
                            throw null;
                        }
                        o.LJIJI("mWidgetManager");
                        throw null;
                    }
                    o.LJIJI("mWidgetManager");
                    throw null;
                }
                o.LJIJI("mDataChannel");
                throw null;
            }
            o.LJIJI("mWidgetManager");
            throw null;
        }
        o.LJIJI("mWidgetManager");
        throw null;
    }

    public final void LIZ$8() {
        ((TextView) ((VideoBroadcastInteractionFragment) this.l1)._$_findCachedViewById(R.id.asy)).setText("cpu: " + ((String) ((Map) this.l0).get("cpu")) + "\nbitrate: " + ((String) ((Map) this.l0).get("bitrate")) + "\nresolution_width: " + ((String) ((Map) this.l0).get("resolution_width")) + "\nresolution_height: " + ((String) ((Map) this.l0).get("resolution_height")) + "\nvideo_capture_width: " + ((String) ((Map) this.l0).get("video_capture_width")) + "\nvideo_capture_height: " + ((String) ((Map) this.l0).get("video_capture_height")) + "\npush_fps: " + ((String) ((Map) this.l0).get("push_fps")) + "\npreview_fps: " + ((String) ((Map) this.l0).get("preview_fps")) + "\nin_cap_fps: " + ((String) ((Map) this.l0).get("in_cap_fps")) + "\nout_cap_fps: " + ((String) ((Map) this.l0).get("out_cap_fps")) + "\nvideo_capture_fps: " + ((String) ((Map) this.l0).get("video_capture_fps")) + "\nencode_fps: " + ((String) ((Map) this.l0).get("encode_fps")) + "\nfps: " + ((String) ((Map) this.l0).get("fps")));
    }

    public final void LIZ$9() {
        if (!((CommentWidget) this.l1).isViewValid()) {
            return;
        }
        if (((CommentWidget) this.l1).LLIIII()) {
            LiveEmojiInputDialogFragment liveEmojiInputDialogFragment = ((CommentWidget) this.l1).LLILLIZIL;
            boolean z = ((C30926CBu) this.l0).LIZJ;
            if (!liveEmojiInputDialogFragment.isAdded() || liveEmojiInputDialogFragment.LJLLLL) {
                return;
            }
            if (liveEmojiInputDialogFragment.LJLLJ) {
                if (z) {
                    return;
                }
            } else if (!z) {
                return;
            }
            liveEmojiInputDialogFragment.LJLLJ = z;
            Y90 y90 = liveEmojiInputDialogFragment.LLIIL;
            if (y90 != null) {
                if (z) {
                    y90.LIZIZ(true);
                } else {
                    y90.LIZ();
                }
            }
            liveEmojiInputDialogFragment.Ol();
            return;
        }
        CommentWidget commentWidget = (CommentWidget) this.l1;
        InputAttrs inputAttrs = commentWidget.LLILLL;
        C30926CBu c30926CBu = (C30926CBu) this.l0;
        inputAttrs.isDanmuOpen = c30926CBu.LIZJ;
        commentWidget.LLIIJI(c30926CBu);
    }

    public final void LIZ$21() {
        if (ToolBarRefactor.enable()) {
            ((RecyclableWidgetManager) this.l0).load(R.id.lcv, ((IToolbarService) CN1.LIZ(IToolbarService.class)).EA(null, ((VoiceChatBroadcastInteractionFragment) this.l1).LJLJLLL), false);
            return;
        }
        RecyclableWidgetManager recyclableWidgetManager = (RecyclableWidgetManager) this.l0;
        Class<? extends LiveRecyclableWidget> Uu0 = ((IToolbarService) CN1.LIZ(IToolbarService.class)).Uu0();
        ((VoiceChatBroadcastInteractionFragment) this.l1).getClass();
        ArrayList arrayList = new ArrayList();
        arrayList.add(EnumC30204BtI.SLOT);
        arrayList.add(EnumC30204BtI.ANCHOR_SUBSCRIPTION);
        arrayList.add(EnumC30204BtI.INTERACTION_FEATURES);
        arrayList.add(EnumC30204BtI.SHARE);
        arrayList.add(EnumC30204BtI.EFFECT);
        arrayList.add(EnumC30204BtI.MORE);
        recyclableWidgetManager.load(R.id.lcv, Uu0, false, C61898ORa.LJJII(new C29726Bla(SystemClock.elapsedRealtime()), new Object[]{arrayList, C47261Igj.LJII(EnumC30204BtI.MULTIGUEST)}));
    }

    public final void LIZ$22() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("cpu: ");
        LIZ.append((String) ((Map) this.l0).get("cpu"));
        LIZ.append("\nbitrate: ");
        LIZ.append((String) ((Map) this.l0).get("bitrate"));
        LIZ.append("\nresolution_width: ");
        LIZ.append((String) ((Map) this.l0).get("resolution_width"));
        LIZ.append("\nresolution_height: ");
        LIZ.append((String) ((Map) this.l0).get("resolution_height"));
        LIZ.append("\npush_fps: ");
        LIZ.append((String) ((Map) this.l0).get("push_fps"));
        LIZ.append("\npreview_fps: ");
        LIZ.append((String) ((Map) this.l0).get("preview_fps"));
        LIZ.append("\nin_cap_fps: ");
        LIZ.append((String) ((Map) this.l0).get("in_cap_fps"));
        LIZ.append("\nout_cap_fps: ");
        LIZ.append((String) ((Map) this.l0).get("out_cap_fps"));
        LIZ.append("\nencode_fps: ");
        LIZ.append((String) ((Map) this.l0).get("encode_fps"));
        LIZ.append("\nfps: ");
        LIZ.append((String) ((Map) this.l0).get("fps"));
        ((TextView) ((VoiceChatBroadcastInteractionFragment) this.l1)._$_findCachedViewById(R.id.asy)).setText(X1D.LIZIZ(LIZ));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LIZ$25() {
        UploadResult uploadResult;
        String str;
        UploadResult uploadResult2;
        String str2;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("sub_share_link_upload_photo_");
        LIZ.append(System.currentTimeMillis());
        String LIZIZ = X1D.LIZIZ(LIZ);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ((Bitmap) this.l0).compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        o.LJIIIIZZ(byteArray, "byteArray");
        C28467BFf LJIILIIL = C31847Ceh.LJIILIIL(LIZIZ, byteArray);
        if (LJIILIIL == null || (uploadResult = (UploadResult) LJIILIIL.data) == null || (str = uploadResult.uri) == null || str.length() == 0) {
            ND2 nd2 = (ND2) this.l1;
            if (nd2 != null) {
                nd2.LIZ();
                return;
            }
            return;
        }
        if (LJIILIIL == null || (uploadResult2 = (UploadResult) LJIILIIL.data) == null || (str2 = uploadResult2.uri) == null || str2.length() == 0) {
            ND2 nd22 = (ND2) this.l1;
            if (nd22 == null) {
                return;
            }
            nd22.LIZ();
            return;
        }
        ND2 nd23 = (ND2) this.l1;
        if (nd23 == null) {
            return;
        }
        nd23.LIZJ(str2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0019, code lost:
    
        if (r2 > 0.0f) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ$26() {
        /*
            r3 = this;
            android.content.Context r0 = X.C15380j0.LIZLLL()
            boolean r0 = X.CCJ.LIZ(r0)
            if (r0 == 0) goto L23
            java.lang.Object r0 = r3.l0
            X.Bl4 r0 = (X.C29694Bl4) r0
            X.1t0 r0 = r0.LJI
            if (r0 == 0) goto L41
            float r2 = r0.getScaleX()
            r0 = 0
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 <= 0) goto L23
        L1b:
            java.lang.Object r0 = r3.l0
            X.Bl4 r0 = (X.C29694Bl4) r0
            X.1t0 r1 = r0.LJI
            if (r1 != 0) goto L3c
        L23:
            java.lang.Object r0 = r3.l0
            X.Bl4 r0 = (X.C29694Bl4) r0
            X.1t0 r0 = r0.LJI
            if (r0 == 0) goto L3b
            X.Vuj r2 = r0.getHierarchy()
            X.V92 r2 = (X.V92) r2
            if (r2 == 0) goto L3b
            java.lang.Object r1 = r3.l1
            android.graphics.drawable.Drawable r1 = (android.graphics.drawable.Drawable) r1
            r0 = 1
            r2.LJIILL(r1, r0)
        L3b:
            return
        L3c:
            float r0 = -r2
            r1.setScaleX(r0)
            goto L23
        L41:
            r2 = 1065353216(0x3f800000, float:1.0)
            goto L1b
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.ARunnableS24S0200000_5.LIZ$26():void");
    }

    public static final void run$0(ARunnableS24S0200000_5 aRunnableS24S0200000_5) {
        boolean LIZ;
        try {
            aRunnableS24S0200000_5.LIZ$0();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$1(ARunnableS24S0200000_5 aRunnableS24S0200000_5) {
        boolean LIZ;
        try {
            ((C32676Cs4) aRunnableS24S0200000_5.l0).LJJJLZIJ(((C72242sW) aRunnableS24S0200000_5.l1).element);
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$10(ARunnableS24S0200000_5 aRunnableS24S0200000_5) {
        boolean LIZ;
        try {
            aRunnableS24S0200000_5.LIZ$2();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$11(ARunnableS24S0200000_5 aRunnableS24S0200000_5) {
        boolean LIZ;
        int height;
        try {
            FrameL2SlotWidget frameL2SlotWidget = (FrameL2SlotWidget) aRunnableS24S0200000_5.l1;
            DataChannel dataChannel = frameL2SlotWidget.dataChannel;
            if (dataChannel != null) {
                if (((B4Q) aRunnableS24S0200000_5.l0).LIZIZ) {
                    height = 0;
                } else {
                    height = frameL2SlotWidget.LJLJI.getHeight();
                }
                dataChannel.rv0(FullBottomContainerHeightChannel.class, Integer.valueOf(height));
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$12(ARunnableS24S0200000_5 aRunnableS24S0200000_5) {
        boolean LIZ;
        try {
            aRunnableS24S0200000_5.LIZ$3();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$13(ARunnableS24S0200000_5 aRunnableS24S0200000_5) {
        boolean LIZ;
        try {
            InterfaceC30359Bvn interfaceC30359Bvn = ((LiveBroadcastPreviewFragment) aRunnableS24S0200000_5.l0).LJLZ;
            if (interfaceC30359Bvn != null) {
                interfaceC30359Bvn.openCamera((Cert) aRunnableS24S0200000_5.l1);
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$14(ARunnableS24S0200000_5 aRunnableS24S0200000_5) {
        boolean LIZ;
        try {
            aRunnableS24S0200000_5.LIZ$4();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$15(ARunnableS24S0200000_5 aRunnableS24S0200000_5) {
        boolean LIZ;
        try {
            aRunnableS24S0200000_5.LIZ$5();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$16(ARunnableS24S0200000_5 aRunnableS24S0200000_5) {
        boolean LIZ;
        try {
            aRunnableS24S0200000_5.LIZ$6();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$17(ARunnableS24S0200000_5 aRunnableS24S0200000_5) {
        boolean LIZ;
        try {
            aRunnableS24S0200000_5.LIZ$7();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$18(ARunnableS24S0200000_5 aRunnableS24S0200000_5) {
        boolean LIZ;
        try {
            aRunnableS24S0200000_5.LIZ$8();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$19(ARunnableS24S0200000_5 aRunnableS24S0200000_5) {
        boolean LIZ;
        VideoWidget videoWidget;
        try {
            VideoWidget videoWidget2 = ((LiveBroadcastFragment) aRunnableS24S0200000_5.l0).LLIIIZ;
            if (videoWidget2 != null) {
                videoWidget2.startStickerMessageManager();
            }
            if (((InterfaceC30313Bv3) aRunnableS24S0200000_5.l1).getFragment().isAdded() && (videoWidget = ((LiveBroadcastFragment) aRunnableS24S0200000_5.l0).LLIIIZ) != null) {
                videoWidget.setStickerLayout(((InterfaceC30313Bv3) aRunnableS24S0200000_5.l1).Lj(), ((InterfaceC30313Bv3) aRunnableS24S0200000_5.l1).getFragment().getChildFragmentManager());
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$2(ARunnableS24S0200000_5 aRunnableS24S0200000_5) {
        boolean LIZ;
        try {
            ((C32676Cs4) aRunnableS24S0200000_5.l0).LJJJLZIJ(((C72242sW) aRunnableS24S0200000_5.l1).element);
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$20(ARunnableS24S0200000_5 aRunnableS24S0200000_5) {
        boolean LIZ;
        try {
            C30087BrP c30087BrP = ((VoiceChatBroadcastInteractionFragment) aRunnableS24S0200000_5.l0).LJLIL;
            if (c30087BrP != null) {
                c30087BrP.LIZLLL((Bundle) aRunnableS24S0200000_5.l1);
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$21(ARunnableS24S0200000_5 aRunnableS24S0200000_5) {
        boolean LIZ;
        try {
            C30868C9o.LJ(((OperateToastMessage) aRunnableS24S0200000_5.l1).displayDuration, C15380j0.LIZLLL(), ((Spannable) aRunnableS24S0200000_5.l0).toString());
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$22(ARunnableS24S0200000_5 aRunnableS24S0200000_5) {
        AObjectS144S0100000_5 aObjectS144S0100000_5 = (AObjectS144S0100000_5) aRunnableS24S0200000_5.l0;
        C28212B5k c28212B5k = (C28212B5k) aRunnableS24S0200000_5.l1;
        aObjectS144S0100000_5.getClass();
        if (c28212B5k.LJIIIIZZ != null) {
            int[] iArr = new int[2];
            B35 b35 = ((LivePlayFragment) aObjectS144S0100000_5.l0).LLIIIJ;
            if (b35 != null) {
                b35.getVideoSize(iArr);
            }
            c28212B5k.LJIIIIZZ.J2(new C75234Tfq(iArr[0], iArr[1], c28212B5k.LIZLLL, c28212B5k.LIZJ, c28212B5k.LIZ, c28212B5k.LIZIZ, ((LivePlayFragment) aObjectS144S0100000_5.l0).LLILL.LIZ.getLeft(), ((LivePlayFragment) aObjectS144S0100000_5.l0).LLILL.LIZ.getTop(), ((LivePlayFragment) aObjectS144S0100000_5.l0).LLILL.LIZ.getWidth(), ((LivePlayFragment) aObjectS144S0100000_5.l0).LLILL.LIZ.getHeight()));
        }
    }

    public static final void run$23(ARunnableS24S0200000_5 aRunnableS24S0200000_5) {
        boolean LIZ;
        try {
            aRunnableS24S0200000_5.LIZ$9();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$24(ARunnableS24S0200000_5 aRunnableS24S0200000_5) {
        boolean LIZ;
        try {
            ((NewTopRightBannerWidget) aRunnableS24S0200000_5.l0).LLFF((CAA) aRunnableS24S0200000_5.l1);
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$25(ARunnableS24S0200000_5 aRunnableS24S0200000_5) {
        boolean LIZ;
        try {
            ((QuickCommentWidget) aRunnableS24S0200000_5.l0).LJZ("1", (JSONObject) aRunnableS24S0200000_5.l1);
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$26(ARunnableS24S0200000_5 aRunnableS24S0200000_5) {
        boolean LIZ;
        try {
            ((QuickCommentWidget) aRunnableS24S0200000_5.l0).LJZ("2", (JSONObject) aRunnableS24S0200000_5.l1);
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$27(ARunnableS24S0200000_5 aRunnableS24S0200000_5) {
        boolean LIZ;
        try {
            aRunnableS24S0200000_5.LIZ$10();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$28(ARunnableS24S0200000_5 aRunnableS24S0200000_5) {
        boolean LIZ;
        try {
            DrawGuessStatusWidget drawGuessStatusWidget = (DrawGuessStatusWidget) aRunnableS24S0200000_5.l0;
            if (drawGuessStatusWidget.isViewValid) {
                Fragment fragment = drawGuessStatusWidget.widgetCallback.getFragment();
                o.LJIIIIZZ(fragment, "widgetCallback.fragment");
                BAF.LJIJI(fragment, ((DrawGuessStatusWidget) aRunnableS24S0200000_5.l0).dataChannel, (Long) aRunnableS24S0200000_5.l1);
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$29(ARunnableS24S0200000_5 aRunnableS24S0200000_5) {
        boolean LIZ;
        try {
            FrameLayout frameLayout = ((SelfLikeWidget) aRunnableS24S0200000_5.l0).LJLIL;
            if (frameLayout != null) {
                C16880lQ.LJLLLL((C2A4) aRunnableS24S0200000_5.l1, frameLayout);
            } else {
                o.LJIJI("tapLottieContainer");
                throw null;
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$3(ARunnableS24S0200000_5 aRunnableS24S0200000_5) {
        boolean LIZ;
        try {
            ((C32676Cs4) aRunnableS24S0200000_5.l0).LJJJLZIJ(((C72242sW) aRunnableS24S0200000_5.l1).element);
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$30(ARunnableS24S0200000_5 aRunnableS24S0200000_5) {
        boolean LIZ;
        try {
            DataChannel dataChannel = ((QuestionCardWidget) aRunnableS24S0200000_5.l0).dataChannel;
            if (dataChannel != null) {
                dataChannel.rv0(FullBottomContainerHeightChannel.class, Integer.valueOf(((View) aRunnableS24S0200000_5.l1).getHeight()));
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$31(ARunnableS24S0200000_5 aRunnableS24S0200000_5) {
        boolean LIZ;
        try {
            ActQuizWidget actQuizWidget = (ActQuizWidget) aRunnableS24S0200000_5.l0;
            ActivityQuizCardMessage quizCard = (ActivityQuizCardMessage) ((IMessage) aRunnableS24S0200000_5.l1);
            o.LJIIIZ(quizCard, "quizCard");
            ActivityQuizCardMessageSEIWrapper activityQuizCardMessageSEIWrapper = new ActivityQuizCardMessageSEIWrapper();
            activityQuizCardMessageSEIWrapper.quizCardMessage = quizCard;
            actQuizWidget.LJZL(activityQuizCardMessageSEIWrapper, "message");
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$32(ARunnableS24S0200000_5 aRunnableS24S0200000_5) {
        boolean LIZ;
        try {
            aRunnableS24S0200000_5.LIZ$11();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$33(ARunnableS24S0200000_5 aRunnableS24S0200000_5) {
        boolean LIZ;
        try {
            ((Lifecycle) aRunnableS24S0200000_5.l0).addObserver((LifecycleObserver) ((C68322mC) aRunnableS24S0200000_5.l1).element);
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$34(ARunnableS24S0200000_5 aRunnableS24S0200000_5) {
        boolean LIZ;
        try {
            AbstractC32415Cnr abstractC32415Cnr = ((C32409Cnl) aRunnableS24S0200000_5.l0).LIZ;
            if (abstractC32415Cnr != null) {
                abstractC32415Cnr.LIZ((C32399Cnb) aRunnableS24S0200000_5.l1);
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$35(ARunnableS24S0200000_5 aRunnableS24S0200000_5) {
        boolean LIZ;
        try {
            C32399Cnb c32399Cnb = (C32399Cnb) aRunnableS24S0200000_5.l0;
            if (c32399Cnb != null) {
                c32399Cnb.LJII = false;
                c32399Cnb.LJIIIIZZ = true;
            }
            AbstractC32415Cnr abstractC32415Cnr = (AbstractC32415Cnr) aRunnableS24S0200000_5.l1;
            if (abstractC32415Cnr != null) {
                abstractC32415Cnr.LIZ(c32399Cnb);
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$36(ARunnableS24S0200000_5 aRunnableS24S0200000_5) {
        boolean LIZ;
        try {
            InterfaceC88472Yns interfaceC88472Yns = (InterfaceC88472Yns) aRunnableS24S0200000_5.l0;
            if (interfaceC88472Yns != null) {
                interfaceC88472Yns.invoke((BadgeStruct) aRunnableS24S0200000_5.l1);
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$37(ARunnableS24S0200000_5 aRunnableS24S0200000_5) {
        boolean LIZ;
        try {
            InterfaceC88472Yns interfaceC88472Yns = (InterfaceC88472Yns) aRunnableS24S0200000_5.l0;
            if (interfaceC88472Yns != null) {
                interfaceC88472Yns.invoke((BadgeStruct) aRunnableS24S0200000_5.l1);
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$38(ARunnableS24S0200000_5 aRunnableS24S0200000_5) {
        boolean LIZ;
        try {
            InterfaceC88472Yns interfaceC88472Yns = (InterfaceC88472Yns) aRunnableS24S0200000_5.l0;
            if (interfaceC88472Yns != null) {
                interfaceC88472Yns.invoke((BadgeStruct) aRunnableS24S0200000_5.l1);
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$39(ARunnableS24S0200000_5 aRunnableS24S0200000_5) {
        boolean LIZ;
        VideoWidget videoWidget;
        try {
            VideoWidget videoWidget2 = ((TryModeBroadcastFragment) aRunnableS24S0200000_5.l0).LLD;
            if (videoWidget2 != null) {
                videoWidget2.startStickerMessageManager();
            }
            if (((InterfaceC30313Bv3) aRunnableS24S0200000_5.l1).getFragment().isAdded() && (videoWidget = ((TryModeBroadcastFragment) aRunnableS24S0200000_5.l0).LLD) != null) {
                videoWidget.setStickerLayout(((InterfaceC30313Bv3) aRunnableS24S0200000_5.l1).Lj(), ((InterfaceC30313Bv3) aRunnableS24S0200000_5.l1).getFragment().getChildFragmentManager());
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$4(ARunnableS24S0200000_5 aRunnableS24S0200000_5) {
        boolean LIZ;
        try {
            ((C32676Cs4) aRunnableS24S0200000_5.l0).LJJJLZIJ(((C72242sW) aRunnableS24S0200000_5.l1).element);
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$40(ARunnableS24S0200000_5 aRunnableS24S0200000_5) {
        boolean LIZ;
        try {
            aRunnableS24S0200000_5.LIZ$12();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$41(ARunnableS24S0200000_5 aRunnableS24S0200000_5) {
        boolean LIZ;
        ViewPropertyAnimator animate;
        ViewPropertyAnimator scaleX;
        ViewPropertyAnimator scaleY;
        ViewPropertyAnimator interpolator;
        ViewPropertyAnimator duration;
        try {
            C47061t0 c47061t0 = ((C32727Cst) aRunnableS24S0200000_5.l0).LJLJJLL;
            if (c47061t0 != null && (animate = c47061t0.animate()) != null && (scaleX = animate.scaleX(1.0f)) != null && (scaleY = scaleX.scaleY(1.0f)) != null && (interpolator = scaleY.setInterpolator((C83741Wtl) aRunnableS24S0200000_5.l1)) != null && (duration = interpolator.setDuration(100L)) != null) {
                duration.start();
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$42(ARunnableS24S0200000_5 aRunnableS24S0200000_5) {
        boolean LIZ;
        ViewPropertyAnimator animate;
        ViewPropertyAnimator scaleX;
        ViewPropertyAnimator scaleY;
        ViewPropertyAnimator interpolator;
        ViewPropertyAnimator duration;
        ViewPropertyAnimator withEndAction;
        try {
            C47061t0 c47061t0 = ((C32727Cst) aRunnableS24S0200000_5.l0).LJLJJLL;
            if (c47061t0 != null && (animate = c47061t0.animate()) != null && (scaleX = animate.scaleX(1.1f)) != null && (scaleY = scaleX.scaleY(1.1f)) != null && (interpolator = scaleY.setInterpolator((C83741Wtl) aRunnableS24S0200000_5.l1)) != null && (duration = interpolator.setDuration(150L)) != null && (withEndAction = duration.withEndAction(new ARunnableS24S0200000_5((C32727Cst) aRunnableS24S0200000_5.l0, (C83741Wtl) aRunnableS24S0200000_5.l1, 41))) != null) {
                withEndAction.start();
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$43(ARunnableS24S0200000_5 aRunnableS24S0200000_5) {
        boolean LIZ;
        ViewPropertyAnimator animate;
        ViewPropertyAnimator scaleX;
        ViewPropertyAnimator scaleY;
        ViewPropertyAnimator interpolator;
        ViewPropertyAnimator duration;
        try {
            C47061t0 c47061t0 = ((C32727Cst) aRunnableS24S0200000_5.l0).LJLJLJ;
            if (c47061t0 != null && (animate = c47061t0.animate()) != null && (scaleX = animate.scaleX(1.0f)) != null && (scaleY = scaleX.scaleY(1.0f)) != null && (interpolator = scaleY.setInterpolator((C83741Wtl) aRunnableS24S0200000_5.l1)) != null && (duration = interpolator.setDuration(100L)) != null) {
                duration.start();
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$44(ARunnableS24S0200000_5 aRunnableS24S0200000_5) {
        boolean LIZ;
        ViewPropertyAnimator animate;
        ViewPropertyAnimator scaleX;
        ViewPropertyAnimator scaleY;
        ViewPropertyAnimator interpolator;
        ViewPropertyAnimator duration;
        ViewPropertyAnimator withEndAction;
        try {
            C47061t0 c47061t0 = ((C32727Cst) aRunnableS24S0200000_5.l0).LJLJLJ;
            if (c47061t0 != null && (animate = c47061t0.animate()) != null && (scaleX = animate.scaleX(1.1f)) != null && (scaleY = scaleX.scaleY(1.1f)) != null && (interpolator = scaleY.setInterpolator((C83741Wtl) aRunnableS24S0200000_5.l1)) != null && (duration = interpolator.setDuration(150L)) != null && (withEndAction = duration.withEndAction(new ARunnableS24S0200000_5((C32727Cst) aRunnableS24S0200000_5.l0, (C83741Wtl) aRunnableS24S0200000_5.l1, 43))) != null) {
                withEndAction.start();
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$45(ARunnableS24S0200000_5 aRunnableS24S0200000_5) {
        boolean LIZ;
        try {
            ((OnlineAudienceRankWidget) aRunnableS24S0200000_5.l0).LJZ((CYQ) aRunnableS24S0200000_5.l1);
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$46(ARunnableS24S0200000_5 aRunnableS24S0200000_5) {
        boolean LIZ;
        try {
            OnlineAudienceRankWidget onlineAudienceRankWidget = (OnlineAudienceRankWidget) aRunnableS24S0200000_5.l0;
            CYQ it = (CYQ) aRunnableS24S0200000_5.l1;
            o.LJIIIIZZ(it, "it");
            onlineAudienceRankWidget.LJZ(it);
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$47(ARunnableS24S0200000_5 aRunnableS24S0200000_5) {
        boolean LIZ;
        try {
            C31592Caa c31592Caa = (C31592Caa) aRunnableS24S0200000_5.l0;
            InterfaceC88472Yns func = (InterfaceC88472Yns) aRunnableS24S0200000_5.l1;
            c31592Caa.getClass();
            o.LJIIIZ(func, "func");
            GiftReceiveMsgThreadSetting.INSTANCE.postToThread(new ARunnableS24S0200000_5(c31592Caa, func, 49));
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$48(ARunnableS24S0200000_5 aRunnableS24S0200000_5) {
        boolean LIZ;
        try {
            C31592Caa c31592Caa = (C31592Caa) aRunnableS24S0200000_5.l0;
            InterfaceC88472Yns func = (InterfaceC88472Yns) aRunnableS24S0200000_5.l1;
            c31592Caa.getClass();
            o.LJIIIZ(func, "func");
            GiftReceiveMsgThreadSetting.INSTANCE.postToThread(new ARunnableS24S0200000_5(c31592Caa, func, 49));
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$49(ARunnableS24S0200000_5 aRunnableS24S0200000_5) {
        boolean LIZ;
        try {
            aRunnableS24S0200000_5.LIZ$13();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$5(ARunnableS24S0200000_5 aRunnableS24S0200000_5) {
        boolean LIZ;
        try {
            ((C32506CpK) aRunnableS24S0200000_5.l0).LIZIZ(aRunnableS24S0200000_5.l1);
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$50(ARunnableS24S0200000_5 aRunnableS24S0200000_5) {
        boolean LIZ;
        try {
            Bitmap bitmap = (Bitmap) aRunnableS24S0200000_5.l0;
            if (bitmap != null && !bitmap.isRecycled()) {
                C31634CbG c31634CbG = (C31634CbG) aRunnableS24S0200000_5.l1;
                c31634CbG.LJIIIZ = (Bitmap) aRunnableS24S0200000_5.l0;
                c31634CbG.LJIILL = true;
                c31634CbG.LJIIL = false;
                c31634CbG.LJI();
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$51(ARunnableS24S0200000_5 aRunnableS24S0200000_5) {
        boolean LIZ;
        try {
            Bitmap bitmap = (Bitmap) aRunnableS24S0200000_5.l0;
            if (bitmap != null && !bitmap.isRecycled()) {
                C31634CbG c31634CbG = (C31634CbG) aRunnableS24S0200000_5.l1;
                c31634CbG.LJIIJ = (Bitmap) aRunnableS24S0200000_5.l0;
                c31634CbG.LJIILLIIL = true;
                c31634CbG.LJIILIIL = false;
                c31634CbG.LJI();
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$52(ARunnableS24S0200000_5 aRunnableS24S0200000_5) {
        boolean LIZ;
        try {
            Bitmap bitmap = (Bitmap) aRunnableS24S0200000_5.l0;
            if (bitmap != null && !bitmap.isRecycled()) {
                C31634CbG c31634CbG = (C31634CbG) aRunnableS24S0200000_5.l1;
                c31634CbG.LJIIJJI = (Bitmap) aRunnableS24S0200000_5.l0;
                c31634CbG.LJIILJJIL = false;
                c31634CbG.LJIIZILJ = true;
                c31634CbG.LJI();
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$53(ARunnableS24S0200000_5 aRunnableS24S0200000_5) {
        boolean LIZ;
        try {
            Bitmap bitmap = (Bitmap) aRunnableS24S0200000_5.l0;
            if (bitmap != null && !bitmap.isRecycled()) {
                C31635CbH c31635CbH = (C31635CbH) aRunnableS24S0200000_5.l1;
                c31635CbH.LJIIIZ = (Bitmap) aRunnableS24S0200000_5.l0;
                c31635CbH.LJIILL = true;
                c31635CbH.LJIIL = false;
                c31635CbH.LJI();
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$54(ARunnableS24S0200000_5 aRunnableS24S0200000_5) {
        boolean LIZ;
        try {
            Bitmap bitmap = (Bitmap) aRunnableS24S0200000_5.l0;
            if (bitmap != null && !bitmap.isRecycled()) {
                C31635CbH c31635CbH = (C31635CbH) aRunnableS24S0200000_5.l1;
                c31635CbH.LJIIJ = (Bitmap) aRunnableS24S0200000_5.l0;
                c31635CbH.LJIILLIIL = true;
                c31635CbH.LJIILIIL = false;
                c31635CbH.LJI();
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$55(ARunnableS24S0200000_5 aRunnableS24S0200000_5) {
        boolean LIZ;
        try {
            Bitmap bitmap = (Bitmap) aRunnableS24S0200000_5.l0;
            if (bitmap != null && !bitmap.isRecycled()) {
                C31635CbH c31635CbH = (C31635CbH) aRunnableS24S0200000_5.l1;
                c31635CbH.LJIIJJI = (Bitmap) aRunnableS24S0200000_5.l0;
                c31635CbH.LJIILJJIL = false;
                c31635CbH.LJIIZILJ = true;
                c31635CbH.LJI();
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$56(ARunnableS24S0200000_5 aRunnableS24S0200000_5) {
        boolean LIZ;
        try {
            aRunnableS24S0200000_5.LIZ$14();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$57(ARunnableS24S0200000_5 aRunnableS24S0200000_5) {
        boolean LIZ;
        try {
            ((InterfaceC32261ClN) aRunnableS24S0200000_5.l1).LIZ();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$58(ARunnableS24S0200000_5 aRunnableS24S0200000_5) {
        boolean LIZ;
        try {
            C32753CtJ c32753CtJ = ((PostRechargeRetentionViewModel) aRunnableS24S0200000_5.l0).LJLLJ;
            if (c32753CtJ != null) {
                c32753CtJ.invoke(Long.valueOf(((Gift) aRunnableS24S0200000_5.l1).id));
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$59(ARunnableS24S0200000_5 aRunnableS24S0200000_5) {
        boolean LIZ;
        try {
            ((C30087BrP) aRunnableS24S0200000_5.l0).LIZ((IBannerService) aRunnableS24S0200000_5.l1);
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$6(ARunnableS24S0200000_5 aRunnableS24S0200000_5) {
        boolean LIZ;
        try {
            aRunnableS24S0200000_5.LIZ$1();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$60(ARunnableS24S0200000_5 aRunnableS24S0200000_5) {
        boolean LIZ;
        try {
            ((C30087BrP) aRunnableS24S0200000_5.l0).LIZ((IBannerService) aRunnableS24S0200000_5.l1);
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$61(ARunnableS24S0200000_5 aRunnableS24S0200000_5) {
        boolean LIZ;
        try {
            aRunnableS24S0200000_5.LIZ$15();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$62(ARunnableS24S0200000_5 aRunnableS24S0200000_5) {
        boolean LIZ;
        try {
            C30868C9o.LJ(((OperateToastMessage) aRunnableS24S0200000_5.l1).displayDuration, C15380j0.LIZLLL(), ((Spannable) aRunnableS24S0200000_5.l0).toString());
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$63(ARunnableS24S0200000_5 aRunnableS24S0200000_5) {
        boolean LIZ;
        try {
            aRunnableS24S0200000_5.LIZ$16();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$64(ARunnableS24S0200000_5 aRunnableS24S0200000_5) {
        boolean LIZ;
        try {
            List list = (List) aRunnableS24S0200000_5.l0;
            DecorationWrapperWidget decorationWrapperWidget = (DecorationWrapperWidget) aRunnableS24S0200000_5.l1;
            Iterator it = list.iterator();
            while (it.hasNext()) {
                decorationWrapperWidget.LJLZ((RoomDecoration) it.next());
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$65(ARunnableS24S0200000_5 aRunnableS24S0200000_5) {
        boolean LIZ;
        try {
            aRunnableS24S0200000_5.LIZ$17();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$66(ARunnableS24S0200000_5 aRunnableS24S0200000_5) {
        ((C31319CQx) aRunnableS24S0200000_5.l0).LJJLIIIJL((CR6) aRunnableS24S0200000_5.l1, false);
    }

    public static final void run$67(ARunnableS24S0200000_5 aRunnableS24S0200000_5) {
        C31319CQx c31319CQx = (C31319CQx) aRunnableS24S0200000_5.l0;
        c31319CQx.getClass();
        DataChannel dataChannel = c31319CQx.dataChannel;
        if (dataChannel != null) {
            dataChannel.pv0(GreetingReceivedEvent.class);
        }
    }

    public static final void run$68(ARunnableS24S0200000_5 aRunnableS24S0200000_5) {
        ((C31319CQx) aRunnableS24S0200000_5.l0).LJJIIZI((CR6) aRunnableS24S0200000_5.l1, false, null);
    }

    public static final void run$69(ARunnableS24S0200000_5 aRunnableS24S0200000_5) {
        boolean LIZ;
        try {
            aRunnableS24S0200000_5.LIZ$18();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$7(ARunnableS24S0200000_5 aRunnableS24S0200000_5) {
        boolean LIZ;
        try {
            ((C28790BRq) ((AbstractC30139BsF) aRunnableS24S0200000_5.l0)).LIZIZ.endWidgetLoading();
            ((C30125Bs1) ((InterfaceC30138BsE) aRunnableS24S0200000_5.l1)).LIZ.lambda$onActivityCreated$18();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$70(ARunnableS24S0200000_5 aRunnableS24S0200000_5) {
        boolean LIZ;
        try {
            if (!B8U.LIZLLL) {
                B8U.LJIIIZ((LivePlayFragment) aRunnableS24S0200000_5.l0, (LivePlayFragment) aRunnableS24S0200000_5.l1);
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$71(ARunnableS24S0200000_5 aRunnableS24S0200000_5) {
        boolean LIZ;
        try {
            aRunnableS24S0200000_5.LIZ$19();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$72(ARunnableS24S0200000_5 aRunnableS24S0200000_5) {
        boolean LIZ;
        try {
            aRunnableS24S0200000_5.LIZ$20();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$73(ARunnableS24S0200000_5 aRunnableS24S0200000_5) {
        boolean LIZ;
        try {
            ((CQQ) aRunnableS24S0200000_5.l0).LJIIJ.LJJIIZI((LinkMicAnchorGuideMessage) aRunnableS24S0200000_5.l1, true, null);
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$74(ARunnableS24S0200000_5 aRunnableS24S0200000_5) {
        boolean LIZ;
        try {
            aRunnableS24S0200000_5.LIZ$21();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$75(ARunnableS24S0200000_5 aRunnableS24S0200000_5) {
        boolean LIZ;
        try {
            aRunnableS24S0200000_5.LIZ$22();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$76(ARunnableS24S0200000_5 aRunnableS24S0200000_5) {
        boolean LIZ;
        try {
            aRunnableS24S0200000_5.LIZ$23();
        } finally {
            if (LIZ) {
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void run$77(ARunnableS24S0200000_5 aRunnableS24S0200000_5) {
        boolean LIZ;
        try {
            ((C9H) aRunnableS24S0200000_5.l0).LIZIZ.invoke(((OSZ) aRunnableS24S0200000_5.l1).getFirst(), ((OSZ) aRunnableS24S0200000_5.l1).getSecond());
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$78(ARunnableS24S0200000_5 aRunnableS24S0200000_5) {
        boolean LIZ;
        try {
            C31256COm c31256COm = ((StarCommentExtendWidget) aRunnableS24S0200000_5.l0).LJLILLLLZI;
            if (c31256COm != null) {
                c31256COm.LJLIL(((C31415CUp) aRunnableS24S0200000_5.l1).getItemCount() - 1);
            }
            StarCommentExtendWidget starCommentExtendWidget = (StarCommentExtendWidget) aRunnableS24S0200000_5.l0;
            C31256COm c31256COm2 = starCommentExtendWidget.LJLILLLLZI;
            if (c31256COm2 != null) {
                c31256COm2.postDelayed(new ARunnableS41S0100000_5(starCommentExtendWidget, 295), 100L);
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$79(ARunnableS24S0200000_5 aRunnableS24S0200000_5) {
        boolean LIZ;
        try {
            aRunnableS24S0200000_5.LIZ$24();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$8(ARunnableS24S0200000_5 aRunnableS24S0200000_5) {
        boolean LIZ;
        try {
            ((RankEntranceWidget) aRunnableS24S0200000_5.l0).LJZL((C31521CYr) aRunnableS24S0200000_5.l1, false);
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$80(ARunnableS24S0200000_5 aRunnableS24S0200000_5) {
        boolean LIZ;
        try {
            ((CQQ) aRunnableS24S0200000_5.l0).LJIIJ.LJJIIZI((LinkMicAudienceNoticeMessage) aRunnableS24S0200000_5.l1, true, null);
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$81(ARunnableS24S0200000_5 aRunnableS24S0200000_5) {
        boolean LIZ;
        try {
            ((CQQ) aRunnableS24S0200000_5.l0).LJIIJ.LJJIIZI((CapsuleMessage) aRunnableS24S0200000_5.l1, true, null);
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$82(ARunnableS24S0200000_5 aRunnableS24S0200000_5) {
        boolean LIZ;
        try {
            ((CQQ) aRunnableS24S0200000_5.l0).LJIIJ.LJJIIZI((GiftCollectionUpdateMessage) aRunnableS24S0200000_5.l1, true, null);
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$83(ARunnableS24S0200000_5 aRunnableS24S0200000_5) {
        boolean LIZ;
        try {
            ((CF8) aRunnableS24S0200000_5.l0).LIZ(((C34K) aRunnableS24S0200000_5.l1).element, false);
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$84(ARunnableS24S0200000_5 aRunnableS24S0200000_5) {
        boolean LIZ;
        try {
            CF9 cf9 = (CF9) aRunnableS24S0200000_5.l0;
            if (cf9.LIZLLL) {
                cf9.LIZJ((BarrageMessage) aRunnableS24S0200000_5.l1);
                CF9 cf92 = (CF9) aRunnableS24S0200000_5.l0;
                if (!((SlotBarrageWidget) cf92.LIZ).LJLZ(null)) {
                    ((SlotBarrageWidget) cf92.LIZ).LJZL(null);
                }
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$85(ARunnableS24S0200000_5 aRunnableS24S0200000_5) {
        boolean LIZ;
        try {
            C2A8 c2a8 = ((C32328CmS) aRunnableS24S0200000_5.l0).LJLJJLL;
            if (c2a8 != null) {
                c2a8.setText((CharSequence) ((C68322mC) aRunnableS24S0200000_5.l1).element);
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$86(ARunnableS24S0200000_5 aRunnableS24S0200000_5) {
        boolean LIZ;
        try {
            aRunnableS24S0200000_5.LIZ$25();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$87(ARunnableS24S0200000_5 aRunnableS24S0200000_5) {
        boolean LIZ;
        try {
            ((LivePerformanceManager) aRunnableS24S0200000_5.l0).LLILLJJLI = (InterfaceC88472Yns) aRunnableS24S0200000_5.l1;
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$88(ARunnableS24S0200000_5 aRunnableS24S0200000_5) {
        boolean LIZ;
        try {
            aRunnableS24S0200000_5.LIZ$26();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$89(ARunnableS24S0200000_5 aRunnableS24S0200000_5) {
        boolean LIZ;
        try {
            C29697Bl7.LIZLLL((Exception) aRunnableS24S0200000_5.l0, (LiveMode) aRunnableS24S0200000_5.l1);
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$9(ARunnableS24S0200000_5 aRunnableS24S0200000_5) {
        boolean LIZ;
        try {
            ((RankEntranceWidget) aRunnableS24S0200000_5.l0).LJZL((C31521CYr) aRunnableS24S0200000_5.l1, true);
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$90(ARunnableS24S0200000_5 aRunnableS24S0200000_5) {
        boolean LIZ;
        Long l;
        try {
            boolean isLiveTypeAudio = ((Room) aRunnableS24S0200000_5.l0).isLiveTypeAudio();
            LiveMode LLF = ((PreviewStartLiveWidget) aRunnableS24S0200000_5.l1).LLF();
            ((PreviewStartLiveWidget) aRunnableS24S0200000_5.l1).getClass();
            InterfaceC05190Ih LLFFF = PreviewStartLiveWidget.LLFFF();
            if (LLFFF != null) {
                l = Long.valueOf(LLFFF.getId());
            } else {
                l = null;
            }
            C0N7.LJJI(isLiveTypeAudio, LLF, String.valueOf(l), ((PreviewStartLiveWidget) aRunnableS24S0200000_5.l1).dataChannel);
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$91(ARunnableS24S0200000_5 aRunnableS24S0200000_5) {
        boolean LIZ;
        try {
            ((CQQ) aRunnableS24S0200000_5.l0).LJIIJ.LJJIIZI((LinkMicBattleNoticeMessage) aRunnableS24S0200000_5.l1, true, null);
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$92(ARunnableS24S0200000_5 aRunnableS24S0200000_5) {
        boolean LIZ;
        try {
            InterfaceC30359Bvn interfaceC30359Bvn = ((LiveBroadcastPreviewFragment) aRunnableS24S0200000_5.l0).LJLZ;
            if (interfaceC30359Bvn != null) {
                interfaceC30359Bvn.closeCamera((Cert) aRunnableS24S0200000_5.l1);
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public ARunnableS24S0200000_5(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }

    public ARunnableS24S0200000_5(Class cls, Object obj, InterfaceC32261ClN interfaceC32261ClN, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = interfaceC32261ClN;
    }
}
