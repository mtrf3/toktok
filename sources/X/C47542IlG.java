package X;

import android.text.TextUtils;
import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicFloatWindowOptimizeSetting;
import com.bytedance.mt.protector.impl.string2number.CastFloatProtector;
import com.ss.ttvideoengine.utils.TTVideoEngineLog;
import java.util.Collections;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.IlG, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C47542IlG {
    public final String LIZ = "";
    public final java.util.Map<Integer, Object> LIZIZ = Collections.synchronizedMap(new HashMap());
    public final java.util.Map<String, String> LIZJ = new HashMap();
    public String LIZLLL;

    public final void LJII() {
        float parseFloat;
        JSONObject jSONObject = null;
        String LJI = LJI(3, null, false);
        if (TextUtils.isEmpty(LJI)) {
            return;
        }
        synchronized (C47542IlG.class) {
            C47542IlG c47542IlG = C47606ImI.LIZ;
            if (LJI != null && TextUtils.equals(LJI, c47542IlG.LIZLLL)) {
                TTVideoEngineLog.d("TTVideoEngine.GearStrategy", "global parsed already");
                return;
            }
            if (TextUtils.equals(this.LIZLLL, LJI)) {
                TTVideoEngineLog.d("TTVideoEngine.GearStrategy", "parsed already");
                return;
            }
            this.LIZLLL = LJI;
            try {
                jSONObject = new JSONObject(LJI).optJSONObject("vod_strategy_select_bitrate");
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("parse success ");
                LIZ.append(LJI);
                TTVideoEngineLog.d("TTVideoEngine.GearStrategy", X1D.LIZIZ(LIZ));
            } catch (JSONException e) {
                C16880lQ.LLLLIIL(e);
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("parse error ");
                LIZ2.append(LJI);
                TTVideoEngineLog.d("TTVideoEngine.GearStrategy", X1D.LIZIZ(LIZ2));
            }
            if (jSONObject == null) {
                return;
            }
            if (jSONObject.has("strategy_type")) {
                LJIIIZ(1, jSONObject.optInt("strategy_type", -1));
            }
            if (jSONObject.has("strategy_module")) {
                LJIIIZ(2, jSONObject.optInt("strategy_module", -1));
            }
            if (jSONObject.has("switch_cs_model")) {
                LJIIIZ(44, jSONObject.optInt("switch_cs_model", 1));
            }
            if (jSONObject.has("fixed_level")) {
                LJIIIZ(45, jSONObject.optInt("fixed_level", 2));
            }
            if (jSONObject.has("startup_model")) {
                LJIIIZ(46, jSONObject.optInt("startup_model", 0));
            }
            if (jSONObject.has("startup_bandwidth_parameter")) {
                String optString = jSONObject.optString("startup_bandwidth_parameter");
                if (!TextUtils.isEmpty(optString)) {
                    try {
                        parseFloat = CastFloatProtector.parseFloat(optString);
                    } catch (NumberFormatException e2) {
                        C16880lQ.LLLLIIL(e2);
                    }
                    this.LIZIZ.put(47, Float.valueOf(parseFloat));
                }
                parseFloat = 0.9f;
                this.LIZIZ.put(47, Float.valueOf(parseFloat));
            }
            if (jSONObject.has("startup_first_param_str")) {
                LJIIIIZZ(C47756Ioi.LJIJ(jSONObject, "startup_first_param_str", LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX), 48);
            }
            if (jSONObject.has("startup_second_param_str")) {
                LJIIIIZZ(C47756Ioi.LJIJ(jSONObject, "startup_second_param_str", 2.67952228E-5d), 49);
            }
            if (jSONObject.has("startup_third_param_str")) {
                LJIIIIZZ(C47756Ioi.LJIJ(jSONObject, "startup_third_param_str", 0.151840652d), 50);
            }
            if (jSONObject.has("startup_fourth_param_str")) {
                LJIIIIZZ(C47756Ioi.LJIJ(jSONObject, "startup_fourth_param_str", 69.0106422d), 51);
            }
            if (jSONObject.has("startup_use_cache")) {
                LJIIIZ(52, jSONObject.optInt("startup_use_cache", 0));
            }
            if (jSONObject.has("flow_json")) {
                LJIIJJI(53, jSONObject.optString("flow_json"));
            }
            if (jSONObject.has("preload_json")) {
                LJIIJJI(54, jSONObject.optString("preload_json"));
            }
            if (jSONObject.has("startup_json")) {
                LJIIJJI(55, jSONObject.optString("startup_json"));
            }
            if (jSONObject.has("abr_pool_enable")) {
                LJIIIZ(56, jSONObject.optInt("abr_pool_enable", 0));
            }
            if (jSONObject.has("startup_algo_type")) {
                LJIIIZ(16, jSONObject.optInt("startup_algo_type", 0));
            }
            if (jSONObject.has("startup_speed_type")) {
                LJIIIZ(9, jSONObject.optInt("startup_speed_type", 4));
            }
            if (jSONObject.has("wifi_default_resolution_index")) {
                LJIIIZ(17, jSONObject.optInt("wifi_default_resolution_index", -1));
            }
            if (jSONObject.has("wifi_max_resolution_index")) {
                LJIIIZ(21, jSONObject.optInt("wifi_max_resolution_index", -1));
            }
            if (jSONObject.has("cellular_max_resolution_index")) {
                LJIIIZ(19, jSONObject.optInt("cellular_max_resolution_index", -1));
            }
            if (jSONObject.has("wifi_default_resolution_quality")) {
                LJIIJJI(18, jSONObject.optString("wifi_default_resolution_quality"));
            }
            if (jSONObject.has("wifi_max_resolution_quality")) {
                LJIIJJI(22, jSONObject.optString("wifi_max_resolution_quality"));
            }
            if (jSONObject.has("cellular_max_resolution_quality")) {
                LJIIJJI(20, jSONObject.optString("cellular_max_resolution_quality"));
            }
            if (jSONObject.has("startup_narrow_screen_use_width")) {
                LJIIIZ(31, jSONObject.optInt("startup_narrow_screen_use_width", 0));
            }
        }
    }

    public final float LIZIZ(boolean z) {
        C47542IlG c47542IlG;
        Object obj = this.LIZIZ.get(47);
        if (obj instanceof Float) {
            return ((Float) obj).floatValue();
        }
        if (!z || (c47542IlG = C47606ImI.LIZ) == this) {
            return -1.0f;
        }
        return c47542IlG.LIZIZ(false);
    }

    public final int LIZJ(int i) {
        return LIZLLL(i, -1, true);
    }

    public final String LJFF(int i) {
        return LJI(i, null, true);
    }

    public final double LIZ(boolean z, int i) {
        C47542IlG c47542IlG;
        Object obj = this.LIZIZ.get(Integer.valueOf(i));
        if (obj instanceof Double) {
            return ((Double) obj).doubleValue();
        }
        if (!z || (c47542IlG = C47606ImI.LIZ) == this) {
            return -1.0d;
        }
        return c47542IlG.LIZ(false, i);
    }

    public final Object LJ(int i, boolean z) {
        C47542IlG c47542IlG;
        Object obj = this.LIZIZ.get(Integer.valueOf(i));
        if (obj != null) {
            return obj;
        }
        if (!z || (c47542IlG = C47606ImI.LIZ) == this) {
            return null;
        }
        return c47542IlG.LJ(i, false);
    }

    public final void LJIIIIZZ(double d, int i) {
        this.LIZIZ.put(Integer.valueOf(i), Double.valueOf(d));
    }

    public final void LJIIIZ(int i, int i2) {
        this.LIZIZ.put(Integer.valueOf(i), Integer.valueOf(i2));
    }

    public final void LJIIJ(int i, int i2) {
        if (!this.LIZIZ.containsKey(Integer.valueOf(i))) {
            this.LIZIZ.put(Integer.valueOf(i), Integer.valueOf(i2));
        }
    }

    public final void LJIIJJI(int i, String str) {
        this.LIZIZ.put(Integer.valueOf(i), str);
    }

    public final int LIZLLL(int i, int i2, boolean z) {
        Object obj = this.LIZIZ.get(Integer.valueOf(i));
        if (obj instanceof Integer) {
            return ((Integer) obj).intValue();
        }
        if (z) {
            C47542IlG c47542IlG = C47606ImI.LIZ;
            if (c47542IlG == this) {
                return i2;
            }
            return c47542IlG.LIZLLL(i, i2, false);
        }
        return i2;
    }

    public final String LJI(int i, String str, boolean z) {
        Object obj = this.LIZIZ.get(Integer.valueOf(i));
        if (obj instanceof String) {
            return (String) obj;
        }
        if (z) {
            C47542IlG c47542IlG = C47606ImI.LIZ;
            if (c47542IlG == this) {
                return str;
            }
            return c47542IlG.LJI(i, str, false);
        }
        return str;
    }
}
