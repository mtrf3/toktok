package X;

import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;
import ujb.s;

/* renamed from: X.V8u, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C79260V8u {
    public static List<String> LIZ = new ArrayList();
    public static boolean LIZIZ = true;
    public static boolean LIZJ = true;

    public static final boolean LIZIZ(Effect effect) {
        String sdkExtra;
        if (effect != null && (sdkExtra = effect.getSdkExtra()) != null && s.LJJJLZIJ(sdkExtra, "pl", false) && s.LJJJLZIJ(sdkExtra, "alg", false)) {
            try {
                return new JSONObject(effect.getSdkExtra()).has("pl");
            } catch (Exception e) {
                C16880lQ.LLLLIIL(e);
            }
        }
        return false;
    }

    public static C44946HkU LIZ(Effect effect, boolean z) {
        String sdkExtra;
        int i;
        boolean z2;
        boolean z3;
        boolean z4;
        if (effect != null && (sdkExtra = effect.getSdkExtra()) != null) {
            int i2 = 0;
            if (!s.LJJJLZIJ(sdkExtra, "pl", false) || !s.LJJJLZIJ(sdkExtra, "alg", false)) {
                return null;
            }
            try {
                JSONObject optJSONObject = new JSONObject(sdkExtra).optJSONObject("pl");
                if (optJSONObject != null) {
                    z3 = true;
                    try {
                        if (optJSONObject.has("min_count")) {
                            if (optJSONObject.has("max_count") && z) {
                                try {
                                    i = optJSONObject.optInt("min_count");
                                } catch (Exception e) {
                                    e = e;
                                    z3 = true;
                                    i = 0;
                                    z2 = true;
                                    C16880lQ.LLLLIIL(e);
                                    z4 = z3;
                                    z3 = z2;
                                    return new C44946HkU(z3, z4, i, i2, null, 48);
                                }
                                try {
                                    i2 = optJSONObject.optInt("max_count");
                                    z4 = true;
                                } catch (Exception e2) {
                                    e = e2;
                                    z2 = true;
                                    C16880lQ.LLLLIIL(e);
                                    z4 = z3;
                                    z3 = z2;
                                    return new C44946HkU(z3, z4, i, i2, null, 48);
                                }
                            }
                        }
                        z4 = false;
                        i = 0;
                    } catch (Exception e3) {
                        e = e3;
                        z3 = false;
                    }
                } else {
                    z4 = false;
                    i = 0;
                    z3 = false;
                }
            } catch (Exception e4) {
                e = e4;
                i = 0;
                z2 = false;
                z3 = false;
            }
            return new C44946HkU(z3, z4, i, i2, null, 48);
        }
        return null;
    }
}
