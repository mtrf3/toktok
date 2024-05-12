package Y;

import X.AbstractC73672Svk;
import X.B5G;
import X.C012403c;
import X.C05630Jz;
import X.C0NB;
import X.C0TL;
import X.C16880lQ;
import X.C1M5;
import X.C26045AKb;
import X.C265112h;
import X.C28561BIv;
import X.C29401Dk;
import X.C29927Bop;
import X.C32014ChO;
import X.C45804HyK;
import X.C47061t0;
import X.C48459J0d;
import X.C58416MwG;
import X.C62705OjF;
import X.C64698PaI;
import X.C64799Pbv;
import X.C73318Sq2;
import X.C73411SrX;
import X.C74893TaL;
import X.C75150TeU;
import X.C75525TkX;
import X.C75593Tld;
import X.C75607Tlr;
import X.C75642TmQ;
import X.C75677Tmz;
import X.C75678Tn0;
import X.C75683Tn5;
import X.C75684Tn6;
import X.C75687Tn9;
import X.C75688TnA;
import X.C75690TnC;
import X.C75691TnD;
import X.C75694TnG;
import X.C75701TnN;
import X.C75702TnO;
import X.C75703TnP;
import X.C75707TnT;
import X.C76631U5r;
import X.C76762UAs;
import X.C76800UCe;
import X.C77357UXp;
import X.C77624UdI;
import X.C77630UdO;
import X.C77731Uf1;
import X.C77979Uj1;
import X.C78609UtB;
import X.C8E;
import X.CN1;
import X.CR6;
import X.EnumC29835BnL;
import X.EnumC31509CYf;
import X.EnumC75546Tks;
import X.EnumC75614Tly;
import X.EnumC75636TmK;
import X.EnumC75645TmT;
import X.EnumC75697TnJ;
import X.InterfaceC30442Bx8;
import X.InterfaceC64592gB;
import X.InterfaceC65784Pro;
import X.InterfaceC75158Tec;
import X.InterfaceC75706TnS;
import X.InterfaceC76622U5i;
import X.InterfaceC76768UAy;
import X.InterfaceC77737Uf7;
import X.InterfaceC78033Ujt;
import X.InterfaceC88472Yns;
import X.InterfaceC92693kP;
import X.OLR;
import X.U6Y;
import X.U7F;
import X.U7T;
import X.U7V;
import X.U80;
import X.UA9;
import X.UC0;
import X.UEQ;
import X.UER;
import X.UEW;
import X.UZI;
import X.UZK;
import X.UZM;
import X.X1D;
import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.live.liveinteract.api.LinkCrossRoomMatchInvitingFailed;
import com.bytedance.android.live.liveinteract.api.LinkRandomLinkMicWannerDisconnect;
import com.bytedance.android.live.liveinteract.match.business.event.BattleStateChannel;
import com.bytedance.android.live.liveinteract.multihost.biz.quickpairing.RandomLinkMicManager;
import com.bytedance.android.live.liveinteract.multihost.core.countdown.MultiCoHostCountDownEvent;
import com.bytedance.android.live.liveinteract.multihost.event.MultiCoHostStateChannel;
import com.bytedance.android.live.network.response.BaseResponse;
import com.bytedance.android.live.rank.impl.list.viewmodel.RankRootViewModel;
import com.bytedance.android.live.wallet.utils.ChargeFailLogHelper;
import com.bytedance.android.livesdk.chatroom.interact.model.AutoMatchResp;
import com.bytedance.android.livesdk.chatroom.interact.model.RandomLinkMicExtra;
import com.bytedance.android.livesdk.comp.api.linkcore.model.CreateChannelData;
import com.bytedance.android.livesdk.comp.api.linkcore.model.CreateChannelResult;
import com.bytedance.android.livesdk.comp.api.linkcore.model.DestroyChannelData;
import com.bytedance.android.livesdk.comp.api.linkcore.model.DestroyChannelMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.ExtraDataWrapper;
import com.bytedance.android.livesdk.comp.api.linkcore.model.InviteData;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkUser;
import com.bytedance.android.livesdk.game.model.PartnershipDownloadResponse;
import com.bytedance.android.livesdk.model.message.LinkMessage;
import com.bytedance.android.livesdk.model.message.PunishEventInfo;
import com.bytedance.android.livesdk.model.message.ReserveInfo;
import com.bytedance.android.livesdk.model.message.linkcore.FinishChannelContent;
import com.bytedance.android.livesdk.model.message.linkcore.LinkLayerMessage;
import com.bytedance.android.livesdk.rank.api.RankTypeV2;
import com.bytedance.android.livesdk.wallet.Diamond;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.ss.ugc.live.sdk.message.data.IMessage;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AqS160S0200000_13;
import kotlin.jvm.internal.o;
import org.json.JSONObject;
import tikcast.linkmic.controller.LinkedUserInfo;
import tikcast.linkmic.controller.ResumeResp;
import webcast.data.AppealInfo;
import webcast.data.RealtimeViolationRecord;
import webcast.data.multilive_biz.BizResumeParams;

