package X;

import java.util.LinkedHashMap;

/* renamed from: X.13f, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C267513f implements Comparable<C267513f> {
    public static final String[] LJLLLL = {"position", "x", "y", "width", "height", "pathRotate"};
    public C11Y LJLIL;
    public int LJLILLLLZI;
    public float LJLJI;
    public float LJLJJI;
    public float LJLJJL;
    public float LJLJJLL;
    public float LJLJL;
    public float LJLJLJ;
    public float LJLJLLL;
    public int LJLL;
    public final LinkedHashMap<String, C019405u> LJLLI;
    public int LJLLILLLL;
    public double[] LJLLJ;
    public double[] LJLLL;

    public C267513f() {
        this.LJLJLLL = Float.NaN;
        this.LJLL = -1;
        this.LJLLI = new LinkedHashMap<>();
        this.LJLLILLLL = 0;
        this.LJLLJ = new double[18];
        this.LJLLL = new double[18];
    }

    public final void LIZJ(C019905z c019905z) {
        this.LJLIL = C11Y.LIZJ(c019905z.LIZJ.LIZJ);
        AnonymousClass061 anonymousClass061 = c019905z.LIZJ;
        this.LJLL = anonymousClass061.LIZLLL;
        this.LJLJLLL = anonymousClass061.LJI;
        this.LJLILLLLZI = anonymousClass061.LJ;
        for (String str : c019905z.LJFF.keySet()) {
            C019405u c019405u = c019905z.LJFF.get(str);
            if (c019405u.LIZIZ != EnumC019305t.STRING_TYPE) {
                this.LJLLI.put(str, c019405u);
            }
        }
    }

    @Override // java.lang.Comparable
    public final int compareTo(C267513f c267513f) {
        return Float.compare(this.LJLJJI, c267513f.LJLJJI);
    }

    public static boolean LIZLLL(float f, float f2) {
        if (Float.isNaN(f) || Float.isNaN(f2)) {
            if (Float.isNaN(f) == Float.isNaN(f2)) {
                return false;
            }
            return true;
        }
        if (Math.abs(f - f2) <= 1.0E-6f) {
            return false;
        }
        return true;
    }

    public final void LJ(int[] iArr, double[] dArr, float[] fArr, int i) {
        float f = this.LJLJJL;
        float f2 = this.LJLJJLL;
        float f3 = this.LJLJL;
        float f4 = this.LJLJLJ;
        for (int i2 = 0; i2 < iArr.length; i2++) {
            float f5 = (float) dArr[i2];
            int i3 = iArr[i2];
            if (i3 != 1) {
                if (i3 != 2) {
                    if (i3 != 3) {
                        if (i3 == 4) {
                            f4 = f5;
                        }
                    } else {
                        f3 = f5;
                    }
                } else {
                    f2 = f5;
                }
            } else {
                f = f5;
            }
        }
        fArr[i] = (f3 / 2.0f) + f + 0.0f;
        fArr[i + 1] = (f4 / 2.0f) + f2 + 0.0f;
    }

    public C267513f(int i, int i2, C44421ok c44421ok, C267513f c267513f, C267513f c267513f2) {
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        float f7;
        float f8;
        float f9;
        float f10;
        int i3;
        this.LJLJLLL = Float.NaN;
        this.LJLL = -1;
        this.LJLLI = new LinkedHashMap<>();
        this.LJLLILLLL = 0;
        this.LJLLJ = new double[18];
        this.LJLLL = new double[18];
        int i4 = c44421ok.LJIILJJIL;
        if (i4 != 1) {
            if (i4 != 2) {
                float f11 = c44421ok.LIZ / 100.0f;
                this.LJLJI = f11;
                this.LJLILLLLZI = c44421ok.LJII;
                if (Float.isNaN(c44421ok.LJIIIIZZ)) {
                    f6 = f11;
                } else {
                    f6 = c44421ok.LJIIIIZZ;
                }
                if (Float.isNaN(c44421ok.LJIIIZ)) {
                    f7 = f11;
                } else {
                    f7 = c44421ok.LJIIIZ;
                }
                float f12 = c267513f2.LJLJL;
                float f13 = c267513f.LJLJL;
                float f14 = f12 - f13;
                float f15 = c267513f2.LJLJLJ;
                float f16 = c267513f.LJLJLJ;
                float f17 = f15 - f16;
                this.LJLJJI = this.LJLJI;
                float f18 = c267513f.LJLJJL;
                float f19 = c267513f.LJLJJLL;
                float f20 = ((f12 / 2.0f) + c267513f2.LJLJJL) - ((f13 / 2.0f) + f18);
                float f21 = ((f15 / 2.0f) + c267513f2.LJLJJLL) - ((f16 / 2.0f) + f19);
                float f22 = (f20 * f11) + f18;
                float f23 = (f14 * f6) / 2.0f;
                this.LJLJJL = (int) (f22 - f23);
                float f24 = (f21 * f11) + f19;
                float f25 = (f17 * f7) / 2.0f;
                this.LJLJJLL = (int) (f24 - f25);
                this.LJLJL = (int) (f13 + r17);
                this.LJLJLJ = (int) (f16 + r16);
                if (Float.isNaN(c44421ok.LJIIJ)) {
                    f8 = f11;
                } else {
                    f8 = c44421ok.LJIIJ;
                }
                if (Float.isNaN(c44421ok.LJIILIIL)) {
                    f9 = 0.0f;
                } else {
                    f9 = c44421ok.LJIILIIL;
                }
                f11 = Float.isNaN(c44421ok.LJIIJJI) ? f11 : c44421ok.LJIIJJI;
                if (Float.isNaN(c44421ok.LJIIL)) {
                    i3 = 2;
                    f10 = 0.0f;
                } else {
                    f10 = c44421ok.LJIIL;
                    i3 = 2;
                }
                this.LJLLILLLL = i3;
                this.LJLJJL = (int) (((f10 * f21) + ((f8 * f20) + c267513f.LJLJJL)) - f23);
                this.LJLJJLL = (int) (((f21 * f11) + ((f20 * f9) + c267513f.LJLJJLL)) - f25);
                this.LJLIL = C11Y.LIZJ(c44421ok.LJFF);
                this.LJLL = c44421ok.LJI;
                return;
            }
            float f26 = c44421ok.LIZ / 100.0f;
            this.LJLJI = f26;
            this.LJLILLLLZI = c44421ok.LJII;
            if (Float.isNaN(c44421ok.LJIIIIZZ)) {
                f4 = f26;
            } else {
                f4 = c44421ok.LJIIIIZZ;
            }
            if (Float.isNaN(c44421ok.LJIIIZ)) {
                f5 = f26;
            } else {
                f5 = c44421ok.LJIIIZ;
            }
            float f27 = c267513f2.LJLJL;
            float f28 = f27 - c267513f.LJLJL;
            float f29 = c267513f2.LJLJLJ;
            float f30 = f29 - c267513f.LJLJLJ;
            this.LJLJJI = this.LJLJI;
            float f31 = c267513f.LJLJJL;
            float f32 = c267513f.LJLJJLL;
            float f33 = (f27 / 2.0f) + c267513f2.LJLJJL;
            float f34 = (f29 / 2.0f) + c267513f2.LJLJJLL;
            float f35 = f28 * f4;
            this.LJLJJL = (int) ((((f33 - ((r8 / 2.0f) + f31)) * f26) + f31) - (f35 / 2.0f));
            float f36 = f30 * f5;
            this.LJLJJLL = (int) ((((f34 - ((r5 / 2.0f) + f32)) * f26) + f32) - (f36 / 2.0f));
            this.LJLJL = (int) (r8 + f35);
            this.LJLJLJ = (int) (r5 + f36);
            this.LJLLILLLL = 3;
            if (!Float.isNaN(c44421ok.LJIIJ)) {
                this.LJLJJL = (int) (c44421ok.LJIIJ * ((int) (i - this.LJLJL)));
            }
            if (!Float.isNaN(c44421ok.LJIIJJI)) {
                this.LJLJJLL = (int) (c44421ok.LJIIJJI * ((int) (i2 - this.LJLJLJ)));
            }
            this.LJLIL = C11Y.LIZJ(c44421ok.LJFF);
            this.LJLL = c44421ok.LJI;
            return;
        }
        float f37 = c44421ok.LIZ / 100.0f;
        this.LJLJI = f37;
        this.LJLILLLLZI = c44421ok.LJII;
        if (Float.isNaN(c44421ok.LJIIIIZZ)) {
            f = f37;
        } else {
            f = c44421ok.LJIIIIZZ;
        }
        if (Float.isNaN(c44421ok.LJIIIZ)) {
            f2 = f37;
        } else {
            f2 = c44421ok.LJIIIZ;
        }
        float f38 = c267513f2.LJLJL - c267513f.LJLJL;
        float f39 = c267513f2.LJLJLJ - c267513f.LJLJLJ;
        this.LJLJJI = this.LJLJI;
        f37 = Float.isNaN(c44421ok.LJIIJ) ? f37 : c44421ok.LJIIJ;
        float f40 = c267513f.LJLJJL;
        float f41 = c267513f.LJLJL;
        float f42 = c267513f.LJLJJLL;
        float f43 = c267513f.LJLJLJ;
        float f44 = ((c267513f2.LJLJL / 2.0f) + c267513f2.LJLJJL) - ((f41 / 2.0f) + f40);
        float f45 = ((c267513f2.LJLJLJ / 2.0f) + c267513f2.LJLJJLL) - ((f43 / 2.0f) + f42);
        float f46 = f44 * f37;
        float f47 = (f38 * f) / 2.0f;
        this.LJLJJL = (int) ((f40 + f46) - f47);
        float f48 = f37 * f45;
        float f49 = (f39 * f2) / 2.0f;
        this.LJLJJLL = (int) ((f42 + f48) - f49);
        this.LJLJL = (int) (f41 + r12);
        this.LJLJLJ = (int) (f43 + r10);
        if (Float.isNaN(c44421ok.LJIIJJI)) {
            f3 = 0.0f;
        } else {
            f3 = c44421ok.LJIIJJI;
        }
        float f50 = (-f45) * f3;
        float f51 = f44 * f3;
        this.LJLLILLLL = 1;
        float f52 = (int) ((c267513f.LJLJJL + f46) - f47);
        float f53 = (int) ((c267513f.LJLJJLL + f48) - f49);
        this.LJLJJL = f52 + f50;
        this.LJLJJLL = f53 + f51;
        this.LJLIL = C11Y.LIZJ(c44421ok.LJFF);
        this.LJLL = c44421ok.LJI;
    }

    public static void LJFF(float f, float f2, float[] fArr, int[] iArr, double[] dArr, double[] dArr2) {
        float f3 = 0.0f;
        float f4 = 0.0f;
        float f5 = 0.0f;
        float f6 = 0.0f;
        for (int i = 0; i < iArr.length; i++) {
            float f7 = (float) dArr[i];
            int i2 = iArr[i];
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        if (i2 == 4) {
                            f5 = f7;
                        }
                    } else {
                        f3 = f7;
                    }
                } else {
                    f6 = f7;
                }
            } else {
                f4 = f7;
            }
        }
        float LIZIZ = C65232Piu.LIZIZ(0.0f, f3, 2.0f, f4);
        float LIZIZ2 = C65232Piu.LIZIZ(0.0f, f5, 2.0f, f6);
        fArr[0] = (((f3 * 1.0f) + LIZIZ) * f) + ((1.0f - f) * LIZIZ) + 0.0f;
        fArr[1] = (((f5 * 1.0f) + LIZIZ2) * f2) + ((1.0f - f2) * LIZIZ2) + 0.0f;
    }
}
