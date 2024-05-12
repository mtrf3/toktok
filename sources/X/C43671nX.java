package X;

import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.1nX, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C43671nX implements InterfaceC22630uh, InterfaceC34841Yi, InterfaceC34851Yj {
    public final Path LIZ = new Path();
    public final RectF LIZIZ = new RectF();
    public final String LIZJ;
    public final C04740Go LIZLLL;
    public final AbstractC22650uj<?, PointF> LJ;
    public final C43791nj LJFF;
    public final C43751nf LJI;
    public C34861Yk LJII;
    public final C34821Yg LJIIIIZZ;
    public boolean LJIIIZ;

    @Override // X.InterfaceC263811u
    public final <T> void LIZIZ(T t, C06800Om<T> c06800Om) {
    }

    @Override // X.InterfaceC22630uh
    public final void LJI() {
        this.LJIIIZ = false;
        this.LIZLLL.invalidateSelf();
    }

    @Override // X.InterfaceC34851Yj
    public final Path getPath() {
        float floatValue;
        C34821Yg c34821Yg;
        if (this.LJIIIZ) {
            return this.LIZ;
        }
        this.LIZ.reset();
        PointF LJI = this.LJFF.LJI();
        float f = LJI.x / 2.0f;
        float f2 = LJI.y / 2.0f;
        C43751nf c43751nf = this.LJI;
        if (c43751nf == null) {
            floatValue = 0.0f;
        } else {
            floatValue = c43751nf.LJI().floatValue();
        }
        float min = Math.min(f, f2);
        if (floatValue > min) {
            floatValue = min;
        }
        PointF LJI2 = this.LJ.LJI();
        this.LIZ.moveTo(LJI2.x + f, (LJI2.y - f2) + floatValue);
        this.LIZ.lineTo(LJI2.x + f, (LJI2.y + f2) - floatValue);
        if (floatValue > 0.0f) {
            RectF rectF = this.LIZIZ;
            float f3 = LJI2.x + f;
            float f4 = floatValue * 2.0f;
            float f5 = LJI2.y + f2;
            rectF.set(f3 - f4, f5 - f4, f3, f5);
            this.LIZ.arcTo(this.LIZIZ, 0.0f, 90.0f, false);
        }
        this.LIZ.lineTo((LJI2.x - f) + floatValue, LJI2.y + f2);
        if (floatValue > 0.0f) {
            RectF rectF2 = this.LIZIZ;
            float f6 = LJI2.x - f;
            float f7 = LJI2.y + f2;
            float f8 = floatValue * 2.0f;
            rectF2.set(f6, f7 - f8, f8 + f6, f7);
            this.LIZ.arcTo(this.LIZIZ, 90.0f, 90.0f, false);
        }
        this.LIZ.lineTo(LJI2.x - f, (LJI2.y - f2) + floatValue);
        if (floatValue > 0.0f) {
            RectF rectF3 = this.LIZIZ;
            float f9 = LJI2.x - f;
            float f10 = LJI2.y - f2;
            float f11 = floatValue * 2.0f;
            rectF3.set(f9, f10, f9 + f11, f11 + f10);
            this.LIZ.arcTo(this.LIZIZ, 180.0f, 90.0f, false);
        }
        this.LIZ.lineTo((LJI2.x + f) - floatValue, LJI2.y - f2);
        if (floatValue > 0.0f) {
            RectF rectF4 = this.LIZIZ;
            float f12 = LJI2.x + f;
            float f13 = floatValue * 2.0f;
            float f14 = LJI2.y - f2;
            rectF4.set(f12 - f13, f14, f12, f13 + f14);
            this.LIZ.arcTo(this.LIZIZ, 270.0f, 90.0f, false);
        }
        this.LIZ.close();
        if (C03970Dp.LIZ && (c34821Yg = this.LJIIIIZZ) != null) {
            c34821Yg.LJ(this.LIZ);
        } else {
            C06310Mp.LIZIZ(this.LIZ, this.LJII);
        }
        this.LJIIIZ = true;
        return this.LIZ;
    }

    @Override // X.InterfaceC20640rU
    public final String getName() {
        return this.LIZJ;
    }

    @Override // X.InterfaceC20640rU
    public final void LIZLLL(List<InterfaceC20640rU> list, List<InterfaceC20640rU> list2) {
        C34821Yg c34821Yg;
        for (int i = 0; i < ((ArrayList) list).size(); i++) {
            InterfaceC20640rU interfaceC20640rU = (InterfaceC20640rU) ListProtector.get(list, i);
            if (interfaceC20640rU instanceof C34861Yk) {
                C34861Yk c34861Yk = (C34861Yk) interfaceC20640rU;
                if (c34861Yk.LIZIZ == AnonymousClass151.Simultaneously) {
                    if (C03970Dp.LIZ && (c34821Yg = this.LJIIIIZZ) != null) {
                        ((List) c34821Yg.LIZ).add(c34861Yk);
                        c34861Yk.LIZIZ(this);
                    } else {
                        this.LJII = c34861Yk;
                        c34861Yk.LIZIZ(this);
                    }
                }
            }
        }
    }

    public C43671nX(C04740Go c04740Go, AbstractC45041pk abstractC45041pk, C38821fi c38821fi) {
        if (C03970Dp.LIZ) {
            this.LJIIIIZZ = new C34821Yg(0, 0);
        }
        this.LIZJ = c38821fi.LIZ;
        this.LIZLLL = c04740Go;
        AbstractC22650uj<PointF, PointF> LIZ = c38821fi.LIZIZ.LIZ();
        this.LJ = LIZ;
        AbstractC22650uj<?, ?> LIZ2 = c38821fi.LIZJ.LIZ();
        this.LJFF = (C43791nj) LIZ2;
        AbstractC22650uj<?, ?> LIZ3 = c38821fi.LIZLLL.LIZ();
        this.LJI = (C43751nf) LIZ3;
        abstractC45041pk.LJFF(LIZ);
        abstractC45041pk.LJFF(LIZ2);
        abstractC45041pk.LJFF(LIZ3);
        LIZ.LIZ(this);
        LIZ2.LIZ(this);
        LIZ3.LIZ(this);
    }

    @Override // X.InterfaceC263811u
    public final void LJ(C263711t c263711t, int i, List<C263711t> list, C263711t c263711t2) {
        C06260Mk.LIZLLL(c263711t, i, list, c263711t2, this);
    }
}
