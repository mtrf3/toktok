package X;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.DashPathEffect;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.RectF;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.1nQ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC43601nQ implements InterfaceC22630uh, InterfaceC34841Yi, InterfaceC34831Yh {
    public final C04740Go LJ;
    public final AbstractC45041pk LJFF;
    public final float[] LJII;
    public final Paint LJIIIIZZ;
    public final C43751nf LJIIIZ;
    public final C43771nh LJIIJ;
    public final List<AbstractC22650uj<?, Float>> LJIIJJI;
    public final C43751nf LJIIL;
    public C35171Zp LJIILIIL;
    public final PathMeasure LIZ = new PathMeasure();
    public final Path LIZIZ = new Path();
    public final Path LIZJ = new Path();
    public final RectF LIZLLL = new RectF();
    public final List<C20630rT> LJI = new ArrayList();

    @Override // X.InterfaceC22630uh
    public final void LJI() {
        this.LJ.invalidateSelf();
    }

    @Override // X.InterfaceC34831Yh
    public final void LIZ(RectF rectF, Matrix matrix) {
        float floatValue;
        this.LIZIZ.reset();
        for (int i = 0; i < ((ArrayList) this.LJI).size(); i++) {
            C20630rT c20630rT = (C20630rT) ListProtector.get(this.LJI, i);
            for (int i2 = 0; i2 < ((ArrayList) c20630rT.LIZ).size(); i2++) {
                this.LIZIZ.addPath(((InterfaceC34851Yj) ListProtector.get(c20630rT.LIZ, i2)).getPath(), matrix);
            }
        }
        this.LIZIZ.computeBounds(this.LIZLLL, false);
        if (C03970Dp.LIZ) {
            floatValue = this.LJIIIZ.LJIIJJI();
        } else {
            floatValue = this.LJIIIZ.LJI().floatValue();
        }
        RectF rectF2 = this.LIZLLL;
        float f = floatValue / 2.0f;
        rectF2.set(rectF2.left - f, rectF2.top - f, rectF2.right + f, rectF2.bottom + f);
        rectF.set(this.LIZLLL);
        rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
        C0GR.LIZ();
    }

    @Override // X.InterfaceC263811u
    public <T> void LIZIZ(T t, C06800Om<T> c06800Om) {
        C35171Zp c35171Zp;
        if (t == C0GO.LIZLLL) {
            LJIIJ(c06800Om);
            return;
        }
        if (t == C0GO.LJIIJ) {
            this.LJIIIZ.LJIIJ(c06800Om);
            return;
        }
        if (t != C0GO.LJJ) {
            return;
        }
        if (C03970Dp.LIZ && (c35171Zp = this.LJIILIIL) != null) {
            ((ArrayList) this.LJFF.LJIJI).remove(c35171Zp);
        }
        if (c06800Om == null) {
            this.LJIILIIL = null;
            return;
        }
        C35171Zp c35171Zp2 = new C35171Zp(c06800Om);
        this.LJIILIIL = c35171Zp2;
        c35171Zp2.LIZ(this);
        this.LJFF.LJFF(this.LJIILIIL);
    }

    @Override // X.InterfaceC20640rU
    public final void LIZLLL(List<InterfaceC20640rU> list, List<InterfaceC20640rU> list2) {
        C20630rT c20630rT = null;
        C34861Yk c34861Yk = null;
        for (int size = ((ArrayList) list).size() - 1; size >= 0; size--) {
            InterfaceC20640rU interfaceC20640rU = (InterfaceC20640rU) ListProtector.get(list, size);
            if (interfaceC20640rU instanceof C34861Yk) {
                C34861Yk c34861Yk2 = (C34861Yk) interfaceC20640rU;
                if (c34861Yk2.LIZIZ == AnonymousClass151.Individually) {
                    c34861Yk = c34861Yk2;
                }
            }
        }
        if (c34861Yk != null) {
            c34861Yk.LIZIZ(this);
        }
        int size2 = list2.size();
        while (true) {
            size2--;
            if (size2 < 0) {
                break;
            }
            InterfaceC20640rU interfaceC20640rU2 = (InterfaceC20640rU) ListProtector.get(list2, size2);
            if (interfaceC20640rU2 instanceof C34861Yk) {
                C34861Yk c34861Yk3 = (C34861Yk) interfaceC20640rU2;
                if (c34861Yk3.LIZIZ == AnonymousClass151.Individually) {
                    if (c20630rT != null) {
                        ((ArrayList) this.LJI).add(c20630rT);
                    }
                    c20630rT = new C20630rT(c34861Yk3);
                    c34861Yk3.LIZIZ(this);
                }
            }
            if (interfaceC20640rU2 instanceof InterfaceC34851Yj) {
                if (c20630rT == null) {
                    c20630rT = new C20630rT(c34861Yk);
                }
                ((ArrayList) c20630rT.LIZ).add(interfaceC20640rU2);
            }
        }
        if (c20630rT != null) {
            ((ArrayList) this.LJI).add(c20630rT);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC34831Yh
    public void LIZJ(Canvas canvas, Matrix matrix, int i) {
        float floatValue;
        float f;
        float f2;
        float f3;
        int i2;
        float f4 = 100.0f;
        boolean z = false;
        if (C03970Dp.LIZ) {
            float[] fArr = C06310Mp.LIZLLL.get();
            fArr[0] = 0.0f;
            fArr[1] = 0.0f;
            fArr[2] = 37394.73f;
            fArr[3] = 39575.234f;
            matrix.mapPoints(fArr);
            if (fArr[0] == fArr[2] || fArr[1] == fArr[3]) {
                C0GR.LIZ();
                return;
            }
            float f5 = i / 255.0f;
            C43771nh c43771nh = this.LJIIJ;
            C06780Ok<Integer> LIZIZ = c43771nh.LIZIZ();
            float LIZLLL = c43771nh.LIZLLL();
            if (LIZIZ.LIZIZ != null && LIZIZ.LIZJ != null) {
                C06800Om<A> c06800Om = c43771nh.LJFF;
                if (c06800Om != 0) {
                    LIZIZ.LJFF.floatValue();
                    Integer num = (Integer) c06800Om.LIZIZ(LIZIZ.LIZIZ, LIZIZ.LIZJ, c43771nh.LJ());
                    if (num != null) {
                        i2 = num.intValue();
                        this.LJIIIIZZ.setAlpha(Math.max(0, Math.min(255, (int) (((f5 * i2) / 100.0f) * 255.0f))));
                        this.LJIIIIZZ.setStrokeWidth(C06310Mp.LJ(matrix) * this.LJIIIZ.LJIIJJI());
                    }
                }
                if (LIZIZ.LJIIIIZZ == 784923401) {
                    LIZIZ.LJIIIIZZ = LIZIZ.LIZIZ.intValue();
                }
                int i3 = LIZIZ.LJIIIIZZ;
                if (LIZIZ.LJIIIZ == 784923401) {
                    LIZIZ.LJIIIZ = LIZIZ.LIZJ.intValue();
                }
                i2 = (int) ((LIZLLL * (LIZIZ.LJIIIZ - i3)) + i3);
                this.LJIIIIZZ.setAlpha(Math.max(0, Math.min(255, (int) (((f5 * i2) / 100.0f) * 255.0f))));
                this.LJIIIIZZ.setStrokeWidth(C06310Mp.LJ(matrix) * this.LJIIIZ.LJIIJJI());
            } else {
                throw new IllegalStateException("Missing values for keyframe.");
            }
        } else {
            this.LJIIIIZZ.setAlpha(Math.max(0, Math.min(255, (int) ((((i / 255.0f) * LJI().intValue()) / 100.0f) * 255.0f))));
            this.LJIIIIZZ.setStrokeWidth(C06310Mp.LJ(matrix) * this.LJIIIZ.LJI().floatValue());
        }
        if (this.LJIIIIZZ.getStrokeWidth() <= 0.0f) {
            C0GR.LIZ();
            return;
        }
        float f6 = 1.0f;
        if (((ArrayList) this.LJIIJJI).isEmpty()) {
            C0GR.LIZ();
        } else {
            float LJ = C06310Mp.LJ(matrix);
            for (int i4 = 0; i4 < ((ArrayList) this.LJIIJJI).size(); i4++) {
                this.LJII[i4] = ((Float) ((AbstractC22650uj) ListProtector.get(this.LJIIJJI, i4)).LJI()).floatValue();
                if (i4 % 2 == 0) {
                    float[] fArr2 = this.LJII;
                    if (fArr2[i4] < 1.0f) {
                        fArr2[i4] = 1.0f;
                    }
                } else {
                    float[] fArr3 = this.LJII;
                    if (fArr3[i4] < 0.1f) {
                        fArr3[i4] = 0.1f;
                    }
                }
                float[] fArr4 = this.LJII;
                fArr4[i4] = fArr4[i4] * LJ;
            }
            if (C03970Dp.LIZ) {
                C43751nf c43751nf = this.LJIIL;
                if (c43751nf != null) {
                    floatValue = c43751nf.LJI().floatValue() * LJ;
                    this.LJIIIIZZ.setPathEffect(new DashPathEffect(this.LJII, floatValue));
                    C0GR.LIZ();
                }
                floatValue = 0.0f;
                this.LJIIIIZZ.setPathEffect(new DashPathEffect(this.LJII, floatValue));
                C0GR.LIZ();
            } else {
                C43751nf c43751nf2 = this.LJIIL;
                if (c43751nf2 != null) {
                    floatValue = c43751nf2.LJI().floatValue();
                    this.LJIIIIZZ.setPathEffect(new DashPathEffect(this.LJII, floatValue));
                    C0GR.LIZ();
                }
                floatValue = 0.0f;
                this.LJIIIIZZ.setPathEffect(new DashPathEffect(this.LJII, floatValue));
                C0GR.LIZ();
            }
        }
        C35171Zp c35171Zp = this.LJIILIIL;
        if (c35171Zp != null) {
            this.LJIIIIZZ.setColorFilter((ColorFilter) c35171Zp.LJI());
        }
        int i5 = 0;
        while (i5 < ((ArrayList) this.LJI).size()) {
            C20630rT c20630rT = (C20630rT) ListProtector.get(this.LJI, i5);
            if (c20630rT.LIZIZ != null) {
                this.LIZIZ.reset();
                int size = ((ArrayList) c20630rT.LIZ).size();
                while (true) {
                    size--;
                    if (size < 0) {
                        break;
                    } else {
                        this.LIZIZ.addPath(((InterfaceC34851Yj) ListProtector.get(c20630rT.LIZ, size)).getPath(), matrix);
                    }
                }
                this.LIZ.setPath(this.LIZIZ, z);
                float length = this.LIZ.getLength();
                while (this.LIZ.nextContour()) {
                    length += this.LIZ.getLength();
                }
                float floatValue2 = (c20630rT.LIZIZ.LJ.LJI().floatValue() * length) / 360.0f;
                float floatValue3 = ((c20630rT.LIZIZ.LIZJ.LJI().floatValue() * length) / f4) + floatValue2;
                float floatValue4 = ((c20630rT.LIZIZ.LIZLLL.LJI().floatValue() * length) / f4) + floatValue2;
                int size2 = ((ArrayList) c20630rT.LIZ).size() - 1;
                float f7 = 0.0f;
                while (size2 >= 0) {
                    this.LIZJ.set(((InterfaceC34851Yj) ListProtector.get(c20630rT.LIZ, size2)).getPath());
                    this.LIZJ.transform(matrix);
                    this.LIZ.setPath(this.LIZJ, z);
                    float length2 = this.LIZ.getLength();
                    if (floatValue4 > length) {
                        float f8 = floatValue4 - length;
                        if (f8 < f7 + length2 && f7 < f8) {
                            if (floatValue3 > length) {
                                f3 = (floatValue3 - length) / length2;
                            } else {
                                f3 = 0.0f;
                            }
                            C06310Mp.LIZ(this.LIZJ, f3, Math.min(f8 / length2, f6), 0.0f);
                            canvas.drawPath(this.LIZJ, this.LJIIIIZZ);
                            f7 += length2;
                            size2--;
                            f6 = 1.0f;
                            z = false;
                        }
                    }
                    float f9 = f7 + length2;
                    if (f9 >= floatValue3 && f7 <= floatValue4) {
                        if (f9 <= floatValue4 && floatValue3 < f7) {
                            canvas.drawPath(this.LIZJ, this.LJIIIIZZ);
                        } else {
                            if (floatValue3 < f7) {
                                f = 0.0f;
                            } else {
                                f = (floatValue3 - f7) / length2;
                            }
                            if (floatValue4 > f9) {
                                f2 = 1.0f;
                            } else {
                                f2 = (floatValue4 - f7) / length2;
                            }
                            C06310Mp.LIZ(this.LIZJ, f, f2, 0.0f);
                            canvas.drawPath(this.LIZJ, this.LJIIIIZZ);
                        }
                    }
                    f7 += length2;
                    size2--;
                    f6 = 1.0f;
                    z = false;
                }
                C0GR.LIZ();
            } else {
                this.LIZIZ.reset();
                for (int size3 = ((ArrayList) c20630rT.LIZ).size() - 1; size3 >= 0; size3--) {
                    this.LIZIZ.addPath(((InterfaceC34851Yj) ListProtector.get(c20630rT.LIZ, size3)).getPath(), matrix);
                }
                C0GR.LIZ();
                canvas.drawPath(this.LIZIZ, this.LJIIIIZZ);
                C0GR.LIZ();
            }
            i5++;
            f6 = 1.0f;
            f4 = 100.0f;
        }
        C0GR.LIZ();
    }

    @Override // X.InterfaceC263811u
    public final void LJ(C263711t c263711t, int i, List<C263711t> list, C263711t c263711t2) {
        C06260Mk.LIZLLL(c263711t, i, list, c263711t2, this);
    }

    public AbstractC43601nQ(C04740Go c04740Go, AbstractC45041pk abstractC45041pk, Paint.Cap cap, Paint.Join join, float f, C44471op c44471op, C44451on c44451on, List<C44451on> list, C44451on c44451on2) {
        if (C03970Dp.LIZ) {
            this.LJIIIIZZ = new C19440pY(1);
        } else {
            this.LJIIIIZZ = new Paint(1);
        }
        this.LJ = c04740Go;
        this.LJFF = abstractC45041pk;
        this.LJIIIIZZ.setStyle(Paint.Style.STROKE);
        this.LJIIIIZZ.setStrokeCap(cap);
        this.LJIIIIZZ.setStrokeJoin(join);
        this.LJIIIIZZ.setStrokeMiter(f);
        this.LJIIJ = (C43771nh) c44471op.LIZ();
        this.LJIIIZ = (C43751nf) c44451on.LIZ();
        if (c44451on2 == null) {
            this.LJIIL = null;
        } else {
            this.LJIIL = (C43751nf) c44451on2.LIZ();
        }
        this.LJIIJJI = new ArrayList(list.size());
        this.LJII = new float[list.size()];
        for (int i = 0; i < list.size(); i++) {
            ((ArrayList) this.LJIIJJI).add(((C44451on) ListProtector.get(list, i)).LIZ());
        }
        abstractC45041pk.LJFF(this.LJIIJ);
        abstractC45041pk.LJFF(this.LJIIIZ);
        for (int i2 = 0; i2 < ((ArrayList) this.LJIIJJI).size(); i2++) {
            abstractC45041pk.LJFF((AbstractC22650uj) ListProtector.get(this.LJIIJJI, i2));
        }
        C43751nf c43751nf = this.LJIIL;
        if (c43751nf != null) {
            abstractC45041pk.LJFF(c43751nf);
        }
        LIZ(this);
        this.LJIIIZ.LIZ(this);
        for (int i3 = 0; i3 < list.size(); i3++) {
            ((AbstractC22650uj) ListProtector.get(this.LJIIJJI, i3)).LIZ(this);
        }
        C43751nf c43751nf2 = this.LJIIL;
        if (c43751nf2 != null) {
            c43751nf2.LIZ(this);
        }
    }
}
