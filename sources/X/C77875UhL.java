package X;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Base64;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.UhL, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C77875UhL {
    public static SharedPreferences LIZ;

    static {
        C16880lQ.LJLLILLLL(C77875UhL.class);
    }

    public static String LIZ(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        return new String(Base64.decode(str, 0));
    }

    public static String LIZIZ(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        return new String(Base64.encode(str.getBytes(), 0));
    }

    public static SharedPreferences LIZJ(Context context) {
        if (LIZ == null) {
            LIZ = F9J.LIZIZ(context, 0, "payload_prefs");
        }
        return LIZ;
    }

    public static void LIZLLL(Context context, String str) {
        LIZJ(context).edit().remove(C44384HbQ.LJJIL(str)).apply();
    }

    public static void LJ(int i, Context context, String str, String str2, String str3, String str4, String str5) {
        C39670Fha LJ = C78273Unl.LJIIIZ().LJ();
        StringBuilder LIZLLL = C06540Nm.LIZLLL("PayloadPreferences: setPayload with sku:", str, ",localOrderId:", str2, ",merchantId:");
        YE1.LIZLLL(LIZLLL, str3, ",userId:", str4, ",extraPayload:");
        LIZLLL.append(str5);
        LIZLLL.append(",orderPlatform:");
        LIZLLL.append(i);
        X1D.LIZIZ(LIZLLL);
        LJ.getClass();
        SharedPreferences.Editor edit = LIZJ(context).edit();
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("key_google_pay_");
        LIZ2.append(str2);
        String LJJIL = C44384HbQ.LJJIL(X1D.LIZIZ(LIZ2));
        String str6 = "";
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(C44384HbQ.LJJIL("order_id"), LIZIZ(str2));
            jSONObject.put(C44384HbQ.LJJIL("merchant_id"), LIZIZ(str3));
            jSONObject.put(C44384HbQ.LJJIL("user_id"), LIZIZ(str4));
            jSONObject.put(C44384HbQ.LJJIL("extra_payload"), LIZIZ(str5));
            String LJJIL2 = C44384HbQ.LJJIL("order_platform");
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append(i);
            LIZ3.append("");
            jSONObject.put(LJJIL2, LIZIZ(X1D.LIZIZ(LIZ3)));
            str6 = jSONObject.toString();
        } catch (JSONException e) {
            C16880lQ.LLLLIIL(e);
        }
        edit.putString(LJJIL, str6).apply();
    }
}
