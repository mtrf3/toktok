package Y;

import X.AbstractC75977Trp;
import X.AnonymousClass172;
import X.B83;
import X.C05170If;
import X.C09650Zl;
import X.C0NB;
import X.C15610jN;
import X.C15640jQ;
import X.C25620zW;
import X.C29374Bfu;
import X.C30725C4b;
import X.C31524CYu;
import X.C31558Ca2;
import X.C31597Caf;
import X.C31626Cb8;
import X.C32014ChO;
import X.C34K;
import X.C68322mC;
import X.C75525TkX;
import X.C75768ToS;
import X.C75883TqJ;
import X.C75981Trt;
import X.C76234Tvy;
import X.C76271TwZ;
import X.C76280Twi;
import X.C76677U7l;
import X.C76680U7o;
import X.C76689U7x;
import X.C76690U7y;
import X.C76732zl;
import X.C76766UAw;
import X.C77581Ucb;
import X.C77603Ucx;
import X.C77979Uj1;
import X.C78016Ujc;
import X.CN1;
import X.InterfaceC31557Ca1;
import X.InterfaceC38263Ezz;
import X.InterfaceC64592gB;
import X.InterfaceC65784Pro;
import X.InterfaceC75807Tp5;
import X.InterfaceC76768UAy;
import X.InterfaceC77604Ucy;
import X.InterfaceC88472Yns;
import X.InterfaceC92693kP;
import X.JBR;
import X.ORZ;
import X.U4R;
import X.U7F;
import X.U7T;
import X.U7U;
import X.U7V;
import X.U8M;
import X.U8Q;
import X.UI6;
import X.UI8;
import X.UIF;
import X.ViewOnClickListenerC76430Tz8;
import X.X1D;
import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.RectF;
import com.bytedance.android.live.actionhandler.IActionHandlerService;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.liveinteract.multihost.biz.link.contract.MultiCoHostInviteListContract$AbsView;
import com.bytedance.android.live.liveinteract.multimatch.business.dialog.contract.MultiMatchInviteContract$AbsView;
import com.bytedance.android.live.network.response.BaseResponse;
import com.bytedance.android.live.rank.impl.list.viewmodel.RankRootViewModel;
import com.bytedance.android.live.wallet.model.FeedBackList;
import com.bytedance.android.livesdk.chatroom.interact.model.ReserveResponse;
import com.bytedance.android.livesdk.chatroom.interact.model.RivalExtraInfo;
import com.bytedance.android.livesdk.comp.api.linkcore.model.DestroyChannelData;
import com.bytedance.android.livesdk.comp.api.linkcore.model.PermitApplyData;
import com.bytedance.android.livesdk.comp.impl.game.linkmic.presenter.GameLinkGuestPresenter;
import com.bytedance.android.livesdk.comp.impl.linkcore.rtc.message.CoHostRtcMessage;
import com.bytedance.android.livesdk.comp.impl.linkcore.rtc.message.CoHostRtcMessageParam;
import com.bytedance.android.livesdk.livesetting.linkmic.MtCoHostRtcPermitMsgSetting;
import com.bytedance.android.livesdk.rank.api.RankTypeV2;
import com.bytedance.android.livesdk.wallet.Diamond;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.ss.avframework.livestreamv2.core.interact.Client;
import com.ss.avframework.livestreamv2.core.interact.model.Region;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;
import tikcast.linkmic.controller.ChangeStateReq;
import tikcast.linkmic.controller.ChangeStateResp;

