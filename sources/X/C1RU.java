package X;

import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicFloatWindowOptimizeSetting;
import java.util.Arrays;
import kotlin.jvm.internal.IDqS416S0100000;
import kotlin.jvm.internal.o;

/* renamed from: X.1RU, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1RU extends AbstractC13230fX {
    public static final AnonymousClass216 LJIILL = AnonymousClass216.LJLIL;
    public final C1RW LIZLLL;
    public final float LJ;
    public final float LJFF;
    public final C1RV LJI;
    public final float[] LJII;
    public final float[] LJIIIIZZ;
    public final float[] LJIIIZ;
    public final InterfaceC88472Yns<Double, Double> LJIIJ;
    public final IDqS416S0100000 LJIIJJI;
    public final InterfaceC88472Yns<Double, Double> LJIIL;
    public final IDqS416S0100000 LJIILIIL;
    public final boolean LJIILJJIL;

    @Override // X.AbstractC13230fX
    public final int hashCode() {
        int floatToIntBits;
        int floatToIntBits2;
        int hashCode = (Arrays.hashCode(this.LJII) + ((this.LIZLLL.hashCode() + (super.hashCode() * 31)) * 31)) * 31;
        float f = this.LJ;
        int i = 0;
        if (f == 0.0f) {
            floatToIntBits = 0;
        } else {
            floatToIntBits = Float.floatToIntBits(f);
        }
        int i2 = (hashCode + floatToIntBits) * 31;
        float f2 = this.LJFF;
        if (f2 == 0.0f) {
            floatToIntBits2 = 0;
        } else {
            floatToIntBits2 = Float.floatToIntBits(f2);
        }
        int i3 = (i2 + floatToIntBits2) * 31;
        C1RV c1rv = this.LJI;
        if (c1rv != null) {
            i = c1rv.hashCode();
        }
        int i4 = i3 + i;
        if (this.LJI == null) {
            return QZY.LIZIZ(this.LJIIJ, i4 * 31, 31) + this.LJIIL.hashCode();
        }
        return i4;
    }

    @Override // X.AbstractC13230fX
    public final boolean LIZLLL() {
        return this.LJIILJJIL;
    }

    @Override // X.AbstractC13230fX
    public final float[] LIZ(float[] v) {
        o.LJIIIZ(v, "v");
        C79146V4k.LJJJLIIL(this.LJIIIZ, v);
        v[0] = (float) ((Number) this.LJIIJJI.invoke(Double.valueOf(v[0]))).doubleValue();
        v[1] = (float) ((Number) this.LJIIJJI.invoke(Double.valueOf(v[1]))).doubleValue();
        v[2] = (float) ((Number) this.LJIIJJI.invoke(Double.valueOf(v[2]))).doubleValue();
        return v;
    }

    @Override // X.AbstractC13230fX
    public final float LIZIZ(int i) {
        return this.LJFF;
    }

    @Override // X.AbstractC13230fX
    public final float LIZJ(int i) {
        return this.LJ;
    }

    @Override // X.AbstractC13230fX
    public final float[] LJ(float[] fArr) {
        fArr[0] = (float) ((Number) this.LJIILIIL.invoke(Double.valueOf(fArr[0]))).doubleValue();
        fArr[1] = (float) ((Number) this.LJIILIIL.invoke(Double.valueOf(fArr[1]))).doubleValue();
        fArr[2] = (float) ((Number) this.LJIILIIL.invoke(Double.valueOf(fArr[2]))).doubleValue();
        C79146V4k.LJJJLIIL(this.LJIIIIZZ, fArr);
        return fArr;
    }

    @Override // X.AbstractC13230fX
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !o.LJ(C65352Pkq.LIZ(C1RU.class), C65352Pkq.LIZ(obj.getClass())) || !super.equals(obj)) {
            return false;
        }
        C1RU c1ru = (C1RU) obj;
        if (Float.compare(c1ru.LJ, this.LJ) != 0 || Float.compare(c1ru.LJFF, this.LJFF) != 0 || !o.LJ(this.LIZLLL, c1ru.LIZLLL) || !Arrays.equals(this.LJII, c1ru.LJII)) {
            return false;
        }
        C1RV c1rv = this.LJI;
        if (c1rv != null) {
            return o.LJ(c1rv, c1ru.LJI);
        }
        if (c1ru.LJI == null) {
            return true;
        }
        if (!o.LJ(this.LJIIJ, c1ru.LJIIJ)) {
            return false;
        }
        return o.LJ(this.LJIIL, c1ru.LJIIL);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C1RU(java.lang.String r14, float[] r15, X.C1RW r16, X.C1RV r17, int r18) {
        /*
            r13 = this;
            java.lang.String r0 = "whitePoint"
            r5 = r16
            kotlin.jvm.internal.o.LJIIIZ(r5, r0)
            r6 = 0
            r11 = r17
            double r1 = r11.LJLJJLL
            r3 = 0
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 != 0) goto L46
            double r1 = r11.LJLJL
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 != 0) goto L46
            kotlin.jvm.internal.IDqS416S0100000 r7 = new kotlin.jvm.internal.IDqS416S0100000
            r0 = 210(0xd2, float:2.94E-43)
            r7.<init>(r11, r0)
        L1f:
            double r1 = r11.LJLJJLL
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 != 0) goto L3e
            double r1 = r11.LJLJL
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 != 0) goto L3e
            kotlin.jvm.internal.IDqS416S0100000 r8 = new kotlin.jvm.internal.IDqS416S0100000
            r0 = 212(0xd4, float:2.97E-43)
            r8.<init>(r11, r0)
        L32:
            r9 = 0
            r10 = 1065353216(0x3f800000, float:1.0)
            r3 = r14
            r2 = r13
            r4 = r15
            r12 = r18
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            return
        L3e:
            kotlin.jvm.internal.IDqS416S0100000 r8 = new kotlin.jvm.internal.IDqS416S0100000
            r0 = 213(0xd5, float:2.98E-43)
            r8.<init>(r11, r0)
            goto L32
        L46:
            kotlin.jvm.internal.IDqS416S0100000 r7 = new kotlin.jvm.internal.IDqS416S0100000
            r0 = 211(0xd3, float:2.96E-43)
            r7.<init>(r11, r0)
            goto L1f
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1RU.<init>(java.lang.String, float[], X.1RW, X.1RV, int):void");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C1RU(java.lang.String r24, float[] r25, X.C1RW r26, double r27, float r29, float r30, int r31) {
        /*
            r23 = this;
            java.lang.String r0 = "whitePoint"
            r6 = r26
            kotlin.jvm.internal.o.LJIIIZ(r6, r0)
            r7 = 0
            r4 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            r0 = r27
            int r3 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r3 != 0) goto L43
            r2 = 1
        L11:
            X.216 r9 = X.C1RU.LJIILL
            if (r2 == 0) goto L3d
            r8 = r9
        L16:
            if (r3 != 0) goto L37
        L18:
            X.1RV r12 = new X.1RV
            r15 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            r17 = 0
            r12 = r12
            r13 = r0
            r19 = r17
            r21 = r17
            r12.<init>(r13, r15, r17, r19, r21)
            r10 = r29
            r11 = r30
            r3 = r23
            r13 = r31
            r4 = r24
            r5 = r25
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            return
        L37:
            X.215 r9 = new X.215
            r9.<init>(r0)
            goto L18
        L3d:
            X.214 r8 = new X.214
            r8.<init>(r0)
            goto L16
        L43:
            r2 = 0
            goto L11
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1RU.<init>(java.lang.String, float[], X.1RW, double, float, float, int):void");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1RU(String name, float[] primaries, C1RW whitePoint, float[] fArr, InterfaceC88472Yns<? super Double, Double> oetf, InterfaceC88472Yns<? super Double, Double> eotf, float f, float f2, C1RV c1rv, int i) {
        super(name, C13210fV.LIZ, i);
        boolean z;
        o.LJIIIZ(name, "name");
        o.LJIIIZ(primaries, "primaries");
        o.LJIIIZ(whitePoint, "whitePoint");
        o.LJIIIZ(oetf, "oetf");
        o.LJIIIZ(eotf, "eotf");
        this.LIZLLL = whitePoint;
        this.LJ = f;
        this.LJFF = f2;
        this.LJI = c1rv;
        this.LJIIJ = oetf;
        this.LJIIJJI = new IDqS416S0100000(this, 215);
        this.LJIIL = eotf;
        this.LJIILIIL = new IDqS416S0100000(this, 214);
        if (primaries.length == 6 || primaries.length == 9) {
            if (f < f2) {
                float[] fArr2 = new float[6];
                if (primaries.length == 9) {
                    float f3 = primaries[0];
                    float f4 = primaries[1];
                    float f5 = f3 + f4 + primaries[2];
                    fArr2[0] = f3 / f5;
                    fArr2[1] = f4 / f5;
                    float f6 = primaries[3];
                    float f7 = primaries[4];
                    float f8 = f6 + f7 + primaries[5];
                    fArr2[2] = f6 / f8;
                    fArr2[3] = f7 / f8;
                    float f9 = primaries[6];
                    float f10 = primaries[7];
                    float f11 = f9 + f10 + primaries[8];
                    fArr2[4] = f9 / f11;
                    fArr2[5] = f10 / f11;
                } else {
                    System.arraycopy(primaries, 0, fArr2, 0, 6);
                }
                this.LJII = fArr2;
                if (fArr == null) {
                    float f12 = fArr2[0];
                    float f13 = fArr2[1];
                    float f14 = fArr2[2];
                    float f15 = fArr2[3];
                    float f16 = fArr2[4];
                    float f17 = fArr2[5];
                    float f18 = whitePoint.LJLIL;
                    float f19 = whitePoint.LJLILLLLZI;
                    float f20 = 1;
                    float f21 = (f20 - f12) / f13;
                    float f22 = (f20 - f14) / f15;
                    float f23 = (f20 - f16) / f17;
                    float f24 = (f20 - f18) / f19;
                    float f25 = f12 / f13;
                    float f26 = (f14 / f15) - f25;
                    float f27 = (f18 / f19) - f25;
                    float f28 = f22 - f21;
                    float f29 = (f16 / f17) - f25;
                    float f30 = (((f24 - f21) * f26) - (f27 * f28)) / (((f23 - f21) * f26) - (f28 * f29));
                    float f31 = (f27 - (f29 * f30)) / f26;
                    float f32 = (1.0f - f31) - f30;
                    float f33 = f32 / f13;
                    float f34 = f31 / f15;
                    float f35 = f30 / f17;
                    this.LJIIIIZZ = new float[]{f33 * f12, f32, ((1.0f - f12) - f13) * f33, f34 * f14, f31, ((1.0f - f14) - f15) * f34, f35 * f16, f30, ((1.0f - f16) - f17) * f35};
                } else if (fArr.length == 9) {
                    this.LJIIIIZZ = fArr;
                } else {
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("Transform must have 9 entries! Has ");
                    LIZ.append(fArr.length);
                    throw new IllegalArgumentException(X1D.LIZIZ(LIZ));
                }
                this.LJIIIZ = C79146V4k.LJJIL(this.LJIIIIZZ);
                if (C13320fg.LIZ(fArr2) / C13320fg.LIZ(C13240fY.LIZIZ) > 0.9f) {
                    float[] fArr3 = C13240fY.LIZ;
                    float f36 = fArr2[0];
                    float f37 = fArr3[0];
                    float f38 = f36 - f37;
                    float f39 = fArr2[1];
                    float f40 = fArr3[1];
                    float f41 = f39 - f40;
                    float f42 = fArr2[2];
                    float f43 = fArr3[2];
                    float f44 = f42 - f43;
                    float f45 = fArr2[3];
                    float f46 = fArr3[3];
                    float f47 = f45 - f46;
                    float f48 = fArr2[4];
                    float f49 = fArr3[4];
                    float f50 = f48 - f49;
                    float f51 = fArr2[5];
                    float f52 = fArr3[5];
                    float f53 = f51 - f52;
                    if (((f40 - f52) * f38) - ((f37 - f49) * f41) < 0.0f || ((f37 - f43) * f41) - ((f40 - f46) * f38) < 0.0f || ((f46 - f40) * f44) - ((f43 - f37) * f47) < 0.0f || ((f43 - f49) * f47) - ((f46 - f52) * f44) < 0.0f || ((f52 - f46) * f50) - ((f49 - f43) * f53) < 0.0f || ((f49 - f37) * f53) - ((f52 - f40) * f50) >= 0.0f) {
                    }
                }
                if (i != 0) {
                    float[] fArr4 = C13240fY.LIZ;
                    if (fArr2 != fArr4) {
                        int i2 = 0;
                        do {
                            if (Float.compare(fArr2[i2], fArr4[i2]) != 0 && Math.abs(fArr2[i2] - fArr4[i2]) > 0.001f) {
                                break;
                            } else {
                                i2++;
                            }
                        } while (i2 < 6);
                    }
                    if (C79146V4k.LJJI(whitePoint, C13270fb.LIZLLL) && f == 0.0f && f2 == 1.0f) {
                        C1RU c1ru = C13240fY.LIZJ;
                        double d = LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX;
                        while (C13320fg.LIZIZ(d, oetf, c1ru.LJIIJ) && C13320fg.LIZIZ(d, eotf, c1ru.LJIIL)) {
                            d += 0.00392156862745098d;
                            if (d <= 1.0d) {
                            }
                        }
                    }
                    z = false;
                    this.LJIILJJIL = z;
                    return;
                }
                z = true;
                this.LJIILJJIL = z;
                return;
            }
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("Invalid range: min=");
            LIZ2.append(f);
            LIZ2.append(", max=");
            LIZ2.append(f2);
            LIZ2.append("; min must be strictly < max");
            throw new IllegalArgumentException(X1D.LIZIZ(LIZ2));
        }
        throw new IllegalArgumentException("The color space's primaries must be defined as an array of 6 floats in xyY or 9 floats in XYZ");
    }
}
