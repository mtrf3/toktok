package X;

import android.os.Build;
import android.text.TextUtils;
import com.bytedance.android.livesdk.livesetting.performance.LiveGiftNewGifterBadgeSetting;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public final class PJG {
    public static final JSONObject LIZ = new JSONObject();

    public static boolean LIZ(PJF pjf) {
        JSONObject optJSONObject;
        JSONObject jSONObject = LIZ;
        if (jSONObject == null || (optJSONObject = jSONObject.optJSONObject("java_crash_ignore")) == null || LIZLLL(optJSONObject.optJSONArray("disable"), pjf)) {
            return false;
        }
        return LIZLLL(optJSONObject.optJSONArray("enable"), pjf);
    }

    public static boolean LIZIZ(JSONArray jSONArray) {
        if (jSONArray == null) {
            return false;
        }
        try {
        } catch (Throwable th) {
            PJZ.LIZ.getClass();
            PJY.LIZ("NPTH_CATCH", th);
        }
        if (jSONArray.toString().contains(LiveGiftNewGifterBadgeSetting.DEFAULT)) {
            return false;
        }
        if (jSONArray.toString().contains("all")) {
            return true;
        }
        if (jSONArray.length() > 0) {
            for (int i = 0; i < jSONArray.length(); i++) {
                if (Build.VERSION.SDK_INT == CastIntegerProtector.parseInt(jSONArray.optString(i))) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean LIZJ(JSONArray jSONArray) {
        if (jSONArray == null) {
            return false;
        }
        if (jSONArray.toString().contains(LiveGiftNewGifterBadgeSetting.DEFAULT)) {
            return false;
        }
        if (jSONArray.toString().contains("all")) {
            return true;
        }
        if (!Build.BRAND.isEmpty() && jSONArray.length() > 0) {
            for (int i = 0; i < jSONArray.length(); i++) {
                if (Build.BRAND.equals(jSONArray.optString(i))) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean LIZLLL(JSONArray jSONArray, PJH pjh) {
        if (PJC.LJI(jSONArray)) {
            return false;
        }
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONObject optJSONObject = jSONArray.optJSONObject(i);
            if (optJSONObject == null) {
                PJY pjy = PJZ.LIZ;
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("err config: ");
                LIZ2.append(jSONArray);
                IllegalArgumentException illegalArgumentException = new IllegalArgumentException(X1D.LIZIZ(LIZ2));
                pjy.getClass();
                PJY.LIZ("NPTH_CATCH", illegalArgumentException);
            } else {
                Iterator<String> keys = optJSONObject.keys();
                boolean z = false;
                while (true) {
                    if (keys.hasNext()) {
                        String next = keys.next();
                        if (!TextUtils.isEmpty(next)) {
                            if (next.startsWith("header_")) {
                                if (!LJ(pjh.LIZ(next.substring(7)), optJSONObject.optJSONObject(next))) {
                                    break;
                                }
                                z = true;
                            } else {
                                if (next.startsWith("java_")) {
                                    if (!LJ(pjh.LIZIZ(next.substring(5)), optJSONObject.optJSONObject(next))) {
                                        break;
                                    }
                                }
                                z = true;
                            }
                        }
                    } else if (z) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static boolean LJ(Object obj, JSONObject jSONObject) {
        JSONArray optJSONArray = jSONObject.optJSONArray("values");
        if (optJSONArray.length() == 0) {
            return false;
        }
        String optString = jSONObject.optString("op");
        String valueOf = String.valueOf(obj);
        if (optString.equals("=")) {
            return valueOf.equals(String.valueOf(optJSONArray.opt(0)));
        }
        if (optString.equals("in")) {
            for (int i = 0; i < optJSONArray.length(); i++) {
                if (String.valueOf(optJSONArray.opt(i)).equals(valueOf)) {
                    return true;
                }
            }
        }
        return false;
    }
}
