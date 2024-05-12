package X;

import com.amazon.device.iap.model.PurchaseResponse;
import com.bytedance.globalpayment.iap.model.IapPaymentMethod;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

/* renamed from: X.Unq, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C78278Unq {
    public static volatile C78278Unq LIZ;

    public static C78278Unq LIZ() {
        if (LIZ == null) {
            synchronized (C78278Unq.class) {
                if (LIZ == null) {
                    LIZ = new C78278Unq();
                }
            }
        }
        return LIZ;
    }

    public static void LIZIZ(String str, PurchaseResponse purchaseResponse) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("amazon_request_id", str);
        } catch (Throwable unused) {
        }
        try {
            jSONObject.put("payment_method", IapPaymentMethod.AMAZON.channelName);
        } catch (Throwable unused2) {
        }
        try {
            jSONObject.put("orginal_purchase_info", purchaseResponse.toString());
        } catch (Throwable unused3) {
        }
        InterfaceC78267Unf LJFF = C78273Unl.LJIIIZ().LJFF();
        EnumC77751UfL enumC77751UfL = EnumC77751UfL.BOTH;
        C78263Unb c78263Unb = (C78263Unb) LJFF;
        c78263Unb.getClass();
        C78269Unh.LIZ(c78263Unb, enumC77751UfL, "livesdk_iap_purchase_updated", jSONObject);
    }

    public static void LIZJ(String str, List list, boolean z) {
        long j;
        C78273Unl.LJIIIZ().LIZLLL().getClass();
        if (!C73994T2g.LJJ("ttlive_livesdk_iap_check_unverified_transaction", 0.2d)) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("payment_method", IapPaymentMethod.AMAZON.channelName);
        } catch (Throwable unused) {
        }
        if (z) {
            j = 0;
        } else {
            j = 1;
        }
        try {
            jSONObject.put("status", j);
        } catch (Throwable unused2) {
        }
        try {
            jSONObject.put("amazon_request_id", str);
        } catch (Throwable unused3) {
        }
        StringBuilder sb = new StringBuilder();
        ArrayList arrayList = (ArrayList) list;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            sb.append(it.next().toString());
        }
        if (arrayList.size() == 0) {
            sb.append("size of 0 list");
        }
        try {
            jSONObject.put("query_result", sb.toString());
        } catch (Throwable unused4) {
        }
        InterfaceC78267Unf LJFF = C78273Unl.LJIIIZ().LJFF();
        EnumC77751UfL enumC77751UfL = EnumC77751UfL.MONITOR;
        C78263Unb c78263Unb = (C78263Unb) LJFF;
        c78263Unb.getClass();
        C78269Unh.LIZ(c78263Unb, enumC77751UfL, "livesdk_iap_check_unverified_transaction", jSONObject);
    }
}
