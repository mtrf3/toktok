package X;

import kotlin.jvm.internal.o;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.Iec, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C47130Iec {
    public static int LIZ;
    public static int LIZIZ = -1;

    public static final float LIZIZ() {
        String str;
        double optDouble;
        float volLoudUnity;
        try {
            Object value = IZ8.C0.getValue();
            o.LJIIIIZZ(value, "<get-audioEffectConfigJson>(...)");
            str = (String) value;
        } catch (Throwable unused) {
            str = null;
        }
        if (C78685UuP.LJJJZ(str)) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                int LIZLLL = LIZLLL();
                if (LIZLLL == 1) {
                    optDouble = jSONObject.optDouble("small_spl_target_LU", 1.401298464324817E-45d);
                } else if (LIZLLL != 2) {
                    if (LIZLLL == 3) {
                        optDouble = jSONObject.optDouble("large_spl_target_LU", 1.401298464324817E-45d);
                    }
                } else {
                    optDouble = jSONObject.optDouble("medium_spl_target_LU", 1.401298464324817E-45d);
                }
                float f = (float) optDouble;
                if (f != Float.MIN_VALUE) {
                    return f;
                }
            } catch (JSONException e) {
                C16880lQ.LLLLIIL(e);
            }
        }
        try {
            volLoudUnity = IUB.LIZIZ().getVolLoudUnity();
        } catch (Throwable unused2) {
        }
        if (volLoudUnity == 0.0f) {
            return -12.0f;
        }
        return volLoudUnity;
    }

    public static final synchronized int LIZLLL() {
        synchronized (C47130Iec.class) {
            int LIZLLL = C47636Imm.LIZLLL();
            if (LIZLLL == LIZ) {
                int i = LIZIZ;
                if (i != -1) {
                    return i;
                }
            }
            try {
                LIZ = LIZLLL;
                int L = C47131Ied.LIZ.L(LIZ);
                LIZIZ = L;
                return L;
            } catch (Throwable unused) {
                return -1;
            }
        }
    }

    public static final float LIZ(String str) {
        float LJ = LJ(str);
        float LIZIZ2 = LIZIZ();
        if (!LIZJ(Float.valueOf(LJ)) || !LIZJ(Float.valueOf(LIZIZ2))) {
            return Float.MIN_VALUE;
        }
        return LJ - LIZIZ2;
    }

    public static final boolean LIZJ(Float f) {
        if (f == null || o.LIZJ(f, Float.MIN_VALUE)) {
            return false;
        }
        return true;
    }

    public static final float LJ(String str) {
        boolean z;
        if (str == null || str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return Float.MIN_VALUE;
        }
        try {
            return (float) new JSONObject(str).optDouble("Loudness", 1.401298464324817E-45d);
        } catch (JSONException e) {
            C16880lQ.LLLLIIL(e);
            return Float.MIN_VALUE;
        }
    }
}