/* loaded from: classes14.dex */
public class AfS24S0400000_13 implements InterfaceC64592gB {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;

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
            default:
                return;
        }
    }

    public static final void accept$0(AfS24S0400000_13 afS24S0400000_13, Object obj) {
        String str;
        int i;
        Throwable th = (Throwable) obj;
        if (th instanceof C29401Dk) {
            C29401Dk c29401Dk = (C29401Dk) th;
            i = c29401Dk.getErrorCode();
            str = c29401Dk.getPrompt();
            o.LJIIIIZZ(str, "throwable.prompt");
        } else if (th instanceof C64698PaI) {
            str = th.getMessage();
            if (str == null) {
                str = "";
            }
            i = -312;
        } else if (th instanceof C0TL) {
            i = ((C0TL) th).statusCode;
            str = th.toString();
        } else if (th instanceof C64799Pbv) {
            i = ((C64799Pbv) th).getStatusCode();
            str = th.toString();
        } else if (!(th instanceof Exception)) {
            str = "";
            i = -1;
        } else {
            str = th.getMessage();
            if (str == null) {
                str = "";
            }
            i = -313;
        }
        ChargeFailLogHelper.LIZ(31, i, str, "");
        C78609UtB.LJJJLIIL(31, i, "ttlive_wallet_create_order", str);
        C77630UdO.LIZIZ(String.valueOf(i));
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(th.getClass());
        LIZ.append(" : ");
        LIZ.append(th);
        C77624UdI.LIZ(i, X1D.LIZIZ(LIZ), (HashMap) afS24S0400000_13.l0);
        InterfaceC88472Yns interfaceC88472Yns = (InterfaceC88472Yns) afS24S0400000_13.l1;
        if (interfaceC88472Yns != null && ((Boolean) interfaceC88472Yns.invoke(th)).booleanValue()) {
            return;
        }
        C77731Uf1 c77731Uf1 = C77731Uf1.LIZ;
        InterfaceC77737Uf7 interfaceC77737Uf7 = (InterfaceC77737Uf7) afS24S0400000_13.l2;
        String str2 = ((Diamond) afS24S0400000_13.l3).iapId;
        o.LJIIIIZZ(str2, "diamond.iapId");
        c77731Uf1.LJIIJ(interfaceC77737Uf7, 2, i, th, str2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void accept$1(AfS24S0400000_13 afS24S0400000_13, Object obj) {
        List<ImageModel> list;
        long j;
        int i;
        IMessageManager iMessageManager;
        AutoMatchResp.ResponseData responseData;
        AutoMatchResp.ResponseData responseData2;
        BaseResponse baseResponse = (BaseResponse) obj;
        B5G.LIZIZ().LJIIIZ(EnumC75614Tly.RANDOM_LINK_MIC_INVITE);
        RandomLinkMicManager randomLinkMicManager = RandomLinkMicManager.LJLIL;
        RandomLinkMicExtra randomLinkMicExtra = null;
        if (baseResponse != null && (responseData2 = (AutoMatchResp.ResponseData) baseResponse.data) != null) {
            list = responseData2.avatars;
        } else {
            list = null;
        }
        randomLinkMicManager.getClass();
        RandomLinkMicManager.LJLLJ = list;
        if (baseResponse != null && (responseData = (AutoMatchResp.ResponseData) baseResponse.data) != null) {
            randomLinkMicExtra = C77357UXp.LJIJJ(responseData);
        }
        RandomLinkMicManager.LJLLL = randomLinkMicExtra;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("auto match result Success randomLinkMicExtra = ");
        LIZ.append(RandomLinkMicManager.LJLLL);
        LIZ.append(' ');
        C0NB.LIZIZ("QuickPairManager", X1D.LIZIZ(LIZ));
        B5G.LIZIZ().LJIILIIL(EnumC75636TmK.MATCH);
        C48459J0d<Integer> c48459J0d = InterfaceC30442Bx8.LLIIL;
        c48459J0d.LIZ(Integer.valueOf(c48459J0d.LIZJ().intValue() + 1));
        AutoMatchResp.ResponseData responseData3 = (AutoMatchResp.ResponseData) baseResponse.data;
        if (responseData3 != null) {
            j = C77357UXp.LJIJJ(responseData3).expectMatchTime;
        } else {
            j = 16;
        }
        RandomLinkMicManager.LJLJI = j;
        InterfaceC92693kP LJJJLIIL = C265112h.LIZ(AbstractC73672Svk.LJJIIZI(0L, 1000L, TimeUnit.MILLISECONDS)).LJJJLIIL(C75702TnO.LJLIL, C75703TnP.LJLIL);
        C73318Sq2 c73318Sq2 = RandomLinkMicManager.LJLJJL;
        c73318Sq2.LIZ(LJJJLIIL);
        RandomLinkMicManager.LJLJJLL = (C73411SrX) LJJJLIIL;
        DataChannel dataChannel = RandomLinkMicManager.LJLILLLLZI;
        if (dataChannel != null && (iMessageManager = (IMessageManager) dataChannel.kv0(C29927Bop.class)) != null) {
            iMessageManager.addMessageListener(EnumC31509CYf.LINK_MESSAGE.getIntType(), (RandomLinkMicManager) afS24S0400000_13.l3);
        }
        DataChannel dataChannel2 = RandomLinkMicManager.LJLILLLLZI;
        if (dataChannel2 != null) {
            dataChannel2.mv0(MultiCoHostStateChannel.class, randomLinkMicManager, C75684Tn6.LJLIL);
            dataChannel2.mv0(LinkRandomLinkMicWannerDisconnect.class, randomLinkMicManager, C75707TnT.LJLIL);
            dataChannel2.mv0(LinkCrossRoomMatchInvitingFailed.class, randomLinkMicManager, C75694TnG.LJLIL);
            dataChannel2.mv0(MultiCoHostCountDownEvent.class, randomLinkMicManager, C75687Tn9.LJLIL);
        }
        C0NB.LJ("QuickPairManager", "subscribe RTC message call back and list change ");
        C8E.LIZLLL().LJJJZ(C75607Tlr.class, RandomLinkMicManager.LLD);
        C8E.LIZLLL().LJJJZ(C75593Tld.class, RandomLinkMicManager.LLFII);
        C8E.LIZLLL().LJJJZ(C75678Tn0.class, RandomLinkMicManager.LLF);
        C8E.LIZLLL().LJJJZ(C75677Tmz.class, RandomLinkMicManager.LLFF);
        C8E.LIZLLL().LJJJZ(C75683Tn5.class, RandomLinkMicManager.LLFFF);
        DataChannel dataChannel3 = RandomLinkMicManager.LJLILLLLZI;
        if (dataChannel3 != null) {
            dataChannel3.mv0(BattleStateChannel.class, randomLinkMicManager, C75701TnN.LJLIL);
        }
        AutoMatchResp.ResponseData responseData4 = (AutoMatchResp.ResponseData) baseResponse.data;
        if (responseData4 != null) {
            i = C77357UXp.LJIJJ(responseData4).timeoutTime;
        } else {
            i = 60;
        }
        C012403c.LJ("start Match Timeout Countdown time = ", i, "QuickPairManager");
        InterfaceC92693kP LJJJLIIL2 = AbstractC73672Svk.LJJLIIIJLJLI(i, TimeUnit.SECONDS).LJII(new C62705OjF()).LJJJLIIL(C75690TnC.LJLIL, C75691TnD.LJLIL);
        c73318Sq2.LIZ(LJJJLIIL2);
        RandomLinkMicManager.LJLJL = (C73411SrX) LJJJLIIL2;
        InterfaceC75706TnS interfaceC75706TnS = (InterfaceC75706TnS) afS24S0400000_13.l0;
        if (interfaceC75706TnS != null) {
            String str = baseResponse.LIZIZ;
            o.LJIIIIZZ(str, "it.logId");
            interfaceC75706TnS.LJFF(new OLR(str, 2));
        }
        if (((EnumC75697TnJ) afS24S0400000_13.l1) != EnumC75697TnJ.TYPE_AUTO_START_WHEN_END) {
            EnumC75546Tks enumC75546Tks = EnumC75546Tks.RANDOM_MATCH;
            o.LJIIIZ(enumC75546Tks, "<set-?>");
            RandomLinkMicManager.LL = enumC75546Tks;
        }
        C75642TmQ.LJJJJLL(new Room(), EnumC75645TmT.QUICK_LINKMIC.getValue(), null, null, null, null, 64);
        RandomLinkMicManager.LJLLILLLL = false;
        if (((EnumC75697TnJ) afS24S0400000_13.l1) == EnumC75697TnJ.TYPE_PUBLIC_SCREEN) {
            RandomLinkMicManager.LJIILL(EnumC29835BnL.PREVIEW_DIALOG);
        }
        JSONObject jSONObject = new JSONObject();
        C05630Jz.LIZ(0, "err_code", jSONObject);
        C58416MwG.LIZLLL.LIZ("auto_match", jSONObject);
        C75688TnA c75688TnA = (C75688TnA) afS24S0400000_13.l2;
        c75688TnA.LJIIJJI();
        c75688TnA.LJIILLIIL("auto_match_succeed");
    }

    public static final void accept$10(AfS24S0400000_13 afS24S0400000_13, Object obj) {
        Throwable it = (Throwable) obj;
        ((U7F) afS24S0400000_13.l0).LJJIIJZLJL().LJJLIIIJL((LinkUser) afS24S0400000_13.l1);
        ((U7F) afS24S0400000_13.l0).LJJIIJ(((InviteData) afS24S0400000_13.l2).getInvitee().getUserId());
        CopyOnWriteArrayList<U6Y> copyOnWriteArrayList = ((U7F) afS24S0400000_13.l0).LJIIZILJ;
        InviteData inviteData = (InviteData) afS24S0400000_13.l2;
        Iterator<U6Y> it2 = copyOnWriteArrayList.iterator();
        while (it2.hasNext()) {
            it2.next().LJJJLIIL(inviteData.getInvitee().getUserId());
        }
        o.LJIIIIZZ(it, "it");
        U7V.LJIIJJI(it, (InterfaceC76768UAy) afS24S0400000_13.l3);
    }

    public static final void accept$11(AfS24S0400000_13 afS24S0400000_13, Object obj) {
        ((C75525TkX) afS24S0400000_13.l0).LIZLLL((Room) afS24S0400000_13.l1, (HashMap) afS24S0400000_13.l2, (ReserveInfo) afS24S0400000_13.l3);
    }

    public static final void accept$12(AfS24S0400000_13 afS24S0400000_13, Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        if (bitmap != null && !bitmap.isRecycled()) {
            C1M5 c1m5 = null;
            if (((C75525TkX) afS24S0400000_13.l0).LJLJJLL == null) {
                ((InterfaceC75158Tec) afS24S0400000_13.l1).LJIILL(null, ((ImageModel) afS24S0400000_13.l2).schema);
            }
            Context context = ((C75525TkX) afS24S0400000_13.l0).LJLJJLL;
            if (context != null) {
                c1m5 = new C1M5(context.getResources(), bitmap);
                c1m5.LIZIZ();
            }
            ((C47061t0) afS24S0400000_13.l3).setImageDrawable(c1m5);
            ((InterfaceC75158Tec) afS24S0400000_13.l1).LJIILJJIL(((C47061t0) afS24S0400000_13.l3).getWidth(), ((C47061t0) afS24S0400000_13.l3).getHeight(), ((ImageModel) afS24S0400000_13.l2).schema);
        }
    }

    public static final void accept$13(AfS24S0400000_13 afS24S0400000_13, Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        if (bitmap != null && !bitmap.isRecycled()) {
            if (((C74893TaL) afS24S0400000_13.l0).LJLJLJ == null) {
                ((InterfaceC75158Tec) afS24S0400000_13.l1).LJIILL(null, ((ImageModel) afS24S0400000_13.l2).schema);
            }
            Context context = ((C74893TaL) afS24S0400000_13.l0).LJLJLJ;
            o.LJI(context);
            C1M5 c1m5 = new C1M5(context.getResources(), bitmap);
            c1m5.LIZIZ();
            ((C47061t0) afS24S0400000_13.l3).setImageDrawable(c1m5);
            ((InterfaceC75158Tec) afS24S0400000_13.l1).LJIILJJIL(((C47061t0) afS24S0400000_13.l3).getWidth(), ((C47061t0) afS24S0400000_13.l3).getHeight(), ((ImageModel) afS24S0400000_13.l2).schema);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void accept$2(AfS24S0400000_13 afS24S0400000_13, Object obj) {
        String str;
        PartnershipDownloadResponse partnershipDownloadResponse = (PartnershipDownloadResponse) ((BaseResponse) obj).data;
        if (partnershipDownloadResponse == null || (str = partnershipDownloadResponse.referrer) == null) {
            str = "";
        }
        ((UZK) afS24S0400000_13.l0).LJ((UZI) afS24S0400000_13.l1, (Context) afS24S0400000_13.l2, str);
        UZM uzm = (UZM) afS24S0400000_13.l3;
        if (uzm != null) {
            uzm.LIZ("");
        }
    }

    public static final void accept$3(AfS24S0400000_13 afS24S0400000_13, Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        if (bitmap != null && !bitmap.isRecycled()) {
            if (((C75150TeU) afS24S0400000_13.l0).LJLL == null) {
                ((InterfaceC75158Tec) afS24S0400000_13.l1).LJIILL(null, ((ImageModel) afS24S0400000_13.l2).schema);
            }
            Context context = ((C75150TeU) afS24S0400000_13.l0).LJLL;
            o.LJI(context);
            C1M5 c1m5 = new C1M5(context.getResources(), bitmap);
            c1m5.LIZIZ();
            ((C47061t0) afS24S0400000_13.l3).setImageDrawable(c1m5);
            ((InterfaceC75158Tec) afS24S0400000_13.l1).LJIILJJIL(((C47061t0) afS24S0400000_13.l3).getWidth(), ((C47061t0) afS24S0400000_13.l3).getHeight(), ((ImageModel) afS24S0400000_13.l2).schema);
        }
    }

    public static final void accept$4(AfS24S0400000_13 afS24S0400000_13, Object obj) {
        String it = (String) obj;
        RankRootViewModel rankRootViewModel = (RankRootViewModel) afS24S0400000_13.l0;
        o.LJIIIIZZ(it, "it");
        rankRootViewModel.iv0(it, (RankTypeV2) afS24S0400000_13.l1, (InterfaceC78033Ujt) afS24S0400000_13.l2, (C77979Uj1) afS24S0400000_13.l3, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void accept$5(AfS24S0400000_13 afS24S0400000_13, Object obj) {
        List<LinkedUserInfo> list;
        CreateChannelResult createChannelResult = (CreateChannelResult) obj;
        Map map = null;
        Object[] objArr = 0;
        if (!createChannelResult.isResume) {
            C32014ChO.LJFF(U7T.LJJJJI(604), "createChannel success");
            U7V.LJIILIIL(createChannelResult, (InterfaceC76768UAy) afS24S0400000_13.l1);
        } else {
            C32014ChO.LJFF(U7T.LJJJJI(608), "createChannel and resume success");
            U7T u7t = (U7T) afS24S0400000_13.l0;
            ResumeResp resumeResp = createChannelResult.resumeResp;
            u7t.getClass();
            if (resumeResp == null || resumeResp.channelId == 0 || resumeResp.channelId != u7t.LJI || TextUtils.isEmpty(resumeResp.selfLinkMicId) || !o.LJ(resumeResp.selfLinkMicId, u7t.LJJI)) {
                U7T u7t2 = (U7T) afS24S0400000_13.l0;
                CreateChannelData createChannelData = (CreateChannelData) afS24S0400000_13.l2;
                InterfaceC76768UAy interfaceC76768UAy = (InterfaceC76768UAy) afS24S0400000_13.l1;
                BizResumeParams bizResumeParams = (BizResumeParams) afS24S0400000_13.l3;
                u7t2.getClass();
                u7t2.LLLLLLZZ(new DestroyChannelData(10001L, map, 2, objArr == true ? 1 : 0), new C76631U5r(interfaceC76768UAy, createChannelData, u7t2, bizResumeParams));
            } else {
                U7V.LJIILIIL(createChannelResult, (InterfaceC76768UAy) afS24S0400000_13.l1);
                IInteractService iInteractService = (IInteractService) CN1.LIZ(IInteractService.class);
                ResumeResp resumeResp2 = createChannelResult.resumeResp;
                if (resumeResp2 != null) {
                    list = resumeResp2.linkedUserInfo;
                } else {
                    list = null;
                }
                iInteractService.ns0(list);
            }
        }
        U7T.LJJIII(((U7T) afS24S0400000_13.l0).LJJIZ);
        ((U7T) afS24S0400000_13.l0).LJJIZ = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void accept$6(AfS24S0400000_13 afS24S0400000_13, Object obj) {
        String str;
        Throwable it = (Throwable) obj;
        String LJJJJI = U7T.LJJJJI(619);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("createChannel error ");
        Map map = null;
        Object[] objArr = 0;
        if (it != null) {
            str = it.getMessage();
        } else {
            str = null;
        }
        LIZ.append(str);
        C32014ChO.LIZJ(LJJJJI, X1D.LIZIZ(LIZ), null);
        o.LJIIIIZZ(it, "it");
        U7V.LJIIJJI(it, (InterfaceC76768UAy) afS24S0400000_13.l1);
        if (((U7T) afS24S0400000_13.l0).LJJIJIIJIL) {
            U7T u7t = (U7T) afS24S0400000_13.l0;
            CreateChannelData createChannelData = (CreateChannelData) afS24S0400000_13.l2;
            InterfaceC76768UAy interfaceC76768UAy = (InterfaceC76768UAy) afS24S0400000_13.l1;
            BizResumeParams bizResumeParams = (BizResumeParams) afS24S0400000_13.l3;
            u7t.getClass();
            u7t.LLLLLLZZ(new DestroyChannelData(10001L, map, 2, objArr == true ? 1 : 0), new C76631U5r(interfaceC76768UAy, createChannelData, u7t, bizResumeParams));
        }
        U7T.LJJIII(((U7T) afS24S0400000_13.l0).LJJIZ);
        ((U7T) afS24S0400000_13.l0).LJJIZ = null;
    }

    public static final void accept$7(AfS24S0400000_13 afS24S0400000_13, Object obj) {
        Long l;
        String LJJJJJ = U7T.LJJJJJ(2545);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("handleDestroyChannelMessage Notify destroy message listener ");
        LIZ.append((IMessage) afS24S0400000_13.l1);
        C32014ChO.LJFF(LJJJJJ, X1D.LIZIZ(LIZ));
        U7T u7t = (U7T) afS24S0400000_13.l0;
        CopyOnWriteArrayList<InterfaceC76622U5i> copyOnWriteArrayList = u7t.LJII;
        LinkUser linkUser = (LinkUser) afS24S0400000_13.l2;
        IMessage iMessage = (IMessage) afS24S0400000_13.l1;
        Iterator<InterfaceC76622U5i> it = copyOnWriteArrayList.iterator();
        while (true) {
            l = null;
            if (!it.hasNext()) {
                break;
            }
            InterfaceC76622U5i next = it.next();
            LinkLayerMessage linkLayerMessage = (LinkLayerMessage) iMessage;
            FinishChannelContent finishChannelContent = linkLayerMessage.finishContent;
            if (finishChannelContent != null) {
                l = Long.valueOf(finishChannelContent.finishReason);
            }
            next.LJLILLLLZI(u7t, new DestroyChannelMessage(linkUser, U7V.LJIILL(linkLayerMessage, new ExtraDataWrapper(null, l, 0L, new LinkMessage(), 4, null))));
        }
        U7V.LJIILJJIL(new AqS160S0200000_13((U7T) afS24S0400000_13.l0, (U7T) afS24S0400000_13.l3, (InterfaceC65784Pro<C76800UCe>) 41));
        U7T linker = (U7T) afS24S0400000_13.l0;
        long messageId = ((CR6) ((IMessage) afS24S0400000_13.l1)).getMessageId();
        FinishChannelContent finishChannelContent2 = ((LinkLayerMessage) ((IMessage) afS24S0400000_13.l1)).finishContent;
        if (finishChannelContent2 != null) {
            l = Long.valueOf(finishChannelContent2.finishReason);
        }
        o.LJIIIZ(linker, "linker");
        C76762UAs LIZJ = UA9.LIZJ();
        LIZJ.getClass();
        UC0.LJJLIIIIJ(new U80(linker, LIZJ, messageId, l));
    }

    public static final void accept$8(AfS24S0400000_13 afS24S0400000_13, Object obj) {
        String str;
        Activity LJIJJ;
        UEQ ueq = (UEQ) afS24S0400000_13.l0;
        ueq.LJLJJLL = false;
        Context context = ueq.LJLIL;
        if (context != null && (LJIJJ = C45804HyK.LJIJJ(context)) != null) {
            C26045AKb c26045AKb = new C26045AKb(LJIJJ);
            c26045AKb.LJIIIIZZ(R.string.o6t);
            c26045AKb.LJFF(R.raw.icon_tick_fill_small);
            c26045AKb.LJII(R.attr.e8);
            c26045AKb.LIZ(true);
            c26045AKb.LJIIJ();
        }
        ((AppealInfo) afS24S0400000_13.l1).appealStatus = 1;
        ((UER) afS24S0400000_13.l2).N((RealtimeViolationRecord) afS24S0400000_13.l3);
        C16880lQ.LJJIIZ(((UER) afS24S0400000_13.l2).LJLJJLL, UEW.LJLIL);
        DataChannel dataChannel = ((UEQ) afS24S0400000_13.l0).LJLILLLLZI;
        PunishEventInfo punishEventInfo = ((RealtimeViolationRecord) afS24S0400000_13.l3).punishInfo;
        if (punishEventInfo != null) {
            str = punishEventInfo.punishId;
        } else {
            str = null;
        }
        C28561BIv.LIZ(dataChannel, str, "appeal_submitted");
    }

    public static final void accept$9(AfS24S0400000_13 afS24S0400000_13, Object obj) {
        Throwable throwable = (Throwable) obj;
        ((U7F) afS24S0400000_13.l0).LJJIIJZLJL().LJJLIIIJJIZ((LinkUser) afS24S0400000_13.l1);
        ((U7F) afS24S0400000_13.l0).LJJIIJ(((Long) afS24S0400000_13.l2).longValue());
        CopyOnWriteArrayList<U6Y> copyOnWriteArrayList = ((U7F) afS24S0400000_13.l0).LJIIZILJ;
        Long l = (Long) afS24S0400000_13.l2;
        Iterator<U6Y> it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            it.next().LJJJJI(l.longValue());
        }
        o.LJIIIIZZ(throwable, "throwable");
        U7V.LJIIJJI(throwable, (InterfaceC76768UAy) afS24S0400000_13.l3);
    }

    public AfS24S0400000_13(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
        this.l2 = obj3;
        this.l3 = obj4;
    }
}
