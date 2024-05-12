package X;

import android.content.Context;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.0WE, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0WE {
    public static final /* synthetic */ int LIZ = 0;

    public static final String LIZJ(int i, int i2, Integer num, Integer num2, boolean z) {
        int i3;
        int i4;
        if (num != null) {
            i3 = num.intValue();
        } else {
            i3 = 720;
        }
        if (num2 != null) {
            i4 = num2.intValue();
        } else {
            i4 = 1280;
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append(i3);
        LIZ2.append(' ');
        LIZ2.append(i4);
        LIZ2.append(' ');
        LIZ2.append(i);
        LIZ2.append(' ');
        LIZ2.append(i2);
        C0NB.LJIIIZ("getMultiAreaJsonStr", X1D.LIZIZ(LIZ2));
        float f = i3;
        float f2 = i;
        float f3 = f / f2;
        float f4 = i4;
        float f5 = i2;
        float f6 = f4 / f5;
        if (f6 <= f3) {
            f3 = f6;
        }
        float f7 = f2 * f3;
        float f8 = f5 * f3;
        float f9 = (f - f7) / 2.0f;
        float f10 = (f4 - f8) / 2.0f;
        return LIZIZ((int) f10, (int) f9, (int) (f8 + f10), (int) (f7 + f9), false, z);
    }

    public static String LIZ(int i, int i2, int i3, int i4, Context context, boolean z) {
        boolean z2;
        if (z) {
            i = C81185Vtd.LJ(context);
        }
        if (C15380j0.LJIIJJI() * 9 <= C15380j0.LJIIL() * 16) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            if (z) {
                i2 = C81185Vtd.LIZJ(context);
            }
            float f = i4;
            int i5 = (int) (((1 - (((i3 * 1.0f) / i) * ((i2 * 1.0f) / f))) * f) / 2);
            return LIZIZ(i5, 0, i4 - i5, i3, true, z);
        }
        if (z) {
            i2 = C81185Vtd.LIZJ(context) + C81185Vtd.LJFF(context);
        }
        float f2 = i3;
        int i6 = (int) (((1.0f - (((i * 1.0f) / f2) * ((i4 * 1.0f) / i2))) * f2) / 2);
        return LIZIZ(0, i6, i4, i3 - i6, true, z);
    }

    public static String LIZIZ(int i, int i2, int i3, int i4, boolean z, boolean z2) {
        String str;
        String str2;
        JSONObject jSONObject = new JSONObject();
        if (z) {
            str = "Single";
        } else {
            str = "Multi";
        }
        jSONObject.put("host", str);
        if (z2) {
            str2 = "Preview";
        } else {
            str2 = "Broadcast";
        }
        jSONObject.put("LiveScene", str2);
        jSONObject.put("top", i);
        jSONObject.put("down", i3);
        jSONObject.put("left", i2);
        jSONObject.put("right", i4);
        String jSONObject2 = jSONObject.toString();
        o.LJIIIIZZ(jSONObject2, "JSONObject().apply {\n   …ght)\n        }.toString()");
        return jSONObject2;
    }
}
