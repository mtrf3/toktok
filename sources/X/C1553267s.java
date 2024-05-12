package X;

import android.graphics.Color;

/* renamed from: X.67s, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1553267s {
    public static final /* synthetic */ int LIZ = 0;

    public static final int LIZ(int i) {
        float f;
        int round;
        int round2;
        float[] fArr = new float[3];
        C07290Qj.LIZ(Color.red(i), Color.green(i), Color.blue(i), fArr);
        if (fArr[2] < 0.5d) {
            f = 0.9f;
        } else {
            f = 0.2f;
        }
        fArr[2] = f;
        int i2 = 0;
        float f2 = fArr[0];
        float abs = (1.0f - Math.abs((f * 2.0f) - 1.0f)) * fArr[1];
        float f3 = f - (0.5f * abs);
        float abs2 = (1.0f - Math.abs(((f2 / 60.0f) % 2.0f) - 1.0f)) * abs;
        switch (((int) f2) / 60) {
            case 0:
                i2 = Math.round((abs + f3) * 255.0f);
                round = Math.round((abs2 + f3) * 255.0f);
                round2 = Math.round(f3 * 255.0f);
                break;
            case 1:
                i2 = Math.round((abs2 + f3) * 255.0f);
                round = Math.round((abs + f3) * 255.0f);
                round2 = Math.round(f3 * 255.0f);
                break;
            case 2:
                i2 = Math.round(f3 * 255.0f);
                round = Math.round((abs + f3) * 255.0f);
                round2 = Math.round((abs2 + f3) * 255.0f);
                break;
            case 3:
                i2 = Math.round(f3 * 255.0f);
                round = Math.round((abs2 + f3) * 255.0f);
                round2 = Math.round((abs + f3) * 255.0f);
                break;
            case 4:
                i2 = Math.round((abs2 + f3) * 255.0f);
                round = Math.round(f3 * 255.0f);
                round2 = Math.round((abs + f3) * 255.0f);
                break;
            case 5:
            case 6:
                i2 = Math.round((abs + f3) * 255.0f);
                round = Math.round(f3 * 255.0f);
                round2 = Math.round((abs2 + f3) * 255.0f);
                break;
            default:
                round = 0;
                round2 = 0;
                break;
        }
        return Color.rgb(C07290Qj.LJIIJJI(i2), C07290Qj.LJIIJJI(round), C07290Qj.LJIIJJI(round2));
    }

    public static final int LIZIZ(int i) {
        if (C138525c8.LIZ()) {
            C07290Qj.LIZ(Color.red(i), Color.green(i), Color.blue(i), new float[3]);
            if (r3[2] > 0.5d) {
                return -16777216;
            }
            return -1;
        }
        if (i == -1) {
            return -16777216;
        }
        return -1;
    }
}
