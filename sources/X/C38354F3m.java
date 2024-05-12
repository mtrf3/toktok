package X;

import android.text.TextUtils;
import android.util.Base64;
import java.util.Random;
import org.json.JSONObject;

/* renamed from: X.F3m, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38354F3m {
    public static String LIZIZ(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            byte[] bytes = str.getBytes("UTF-8");
            for (int i = 0; i < bytes.length; i++) {
                bytes[i] = (byte) (bytes[i] ^ 5);
            }
            return C38352F3k.LJFF(bytes, bytes.length);
        } catch (Exception unused) {
            return str;
        }
    }

    public static String LIZLLL(String str) {
        if (!LJ(str)) {
            try {
                str = str.replace("[ss_random]", String.valueOf(new Random().nextLong())).replace("[ss_timestamp]", String.valueOf(System.currentTimeMillis()));
                return str;
            } catch (Exception e) {
                C16880lQ.LLLLIIL(e);
                return str;
            }
        }
        return str;
    }

    public static boolean LJ(String str) {
        if (str == null || str.length() == 0) {
            return true;
        }
        return false;
    }

    public static String LJFF(java.util.Map<String, String> map) {
        if (map == null) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            for (String str : map.keySet()) {
                String str2 = map.get(str);
                if (!LJ(str) && !LJ(str2)) {
                    jSONObject.put(str, str2);
                }
            }
            return jSONObject.toString();
        } catch (Exception unused) {
            return null;
        }
    }

    public static String LIZ(String str, Boolean... boolArr) {
        byte[] LIZ;
        try {
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            if (boolArr.length > 0 && boolArr[0].booleanValue()) {
                LIZ = Base64.decode(str, 0);
            } else {
                LIZ = C38352F3k.LIZ(str);
            }
            for (int i = 0; i < LIZ.length; i++) {
                LIZ[i] = (byte) (LIZ[i] ^ 5);
            }
            return new String(LIZ, 0, LIZ.length, "UTF-8");
        } catch (Exception unused) {
            return str;
        }
    }

    public static boolean LIZJ(String str, String str2) {
        if ((LJ(str) && LJ(str2)) || (str != null && str.equals(str2))) {
            return true;
        }
        return false;
    }
}
