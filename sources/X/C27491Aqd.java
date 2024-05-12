package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.Aqd, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27491Aqd {
    public static final HashMap<String, String> LIZ = C113554cx.LJJJLZIJ(new OSZ("ui0024", LIZ(R.string.f2c)), new OSZ("ui0002", LIZ(R.string.f2d)), new OSZ("ui0012", LIZ(R.string.f2c)), new OSZ("ui0028", LIZ(R.string.f2e)), new OSZ("ui0017", LIZ(R.string.f2b)), new OSZ("ui0018", LIZ(R.string.f2e)), new OSZ("ui0019", LIZ(R.string.f2e)), new OSZ("ui0020", LIZ(R.string.f2f)), new OSZ("ui0031", LIZ(R.string.f2k)), new OSZ("ui0034", LIZ(R.string.f2g)), new OSZ("tp0002", LIZ(R.string.f2h)), new OSZ("tp0005", LIZ(R.string.f2j)), new OSZ("tp0006", LIZ(R.string.f2n)), new OSZ("tp0007", LIZ(R.string.f2h)), new OSZ("tp0009", LIZ(R.string.f2h)), new OSZ("tp0014", LIZ(R.string.f2h)), new OSZ("tp0018", LIZ(R.string.f2h)), new OSZ("tp0019", LIZ(R.string.f2h)), new OSZ("tp0023", LIZ(R.string.f2i)), new OSZ("tp0024", LIZ(R.string.f2o)), new OSZ("tp0027", LIZ(R.string.f2h)), new OSZ("tp0030", LIZ(R.string.f2h)), new OSZ("tp0031", LIZ(R.string.f2h)), new OSZ("tp0033", LIZ(R.string.f2h)), new OSZ("tp0034", LIZ(R.string.f2h)), new OSZ("tp0035", LIZ(R.string.f2h)), new OSZ("tp0040", LIZ(R.string.f2a)), new OSZ("ot0002", LIZ(R.string.f2l)));

    public static String LIZ(int i) {
        String string = FKM.LIZ().getString(i);
        o.LJIIIIZZ(string, "application.getString(id)");
        return string;
    }

    public static String LIZIZ(String str) {
        boolean z;
        String str2;
        HashMap<String, String> hashMap = LIZ;
        if (hashMap.containsKey(str)) {
            str2 = hashMap.get(str);
        } else {
            SettingsManager LIZLLL = SettingsManager.LIZLLL();
            java.util.Map<String, String> map = C27492Aqe.LIZ;
            java.util.Map<String, String> map2 = (java.util.Map) LIZLLL.LJIIIIZZ("ecom_payment_toast_config", java.util.Map.class, map);
            if (map2 != null) {
                map = map2;
            }
            if (str == null || str.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                String str3 = map.get("empty");
                if (str3 != null) {
                    return str3;
                }
                str2 = map.get("fallback");
            } else {
                String str4 = map.get(str);
                if (str4 != null) {
                    return str4;
                }
                str2 = map.get("fallback");
            }
        }
        if (str2 == null) {
            String LIZ2 = LIZ(R.string.f2m);
            C78983UzD.LJIILL("Payment toast msg is null, error code: " + str);
            return LIZ2;
        }
        return str2;
    }
}
