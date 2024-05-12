package Y;

import X.AbstractC73635Sv9;
import X.AbstractC73672Svk;
import X.C0NB;
import X.C0TL;
import X.C276516r;
import X.C29401Dk;
import X.C32014ChO;
import X.C38901fq;
import X.C51029K0z;
import X.C58528My4;
import X.C64799Pbv;
import X.C65814PsI;
import X.C72972SkS;
import X.C76651U6l;
import X.C76653U6n;
import X.C77156UPw;
import X.C77287UUx;
import X.C77476Uau;
import X.C77536Ubs;
import X.C77537Ubt;
import X.C78939UyV;
import X.EnumC58085Mqv;
import X.InterfaceC48038ItG;
import X.InterfaceC76675U7j;
import X.OSZ;
import X.R2P;
import X.U7A;
import X.U7B;
import X.U7T;
import X.U7U;
import X.U7V;
import X.U9F;
import X.UIO;
import X.UPT;
import X.UQS;
import X.UYK;
import X.X1D;
import com.bytedance.android.live.network.response.BaseResponse;
import com.bytedance.android.live.wallet.data.model.exchange.ExchangeThresholdInfoData;
import com.bytedance.android.live.wallet.viewmodel.exchange.LiveIncomeExchangeDialogVMV2;
import com.bytedance.android.livesdk.comp.api.linkcore.model.CancelApplyResult;
import com.bytedance.android.livesdk.comp.api.linkcore.model.ChangeMaxPositionResult;
import com.bytedance.android.livesdk.comp.api.linkcore.model.DestroyChannelResult;
import com.bytedance.android.livesdk.comp.api.linkcore.model.KickOutResult;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LeaveChannelResult;
import com.bytedance.android.livesdk.comp.api.linkcore.model.OnLineMicInfo;
import com.bytedance.android.livesdk.comp.api.linkcore.model.PermitResult;
import com.bytedance.android.livesdk.comp.impl.linkcore.api.LinkMicApi;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveAudienceLinkmicLowestAgeSetting;
import com.bytedance.android.livesdk.model.message.linkcore.ChangeLayoutResp;
import com.bytedance.android.livesdk.model.message.linkcore.CreateChannelResponse;
import com.bytedance.android.livesdk.model.message.linkcore.LinkMicCommonResp;
import com.bytedance.android.livesdk.model.message.linkcore.LinkMicUplinkBaseResp;
import com.bytedance.android.livesdk.model.message.linkcore.PermitResponse;
import com.bytedance.android.livesdk.model.message.linkcore.Player;
import com.bytedance.android.livesdk.model.message.linkcore.UserPosition;
import com.bytedance.android.livesdk.wallet.CustomErrorExtra;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.ss.android.ugc.aweme.relation.viewmodel.SocialRecRequestViewModel;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AqS163S0100000_13;
import kotlin.jvm.internal.o;
import tikcast.linkmic.controller.RechargeReq;

