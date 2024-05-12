package X;

import com.google.gson.m;
import com.ss.android.ugc.aweme.ecommerce.base.combinepayment.payment.dto.RiskContextContent;
import com.ss.android.ugc.aweme.ecommerce.base.combinepayment.payment.dto.RiskContextRequest;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.api.PaymentApi;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentElement;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethodInfo;
import com.ss.android.ugc.aweme.ecommerce.base.payment.dto.Cashier;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes13.dex */
public final class SA4 {
    public static final SimpleDateFormat LIZ = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssZZZZZ", Locale.US);

    public static void LIZ(String str, String str2, PaymentMethodInfo paymentMethodInfo, m mVar) {
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        o.LJIIIZ(paymentMethodInfo, "paymentMethodInfo");
        if (EO3.LIZ == null) {
            C36746EbW.LIZ(4, "NonceHelper.cashier is null");
            return;
        }
        if (o.LJ(paymentMethodInfo.isChooseSave(), Boolean.TRUE)) {
            str3 = "pay_and_bind";
        } else {
            str3 = "pay";
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        List<PaymentElement> paymentElements = paymentMethodInfo.getPaymentElements();
        if (paymentElements != null) {
            for (PaymentElement paymentElement : paymentElements) {
                if (paymentElement.getParamName() != null && paymentElement.getParamValue() != null) {
                    String paramName = paymentElement.getParamName();
                    String paramValue = paymentElement.getParamValue();
                    if (paramValue != null) {
                        linkedHashMap.put(paramName, paramValue);
                    } else {
                        "Required value was null.".toString();
                        throw new IllegalArgumentException("Required value was null.");
                    }
                }
            }
        }
        JSONObject jSONObject = C82950Wh0.LIZ;
        String str8 = null;
        if (jSONObject != null) {
            str4 = jSONObject.optString("device_fingerprint_id");
        } else {
            str4 = null;
        }
        mVar.LJJIIZ("device_fingerprint_id", str4);
        Cashier cashier = EO3.LIZ;
        if (cashier != null) {
            str5 = cashier.countryOrRegion;
            str6 = cashier.merchantUserId;
        } else {
            str5 = null;
            str6 = null;
        }
        String id = paymentMethodInfo.getId();
        String token = paymentMethodInfo.getToken();
        Cashier cashier2 = EO3.LIZ;
        if (cashier2 != null) {
            str7 = cashier2.nonce;
        } else {
            str7 = null;
        }
        RiskContextContent riskContextContent = new RiskContextContent(str, str5, str6, str3, id, token, linkedHashMap, mVar, str7);
        C74672wR c74672wR = PaymentApi.LIZ;
        String LJI = C27739Aud.LJI(riskContextContent);
        Cashier cashier3 = EO3.LIZ;
        if (cashier3 != null) {
            str8 = cashier3.merchantId;
        }
        RiskContextRequest riskContextRequest = new RiskContextRequest(LJI, str8, LIZ.format(new Date()), null, 8, null);
        c74672wR.getClass();
        ((PaymentApi) C74672wR.LIZJ.LIZ(str2).LJFF().LIZ.LIZ(PaymentApi.class)).paymentRiskContext(riskContextRequest, C71058Rug.LIZ()).LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ()).LJJJLIIL(SA9.LJLIL, SAB.LJLIL);
    }
}
