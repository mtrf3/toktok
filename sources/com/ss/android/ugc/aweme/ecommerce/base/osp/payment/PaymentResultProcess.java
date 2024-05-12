package com.ss.android.ugc.aweme.ecommerce.base.osp.payment;

import X.AbstractActivityC60177NjZ;
import X.ActivityC45651qj;
import X.C113554cx;
import X.C19N;
import X.C26867AgZ;
import X.C27491Aqd;
import X.C27739Aud;
import X.C28068Azw;
import X.C32364Cn2;
import X.C45243HpH;
import X.C45804HyK;
import X.C5S1;
import X.C63081OpJ;
import X.C71058Rug;
import X.C73969T1h;
import X.C76542zS;
import X.C76800UCe;
import X.E94;
import X.EF7;
import X.EO3;
import X.EO4;
import X.ExecutorC142245i8;
import X.FKM;
import X.InterfaceC40159FpT;
import X.InterfaceC63764P0u;
import X.InterfaceC65784Pro;
import X.InterfaceC88472Yns;
import X.InterfaceC88474Ynu;
import X.ORY;
import X.ORZ;
import X.OSZ;
import X.SA3;
import X.SA8;
import X.T16;
import X.X1D;
import Y.ARunnableS10S1000000_4;
import Y.AfS55S0200000_6;
import Y.AfS58S0100000_6;
import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.app.host.AwemeHostApplication;
import com.ss.android.ugc.aweme.bullet.api.IBulletService;
import com.ss.android.ugc.aweme.bullet.impl.BulletService;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethodInfo;
import com.ss.android.ugc.aweme.ecommerce.base.payment.api.PaymentApi;
import com.ss.android.ugc.aweme.ecommerce.base.payment.dto.Cashier;
import com.ss.android.ugc.aweme.ecommerce.base.payment.dto.PipoTokenInfo;
import com.ss.android.ugc.aweme.ecommerce.eventcenter.EventCenter;
import com.ss.android.ugc.aweme.ecommerce.service.IEventCenter;
import com.ss.android.ugc.aweme.utils.ActivityStack;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.AqS12S1110000_12;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class PaymentResultProcess {
    public static InterfaceC63764P0u listener;
    public static final PaymentResultProcess INSTANCE = new PaymentResultProcess();
    public static final AtomicBoolean deeplinkOrder = new AtomicBoolean(false);
    public static final boolean useSpark = C19N.LJ("ec_pay_result_use_spark", false);

    public final ActivityC45651qj getTopWebContainerActivity() {
        Activity[] activities = ActivityStack.getActivityStack();
        o.LJIIIIZZ(activities, "activities");
        if ((ORY.LJJJLZIJ(activities) instanceof InterfaceC40159FpT) && (ORY.LJJJLZIJ(activities) instanceof ActivityC45651qj)) {
            Object LJJJLZIJ = ORY.LJJJLZIJ(activities);
            o.LJII(LJJJLZIJ, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
            return (ActivityC45651qj) LJJJLZIJ;
        }
        if (ORY.LJJJLZIJ(activities) instanceof AbstractActivityC60177NjZ) {
            Object LJJJLZIJ2 = ORY.LJJJLZIJ(activities);
            o.LJII(LJJJLZIJ2, "null cannot be cast to non-null type com.bytedance.ies.bullet.ui.common.AbsBulletContainerActivity");
            return (ActivityC45651qj) LJJJLZIJ2;
        }
        return null;
    }

    public final AtomicBoolean getDeeplinkOrder() {
        return deeplinkOrder;
    }

    public final String getDeepLink(String str) {
        o.LJIIIZ(str, "<this>");
        Uri parse = UriProtector.parse("snssdk1180://ec/order/middle_page");
        o.LJIIIIZZ(parse, "Uri.parse(this)");
        Uri.Builder LIZIZ = C45804HyK.LIZIZ(parse, new OSZ("url", str));
        if (C19N.LJ("ecom_deep_link_spark", false)) {
            C45804HyK.LIZJ(LIZIZ, new OSZ("use_spark", "1"));
        }
        return String.valueOf(LIZIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01ce  */
    /* JADX WARN: Type inference failed for: r11v0, types: [java.lang.Object, java.lang.Object[], android.app.Activity[]] */
    /* JADX WARN: Type inference failed for: r1v28 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.OSZ<java.lang.String, java.lang.Object>[] getMallParams$ecommerce_transaction_release(java.util.Map<java.lang.String, java.lang.Object> r17) {
        /*
            Method dump skipped, instructions count: 634
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.base.osp.payment.PaymentResultProcess.getMallParams$ecommerce_transaction_release(java.util.Map):X.OSZ[]");
    }

    /* JADX WARN: Removed duplicated region for block: B:243:0x057d  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x05ae  */
    /* JADX WARN: Removed duplicated region for block: B:248:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:249:0x05b3  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x05b6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void payResultProcess(X.SA3 r38) {
        /*
            Method dump skipped, instructions count: 1612
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.base.osp.payment.PaymentResultProcess.payResultProcess(X.SA3):void");
    }

    public final String sourceToPageName(String str) {
        int hashCode = str.hashCode();
        if (hashCode != -1747807002) {
            if (hashCode != -390864660) {
                if (hashCode == 2103471391 && str.equals("orderdetail")) {
                    return "order_detail";
                }
            } else if (str.equals("orderlist")) {
                return "ecommerce_centre_page";
            }
        } else if (str.equals("ordersubmit")) {
            return "order_submit";
        }
        return "";
    }

    public static final void payResultProcess$handleSucceed(String str, Context context) {
        String it = C26867AgZ.LIZLLL(str, C45243HpH.LIZ("payment_status", "success", "pay_route", "h5")).toString();
        IBulletService LIZ = BulletService.LIZ();
        o.LJIIIIZZ(it, "it");
        LIZ.LJIIIIZZ(context, it);
    }

    public final String getOrderDetailDeepLink(PaymentInfo paymentInfo, Map<String, ? extends Object> map) {
        String builder = C26867AgZ.LIZLLL("snssdk1180://ec/order/detail", C113554cx.LJJJLZIJ(new OSZ("url", getOrderDetailPageUrl(null, null, paymentInfo, true)))).toString();
        o.LJIIIIZZ(builder, "RouterUtils.createUrlNoN…Url\n        )).toString()");
        return builder;
    }

    private final void getPaymentAuth(String str, InterfaceC88474Ynu<? super String, ? super String, ? super String, ? super String, C76800UCe> interfaceC88474Ynu, InterfaceC88472Yns<? super Throwable, C76800UCe> interfaceC88472Yns) {
        String str2;
        String str3;
        String str4;
        PipoTokenInfo pipoTokenInfo = EO3.LIZIZ;
        String str5 = null;
        if (pipoTokenInfo != null) {
            str2 = pipoTokenInfo.token;
            str3 = pipoTokenInfo.host;
        } else {
            str2 = null;
            str3 = null;
        }
        Cashier cashier = EO3.LIZ;
        if (cashier != null) {
            str4 = cashier.merchantId;
            str5 = cashier.merchantUserId;
        } else {
            str4 = null;
        }
        if (str2 == null || str3 == null || str4 == null || str5 == null) {
            EO4 eo4 = PaymentApi.LIZ;
            Boolean bool = Boolean.TRUE;
            eo4.getClass();
            EO4.LIZ(bool, str).LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ()).LJJJLIIL(new AfS55S0200000_6(interfaceC88472Yns, interfaceC88474Ynu, 0), new AfS58S0100000_6(interfaceC88472Yns, (InterfaceC88472Yns<? super Throwable, C76800UCe>) 0));
            return;
        }
        interfaceC88474Ynu.invoke(str2, str3, str4, str5);
    }

    public static final void payResultProcess$openOrderDetail(String str, List<String> list, SA3 sa3) {
        String str2;
        IBulletService LIZ = BulletService.LIZ();
        AwemeHostApplication LIZ2 = FKM.LIZ();
        PaymentResultProcess paymentResultProcess = INSTANCE;
        if (list != null) {
            str2 = (String) ORZ.LJLLLL(list);
        } else {
            str2 = null;
        }
        LIZ.LJIIIIZZ(LIZ2, paymentResultProcess.getOrderDetailPageUrl(str, str2, sa3.LJI, true));
    }

    public static final void payResultProcess$handlePending(String str, String str2, List<String> list, Context context) {
        if (o.LJ(str, "ordersubmit")) {
            PaymentResult paymentResult = new PaymentResult("pending", null);
            if (C19N.LJ("ecom_order_detail_roma_short_link", false)) {
                E94 LLL = C63081OpJ.LLL(str2);
                LLL.LJII(3, C113554cx.LJJLIIIIJ(new OSZ("pay_route", "h5"), new OSZ("pay_result", C27739Aud.LJI(paymentResult))));
                BulletService.LIZ().LJIIIIZZ(context, LLL.LIZ());
                return;
            }
            HashMap hashMap = new HashMap();
            hashMap.put("pay_route", "h5");
            hashMap.put("pay_result", paymentResult);
            String it = C26867AgZ.LIZLLL(str2, hashMap).toString();
            IBulletService LIZ = BulletService.LIZ();
            o.LJIIIIZZ(it, "it");
            LIZ.LJIIIIZZ(context, it);
            return;
        }
        IEventCenter LJ = EventCenter.LJ();
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("{orderId: ");
        LIZ2.append(list);
        LIZ2.append('}');
        LJ.LIZ("ec_refresh_order", X1D.LIZIZ(LIZ2));
    }

    public static final void payResultProcess$logPayRouteResult(SA3 sa3, String str, boolean z, String str2) {
        C76542zS.LIZJ("tiktokec_payroute_result", new AqS12S1110000_12(sa3, str, z, 0));
    }

    public final String getOrderDetailPageUrl(String str, String str2, PaymentInfo paymentInfo, boolean z) {
        String str3;
        String str4;
        PaymentMethod paymentMethod;
        PaymentMethod paymentMethod2;
        String str5;
        String str6;
        PaymentMethod paymentMethod3;
        PaymentMethod paymentMethod4;
        if (C19N.LJ("ecom_order_detail_roma_short_link", false)) {
            C32364Cn2 c32364Cn2 = new C32364Cn2("aweme://roma_redirect");
            c32364Cn2.LIZJ("roma_group_key", "roma_schema_group_aftersale");
            c32364Cn2.LIZJ("roma_page_key", "roma_schema_page_order_detail_pia");
            OSZ[] oszArr = new OSZ[4];
            oszArr[0] = new OSZ("main_order_id", String.valueOf(str2));
            oszArr[1] = new OSZ("combo_id", String.valueOf(str));
            if (paymentInfo != null && (paymentMethod4 = paymentInfo.paymentMethod) != null) {
                str5 = paymentMethod4.LJIIL();
            } else {
                str5 = null;
            }
            oszArr[2] = new OSZ("pay_type", String.valueOf(str5));
            if (paymentInfo != null && (paymentMethod3 = paymentInfo.paymentMethod) != null) {
                str6 = paymentMethod3.secondType;
            } else {
                str6 = null;
            }
            oszArr[3] = new OSZ("payment_method", String.valueOf(str6));
            Map LJJLIIIIJ = C113554cx.LJJLIIIIJ(oszArr);
            ArrayList arrayList = new ArrayList(LJJLIIIIJ.size());
            for (Map.Entry entry : ((LinkedHashMap) LJJLIIIIJ).entrySet()) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append((String) entry.getKey());
                LIZ.append('=');
                LIZ.append((String) entry.getValue());
                arrayList.add(X1D.LIZIZ(LIZ));
            }
            c32364Cn2.LIZJ("roma_url_query", ORZ.LLD(arrayList, "&", null, null, null, 62));
            String LIZLLL = c32364Cn2.LIZLLL();
            o.LJIIIIZZ(LIZLLL, "builder.build()");
            E94 LLL = C63081OpJ.LLL(LIZLLL);
            if (z) {
                LLL.LJI(3, "payment_status", "paying");
            }
            if (useSpark) {
                LLL.LJI(3, "use_spark", "1");
            }
            return LLL.LIZ();
        }
        OSZ[] oszArr2 = new OSZ[10];
        oszArr2[0] = new OSZ("main_order_id", str2);
        oszArr2[1] = new OSZ("combo_id", str);
        if (paymentInfo != null && (paymentMethod2 = paymentInfo.paymentMethod) != null) {
            str3 = paymentMethod2.LJIIL();
        } else {
            str3 = null;
        }
        oszArr2[2] = new OSZ("pay_type", str3);
        oszArr2[3] = new OSZ("__status_bar", Boolean.TRUE);
        oszArr2[4] = new OSZ("container_color_auto_dark", 1);
        oszArr2[5] = new OSZ("disableBounces", 1);
        oszArr2[6] = new OSZ("hide_nav_bar", 1);
        oszArr2[7] = new OSZ("hide_source", 1);
        if (paymentInfo != null && (paymentMethod = paymentInfo.paymentMethod) != null) {
            str4 = paymentMethod.secondType;
        } else {
            str4 = null;
        }
        oszArr2[8] = new OSZ("payment_method", str4);
        oszArr2[9] = new OSZ("should_full_screen", 1);
        HashMap LJJJLZIJ = C113554cx.LJJJLZIJ(oszArr2);
        if (z) {
            LJJJLZIJ.put("payment_status", "paying");
        }
        if (useSpark) {
            LJJJLZIJ.put("use_spark", "1");
        }
        String builder = C26867AgZ.LIZLLL("https://oec-api.tiktokv.com/view/fe_tiktok_ecommerce_order_detail/index.html/", LJJJLZIJ).toString();
        o.LJIIIIZZ(builder, "{\n            RouterUtil…   ).toString()\n        }");
        return builder;
    }

    public static final void payResultProcess$handleRedirect(Context context, String str, String str2, Map<String, String> map, boolean z) {
        if (z) {
            Map LJJLIL = C113554cx.LJJLIL(map);
            LJJLIL.put("url", str2);
            String builder = C26867AgZ.LIZJ("aweme://echybrid", C113554cx.LJJJLZIJ(new OSZ("url", str))).toString();
            o.LJIIIIZZ(builder, "RouterUtils.createUrl(\n …             ).toString()");
            LJJLIL.put("back_open_url", builder);
            SmartRouter.buildRoute(context, C26867AgZ.LIZLLL("aweme://echybrid/intercept_back", LJJLIL).toString()).open();
            return;
        }
        Map LJJLIL2 = C113554cx.LJJLIL(map);
        LJJLIL2.put("url", str2);
        SmartRouter.buildRoute(context, C26867AgZ.LIZLLL("aweme://echybrid", LJJLIL2).toString()).open();
    }

    public final String getMiddlePageDeepLink(String str, PaymentInfo paymentInfo, Map<String, ? extends Object> map, String str2, Boolean bool) {
        String builder = C26867AgZ.LIZLLL("snssdk1180://ec/order/middle_page", C113554cx.LJJJLZIJ(new OSZ("url", getMiddlePageUrl$default(this, null, null, str, paymentInfo, null, str2, bool, 16, null)))).toString();
        o.LJIIIIZZ(builder, "RouterUtils.createUrlNoN…Url\n        )).toString()");
        return builder;
    }

    public static final void payResultProcess$handleFailed(SA3 sa3, String str, String str2, Context context, String str3, String str4) {
        String str5;
        String str6;
        String str7 = null;
        if (str4 != null && (!ujb.o.LJJJJJL(str4))) {
            C5S1 c5s1 = new C5S1(EF7.LIZIZ());
            c5s1.LIZLLL(str4);
            c5s1.LJ();
            Object obj = sa3.LJII.get("previous_page");
            if (obj instanceof String) {
                str6 = (String) obj;
            } else {
                str6 = null;
            }
            Object obj2 = sa3.LJII.get("page_name");
            if (obj2 instanceof String) {
                str7 = (String) obj2;
            }
            C28068Azw.LJFF(str4, str3, "query_pay_result", str6, str7);
        } else {
            ExecutorC142245i8.LJLILLLLZI.execute(new ARunnableS10S1000000_4(str3, 0));
            String LIZIZ = C27491Aqd.LIZIZ(str3);
            Object obj3 = sa3.LJII.get("previous_page");
            if (obj3 instanceof String) {
                str5 = (String) obj3;
            } else {
                str5 = null;
            }
            Object obj4 = sa3.LJII.get("page_name");
            if (obj4 instanceof String) {
                str7 = (String) obj4;
            }
            C28068Azw.LJFF(LIZIZ, str3, "query_pay_result", str5, str7);
        }
        if (o.LJ(str, "ordersubmit") && !o.LJ(sa3.LJIIL, Boolean.TRUE)) {
            PaymentResult paymentResult = new PaymentResult("fail", str3);
            if (C19N.LJ("ecom_order_detail_roma_short_link", false)) {
                E94 LLL = C63081OpJ.LLL(str2);
                LLL.LJII(3, C113554cx.LJJLIIIIJ(new OSZ("pay_route", "h5"), new OSZ("pay_result", C27739Aud.LJI(paymentResult))));
                BulletService.LIZ().LJIIIIZZ(context, LLL.LIZ());
                return;
            }
            HashMap hashMap = new HashMap();
            hashMap.put("pay_route", "h5");
            hashMap.put("pay_result", paymentResult);
            String it = C26867AgZ.LIZLLL(str2, hashMap).toString();
            IBulletService LIZ = BulletService.LIZ();
            o.LJIIIIZZ(it, "it");
            LIZ.LJIIIIZZ(context, it);
        }
    }

    public static /* synthetic */ String getOrderDetailPageUrl$default(PaymentResultProcess paymentResultProcess, String str, String str2, PaymentInfo paymentInfo, boolean z, int i, Object obj) {
        if ((i & 8) != 0) {
            z = false;
        }
        return paymentResultProcess.getOrderDetailPageUrl(str, str2, paymentInfo, z);
    }

    public final String getMiddlePageUrl(String str, String str2, String str3, PaymentInfo paymentInfo, Integer num, String str4, Boolean bool) {
        String str5;
        String str6;
        int i;
        PaymentMethod paymentMethod;
        PaymentMethodInfo paymentMethodInfo;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(C71058Rug.LIZ());
        LIZ.append("view/fe_tiktok_ecommerce_pay_middle/index.html/");
        String LIZIZ = X1D.LIZIZ(LIZ);
        OSZ[] oszArr = new OSZ[6];
        oszArr[0] = new OSZ("main_order_id", str2);
        oszArr[1] = new OSZ("combo_id", str);
        if (paymentInfo != null && (paymentMethodInfo = paymentInfo.paymentMethodInfo) != null && o.LJ(paymentMethodInfo.isChooseSave(), Boolean.TRUE)) {
            str5 = "pay_and_bindcard";
        } else {
            str5 = "pay";
        }
        oszArr[2] = new OSZ("channel_type", str5);
        oszArr[3] = new OSZ("pay_source", str3);
        if (paymentInfo != null && (paymentMethod = paymentInfo.paymentMethod) != null) {
            str6 = paymentMethod.LJIIL();
        } else {
            str6 = null;
        }
        oszArr[4] = new OSZ("pay_type", str6);
        if (num != null) {
            i = num.intValue();
        } else {
            i = 0;
        }
        oszArr[5] = new OSZ("miss_cashback", Integer.valueOf(i));
        HashMap LJJJLZIJ = C113554cx.LJJJLZIJ(oszArr);
        if (useSpark) {
            LJJJLZIJ.put("use_spark", "1");
        }
        if (C19N.LJ("ec_pay_middle_append_request_id", false)) {
            LJJJLZIJ.put("pay_request_id", str4);
        }
        if (C19N.LJ("ec_payment_result_close_btn", false)) {
            LJJJLZIJ.put("show_close_all", 0);
        }
        if (o.LJ(bool, Boolean.TRUE)) {
            LJJJLZIJ.put("us_localization", 1);
        }
        String builder = C26867AgZ.LIZLLL(LIZIZ, LJJJLZIJ).toString();
        o.LJIIIIZZ(builder, "RouterUtils.createUrlNoN…  }\n        }).toString()");
        return builder;
    }

    public static /* synthetic */ String getMiddlePageDeepLink$default(PaymentResultProcess paymentResultProcess, String str, PaymentInfo paymentInfo, Map map, String str2, Boolean bool, int i, Object obj) {
        if ((i & 16) != 0) {
            bool = null;
        }
        return paymentResultProcess.getMiddlePageDeepLink(str, paymentInfo, map, str2, bool);
    }

    public static final void payResultProcess$handleAppBackgroundSwitch(SA3 sa3, String str, String str2, List<String> list, long j, boolean z, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro2) {
        deeplinkOrder.set(z);
        SA8 sa8 = new SA8(sa3, str, str2, list, j, z, interfaceC65784Pro, interfaceC65784Pro2);
        listener = sa8;
        ActivityStack.addAppBackGroundListener(sa8);
    }

    public static /* synthetic */ void payResultProcess$handleFailed$default(SA3 sa3, String str, String str2, Context context, String str3, String str4, int i, Object obj) {
        if ((i & 32) != 0) {
            str4 = null;
        }
        payResultProcess$handleFailed(sa3, str, str2, context, str3, str4);
    }

    public static /* synthetic */ String getMiddlePageUrl$default(PaymentResultProcess paymentResultProcess, String str, String str2, String str3, PaymentInfo paymentInfo, Integer num, String str4, Boolean bool, int i, Object obj) {
        String str5 = str4;
        Integer num2 = num;
        Boolean bool2 = null;
        if ((i & 16) != 0) {
            num2 = null;
        }
        if ((i & 32) != 0) {
            str5 = null;
        }
        if ((i & 64) == 0) {
            bool2 = bool;
        }
        return paymentResultProcess.getMiddlePageUrl(str, str2, str3, paymentInfo, num2, str5, bool2);
    }

    public static /* synthetic */ void payResultProcess$handleAppBackgroundSwitch$default(SA3 sa3, String str, String str2, List list, long j, boolean z, InterfaceC65784Pro interfaceC65784Pro, InterfaceC65784Pro interfaceC65784Pro2, int i, Object obj) {
        InterfaceC65784Pro interfaceC65784Pro3 = interfaceC65784Pro;
        boolean z2 = z;
        if ((i & 32) != 0) {
            z2 = false;
        }
        InterfaceC65784Pro interfaceC65784Pro4 = null;
        if ((i & 64) != 0) {
            interfaceC65784Pro3 = null;
        }
        if ((i & 128) == 0) {
            interfaceC65784Pro4 = interfaceC65784Pro2;
        }
        payResultProcess$handleAppBackgroundSwitch(sa3, str, str2, list, j, z2, interfaceC65784Pro3, interfaceC65784Pro4);
    }
}
