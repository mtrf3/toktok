package Y;

import X.AbstractC73638SvC;
import X.AbstractC73672Svk;
import X.C09650Zl;
import X.C1DF;
import X.C1E2;
import X.C31012CFc;
import X.C32014ChO;
import X.C51029K0z;
import X.C65767PrX;
import X.C72972SkS;
import X.C73565Su1;
import X.C73969T1h;
import X.C76732U9o;
import X.C76732zl;
import X.C77150UPq;
import X.C77151UPr;
import X.C77157UPx;
import X.C77731Uf1;
import X.CN1;
import X.EnumC77154UPu;
import X.InterfaceC48038ItG;
import X.InterfaceC76675U7j;
import X.InterfaceC77737Uf7;
import X.OSZ;
import X.Q7L;
import X.R2P;
import X.T16;
import X.U4R;
import X.U66;
import X.U7A;
import X.U7B;
import X.U7T;
import X.U7U;
import X.U7V;
import X.U85;
import X.UC7;
import X.UPC;
import X.X1D;
import android.text.TextUtils;
import com.bytedance.android.live.network.response.BaseResponse;
import com.bytedance.android.live.wallet.model.CheckSubOrderResultStruct;
import com.bytedance.android.livesdk.chatroom.model.multiguestv3.BizJoinDirectParams;
import com.bytedance.android.livesdk.comp.api.linkcore.model.ApplyData;
import com.bytedance.android.livesdk.comp.api.linkcore.model.ApplyResult;
import com.bytedance.android.livesdk.comp.api.linkcore.model.CancelInviteData;
import com.bytedance.android.livesdk.comp.api.linkcore.model.CancelInviteResult;
import com.bytedance.android.livesdk.comp.api.linkcore.model.DirectJoinData;
import com.bytedance.android.livesdk.comp.api.linkcore.model.DirectJoinResult;
import com.bytedance.android.livesdk.comp.api.linkcore.model.KickOutAllData;
import com.bytedance.android.livesdk.comp.api.linkcore.model.KickOutAllResult;
import com.bytedance.android.livesdk.comp.api.linkcore.model.KickOutData;
import com.bytedance.android.livesdk.comp.api.linkcore.model.KickOutResult;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkLayerRTCMessageP2PParam;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkLayerRTCP2PMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.OnLineMicInfo;
import com.bytedance.android.livesdk.comp.api.linkcore.model.PermitApplyData;
import com.bytedance.android.livesdk.comp.api.linkcore.model.PermitResult;
import com.bytedance.android.livesdk.comp.api.linkcore.model.ReplyInviteData;
import com.bytedance.android.livesdk.comp.api.linkcore.model.ReplyResult;
import com.bytedance.android.livesdk.comp.impl.linkcore.api.LinkMicApi;
import com.bytedance.android.livesdk.model.message.linkcore.ApplyRequestResponse;
import com.bytedance.android.livesdk.model.message.linkcore.JoinDirectResp;
import com.bytedance.android.livesdk.model.message.linkcore.LinkCommon;
import com.bytedance.android.livesdk.model.message.linkcore.LinkMicCommonResp;
import com.bytedance.android.livesdk.model.message.linkcore.LinkMicUplinkBaseResp;
import com.bytedance.android.livesdk.model.message.linkcore.PermitResponse;
import com.bytedance.android.livesdk.model.message.linkcore.Player;
import com.bytedance.android.livesdk.model.message.linkcore.ReplyResponse;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.o;
import tikcast.linkmic.controller.KickOutAllGuestsResp;
import tikcast.linkmic.controller.ResumeReq;
import webcast.data.multilive_biz.BizResumeParams;

