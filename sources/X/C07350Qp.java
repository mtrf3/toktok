package X;

import android.graphics.Path;
import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicFloatWindowOptimizeSetting;
import com.bytedance.android.livesdk.livesetting.other.subscribe_enhance.SubscriptionExpireRemindHourSetting;

/* renamed from: X.0Qp, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C07350Qp {
    public char LIZ;
    public final float[] LIZIZ;

    public C07350Qp(C07350Qp c07350Qp) {
        this.LIZ = c07350Qp.LIZ;
        float[] fArr = c07350Qp.LIZIZ;
        this.LIZIZ = C07360Qq.LIZIZ(fArr.length, fArr);
    }

    public C07350Qp(char c, float[] fArr) {
        this.LIZ = c;
        this.LIZIZ = fArr;
    }

    public static void LIZIZ(C07350Qp[] c07350QpArr, Path path) {
        int i;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        float[] fArr = new float[6];
        char c = 'm';
        char c2 = 0;
        char c3 = 'm';
        int i2 = 0;
        while (i2 < c07350QpArr.length) {
            C07350Qp c07350Qp = c07350QpArr[i2];
            char c4 = c07350Qp.LIZ;
            float[] fArr2 = c07350Qp.LIZIZ;
            float f7 = fArr[c2];
            float f8 = fArr[1];
            float f9 = fArr[2];
            float f10 = fArr[3];
            float f11 = fArr[4];
            float f12 = fArr[5];
            switch (c4) {
                case 'A':
                case 'a':
                    i = 7;
                    break;
                case 'C':
                case 'c':
                    i = 6;
                    break;
                case SubscriptionExpireRemindHourSetting.DEFAULT /* 72 */:
                case 'V':
                case 'h':
                case 'v':
                    i = 1;
                    break;
                case 'Q':
                case 'S':
                case 'q':
                case 's':
                    i = 4;
                    break;
                case 'Z':
                case 'z':
                    path.close();
                    path.moveTo(f11, f12);
                    f7 = f11;
                    f9 = f11;
                    f8 = f12;
                    f10 = f12;
                    break;
            }
            i = 2;
            int i3 = 0;
            while (i3 < fArr2.length) {
                if (c4 != 'A') {
                    if (c4 != 'C') {
                        if (c4 != 'H') {
                            if (c4 != 'Q') {
                                if (c4 != 'V') {
                                    if (c4 != 'a') {
                                        if (c4 != 'c') {
                                            if (c4 != 'h') {
                                                if (c4 != 'q') {
                                                    if (c4 != 'v') {
                                                        if (c4 != 'L') {
                                                            if (c4 != 'M') {
                                                                if (c4 != 'S') {
                                                                    if (c4 != 'T') {
                                                                        if (c4 != 'l') {
                                                                            if (c4 != c) {
                                                                                if (c4 != 's') {
                                                                                    if (c4 == 't') {
                                                                                        if (c3 == 'q' || c3 == 't' || c3 == 'Q' || c3 == 'T') {
                                                                                            f5 = f7 - f9;
                                                                                            f6 = f8 - f10;
                                                                                        } else {
                                                                                            f6 = 0.0f;
                                                                                            f5 = 0.0f;
                                                                                        }
                                                                                        int i4 = i3 + 1;
                                                                                        path.rQuadTo(f5, f6, fArr2[i3], fArr2[i4]);
                                                                                        f9 = f5 + f7;
                                                                                        f10 = f6 + f8;
                                                                                        f7 += fArr2[i3];
                                                                                        f8 += fArr2[i4];
                                                                                    }
                                                                                } else {
                                                                                    if (c3 == 'c' || c3 == 's' || c3 == 'C' || c3 == 'S') {
                                                                                        f3 = f7 - f9;
                                                                                        f4 = f8 - f10;
                                                                                    } else {
                                                                                        f3 = 0.0f;
                                                                                        f4 = 0.0f;
                                                                                    }
                                                                                    i3 = i3;
                                                                                    int i5 = i3 + 1;
                                                                                    int i6 = i3 + 2;
                                                                                    int i7 = i3 + 3;
                                                                                    path.rCubicTo(f3, f4, fArr2[i3], fArr2[i5], fArr2[i6], fArr2[i7]);
                                                                                    f9 = fArr2[i3] + f7;
                                                                                    f10 = fArr2[i5] + f8;
                                                                                    f7 += fArr2[i6];
                                                                                    f = fArr2[i7];
                                                                                }
                                                                            } else {
                                                                                float f13 = fArr2[i3];
                                                                                f7 += f13;
                                                                                float f14 = fArr2[i3 + 1];
                                                                                f8 += f14;
                                                                                if (i3 > 0) {
                                                                                    path.rLineTo(f13, f14);
                                                                                } else {
                                                                                    path.rMoveTo(f13, f14);
                                                                                    f12 = f8;
                                                                                    f11 = f7;
                                                                                    f7 = f11;
                                                                                    f8 = f12;
                                                                                }
                                                                            }
                                                                        } else {
                                                                            int i8 = i3 + 1;
                                                                            path.rLineTo(fArr2[i3], fArr2[i8]);
                                                                            f7 += fArr2[i3];
                                                                            f2 = fArr2[i8];
                                                                        }
                                                                    } else {
                                                                        if (c3 == 'q' || c3 == 't' || c3 == 'Q' || c3 == 'T') {
                                                                            f7 = (f7 * 2.0f) - f9;
                                                                            f8 = (f8 * 2.0f) - f10;
                                                                        }
                                                                        int i9 = i3 + 1;
                                                                        path.quadTo(f7, f8, fArr2[i3], fArr2[i9]);
                                                                        f10 = f8;
                                                                        f9 = f7;
                                                                        c4 = 'T';
                                                                        f7 = fArr2[i3];
                                                                        f8 = fArr2[i9];
                                                                    }
                                                                } else {
                                                                    if (c3 == 'c' || c3 == 's' || c3 == 'C' || c3 == 'S') {
                                                                        f7 = (f7 * 2.0f) - f9;
                                                                        f8 = (f8 * 2.0f) - f10;
                                                                    }
                                                                    int i10 = i3 + 1;
                                                                    int i11 = i3 + 2;
                                                                    int i12 = i3 + 3;
                                                                    path.cubicTo(f7, f8, fArr2[i3], fArr2[i10], fArr2[i11], fArr2[i12]);
                                                                    f9 = fArr2[i3];
                                                                    f10 = fArr2[i10];
                                                                    f7 = fArr2[i11];
                                                                    f8 = fArr2[i12];
                                                                }
                                                            } else {
                                                                f7 = fArr2[i3];
                                                                f8 = fArr2[i3 + 1];
                                                                if (i3 > 0) {
                                                                    path.lineTo(f7, f8);
                                                                } else {
                                                                    path.moveTo(f7, f8);
                                                                    f11 = f7;
                                                                    f12 = f8;
                                                                    f7 = f11;
                                                                    f8 = f12;
                                                                }
                                                            }
                                                        } else {
                                                            int i13 = i3 + 1;
                                                            path.lineTo(fArr2[i3], fArr2[i13]);
                                                            f7 = fArr2[i3];
                                                            f8 = fArr2[i13];
                                                        }
                                                    } else {
                                                        path.rLineTo(0.0f, fArr2[i3]);
                                                        f2 = fArr2[i3];
                                                    }
                                                    f8 += f2;
                                                } else {
                                                    int i14 = i3 + 1;
                                                    int i15 = i3 + 2;
                                                    int i16 = i3 + 3;
                                                    path.rQuadTo(fArr2[i3], fArr2[i14], fArr2[i15], fArr2[i16]);
                                                    f9 = fArr2[i3] + f7;
                                                    f10 = fArr2[i14] + f8;
                                                    f7 += fArr2[i15];
                                                    f = fArr2[i16];
                                                }
                                            } else {
                                                path.rLineTo(fArr2[i3], 0.0f);
                                                f7 += fArr2[i3];
                                            }
                                        } else {
                                            int i17 = i3 + 2;
                                            int i18 = i3 + 3;
                                            int i19 = i3 + 4;
                                            int i20 = i3 + 5;
                                            path.rCubicTo(fArr2[i3], fArr2[i3 + 1], fArr2[i17], fArr2[i18], fArr2[i19], fArr2[i20]);
                                            f9 = fArr2[i17] + f7;
                                            f10 = fArr2[i18] + f8;
                                            f7 += fArr2[i19];
                                            f = fArr2[i20];
                                        }
                                        f8 += f;
                                    } else {
                                        int i21 = i3 + 5;
                                        float f15 = fArr2[i21] + f7;
                                        int i22 = i3 + 6;
                                        float f16 = fArr2[i22] + f8;
                                        float f17 = fArr2[i3];
                                        float f18 = fArr2[i3 + 1];
                                        float f19 = fArr2[i3 + 2];
                                        if (fArr2[i3 + 3] != 0.0f) {
                                            z3 = true;
                                        } else {
                                            z3 = false;
                                        }
                                        if (fArr2[i3 + 4] != 0.0f) {
                                            z4 = true;
                                        } else {
                                            z4 = false;
                                        }
                                        c4 = 'a';
                                        LIZ(path, f7, f8, f15, f16, f17, f18, f19, z3, z4);
                                        f7 += fArr2[i21];
                                        f8 += fArr2[i22];
                                    }
                                } else {
                                    c4 = 'V';
                                    path.lineTo(f7, fArr2[i3]);
                                    f8 = fArr2[i3];
                                }
                            } else {
                                c4 = 'Q';
                                int i23 = i3 + 1;
                                int i24 = i3 + 2;
                                int i25 = i3 + 3;
                                path.quadTo(fArr2[i3], fArr2[i23], fArr2[i24], fArr2[i25]);
                                f9 = fArr2[i3];
                                f10 = fArr2[i23];
                                f7 = fArr2[i24];
                                f8 = fArr2[i25];
                            }
                        } else {
                            c4 = 'H';
                            path.lineTo(fArr2[i3], f8);
                            f7 = fArr2[i3];
                        }
                    } else {
                        c4 = 'C';
                        int i26 = i3 + 2;
                        int i27 = i3 + 3;
                        int i28 = i3 + 4;
                        int i29 = i3 + 5;
                        path.cubicTo(fArr2[i3], fArr2[i3 + 1], fArr2[i26], fArr2[i27], fArr2[i28], fArr2[i29]);
                        f7 = fArr2[i28];
                        f8 = fArr2[i29];
                        f9 = fArr2[i26];
                        f10 = fArr2[i27];
                    }
                    i3 += i;
                    c3 = c4;
                    c = 'm';
                } else {
                    c4 = 'A';
                    int i30 = i3 + 5;
                    float f20 = fArr2[i30];
                    int i31 = i3 + 6;
                    float f21 = fArr2[i31];
                    float f22 = fArr2[i3];
                    float f23 = fArr2[i3 + 1];
                    float f24 = fArr2[i3 + 2];
                    if (fArr2[i3 + 3] != 0.0f) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (fArr2[i3 + 4] != 0.0f) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    LIZ(path, f7, f8, f20, f21, f22, f23, f24, z, z2);
                    f7 = fArr2[i30];
                    f8 = fArr2[i31];
                }
                f10 = f8;
                f9 = f7;
                i3 += i;
                c3 = c4;
                c = 'm';
            }
            fArr[0] = f7;
            fArr[1] = f8;
            fArr[2] = f9;
            fArr[3] = f10;
            fArr[4] = f11;
            fArr[5] = f12;
            c3 = c07350QpArr[i2].LIZ;
            i2++;
            c = 'm';
            c2 = 0;
        }
    }

    public static void LIZ(Path path, float f, float f2, float f3, float f4, float f5, float f6, float f7, boolean z, boolean z2) {
        double d;
        double d2;
        boolean z3;
        double radians = Math.toRadians(f7);
        double cos = Math.cos(radians);
        double sin = Math.sin(radians);
        double d3 = f;
        double d4 = f2;
        double d5 = f5;
        double d6 = ((d4 * sin) + (d3 * cos)) / d5;
        double d7 = f6;
        double d8 = ((d4 * cos) + ((-f) * sin)) / d7;
        double d9 = f4;
        double LIZ = C7MY.LIZ(d9, sin, f3 * cos, d5);
        double LIZ2 = C7MY.LIZ(d9, cos, (-f3) * sin, d7);
        double d10 = d6 - LIZ;
        double d11 = d8 - LIZ2;
        double d12 = (d6 + LIZ) / 2.0d;
        double d13 = (d8 + LIZ2) / 2.0d;
        double d14 = (d11 * d11) + (d10 * d10);
        if (d14 == LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX) {
            return;
        }
        double d15 = (1.0d / d14) - 0.25d;
        if (d15 < LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX) {
            float sqrt = (float) (Math.sqrt(d14) / 1.99999d);
            LIZ(path, f, f2, f3, f4, f5 * sqrt, f6 * sqrt, f7, z, z2);
            return;
        }
        double sqrt2 = Math.sqrt(d15);
        double d16 = d10 * sqrt2;
        double d17 = sqrt2 * d11;
        if (z == z2) {
            d = d12 - d17;
            d2 = d13 + d16;
        } else {
            d = d12 + d17;
            d2 = d13 - d16;
        }
        double atan2 = Math.atan2(d8 - d2, d6 - d);
        double atan22 = Math.atan2(LIZ2 - d2, LIZ - d) - atan2;
        if (atan22 >= LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (z2 != z3) {
            if (atan22 > LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX) {
                atan22 -= 6.283185307179586d;
            } else {
                atan22 += 6.283185307179586d;
            }
        }
        double d18 = d * d5;
        double d19 = d2 * d7;
        double d20 = (d18 * cos) - (d19 * sin);
        double d21 = (d19 * cos) + (d18 * sin);
        int ceil = (int) Math.ceil(Math.abs((4.0d * atan22) / 3.141592653589793d));
        double cos2 = Math.cos(radians);
        double sin2 = Math.sin(radians);
        double cos3 = Math.cos(atan2);
        double sin3 = Math.sin(atan2);
        double d22 = -d5;
        double d23 = d22 * cos2;
        double d24 = d7 * sin2;
        double d25 = (d23 * sin3) - (d24 * cos3);
        double d26 = d22 * sin2;
        double d27 = d7 * cos2;
        double d28 = (cos3 * d27) + (sin3 * d26);
        double d29 = atan22 / ceil;
        int i = 0;
        while (i < ceil) {
            double d30 = atan2 + d29;
            double sin4 = Math.sin(d30);
            double cos4 = Math.cos(d30);
            double LIZ3 = C207798Dn.LIZ(d5, cos2, cos4, d20) - (d24 * sin4);
            double LIZ4 = (d27 * sin4) + C207798Dn.LIZ(d5, sin2, cos4, d21);
            double d31 = (d23 * sin4) - (d24 * cos4);
            double d32 = (cos4 * d27) + (sin4 * d26);
            double d33 = d30 - atan2;
            double tan = Math.tan(d33 / 2.0d);
            double sqrt3 = ((Math.sqrt(((tan * 3.0d) * tan) + 4.0d) - 1.0d) * Math.sin(d33)) / 3.0d;
            path.rLineTo(0.0f, 0.0f);
            path.cubicTo((float) ((d25 * sqrt3) + d3), (float) ((d28 * sqrt3) + d4), (float) (LIZ3 - (sqrt3 * d31)), (float) (LIZ4 - (sqrt3 * d32)), (float) LIZ3, (float) LIZ4);
            i++;
            d3 = LIZ3;
            d4 = LIZ4;
            atan2 = d30;
            d28 = d32;
            d25 = d31;
        }
    }
}