/* loaded from: classes14.dex */
public class IDhS106S0100000_13 implements InterfaceC48038ItG {
    public final int $t;
    public Object l0;

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
            case 12:
                return apply$12(this, obj);
            case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                return apply$13(this, obj);
            case 14:
                return apply$14(this, obj);
            case 15:
                return apply$15(this, obj);
            case LiveAudienceLinkmicLowestAgeSetting.DEFAULT /* 16 */:
                return apply$16(this, obj);
            case 17:
                return apply$17(this, obj);
            case 18:
                return apply$18(this, obj);
            default:
                return null;
        }
    }

    public IDhS106S0100000_13(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final Object apply$0(IDhS106S0100000_13 iDhS106S0100000_13, Object it) {
        o.LJIIIZ(it, "it");
        ((SocialRecRequestViewModel) iDhS106S0100000_13.l0).setState(UQS.LJLIL);
        return UPT.LIZJ(EnumC58085Mqv.NEW_VERSION);
    }

    public static final Object apply$1(IDhS106S0100000_13 iDhS106S0100000_13, Object obj) {
        UYK uyk = (UYK) iDhS106S0100000_13.l0;
        Throwable th = (Throwable) obj;
        uyk.getClass();
        if (th instanceof C0TL) {
            C0TL c0tl = (C0TL) th;
            if (c0tl.getStatusCode() >= 500 && c0tl.getStatusCode() <= 599) {
                return AbstractC73672Svk.LJJI(th);
            }
        }
        int i = uyk.LJLJI + 1;
        uyk.LJLJI = i;
        if (i <= uyk.LJLIL) {
            return AbstractC73672Svk.LJJLIIIJLJLI(uyk.LJLILLLLZI, TimeUnit.MILLISECONDS);
        }
        return AbstractC73672Svk.LJJI(th);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object apply$10(IDhS106S0100000_13 iDhS106S0100000_13, Object obj) {
        BaseResponse it = (BaseResponse) obj;
        o.LJIIIZ(it, "it");
        U7T u7t = (U7T) iDhS106S0100000_13.l0;
        String LJJJJI = U7T.LJJJJI(1607);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onLeaveChannelSucceeded start cur channel id ");
        C72972SkS.LJI(LIZ, u7t.LJI, LIZ, LJJJJI);
        U7V.LJIILJJIL(new AqS163S0100000_13(u7t, 418));
        LinkMicUplinkBaseResp linkMicUplinkBaseResp = (LinkMicUplinkBaseResp) it.data;
        Map<String, byte[]> map = null;
        if (linkMicUplinkBaseResp == null) {
            return null;
        }
        u7t.LJJJLL(1);
        OnLineMicInfo build = new OnLineMicInfo.Builder().build();
        U7B u7b = new U7B();
        u7b.LIZ = u7t.LLZL();
        u7b.LIZIZ = u7t.LJIIJ;
        u7b.LIZJ = C51029K0z.LJJIIZI(new OSZ(Long.valueOf(u7t.LJIILIIL), build));
        U7A u7a = new U7A(u7b);
        u7t.LJIIIZ.LJIIIZ("leave_normally");
        Iterator<InterfaceC76675U7j> it2 = u7t.LJIIIIZZ.iterator();
        while (it2.hasNext()) {
            it2.next().LJIJI(u7t, u7a);
        }
        LinkMicCommonResp linkMicCommonResp = linkMicUplinkBaseResp.commonResp;
        if (linkMicCommonResp != null) {
            map = linkMicCommonResp.extra;
        }
        return new LeaveChannelResult(map, null, 0L, 6, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object apply$11(IDhS106S0100000_13 iDhS106S0100000_13, Object obj) {
        BaseResponse it = (BaseResponse) obj;
        o.LJIIIZ(it, "it");
        C32014ChO.LJFF(U7T.LJJJJIZL(709), "destroyChannel deal in background thread");
        U7T u7t = (U7T) iDhS106S0100000_13.l0;
        String LJJJJI = U7T.LJJJJI(1588);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onDestroyChannelSucceeded start cur channel id ");
        C72972SkS.LJI(LIZ, u7t.LJI, LIZ, LJJJJI);
        LinkMicUplinkBaseResp linkMicUplinkBaseResp = (LinkMicUplinkBaseResp) it.data;
        Map<String, byte[]> map = null;
        if (linkMicUplinkBaseResp == null) {
            return null;
        }
        u7t.LJJJLL(0);
        LinkMicCommonResp linkMicCommonResp = linkMicUplinkBaseResp.commonResp;
        if (linkMicCommonResp != null) {
            map = linkMicCommonResp.extra;
        }
        return new DestroyChannelResult(map);
    }

    public static final Object apply$12(IDhS106S0100000_13 iDhS106S0100000_13, Object obj) {
        R2P<CreateChannelResponse> it = (R2P) obj;
        o.LJIIIZ(it, "it");
        return ((U7T) iDhS106S0100000_13.l0).LJJJJJL(it);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object apply$13(IDhS106S0100000_13 iDhS106S0100000_13, Object obj) {
        BaseResponse it = (BaseResponse) obj;
        o.LJIIIZ(it, "it");
        U7T u7t = (U7T) iDhS106S0100000_13.l0;
        String LJJJJI = U7T.LJJJJI(1818);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onChangeLayoutSucceeded start cur channel id ");
        C72972SkS.LJI(LIZ, u7t.LJI, LIZ, LJJJJI);
        ChangeLayoutResp changeLayoutResp = (ChangeLayoutResp) it.data;
        Map<String, byte[]> map = null;
        if (changeLayoutResp == null) {
            return null;
        }
        U7B u7b = new U7B();
        u7b.LIZ = u7t.LLZL();
        u7b.LIZIZ = u7t.LJIIJ;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        List<UserPosition> list = changeLayoutResp.userPosition;
        if (list != null) {
            for (UserPosition userPosition : list) {
                OnLineMicInfo LIZLLL = U7V.LIZLLL(userPosition.position);
                if (LIZLLL != null) {
                    linkedHashMap.put(Long.valueOf(userPosition.uid), LIZLLL);
                }
            }
        }
        u7b.LIZJ = linkedHashMap;
        U7A u7a = new U7A(u7b);
        Iterator<InterfaceC76675U7j> it2 = u7t.LJIIIIZZ.iterator();
        while (it2.hasNext()) {
            it2.next().LJJIJ(u7t, u7a);
        }
        LinkMicCommonResp linkMicCommonResp = changeLayoutResp.commonResp;
        if (linkMicCommonResp != null) {
            map = linkMicCommonResp.extra;
        }
        return new ChangeMaxPositionResult(map);
    }

    public static final Object apply$14(IDhS106S0100000_13 iDhS106S0100000_13, Object obj) {
        ExchangeThresholdInfoData it = (ExchangeThresholdInfoData) obj;
        o.LJIIIZ(it, "it");
        ((LiveIncomeExchangeDialogVMV2) iDhS106S0100000_13.l0).hv0("wallet_exchange_threshold_info_duration");
        if (it.shouldCollectBillingAddress) {
            return C77476Uau.LIZ().LJ();
        }
        return null;
    }

    public static final Object apply$15(IDhS106S0100000_13 iDhS106S0100000_13, Object it) {
        o.LJIIIZ(it, "it");
        return AbstractC73635Sv9.LJ(new C76653U6n((C76651U6l) iDhS106S0100000_13.l0));
    }

    public static final Object apply$16(IDhS106S0100000_13 iDhS106S0100000_13, Object response) {
        o.LJIIIZ(response, "response");
        C77536Ubs c77536Ubs = new C77536Ubs();
        ((C77537Ubt) iDhS106S0100000_13.l0).LIZ = c77536Ubs;
        return c77536Ubs;
    }

    public static final Object apply$17(IDhS106S0100000_13 iDhS106S0100000_13, Object obj) {
        Throwable throwable = (Throwable) obj;
        o.LJIIIZ(throwable, "throwable");
        C77536Ubs c77536Ubs = new C77536Ubs();
        c77536Ubs.LIZ = throwable;
        if ((throwable instanceof C276516r) && CustomErrorExtra.getCustomErrorExtra((Exception) throwable) != null) {
            ((C77537Ubt) iDhS106S0100000_13.l0).LIZ = c77536Ubs;
        }
        return AbstractC73672Svk.LJJIJIL(c77536Ubs);
    }

    public static final Object apply$18(IDhS106S0100000_13 iDhS106S0100000_13, Object it) {
        o.LJIIIZ(it, "it");
        U9F u9f = ((U7U) iDhS106S0100000_13.l0).LJFF;
        if (u9f != null) {
            return u9f.LJJIJL();
        }
        return null;
    }

    public static final Object apply$2(IDhS106S0100000_13 iDhS106S0100000_13, Object obj) {
        Throwable th = (Throwable) obj;
        if (th instanceof C29401Dk) {
            return AbstractC73672Svk.LJJI(th);
        }
        C77156UPw c77156UPw = (C77156UPw) iDhS106S0100000_13.l0;
        int i = c77156UPw.LJLILLLLZI;
        if (i <= 1) {
            c77156UPw.LJLILLLLZI = i + 1;
            return c77156UPw.LJLIL.LJJIFFI(C38901fq.LJLJI);
        }
        return AbstractC73672Svk.LJJI(th);
    }

    public static final Object apply$3(IDhS106S0100000_13 iDhS106S0100000_13, Object obj) {
        Throwable it = (Throwable) obj;
        o.LJIIIZ(it, "it");
        ((C58528My4) iDhS106S0100000_13.l0).getClass();
        UIO.LIZIZ("ttlive_wallet_recharge_query_iap_currency", it);
        C0NB.LJI("CurrencyQueryTask", it);
        return "";
    }

    public static final Object apply$4(IDhS106S0100000_13 iDhS106S0100000_13, Object obj) {
        Throwable th = (Throwable) obj;
        C77287UUx c77287UUx = (C77287UUx) iDhS106S0100000_13.l0;
        int i = c77287UUx.LJLJI;
        if (i < C77287UUx.LJLJJI) {
            c77287UUx.LJLJI = i + 1;
            if (th instanceof C0TL) {
                String valueOf = String.valueOf(((C0TL) th).statusCode);
                o.LJIIIZ(valueOf, "<set-?>");
                c77287UUx.LJLILLLLZI = valueOf;
            } else if (th instanceof C64799Pbv) {
                String valueOf2 = String.valueOf(((C64799Pbv) th).getCronetInternalErrorCode());
                o.LJIIIZ(valueOf2, "<set-?>");
                c77287UUx.LJLILLLLZI = valueOf2;
            }
            return ((C77287UUx) iDhS106S0100000_13.l0).LJLIL.LJJIFFI(C78939UyV.LJLIL);
        }
        return AbstractC73672Svk.LJJI(th);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object apply$5(IDhS106S0100000_13 iDhS106S0100000_13, Object obj) {
        BaseResponse it = (BaseResponse) obj;
        o.LJIIIZ(it, "it");
        C32014ChO.LJFF(U7T.LJJJJIZL(1524), "moderatorKickOut deal in background thread");
        LinkMicUplinkBaseResp linkMicUplinkBaseResp = (LinkMicUplinkBaseResp) it.data;
        Map<String, byte[]> map = null;
        if (linkMicUplinkBaseResp == null) {
            return null;
        }
        LinkMicCommonResp linkMicCommonResp = linkMicUplinkBaseResp.commonResp;
        if (linkMicCommonResp != null) {
            map = linkMicCommonResp.extra;
        }
        return new KickOutResult(map);
    }

    public static final Object apply$6(IDhS106S0100000_13 iDhS106S0100000_13, Object it) {
        long j;
        o.LJIIIZ(it, "it");
        C65814PsI.LIZ().getClass();
        LinkMicApi linkMicApi = (LinkMicApi) C65814PsI.LIZJ(LinkMicApi.class);
        RechargeReq rechargeReq = new RechargeReq();
        U7T u7t = (U7T) iDhS106S0100000_13.l0;
        rechargeReq.channelId = u7t.LJI;
        rechargeReq.common = U7T.LJJIJIL(u7t, "compensate_invite_message", 2);
        rechargeReq.myself = new Player(u7t.LJIL, u7t.LJIILIIL);
        long j2 = u7t.LJIL;
        Room room = u7t.LJ;
        if (room != null) {
            j = room.getOwnerUserId();
        } else {
            j = -1;
        }
        rechargeReq.target = new Player(j2, j);
        rechargeReq.type = 1;
        return linkMicApi.recharge(rechargeReq);
    }

    public static final Object apply$7(IDhS106S0100000_13 iDhS106S0100000_13, Object obj) {
        R2P<CreateChannelResponse> it = (R2P) obj;
        o.LJIIIZ(it, "it");
        return ((U7T) iDhS106S0100000_13.l0).LJJJJJL(it);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object apply$8(IDhS106S0100000_13 iDhS106S0100000_13, Object obj) {
        BaseResponse it = (BaseResponse) obj;
        o.LJIIIZ(it, "it");
        C32014ChO.LJFF(U7T.LJJJJIZL(1021), "moderatorPermitApply deal in background thread");
        PermitResponse permitResponse = (PermitResponse) it.data;
        Map<String, byte[]> map = null;
        if (permitResponse == null) {
            return null;
        }
        OnLineMicInfo LIZLLL = U7V.LIZLLL(permitResponse.position);
        if (LIZLLL == null) {
            LIZLLL = new OnLineMicInfo.Builder().build();
        }
        LinkMicCommonResp linkMicCommonResp = permitResponse.commonResp;
        if (linkMicCommonResp != null) {
            map = linkMicCommonResp.extra;
        }
        return new PermitResult(LIZLLL, map, null, 4, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object apply$9(IDhS106S0100000_13 iDhS106S0100000_13, Object obj) {
        Map<String, byte[]> map;
        BaseResponse it = (BaseResponse) obj;
        o.LJIIIZ(it, "it");
        U7T u7t = (U7T) iDhS106S0100000_13.l0;
        String LJJJJI = U7T.LJJJJI(1766);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onCancelApplySucceeded start cur channel id ");
        C72972SkS.LJI(LIZ, u7t.LJI, LIZ, LJJJJI);
        LinkMicUplinkBaseResp linkMicUplinkBaseResp = (LinkMicUplinkBaseResp) it.data;
        String str = null;
        Object[] objArr = 0;
        if (linkMicUplinkBaseResp == null) {
            return null;
        }
        u7t.LJJJLL(1);
        Iterator<InterfaceC76675U7j> it2 = u7t.LJIIIIZZ.iterator();
        while (it2.hasNext()) {
            it2.next().LJIILJJIL(u7t);
        }
        LinkMicCommonResp linkMicCommonResp = linkMicUplinkBaseResp.commonResp;
        if (linkMicCommonResp != null) {
            map = linkMicCommonResp.extra;
        } else {
            map = null;
        }
        return new CancelApplyResult(map, str, 2, objArr == true ? 1 : 0);
    }
}
