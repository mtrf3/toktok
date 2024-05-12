package X;

import android.graphics.Path;
import android.graphics.PointF;
import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicFloatWindowOptimizeSetting;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.1nW, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C43661nW implements InterfaceC34851Yj, InterfaceC22630uh, InterfaceC34841Yi {
    public final Path LIZ = new Path();
    public final String LIZIZ;
    public final C04740Go LIZJ;
    public final EnumC271814w LIZLLL;
    public final C43751nf LJ;
    public final AbstractC22650uj<?, PointF> LJFF;
    public final C43751nf LJI;
    public final C43751nf LJII;
    public final C43751nf LJIIIIZZ;
    public final C43751nf LJIIIZ;
    public final C43751nf LJIIJ;
    public C34861Yk LJIIJJI;
    public final C34821Yg LJIIL;
    public boolean LJIILIIL;

    @Override // X.InterfaceC22630uh
    public final void LJI() {
        this.LJIILIIL = false;
        this.LIZJ.invalidateSelf();
    }

    @Override // X.InterfaceC34851Yj
    public final Path getPath() {
        float f;
        float f2;
        float cos;
        float sin;
        double d;
        float f3;
        float f4;
        float f5;
        float f6;
        float f7;
        float f8;
        float f9;
        float f10;
        C34821Yg c34821Yg;
        if (this.LJIILIIL) {
            return this.LIZ;
        }
        this.LIZ.reset();
        int i = C20670rX.LIZ[this.LIZLLL.ordinal()];
        double d2 = LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX;
        if (i != 1) {
            if (i == 2) {
                int floor = (int) Math.floor(this.LJ.LJI().floatValue());
                C43751nf c43751nf = this.LJI;
                if (c43751nf != null) {
                    d2 = c43751nf.LJI().floatValue();
                }
                double radians = Math.toRadians(d2 - 90.0d);
                double d3 = floor;
                float floatValue = this.LJIIJ.LJI().floatValue() / 100.0f;
                float floatValue2 = this.LJIIIIZZ.LJI().floatValue();
                double d4 = floatValue2;
                float cos2 = (float) (Math.cos(radians) * d4);
                float sin2 = (float) (Math.sin(radians) * d4);
                this.LIZ.moveTo(cos2, sin2);
                double d5 = (float) (6.283185307179586d / d3);
                double d6 = radians + d5;
                double ceil = Math.ceil(d3);
                int i2 = 0;
                while (i2 < ceil) {
                    float cos3 = (float) (Math.cos(d6) * d4);
                    float sin3 = (float) (Math.sin(d6) * d4);
                    if (floatValue != 0.0f) {
                        double atan2 = (float) (Math.atan2(sin2, cos2) - 1.5707963267948966d);
                        float cos4 = (float) Math.cos(atan2);
                        float sin4 = (float) Math.sin(atan2);
                        double atan22 = (float) (Math.atan2(sin3, cos3) - 1.5707963267948966d);
                        float f11 = floatValue2 * floatValue * 0.25f;
                        this.LIZ.cubicTo(cos2 - (cos4 * f11), sin2 - (sin4 * f11), cos3 + (((float) Math.cos(atan22)) * f11), sin3 + (f11 * ((float) Math.sin(atan22))), cos3, sin3);
                    } else {
                        this.LIZ.lineTo(cos3, sin3);
                    }
                    d6 += d5;
                    i2++;
                    sin2 = sin3;
                    cos2 = cos3;
                }
                PointF LJI = this.LJFF.LJI();
                this.LIZ.offset(LJI.x, LJI.y);
                this.LIZ.close();
            }
        } else {
            float floatValue3 = this.LJ.LJI().floatValue();
            C43751nf c43751nf2 = this.LJI;
            if (c43751nf2 != null) {
                d2 = c43751nf2.LJI().floatValue();
            }
            double radians2 = Math.toRadians(d2 - 90.0d);
            double d7 = floatValue3;
            float f12 = (float) (6.283185307179586d / d7);
            float f13 = f12 / 2.0f;
            float f14 = floatValue3 - ((int) floatValue3);
            if (f14 != 0.0f) {
                radians2 += (1.0f - f14) * f13;
            }
            float floatValue4 = this.LJIIIIZZ.LJI().floatValue();
            float floatValue5 = this.LJII.LJI().floatValue();
            C43751nf c43751nf3 = this.LJIIIZ;
            if (c43751nf3 != null) {
                f = c43751nf3.LJI().floatValue() / 100.0f;
            } else {
                f = 0.0f;
            }
            C43751nf c43751nf4 = this.LJIIJ;
            if (c43751nf4 != null) {
                f2 = c43751nf4.LJI().floatValue() / 100.0f;
            } else {
                f2 = 0.0f;
            }
            if (f14 != 0.0f) {
                f3 = C06420Na.LIZIZ(floatValue4, floatValue5, f14, floatValue5);
                double d8 = f3;
                cos = (float) (Math.cos(radians2) * d8);
                sin = (float) (d8 * Math.sin(radians2));
                this.LIZ.moveTo(cos, sin);
                d = radians2 + ((f12 * f14) / 2.0f);
            } else {
                double d9 = floatValue4;
                cos = (float) (Math.cos(radians2) * d9);
                sin = (float) (Math.sin(radians2) * d9);
                this.LIZ.moveTo(cos, sin);
                d = radians2 + f13;
                f3 = 0.0f;
            }
            double ceil2 = Math.ceil(d7) * 2.0d;
            boolean z = false;
            int i3 = 0;
            while (true) {
                double d10 = i3;
                if (d10 >= ceil2) {
                    break;
                }
                if (z) {
                    f4 = floatValue4;
                } else {
                    f4 = floatValue5;
                }
                if (f3 != 0.0f && d10 == ceil2 - 2.0d) {
                    f5 = (f12 * f14) / 2.0f;
                } else {
                    f5 = f13;
                }
                if (f3 != 0.0f && d10 == ceil2 - 1.0d) {
                    f6 = f3;
                } else {
                    f6 = f3;
                    f3 = f4;
                }
                double d11 = f3;
                float cos5 = (float) (Math.cos(d) * d11);
                float sin5 = (float) (d11 * Math.sin(d));
                if (f == 0.0f && f2 == 0.0f) {
                    this.LIZ.lineTo(cos5, sin5);
                } else {
                    double atan23 = (float) (Math.atan2(sin, cos) - 1.5707963267948966d);
                    float cos6 = (float) Math.cos(atan23);
                    float sin6 = (float) Math.sin(atan23);
                    double atan24 = (float) (Math.atan2(sin5, cos5) - 1.5707963267948966d);
                    float cos7 = (float) Math.cos(atan24);
                    float sin7 = (float) Math.sin(atan24);
                    if (z) {
                        f7 = f;
                        f8 = f2;
                        f9 = floatValue5;
                        f10 = floatValue4;
                    } else {
                        f7 = f2;
                        f8 = f;
                        f9 = floatValue4;
                        f10 = floatValue5;
                    }
                    float f15 = f9 * f7 * 0.47829f;
                    float f16 = cos6 * f15;
                    float f17 = f15 * sin6;
                    float f18 = f10 * f8 * 0.47829f;
                    float f19 = cos7 * f18;
                    float f20 = f18 * sin7;
                    if (f14 != 0.0f) {
                        if (i3 == 0) {
                            f16 *= f14;
                            f17 *= f14;
                        } else if (d10 == ceil2 - 1.0d) {
                            f19 *= f14;
                            f20 *= f14;
                        }
                    }
                    this.LIZ.cubicTo(cos - f16, sin - f17, cos5 + f19, sin5 + f20, cos5, sin5);
                }
                d += f5;
                z = !z;
                i3++;
                cos = cos5;
                f3 = f6;
                sin = sin5;
            }
            PointF LJI2 = this.LJFF.LJI();
            this.LIZ.offset(LJI2.x, LJI2.y);
            this.LIZ.close();
        }
        this.LIZ.close();
        if (C03970Dp.LIZ && (c34821Yg = this.LJIIL) != null) {
            c34821Yg.LJ(this.LIZ);
        } else {
            C06310Mp.LIZIZ(this.LIZ, this.LJIIJJI);
        }
        this.LJIILIIL = true;
        return this.LIZ;
    }

    @Override // X.InterfaceC20640rU
    public final String getName() {
        return this.LIZIZ;
    }

    @Override // X.InterfaceC263811u
    public final <T> void LIZIZ(T t, C06800Om<T> c06800Om) {
        C43751nf c43751nf;
        C43751nf c43751nf2;
        if (t == C0GO.LJIILJJIL) {
            this.LJ.LJIIJ(c06800Om);
            return;
        }
        if (t == C0GO.LJIILL) {
            this.LJI.LJIIJ(c06800Om);
            return;
        }
        if (t == C0GO.LJII) {
            this.LJFF.LJIIJ(c06800Om);
            return;
        }
        if (t == C0GO.LJIILLIIL && (c43751nf2 = this.LJII) != null) {
            c43751nf2.LJIIJ(c06800Om);
            return;
        }
        if (t == C0GO.LJIIZILJ) {
            this.LJIIIIZZ.LJIIJ(c06800Om);
            return;
        }
        if (t == C0GO.LJIJ && (c43751nf = this.LJIIIZ) != null) {
            c43751nf.LJIIJ(c06800Om);
        } else {
            if (t != C0GO.LJIJI) {
                return;
            }
            this.LJIIJ.LJIIJ(c06800Om);
        }
    }

    @Override // X.InterfaceC20640rU
    public final void LIZLLL(List<InterfaceC20640rU> list, List<InterfaceC20640rU> list2) {
        C34821Yg c34821Yg;
        for (int i = 0; i < ((ArrayList) list).size(); i++) {
            InterfaceC20640rU interfaceC20640rU = (InterfaceC20640rU) ListProtector.get(list, i);
            if (interfaceC20640rU instanceof C34861Yk) {
                C34861Yk c34861Yk = (C34861Yk) interfaceC20640rU;
                if (c34861Yk.LIZIZ == AnonymousClass151.Simultaneously) {
                    if (C03970Dp.LIZ && (c34821Yg = this.LJIIL) != null) {
                        ((List) c34821Yg.LIZ).add(c34861Yk);
                        c34861Yk.LIZIZ(this);
                    } else {
                        this.LJIIJJI = c34861Yk;
                        c34861Yk.LIZIZ(this);
                    }
                }
            }
        }
    }

    public C43661nW(C04740Go c04740Go, AbstractC45041pk abstractC45041pk, C38811fh c38811fh) {
        if (C03970Dp.LIZ) {
            this.LJIIL = new C34821Yg(0, 0);
        }
        this.LIZJ = c04740Go;
        this.LIZIZ = c38811fh.LIZ;
        EnumC271814w enumC271814w = c38811fh.LIZIZ;
        this.LIZLLL = enumC271814w;
        AbstractC22650uj<?, ?> LIZ = c38811fh.LIZJ.LIZ();
        this.LJ = (C43751nf) LIZ;
        AbstractC22650uj<PointF, PointF> LIZ2 = c38811fh.LIZLLL.LIZ();
        this.LJFF = LIZ2;
        AbstractC22650uj<?, ?> LIZ3 = c38811fh.LJ.LIZ();
        this.LJI = (C43751nf) LIZ3;
        AbstractC22650uj<?, ?> LIZ4 = c38811fh.LJI.LIZ();
        this.LJIIIIZZ = (C43751nf) LIZ4;
        AbstractC22650uj<?, ?> LIZ5 = c38811fh.LJIIIIZZ.LIZ();
        this.LJIIJ = (C43751nf) LIZ5;
        EnumC271814w enumC271814w2 = EnumC271814w.Star;
        if (enumC271814w == enumC271814w2) {
            this.LJII = (C43751nf) c38811fh.LJFF.LIZ();
            this.LJIIIZ = (C43751nf) c38811fh.LJII.LIZ();
        } else {
            this.LJII = null;
            this.LJIIIZ = null;
        }
        abstractC45041pk.LJFF(LIZ);
        abstractC45041pk.LJFF(LIZ2);
        abstractC45041pk.LJFF(LIZ3);
        abstractC45041pk.LJFF(LIZ4);
        abstractC45041pk.LJFF(LIZ5);
        if (enumC271814w == enumC271814w2) {
            abstractC45041pk.LJFF(this.LJII);
            abstractC45041pk.LJFF(this.LJIIIZ);
        }
        LIZ.LIZ(this);
        LIZ2.LIZ(this);
        LIZ3.LIZ(this);
        LIZ4.LIZ(this);
        LIZ5.LIZ(this);
        if (enumC271814w == enumC271814w2) {
            this.LJII.LIZ(this);
            this.LJIIIZ.LIZ(this);
        }
    }

    @Override // X.InterfaceC263811u
    public final void LJ(C263711t c263711t, int i, List<C263711t> list, C263711t c263711t2) {
        C06260Mk.LIZLLL(c263711t, i, list, c263711t2, this);
    }
}
