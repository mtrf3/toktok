package X;

import android.graphics.Color;

/* renamed from: X.0Qj, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C07290Qj {
    public static final ThreadLocal<double[]> LIZ = new ThreadLocal<>();

    public static double LJII(int i) {
        PTF LIZ2;
        ThreadLocal<double[]> threadLocal = LIZ;
        double[] dArr = threadLocal.get();
        if (dArr == null) {
            dArr = new double[3];
            threadLocal.set(dArr);
        }
        int red = Color.red(i);
        int green = Color.green(i);
        int blue = Color.blue(i);
        if (C65415Plr.LIZIZ()) {
            try {
                LIZJ(red, green, blue, dArr);
            } finally {
                if (LIZ2 == null) {
                }
            }
        }
        LIZJ(red, green, blue, dArr);
        return dArr[1] / 100.0d;
    }

    public static int LJIIJJI(int i) {
        if (i < 0) {
            return 0;
        }
        return Math.min(i, 255);
    }

    public static double LIZLLL(int i, int i2) {
        if (Color.alpha(i2) == 255) {
            if (Color.alpha(i) < 255) {
                i = LJIIIZ(i, i2);
            }
            double LJII = LJII(i) + 0.05d;
            double LJII2 = LJII(i2) + 0.05d;
            return Math.max(LJII, LJII2) / Math.min(LJII, LJII2);
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("background can not be translucent: #");
        LIZ2.append(Integer.toHexString(i2));
        throw new IllegalArgumentException(X1D.LIZIZ(LIZ2));
    }

    public static double LJI(int i, int i2) {
        if (C65415Plr.LIZIZ()) {
            try {
                return LIZLLL(i, i2);
            } catch (Throwable th) {
                Double d = (Double) C65857Psz.tryProtect(th, Double.class);
                if (d != null) {
                    return d.doubleValue();
                }
                throw th;
            }
        }
        return LIZLLL(i, i2);
    }

    public static int LJIIIZ(int i, int i2) {
        int alpha = Color.alpha(i2);
        int alpha2 = Color.alpha(i);
        int i3 = 255 - (((255 - alpha2) * (255 - alpha)) / 255);
        return Color.argb(i3, LJIIJ(Color.red(i), alpha2, Color.red(i2), alpha, i3), LJIIJ(Color.green(i), alpha2, Color.green(i2), alpha, i3), LJIIJ(Color.blue(i), alpha2, Color.blue(i2), alpha, i3));
    }

    public static int LJIIL(int i, int i2) {
        if (i2 >= 0 && i2 <= 255) {
            return (i & 16777215) | (i2 << 24);
        }
        throw new IllegalArgumentException("alpha must be between 0 and 255.");
    }

    public static int LIZIZ(double d, double d2, double d3) {
        double d4;
        double d5;
        double d6;
        double LIZ2 = C7MY.LIZ(d3, -0.4986d, ((-1.5372d) * d2) + (3.2406d * d), 100.0d);
        double LIZ3 = C7MY.LIZ(d3, 0.0415d, (1.8758d * d2) + ((-0.9689d) * d), 100.0d);
        double LIZ4 = C7MY.LIZ(d3, 1.057d, ((-0.204d) * d2) + (0.0557d * d), 100.0d);
        if (LIZ2 > 0.0031308d) {
            d4 = (Math.pow(LIZ2, 0.4166666666666667d) * 1.055d) - 0.055d;
        } else {
            d4 = LIZ2 * 12.92d;
        }
        if (LIZ3 > 0.0031308d) {
            d5 = (Math.pow(LIZ3, 0.4166666666666667d) * 1.055d) - 0.055d;
        } else {
            d5 = LIZ3 * 12.92d;
        }
        if (LIZ4 > 0.0031308d) {
            d6 = (Math.pow(LIZ4, 0.4166666666666667d) * 1.055d) - 0.055d;
        } else {
            d6 = LIZ4 * 12.92d;
        }
        return Color.rgb(LJIIJJI((int) Math.round(d4 * 255.0d)), LJIIJJI((int) Math.round(d5 * 255.0d)), LJIIJJI((int) Math.round(d6 * 255.0d)));
    }

    public static int LJ(float f, int i, int i2) {
        int i3 = 255;
        if (Color.alpha(i2) == 255) {
            double d = f;
            if (LJI(LJIIL(i, 255), i2) < d) {
                return -1;
            }
            int i4 = 0;
            int i5 = 0;
            do {
                int i6 = (i5 + i3) / 2;
                if (LJI(LJIIL(i, i6), i2) < d) {
                    i5 = i6;
                } else {
                    i3 = i6;
                }
                i4++;
                if (i4 > 10) {
                    break;
                }
            } while (i3 - i5 > 1);
            return i3;
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("background can not be translucent: #");
        LIZ2.append(Integer.toHexString(i2));
        throw new IllegalArgumentException(X1D.LIZIZ(LIZ2));
    }

    public static int LJFF(float f, int i, int i2) {
        float f2 = 1.0f - f;
        return Color.argb((int) ((Color.alpha(i2) * f) + (Color.alpha(i) * f2)), (int) ((Color.red(i2) * f) + (Color.red(i) * f2)), (int) ((Color.green(i2) * f) + (Color.green(i) * f2)), (int) ((Color.blue(i2) * f) + (Color.blue(i) * f2)));
    }

    public static int LJIIIIZZ(float f, int i, int i2) {
        if (C65415Plr.LIZIZ()) {
            try {
                return LJ(f, i, i2);
            } catch (Throwable th) {
                Integer num = (Integer) C65857Psz.tryProtect(th, Integer.class);
                if (num != null) {
                    return num.intValue();
                }
                throw th;
            }
        }
        return LJ(f, i, i2);
    }

    public static void LIZ(int i, int i2, int i3, float[] fArr) {
        float LIZ2;
        float abs;
        float min;
        float min2;
        float f = i / 255.0f;
        float f2 = i2 / 255.0f;
        float f3 = i3 / 255.0f;
        float max = Math.max(f, Math.max(f2, f3));
        float min3 = Math.min(f, Math.min(f2, f3));
        float f4 = max - min3;
        float f5 = (max + min3) / 2.0f;
        float f6 = 0.0f;
        if (max == min3) {
            LIZ2 = 0.0f;
            abs = 0.0f;
        } else {
            if (max == f) {
                LIZ2 = ((f2 - f3) / f4) % 6.0f;
            } else if (max == f2) {
                LIZ2 = C1I0.LIZ(f3, f, f4, 2.0f);
            } else {
                LIZ2 = C1I0.LIZ(f, f2, f4, 4.0f);
            }
            abs = f4 / (1.0f - Math.abs((2.0f * f5) - 1.0f));
        }
        float f7 = (LIZ2 * 60.0f) % 360.0f;
        if (f7 < 0.0f) {
            f7 += 360.0f;
        }
        if (f7 < 0.0f) {
            min = 0.0f;
        } else {
            min = Math.min(f7, 360.0f);
        }
        fArr[0] = min;
        if (abs < 0.0f) {
            min2 = 0.0f;
        } else {
            min2 = Math.min(abs, 1.0f);
        }
        fArr[1] = min2;
        if (f5 >= 0.0f) {
            f6 = Math.min(f5, 1.0f);
        }
        fArr[2] = f6;
    }

    public static void LIZJ(int i, int i2, int i3, double[] dArr) {
        double pow;
        double pow2;
        double pow3;
        if (dArr.length == 3) {
            double d = i / 255.0d;
            if (d < 0.04045d) {
                pow = d / 12.92d;
            } else {
                pow = Math.pow((d + 0.055d) / 1.055d, 2.4d);
            }
            double d2 = i2 / 255.0d;
            if (d2 < 0.04045d) {
                pow2 = d2 / 12.92d;
            } else {
                pow2 = Math.pow((d2 + 0.055d) / 1.055d, 2.4d);
            }
            double d3 = i3 / 255.0d;
            if (d3 < 0.04045d) {
                pow3 = d3 / 12.92d;
            } else {
                pow3 = Math.pow((d3 + 0.055d) / 1.055d, 2.4d);
            }
            dArr[0] = ((0.1805d * pow3) + (0.3576d * pow2) + (0.4124d * pow)) * 100.0d;
            dArr[1] = ((0.0722d * pow3) + (0.7152d * pow2) + (0.2126d * pow)) * 100.0d;
            dArr[2] = ((pow3 * 0.9505d) + (pow2 * 0.1192d) + (pow * 0.0193d)) * 100.0d;
            return;
        }
        throw new IllegalArgumentException("outXyz must have a length of 3.");
    }

    public static int LJIIJ(int i, int i2, int i3, int i4, int i5) {
        if (i5 == 0) {
            return 0;
        }
        return (((255 - i2) * (i3 * i4)) + ((i * 255) * i2)) / (i5 * 255);
    }
}