/* loaded from: classes14.dex */
public class IDhS72S0200000_13 implements InterfaceC48038ItG {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // X.InterfaceC48038ItG
    public final Object apply(Object obj) {
        switch (this.$t) {
            case 0:
                return apply$0(this, obj);
            case 1:
                return apply$1(this, obj);
            case 2:
                return apply$2(this, obj);
            case 3:
                return apply$3(this, obj);
            case 4:
                return apply$4(this, obj);
            case 5:
                return apply$5(this, obj);
            case 6:
                return apply$6(this, obj);
            case 7:
                return apply$7(this, obj);
            case 8:
                return apply$8(this, obj);
            case 9:
                return apply$9(this, obj);
            case 10:
                return apply$10(this, obj);
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                return apply$11(this, obj);
            default:
                return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object apply$0(IDhS72S0200000_13 iDhS72S0200000_13, Object obj) {
        BaseResponse orderResult = (BaseResponse) obj;
        o.LJIIIZ(orderResult, "orderResult");
        T t = orderResult.data;
        if (((CheckSubOrderResultStruct) t).status != 1) {
            if (((C76732zl) iDhS72S0200000_13.l0).element < 3) {
                C77731Uf1 c77731Uf1 = C77731Uf1.LIZ;
                InterfaceC77737Uf7 interfaceC77737Uf7 = (InterfaceC77737Uf7) iDhS72S0200000_13.l1;
                int i = orderResult.statusCode;
                Exception exc = new Exception();
                C76732zl c76732zl = (C76732zl) iDhS72S0200000_13.l0;
                int i2 = c76732zl.element;
                c76732zl.element = i2 + 1;
                C77731Uf1.LJIIJJI(c77731Uf1, interfaceC77737Uf7, 8, 41, i, "ttlive_check_subscription", exc, null, null, i2, 192);
            }
            return AbstractC73672Svk.LJJI(new Exception("retry"));
        }
        return AbstractC73672Svk.LJJIJIL(t);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object apply$1(IDhS72S0200000_13 iDhS72S0200000_13, Object obj) {
        BaseResponse it = (BaseResponse) obj;
        o.LJIIIZ(it, "it");
        U7T u7t = (U7T) iDhS72S0200000_13.l0;
        KickOutData kickOutData = (KickOutData) iDhS72S0200000_13.l1;
        String linkMicId = kickOutData.getGuest().getLinkMicId();
        String LJJJJI = U7T.LJJJJI(1780);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onKickOutSucceeded start cur channel id ");
        C72972SkS.LJI(LIZ, u7t.LJI, LIZ, LJJJJI);
        LinkMicUplinkBaseResp linkMicUplinkBaseResp = (LinkMicUplinkBaseResp) it.data;
        Map<String, byte[]> map = null;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        Object[] objArr4 = 0;
        Object[] objArr5 = 0;
        if (linkMicUplinkBaseResp == null) {
            return null;
        }
        OnLineMicInfo build = new OnLineMicInfo.Builder().build();
        long userId = kickOutData.getGuest().getUserId();
        U7B u7b = new U7B();
        u7b.LIZ = u7t.LLZL();
        u7b.LIZIZ = u7t.LJIIJ;
        u7b.LIZJ = C51029K0z.LJJIIZI(new OSZ(Long.valueOf(userId), build));
        U7A u7a = new U7A(u7b);
        U7U u7u = u7t.LJIIIZ;
        u7u.getClass();
        o.LJIIIZ(linkMicId, "linkMicId");
        UC7.LJ("kickOut start linkMicId=", linkMicId, "RtcManager");
        U66 u66 = u7u.LJIIIZ;
        if (u66 != null) {
            long userId2 = u66.LLZL().getUserId();
            Room room = u7u.LJIIJ;
            if (room != null && userId2 == room.getOwnerUserId()) {
                LinkLayerRTCP2PMessage linkLayerRTCP2PMessage = new LinkLayerRTCP2PMessage(objArr5 == true ? 1 : 0, objArr4 == true ? 1 : 0, objArr3 == true ? 1 : 0, objArr2 == true ? 1 : 0, 15, objArr == true ? 1 : 0);
                linkLayerRTCP2PMessage.generateId();
                linkLayerRTCP2PMessage.setMethod("linkMicSDKKickout");
                LinkLayerRTCMessageP2PParam linkLayerRTCMessageP2PParam = new LinkLayerRTCMessageP2PParam(null, 1, null);
                linkLayerRTCMessageP2PParam.setLinkMicId(linkMicId);
                linkLayerRTCP2PMessage.setParam(linkLayerRTCMessageP2PParam);
                String json = GsonProtectorUtils.toJson(C09650Zl.LIZIZ, linkLayerRTCP2PMessage);
                if (json != null) {
                    u7u.LJJJJZI(linkMicId, json);
                }
            }
        }
        Iterator<InterfaceC76675U7j> it2 = u7t.LJIIIIZZ.iterator();
        while (it2.hasNext()) {
            it2.next().LJJJJ(u7t, u7a);
        }
        LinkMicCommonResp linkMicCommonResp = linkMicUplinkBaseResp.commonResp;
        if (linkMicCommonResp != null) {
            map = linkMicCommonResp.extra;
        }
        return new KickOutResult(map);
    }

    public static final Object apply$10(IDhS72S0200000_13 iDhS72S0200000_13, Object obj) {
        AbstractC73672Svk LJFF;
        C77150UPq requestSuccess = (C77150UPq) obj;
        o.LJIIJ(requestSuccess, "requestSuccess");
        C77151UPr c77151UPr = (C77151UPr) iDhS72S0200000_13.l0;
        EnumC77154UPu enumC77154UPu = EnumC77154UPu.REQUEST_UID_PERMISSION;
        requestSuccess.LJLILLLLZI = 2;
        c77151UPr.getClass();
        C73565Su1 LIZ = C77151UPr.LIZ(enumC77154UPu, requestSuccess);
        if (requestSuccess.LJLIL) {
            C77151UPr c77151UPr2 = (C77151UPr) iDhS72S0200000_13.l0;
            UPC upc = (UPC) iDhS72S0200000_13.l1;
            LJFF = AbstractC73672Svk.LJJIZ(C77151UPr.LJFF(upc, requestSuccess), c77151UPr2.LJI(upc));
            o.LJFF(LJFF, "Observable.merge(syncSta…(ufr, isSuccess), action)");
        } else {
            C77151UPr c77151UPr3 = (C77151UPr) iDhS72S0200000_13.l0;
            UPC upc2 = (UPC) iDhS72S0200000_13.l1;
            c77151UPr3.getClass();
            LJFF = C77151UPr.LJFF(upc2, requestSuccess);
        }
        return AbstractC73672Svk.LJJIZ(LIZ, LJFF);
    }

    public static final Object apply$11(IDhS72S0200000_13 iDhS72S0200000_13, Object obj) {
        boolean z;
        boolean z2;
        boolean z3;
        AbstractC73672Svk LJJIII;
        Map map = (Map) obj;
        o.LJIIJ(map, "map");
        ((C77151UPr) iDhS72S0200000_13.l0).getClass();
        if (C77151UPr.LIZLLL(map)) {
            C77151UPr c77151UPr = (C77151UPr) iDhS72S0200000_13.l0;
            EnumC77154UPu enumC77154UPu = EnumC77154UPu.CHECK_UID_PERMISSION;
            C77150UPq c77150UPq = new C77150UPq(true, 0, 0, null, 30);
            c77151UPr.getClass();
            C73565Su1 LIZ = C77151UPr.LIZ(enumC77154UPu, c77150UPq);
            C77151UPr c77151UPr2 = (C77151UPr) iDhS72S0200000_13.l0;
            EnumC77154UPu enumC77154UPu2 = EnumC77154UPu.CHECK_ACTUAL_PERMISSION;
            C77150UPq c77150UPq2 = new C77150UPq(true, 0, 0, null, 30);
            c77151UPr2.getClass();
            return AbstractC73672Svk.LJJIL(LIZ, C77151UPr.LIZ(enumC77154UPu2, c77150UPq2), ((C77151UPr) iDhS72S0200000_13.l0).LJI((UPC) iDhS72S0200000_13.l1));
        }
        ((C77151UPr) iDhS72S0200000_13.l0).getClass();
        if (C77151UPr.LIZJ(map)) {
            C77151UPr c77151UPr3 = (C77151UPr) iDhS72S0200000_13.l0;
            EnumC77154UPu enumC77154UPu3 = EnumC77154UPu.CHECK_UID_PERMISSION;
            Boolean bool = (Boolean) map.get(enumC77154UPu3);
            if (bool != null) {
                z3 = bool.booleanValue();
            } else {
                z3 = false;
            }
            boolean z4 = false;
            C77150UPq c77150UPq3 = new C77150UPq(z3, 0, 0, null, 30);
            c77151UPr3.getClass();
            C73565Su1 LIZ2 = C77151UPr.LIZ(enumC77154UPu3, c77150UPq3);
            C77151UPr c77151UPr4 = (C77151UPr) iDhS72S0200000_13.l0;
            EnumC77154UPu enumC77154UPu4 = EnumC77154UPu.CHECK_ACTUAL_PERMISSION;
            Boolean bool2 = (Boolean) map.get(enumC77154UPu4);
            if (bool2 != null) {
                z4 = bool2.booleanValue();
            }
            C77150UPq c77150UPq4 = new C77150UPq(z4, 0, 0, null, 30);
            c77151UPr4.getClass();
            C73565Su1 LIZ3 = C77151UPr.LIZ(enumC77154UPu4, c77150UPq4);
            C77151UPr c77151UPr5 = (C77151UPr) iDhS72S0200000_13.l0;
            UPC upc = (UPC) iDhS72S0200000_13.l1;
            if (c77151UPr5.LIZIZ) {
                C73565Su1 LIZ4 = C77151UPr.LIZ(EnumC77154UPu.REQUEST_UID_PERMISSION, new C77150UPq(true, 0, 0, null, 30));
                C77150UPq c77150UPq5 = new C77150UPq(true, 0, 0, null, 30);
                AbstractC73672Svk LJJIZ = AbstractC73672Svk.LJJIZ(C77151UPr.LJFF(upc, c77150UPq5), c77151UPr5.LJI(upc));
                o.LJFF(LJJIZ, "Observable.merge(syncSta…(ufr, isSuccess), action)");
                LJJIII = AbstractC73672Svk.LJJIZ(LIZ4, LJJIZ);
                o.LJFF(LJJIII, "Observable.merge(\n      …pload(ufr))\n            )");
            } else {
                LJJIII = upc.LJIIIIZZ().LJJJ(C73969T1h.LIZIZ()).LJJIII(new IDhS72S0200000_13(c77151UPr5, upc, 10), false);
                o.LJFF(LJJIII, "ufr.requestUidPermission…      )\n                }");
            }
            return AbstractC73672Svk.LJJIL(LIZ2, LIZ3, LJJIII);
        }
        ((C77151UPr) iDhS72S0200000_13.l0).getClass();
        EnumC77154UPu enumC77154UPu5 = EnumC77154UPu.CHECK_ACTUAL_PERMISSION;
        if (o.LJ(map.get(enumC77154UPu5), Boolean.FALSE)) {
            C77151UPr c77151UPr6 = (C77151UPr) iDhS72S0200000_13.l0;
            EnumC77154UPu enumC77154UPu6 = EnumC77154UPu.CHECK_UID_PERMISSION;
            Boolean bool3 = (Boolean) map.get(enumC77154UPu6);
            if (bool3 != null) {
                z = bool3.booleanValue();
            } else {
                z = false;
            }
            C77150UPq c77150UPq6 = new C77150UPq(z, 0, 0, null, 30);
            c77151UPr6.getClass();
            C73565Su1 LIZ5 = C77151UPr.LIZ(enumC77154UPu6, c77150UPq6);
            C77151UPr c77151UPr7 = (C77151UPr) iDhS72S0200000_13.l0;
            Boolean bool4 = (Boolean) map.get(enumC77154UPu5);
            if (bool4 != null) {
                z2 = bool4.booleanValue();
            } else {
                z2 = false;
            }
            C77150UPq c77150UPq7 = new C77150UPq(z2, 0, 0, null, 30);
            c77151UPr7.getClass();
            C73565Su1 LIZ6 = C77151UPr.LIZ(enumC77154UPu5, c77150UPq7);
            C77151UPr c77151UPr8 = (C77151UPr) iDhS72S0200000_13.l0;
            UPC upc2 = (UPC) iDhS72S0200000_13.l1;
            c77151UPr8.getClass();
            AbstractC73672Svk<R> LJJIII2 = upc2.LJII().LJJJ(C73969T1h.LIZIZ()).LJJIII(new IDhS72S0200000_13(c77151UPr8, upc2, 9), false);
            o.LJFF(LJJIII2, "ufr.requestActualPermiss…          )\n            }");
            return AbstractC73672Svk.LJJIL(LIZ5, LIZ6, LJJIII2);
        }
        return AbstractC73672Svk.LJJIJIL(new C77157UPx(EnumC77154UPu.UNKNOW, new C77150UPq(false, 0, 0, null, 30)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object apply$2(IDhS72S0200000_13 iDhS72S0200000_13, Object obj) {
        KickOutAllResult kickOutAllResult;
        BaseResponse it = (BaseResponse) obj;
        o.LJIIIZ(it, "it");
        U7T u7t = (U7T) iDhS72S0200000_13.l0;
        String LJJJJI = U7T.LJJJJI(2233);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onKickOutAllSucceeded start cur channel id ");
        C72972SkS.LJI(LIZ, u7t.LJI, LIZ, LJJJJI);
        KickOutAllGuestsResp kickOutAllGuestsResp = (KickOutAllGuestsResp) it.data;
        if (kickOutAllGuestsResp != null) {
            Iterator<InterfaceC76675U7j> it2 = u7t.LJIIIIZZ.iterator();
            while (it2.hasNext()) {
                InterfaceC76675U7j next = it2.next();
                C65767PrX<Long> copyOf = C65767PrX.copyOf((List) kickOutAllGuestsResp.removedUserIds);
                o.LJIIIIZZ(copyOf, "copyOf(this.removedUserIds)");
                next.LJJIIZI(u7t, copyOf);
            }
            kickOutAllResult = new KickOutAllResult(kickOutAllGuestsResp.removedUserIds);
        } else {
            kickOutAllResult = null;
        }
        String LJJJJIZL = U7T.LJJJJIZL(2196);
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("kickOutAll channelId=");
        LIZ2.append(((U7T) iDhS72S0200000_13.l0).LJI);
        LIZ2.append(" state=");
        LIZ2.append(((U7T) iDhS72S0200000_13.l0).LJIILJJIL.LIZ);
        LIZ2.append(" data=");
        LIZ2.append((KickOutAllData) iDhS72S0200000_13.l1);
        C32014ChO.LIZJ(LJJJJIZL, X1D.LIZIZ(LIZ2), null);
        return kickOutAllResult;
    }

    public static final Object apply$3(IDhS72S0200000_13 iDhS72S0200000_13, Object it) {
        o.LJIIIZ(it, "it");
        if (((U7T) iDhS72S0200000_13.l0).LJJIJIIJIL) {
            U7T u7t = (U7T) iDhS72S0200000_13.l0;
            BizResumeParams bizResumeParams = (BizResumeParams) iDhS72S0200000_13.l1;
            u7t.getClass();
            LinkCommon linkCommon = new LinkCommon(0, 0L, 0L, null, null, 31, null);
            linkCommon.scene = u7t.LJFF;
            linkCommon.appId = ((IHostAppContext) CN1.LIZ(IHostAppContext.class)).appId();
            linkCommon.live_id = ((IHostAppContext) CN1.LIZ(IHostAppContext.class)).liveId();
            linkCommon.extraMap = null;
            Player player = new Player(u7t.LJIL, u7t.LJIILIIL);
            ResumeReq resumeReq = new ResumeReq();
            resumeReq.common = linkCommon;
            resumeReq.myself = player;
            resumeReq.channelId = u7t.LJI;
            resumeReq.multiGuestReqExtra = bizResumeParams;
            long LIZIZ = C31012CFc.LIZIZ();
            return AbstractC73638SvC.LJJIIZ(((LinkMicApi) Q7L.LIZIZ(LinkMicApi.class)).resume(resumeReq).LJJIIJ(T16.LIZ()).LJIILIIL(new AfS8S0100100_13(LIZIZ, u7t, 12)).LJIIJ(new AfS8S0100100_13(LIZIZ, u7t, 13)), AbstractC73638SvC.LJIJ(it), C1DF.LJLILLLLZI);
        }
        return AbstractC73638SvC.LJJIIZ(AbstractC73638SvC.LJIJ(new R2P()), AbstractC73638SvC.LJIJ(it), C1E2.LJLIL);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object apply$4(IDhS72S0200000_13 iDhS72S0200000_13, Object obj) {
        BaseResponse it = (BaseResponse) obj;
        o.LJIIIZ(it, "it");
        U7T u7t = (U7T) iDhS72S0200000_13.l0;
        int replyStatus = ((ReplyInviteData) iDhS72S0200000_13.l1).getReplyStatus();
        String LJJJJI = U7T.LJJJJI(1717);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onReplyInviteSucceeded start cur channel id ");
        C72972SkS.LJI(LIZ, u7t.LJI, LIZ, LJJJJI);
        ReplyResponse replyResponse = (ReplyResponse) it.data;
        if (replyResponse != null) {
            OnLineMicInfo LIZLLL = U7V.LIZLLL(replyResponse.position);
            if (LIZLLL == null) {
                LIZLLL = new OnLineMicInfo.Builder().build();
            }
            if (replyStatus == 1) {
                u7t.LJJI = replyResponse.inviteeLinkMicId;
                u7t.LJIIJ = U7V.LJIIIZ(replyResponse.rtcInfo, u7t.LJI);
                U7B u7b = new U7B();
                u7b.LIZ = u7t.LLZL();
                u7b.LIZIZ = u7t.LJIIJ;
                u7b.LIZJ = C51029K0z.LJJIIZI(new OSZ(Long.valueOf(u7t.LJIILIIL), LIZLLL));
                U7A u7a = new U7A(u7b);
                U7U.LJIIZILJ(u7t.LJIIIZ, u7t, u7a.LIZIZ, true, false, false, false, "business_multi_guest_guest_accept_invite", null, 184);
                Iterator<InterfaceC76675U7j> it2 = u7t.LJIIIIZZ.iterator();
                while (it2.hasNext()) {
                    it2.next().LJJIJLIJ(u7t, u7a);
                }
            } else if (replyStatus == 2) {
                u7t.LJJJLL(1);
                Iterator<InterfaceC76675U7j> it3 = u7t.LJIIIIZZ.iterator();
                while (it3.hasNext()) {
                    it3.next().LJFF(u7t);
                }
            }
            return new ReplyResult(replyResponse.inviteeLinkMicId, LIZLLL, replyResponse.multiGuestRespExtra, null, 8, null);
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object apply$5(IDhS72S0200000_13 iDhS72S0200000_13, Object obj) {
        BaseResponse it = (BaseResponse) obj;
        o.LJIIIZ(it, "it");
        U7T u7t = (U7T) iDhS72S0200000_13.l0;
        ApplyData applyData = (ApplyData) iDhS72S0200000_13.l1;
        String LJJJJI = U7T.LJJJJI(1630);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onApplySucceeded start cur channel id ");
        LIZ.append(u7t.LJI);
        LIZ.append(", response id ");
        LIZ.append(applyData.getChannelId());
        C32014ChO.LJFF(LJJJJI, X1D.LIZIZ(LIZ));
        if (u7t.LJI <= 0) {
            u7t.LJJJJLL(applyData.getChannelId());
        }
        ApplyRequestResponse applyRequestResponse = (ApplyRequestResponse) it.data;
        if (applyRequestResponse == null) {
            return null;
        }
        u7t.LJJII = false;
        u7t.LJJI = applyRequestResponse.applicantLinkMicId;
        u7t.LJIIJ = U7V.LJIIIZ(applyRequestResponse.rtcInfo, u7t.LJI);
        U7B u7b = new U7B();
        u7b.LIZ = u7t.LLZL();
        u7b.LIZIZ = u7t.LJIIJ;
        U7A u7a = new U7A(u7b);
        if (!TextUtils.isEmpty(applyRequestResponse.applicantLinkMicId) && it.statusCode == 0) {
            u7t.LJJJLL(2);
        }
        Iterator<InterfaceC76675U7j> it2 = u7t.LJIIIIZZ.iterator();
        while (it2.hasNext()) {
            it2.next().LJJJJZI(u7t, u7a);
        }
        return new ApplyResult(applyRequestResponse.multiGuestRespExtra, null, 2, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object apply$6(IDhS72S0200000_13 iDhS72S0200000_13, Object obj) {
        Map<String, byte[]> map;
        BaseResponse it = (BaseResponse) obj;
        o.LJIIIZ(it, "it");
        U7T u7t = (U7T) iDhS72S0200000_13.l0;
        CancelInviteData cancelInviteData = (CancelInviteData) iDhS72S0200000_13.l1;
        String LJJJJI = U7T.LJJJJI(1748);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onCancelInviteSucceeded start cur channel id ");
        C72972SkS.LJI(LIZ, u7t.LJI, LIZ, LJJJJI);
        LinkMicUplinkBaseResp linkMicUplinkBaseResp = (LinkMicUplinkBaseResp) it.data;
        if (linkMicUplinkBaseResp == null) {
            return null;
        }
        OnLineMicInfo build = new OnLineMicInfo.Builder().build();
        long userId = cancelInviteData.getInvitee().getUserId();
        U7B u7b = new U7B();
        u7b.LIZ = u7t.LLZL();
        u7b.LIZIZ = u7t.LJIIJ;
        u7b.LIZJ = C51029K0z.LJJIIZI(new OSZ(Long.valueOf(userId), build));
        U7A u7a = new U7A(u7b);
        Iterator<InterfaceC76675U7j> it2 = u7t.LJIIIIZZ.iterator();
        while (it2.hasNext()) {
            it2.next().LJJJ(u7t, u7a);
        }
        LinkMicCommonResp linkMicCommonResp = linkMicUplinkBaseResp.commonResp;
        if (linkMicCommonResp != null) {
            map = linkMicCommonResp.extra;
        } else {
            map = null;
        }
        return new CancelInviteResult(map, null, 2, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object apply$7(IDhS72S0200000_13 iDhS72S0200000_13, Object obj) {
        long j;
        BaseResponse it = (BaseResponse) obj;
        o.LJIIIZ(it, "it");
        U7T u7t = (U7T) iDhS72S0200000_13.l0;
        PermitApplyData permitApplyData = (PermitApplyData) iDhS72S0200000_13.l1;
        String LJJJJI = U7T.LJJJJI(1689);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onPermitApplySucceeded start cur channel id ");
        C72972SkS.LJI(LIZ, u7t.LJI, LIZ, LJJJJI);
        PermitResponse permitResponse = (PermitResponse) it.data;
        Map<String, byte[]> map = null;
        if (permitResponse == null) {
            return null;
        }
        OnLineMicInfo LIZLLL = U7V.LIZLLL(permitResponse.position);
        if (LIZLLL == null) {
            LIZLLL = new OnLineMicInfo.Builder().build();
        }
        if (permitApplyData.getPermitStatus() == 1) {
            u7t.LJJI = permitResponse.linkMicId;
            u7t.LJIIJ = U7V.LJIIIZ(permitResponse.rtcInfo, u7t.LJI);
            U7B u7b = new U7B();
            C76732U9o c76732U9o = new C76732U9o();
            c76732U9o.LIZLLL = false;
            c76732U9o.LJ = u7t.LJI;
            c76732U9o.LIZJ = permitResponse.applierLinkMicId;
            Player player = permitResponse.applier;
            long j2 = -1;
            if (player != null) {
                j = player.roomId;
            } else {
                j = -1;
            }
            c76732U9o.LIZ = j;
            if (player != null) {
                j2 = player.uid;
            }
            c76732U9o.LIZIZ = j2;
            u7b.LIZ = c76732U9o.LIZ();
            u7b.LIZIZ = u7t.LJIIJ;
            u7b.LIZJ = C51029K0z.LJJIIZI(new OSZ(Long.valueOf(permitApplyData.getApplicant().getUserId()), LIZLLL));
            U7A u7a = new U7A(u7b);
            U7U.LJIIZILJ(u7t.LJIIIZ, u7t, u7a.LIZIZ, false, false, false, false, "business_multi_guest_anchor_permit_apply", null, 188);
            Iterator<InterfaceC76675U7j> it2 = u7t.LJIIIIZZ.iterator();
            while (it2.hasNext()) {
                it2.next().LJJJJZ(u7t, u7a);
            }
            if (u7t.LLZILL()) {
                Iterator<InterfaceC76675U7j> it3 = u7t.LJIIIIZZ.iterator();
                while (it3.hasNext()) {
                    it3.next().LJIIJ(u7t, u7a);
                }
            }
        }
        LinkMicCommonResp linkMicCommonResp = permitResponse.commonResp;
        if (linkMicCommonResp != null) {
            map = linkMicCommonResp.extra;
        }
        return new PermitResult(LIZLLL, map, null, 4, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object apply$8(IDhS72S0200000_13 iDhS72S0200000_13, Object obj) {
        boolean z;
        BaseResponse response = (BaseResponse) obj;
        o.LJIIIZ(response, "response");
        U4R.LIZLLL("Linker", "joinDirect deal in background thread");
        JoinDirectResp joinDirectResp = (JoinDirectResp) response.data;
        if (joinDirectResp == null) {
            return null;
        }
        U7T u7t = (U7T) iDhS72S0200000_13.l0;
        DirectJoinData directJoinData = (DirectJoinData) iDhS72S0200000_13.l1;
        if (u7t.LJI < 0) {
            u7t.LJJJJLL(directJoinData.getChannelId());
        }
        BizJoinDirectParams bizJoinDirectParams = directJoinData.getBizJoinDirectParams();
        if (bizJoinDirectParams != null && bizJoinDirectParams.replyType == 1) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            u7t.LJJI = joinDirectResp.selfLinkMicId;
            u7t.LJIIJ = U7V.LJIIIZ(joinDirectResp.rtcInfo, u7t.LJI);
            OnLineMicInfo LIZLLL = U7V.LIZLLL(joinDirectResp.position);
            if (LIZLLL == null) {
                LIZLLL = new OnLineMicInfo.Builder().build();
            }
            U7B u7b = new U7B();
            u7b.LIZ = u7t.LLZL();
            u7b.LIZIZ = u7t.LJIIJ;
            u7b.LIZJ = C51029K0z.LJJIIZI(new OSZ(Long.valueOf(u7t.LJIILIIL), LIZLLL));
            U7A u7a = new U7A(u7b);
            u7t.LJJJLL(2);
            Iterator<InterfaceC76675U7j> it = u7t.LJIIIIZZ.iterator();
            while (it.hasNext()) {
                it.next().LJJJI(u7t, u7t.LJI, joinDirectResp.allUsers);
            }
            U7U.LJIIZILJ(u7t.LJIIIZ, u7t, u7a.LIZIZ, true, false, false, false, "business_multi_guest_guest_accept_invite_join_direct", null, 184);
            Iterator<InterfaceC76675U7j> it2 = u7t.LJIIIIZZ.iterator();
            while (it2.hasNext()) {
                it2.next().LJJIJLIJ(u7t, u7a);
            }
            u7t.LJJIII.LIZ(U85.INVITEE_DIRECT, joinDirectResp.selfLinkMicId, null);
        } else {
            BizJoinDirectParams bizJoinDirectParams2 = directJoinData.getBizJoinDirectParams();
            if (bizJoinDirectParams2 != null && bizJoinDirectParams2.replyType == 2) {
                u7t.LJJJLL(1);
            }
        }
        return new DirectJoinResult(joinDirectResp.multiGuestRespExtra);
    }

    public static final Object apply$9(IDhS72S0200000_13 iDhS72S0200000_13, Object obj) {
        AbstractC73672Svk LJFF;
        C77150UPq requestSuccess = (C77150UPq) obj;
        o.LJIIJ(requestSuccess, "requestSuccess");
        C77151UPr c77151UPr = (C77151UPr) iDhS72S0200000_13.l0;
        EnumC77154UPu enumC77154UPu = EnumC77154UPu.REQUEST_ACTUAL_PERMISSION;
        requestSuccess.LJLILLLLZI = 1;
        c77151UPr.getClass();
        C73565Su1 LIZ = C77151UPr.LIZ(enumC77154UPu, requestSuccess);
        if (requestSuccess.LJLIL) {
            C77151UPr c77151UPr2 = (C77151UPr) iDhS72S0200000_13.l0;
            UPC upc = (UPC) iDhS72S0200000_13.l1;
            LJFF = AbstractC73672Svk.LJJIZ(C77151UPr.LJFF(upc, requestSuccess), c77151UPr2.LJI(upc));
            o.LJFF(LJFF, "Observable.merge(syncSta…(ufr, isSuccess), action)");
        } else {
            C77151UPr c77151UPr3 = (C77151UPr) iDhS72S0200000_13.l0;
            UPC upc2 = (UPC) iDhS72S0200000_13.l1;
            c77151UPr3.getClass();
            LJFF = C77151UPr.LJFF(upc2, requestSuccess);
        }
        return AbstractC73672Svk.LJJIZ(LIZ, LJFF);
    }

    public IDhS72S0200000_13(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }
}
