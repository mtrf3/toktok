package X;

import Y.ARunnableS14S1100000_13;
import android.text.TextUtils;
import com.bytedance.globalpayment.iap.common.ability.model.OrderData;
import com.bytedance.globalpayment.iap.common.ability.model.api.entity.CreateOrderResponseEntity;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import defpackage.a1;
import defpackage.i0;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.UoB, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C78299UoB extends AbstractC78300UoC {
    public final String LIZ = C16880lQ.LJLLJ(C78299UoB.class);

    @Override // X.AbstractC78300UoC
    public final void LIZ(C77874UhK c77874UhK, OrderData orderData, InterfaceC78326Uoc<CreateOrderResponseEntity> interfaceC78326Uoc) {
        C39670Fha LJ = C78273Unl.LJIIIZ().LJ();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("CreateOrder: request self server to create order:");
        LIZ.append(c77874UhK.LJIIIZ);
        X1D.LIZIZ(LIZ);
        LJ.getClass();
        C78292Uo4 c78292Uo4 = new C78292Uo4("create_order", orderData.getOrderId(), orderData.getProductId());
        c78292Uo4.LIZ();
        HashMap hashMap = new HashMap();
        java.util.Map<String, String> map = c77874UhK.LJIIL;
        String str = CardStruct.IStatusCode.DEFAULT;
        String str2 = "";
        if (map != null) {
            if (map.containsKey("price_amount_micros")) {
                str = c77874UhK.LJIIL.get("price_amount_micros");
            }
            if (c77874UhK.LJIIL.containsKey("price_currency")) {
                str2 = c77874UhK.LJIIL.get("price_currency");
            }
        }
        hashMap.put("merchant_id", c77874UhK.LIZIZ);
        hashMap.put("product_id", c77874UhK.LJIIIZ);
        hashMap.put("price_amount_micros", str);
        hashMap.put("price_currency", str2);
        hashMap.put("payment_channel", orderData.getIapPaymentMethod().channelName);
        String str3 = ((C78261UnZ) C78273Unl.LJIIIZ().LIZ()).LIZ.LJIILIIL.LJIIIZ;
        if (str3.isEmpty()) {
            str3 = "http://webcast-mp-sg.tiktokv.com";
        }
        String LJFF = i0.LJFF(str3, "/money/billing/proxy/v1/contract/create");
        C39670Fha LJ2 = C78273Unl.LJIIIZ().LJ();
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("getCreateOrderUrl with host:");
        LIZ2.append(LJFF);
        X1D.LIZIZ(LIZ2);
        LJ2.getClass();
        AbstractC78300UoC.LIZJ(LJFF, hashMap, new C78321UoX(this, c77874UhK, orderData, c78292Uo4, interfaceC78326Uoc));
    }

    @Override // X.AbstractC78300UoC
    public final void LIZLLL(String str, String str2, String str3, String str4, boolean z, String str5, C78329Uof c78329Uof, boolean z2) {
        String LIZIZ;
        String LIZIZ2;
        if (TextUtils.isEmpty(str2)) {
            str2 = ((C78261UnZ) C78273Unl.LJIIIZ().LIZ()).LIZ.LJIILIIL.LIZLLL;
        }
        if (z && !z2) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("MerchantID", str2);
                jSONObject.put("MerchantUserID", str3);
                jSONObject.put("MerchantSubscriptionID", str);
            } catch (JSONException unused) {
            }
            HashMap LIZ = C45243HpH.LIZ("merchant_id", str2, "method", "pipo.subscription.getSubsTxnsByMerchant");
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append(System.currentTimeMillis());
            LIZ2.append("");
            LIZ.put("timestamp", X1D.LIZIZ(LIZ2));
            LIZ.put("biz_content", jSONObject.toString());
            C78292Uo4 c78292Uo4 = new C78292Uo4("query_subscription_order_state", str, str4);
            c78292Uo4.LIZ();
            if (!TextUtils.isEmpty(str5)) {
                LIZIZ2 = i0.LJFF(str5, "/pipo/inner/subscription/query/v1");
            } else {
                StringBuilder LIZ3 = X1D.LIZ();
                LIZ3.append(C78274Unm.LIZ());
                LIZ3.append("/pipo/inner/subscription/query/v1");
                LIZIZ2 = X1D.LIZIZ(LIZ3);
            }
            AbstractC78300UoC.LIZJ(LIZIZ2, LIZ, new C78324Uoa(this, c78292Uo4, c78329Uof));
            return;
        }
        C78292Uo4 c78292Uo42 = new C78292Uo4("query_order_state", str, str4);
        c78292Uo42.LIZ();
        StringBuilder sb = new StringBuilder(200);
        if (!TextUtils.isEmpty(str5)) {
            LIZIZ = i0.LJFF(str5, "/pipo/inner/order/query/v1");
        } else {
            StringBuilder LIZ4 = X1D.LIZ();
            LIZ4.append(C78274Unm.LIZIZ(str5));
            LIZ4.append("/pipo/inner/order/query/v1");
            LIZIZ = X1D.LIZIZ(LIZ4);
        }
        C39670Fha LJ = C78273Unl.LJIIIZ().LJ();
        StringBuilder LIZ5 = X1D.LIZ();
        LIZ5.append("getQueryOrderUrl with host:");
        LIZ5.append(LIZIZ);
        X1D.LIZIZ(LIZ5);
        LJ.getClass();
        sb.append(LIZIZ);
        sb.append("?merchant_id=");
        sb.append(str2);
        sb.append("&request_id=");
        sb.append(str);
        String sb2 = sb.toString();
        C78323UoZ c78323UoZ = new C78323UoZ(this, c78292Uo42, c78329Uof);
        String LJ2 = a1.LJ(sb2, "&pipo_sdk_version=", "1.0");
        String str6 = ((C78261UnZ) C78273Unl.LJIIIZ().LIZ()).LIZ.LJIIIZ;
        if (!TextUtils.isEmpty(str6)) {
            LJ2 = a1.LJ(LJ2, "&device_id=", str6);
        }
        C78273Unl.LJIIIZ().LJII().getClass();
        ((C78303UoF) C78273Unl.LJIIIZ().LIZJ()).LIZ.execute(new ARunnableS14S1100000_13(c78323UoZ, LJ2, 18));
    }

    @Override // X.AbstractC78300UoC
    public final void LJ(String str, JSONObject jSONObject, String str2, boolean z, String str3, String str4, C78358Up8 c78358Up8, boolean z2) {
        boolean z3;
        String str5;
        String LIZIZ;
        if (jSONObject == null) {
            if (c78358Up8 != null) {
                c78358Up8.LIZ(new C78368UpI(201, 2012, "tokenJson is error in uploadToken"));
                return;
            }
            return;
        }
        if (z && !z2) {
            z3 = true;
            try {
                jSONObject.put("MerchantID", str);
            } catch (Throwable unused) {
                return;
            }
        } else {
            z3 = false;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("timestamp", String.valueOf(System.currentTimeMillis() / 1000));
        if (TextUtils.isEmpty(str)) {
            str = ((C78261UnZ) C78273Unl.LJIIIZ().LIZ()).LIZ.LJIILIIL.LIZLLL;
            if (TextUtils.isEmpty(str)) {
                C78273Unl.LJIIIZ().LJ().getClass();
                c78358Up8.LIZ(new C78368UpI(205, 2012, "upload token failed because merchantId is null!"));
                return;
            }
        }
        hashMap.put("merchant_id", str);
        if (z3) {
            str5 = "pipo.subscription.uploadToken";
        } else {
            str5 = "pipo.receipt.check";
        }
        hashMap.put("method", str5);
        hashMap.put("biz_content", jSONObject.toString());
        for (Map.Entry entry : hashMap.entrySet()) {
        }
        C78273Unl.LJIIIZ().LJ().getClass();
        if (z3) {
            if (!TextUtils.isEmpty(str2)) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append(str2);
                LIZ.append("/pipo/inner/subscription/upload_token/v1");
                LIZIZ = X1D.LIZIZ(LIZ);
            } else {
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append(C78274Unm.LIZ());
                LIZ2.append("/pipo/inner/subscription/upload_token/v1");
                LIZIZ = X1D.LIZIZ(LIZ2);
            }
        } else {
            LIZIZ = AbstractC78300UoC.LIZIZ(str2);
        }
        C78292Uo4 c78292Uo4 = new C78292Uo4("upload_token", str3, str4);
        c78292Uo4.LIZ();
        AbstractC78300UoC.LIZJ(LIZIZ, hashMap, new C78322UoY(this, c78292Uo4, c78358Up8));
    }
}
