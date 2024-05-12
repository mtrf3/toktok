package X;

import com.ss.android.ugc.aweme.bytebench.ByteBenchStrategyHWFastImportConfiguration;
import java.util.LinkedHashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.Hl6, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44984Hl6 {
    public static final java.util.Map<String, Integer> LIZ;
    public static final java.util.Map<String, Integer> LIZIZ;
    public static final Boolean LIZJ;
    public static final java.util.Map<String, Integer> LIZLLL;
    public static final java.util.Map<String, Integer> LJ;
    public static final Boolean LJFF;

    static {
        String str;
        java.util.Map<String, Integer> LJJJLIIL;
        java.util.Map<String, Integer> LJJJLIIL2;
        boolean z;
        Integer num;
        boolean z2;
        Integer num2;
        java.util.Map<String, Integer> LJJJLIIL3;
        java.util.Map<String, Integer> LJJJLIIL4;
        Integer num3;
        Integer num4;
        InterfaceC09240Xw LIZ2;
        ByteBenchStrategyHWFastImportConfiguration byteBenchStrategyHWFastImportConfiguration;
        String str2 = null;
        if (C44982Hl4.LIZ()) {
            C09580Ze LIZJ2 = C09580Ze.LIZJ();
            if (LIZJ2 != null && (LIZ2 = LIZJ2.LIZ()) != null && (byteBenchStrategyHWFastImportConfiguration = (ByteBenchStrategyHWFastImportConfiguration) LIZ2.LJIILJJIL(ByteBenchStrategyHWFastImportConfiguration.class)) != null) {
                str = byteBenchStrategyHWFastImportConfiguration.getH264HWDecodeThreshold();
                str2 = byteBenchStrategyHWFastImportConfiguration.getByteVC1HWDecodeThreshold();
            } else {
                str = null;
            }
            boolean z3 = false;
            if (str == null || str.length() == 0) {
                LJJJLIIL = C113554cx.LJJJLIIL();
            } else {
                LJJJLIIL = LIZIZ(str);
            }
            LIZ = LJJJLIIL;
            if (str == null || str.length() == 0) {
                LJJJLIIL2 = C113554cx.LJJJLIIL();
            } else {
                LJJJLIIL2 = LIZJ(str);
            }
            LIZIZ = LJJJLIIL2;
            if (str == null || str.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (z || ((num = LJJJLIIL.get("lower_fps_min_side_threshold")) != null && !LIZ(num) && (num2 = LJJJLIIL.get("higher_fps_min_side_threshold")) != null && !LIZ(num2))) {
                z2 = false;
            } else {
                z2 = true;
            }
            LIZJ = Boolean.valueOf(z2);
            if (str2 == null || str2.length() == 0) {
                LJJJLIIL3 = C113554cx.LJJJLIIL();
            } else {
                LJJJLIIL3 = LIZIZ(str2);
            }
            LIZLLL = LJJJLIIL3;
            if (str2 == null || str2.length() == 0) {
                LJJJLIIL4 = C113554cx.LJJJLIIL();
            } else {
                LJJJLIIL4 = LIZJ(str2);
            }
            LJ = LJJJLIIL4;
            if (str2 != null && str2.length() != 0 && ((num3 = LJJJLIIL3.get("lower_fps_min_side_threshold")) == null || LIZ(num3) || (num4 = LJJJLIIL3.get("higher_fps_min_side_threshold")) == null || LIZ(num4))) {
                z3 = true;
            }
            LJFF = Boolean.valueOf(z3);
            return;
        }
        LIZ = null;
        LIZIZ = null;
        LIZJ = null;
        LIZLLL = null;
        LJ = null;
        LJFF = null;
    }

    public static boolean LIZ(Integer num) {
        int intValue;
        if (num != null && 1 <= (intValue = num.intValue()) && intValue < 10000) {
            return true;
        }
        return false;
    }

    public static java.util.Map LIZIZ(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            return C113554cx.LJJL(new OSZ("lower_fps_min_side_threshold", Integer.valueOf(jSONObject.optInt("lower_fps_min_side_threshold", 0))), new OSZ("higher_fps_threshold", Integer.valueOf(jSONObject.optInt("higher_fps_threshold", 0))), new OSZ("higher_fps_min_side_threshold", Integer.valueOf(jSONObject.optInt("higher_fps_min_side_threshold", 0))));
        } catch (JSONException unused) {
            H78.LIZLLL("expand_hw_decoder_list_by_bytebench", new Throwable("json parse fail"));
            return C113554cx.LJJJLIIL();
        }
    }

    public static java.util.Map LIZJ(String str) {
        try {
            JSONObject optJSONObject = new JSONObject(str).optJSONObject("page_mode_config");
            if (optJSONObject != null) {
                int optInt = optJSONObject.optInt("page_mode", -1);
                int optInt2 = optJSONObject.optInt("lower_fps_min_side_threshold", 0);
                int optInt3 = optJSONObject.optInt("higher_fps_min_side_threshold", 0);
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                if (optInt >= 0 && LIZ(Integer.valueOf(optInt2)) && LIZ(Integer.valueOf(optInt3))) {
                    linkedHashMap.put("page_mode", Integer.valueOf(optInt));
                    linkedHashMap.put("lower_fps_min_side_threshold", Integer.valueOf(optInt2));
                    linkedHashMap.put("higher_fps_min_side_threshold", Integer.valueOf(optInt3));
                    return linkedHashMap;
                }
                return linkedHashMap;
            }
            return C113554cx.LJJJLIIL();
        } catch (JSONException unused) {
            H78.LIZLLL("expand_hw_decoder_list_by_bytebench", new Throwable("json parse page_mode_config fail"));
            return C113554cx.LJJJLIIL();
        }
    }
}
