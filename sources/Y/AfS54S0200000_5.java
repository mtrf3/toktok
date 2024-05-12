package Y;

import X.AbstractC19020os;
import X.AbstractC29786BmY;
import X.AbstractC31361CSn;
import X.ActivityC45651qj;
import X.B83;
import X.BAF;
import X.BBP;
import X.BCZ;
import X.BEU;
import X.BFC;
import X.BIR;
import X.BV8;
import X.BVA;
import X.BXB;
import X.BXT;
import X.BZI;
import X.C00S;
import X.C01R;
import X.C03880Dg;
import X.C05170If;
import X.C05490Jl;
import X.C06900Ow;
import X.C09;
import X.C0D;
import X.C0E;
import X.C0F;
import X.C0NB;
import X.C0TL;
import X.C0TY;
import X.C15380j0;
import X.C15420j4;
import X.C15490jB;
import X.C15540jG;
import X.C15620jO;
import X.C16880lQ;
import X.C17230lz;
import X.C17240m0;
import X.C18200nY;
import X.C199097rd;
import X.C1A;
import X.C1EW;
import X.C1I;
import X.C1N;
import X.C1YK;
import X.C1YL;
import X.C20910rv;
import X.C223338pd;
import X.C26045AKb;
import X.C28398BCo;
import X.C28402BCs;
import X.C28787BRn;
import X.C28861BUj;
import X.C28874BUw;
import X.C28881BVd;
import X.C28924BWu;
import X.C29121Bbp;
import X.C29159BcR;
import X.C29162BcU;
import X.C29164BcW;
import X.C29166BcY;
import X.C29306Beo;
import X.C29319Bf1;
import X.C29352BfY;
import X.C29374Bfu;
import X.C29401Dk;
import X.C29448Bh6;
import X.C29488Bhk;
import X.C29536BiW;
import X.C29588BjM;
import X.C29598BjW;
import X.C29656BkS;
import X.C29689Bkz;
import X.C29787BmZ;
import X.C29800Bmm;
import X.C29867Bnr;
import X.C29927Bop;
import X.C29936Boy;
import X.C2A7;
import X.C30168Bsi;
import X.C30355Bvj;
import X.C30389BwH;
import X.C30517ByL;
import X.C30525ByT;
import X.C30579BzL;
import X.C30605Bzl;
import X.C30725C4b;
import X.C30770C5u;
import X.C30841C8n;
import X.C30868C9o;
import X.C30922CBq;
import X.C31085CHx;
import X.C31086CHy;
import X.C31099CIl;
import X.C31120CJg;
import X.C31309CQn;
import X.C31319CQx;
import X.C31865Cez;
import X.C32071Nr;
import X.C32101Nu;
import X.C32128CjE;
import X.C32129CjF;
import X.C32364Cn2;
import X.C32537Cpp;
import X.C32586Cqc;
import X.C32603Cqt;
import X.C32604Cqu;
import X.C32609Cqz;
import X.C32612Cr2;
import X.C32629CrJ;
import X.C32633CrN;
import X.C32635CrP;
import X.C41071jL;
import X.C47061t0;
import X.C47071t1;
import X.C47261Igj;
import X.C48459J0d;
import X.C51029K0z;
import X.C56235M5f;
import X.C61447O9r;
import X.C61878OQg;
import X.C65232Piu;
import X.C65300Pk0;
import X.C65814PsI;
import X.C68322mC;
import X.C72242sW;
import X.C73495Sst;
import X.C73943T0h;
import X.C78528Urs;
import X.C79004UzY;
import X.CC3;
import X.CCC;
import X.CFX;
import X.CI5;
import X.CJ5;
import X.CN1;
import X.COY;
import X.CVL;
import X.CZX;
import X.CZY;
import X.DialogC31813Ce9;
import X.EnumC29589BjN;
import X.EnumC32608Cqy;
import X.EnumC32627CrH;
import X.InterfaceC29405BgP;
import X.InterfaceC29937Boz;
import X.InterfaceC30237Btp;
import X.InterfaceC30442Bx8;
import X.InterfaceC30519ByN;
import X.InterfaceC31364CSq;
import X.InterfaceC31532CZc;
import X.InterfaceC32642CrW;
import X.InterfaceC32645CrZ;
import X.InterfaceC40375Fsx;
import X.InterfaceC64592gB;
import X.InterfaceC65784Pro;
import X.InterfaceC77595Ucp;
import X.InterfaceC78280Uns;
import X.InterfaceC88471Ynr;
import X.InterfaceC88472Yns;
import X.OJD;
import X.Q89;
import X.QZY;
import X.T28;
import X.X1D;
import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.bytedance.android.live.actionhandler.IActionHandlerService;
import com.bytedance.android.live.base.model.user.FollowInfo;
import com.bytedance.android.live.base.model.user.UploadResult;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.broadcast.api.IBroadcastService;
import com.bytedance.android.live.broadcast.model.RoomCreateInfo;
import com.bytedance.android.live.design.app.LiveDialog;
import com.bytedance.android.live.effect.api.Modification;
import com.bytedance.android.live.interaction.drawguess.DrawGuessSessionIdChannel;
import com.bytedance.android.live.liveinteract.api.dataholder.LinkCrossRoomDataHolder;
import com.bytedance.android.live.liveinteract.multiguestv3.usercard.MultiGuestUserCardCell;
import com.bytedance.android.live.liveinteract.multihost.usercard.CoHostUserCardCell;
import com.bytedance.android.live.network.response.BaseResponse;
import com.bytedance.android.live.programmedlive.model.FollowCard;
import com.bytedance.android.live.programmedlive.model.FollowCardResponse;
import com.bytedance.android.live.share.response.BatchShareUsersResult;
import com.bytedance.android.live.usermanage.IUserManageService;
import com.bytedance.android.live.wallet.IWalletService;
import com.bytedance.android.live.wallet.WalletCenter;
import com.bytedance.android.live.wallet.WalletException;
import com.bytedance.android.live.wallet.model.BalanceStruct;
import com.bytedance.android.live.wallet.model.BalanceStructExtra;
import com.bytedance.android.live.wallet.model.BasePackage;
import com.bytedance.android.live.wallet.model.CurrencyInfo;
import com.bytedance.android.live.wallet.model.RevenueExchange;
import com.bytedance.android.live.wallet.model.UgEmailConsentResult;
import com.bytedance.android.live.wallet.model.WalletStruct;
import com.bytedance.android.live.walletnew.RechargeViewModel;
import com.bytedance.android.livesdk.adminsetting.LiveMuteDurationSettingFragment;
import com.bytedance.android.livesdk.adminsetting.LiveMuteDurationSettingFragmentSheet;
import com.bytedance.android.livesdk.api.revenue.level.IUserLevelService;
import com.bytedance.android.livesdk.api.revenue.starcomment.IStarCommentService;
import com.bytedance.android.livesdk.broadcast.BroadcastService;
import com.bytedance.android.livesdk.broadcast.LiveBroadcastEndFragment;
import com.bytedance.android.livesdk.browser.jsbridge.newmethods.EncryptedUploadMethod;
import com.bytedance.android.livesdk.chatroom.api.LiveSubOnlyConfig;
import com.bytedance.android.livesdk.chatroom.model.Barrage;
import com.bytedance.android.livesdk.chatroom.model.MGetTranslationResponse;
import com.bytedance.android.livesdk.chatroom.model.ShareReportResult;
import com.bytedance.android.livesdk.chatroom.ui.GameBroadcastFragment;
import com.bytedance.android.livesdk.comp.api.game.PartnershipGameTaskShowCount;
import com.bytedance.android.livesdk.comp.api.game.service.IGameService;
import com.bytedance.android.livesdk.comp.impl.game.GamePartnershipService;
import com.bytedance.android.livesdk.dataChannel.RoomUserChannel;
import com.bytedance.android.livesdk.dataChannel.StartPollMessageSEIEvent;
import com.bytedance.android.livesdk.effect.StickerImageUploader;
import com.bytedance.android.livesdk.game.model.UserInfo;
import com.bytedance.android.livesdk.impl.revenue.subscription.ui.SubOnlyLiveSettingDialogNew;
import com.bytedance.android.livesdk.interaction.InteractionFeaturesDialog;
import com.bytedance.android.livesdk.interaction.drawguess.network.DrawGuessApi;
import com.bytedance.android.livesdk.interaction.drawguess.network.StartDrawGuessResponse;
import com.bytedance.android.livesdk.interaction.poll.network.StartPollResponse;
import com.bytedance.android.livesdk.interaction.poll.ui.PollManageDialog;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveAnchorEnableInnerBeautyMaxValue;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveBroadcastTaskResourceIdSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveCoreDpExpSetting;
import com.bytedance.android.livesdk.livesetting.gift.LiveExchangeEntranceSchema;
import com.bytedance.android.livesdk.livesetting.gift.LiveExchangeEntranceSchemaUG;
import com.bytedance.android.livesdk.livesetting.gift.LiveGuideBubbleDurationSetting;
import com.bytedance.android.livesdk.livesetting.level.UserLevelEnableSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicMultiGuestV3MaskAvatarSizeTestSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveAudienceLinkmicLowestAgeSetting;
import com.bytedance.android.livesdk.livesetting.other.subscribe_enhance.SubscriptionExpireRemindHourSetting;
import com.bytedance.android.livesdk.livesetting.subscription.SubscribeInvitationLynxUrlSetting;
import com.bytedance.android.livesdk.model.Creator;
import com.bytedance.android.livesdk.model.RoomSticker;
import com.bytedance.android.livesdk.model.UserAttr;
import com.bytedance.android.livesdk.model.message.FollowCardMessage;
import com.bytedance.android.livesdk.model.message.Question;
import com.bytedance.android.livesdk.model.message.ShareGuideMessage;
import com.bytedance.android.livesdk.moderator.ModeratorListChannel;
import com.bytedance.android.livesdk.moderator.ModeratorPermissionEditFragment;
import com.bytedance.android.livesdk.moderator.ModeratorPermissionEditFragmentSheet;
import com.bytedance.android.livesdk.programmedlive.ui.ProgrammedLiveFollowCardWidget;
import com.bytedance.android.livesdk.qa.CurrentQuestionChannel;
import com.bytedance.android.livesdk.qa.QuestionCardWidget;
import com.bytedance.android.livesdk.qa.QuestionEx;
import com.bytedance.android.livesdk.qa.QuestionList;
import com.bytedance.android.livesdk.qa.QuestionListResponse;
import com.bytedance.android.livesdk.qa.StartAnswerResponse;
import com.bytedance.android.livesdk.subscribe.model.invite.GetInvitationStatusResponse;
import com.bytedance.android.livesdk.subscribe.model.invite.SubInvitationCode;
import com.bytedance.android.livesdk.subscribe.model.invite.SubInvitationInviteeStatus;
import com.bytedance.android.livesdk.subscribe.model.invite.SubOptInStatus;
import com.bytedance.android.livesdk.usercard.profilev3.TryModeLiveProfileDialog;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.bytedance.android.livesdkapi.depend.model.follow.FollowPair;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import com.bytedance.android.livesdkapi.host.IHostResource;
import com.bytedance.android.livesdkapi.host.IHostUser;
import com.bytedance.android.livesdkapi.message.LiveMessageSEI;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.retrofit2.mime.MultipartTypedOutput;
import com.bytedance.retrofit2.mime.TypedFile;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.google.android.play.core.appupdate.u;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.zhiliaoapp.musically.R;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import kotlin.jvm.internal.o;
import org.json.JSONException;
import org.json.JSONObject;
import webcast.api.partnership.AnchorToggleInfoResponse;
import webcast.api.partnership.UserInfoResponse;
import webcast.api.sub.SubManagementResponse;

