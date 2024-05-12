package X;

import Y.AfS24S0400000_13;
import Y.AfS2S0300100_13;
import Y.AfS4S1200100_13;
import Y.AfS62S0200000_13;
import Y.IDhS72S0200000_13;
import android.app.Activity;
import android.os.SystemClock;
import com.bytedance.android.live.gift.IGiftService;
import com.bytedance.android.live.network.response.BaseResponse;
import com.bytedance.android.live.wallet.api.IapApi;
import com.bytedance.android.live.wallet.data.api.IRechargeApi;
import com.bytedance.android.live.wallet.data.recharge.CreateOrderExtra;
import com.bytedance.android.live.wallet.model.DiamondBuyResult;
import com.bytedance.android.livesdk.wallet.Diamond;
import com.bytedance.globalpayment.iap.model.IapPaymentMethod;
import com.bytedance.globalpayment.service.manager.iap.IapExternalService;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.ss.android.deviceregister.DeviceRegisterManager;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.TimeZone;
import kotlin.jvm.internal.IDqS187S0200000_13;
import kotlin.jvm.internal.o;
import tikcast.api.wallet.tiktok.DiamondBuyRequestParams;

/* renamed from: X.Uf1, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C77731Uf1 implements InterfaceC31557Ca1 {
    public static final C77731Uf1 LIZ = new C77731Uf1();

    @Override // X.InterfaceC31557Ca1
    public final void init() {
        C78257UnV c78257UnV = C78257UnV.LIZ;
        synchronized (c78257UnV) {
            if (!C78257UnV.LJ || !C78253UnR.LJFF().hasInitEd()) {
                String did = DeviceRegisterManager.com_ss_android_deviceregister_DeviceRegisterManager_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getDeviceId();
                if (C38354F3m.LJ(did)) {
                    c78257UnV.LIZ();
                } else {
                    o.LJIIIIZZ(did, "did");
                    C78257UnV.LIZIZ(did);
                }
            }
        }
        C78253UnR.LJFF().addIapObserver(C77738Uf8.LIZ);
        C78253UnR.LJFF().addIapObserver(C77734Uf4.LIZJ);
    }

    @Override // X.InterfaceC31557Ca1
    public final void LIZLLL() {
        C77630UdO.LIZJ();
    }

    @Override // X.InterfaceC31557Ca1
    public final void LJ(List<String> productIdList, InterfaceC77737Uf7 interfaceC77737Uf7) {
        IapPaymentMethod iapPaymentMethod;
        o.LJIIIZ(productIdList, "productIdList");
        if (C77608Ud2.LIZIZ()) {
            iapPaymentMethod = IapPaymentMethod.AMAZON;
        } else {
            iapPaymentMethod = IapPaymentMethod.GOOGLE;
        }
        ArrayList arrayList = new ArrayList();
        for (String str : productIdList) {
            if (str.length() != 0) {
                arrayList.add(str);
            }
        }
        if (C79004UzY.LJJIFFI(arrayList)) {
            C78609UtB.LJJJLIIL(20, -1, "ttlive_query_pipo_purchase", "query pipo product id list empty");
            LJIIJJI(this, interfaceC77737Uf7, 1, 20, -1, "ttlive_query_pipo_purchase", new Exception("query pipo product id list empty"), null, null, 0, 448);
        } else {
            IapExternalService LJFF = C78253UnR.LJFF();
            if (interfaceC77737Uf7 != null) {
                interfaceC77737Uf7.LJIJJLI();
            }
            LJFF.queryProductDetails(iapPaymentMethod, arrayList, "", new C77733Uf3(interfaceC77737Uf7));
        }
    }

    @Override // X.InterfaceC31557Ca1
    public final void LJI(List<String> list, InterfaceC77737Uf7 interfaceC77737Uf7) {
        IapPaymentMethod iapPaymentMethod;
        if (C77608Ud2.LIZIZ()) {
            iapPaymentMethod = IapPaymentMethod.AMAZON;
        } else {
            iapPaymentMethod = IapPaymentMethod.GOOGLE;
        }
        ArrayList arrayList = new ArrayList();
        for (String str : list) {
            if (str.length() != 0) {
                arrayList.add(str);
            }
        }
        if (C79004UzY.LJJIFFI(arrayList)) {
            C78609UtB.LJJJLIIL(20, -1, "ttlive_fetch_subscription_products", "query pipo product id list empty");
            LJIIJJI(this, interfaceC77737Uf7, 4, 20, -1, "ttlive_fetch_subscription_products", new Exception("query pipo product id list empty"), null, null, 0, 448);
        } else {
            IapExternalService LJFF = C78253UnR.LJFF();
            if (interfaceC77737Uf7 != null) {
                interfaceC77737Uf7.LJIJJLI();
            }
            LJFF.querySubscriptionDetails(iapPaymentMethod, arrayList, "", new C77733Uf3(interfaceC77737Uf7));
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(40:8|(2:(2:11|(2:13|(1:15)(1:99))(1:100))(1:101)|16)(1:102)|17|(1:19)|20|(1:22)|23|24|25|(2:27|(30:29|30|31|(1:33)|34|(1:36)|37|38|39|40|41|42|43|(1:45)|46|(1:48)|49|(3:51|(1:53)|79)(4:80|(2:82|(1:88)(2:86|55))|90|79)|56|(1:58)|59|(1:61)|62|(1:64)|65|(1:78)(1:71)|72|(1:74)|75|(1:77)))|97|31|(0)|34|(0)|37|38|39|40|41|42|43|(0)|46|(0)|49|(0)(0)|56|(0)|59|(0)|62|(0)|65|(2:67|69)|78|72|(0)|75|(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00f4, code lost:
    
        if (r0.hasTransport(4) == true) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x00af, code lost:
    
        r2 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x00b0, code lost:
    
        r5 = com.ss.android.ugc.aweme.feed.model.CardStruct.IStatusCode.DEFAULT;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x00ad, code lost:
    
        r2 = false;
     */
    /* JADX WARN: Removed duplicated region for block: B:33:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0146  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJIIIZ(android.app.Activity r9, X.C77874UhK r10, X.InterfaceC77737Uf7 r11) {
        /*
            Method dump skipped, instructions count: 364
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C77731Uf1.LJIIIZ(android.app.Activity, X.UhK, X.Uf7):void");
    }

    public static void LJIIL(InterfaceC77737Uf7 interfaceC77737Uf7, int i, C31556Ca0 c31556Ca0) {
        if (interfaceC77737Uf7 != null) {
            interfaceC77737Uf7.LJIIIIZZ(c31556Ca0);
        }
        if (i != 3) {
            if (i != 6) {
                if (i != 7 || interfaceC77737Uf7 == null) {
                    return;
                }
                interfaceC77737Uf7.LJIILJJIL(c31556Ca0);
                return;
            }
            if (interfaceC77737Uf7 == null) {
                return;
            }
            interfaceC77737Uf7.LJIL(c31556Ca0);
            return;
        }
        if (interfaceC77737Uf7 == null) {
            return;
        }
        interfaceC77737Uf7.LJIILLIIL(c31556Ca0);
    }

    @Override // X.InterfaceC31557Ca1
    public final void LJFF(String toUid, String orderId, InterfaceC77737Uf7 interfaceC77737Uf7) {
        o.LJIIIZ(toUid, "toUid");
        o.LJIIIZ(orderId, "orderId");
        C76732zl c76732zl = new C76732zl();
        long uptimeMillis = SystemClock.uptimeMillis();
        HashMap LIZ2 = C45243HpH.LIZ("orderId", orderId, "to_uid", toUid);
        C1EW.LIZ(((IapApi) Q7L.LIZIZ(IapApi.class)).checkSubOrder(toUid, orderId)).LJJIII(new IDhS72S0200000_13(c76732zl, interfaceC77737Uf7, 0), false).LJJJJL(new UYK(3, 2000L)).LJJJLIIL(new AfS4S1200100_13(LIZ2, uptimeMillis, orderId, interfaceC77737Uf7, 0), new C77735Uf5(LIZ2, uptimeMillis, orderId, interfaceC77737Uf7, c76732zl));
    }

    @Override // X.InterfaceC31557Ca1
    public final void LIZJ(String str, String str2, int i, InterfaceC77737Uf7 interfaceC77737Uf7) {
        long uptimeMillis = SystemClock.uptimeMillis();
        C1EW.LIZ(((IRechargeApi) Q7L.LIZIZ(IRechargeApi.class)).checkOrderResult(str2)).LJIJJLI(C77740UfA.LJLIL).LJJJJL(new UYK(3, 1000L)).LJJJLIIL(new C77730Uf0(uptimeMillis, str, str2, i, interfaceC77737Uf7), new C77736Uf6(uptimeMillis, str, str2, interfaceC77737Uf7));
    }

    public final void LJIIJ(InterfaceC77737Uf7 interfaceC77737Uf7, int i, int i2, Throwable th, String str) {
        if (th instanceof Exception) {
            LJIIJJI(this, interfaceC77737Uf7, i, 31, i2, "ttlive_wallet_create_order", (Exception) th, str, null, 0, 384);
        }
    }

    /* JADX WARN: Type inference failed for: r13v0, types: [T, X.Yns, X.UbW] */
    @Override // X.InterfaceC31557Ca1
    public final void LIZIZ(Activity activity, Diamond diamond, InterfaceC77737Uf7 interfaceC77737Uf7, int i, Boolean bool, List<String> list, String str, String str2) {
        int i2;
        String str3 = str;
        if (diamond.LJLJJL != null && C77608Ud2.LIZIZ()) {
            i2 = 6;
        } else {
            i2 = 3;
        }
        C68322mC c68322mC = new C68322mC();
        ?? c77514UbW = new C77514UbW(i, activity, diamond, interfaceC77737Uf7, i2, bool, c68322mC, list, str3, str2);
        c68322mC.element = c77514UbW;
        String str4 = "";
        if (str3 == null) {
            str3 = "";
        }
        if (str2 != null) {
            str4 = str2;
        }
        LJIIIIZZ(activity, diamond, interfaceC77737Uf7, "", i2, i, 0, 0, bool, false, "", null, c77514UbW, list, str3, str4);
    }

    @Override // X.InterfaceC31557Ca1
    public final void LJII(int i, int i2, int i3, int i4, ActivityC45651qj activityC45651qj, C77766Ufa c77766Ufa, Diamond diamond, String orderId) {
        o.LJIIIZ(orderId, "orderId");
        LJIIIIZZ(activityC45651qj, diamond, c77766Ufa, orderId, i, i2, i3, i4, null, false, "", new IDqS187S0200000_13(diamond, c77766Ufa, 0), new C77515UbX(i2, i, i3, i4, activityC45651qj, c77766Ufa, diamond, orderId), null, "", String.valueOf(i2));
    }

    @Override // X.InterfaceC31557Ca1
    public final void LIZ(ActivityC45651qj activityC45651qj, String toUid, String tplId, String skuName, java.util.Map map, InterfaceC77737Uf7 interfaceC77737Uf7, String subscribeType, String offerId, String offerToken) {
        o.LJIIIZ(toUid, "toUid");
        o.LJIIIZ(tplId, "tplId");
        o.LJIIIZ(skuName, "skuName");
        o.LJIIIZ(subscribeType, "subscribeType");
        o.LJIIIZ(offerId, "offerId");
        o.LJIIIZ(offerToken, "offerToken");
        long uptimeMillis = SystemClock.uptimeMillis();
        HashMap LIZ2 = C45243HpH.LIZ("tpl_id", tplId, "sku_name", skuName);
        LIZ2.put("is_subscription", Boolean.TRUE);
        LIZ2.put("subscribe_type", subscribeType);
        C65814PsI.LIZ().getClass();
        C1EW.LIZ(((IapApi) C65814PsI.LIZJ(IapApi.class)).subscribeOrder(toUid, tplId, skuName, TimeZone.getDefault().getID(), offerId, offerToken, map)).LJJJLIIL(new AfS2S0300100_13(uptimeMillis, interfaceC77737Uf7, LIZ2, activityC45651qj, 1), new AfS62S0200000_13(interfaceC77737Uf7, LIZ2, 4));
    }

    public static void LJIIJJI(C77731Uf1 c77731Uf1, InterfaceC77737Uf7 interfaceC77737Uf7, int i, int i2, int i3, String str, Exception exc, String str2, String str3, int i4, int i5) {
        int i6 = i4;
        String str4 = str2;
        String str5 = "";
        if ((i5 & 64) != 0) {
            str4 = "";
        }
        if ((i5 & 128) == 0) {
            str5 = str3;
        }
        if ((i5 & 256) != 0) {
            i6 = 0;
        }
        c77731Uf1.getClass();
        C77623UdH c77623UdH = new C77623UdH(i, i2, i3, str, exc, str4, str5, i6);
        String valueOf = String.valueOf(i2);
        String valueOf2 = String.valueOf(i3);
        String message = exc.getMessage();
        if (C77640UdY.LIZ) {
            C77630UdO.LJIIIIZZ(valueOf, valueOf2, message);
        }
        if (interfaceC77737Uf7 != null) {
            interfaceC77737Uf7.LIZIZ(i, c77623UdH);
        }
        switch (i) {
            case -1:
                if (interfaceC77737Uf7 == null) {
                    return;
                }
                interfaceC77737Uf7.LJIIZILJ(i, c77623UdH);
                return;
            case 0:
            default:
                return;
            case 1:
                if (interfaceC77737Uf7 == null) {
                    return;
                }
                interfaceC77737Uf7.LJFF(i, c77623UdH);
                return;
            case 2:
                if (interfaceC77737Uf7 == null) {
                    return;
                }
                interfaceC77737Uf7.LJIIZILJ(i, c77623UdH);
                return;
            case 3:
                if (interfaceC77737Uf7 == null) {
                    return;
                }
                interfaceC77737Uf7.LJIJI(i, c77623UdH);
                return;
            case 4:
                if (interfaceC77737Uf7 == null) {
                    return;
                }
                interfaceC77737Uf7.LJI(c77623UdH);
                return;
            case 5:
                if (interfaceC77737Uf7 == null) {
                    return;
                }
                interfaceC77737Uf7.LJIIL(c77623UdH);
                return;
            case 6:
                if (interfaceC77737Uf7 == null) {
                    return;
                }
                interfaceC77737Uf7.LIZ(c77623UdH);
                return;
            case 7:
                if (interfaceC77737Uf7 == null) {
                    return;
                }
                interfaceC77737Uf7.LJIJJ(c77623UdH);
                return;
            case 8:
                if (interfaceC77737Uf7 == null) {
                    return;
                }
                interfaceC77737Uf7.LIZ(c77623UdH);
                return;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r33v1, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r33v3 */
    /* JADX WARN: Type inference failed for: r33v4 */
    public static void LJIIIIZZ(Activity activity, Diamond diamond, InterfaceC77737Uf7 interfaceC77737Uf7, String str, int i, int i2, int i3, int i4, Boolean bool, boolean z, String str2, IDqS187S0200000_13 iDqS187S0200000_13, InterfaceC88472Yns interfaceC88472Yns, List list, String str3, String str4) {
        boolean z2;
        ?? r33;
        Boolean bool2;
        String str5;
        boolean z3;
        AbstractC73672Svk<BaseResponse<DiamondBuyResult, CreateOrderExtra>> createOrder;
        long uptimeMillis = SystemClock.uptimeMillis();
        if (i == 7) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (bool != null) {
            r33 = bool.booleanValue();
        } else {
            r33 = ((IGiftService) CN1.LIZ(IGiftService.class)).isFirstRecharge();
        }
        if (list != null) {
            bool2 = Boolean.valueOf(!list.isEmpty());
        } else {
            bool2 = null;
        }
        if (C29306Beo.LJJIFFI(bool2)) {
            str5 = GsonProtectorUtils.toJson(C09650Zl.LIZIZ, list);
            o.LJIIIIZZ(str5, "get().toJson(voucherList)");
        } else {
            str5 = "";
        }
        DiamondBuyRequestParams diamondBuyRequestParams = new DiamondBuyRequestParams();
        diamondBuyRequestParams.voucherTokenList = str5;
        if (z2) {
            C65814PsI.LIZ().getClass();
            createOrder = ((IRechargeApi) C65814PsI.LIZIZ(IRechargeApi.class)).createOrder(i, diamond.id, diamond.LJLILLLLZI, diamond.LJLJI, false, i2, str, i3, i4, z, str2, false, str5);
        } else if (diamond.LJLJJL != null && C77608Ud2.LIZIZ()) {
            IRechargeApi iRechargeApi = (IRechargeApi) Q7L.LIZIZ(IRechargeApi.class);
            int i5 = diamond.id;
            String str6 = diamond.LJLILLLLZI;
            long j = diamond.LJLJI;
            C77745UfF c77745UfF = diamond.LJLJJL;
            createOrder = iRechargeApi.createAmazonOrder(6, i5, str6, j, c77745UfF.LJLILLLLZI, c77745UfF.LJLIL, i2, str, i3, i4, z, str2, str5);
        } else {
            C65814PsI.LIZ().getClass();
            IRechargeApi iRechargeApi2 = (IRechargeApi) C65814PsI.LIZIZ(IRechargeApi.class);
            int i6 = diamond.id;
            String str7 = diamond.LJLILLLLZI;
            long j2 = diamond.LJLJI;
            if (r33 == 0 || !diamond.LJLJJLL.booleanValue()) {
                z3 = true;
            } else {
                z3 = false;
            }
            createOrder = iRechargeApi2.createOrder(3, i6, str7, j2, r33, i2, str, i3, i4, z, str2, z3, str5);
        }
        HashMap hashMap = new HashMap();
        hashMap.put("is_first_recharge", Integer.valueOf((int) r33));
        hashMap.put("is_subscription", 0);
        C1EW.LIZ(createOrder).LJJJLIIL(new C77732Uf2(hashMap, uptimeMillis, interfaceC77737Uf7, diamond, iDqS187S0200000_13, z2, diamondBuyRequestParams, str4, bool, str3, activity), new AfS24S0400000_13(hashMap, interfaceC88472Yns, interfaceC77737Uf7, diamond, 0));
    }
}
