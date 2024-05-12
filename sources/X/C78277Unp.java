package X;

import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicFloatWindowOptimizeSetting;
import com.bytedance.globalpayment.iap.model.AbsIapProduct;
import com.bytedance.globalpayment.iap.model.AbsResult;
import com.bytedance.globalpayment.iap.model.IapPaymentMethod;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.List;
import org.json.JSONObject;

/* renamed from: X.Unp, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C78277Unp {
    public static void LIZ(C78368UpI c78368UpI) {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject.put("error_code", c78368UpI.getCode());
        } catch (Throwable unused) {
        }
        try {
            jSONObject.put("detail_error_code", c78368UpI.getDetailCode());
        } catch (Throwable unused2) {
        }
        try {
            jSONObject2.put("message", c78368UpI.getMessage());
        } catch (Throwable unused3) {
        }
        InterfaceC78267Unf LJFF = C78273Unl.LJIIIZ().LJFF();
        EnumC77751UfL enumC77751UfL = EnumC77751UfL.MONITOR;
        C78263Unb c78263Unb = (C78263Unb) LJFF;
        c78263Unb.getClass();
        c78263Unb.LIZ(enumC77751UfL, "livesdk_iap_precheck_fail", jSONObject, null, jSONObject2);
    }

    public static void LIZIZ(boolean z, List<String> list, IapPaymentMethod iapPaymentMethod, AbsResult absResult, List<AbsIapProduct> list2) {
        boolean LJJ;
        int i;
        EnumC77751UfL enumC77751UfL;
        String str;
        if (z) {
            C78273Unl.LJIIIZ().LIZLLL().getClass();
            LJJ = C73994T2g.LJJ("ttlive_livesdk_iap_find_order_product_success", 0.2d);
        } else {
            C78273Unl.LJIIIZ().LIZLLL().getClass();
            LJJ = C73994T2g.LJJ("ttlive_livesdk_iap_find_order_product_fail", LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX);
        }
        if (!LJJ) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        if (iapPaymentMethod != null) {
            try {
                jSONObject.put("paymentMethod", iapPaymentMethod.channelName);
            } catch (Throwable unused) {
            }
            if (iapPaymentMethod.equals(IapPaymentMethod.GOOGLE)) {
                try {
                    jSONObject.put("billing_version", C79146V4k.LIZLLL);
                } catch (Throwable unused2) {
                }
            }
        }
        if (absResult != null) {
            try {
                jSONObject.put("error_code", absResult.getCode());
            } catch (Throwable unused3) {
            }
            try {
                jSONObject.put("detail_error_code", absResult.getDetailCode());
            } catch (Throwable unused4) {
            }
            try {
                jSONObject2.put("message", absResult.getMessage());
            } catch (Throwable unused5) {
            }
        }
        int i2 = -1;
        if (list != null) {
            i = list.size();
            try {
                jSONObject2.put("productIds", list.toString());
            } catch (Throwable unused6) {
            }
        } else {
            i = -1;
        }
        try {
            jSONObject.put("productIdSize", i);
        } catch (Throwable unused7) {
        }
        if (list2 != null) {
            i2 = list2.size();
            if (!list2.isEmpty()) {
                try {
                    jSONObject.put("currency", ((AbsIapProduct) ListProtector.get(list2, 0)).getPriceCurrencyCode());
                } catch (Throwable unused8) {
                }
            }
        }
        try {
            jSONObject.put("iapProductCount", i2);
        } catch (Throwable unused9) {
        }
        InterfaceC78267Unf LJFF = C78273Unl.LJIIIZ().LJFF();
        if (z) {
            enumC77751UfL = EnumC77751UfL.MONITOR;
        } else {
            enumC77751UfL = EnumC77751UfL.BOTH;
        }
        if (z) {
            str = "livesdk_iap_find_order_product_success";
        } else {
            str = "livesdk_iap_find_order_product_fail";
        }
        C78263Unb c78263Unb = (C78263Unb) LJFF;
        c78263Unb.getClass();
        c78263Unb.LIZ(enumC77751UfL, str, jSONObject, null, jSONObject2);
    }
}