/* loaded from: classes6.dex */
public class AfS54S0200000_5 implements InterfaceC64592gB {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // X.InterfaceC64592gB
    public final void accept(Object obj) {
        switch (this.$t) {
            case 0:
                accept$0(this, obj);
                return;
            case 1:
                accept$1(this, obj);
                return;
            case 2:
                accept$2(this, obj);
                return;
            case 3:
                accept$3(this, obj);
                return;
            case 4:
                accept$4(this, obj);
                return;
            case 5:
                accept$5(this, obj);
                return;
            case 6:
                accept$6(this, obj);
                return;
            case 7:
                accept$7(this, obj);
                return;
            case 8:
                accept$8(this, obj);
                return;
            case 9:
                accept$9(this, obj);
                return;
            case 10:
                accept$10(this, obj);
                return;
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                accept$11(this, obj);
                return;
            case 12:
                accept$12(this, obj);
                return;
            case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                accept$13(this, obj);
                return;
            case 14:
                accept$14(this, obj);
                return;
            case 15:
                accept$15(this, obj);
                return;
            case LiveAudienceLinkmicLowestAgeSetting.DEFAULT /* 16 */:
                accept$16(this, obj);
                return;
            case 17:
                accept$17(this, obj);
                return;
            case 18:
                accept$18(this, obj);
                return;
            case 19:
                accept$19(this, obj);
                return;
            case 20:
                accept$20(this, obj);
                return;
            case 21:
                accept$21(this, obj);
                return;
            case 22:
                accept$22(this, obj);
                return;
            case 23:
                accept$23(this, obj);
                return;
            case 24:
                accept$24(this, obj);
                return;
            case 25:
                accept$25(this, obj);
                return;
            case 26:
                accept$26(this, obj);
                return;
            case 27:
                accept$27(this, obj);
                return;
            case 28:
                accept$28(this, obj);
                return;
            case 29:
                accept$29(this, obj);
                return;
            case 30:
                accept$30(this, obj);
                return;
            case 31:
                accept$31(this, obj);
                return;
            case 32:
                accept$32(this, obj);
                return;
            case 33:
                accept$33(this, obj);
                return;
            case 34:
                accept$34(this, obj);
                return;
            case 35:
                accept$35(this, obj);
                return;
            case 36:
                accept$36(this, obj);
                return;
            case 37:
                accept$37(this, obj);
                return;
            case 38:
                accept$38(this, obj);
                return;
            case 39:
                accept$39(this, obj);
                return;
            case LinkMicMultiGuestV3MaskAvatarSizeTestSetting.SIZE_40 /* 40 */:
                accept$40(this, obj);
                return;
            case 41:
                accept$41(this, obj);
                return;
            case 42:
                accept$42(this, obj);
                return;
            case LiveBroadcastTaskResourceIdSetting.DEFAULT /* 43 */:
                accept$43(this, obj);
                return;
            case 44:
                accept$44(this, obj);
                return;
            case 45:
                accept$45(this, obj);
                return;
            case 46:
                accept$46(this, obj);
                return;
            case 47:
                accept$47(this, obj);
                return;
            case LinkMicMultiGuestV3MaskAvatarSizeTestSetting.SIZE_48 /* 48 */:
                accept$48(this, obj);
                return;
            case C61447O9r.LJIIJ:
                accept$49(this, obj);
                return;
            case 50:
                accept$50(this, obj);
                return;
            case 51:
                accept$51(this, obj);
                return;
            case 52:
                accept$52(this, obj);
                return;
            case 53:
                accept$53(this, obj);
                return;
            case 54:
                accept$54(this, obj);
                return;
            case 55:
                accept$55(this, obj);
                return;
            case 56:
                accept$56(this, obj);
                return;
            case 57:
                accept$57(this, obj);
                return;
            case 58:
                accept$58(this, obj);
                return;
            case 59:
                accept$59(this, obj);
                return;
            case 60:
                accept$60(this, obj);
                return;
            case 61:
                accept$61(this, obj);
                return;
            case BaseNotice.CREATOR /* 62 */:
                accept$62(this, obj);
                return;
            case 63:
                accept$63(this, obj);
                return;
            case 64:
                accept$64(this, obj);
                return;
            case 65:
                accept$65(this, obj);
                return;
            case 66:
                accept$66(this, obj);
                return;
            case 67:
                accept$67(this, obj);
                return;
            case 68:
                accept$68(this, obj);
                return;
            case 69:
                accept$69(this, obj);
                return;
            case 70:
                accept$70(this, obj);
                return;
            case 71:
                accept$71(this, obj);
                return;
            case SubscriptionExpireRemindHourSetting.DEFAULT /* 72 */:
                accept$72(this, obj);
                return;
            case 73:
                accept$73(this, obj);
                return;
            case 74:
                accept$74(this, obj);
                return;
            case 75:
                accept$75(this, obj);
                return;
            case 76:
                accept$76(this, obj);
                return;
            case 77:
                accept$77(this, obj);
                return;
            case 78:
                accept$78(this, obj);
                return;
            case 79:
                accept$79(this, obj);
                return;
            case 80:
                accept$80(this, obj);
                return;
            case 81:
                accept$81(this, obj);
                return;
            case 82:
                accept$82(this, obj);
                return;
            case 83:
                accept$83(this, obj);
                return;
            case 84:
                accept$84(this, obj);
                return;
            case LiveAnchorEnableInnerBeautyMaxValue.DEFAULT /* 85 */:
                accept$85(this, obj);
                return;
            default:
                return;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void accept$0(AfS54S0200000_5 afS54S0200000_5, Object obj) {
        BroadcastService broadcastService = (BroadcastService) afS54S0200000_5.l0;
        InterfaceC30519ByN interfaceC30519ByN = (InterfaceC30519ByN) afS54S0200000_5.l1;
        BaseResponse baseResponse = (BaseResponse) obj;
        broadcastService.getClass();
        ((C30525ByT) interfaceC30519ByN).LIZ.onSuccess(Integer.valueOf(((RoomCreateInfo) baseResponse.data).mIsFirstBroadcastFlag));
        C30389BwH.LIZ = (RoomCreateInfo) baseResponse.data;
        BroadcastService.LIZ(1, "");
    }

    public static final void accept$1(AfS54S0200000_5 afS54S0200000_5, Object obj) {
        String str;
        BroadcastService broadcastService = (BroadcastService) afS54S0200000_5.l0;
        InterfaceC30519ByN interfaceC30519ByN = (InterfaceC30519ByN) afS54S0200000_5.l1;
        Throwable th = (Throwable) obj;
        broadcastService.getClass();
        ((C30525ByT) interfaceC30519ByN).LIZ.onFailed(th);
        if (th != null) {
            str = th.getMessage();
        } else {
            str = "fetch error";
        }
        BroadcastService.LIZ(0, str);
    }

    public static final void accept$10(AfS54S0200000_5 afS54S0200000_5, Object obj) {
        C31865Cez c31865Cez = (C31865Cez) obj;
        EncryptedUploadMethod encryptedUploadMethod = (EncryptedUploadMethod) afS54S0200000_5.l1;
        UploadResult uploadResult = c31865Cez.LIZ.data;
        Uri uri = (Uri) afS54S0200000_5.l0;
        String str = c31865Cez.LIZIZ;
        encryptedUploadMethod.LJJIIJ();
        try {
            EncryptedUploadMethod.Data data = new EncryptedUploadMethod.Data();
            data.uri = uploadResult.uri;
            COY LIZIZ = COY.LIZIZ();
            Context context = encryptedUploadMethod.callContext.LIZ;
            LIZIZ.getClass();
            data.local_url = COY.LIZ(C00S.LIZIZ(context, uri));
            COY.LIZIZ().getClass();
            data.local_img = COY.LIZ(str);
            EncryptedUploadMethod.Result result = new EncryptedUploadMethod.Result(1, 0, C15380j0.LJIILJJIL(R.string.sq4), data);
            encryptedUploadMethod.LJLJJLL.LIZ(result, "H5_uploadVideoStatus");
            encryptedUploadMethod.finishWithResult(result);
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
        }
    }

    public static final void accept$11(AfS54S0200000_5 afS54S0200000_5, Object obj) {
        C29352BfY c29352BfY = (C29352BfY) afS54S0200000_5.l0;
        Context context = (Context) afS54S0200000_5.l1;
        Throwable th = (Throwable) obj;
        c29352BfY.getClass();
        JSONObject jSONObject = new JSONObject();
        if (th instanceof C29401Dk) {
            C29401Dk c29401Dk = (C29401Dk) th;
            int errorCode = c29401Dk.getErrorCode();
            if (errorCode == 20065) {
                if (context instanceof ActivityC45651qj) {
                    String prompt = c29401Dk.getPrompt();
                    C26045AKb c26045AKb = new C26045AKb((Activity) context);
                    if (prompt == null || prompt.equals("")) {
                        prompt = C15380j0.LJIILJJIL(R.string.sti);
                    }
                    c26045AKb.LJIIIZ(prompt);
                    c26045AKb.LJIIJ();
                }
                try {
                    jSONObject.put("error_code", errorCode);
                    jSONObject.put("error_msg", c29401Dk.getErrorMsg());
                } catch (JSONException e) {
                    C16880lQ.LLLLIIL(e);
                }
                c29352BfY.finishWithRawResult(jSONObject);
                return;
            }
            if (errorCode == 4002173) {
                String oI = ((IHostResource) CN1.LIZ(IHostResource.class)).oI(context);
                C47071t1 c47071t1 = new C47071t1(context);
                c47071t1.LJII(oI);
                c47071t1.LJIIL(R.string.sof, new IDcS93S0200000_5(c29352BfY, context, 2));
                c47071t1.LJIIIZ(R.string.osu, new Q89());
                LiveDialog LIZ = c47071t1.LIZ();
                if (new C03880Dg(2).LIZJ(300000, "com/bytedance/android/live/design/app/LiveDialog", "show", LIZ, new Object[0], "void", new C65300Pk0(false, "()V", "6472023918363878684")).LIZ) {
                    return;
                }
                LIZ.show();
                return;
            }
            c29352BfY.finishWithFailure(th);
            return;
        }
        c29352BfY.finishWithFailure(th);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void accept$12(AfS54S0200000_5 afS54S0200000_5, Object obj) {
        C31086CHy c31086CHy = (C31086CHy) afS54S0200000_5.l0;
        C31085CHx c31085CHx = (C31085CHx) afS54S0200000_5.l1;
        BaseResponse baseResponse = (BaseResponse) obj;
        c31086CHy.getClass();
        C73943T0h.LIZ().LIZIZ(new C31099CIl(c31085CHx, true));
        c31086CHy.LJLIL = true;
        T t = c31086CHy.mView;
        if (t == 0) {
            return;
        }
        ((CI5) t).L30((Barrage) baseResponse.data);
    }

    public static final void accept$13(AfS54S0200000_5 afS54S0200000_5, Object obj) {
        ((GameBroadcastFragment) afS54S0200000_5.l0).G(2, ((Number) ((Map.Entry) afS54S0200000_5.l1).getKey()).intValue(), "");
    }

    public static final void accept$14(AfS54S0200000_5 afS54S0200000_5, Object obj) {
        Throwable th = (Throwable) obj;
        if (th instanceof C0TL) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(" code = ");
            LIZ.append(((C0TL) th).statusCode);
            C0NB.LJ("GamePartnershipService", X1D.LIZIZ(LIZ));
        }
        C0NB.LJI("GamePartnershipService", th);
        ((GamePartnershipService) afS54S0200000_5.l0).LJI();
        ((InterfaceC88472Yns) afS54S0200000_5.l1).invoke(C61878OQg.INSTANCE);
    }

    public static final void accept$15(AfS54S0200000_5 afS54S0200000_5, Object obj) {
        StickerImageUploader stickerImageUploader = (StickerImageUploader) afS54S0200000_5.l0;
        C30517ByL c30517ByL = (C30517ByL) afS54S0200000_5.l1;
        File file = (File) obj;
        stickerImageUploader.getClass();
        if (file == null) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("compress file fail->");
            C1EW.LIZLLL(LIZ, c30517ByL.LIZ, LIZ, "StickerImageUploader");
            stickerImageUploader.LIZJ = false;
            stickerImageUploader.LIZIZ();
        }
        MultipartTypedOutput multipartTypedOutput = new MultipartTypedOutput();
        multipartTypedOutput.addPart("data", new TypedFile("image/jpeg", file));
        C65814PsI.LIZ().getClass();
        stickerImageUploader.LIZ = (C73495Sst) T28.LIZLLL(((StickerImageUploader.UploadStickerImageApi) C65814PsI.LIZJ(StickerImageUploader.UploadStickerImageApi.class)).upload(multipartTypedOutput, c30517ByL.LIZJ, c30517ByL.LIZLLL)).LJJII(new AfS54S0200000_5(stickerImageUploader, c30517ByL, 17), new AfS54S0200000_5(stickerImageUploader, c30517ByL, 18));
    }

    public static final void accept$16(AfS54S0200000_5 afS54S0200000_5, Object obj) {
        StickerImageUploader stickerImageUploader = (StickerImageUploader) afS54S0200000_5.l0;
        C30517ByL c30517ByL = (C30517ByL) afS54S0200000_5.l1;
        stickerImageUploader.getClass();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("compress file  throw error->");
        C1EW.LIZLLL(LIZ, c30517ByL.LIZ, LIZ, "StickerImageUploader");
        stickerImageUploader.LIZJ = false;
        stickerImageUploader.LIZIZ();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void accept$17(AfS54S0200000_5 afS54S0200000_5, Object obj) {
        long LIZ;
        StickerImageUploader stickerImageUploader = (StickerImageUploader) afS54S0200000_5.l0;
        C30517ByL c30517ByL = (C30517ByL) afS54S0200000_5.l1;
        BaseResponse baseResponse = (BaseResponse) obj;
        stickerImageUploader.getClass();
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("upload sticker success pic->");
        C1EW.LIZLLL(LIZ2, c30517ByL.LIZ, LIZ2, "StickerImageUploader");
        if (baseResponse.data != 0) {
            if (c30517ByL.LIZIZ) {
                C30355Bvj.LJIIL();
                C32101Nu.LJFF(((StickerImageUploader.UploadResponse) baseResponse.data).url, true);
            } else {
                List<LiveEffect> LIZ3 = C30355Bvj.LIZJ().LIZ(C0TY.LIZIZ);
                if (!LIZ3.isEmpty() && ((LiveEffect) ListProtector.get(LIZ3, 0)).isGreenScreen) {
                    C30355Bvj.LJIIL();
                    C32101Nu.LJFF(((StickerImageUploader.UploadResponse) baseResponse.data).url, false);
                }
                List<LiveEffect> LIZ4 = C30355Bvj.LIZJ().LIZ("livebackground");
                if (InterfaceC30442Bx8.i2.LIZJ().intValue() == 0 && !LIZ4.isEmpty() && ((LiveEffect) ListProtector.get(LIZ4, 0)).isGreenScreen) {
                    C30355Bvj.LJIIL();
                    String str = ((StickerImageUploader.UploadResponse) baseResponse.data).url;
                    LiveEffect liveEffect = (LiveEffect) ListProtector.get(LIZ4, 0);
                    o.LJIIIZ(liveEffect, "liveEffect");
                    C32101Nu.LIZLLL = str;
                    long j = liveEffect.effectId;
                    String name = liveEffect.getName();
                    if (name == null) {
                        name = "";
                    }
                    String resourceId = liveEffect.getResourceId();
                    Long l = C32071Nr.LJII;
                    if (l != null) {
                        LIZ = l.longValue();
                    } else {
                        LIZ = C30725C4b.LIZ();
                    }
                    C32101Nu.LJIIJ(C32101Nu.LIZJ(), C47261Igj.LJJIJIL(new Modification(j, name, resourceId, 8L, Long.valueOf(LIZ / 1000), null, 0L, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, str, ((IBroadcastService) CN1.LIZ(IBroadcastService.class)).getBroadcastScene(), 0 == true ? 1 : 0, 0 == true ? 1 : 0, 1L, 26528, 0 == true ? 1 : 0)));
                }
            }
        }
        stickerImageUploader.LIZJ = false;
        stickerImageUploader.LIZIZ();
    }

    public static final void accept$18(AfS54S0200000_5 afS54S0200000_5, Object obj) {
        StickerImageUploader stickerImageUploader = (StickerImageUploader) afS54S0200000_5.l0;
        C30517ByL c30517ByL = (C30517ByL) afS54S0200000_5.l1;
        stickerImageUploader.getClass();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("upload sticker fail pic->");
        C1EW.LIZLLL(LIZ, c30517ByL.LIZ, LIZ, "StickerImageUploader");
        stickerImageUploader.LIZJ = false;
        stickerImageUploader.LIZIZ();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void accept$19(AfS54S0200000_5 afS54S0200000_5, Object obj) {
        ((CountDownLatch) afS54S0200000_5.l0).countDown();
        ((C68322mC) afS54S0200000_5.l1).element = obj;
    }

    public static final void accept$2(AfS54S0200000_5 afS54S0200000_5, Object obj) {
        DataChannel dataChannel = ((C28861BUj) afS54S0200000_5.l0).LJLILLLLZI;
        if (dataChannel != null) {
            dataChannel.rv0(CurrentQuestionChannel.class, (QuestionEx) afS54S0200000_5.l1);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void accept$20(AfS54S0200000_5 afS54S0200000_5, Object obj) {
        ((C68322mC) afS54S0200000_5.l0).element = obj;
        ((CountDownLatch) afS54S0200000_5.l1).countDown();
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x006b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void accept$21(Y.AfS54S0200000_5 r5, java.lang.Object r6) {
        /*
            java.lang.Object r0 = r5.l0
            com.bytedance.android.livesdk.model.GameTag r0 = (com.bytedance.android.livesdk.model.GameTag) r0
            int r0 = r0.landscape
            if (r0 != 0) goto L93
            java.lang.Object r0 = r5.l1
            com.bytedance.android.livesdk.hashtag.BroadcastHashTagWidget r0 = (com.bytedance.android.livesdk.hashtag.BroadcastHashTagWidget) r0
            com.bytedance.ies.sdk.datachannel.DataChannel r1 = r0.dataChannel
            if (r1 == 0) goto L91
            java.lang.Class<X.BCX> r0 = X.BCX.class
            java.lang.Object r1 = r1.kv0(r0)
        L16:
            com.bytedance.android.livesdkapi.depend.model.live.LiveMode r0 = com.bytedance.android.livesdkapi.depend.model.live.LiveMode.SCREEN_RECORD
            if (r1 != r0) goto L93
            java.lang.Object r0 = r5.l1
            com.bytedance.android.livesdk.hashtag.BroadcastHashTagWidget r0 = (com.bytedance.android.livesdk.hashtag.BroadcastHashTagWidget) r0
            android.content.Context r1 = r0.context
            r0 = 2131837441(0x7f114201, float:1.9308077E38)
            java.lang.String r0 = r1.getString(r0)
            X.C30868C9o.LJFF(r1, r0)
        L2a:
            java.lang.Object r0 = r5.l1
            com.bytedance.android.livesdk.hashtag.BroadcastHashTagWidget r0 = (com.bytedance.android.livesdk.hashtag.BroadcastHashTagWidget) r0
            com.bytedance.ies.sdk.datachannel.DataChannel r2 = r0.dataChannel
            if (r2 == 0) goto L3b
            java.lang.Class<com.bytedance.android.livesdk.dataChannel.BroadcastGameTagHasSetChannel> r1 = com.bytedance.android.livesdk.dataChannel.BroadcastGameTagHasSetChannel.class
            java.lang.Object r0 = r5.l0
            com.bytedance.android.livesdk.model.GameTag r0 = (com.bytedance.android.livesdk.model.GameTag) r0
            r2.rv0(r1, r0)
        L3b:
            java.lang.Object r4 = r5.l1
            com.bytedance.android.livesdk.hashtag.BroadcastHashTagWidget r4 = (com.bytedance.android.livesdk.hashtag.BroadcastHashTagWidget) r4
            com.bytedance.android.livesdk.model.GameTag r0 = r4.LJLJL
            if (r0 == 0) goto L47
            com.bytedance.android.livesdk.model.Hashtag r0 = r4.LJLJLJ
            if (r0 != 0) goto L50
        L47:
            java.lang.Object r1 = r5.l1
            com.bytedance.android.livesdk.hashtag.BroadcastHashTagWidget r1 = (com.bytedance.android.livesdk.hashtag.BroadcastHashTagWidget) r1
            r0 = 1
            r1.LLFFF(r0)
        L4f:
            return
        L50:
            com.bytedance.ies.sdk.datachannel.DataChannel r1 = r4.dataChannel
            if (r1 == 0) goto L47
            java.lang.Class<X.BCX> r0 = X.BCX.class
            java.lang.Object r1 = r1.kv0(r0)
            com.bytedance.android.livesdkapi.depend.model.live.LiveMode r1 = (com.bytedance.android.livesdkapi.depend.model.live.LiveMode) r1
            if (r1 != 0) goto L5f
            goto L47
        L5f:
            X.BHW r0 = X.BHZ.Companion
            r0.getClass()
            X.BHZ r3 = X.BHW.LIZ(r1)
            if (r3 != 0) goto L6b
            goto L47
        L6b:
            com.bytedance.android.livesdk.model.Hashtag r1 = r4.LJLJLJ
            com.bytedance.android.livesdk.model.GameTag r0 = r4.LJLJL
            r3.updateHashTagGameTag(r1, r0)
            com.bytedance.android.livesdk.model.Hashtag r2 = r3.getHashtag()
            if (r2 == 0) goto L81
            com.bytedance.ies.sdk.datachannel.DataChannel r1 = r4.dataChannel
            if (r1 == 0) goto L81
            java.lang.Class<com.bytedance.android.livesdk.dataChannel.HashtagChangedChannel> r0 = com.bytedance.android.livesdk.dataChannel.HashtagChangedChannel.class
            r1.rv0(r0, r2)
        L81:
            com.bytedance.android.livesdk.model.GameTag r2 = r3.getGameTag()
            if (r2 == 0) goto L47
            com.bytedance.ies.sdk.datachannel.DataChannel r1 = r4.dataChannel
            if (r1 == 0) goto L47
            java.lang.Class<com.bytedance.android.livesdk.dataChannel.PreviewPagerSelectedGameItem> r0 = com.bytedance.android.livesdk.dataChannel.PreviewPagerSelectedGameItem.class
            r1.rv0(r0, r2)
            goto L47
        L91:
            r1 = 0
            goto L16
        L93:
            java.lang.Object r0 = r5.l1
            com.bytedance.android.livesdk.hashtag.BroadcastHashTagWidget r0 = (com.bytedance.android.livesdk.hashtag.BroadcastHashTagWidget) r0
            android.content.Context r4 = r0.context
            r0 = 2131837442(0x7f114202, float:1.930808E38)
            java.lang.String r3 = r4.getString(r0)
            java.lang.String r0 = "context.getString(R.stri…m_gametag_change_success)"
            kotlin.jvm.internal.o.LJIIIIZZ(r3, r0)
            java.lang.Object r0 = r5.l0
            com.bytedance.android.livesdk.model.GameTag r0 = (com.bytedance.android.livesdk.model.GameTag) r0
            java.lang.String r2 = r0.showName
            if (r2 != 0) goto Lae
            goto L4f
        Lae:
            r1 = 0
            java.lang.String r0 = "{game_tag}"
            java.lang.String r0 = ujb.o.LJJJJZ(r3, r0, r2, r1)
            X.C30868C9o.LJFF(r4, r0)
            goto L2a
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AfS54S0200000_5.accept$21(Y.AfS54S0200000_5, java.lang.Object):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void accept$22(AfS54S0200000_5 afS54S0200000_5, Object obj) {
        LiveSubOnlyConfig liveSubOnlyConfig;
        SubOnlyLiveSettingDialogNew subOnlyLiveSettingDialogNew = (SubOnlyLiveSettingDialogNew) afS54S0200000_5.l0;
        SubManagementResponse.Data data = (SubManagementResponse.Data) ((BaseResponse) obj).data;
        if (data != null) {
            liveSubOnlyConfig = data.liveSubOnlyConfig;
        } else {
            liveSubOnlyConfig = null;
        }
        subOnlyLiveSettingDialogNew.LJLZ = liveSubOnlyConfig;
        subOnlyLiveSettingDialogNew.vl((View) afS54S0200000_5.l1);
        C223338pd c223338pd = ((SubOnlyLiveSettingDialogNew) afS54S0200000_5.l0).LJLLJ;
        if (c223338pd != null) {
            C29306Beo.LJI(c223338pd);
        }
        C223338pd c223338pd2 = ((SubOnlyLiveSettingDialogNew) afS54S0200000_5.l0).LJLLJ;
        if (c223338pd2 != null) {
            c223338pd2.LIZJ();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Long, O] */
    public static final void accept$23(AfS54S0200000_5 afS54S0200000_5, Object obj) {
        StartPollResponse startPollResponse;
        DataChannel dataChannel;
        String str;
        BaseResponse baseResponse = (BaseResponse) obj;
        C30868C9o.LIZJ(R.string.noc);
        if (baseResponse == null || (startPollResponse = (StartPollResponse) baseResponse.data) == null || (dataChannel = ((PollManageDialog) afS54S0200000_5.l0).dataChannel) == null) {
            return;
        }
        ((C32537Cpp) dataChannel.gv0(C1N.class)).LIZ = Long.valueOf(startPollResponse.pollId);
        LiveMessageSEI liveMessageSEI = startPollResponse.liveMessageSEI;
        if (liveMessageSEI != null) {
            dataChannel.qv0(StartPollMessageSEIEvent.class, liveMessageSEI);
        }
        C1I.LIZ.LIZJ(startPollResponse.endTime - C30725C4b.LIZ(), dataChannel, (CCC) afS54S0200000_5.l1);
        CCC pollType = (CCC) afS54S0200000_5.l1;
        o.LJIIIZ(pollType, "pollType");
        BZI LIZ = C28787BRn.LIZ("livesdk_anchor_poll_start");
        LIZ.LJIILLIIL(dataChannel);
        CC3.LIZLLL(LIZ);
        LIZ.LJIJJ(Long.valueOf(startPollResponse.pollId), "poll_id");
        if (pollType == CCC.GIFT) {
            str = "gift_poll";
        } else {
            str = "normal_poll";
        }
        LIZ.LJIJJ(str, "poll_type");
        LIZ.LJJIIJZLJL();
        ((PollManageDialog) afS54S0200000_5.l0).dismiss();
    }

    public static final void accept$24(AfS54S0200000_5 afS54S0200000_5, Object obj) {
        DataChannel dataChannel = ((QuestionCardWidget) afS54S0200000_5.l0).dataChannel;
        if (dataChannel != null) {
            dataChannel.rv0(CurrentQuestionChannel.class, new QuestionEx(null, 0L, 0, false, false, false, 0L, 0, 0, 511, null));
        }
        InterfaceC88472Yns interfaceC88472Yns = (InterfaceC88472Yns) afS54S0200000_5.l1;
        if (interfaceC88472Yns != null) {
            interfaceC88472Yns.invoke(Boolean.TRUE);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void accept$25(AfS54S0200000_5 afS54S0200000_5, Object obj) {
        Question question = (Question) afS54S0200000_5.l0;
        question.answerFrom = 4;
        QuestionCardWidget.LLFFF((QuestionCardWidget) afS54S0200000_5.l1, question, ((StartAnswerResponse) ((BaseResponse) obj).data).duration, 4);
    }

    public static final void accept$26(AfS54S0200000_5 afS54S0200000_5, Object obj) {
        ((TryModeLiveProfileDialog) afS54S0200000_5.l0).LJLILLLLZI = (User) obj;
        InterfaceC65784Pro interfaceC65784Pro = (InterfaceC65784Pro) afS54S0200000_5.l1;
        if (interfaceC65784Pro != null) {
            interfaceC65784Pro.invoke();
        }
    }

    public static final void accept$27(AfS54S0200000_5 afS54S0200000_5, Object obj) {
        ((InterfaceC88472Yns) afS54S0200000_5.l0).invoke((Room) afS54S0200000_5.l1);
    }

    public static final void accept$28(AfS54S0200000_5 afS54S0200000_5, Object obj) {
        if (((BEU) obj).LIZ && ((MultiGuestUserCardCell) afS54S0200000_5.l0).LJLIL.LIZJ.LIZ()) {
            FollowInfo followInfo = ((User) afS54S0200000_5.l1).getFollowInfo();
            if (followInfo != null) {
                followInfo.setFollowStatus(0L);
            }
            FollowInfo followInfo2 = ((User) afS54S0200000_5.l1).getFollowInfo();
            if (followInfo2 != null) {
                followInfo2.setPushStatus(0L);
            }
            ((User) afS54S0200000_5.l1).isBlock = true;
            ((MultiGuestUserCardCell) afS54S0200000_5.l0).LJIILL(true);
        }
    }

    public static final void accept$29(AfS54S0200000_5 afS54S0200000_5, Object obj) {
        Creator creator;
        Handler handler;
        C29162BcU c29162BcU = (C29162BcU) afS54S0200000_5.l0;
        C29164BcW c29164BcW = (C29164BcW) afS54S0200000_5.l1;
        Room room = (Room) obj;
        c29162BcU.getClass();
        if (room != null && (creator = room.creator) != null && creator.roomContinue.intValue() == 1 && (handler = c29164BcW.LIZ) != null) {
            Message obtainMessage = handler.obtainMessage(40);
            obtainMessage.obj = room;
            obtainMessage.arg1 = 1;
            c29164BcW.LIZ.sendMessage(obtainMessage);
            return;
        }
        C29162BcU.LJ(c29164BcW.LIZIZ, c29164BcW.LJJIJIIJI, 1, c29164BcW.LJJIJIIJIL, "");
        C18200nY.LIZ("room_create", String.valueOf(System.currentTimeMillis()));
        if (room != null) {
            C29689Bkz.LIZ.LJIIL(new AObjectS45S0101000_13(1, room, 1));
            C29121Bbp.LIZ();
            C29121Bbp.LIZJ("is_anchor", "true");
            C29121Bbp.LIZJ("room_id", String.valueOf(room.getId()));
            C29121Bbp.LIZJ("room_type", String.valueOf(room.getStreamType()));
        }
        Handler handler2 = c29164BcW.LIZ;
        if (handler2 != null) {
            Message obtainMessage2 = handler2.obtainMessage(c29164BcW.LJFF);
            obtainMessage2.obj = room;
            c29164BcW.LIZ.sendMessage(obtainMessage2);
        }
        if (!LiveCoreDpExpSetting.INSTANCE.getValue() || room == null || room.getStreamUrl() == null || room.getStreamUrl().pushSdkParams == null) {
            return;
        }
        try {
            int optInt = new JSONObject(room.getStreamUrl().pushSdkParams).optInt("exp_val", -1);
            if (optInt <= 0) {
                return;
            }
            BZI LIZ = C28787BRn.LIZ("livesdk_dp_push_exp_value");
            LIZ.LJIJJ(Integer.valueOf(optInt), "exp_val");
            LIZ.LJJIIJZLJL();
        } catch (Exception unused) {
        }
    }

    public static final void accept$3(AfS54S0200000_5 afS54S0200000_5, Object obj) {
        DataChannel dataChannel = ((InteractionFeaturesDialog) afS54S0200000_5.l0).dataChannel;
        if (dataChannel != null) {
            dataChannel.rv0(CurrentQuestionChannel.class, (QuestionEx) afS54S0200000_5.l1);
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Long, O] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Boolean, O] */
    public static final void accept$30(AfS54S0200000_5 afS54S0200000_5, Object obj) {
        ((C32537Cpp) ((DataChannel) afS54S0200000_5.l0).gv0(C28398BCo.class)).LIZ = 0L;
        ((C32537Cpp) ((DataChannel) afS54S0200000_5.l0).gv0(BCZ.class)).LIZ = Boolean.TRUE;
        C30868C9o.LIZJ(R.string.sz0);
        ((InterfaceC65784Pro) afS54S0200000_5.l1).invoke();
    }

    public static final void accept$31(AfS54S0200000_5 afS54S0200000_5, Object obj) {
        ((InterfaceC88472Yns) afS54S0200000_5.l0).invoke(Boolean.TRUE);
        BAF.LJIIL((DataChannel) afS54S0200000_5.l1);
    }

    public static final void accept$32(AfS54S0200000_5 afS54S0200000_5, Object obj) {
        File file = (File) obj;
        o.LJIIIIZZ(file, "file");
        DataChannel dataChannel = (DataChannel) afS54S0200000_5.l0;
        InterfaceC88472Yns interfaceC88472Yns = (InterfaceC88472Yns) afS54S0200000_5.l1;
        MultipartTypedOutput multipartTypedOutput = new MultipartTypedOutput();
        multipartTypedOutput.addPart("file", new TypedFile("multipart/form-data", file));
        T28.LIZLLL(((DrawGuessApi) C1A.LIZJ(DrawGuessApi.class)).uploadImage(multipartTypedOutput)).LJJII(new AfS44S0300000_5(file, interfaceC88472Yns, dataChannel, 6), new AfS54S0200000_5(file, interfaceC88472Yns, 33));
    }

    public static final void accept$33(AfS54S0200000_5 afS54S0200000_5, Object obj) {
        C15420j4.LIZLLL(((File) afS54S0200000_5.l0).getPath());
        InterfaceC88472Yns interfaceC88472Yns = (InterfaceC88472Yns) afS54S0200000_5.l1;
        if (interfaceC88472Yns != null) {
            interfaceC88472Yns.invoke("");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void accept$34(AfS54S0200000_5 afS54S0200000_5, Object obj) {
        StartDrawGuessResponse startDrawGuessResponse;
        BaseResponse baseResponse = (BaseResponse) obj;
        DataChannel dataChannel = (DataChannel) afS54S0200000_5.l0;
        if (dataChannel != null) {
            if (baseResponse != null && (startDrawGuessResponse = (StartDrawGuessResponse) baseResponse.data) != null) {
                dataChannel.rv0(DrawGuessSessionIdChannel.class, Long.valueOf(startDrawGuessResponse.sessionId));
            } else {
                ((InterfaceC88472Yns) afS54S0200000_5.l1).invoke(Boolean.FALSE);
                return;
            }
        }
        ((InterfaceC88472Yns) afS54S0200000_5.l1).invoke(Boolean.TRUE);
        BAF.LJIILIIL((DataChannel) afS54S0200000_5.l0, false);
    }

    public static final void accept$35(AfS54S0200000_5 afS54S0200000_5, Object obj) {
        Long l = (Long) obj;
        if (((C29867Bnr) afS54S0200000_5.l1).LJLJJL == null || l.longValue() == ((C29867Bnr) afS54S0200000_5.l1).LJLJJL.getId()) {
            return;
        }
        ((C29867Bnr) afS54S0200000_5.l1).LJFF((ShareGuideMessage) afS54S0200000_5.l0, -1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void accept$36(AfS54S0200000_5 afS54S0200000_5, Object obj) {
        List<User> recentlySharedUsers;
        List<User> topRankUsers;
        BaseResponse baseResponse = (BaseResponse) obj;
        ((ArrayList) ((C29936Boy) afS54S0200000_5.l0).LIZ).clear();
        BatchShareUsersResult batchShareUsersResult = (BatchShareUsersResult) baseResponse.data;
        if (batchShareUsersResult != null && (topRankUsers = batchShareUsersResult.getTopRankUsers()) != null) {
            ((ArrayList) ((C29936Boy) afS54S0200000_5.l0).LIZ).addAll(topRankUsers);
        }
        ((ArrayList) ((C29936Boy) afS54S0200000_5.l0).LIZIZ).clear();
        BatchShareUsersResult batchShareUsersResult2 = (BatchShareUsersResult) baseResponse.data;
        if (batchShareUsersResult2 != null && (recentlySharedUsers = batchShareUsersResult2.getRecentlySharedUsers()) != null) {
            ((ArrayList) ((C29936Boy) afS54S0200000_5.l0).LIZIZ).addAll(recentlySharedUsers);
        }
        ((C29936Boy) afS54S0200000_5.l0).LIZJ = false;
        InterfaceC29937Boz interfaceC29937Boz = (InterfaceC29937Boz) afS54S0200000_5.l1;
        if (interfaceC29937Boz != null) {
            interfaceC29937Boz.run();
        }
    }

    public static final void accept$37(AfS54S0200000_5 afS54S0200000_5, Object obj) {
        ((C29936Boy) afS54S0200000_5.l0).LIZJ = false;
        InterfaceC29937Boz interfaceC29937Boz = (InterfaceC29937Boz) afS54S0200000_5.l1;
        if (interfaceC29937Boz != null) {
            interfaceC29937Boz.run();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void accept$38(AfS54S0200000_5 afS54S0200000_5, Object obj) {
        T t;
        Map<String, MGetTranslationResponse.Data.Translation> map;
        C31319CQx c31319CQx = (C31319CQx) afS54S0200000_5.l0;
        List list = (List) afS54S0200000_5.l1;
        BaseResponse baseResponse = (BaseResponse) obj;
        c31319CQx.getClass();
        ArrayList arrayList = new ArrayList();
        if (baseResponse != null && (t = baseResponse.data) != 0 && (map = ((MGetTranslationResponse.Data) t).translations) != null) {
            c31319CQx.LLJJ.LIZIZ(list, map);
        } else {
            list = arrayList;
        }
        c31319CQx.LL.addAll(list);
        c31319CQx.LJJZ();
    }

    public static final void accept$39(AfS54S0200000_5 afS54S0200000_5, Object obj) {
        C31319CQx c31319CQx = (C31319CQx) afS54S0200000_5.l0;
        c31319CQx.LL.addAll((List) afS54S0200000_5.l1);
        c31319CQx.LJJZ();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void accept$4(AfS54S0200000_5 afS54S0200000_5, Object obj) {
        BaseResponse response = (BaseResponse) obj;
        o.LJIIIZ(response, "response");
        if (((UgEmailConsentResult) response.data).showConsentPage) {
            ((C32364Cn2) afS54S0200000_5.l0).LIZ(1, "step");
            ((C32364Cn2) afS54S0200000_5.l0).LIZJ("email", ((IHostUser) CN1.LIZ(IHostUser.class)).getEmail());
            ((IActionHandlerService) CN1.LIZ(IActionHandlerService.class)).handle((Context) afS54S0200000_5.l1, UriProtector.parse(((C32364Cn2) afS54S0200000_5.l0).LIZLLL()));
            C48459J0d<Integer> c48459J0d = InterfaceC30442Bx8.LLLJIL;
            c48459J0d.LIZ(Integer.valueOf(c48459J0d.LIZJ().intValue() + 1));
        }
    }

    public static final void accept$40(AfS54S0200000_5 afS54S0200000_5, Object obj) {
        Map map = (Map) afS54S0200000_5.l0;
        DataChannel dataChannel = (DataChannel) afS54S0200000_5.l1;
        map.putAll((Map) obj);
        BZI LIZ = C28787BRn.LIZ("livesdk_live_show");
        LIZ.LJIILLIIL(dataChannel);
        LIZ.LJJIFFI(map);
        LIZ.LJJIIJZLJL();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void accept$41(AfS54S0200000_5 afS54S0200000_5, Object obj) {
        Integer num;
        UserInfo userInfo;
        BaseResponse baseResponse = (BaseResponse) obj;
        JSONObject jSONObject = (JSONObject) afS54S0200000_5.l0;
        UserInfoResponse.ResponseData responseData = (UserInfoResponse.ResponseData) baseResponse.data;
        UserInfo userInfo2 = null;
        if (responseData != null && (userInfo = responseData.info) != null) {
            num = Integer.valueOf(userInfo.minAge);
        } else {
            num = null;
        }
        jSONObject.put("age", num);
        InterfaceC88471Ynr interfaceC88471Ynr = (InterfaceC88471Ynr) afS54S0200000_5.l1;
        JSONObject jSONObject2 = (JSONObject) afS54S0200000_5.l0;
        UserInfoResponse.ResponseData responseData2 = (UserInfoResponse.ResponseData) baseResponse.data;
        if (responseData2 != null) {
            userInfo2 = responseData2.info;
        }
        interfaceC88471Ynr.invoke(jSONObject2, userInfo2);
    }

    public static final void accept$42(AfS54S0200000_5 afS54S0200000_5, Object obj) {
        ((JSONObject) afS54S0200000_5.l0).put("age", 0);
        ((InterfaceC88471Ynr) afS54S0200000_5.l1).invoke((JSONObject) afS54S0200000_5.l0, null);
    }

    public static final void accept$43(AfS54S0200000_5 afS54S0200000_5, Object obj) {
        long currentTimeMillis = System.currentTimeMillis();
        if (((BaseResponse) obj).statusCode == 0) {
            ((InterfaceC88472Yns) afS54S0200000_5.l0).invoke(Long.valueOf(currentTimeMillis));
        } else {
            ((InterfaceC88472Yns) afS54S0200000_5.l1).invoke(Long.valueOf(currentTimeMillis));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [X.BjM, O] */
    public static final void accept$44(AfS54S0200000_5 afS54S0200000_5, Object obj) {
        FollowCardResponse followCardResponse;
        FollowCard followCard;
        User user;
        BaseResponse baseResponse = (BaseResponse) obj;
        if (baseResponse != null && (followCardResponse = (FollowCardResponse) baseResponse.data) != null && (followCard = followCardResponse.followCard) != null) {
            FollowCardMessage followCardMessage = (FollowCardMessage) afS54S0200000_5.l0;
            ProgrammedLiveFollowCardWidget programmedLiveFollowCardWidget = (ProgrammedLiveFollowCardWidget) afS54S0200000_5.l1;
            if (!o.LJ(followCard.id, followCardMessage.followCardId)) {
                return;
            }
            programmedLiveFollowCardWidget.LJLLILLLL = followCard;
            ((C32537Cpp) programmedLiveFollowCardWidget.dataChannel.gv0(C28402BCs.class)).LIZ = new C29588BjM(followCard, SystemClock.elapsedRealtime());
            FollowCard followCard2 = programmedLiveFollowCardWidget.LJLLILLLL;
            if (followCard2 == null || (user = followCard2.user) == null) {
                return;
            }
            if (programmedLiveFollowCardWidget.LJLLL) {
                programmedLiveFollowCardWidget.LL(user);
                programmedLiveFollowCardWidget.LLFII(true);
            } else {
                programmedLiveFollowCardWidget.LJZI(EnumC29589BjN.NETWORK, true);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x013d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void accept$45(Y.AfS54S0200000_5 r22, java.lang.Object r23) {
        /*
            Method dump skipped, instructions count: 483
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AfS54S0200000_5.accept$45(Y.AfS54S0200000_5, java.lang.Object):void");
    }

    public static final void accept$46(AfS54S0200000_5 afS54S0200000_5, Object obj) {
        DataChannel dataChannel = ((C29656BkS) afS54S0200000_5.l0).getDataChannel();
        RoomSticker roomSticker = (RoomSticker) afS54S0200000_5.l1;
        C29598BjW.LJI(dataChannel, roomSticker, Boolean.valueOf(C29536BiW.LIZ(roomSticker, ((C29656BkS) afS54S0200000_5.l0).getContent())));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void accept$47(AfS54S0200000_5 afS54S0200000_5, Object obj) {
        BaseResponse baseResponse = (BaseResponse) obj;
        if (baseResponse.statusCode == 0 && baseResponse.data != 0) {
            ArrayList arrayList = new ArrayList();
            if (((C28881BVd) afS54S0200000_5.l0).LJJ) {
                if (!C79004UzY.LJJIFFI(((QuestionListResponse) baseResponse.data).unansweredList.questionExList)) {
                    arrayList.addAll(((QuestionListResponse) baseResponse.data).unansweredList.questionExList);
                    ((ArrayList) ((C28881BVd) afS54S0200000_5.l0).LJIIZILJ).addAll(((QuestionListResponse) baseResponse.data).unansweredList.questionExList);
                    ((C28881BVd) afS54S0200000_5.l0).LJIILIIL++;
                }
                ((C28881BVd) afS54S0200000_5.l0).LJJ = ((QuestionListResponse) baseResponse.data).unansweredList.hasMore;
            }
            if (!((C28881BVd) afS54S0200000_5.l0).LJJ) {
                if (!C79004UzY.LJJIFFI(((QuestionListResponse) baseResponse.data).answeredList.questionExList)) {
                    if (!((C28881BVd) afS54S0200000_5.l0).LJIJJ) {
                        arrayList.add(new QuestionEx(new Question(0L, "", 12, 0L, new User()), 0L, 0, false, false, false, 0L, 0, 0, 504, null));
                        ((C28881BVd) afS54S0200000_5.l0).LJIJJ = true;
                    }
                    arrayList.addAll(((QuestionListResponse) baseResponse.data).answeredList.questionExList);
                    ((ArrayList) ((C28881BVd) afS54S0200000_5.l0).LJIJ).addAll(((QuestionListResponse) baseResponse.data).answeredList.questionExList);
                    ((C28881BVd) afS54S0200000_5.l0).LJIILJJIL++;
                }
                ((C28881BVd) afS54S0200000_5.l0).LJJI = ((QuestionListResponse) baseResponse.data).answeredList.hasMore;
            }
            C28881BVd c28881BVd = (C28881BVd) afS54S0200000_5.l0;
            if (!c28881BVd.LJJ && !c28881BVd.LJJI) {
                if (!C79004UzY.LJJIFFI(((QuestionListResponse) baseResponse.data).invitedList.questionExList)) {
                    if (!((C28881BVd) afS54S0200000_5.l0).LJIJJLI) {
                        arrayList.add(new QuestionEx(new Question(0L, "", 13, 0L, new User()), 0L, 0, false, false, false, 0L, 0, 0, 504, null));
                        ((C28881BVd) afS54S0200000_5.l0).LJIJJLI = true;
                    }
                    ArrayList arrayList2 = new ArrayList();
                    Iterator<QuestionEx> it = ((QuestionListResponse) baseResponse.data).invitedList.questionExList.iterator();
                    while (it.hasNext()) {
                        QuestionEx next = it.next();
                        next.LJLJI = true;
                        arrayList2.add(next);
                    }
                    arrayList.addAll(arrayList2);
                    ((ArrayList) ((C28881BVd) afS54S0200000_5.l0).LJIJI).addAll(arrayList2);
                    ((C28881BVd) afS54S0200000_5.l0).LJIILL++;
                }
                ((C28881BVd) afS54S0200000_5.l0).LJJIFFI = ((QuestionListResponse) baseResponse.data).invitedList.hasMore;
            }
            ((ArrayList) ((C28881BVd) afS54S0200000_5.l0).LJIILLIIL).addAll(arrayList);
            ((C28881BVd) afS54S0200000_5.l0).LJFF.postValue(C06900Ow.LIZJ);
            ((AbstractC19020os) afS54S0200000_5.l1).LIZ(arrayList);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void accept$48(AfS54S0200000_5 afS54S0200000_5, Object obj) {
        BaseResponse baseResponse = (BaseResponse) obj;
        int i = 0;
        C28874BUw.LJII = false;
        if (baseResponse.statusCode == 0 && baseResponse.data != 0) {
            ArrayList arrayList = new ArrayList();
            arrayList.addAll(((QuestionList) baseResponse.data).questionExList);
            boolean z = ((QuestionList) baseResponse.data).hasMore;
            C28874BUw.LIZIZ = z;
            if (z) {
                C28874BUw.LIZLLL++;
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                int i2 = i + 1;
                if (i >= 0) {
                    QuestionEx questionEx = (QuestionEx) next;
                    questionEx.LJLIL = true;
                    Question question = questionEx.question;
                    String str = question.content;
                    o.LJIIIIZZ(str, "questionEx.question.content");
                    question.content = new OJD("\t|\r|\n").replace(str, " ");
                    questionEx.question.recReqId = ((QuestionList) baseResponse.data).recReqId;
                    questionEx.LJLJJL = arrayList.size();
                    questionEx.LJLJJLL = i;
                    i = i2;
                } else {
                    C47261Igj.LJJJJJ();
                    throw null;
                }
            }
            ((ArrayList) C28874BUw.LJ).addAll(arrayList);
            InterfaceC88472Yns interfaceC88472Yns = (InterfaceC88472Yns) afS54S0200000_5.l0;
            if (interfaceC88472Yns != null) {
                interfaceC88472Yns.invoke(arrayList);
                return;
            }
            return;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(baseResponse.statusCode);
        LIZ.append(": ");
        LIZ.append(baseResponse.data);
        C30868C9o.LJI(X1D.LIZIZ(LIZ));
        InterfaceC88472Yns interfaceC88472Yns2 = (InterfaceC88472Yns) afS54S0200000_5.l1;
        if (interfaceC88472Yns2 != null) {
            interfaceC88472Yns2.invoke(new Exception());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void accept$49(AfS54S0200000_5 afS54S0200000_5, Object obj) {
        Map<String, MGetTranslationResponse.Data.Translation> map;
        BaseResponse response = (BaseResponse) obj;
        o.LJIIIZ(response, "response");
        AbstractC31361CSn abstractC31361CSn = (AbstractC31361CSn) afS54S0200000_5.l1;
        List list = (List) afS54S0200000_5.l0;
        MGetTranslationResponse.Data data = (MGetTranslationResponse.Data) response.data;
        if (data != null && (map = data.translations) != null) {
            abstractC31361CSn.LIZIZ(list, map);
            for (Object obj2 : list) {
                InterfaceC31364CSq<T> interfaceC31364CSq = abstractC31361CSn.LJIIJ;
                if (interfaceC31364CSq != 0) {
                    interfaceC31364CSq.LIZ(obj2);
                }
            }
            return;
        }
        List list2 = (List) afS54S0200000_5.l0;
        AbstractC31361CSn abstractC31361CSn2 = (AbstractC31361CSn) afS54S0200000_5.l1;
        for (Object obj3 : list2) {
            InterfaceC31364CSq<T> interfaceC31364CSq2 = abstractC31361CSn2.LJIIJ;
            if (interfaceC31364CSq2 != 0) {
                interfaceC31364CSq2.LIZ(obj3);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void accept$5(AfS54S0200000_5 afS54S0200000_5, Object obj) {
        BaseResponse response = (BaseResponse) obj;
        o.LJIIIZ(response, "response");
        if (((UgEmailConsentResult) response.data).showConsentPage) {
            ((C32364Cn2) afS54S0200000_5.l0).LIZ(1, "step");
            ((C32364Cn2) afS54S0200000_5.l0).LIZJ("email", ((IHostUser) CN1.LIZ(IHostUser.class)).getEmail());
            ((IActionHandlerService) CN1.LIZ(IActionHandlerService.class)).handle((Context) afS54S0200000_5.l1, UriProtector.parse(((C32364Cn2) afS54S0200000_5.l0).LIZLLL()));
            C48459J0d<Integer> c48459J0d = InterfaceC30442Bx8.LLLL;
            c48459J0d.LIZ(Integer.valueOf(c48459J0d.LIZJ().intValue() + 1));
        }
    }

    public static final void accept$50(AfS54S0200000_5 afS54S0200000_5, Object obj) {
        Throwable e = (Throwable) obj;
        List list = (List) afS54S0200000_5.l0;
        AbstractC31361CSn abstractC31361CSn = (AbstractC31361CSn) afS54S0200000_5.l1;
        for (Object obj2 : list) {
            InterfaceC31364CSq<T> interfaceC31364CSq = abstractC31361CSn.LJIIJ;
            if (interfaceC31364CSq != 0) {
                o.LJIIIIZZ(e, "e");
                interfaceC31364CSq.LIZJ(obj2, e);
            }
        }
    }

    public static final void accept$51(AfS54S0200000_5 afS54S0200000_5, Object obj) {
        UserAttr userAttr;
        DataChannel LJIILIIL;
        List list;
        List list2;
        C17240m0 c17240m0;
        C2A7 c2a7;
        C17230lz c17230lz = ((ModeratorPermissionEditFragmentSheet) afS54S0200000_5.l0).LJLLLL;
        if (c17230lz != null && (list2 = c17230lz.LIZ) != null && (c17240m0 = (C17240m0) ListProtector.get(list2, 0)) != null && (c2a7 = c17240m0.LIZLLL) != null) {
            c2a7.LJL();
        }
        ModeratorPermissionEditFragmentSheet moderatorPermissionEditFragmentSheet = (ModeratorPermissionEditFragmentSheet) afS54S0200000_5.l0;
        BFC bfc = moderatorPermissionEditFragmentSheet.LLD;
        if (bfc != null) {
            bfc.LJI = true;
            bfc.LJII = (Map) afS54S0200000_5.l1;
            BBP bbp = moderatorPermissionEditFragmentSheet.LLF;
            if (bbp != null) {
                if (bbp == BBP.MANAGE_MODERATOR && (LJIILIIL = C51029K0z.LJIILIIL(moderatorPermissionEditFragmentSheet)) != null && (list = (List) LJIILIIL.kv0(ModeratorListChannel.class)) != null) {
                    BFC bfc2 = ((ModeratorPermissionEditFragmentSheet) afS54S0200000_5.l0).LLD;
                    if (bfc2 != null) {
                        list.add(bfc2);
                    } else {
                        o.LJIJI("targetUser");
                        throw null;
                    }
                }
                ModeratorPermissionEditFragmentSheet moderatorPermissionEditFragmentSheet2 = (ModeratorPermissionEditFragmentSheet) afS54S0200000_5.l0;
                if (!moderatorPermissionEditFragmentSheet2.LLI) {
                    Object[] objArr = new Object[1];
                    BFC bfc3 = moderatorPermissionEditFragmentSheet2.LLD;
                    if (bfc3 != null) {
                        objArr[0] = C05170If.LIZIZ(bfc3.LIZLLL, bfc3.LIZJ);
                        String LJIILL = C15380j0.LJIILL(R.string.n2h, objArr);
                        o.LJIIIIZZ(LJIILL, "getString(R.string.pm_mo…Id, targetUser.nickName))");
                        C30868C9o.LJI(LJIILL);
                    } else {
                        o.LJIJI("targetUser");
                        throw null;
                    }
                }
                ModeratorPermissionEditFragmentSheet moderatorPermissionEditFragmentSheet3 = (ModeratorPermissionEditFragmentSheet) afS54S0200000_5.l0;
                Map<Integer, Integer> map = (Map) afS54S0200000_5.l1;
                if (!moderatorPermissionEditFragmentSheet3.LLI && (userAttr = (UserAttr) moderatorPermissionEditFragmentSheet3.LLIIII.getValue()) != null) {
                    userAttr.adminPermissions = map;
                    userAttr.isAdmin = true;
                }
                ((ModeratorPermissionEditFragmentSheet) afS54S0200000_5.l0).Ql();
                return;
            }
            o.LJIJI("lastPage");
            throw null;
        }
        o.LJIJI("targetUser");
        throw null;
    }

    public static final void accept$52(AfS54S0200000_5 afS54S0200000_5, Object obj) {
        UserAttr userAttr;
        DataChannel LJIILIIL;
        List list;
        ((C2A7) ((ModeratorPermissionEditFragment) afS54S0200000_5.l0)._$_findCachedViewById(R.id.br0)).LJL();
        ModeratorPermissionEditFragment moderatorPermissionEditFragment = (ModeratorPermissionEditFragment) afS54S0200000_5.l0;
        BFC bfc = moderatorPermissionEditFragment.LJLIL;
        if (bfc != null) {
            bfc.LJI = true;
            bfc.LJII = (Map) afS54S0200000_5.l1;
            BBP bbp = moderatorPermissionEditFragment.LJLILLLLZI;
            if (bbp != null) {
                if (bbp == BBP.MANAGE_MODERATOR && (LJIILIIL = C51029K0z.LJIILIIL(moderatorPermissionEditFragment)) != null && (list = (List) LJIILIIL.kv0(ModeratorListChannel.class)) != null) {
                    BFC bfc2 = ((ModeratorPermissionEditFragment) afS54S0200000_5.l0).LJLIL;
                    if (bfc2 != null) {
                        list.add(bfc2);
                    } else {
                        o.LJIJI("targetUser");
                        throw null;
                    }
                }
                ModeratorPermissionEditFragment moderatorPermissionEditFragment2 = (ModeratorPermissionEditFragment) afS54S0200000_5.l0;
                if (!moderatorPermissionEditFragment2.LJLJL) {
                    Object[] objArr = new Object[1];
                    BFC bfc3 = moderatorPermissionEditFragment2.LJLIL;
                    if (bfc3 != null) {
                        objArr[0] = C05170If.LIZIZ(bfc3.LIZLLL, bfc3.LIZJ);
                        String LJIILL = C15380j0.LJIILL(R.string.n2h, objArr);
                        o.LJIIIIZZ(LJIILL, "getString(R.string.pm_mo…Id, targetUser.nickName))");
                        C30868C9o.LJI(LJIILL);
                    } else {
                        o.LJIJI("targetUser");
                        throw null;
                    }
                }
                ModeratorPermissionEditFragment moderatorPermissionEditFragment3 = (ModeratorPermissionEditFragment) afS54S0200000_5.l0;
                Map<Integer, Integer> map = (Map) afS54S0200000_5.l1;
                if (!moderatorPermissionEditFragment3.LJLJL && (userAttr = (UserAttr) moderatorPermissionEditFragment3.LJLLI.getValue()) != null) {
                    userAttr.adminPermissions = map;
                    userAttr.isAdmin = true;
                }
                ((ModeratorPermissionEditFragment) afS54S0200000_5.l0).Dl();
                return;
            }
            o.LJIJI("lastPage");
            throw null;
        }
        o.LJIJI("targetUser");
        throw null;
    }

    public static final void accept$53(AfS54S0200000_5 afS54S0200000_5, Object obj) {
        ((BV8) afS54S0200000_5.l0).LJZ.rv0(CurrentQuestionChannel.class, (QuestionEx) afS54S0200000_5.l1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void accept$54(AfS54S0200000_5 afS54S0200000_5, Object obj) {
        BVA bva = (BVA) afS54S0200000_5.l0;
        QuestionEx questionEx = (QuestionEx) afS54S0200000_5.l1;
        bva.getClass();
        questionEx.LJLJJI = ((StartAnswerResponse) ((BaseResponse) obj).data).duration;
        bva.LJLJLJ.LL.rv0(CurrentQuestionChannel.class, questionEx);
    }

    public static final void accept$55(AfS54S0200000_5 afS54S0200000_5, Object obj) {
        ((BV8) afS54S0200000_5.l0).LJZ.rv0(CurrentQuestionChannel.class, (QuestionEx) afS54S0200000_5.l1);
    }

    public static final void accept$56(AfS54S0200000_5 afS54S0200000_5, Object obj) {
        C73943T0h.LIZ().LIZIZ(new CJ5((FollowPair) obj));
        DataChannel dataChannel = (DataChannel) afS54S0200000_5.l0;
        if (dataChannel != null) {
            LinkCrossRoomDataHolder linkCrossRoomDataHolder = (LinkCrossRoomDataHolder) afS54S0200000_5.l1;
            Room LJJIJLIJ = C29306Beo.LJJIJLIJ(dataChannel);
            if (LJJIJLIJ != null) {
                C29319Bf1.LIZJ(linkCrossRoomDataHolder.LJIIJ, linkCrossRoomDataHolder.LJFF, C29306Beo.LJIIJ(dataChannel), linkCrossRoomDataHolder.LJI, LJJIJLIJ, dataChannel, "connection_follow_guide", 0L);
            }
        }
    }

    public static final void accept$57(AfS54S0200000_5 afS54S0200000_5, Object obj) {
        C30168Bsi c30168Bsi = (C30168Bsi) afS54S0200000_5.l0;
        C0F c0f = (C0F) afS54S0200000_5.l1;
        c30168Bsi.getClass();
        View view = null;
        View LJI = C20910rv.LJI(R.layout.dlb, null, false, 12);
        InterfaceC30237Btp interfaceC30237Btp = c30168Bsi.LJLL;
        if (interfaceC30237Btp != null) {
            view = interfaceC30237Btp.LJFF();
        }
        C1YK c1yk = new C1YK(view);
        c1yk.LIZJ = LJI;
        c1yk.LJIILIIL = new C0D(c0f);
        c1yk.LJIIL = new C0E(c0f);
        c1yk.LJI = c30168Bsi.LJLLILLLL;
        c1yk.LJII = true;
        C30770C5u.LIZLLL(new C1YL(c1yk), C09.ANCHOR_WEEKLY_RANKING_GIFT);
    }

    public static final void accept$58(AfS54S0200000_5 afS54S0200000_5, Object obj) {
        C73943T0h.LIZ().LIZIZ(new CJ5((FollowPair) obj));
        DataChannel dataChannel = (DataChannel) afS54S0200000_5.l0;
        if (dataChannel != null) {
            LinkCrossRoomDataHolder linkCrossRoomDataHolder = (LinkCrossRoomDataHolder) afS54S0200000_5.l1;
            Room LJJIJLIJ = C29306Beo.LJJIJLIJ(dataChannel);
            if (LJJIJLIJ != null) {
                C29319Bf1.LIZJ(linkCrossRoomDataHolder.LJIIJ, linkCrossRoomDataHolder.LJFF, C29306Beo.LJIIJ(dataChannel), linkCrossRoomDataHolder.LJI, LJJIJLIJ, dataChannel, "connection_follow_guide", 0L);
            }
        }
    }

    public static final void accept$59(AfS54S0200000_5 afS54S0200000_5, Object obj) {
        if (((BEU) obj).LIZ && ((CoHostUserCardCell) afS54S0200000_5.l0).LJLIL.LIZJ.LIZ()) {
            ((User) afS54S0200000_5.l1).getFollowInfo().setFollowStatus(0L);
            ((User) afS54S0200000_5.l1).isBlock = true;
            ((CoHostUserCardCell) afS54S0200000_5.l0).LJIILJJIL(true);
        }
    }

    public static final void accept$6(AfS54S0200000_5 afS54S0200000_5, Object obj) {
        if (!o.LJ(obj, (C05490Jl) afS54S0200000_5.l0)) {
            ((LiveMuteDurationSettingFragment) afS54S0200000_5.l1).LJLIL = (C05490Jl) afS54S0200000_5.l0;
            ((IUserManageService) CN1.LIZ(IUserManageService.class)).zr((C05490Jl) afS54S0200000_5.l0);
        }
    }

    public static final void accept$60(AfS54S0200000_5 afS54S0200000_5, Object obj) {
        C05490Jl it = (C05490Jl) obj;
        IUserManageService iUserManageService = (IUserManageService) afS54S0200000_5.l0;
        BXT bxt = (BXT) afS54S0200000_5.l1;
        User user = bxt.LJLJLLL;
        long id = bxt.LJLL.getId();
        o.LJIIIIZZ(it, "it");
        iUserManageService.Ns(id, user, it, (BXT) afS54S0200000_5.l1);
        ((BXT) afS54S0200000_5.l1).LJJIIZ("mute");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void accept$61(AfS54S0200000_5 afS54S0200000_5, Object obj) {
        if (((RoomCreateInfo) ((BaseResponse) obj).data).guideStatus == 3) {
            BXB.LIZIZ((Activity) afS54S0200000_5.l0, (DataChannel) afS54S0200000_5.l1);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void accept$62(AfS54S0200000_5 afS54S0200000_5, Object obj) {
        Integer num;
        BaseResponse baseResponse = (BaseResponse) obj;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("anchor_toggle_info form server, open ");
        AnchorToggleInfoResponse.ResponseData responseData = (AnchorToggleInfoResponse.ResponseData) baseResponse.data;
        Integer num2 = null;
        if (responseData != null) {
            num = Integer.valueOf(responseData.status);
        } else {
            num = null;
        }
        QZY.LIZJ(LIZ, num, LIZ, "GameBcToggleHandler");
        AnchorToggleInfoResponse.ResponseData responseData2 = (AnchorToggleInfoResponse.ResponseData) baseResponse.data;
        if (responseData2 != null) {
            num2 = Integer.valueOf(responseData2.status);
        }
        boolean z = false;
        if (num2 != null) {
            if (num2.intValue() == 1) {
                C30579BzL c30579BzL = (C30579BzL) afS54S0200000_5.l0;
                LiveMode liveMode = (LiveMode) afS54S0200000_5.l1;
                c30579BzL.getClass();
                C30579BzL.LJFF(liveMode, false);
            } else if (num2.intValue() == 2) {
                C30579BzL c30579BzL2 = (C30579BzL) afS54S0200000_5.l0;
                LiveMode liveMode2 = (LiveMode) afS54S0200000_5.l1;
                c30579BzL2.getClass();
                C30579BzL.LJFF(liveMode2, true);
            }
        }
        if (((LiveMode) afS54S0200000_5.l1) == LiveMode.VIDEO) {
            DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LJLJJI;
            AnchorToggleInfoResponse.ResponseData responseData3 = (AnchorToggleInfoResponse.ResponseData) baseResponse.data;
            if (responseData3 != null && responseData3.taskCount > 0) {
                z = true;
            }
            dataChannelGlobal.tv0(PartnershipGameTaskShowCount.class, Boolean.valueOf(z));
        }
    }

    public static final void accept$63(AfS54S0200000_5 afS54S0200000_5, Object obj) {
        ((GamePartnershipService) afS54S0200000_5.l0).LJ((Throwable) obj);
        ((InterfaceC88472Yns) afS54S0200000_5.l1).invoke(C30605Bzl.LJII);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void accept$64(AfS54S0200000_5 afS54S0200000_5, Object obj) {
        IMessageManager iMessageManager;
        BaseResponse result = (BaseResponse) obj;
        o.LJIIIZ(result, "result");
        Room room = (Room) afS54S0200000_5.l0;
        DataChannel dataChannel = (DataChannel) afS54S0200000_5.l1;
        ShareReportResult shareReportResult = (ShareReportResult) result.data;
        if (shareReportResult != null && shareReportResult.getDeltaIntimacy() > 0 && (iMessageManager = (IMessageManager) dataChannel.kv0(C29927Bop.class)) != null) {
            iMessageManager.insertMessage(C31309CQn.LJIJI(room.getId(), shareReportResult.getDisplayText(), (User) dataChannel.kv0(RoomUserChannel.class)), true);
        }
    }

    public static final void accept$65(AfS54S0200000_5 afS54S0200000_5, Object obj) {
        if (!InterfaceC30442Bx8.b.LIZJ().booleanValue()) {
            C32612Cr2 c32612Cr2 = (C32612Cr2) afS54S0200000_5.l0;
            long j = ((C72242sW) afS54S0200000_5.l1).element;
            InterfaceC32645CrZ interfaceC32645CrZ = c32612Cr2.LIZJ;
            if (interfaceC32645CrZ != null) {
                interfaceC32645CrZ.LIZ(j);
            }
        }
    }

    public static final void accept$66(AfS54S0200000_5 afS54S0200000_5, Object obj) {
        C32612Cr2 c32612Cr2 = (C32612Cr2) afS54S0200000_5.l0;
        long j = ((C72242sW) afS54S0200000_5.l1).element;
        InterfaceC32645CrZ interfaceC32645CrZ = c32612Cr2.LIZJ;
        if (interfaceC32645CrZ != null) {
            interfaceC32645CrZ.LIZ(j);
        }
    }

    public static final void accept$67(AfS54S0200000_5 afS54S0200000_5, Object obj) {
        C32604Cqu c32604Cqu = ((C32603Cqt) afS54S0200000_5.l0).LJLJI;
        if (c32604Cqu != null) {
            c32604Cqu.LIZIZ((C32633CrN) afS54S0200000_5.l1);
        }
    }

    public static final void accept$68(AfS54S0200000_5 afS54S0200000_5, Object obj) {
        C32604Cqu c32604Cqu = ((C32603Cqt) afS54S0200000_5.l0).LJLJI;
        if (c32604Cqu != null) {
            c32604Cqu.LIZIZ((C32633CrN) afS54S0200000_5.l1);
        }
    }

    public static final void accept$69(AfS54S0200000_5 afS54S0200000_5, Object obj) {
        C29800Bmm c29800Bmm;
        C32633CrN c32633CrN;
        AbstractC29786BmY abstractC29786BmY = (AbstractC29786BmY) afS54S0200000_5.l0;
        if (!(abstractC29786BmY instanceof C29787BmZ) || (c29800Bmm = ((C29787BmZ) abstractC29786BmY).LIZ) == null) {
            return;
        }
        int i = c29800Bmm.LJIIJJI;
        boolean VR = ((IStarCommentService) CN1.LIZ(IStarCommentService.class)).VR();
        if (c29800Bmm.LJIIJJI == 0) {
            if (!C32129CjF.LIZ.LJIL && !VR) {
                return;
            }
            C32128CjE c32128CjE = C32129CjF.LIZ;
            if (c32128CjE.LJIL || VR) {
                i = c32128CjE.LJJ;
            }
        }
        int MW = ((IUserLevelService) CN1.LIZ(IUserLevelService.class)).MW(i);
        if (!C32129CjF.LIZ.LJIILLIIL && ((IUserLevelService) CN1.LIZ(IUserLevelService.class)).rh(i) && !((ArrayList) ((C32603Cqt) afS54S0200000_5.l1).LJLJLJ).contains(Integer.valueOf(MW)) && UserLevelEnableSetting.INSTANCE.getValue()) {
            View LJI = C20910rv.LJI(R.layout.djc, null, false, 12);
            C47061t0 c47061t0 = (C47061t0) LJI.findViewById(R.id.mze);
            TextView textView = (TextView) LJI.findViewById(R.id.bud);
            Locale locale = Locale.US;
            String LJIILJJIL = C15380j0.LJIILJJIL(R.string.k__);
            o.LJIIIIZZ(LJIILJJIL, "getString(R.string.pm_alp_levelup_tooltip)");
            String LLLZI = C16880lQ.LLLZI(locale, LJIILJJIL, Arrays.copyOf(new Object[]{Integer.valueOf(MW)}, 1));
            o.LJIIIIZZ(LLLZI, "format(locale, format, *args)");
            textView.setText(LLLZI);
            C15620jO.LIZIZ(c29800Bmm.LJ, c47061t0);
            ((ArrayList) ((C32603Cqt) afS54S0200000_5.l1).LJLJLJ).add(Integer.valueOf(MW));
            C32633CrN c32633CrN2 = new C32633CrN(EnumC32608Cqy.USER_LEVEL, EnumC32627CrH.BUBBLE, 0L);
            C1YK c1yk = new C1YK(((C32603Cqt) afS54S0200000_5.l1).LJLILLLLZI);
            c1yk.LIZJ = LJI;
            c1yk.LJIILLIIL = textView.getText();
            C32603Cqt c32603Cqt = (C32603Cqt) afS54S0200000_5.l1;
            c1yk.LJIILIIL = c32603Cqt.LJLJLLL;
            c1yk.LJIIL = new C32586Cqc(c32603Cqt, c32633CrN2, c29800Bmm);
            c1yk.LJI = LiveGuideBubbleDurationSetting.INSTANCE.getValue() * 1000;
            c1yk.LJII = true;
            C30770C5u.LIZLLL(new C1YL(c1yk), C09.USER_LEVEL);
        }
        C32603Cqt c32603Cqt2 = (C32603Cqt) afS54S0200000_5.l1;
        C32604Cqu c32604Cqu = c32603Cqt2.LJLJI;
        if (c32604Cqu == null || (c32633CrN = c32603Cqt2.LJLJL) == null) {
            return;
        }
        c32604Cqu.LIZIZ(c32633CrN);
    }

    public static final void accept$7(AfS54S0200000_5 afS54S0200000_5, Object obj) {
        if (!o.LJ(obj, (C05490Jl) afS54S0200000_5.l0)) {
            ((LiveMuteDurationSettingFragmentSheet) afS54S0200000_5.l1).LLD = (C05490Jl) afS54S0200000_5.l0;
            ((IUserManageService) CN1.LIZ(IUserManageService.class)).zr((C05490Jl) afS54S0200000_5.l0);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void accept$70(AfS54S0200000_5 afS54S0200000_5, Object obj) {
        String str;
        long j;
        Boolean bool;
        T t = ((BaseResponse) obj).data;
        if (t != 0) {
            C30841C8n c30841C8n = (C30841C8n) afS54S0200000_5.l0;
            GetInvitationStatusResponse getInvitationStatusResponse = (GetInvitationStatusResponse) t;
            InterfaceC88472Yns interfaceC88472Yns = (InterfaceC88472Yns) afS54S0200000_5.l1;
            c30841C8n.getClass();
            long currentUserId = B83.LIZ().LIZIZ().getCurrentUserId();
            SubInvitationCode subInvitationCode = getInvitationStatusResponse.inviteCodeData;
            if (subInvitationCode == null || (str = subInvitationCode.inviteeId) == null) {
                str = "";
            }
            User user = getInvitationStatusResponse.inviterInfo;
            if (user != null) {
                j = user.getId();
            } else {
                j = 0;
            }
            if (TextUtils.isEmpty(str) || currentUserId == 0) {
                C0NB.LIZLLL("inviteeCode empty or currentId == 0");
                return;
            }
            if (TextUtils.equals(str, String.valueOf(currentUserId))) {
                SubInvitationInviteeStatus subInvitationInviteeStatus = getInvitationStatusResponse.inviteeStatus;
                if (subInvitationInviteeStatus == null) {
                    return;
                }
                int i = subInvitationInviteeStatus.invitationStatus;
                if (i != 0 && i != 10) {
                    if (i != 20) {
                        if (i != 30) {
                            if (i != 40) {
                                return;
                            }
                            interfaceC88472Yns.invoke(SubscribeInvitationLynxUrlSetting.INSTANCE.getHome_page());
                            return;
                        }
                        SubOptInStatus subOptInStatus = subInvitationInviteeStatus.optInStatus;
                        if (subOptInStatus != null) {
                            bool = Boolean.valueOf(subOptInStatus.initialized);
                        } else {
                            bool = null;
                        }
                        if (C29306Beo.LJIL(bool)) {
                            c30841C8n.LJLILLLLZI = Boolean.FALSE;
                            interfaceC88472Yns.invoke("native_click_entrance");
                            return;
                        }
                        SubOptInStatus subOptInStatus2 = subInvitationInviteeStatus.optInStatus;
                        if (subOptInStatus2 == null) {
                            return;
                        }
                        if (subOptInStatus2.auditStatus == 3) {
                            interfaceC88472Yns.invoke(SubscribeInvitationLynxUrlSetting.INSTANCE.getHome_page());
                            return;
                        } else {
                            if (subOptInStatus2.auditStatus != 2) {
                                return;
                            }
                            interfaceC88472Yns.invoke(SubscribeInvitationLynxUrlSetting.INSTANCE.getInvitation_card());
                            return;
                        }
                    }
                    interfaceC88472Yns.invoke(SubscribeInvitationLynxUrlSetting.INSTANCE.getInvitation_card());
                    return;
                }
                Boolean LIZJ = InterfaceC30442Bx8.LJLLILLLL.LIZJ();
                o.LJIIIIZZ(LIZJ, "LIVE_SUBSCRIBE_FIRST_SHOW_INVITATION_PAGE.value");
                if (LIZJ.booleanValue()) {
                    interfaceC88472Yns.invoke("native_letter_cover");
                    return;
                } else {
                    interfaceC88472Yns.invoke(SubscribeInvitationLynxUrlSetting.INSTANCE.getInvitation_card());
                    return;
                }
            }
            if (currentUserId == j) {
                interfaceC88472Yns.invoke(SubscribeInvitationLynxUrlSetting.INSTANCE.getInvitation_card());
            } else {
                interfaceC88472Yns.invoke(SubscribeInvitationLynxUrlSetting.INSTANCE.getWrong_invitation());
            }
        }
    }

    public static final void accept$71(AfS54S0200000_5 afS54S0200000_5, Object obj) {
        int i;
        String str;
        String str2;
        if (((C32609Cqz) afS54S0200000_5.l0).getMIView() == null) {
            return;
        }
        C32633CrN c32633CrN = new C32633CrN(EnumC32608Cqy.MATCH_ITEM_AWARD_GUIDE, EnumC32627CrH.ANIMATION, 0L);
        InterfaceC32642CrW mIView = ((C32609Cqz) afS54S0200000_5.l0).getMIView();
        if (mIView != null) {
            mIView.LIZ(c32633CrN);
        }
        C47061t0 c47061t0 = ((C32609Cqz) afS54S0200000_5.l0).LJLJJI;
        if (c47061t0 != null) {
            C29306Beo.LJJLIIIJJI(c47061t0, true);
        }
        C32609Cqz c32609Cqz = (C32609Cqz) afS54S0200000_5.l0;
        C47061t0 c47061t02 = c32609Cqz.LJLJJI;
        if (c47061t02 == null) {
            return;
        }
        C32629CrJ c32629CrJ = (C32629CrJ) afS54S0200000_5.l1;
        C15540jG c15540jG = new C15540jG();
        c15540jG.LJIILIIL = true;
        c15540jG.LIZ = c47061t02;
        c15540jG.LIZIZ = CFX.LIZ("tiktok_live_basic_resource", "tiktok_live_revenue_demand_2");
        c15540jG.LIZJ = "ttlive_match_item_award_guide_anim.webp";
        c15540jG.LJFF = true;
        c15540jG.LJ = new C32635CrP(c32609Cqz);
        C15490jB.LJI(c15540jG);
        Integer num = c32629CrJ.LIZLLL;
        if (num != null) {
            i = num.intValue();
        } else {
            i = 0;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (i != 1) {
            if (i != 2) {
                str = "";
            } else {
                str = "magic_smokes";
            }
        } else {
            str = "boosting_gloves";
        }
        linkedHashMap.put("match_item_type", str);
        linkedHashMap.put("show_type", "bubble");
        linkedHashMap.put("pk_id", String.valueOf(C31120CJg.LIZ()));
        linkedHashMap.put("channel_id", String.valueOf(C31120CJg.LIZ.LJJLI()));
        InterfaceC29405BgP LIZIZ = B83.LIZ().LIZIZ();
        if (LIZIZ == null || (str2 = Long.valueOf(((C29374Bfu) LIZIZ).getCurrentUserId()).toString()) == null) {
            str2 = CardStruct.IStatusCode.DEFAULT;
        }
        linkedHashMap.put("user_id", str2);
        BZI LIZ = C28787BRn.LIZ("livesdk_mvp_get_match_item_show");
        LIZ.LJIIZILJ();
        LIZ.LJJIFFI(linkedHashMap);
        LIZ.LJJIIJZLJL();
    }

    public static final void accept$72(AfS54S0200000_5 afS54S0200000_5, Object obj) {
        InterfaceC40375Fsx interfaceC40375Fsx = (InterfaceC40375Fsx) afS54S0200000_5.l0;
        Uri uri = (Uri) afS54S0200000_5.l1;
        C56235M5f.LIZLLL = System.currentTimeMillis();
        interfaceC40375Fsx.LIZJ();
        C56235M5f.LIZLLL(2015, uri, "short_2_long");
    }

    public static final void accept$73(AfS54S0200000_5 afS54S0200000_5, Object obj) {
        DialogC31813Ce9 dialogC31813Ce9 = (DialogC31813Ce9) afS54S0200000_5.l0;
        if (dialogC31813Ce9 != null) {
            C29306Beo.LJJJJ(dialogC31813Ce9);
        }
        C28924BWu.LIZIZ((DataChannel) afS54S0200000_5.l1);
    }

    /* JADX WARN: Code restructure failed: missing block: B:111:0x0201, code lost:
    
        if (kotlin.jvm.internal.o.LJ(java.lang.String.valueOf(r1), java.lang.String.valueOf(r8.msgId)) != false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x0184, code lost:
    
        if (r10 != null) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x01c0, code lost:
    
        if (kotlin.jvm.internal.o.LJ(java.lang.String.valueOf(r0), java.lang.String.valueOf(r8.msgId)) != false) goto L102;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x024a  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x024d  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x024f  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01d6  */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7, types: [int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void accept$74(Y.AfS54S0200000_5 r23, java.lang.Object r24) {
        /*
            Method dump skipped, instructions count: 648
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AfS54S0200000_5.accept$74(Y.AfS54S0200000_5, java.lang.Object):void");
    }

    public static final void accept$75(AfS54S0200000_5 afS54S0200000_5, Object obj) {
        String prompt;
        int i;
        int i2;
        int i3;
        boolean z;
        Throwable it = (Throwable) obj;
        CZY czy = (CZY) afS54S0200000_5.l0;
        CZX czx = (CZX) afS54S0200000_5.l1;
        o.LJIIIIZZ(it, "it");
        int i4 = ((CZX) afS54S0200000_5.l1).LJFF;
        Context context = czy.LIZJ.getContext();
        if (context != null) {
            int i5 = czx.LIZJ;
            String str = czx.LJII;
            String str2 = "";
            if (str == null) {
                str = "";
            }
            if (i5 != 10) {
                if (i5 == 20) {
                    str2 = "up_grade";
                }
            } else {
                str2 = "basic";
            }
            BZI LIZ = C28787BRn.LIZ("livesdk_star_comment_send_fail");
            LIZ.LJIIZILJ();
            CVL.LIZ(LIZ);
            CVL.LIZIZ(LIZ, it, "error_code");
            LIZ.LJIJJ(str, "enter_from");
            LIZ.LJIJJ(str2, "gear_type");
            LIZ.LJJIIJZLJL();
            if (it instanceof C29401Dk) {
                Boolean LJ = ((WalletException) ((IWalletService) CN1.LIZ(IWalletService.class)).walletException()).LJ(it);
                o.LJIIIIZZ(LJ, "getService(IWalletServic…eWalletCustomError(error)");
                if (LJ.booleanValue()) {
                    if (i4 == 0) {
                        i3 = 0;
                        i2 = 1002;
                        z = true;
                    } else {
                        BalanceStruct balanceStruct = ((WalletCenter) ((IWalletService) CN1.LIZ(IWalletService.class)).walletCenter()).LJLJJL;
                        if (balanceStruct.getExchangeInfo() != null && balanceStruct.getValidUser()) {
                            i = 1;
                        } else {
                            i = 0;
                        }
                        i2 = i ^ 1;
                        i3 = 15;
                        z = false;
                    }
                    ((WalletException) ((IWalletService) CN1.LIZ(IWalletService.class)).walletException()).LIZ(context, it, null, null, i3, i2, z, "star_comment");
                } else {
                    C29401Dk c29401Dk = (C29401Dk) it;
                    if (c29401Dk.getErrorCode() != 4038005 && c29401Dk.getErrorCode() != 4038007 && (prompt = c29401Dk.getPrompt()) != null && C29306Beo.LJIJJLI(prompt)) {
                        C30868C9o.LJI(c29401Dk.getPrompt());
                    }
                }
            }
        }
        InterfaceC31532CZc interfaceC31532CZc = ((CZX) afS54S0200000_5.l1).LJIIIIZZ.get();
        if (interfaceC31532CZc != null) {
            interfaceC31532CZc.j(it);
        }
    }

    public static final void accept$76(AfS54S0200000_5 afS54S0200000_5, Object bitmap) {
        List list = (List) afS54S0200000_5.l0;
        o.LJIIIIZZ(bitmap, "bitmap");
        list.add(bitmap);
        ((CountDownLatch) afS54S0200000_5.l1).countDown();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00aa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void accept$77(Y.AfS54S0200000_5 r7, java.lang.Object r8) {
        /*
            X.0Jl r8 = (X.C05490Jl) r8
            X.B83 r0 = X.B83.LIZ()
            X.BgP r0 = r0.LIZIZ()
            r6 = 0
            java.lang.String r5 = "mRoom"
            if (r0 == 0) goto L9f
            X.Bfu r0 = (X.C29374Bfu) r0
            long r3 = r0.getCurrentUserId()
            java.lang.Object r0 = r7.l0
            com.bytedance.android.livesdk.usercard.LiveProfileManageDialog r0 = (com.bytedance.android.livesdk.usercard.LiveProfileManageDialog) r0
            com.bytedance.android.livesdkapi.depend.model.live.Room r0 = r0.LJLIL
            if (r0 == 0) goto Lb0
            long r1 = r0.getOwnerUserId()
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto L9f
            java.lang.String r1 = "anchor"
        L27:
            java.lang.String r0 = "livesdk_mute_set"
            X.BZI r2 = X.C28787BRn.LIZ(r0)
            java.lang.Object r0 = r7.l0
            com.bytedance.android.livesdk.usercard.LiveProfileManageDialog r0 = (com.bytedance.android.livesdk.usercard.LiveProfileManageDialog) r0
            com.bytedance.ies.sdk.datachannel.DataChannel r0 = r0.dataChannel
            r2.LJIILLIIL(r0)
            java.lang.String r0 = "admin_type"
            r2.LJIJJ(r1, r0)
            long r0 = r8.LIZ
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            java.lang.String r0 = "default_mute_set"
            r2.LJIJJ(r1, r0)
            java.lang.Object r0 = r7.l1
            X.0Jl r0 = (X.C05490Jl) r0
            long r0 = r0.LIZ
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            java.lang.String r0 = "mute_duration"
            r2.LJIJJ(r1, r0)
            java.lang.Object r0 = r7.l0
            com.bytedance.android.livesdk.usercard.LiveProfileManageDialog r0 = (com.bytedance.android.livesdk.usercard.LiveProfileManageDialog) r0
            com.bytedance.android.live.base.model.user.User r0 = r0.LJLILLLLZI
            if (r0 == 0) goto Laa
            long r0 = r0.getId()
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "to_user_id"
            r2.LJIJJ(r1, r0)
            java.lang.String r1 = "entry_point"
            java.lang.String r0 = "profile_card"
            r2.LJIJJ(r0, r1)
            java.lang.Object r0 = r7.l0
            com.bytedance.android.livesdk.usercard.LiveProfileManageDialog r0 = (com.bytedance.android.livesdk.usercard.LiveProfileManageDialog) r0
            com.bytedance.android.livesdkapi.depend.model.live.Room r0 = r0.LJLIL
            if (r0 == 0) goto La6
            long r0 = r0.getOwnerUserId()
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            java.lang.String r0 = "anchor_id"
            r2.LJIJJ(r1, r0)
            java.lang.Object r0 = r7.l0
            com.bytedance.android.livesdk.usercard.LiveProfileManageDialog r0 = (com.bytedance.android.livesdk.usercard.LiveProfileManageDialog) r0
            com.bytedance.android.livesdkapi.depend.model.live.Room r0 = r0.LJLIL
            if (r0 == 0) goto La2
            long r0 = r0.getId()
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            java.lang.String r0 = "room_id"
            r2.LJIJJ(r1, r0)
            r2.LJJIIJZLJL()
            return
        L9f:
            java.lang.String r1 = "admin"
            goto L27
        La2:
            kotlin.jvm.internal.o.LJIJI(r5)
            throw r6
        La6:
            kotlin.jvm.internal.o.LJIJI(r5)
            throw r6
        Laa:
            java.lang.String r0 = "mUser"
            kotlin.jvm.internal.o.LJIJI(r0)
            throw r6
        Lb0:
            kotlin.jvm.internal.o.LJIJI(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AfS54S0200000_5.accept$77(Y.AfS54S0200000_5, java.lang.Object):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void accept$78(AfS54S0200000_5 afS54S0200000_5, Object obj) {
        String str;
        int i;
        String str2;
        int i2;
        String str3;
        long j;
        int i3;
        BalanceStructExtra balanceStructExtra;
        BasePackage basePackage;
        BasePackage basePackage2;
        CurrencyInfo localCurrencyInfo;
        CurrencyInfo localCurrencyInfo2;
        CurrencyInfo localCurrencyInfo3;
        String str4;
        String str5;
        long j2;
        long j3;
        int i4;
        int i5;
        Boolean bool;
        Boolean bool2;
        CurrencyInfo currencyInfo;
        BasePackage basePackage3;
        BasePackage basePackage4;
        BasePackage basePackage5;
        CurrencyInfo currencyInfo2;
        CurrencyInfo currencyInfo3;
        InterfaceC77595Ucp interfaceC77595Ucp = ((RechargeViewModel) afS54S0200000_5.l0).LJLIL;
        if (interfaceC77595Ucp != null) {
            interfaceC77595Ucp.LLLLLILLIL();
        }
        RechargeViewModel rechargeViewModel = (RechargeViewModel) afS54S0200000_5.l0;
        Activity activity = (Activity) afS54S0200000_5.l1;
        boolean LJIIJ = C29306Beo.LJIIJ(rechargeViewModel.LJLLLLLL);
        int i6 = 1;
        int i7 = 0;
        int i8 = LJIIJ;
        if (rechargeViewModel.LJLLLLLL == null) {
            i8 = LJIIJ;
            if (rechargeViewModel.LJLLLL.LIZIZ.containsKey("is_anchor")) {
                i8 = ujb.o.LJJJJIZL(rechargeViewModel.LJLLLL.LIZIZ.get("is_anchor"), "1", false);
            }
        }
        if (rechargeViewModel.zv0() == -1) {
            LiveExchangeEntranceSchemaUG liveExchangeEntranceSchemaUG = LiveExchangeEntranceSchemaUG.INSTANCE;
            if (C29306Beo.LJIJJLI(liveExchangeEntranceSchemaUG.getValue())) {
                str = liveExchangeEntranceSchemaUG.getValue();
            } else if (((IHostAppContext) CN1.LIZ(IHostAppContext.class)).isInMusicallyRegion()) {
                str = "sslocal://webcast_lynxview_popup?url=https%3A%2F%2Flf16-gecko-source.tiktokcdn.com%2Fobj%2Fbyte-gurd-source-sg%2Fmusically%2Ffe%2Flive%2Ftiktok_live_revenue_strategy%2Fpages%2Fexchange%2Fpackage_exchange%2Ftemplate.js&height=1050rpx&radius=8&gravity=bottom&transition_animation=right";
            } else {
                str = "sslocal://webcast_lynxview_popup?url=https%3A%2F%2Flf16-gecko-source.tiktokcdn.com%2Fobj%2Fbyte-gurd-source-sg%2Ftiktok%2Ffe%2Flive%2Ftiktok_live_revenue_strategy%2Fpages%2Fexchange%2Fpackage_exchange%2Ftemplate.js&height=1050rpx&radius=8&gravity=bottom&transition_animation=right";
            }
        } else {
            LiveExchangeEntranceSchema liveExchangeEntranceSchema = LiveExchangeEntranceSchema.INSTANCE;
            if (C29306Beo.LJIJJLI(liveExchangeEntranceSchema.getValue())) {
                str = liveExchangeEntranceSchema.getValue();
            } else if (((IHostAppContext) CN1.LIZ(IHostAppContext.class)).isInMusicallyRegion()) {
                str = "sslocal://webcast_lynxview_popup?url=https%3A%2F%2Flf16-gecko-source.tiktokcdn.com%2Fobj%2Fbyte-gurd-source-sg%2Fmusically%2Ffe%2Flive%2Ftiktok_live_revenue%2Frevenue%2Fpages%2Fexchange%2Fpackage_exchange.js&height=1050rpx&radius=8&gravity=bottom&transition_animation=right";
            } else {
                str = "sslocal://webcast_lynxview_popup?url=https%3A%2F%2Flf16-gecko-source.tiktokcdn.com%2Fobj%2Fbyte-gurd-source-sg%2Ftiktok%2Ffe%2Flive%2Ftiktok_live_revenue%2Frevenue%2Fpages%2Fexchange%2Fpackage_exchange.js&height=1050rpx&radius=8&gravity=bottom&transition_animation=right";
            }
        }
        C32364Cn2 c32364Cn2 = new C32364Cn2(str);
        WalletStruct walletStruct = ((WalletCenter) ((IWalletService) CN1.LIZ(IWalletService.class)).walletCenter()).LJLIL;
        String LJ = ((WalletCenter) ((IWalletService) CN1.LIZ(IWalletService.class)).walletCenter()).LJ(rechargeViewModel.zv0(), true);
        long j4 = 0;
        if (rechargeViewModel.zv0() == -1) {
            c32364Cn2.LIZ(0, "way");
            balanceStructExtra = ((WalletCenter) ((IWalletService) CN1.LIZ(IWalletService.class)).walletCenter()).LJLJJL.getExchangeInfo();
        } else {
            c32364Cn2.LIZ(1, "way");
            RevenueExchange revenueExchange = walletStruct.revenue;
            if (revenueExchange != null && revenueExchange.isRevenue()) {
                i = 1;
            } else {
                i = 0;
            }
            c32364Cn2.LIZ(i, "has_short_video_gift");
            BalanceStructExtra balanceStructExtra2 = walletStruct.LIZ;
            if (balanceStructExtra2 != null && (localCurrencyInfo3 = balanceStructExtra2.getLocalCurrencyInfo()) != null) {
                str2 = localCurrencyInfo3.getCode();
            } else {
                str2 = null;
            }
            c32364Cn2.LIZJ("local_currency_code", str2);
            BalanceStructExtra balanceStructExtra3 = walletStruct.LIZ;
            if (balanceStructExtra3 != null && (localCurrencyInfo2 = balanceStructExtra3.getLocalCurrencyInfo()) != null) {
                i2 = localCurrencyInfo2.getKeepDot();
            } else {
                i2 = 0;
            }
            c32364Cn2.LIZ(i2, "local_keep_dot");
            BalanceStructExtra balanceStructExtra4 = walletStruct.LIZ;
            if (balanceStructExtra4 != null && (localCurrencyInfo = balanceStructExtra4.getLocalCurrencyInfo()) != null) {
                str3 = localCurrencyInfo.getSymbol();
            } else {
                str3 = null;
            }
            c32364Cn2.LIZJ("local_symbol", str3);
            BalanceStructExtra balanceStructExtra5 = walletStruct.LIZ;
            if (balanceStructExtra5 != null && (basePackage2 = balanceStructExtra5.getBasePackage()) != null) {
                j = basePackage2.getLocalPrice();
            } else {
                j = 0;
            }
            c32364Cn2.LIZIZ(j, "local_price");
            BalanceStructExtra balanceStructExtra6 = walletStruct.LIZ;
            if (balanceStructExtra6 != null && (basePackage = balanceStructExtra6.getBasePackage()) != null) {
                i3 = basePackage.getLocalDot();
            } else {
                i3 = 0;
            }
            c32364Cn2.LIZ(i3, "local_price_real_dot");
            balanceStructExtra = walletStruct.LIZ;
        }
        c32364Cn2.LIZJ("balance", LJ);
        if (balanceStructExtra != null && (currencyInfo3 = balanceStructExtra.getCurrencyInfo()) != null) {
            str4 = currencyInfo3.getCode();
        } else {
            str4 = null;
        }
        c32364Cn2.LIZJ("currency_code", str4);
        if (balanceStructExtra != null && (currencyInfo2 = balanceStructExtra.getCurrencyInfo()) != null) {
            str5 = currencyInfo2.getSymbol();
        } else {
            str5 = null;
        }
        c32364Cn2.LIZJ("symbol", str5);
        if (balanceStructExtra != null && (basePackage5 = balanceStructExtra.getBasePackage()) != null) {
            j2 = basePackage5.getId();
        } else {
            j2 = 0;
        }
        c32364Cn2.LIZIZ(j2, "base_package_id");
        if (balanceStructExtra != null && (basePackage4 = balanceStructExtra.getBasePackage()) != null) {
            j3 = basePackage4.getPrice();
        } else {
            j3 = 0;
        }
        c32364Cn2.LIZIZ(j3, "base_package_price");
        if (balanceStructExtra != null && (basePackage3 = balanceStructExtra.getBasePackage()) != null) {
            i4 = basePackage3.getRealDot();
        } else {
            i4 = 0;
        }
        c32364Cn2.LIZ(i4, "real_dot");
        if (balanceStructExtra != null) {
            j4 = balanceStructExtra.getCoins();
        }
        c32364Cn2.LIZIZ(j4, "max_coins");
        if (balanceStructExtra != null && (currencyInfo = balanceStructExtra.getCurrencyInfo()) != null) {
            i5 = currencyInfo.getKeepDot();
        } else {
            i5 = 0;
        }
        c32364Cn2.LIZ(i5, "keep_dot");
        c32364Cn2.LIZ(i8, "is_anchor");
        Boolean LIZ = walletStruct.LIZ();
        o.LJIIIIZZ(LIZ, "walletStruct.liveAutoExchangeEnable");
        c32364Cn2.LIZ(LIZ.booleanValue() ? 1 : 0, "ab_enable_auto");
        c32364Cn2.LIZ(rechargeViewModel.isFirstRecharge() ? 1 : 0, "is_first_recharge");
        c32364Cn2.LIZJ("first_recharge_exchange_entrance_page", "package");
        if (!walletStruct.isPeriodicPayout) {
            i6 = 0;
        }
        c32364Cn2.LIZ(i6, "is_periodic_payout");
        RevenueExchange revenueExchange2 = walletStruct.revenue;
        if (revenueExchange2 != null) {
            bool = Boolean.valueOf(revenueExchange2.getShowExchangeTooltip());
        } else {
            bool = null;
        }
        c32364Cn2.LIZJ("show_exchange_tooltip", String.valueOf(bool));
        RevenueExchange revenueExchange3 = walletStruct.revenue;
        if (revenueExchange3 != null) {
            bool2 = Boolean.valueOf(revenueExchange3.getShowExchangeAmountAdjustedText());
        } else {
            bool2 = null;
        }
        c32364Cn2.LIZJ("show_exchange_amount_adjusted_text", String.valueOf(bool2));
        RevenueExchange revenueExchange4 = walletStruct.revenue;
        if (revenueExchange4 != null) {
            i7 = revenueExchange4.getExchangeInputOption();
        }
        c32364Cn2.LIZ(i7, "exchange_input_option");
        if (rechargeViewModel.isFirstRecharge()) {
            c32364Cn2.LIZJ("first_recharge_exchange_source", "entrance");
        }
        c32364Cn2.LIZ(rechargeViewModel.kv0() ? 1 : 0, "is_from_insufficient");
        c32364Cn2.LIZIZ(rechargeViewModel.LJLLLL.LJ, "gift_id");
        Uri parse = UriProtector.parse(c32364Cn2.LIZLLL());
        o.LJIIIIZZ(parse, "parse(builder.build())");
        ((IActionHandlerService) CN1.LIZ(IActionHandlerService.class)).handle(activity, parse);
    }

    public static final void accept$79(AfS54S0200000_5 afS54S0200000_5, Object obj) {
        ((C29159BcR) afS54S0200000_5.l0).getClass();
        C29159BcR.LJIIIZ("cancel");
        C29159BcR c29159BcR = (C29159BcR) afS54S0200000_5.l0;
        DataChannel LJIILIIL = C51029K0z.LJIILIIL((Fragment) afS54S0200000_5.l1);
        c29159BcR.getClass();
        C29689Bkz c29689Bkz = C29689Bkz.LIZ;
        c29689Bkz.LJIIL(C29166BcY.LJLIL);
        c29689Bkz.LJIIJ(c29159BcR.LIZIZ);
        c29159BcR.LJIIJ(LJIILIIL);
    }

    public static final void accept$8(AfS54S0200000_5 afS54S0200000_5, Object obj) {
        LiveMode liveMode;
        String str;
        String str2;
        if (((IGameService) CN1.LIZ(IGameService.class)).rH()) {
            Room room = ((LiveBroadcastEndFragment) afS54S0200000_5.l0).LJLIL;
            String str3 = null;
            if (room != null) {
                liveMode = room.getStreamType();
            } else {
                liveMode = null;
            }
            if (liveMode == LiveMode.SCREEN_RECORD) {
                if (C30922CBq.LIZIZ) {
                    C0NB.LJIIIZ("LiveBroadcastEndFragmentNew", "receive event: screen_anchor_diagnose");
                }
                InterfaceC78280Uns interfaceC78280Uns = ((C199097rd) afS54S0200000_5.l1).LJLILLLLZI;
                if (interfaceC78280Uns != null) {
                    str = u.LJJIJIL(interfaceC78280Uns, "feedback_result", "");
                } else {
                    str = null;
                }
                InterfaceC78280Uns interfaceC78280Uns2 = ((C199097rd) afS54S0200000_5.l1).LJLILLLLZI;
                if (interfaceC78280Uns2 != null) {
                    str2 = u.LJJIJIL(interfaceC78280Uns2, "feedback_id", "");
                } else {
                    str2 = null;
                }
                InterfaceC78280Uns interfaceC78280Uns3 = ((C199097rd) afS54S0200000_5.l1).LJLILLLLZI;
                if (interfaceC78280Uns3 != null) {
                    str3 = u.LJJIJIL(interfaceC78280Uns3, "feedback_answer_id", "");
                }
                String sC = ((IGameService) CN1.LIZ(IGameService.class)).sC();
                ((IGameService) CN1.LIZ(IGameService.class)).aE(str, str2, str3);
                C01R.LIZIZ(System.currentTimeMillis(), new C78528Urs(C65232Piu.LIZJ("diagnose_result", sC)), "screen_anchor_diagnose_result");
            }
        }
    }

    public static final void accept$80(AfS54S0200000_5 afS54S0200000_5, Object obj) {
        C41071jL c41071jL = (C41071jL) afS54S0200000_5.l0;
        if (c41071jL != null) {
            c41071jL.setChecked(false);
        }
        BIR.LJIIL((BIR) afS54S0200000_5.l1, (C41071jL) afS54S0200000_5.l0);
        C30868C9o.LIZJ(R.string.mg2);
    }

    public static final void accept$81(AfS54S0200000_5 afS54S0200000_5, Object obj) {
        C41071jL c41071jL = (C41071jL) afS54S0200000_5.l0;
        if (c41071jL != null) {
            c41071jL.setChecked(true);
        }
        BIR.LJIIL((BIR) afS54S0200000_5.l1, (C41071jL) afS54S0200000_5.l0);
        C30868C9o.LIZJ(R.string.mg2);
    }

    public static final void accept$82(AfS54S0200000_5 afS54S0200000_5, Object obj) {
        Throwable th = (Throwable) obj;
        ((C29448Bh6) afS54S0200000_5.l0).LJII.setValue(new C29488Bhk<>(null, 2, th));
        InterfaceC88472Yns interfaceC88472Yns = (InterfaceC88472Yns) afS54S0200000_5.l1;
        if (interfaceC88472Yns != null) {
            interfaceC88472Yns.invoke(Boolean.FALSE);
        }
        ((C29448Bh6) afS54S0200000_5.l0).getClass();
        C29448Bh6.LJ(th);
    }

    public static final void accept$83(AfS54S0200000_5 afS54S0200000_5, Object pair) {
        o.LJIIIZ(pair, "pair");
        ((C29448Bh6) afS54S0200000_5.l0).LJII.setValue(new C29488Bhk<>(pair, 0, null));
        InterfaceC88472Yns interfaceC88472Yns = (InterfaceC88472Yns) afS54S0200000_5.l1;
        if (interfaceC88472Yns != null) {
            interfaceC88472Yns.invoke(Boolean.TRUE);
        }
    }

    public static final void accept$84(AfS54S0200000_5 afS54S0200000_5, Object obj) {
        Throwable th = (Throwable) obj;
        ((C29448Bh6) afS54S0200000_5.l0).LJII.setValue(new C29488Bhk<>(null, 2, th));
        InterfaceC88472Yns interfaceC88472Yns = (InterfaceC88472Yns) afS54S0200000_5.l1;
        if (interfaceC88472Yns != null) {
            interfaceC88472Yns.invoke(Boolean.FALSE);
        }
        ((C29448Bh6) afS54S0200000_5.l0).getClass();
        C29448Bh6.LJ(th);
    }

    public static final void accept$85(AfS54S0200000_5 afS54S0200000_5, Object pair) {
        o.LJIIIZ(pair, "pair");
        ((C29448Bh6) afS54S0200000_5.l0).LJII.setValue(new C29488Bhk<>(pair, 0, null));
        InterfaceC88472Yns interfaceC88472Yns = (InterfaceC88472Yns) afS54S0200000_5.l1;
        if (interfaceC88472Yns != null) {
            interfaceC88472Yns.invoke(Boolean.TRUE);
        }
    }

    public static final void accept$9(AfS54S0200000_5 afS54S0200000_5, Object obj) {
        ((InterfaceC65784Pro) afS54S0200000_5.l0).invoke();
        C16880lQ.LLLZZIL((File) afS54S0200000_5.l1);
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AfS54S0200000_5(java.util.concurrent.CountDownLatch r2, java.util.concurrent.CountDownLatch r3, X.C68322mC<android.graphics.Bitmap> r4) {
        /*
            r1 = this;
            r1.$t = r4
            switch(r4) {
                case 19: goto Le;
                default: goto L5;
            }
        L5:
            r0 = r1
            r0.l0 = r3
            r0.l1 = r2
        La:
            r0.<init>()
            return
        Le:
            r0 = r1
            r0.l0 = r2
            r0.l1 = r3
            goto La
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AfS54S0200000_5.<init>(java.util.concurrent.CountDownLatch, X.2mC, int):void");
    }

    public AfS54S0200000_5(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }
}