/* loaded from: classes14.dex */
public class AfS52S0300000_13 implements InterfaceC64592gB {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;

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
            default:
                return;
        }
    }

    public static final void accept$0(AfS52S0300000_13 afS52S0300000_13, Object obj) {
        Throwable throwable = (Throwable) obj;
        ((InterfaceC65784Pro) afS52S0300000_13.l0).invoke();
        C76271TwZ c76271TwZ = C76271TwZ.LIZ;
        long LIZIZ = ((C76280Twi) afS52S0300000_13.l1).LIZIZ();
        o.LJIIIIZZ(throwable, "throwable");
        c76271TwZ.LJJJIL(LIZIZ, throwable, ((C76234Tvy) afS52S0300000_13.l2).LJLJJI.LIZLLL);
        MultiMatchInviteContract$AbsView multiMatchInviteContract$AbsView = (MultiMatchInviteContract$AbsView) ((C76234Tvy) afS52S0300000_13.l2).LJLILLLLZI;
        if (multiMatchInviteContract$AbsView != null) {
            multiMatchInviteContract$AbsView.LLJJIII(throwable);
        }
    }

    public static final void accept$1(AfS52S0300000_13 afS52S0300000_13, Object obj) {
        int i;
        Activity activity;
        int i2;
        Number chargeSource;
        boolean z;
        List diamondList = (List) obj;
        o.LJIIIIZZ(diamondList, "diamondList");
        Diamond diamond = (Diamond) ORZ.LJLLLL(diamondList);
        if (diamond == null) {
            C31626Cb8.LIZ((CompletionBlock) afS52S0300000_13.l0, 0, "diamond doesn`t exist", 4);
            return;
        }
        diamond.id = ((InterfaceC77604Ucy) afS52S0300000_13.l1).getDiamondId().intValue();
        try {
            i = CastIntegerProtector.parseInt(((InterfaceC77604Ucy) afS52S0300000_13.l1).getGivingCount());
        } catch (Exception unused) {
            i = 0;
        }
        diamond.givingCount = i;
        diamond.count = ((InterfaceC77604Ucy) afS52S0300000_13.l1).getDiamondCount().intValue();
        C77603Ucx c77603Ucx = (C77603Ucx) afS52S0300000_13.l2;
        c77603Ucx.LJLJLJ = diamond;
        InterfaceC38263Ezz interfaceC38263Ezz = c77603Ucx.LJLIL;
        Boolean bool = null;
        if (interfaceC38263Ezz != null) {
            activity = interfaceC38263Ezz.LIZLLL();
        } else {
            activity = null;
        }
        if (diamond.LJLJI > 0) {
            if (i > 0) {
                z = true;
            } else {
                z = false;
            }
            diamond.LJLJJLL = Boolean.valueOf(z);
        }
        InterfaceC31557Ca1 payManager = (InterfaceC31557Ca1) ((C77603Ucx) afS52S0300000_13.l2).LJLJLLL.getValue();
        o.LJIIIIZZ(payManager, "payManager");
        C77603Ucx c77603Ucx2 = (C77603Ucx) afS52S0300000_13.l2;
        C77581Ucb c77581Ucb = c77603Ucx2.LJLLILLLL;
        InterfaceC77604Ucy interfaceC77604Ucy = c77603Ucx2.LJLJJLL;
        if (interfaceC77604Ucy != null && (chargeSource = interfaceC77604Ucy.getChargeSource()) != null) {
            i2 = chargeSource.intValue();
        } else {
            i2 = 0;
        }
        InterfaceC77604Ucy interfaceC77604Ucy2 = ((C77603Ucx) afS52S0300000_13.l2).LJLJJLL;
        if (interfaceC77604Ucy2 != null) {
            bool = interfaceC77604Ucy2.getFirstRecharge();
        }
        C31558Ca2.LIZ(payManager, activity, diamond, c77581Ucb, i2, bool, null, ((InterfaceC77604Ucy) afS52S0300000_13.l1).getRechargeReason(), null, 160);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void accept$10(AfS52S0300000_13 afS52S0300000_13, Object obj) {
        Object obj2;
        BaseResponse baseResponse = (BaseResponse) obj;
        ((C34K) afS52S0300000_13.l0).element = false;
        if (baseResponse != null) {
            obj2 = baseResponse.data;
        } else {
            obj2 = null;
        }
        if (obj2 != null) {
            FeedBackList feedBackList = (FeedBackList) baseResponse.data;
            boolean z = feedBackList.feedbackAllow;
            UIF.LIZ.LIZ = feedBackList;
            if (z) {
                ((IActionHandlerService) CN1.LIZ(IActionHandlerService.class)).handle((Context) afS52S0300000_13.l2, UI6.LIZIZ(1, Integer.valueOf(((UI8) afS52S0300000_13.l1).LJIIJJI)));
                return;
            } else {
                UI6.LIZLLL((UI8) afS52S0300000_13.l1, null, R.string.nlf);
                return;
            }
        }
        UI6.LIZLLL((UI8) afS52S0300000_13.l1, null, R.string.nlf);
        UIF.LIZ.LIZ = (FeedBackList) baseResponse.data;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void accept$11(AfS52S0300000_13 afS52S0300000_13, Object obj) {
        Long l;
        Long l2;
        ReserveResponse.ResponseData responseData;
        BaseResponse baseResponse = (BaseResponse) obj;
        Room room = (Room) afS52S0300000_13.l0;
        C75981Trt item = (C75981Trt) afS52S0300000_13.l1;
        Long l3 = null;
        if (baseResponse != null && (responseData = (ReserveResponse.ResponseData) baseResponse.data) != null) {
            l = Long.valueOf(responseData.reservationId);
        } else {
            l = null;
        }
        String valueOf = String.valueOf(l);
        o.LJIIIZ(item, "item");
        HashMap hashMap = new HashMap();
        if (room != null) {
            l2 = Long.valueOf(room.getOwnerUserId());
        } else {
            l2 = null;
        }
        hashMap.put("anchor_id", String.valueOf(l2));
        hashMap.put("to_anchor_id", String.valueOf(item.LJLIL.getOwnerUserId()));
        if (room != null) {
            l3 = Long.valueOf(room.getId());
        }
        hashMap.put("room_id", String.valueOf(l3));
        hashMap.put("reservation_id", valueOf);
        AnonymousClass172.LIZ("livesdk_connection_reservation_send_success", hashMap);
        AbstractC75977Trp abstractC75977Trp = (AbstractC75977Trp) afS52S0300000_13.l2;
        Room room2 = ((C75981Trt) afS52S0300000_13.l1).LJLIL;
        Iterator<Object> it = abstractC75977Trp.LJLLILLLL.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if ((next instanceof C75981Trt) && ((C75981Trt) next).LJLIL.getId() == room2.getId()) {
                if (next != null && (next instanceof C75981Trt)) {
                    int indexOf = abstractC75977Trp.LJLLILLLL.indexOf(next);
                    RivalExtraInfo rivalExtraInfo = ((C75981Trt) next).LJLJJI;
                    if (rivalExtraInfo != null) {
                        RivalExtraInfo.ReserveInfo reserveInfo = new RivalExtraInfo.ReserveInfo();
                        reserveInfo.replyStatus = 0;
                        rivalExtraInfo.reserveInfo = reserveInfo;
                    }
                    MultiCoHostInviteListContract$AbsView multiCoHostInviteListContract$AbsView = (MultiCoHostInviteListContract$AbsView) abstractC75977Trp.LJLILLLLZI;
                    if (multiCoHostInviteListContract$AbsView != null) {
                        multiCoHostInviteListContract$AbsView.Jl(indexOf);
                    }
                }
            }
        }
        MultiCoHostInviteListContract$AbsView multiCoHostInviteListContract$AbsView2 = (MultiCoHostInviteListContract$AbsView) ((AbstractC75977Trp) afS52S0300000_13.l2).LJLILLLLZI;
        if (multiCoHostInviteListContract$AbsView2 != null) {
            multiCoHostInviteListContract$AbsView2.a();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [T, java.lang.String] */
    public static final void accept$12(AfS52S0300000_13 afS52S0300000_13, Object obj) {
        C75768ToS c75768ToS;
        User user = (User) obj;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("updateDisplayName, iUser.displayId = ");
        LIZ.append(user.getDisplayId());
        LIZ.append(", iUser.nickName = ");
        LIZ.append(user.getNickName());
        C0NB.LJIIIZ("CoHostWindowView", X1D.LIZIZ(LIZ));
        ((C68322mC) afS52S0300000_13.l0).element = C05170If.LIZ(user);
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("updateDisplayName, displayName = ");
        JBR.LJIIJ(LIZ2, (String) ((C68322mC) afS52S0300000_13.l0).element, LIZ2, "CoHostWindowView");
        ((ViewOnClickListenerC76430Tz8) afS52S0300000_13.l1).getViewDisplayId().setText((CharSequence) ((C68322mC) afS52S0300000_13.l0).element);
        C75883TqJ c75883TqJ = ((ViewOnClickListenerC76430Tz8) afS52S0300000_13.l1).LJLJL;
        C75768ToS c75768ToS2 = null;
        if (c75883TqJ != null) {
            c75768ToS2 = c75883TqJ.LJIIZILJ;
        }
        String str = "";
        if (c75768ToS2 != null) {
            String displayId = user.getDisplayId();
            if (displayId == null) {
                displayId = "";
            }
            c75768ToS2.LIZ = displayId;
        }
        C75883TqJ c75883TqJ2 = ((ViewOnClickListenerC76430Tz8) afS52S0300000_13.l1).LJLJL;
        if (c75883TqJ2 != null && (c75768ToS = c75883TqJ2.LJIIZILJ) != null) {
            String nickName = user.getNickName();
            if (nickName != null) {
                str = nickName;
            }
            c75768ToS.LIZIZ = str;
        }
        ((InterfaceC65784Pro) afS52S0300000_13.l2).invoke();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void accept$2(AfS52S0300000_13 afS52S0300000_13, Object obj) {
        int i;
        int i2;
        ChangeStateResp changeStateResp;
        BaseResponse baseResponse = (BaseResponse) obj;
        boolean z = true;
        if (baseResponse != null && (changeStateResp = (ChangeStateResp) baseResponse.data) != null && changeStateResp.result == 1) {
            i = 1;
        } else {
            i = 0;
        }
        InterfaceC88472Yns interfaceC88472Yns = (InterfaceC88472Yns) afS52S0300000_13.l0;
        if (interfaceC88472Yns != null) {
            if (i != 1) {
                z = false;
            }
            interfaceC88472Yns.invoke(Boolean.valueOf(z));
        }
        GameLinkGuestPresenter gameLinkGuestPresenter = (GameLinkGuestPresenter) afS52S0300000_13.l1;
        int i3 = ((ChangeStateReq) afS52S0300000_13.l2).stateType;
        if (baseResponse != null) {
            i2 = baseResponse.statusCode;
        } else {
            i2 = 0;
        }
        GameLinkGuestPresenter.reportChangeStateEvent$default(gameLinkGuestPresenter, i3, i, i2, null, 8, null);
    }

    public static final void accept$3(AfS52S0300000_13 afS52S0300000_13, Object obj) {
        Throwable it = (Throwable) obj;
        RankRootViewModel rankRootViewModel = (RankRootViewModel) afS52S0300000_13.l0;
        o.LJIIIIZZ(it, "it");
        RankTypeV2 rankTypeV2 = (RankTypeV2) afS52S0300000_13.l1;
        int i = rankTypeV2.type;
        int i2 = rankTypeV2.rankPhase;
        C77979Uj1 c77979Uj1 = (C77979Uj1) afS52S0300000_13.l2;
        rankRootViewModel.getClass();
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C78016Ujc(rankRootViewModel.gv0(rankRootViewModel.LJLJLJ)));
        rankRootViewModel.LJLLI.postValue(arrayList);
        C31524CYu.LJFF(it, i, i2, c77979Uj1.LIZ, c77979Uj1.LIZIZ, c77979Uj1.LIZJ, c77979Uj1.LIZLLL);
    }

    public static final void accept$4(AfS52S0300000_13 afS52S0300000_13, Object obj) {
        Throwable th = (Throwable) obj;
        C76677U7l c76677U7l = ((U7T) afS52S0300000_13.l0).LJJLIIIJ;
        if (c76677U7l != null) {
            long j = ((C76690U7y) afS52S0300000_13.l1).LIZIZ;
            c76677U7l.LIZLLL.remove(Long.valueOf(j));
            InterfaceC92693kP interfaceC92693kP = c76677U7l.LIZJ.get(Long.valueOf(j));
            if (interfaceC92693kP != null) {
                interfaceC92693kP.dispose();
            }
            c76677U7l.LIZJ.remove(Long.valueOf(j));
        }
        ((U7T) afS52S0300000_13.l0).LJIIJJI.LJIIL(((C76690U7y) afS52S0300000_13.l1).LIZIZ);
        if (((U7T) afS52S0300000_13.l0).LJIIJJI.LJJIJIIJI() == null && ((U7T) afS52S0300000_13.l0).LJIIJJI.LJIIL.isEmpty() && ((U7T) afS52S0300000_13.l0).LJIIJJI.LJIILIIL.isEmpty()) {
            ((U7T) afS52S0300000_13.l0).LJIILJJIL.LIZIZ(0);
        }
        C15610jN.LIZ().post(new ARunnableS32S0200000_13(th, (InterfaceC76768UAy) afS52S0300000_13.l2, 84));
    }

    public static final void accept$5(AfS52S0300000_13 afS52S0300000_13, Object obj) {
        C32014ChO.LJFF(U7T.LJJJJI(715), "destroyChannel onDestroyChannelSucceeded callback");
        U7V.LJIILIIL(obj, (InterfaceC76768UAy) afS52S0300000_13.l1);
        U7T u7t = (U7T) afS52S0300000_13.l0;
        long finishReason = ((DestroyChannelData) afS52S0300000_13.l2).getFinishReason();
        u7t.getClass();
        C76766UAw c76766UAw = C76766UAw.LIZJ;
        c76766UAw.LIZJ(new ARunnableS16S0100100_13(u7t, finishReason, 2));
        c76766UAw.LIZJ(new ARunnableS49S0100000_13((U7T) afS52S0300000_13.l0, 171));
        U7T.LJJIII(((U7T) afS52S0300000_13.l0).LJJJI);
        ((U7T) afS52S0300000_13.l0).LJJJI = null;
        C76680U7o.LIZIZ();
    }

    public static final void accept$6(AfS52S0300000_13 afS52S0300000_13, Object obj) {
        Throwable th = (Throwable) obj;
        C76677U7l c76677U7l = ((U7T) afS52S0300000_13.l0).LJJLIIIJ;
        if (c76677U7l != null) {
            long j = ((C76689U7x) afS52S0300000_13.l1).LIZIZ;
            c76677U7l.LJ.remove(Long.valueOf(j));
            InterfaceC92693kP interfaceC92693kP = c76677U7l.LIZJ.get(Long.valueOf(j));
            if (interfaceC92693kP != null) {
                interfaceC92693kP.dispose();
            }
            c76677U7l.LIZJ.remove(Long.valueOf(j));
        }
        ((U7T) afS52S0300000_13.l0).LJIIJJI.LJIIJJI(((C76689U7x) afS52S0300000_13.l1).LIZIZ);
        if (((U7T) afS52S0300000_13.l0).LJIIJJI.LJJIJIIJI() == null && ((U7T) afS52S0300000_13.l0).LJIIJJI.LJIIL.isEmpty() && ((U7T) afS52S0300000_13.l0).LJIIJJI.LJIILIIL.isEmpty()) {
            ((U7T) afS52S0300000_13.l0).LJIILJJIL.LIZIZ(0);
        }
        C15610jN.LIZ().post(new ARunnableS32S0200000_13(th, (InterfaceC76768UAy) afS52S0300000_13.l2, 94));
    }

    public static final void accept$7(AfS52S0300000_13 afS52S0300000_13, Object obj) {
        CoHostRtcMessage coHostRtcMessage;
        Throwable it = (Throwable) obj;
        U7F u7f = (U7F) afS52S0300000_13.l0;
        String linkMicId = ((PermitApplyData) afS52S0300000_13.l1).getApplicant().getLinkMicId();
        String str = "";
        if (linkMicId == null) {
            linkMicId = "";
        }
        u7f.getClass();
        if (!MtCoHostRtcPermitMsgSetting.INSTANCE.isEnable()) {
            U4R.LIZLLL("CoLinker", "handleRtcMessageLeaveSend rtc_reply_msg disable");
        } else {
            u7f.LJJIIZ().getClass();
            long j = u7f.LJIIIZ;
            String str2 = u7f.LJIIJ;
            if (str2 != null) {
                str = str2;
            }
            if (j <= 0) {
                coHostRtcMessage = null;
            } else {
                long LIZ = C30725C4b.LIZ();
                CoHostRtcMessageParam coHostRtcMessageParam = new CoHostRtcMessageParam(-1, linkMicId, str);
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append(((C29374Bfu) B83.LIZ().LIZIZ()).getCurrentUserId());
                LIZ2.append('_');
                LIZ2.append(LIZ);
                coHostRtcMessage = new CoHostRtcMessage("multi_cohost_leave_msg", j, coHostRtcMessageParam, "android", 1, 2, LIZ, X1D.LIZIZ(LIZ2), null, 256, null);
                StringBuilder LIZ3 = X1D.LIZ();
                LIZ3.append("getCoHostLeaveMessage : rtcMessage=");
                LIZ3.append(coHostRtcMessage);
                U4R.LIZLLL("CoHostRtcMessageWriter", X1D.LIZIZ(LIZ3));
            }
            String messageStr = GsonProtectorUtils.toJson(C09650Zl.LIZJ, coHostRtcMessage);
            U7U LJJIIZI = u7f.LJJIIZI();
            o.LJIIIIZZ(messageStr, "messageStr");
            LJJIIZI.LJJJJZI(linkMicId, messageStr);
            StringBuilder LIZIZ = C25620zW.LIZIZ("handleRtcMessageLeaveSendOnPermitFail : inviterLinkmicId=", linkMicId, ", inviteeLinkmicId=");
            LIZIZ.append(u7f.LJIIJ);
            LIZIZ.append(", rtcMessage=");
            LIZIZ.append(coHostRtcMessage);
            U4R.LIZLLL("CoLinker", X1D.LIZIZ(LIZIZ));
        }
        o.LJIIIIZZ(it, "it");
        U7V.LJIIJJI(it, (InterfaceC76768UAy) afS52S0300000_13.l2);
    }

    public static final void accept$8(AfS52S0300000_13 afS52S0300000_13, Object obj) {
        List list = (List) afS52S0300000_13.l0;
        if (list != null && list.size() >= 10) {
            String str = ((C75525TkX) afS52S0300000_13.l1).LJLJJI;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("startRefreshPreviewAvatar loop avatarCount=");
            LIZ.append(((C76732zl) afS52S0300000_13.l2).element);
            C0NB.LJ(str, X1D.LIZIZ(LIZ));
            ((C76732zl) afS52S0300000_13.l2).element++;
            C31597Caf c31597Caf = ((C75525TkX) afS52S0300000_13.l1).LJLL;
            if (c31597Caf != null) {
                c31597Caf.setVisibility(0);
            }
            C31597Caf c31597Caf2 = ((C75525TkX) afS52S0300000_13.l1).LJLL;
            List list2 = (List) afS52S0300000_13.l0;
            C15640jQ.LJIIIIZZ(c31597Caf2, (ImageModel) ListProtector.get(list2, ((C76732zl) afS52S0300000_13.l2).element % list2.size()));
        }
    }

    public static final void accept$9(AfS52S0300000_13 afS52S0300000_13, Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        RectF g5 = ((InterfaceC75807Tp5) afS52S0300000_13.l0).g5((Region) afS52S0300000_13.l1);
        if (g5 == null) {
            U8Q u8q = (U8Q) afS52S0300000_13.l2;
            Region region = (Region) afS52S0300000_13.l1;
            u8q.getClass();
            g5 = U8Q.LJ(region);
        }
        U8M u8m = ((U8Q) afS52S0300000_13.l2).LIZ.LJFF;
        String obj2 = bitmap.toString();
        Client.RTCWaterMarkRegion rTCWaterMarkRegion = new Client.RTCWaterMarkRegion();
        InterfaceC75807Tp5 interfaceC75807Tp5 = (InterfaceC75807Tp5) afS52S0300000_13.l0;
        rTCWaterMarkRegion.setX(g5.left);
        rTCWaterMarkRegion.setY(g5.top);
        rTCWaterMarkRegion.setW(g5.width());
        rTCWaterMarkRegion.setH(g5.height());
        rTCWaterMarkRegion.setImage(bitmap);
        rTCWaterMarkRegion.setRenderMode(interfaceC75807Tp5.LIZ());
        rTCWaterMarkRegion.setZorder(1);
        u8m.LJJIZ(obj2, rTCWaterMarkRegion);
    }

    public AfS52S0300000_13(Object obj, Object obj2, Object obj3, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
        this.l2 = obj3;
    }
}
