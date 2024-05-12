package X;

import android.graphics.Path;
import android.graphics.PointF;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.1nS, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C43621nS implements InterfaceC34851Yj, InterfaceC22630uh, InterfaceC34841Yi {
    public final Path LIZ = new Path();
    public final String LIZIZ;
    public final C04740Go LIZJ;
    public final C43791nj LIZLLL;
    public final AbstractC22650uj<?, PointF> LJ;
    public final C38771fd LJFF;
    public C34861Yk LJI;
    public final C34821Yg LJII;
    public boolean LJIIIIZZ;

    @Override // X.InterfaceC22630uh
    public final void LJI() {
        this.LJIIIIZZ = false;
        this.LIZJ.invalidateSelf();
    }

    @Override // X.InterfaceC34851Yj
    public final Path getPath() {
        C34821Yg c34821Yg;
        if (this.LJIIIIZZ) {
            return this.LIZ;
        }
        this.LIZ.reset();
        PointF LJI = this.LIZLLL.LJI();
        float f = LJI.x / 2.0f;
        float f2 = LJI.y / 2.0f;
        float f3 = f * 0.55228f;
        float f4 = 0.55228f * f2;
        this.LIZ.reset();
        if (this.LJFF.LIZLLL) {
            float f5 = -f2;
            this.LIZ.moveTo(0.0f, f5);
            float f6 = 0.0f - f3;
            float f7 = -f;
            float f8 = 0.0f - f4;
            this.LIZ.cubicTo(f6, f5, f7, f8, f7, 0.0f);
            float f9 = f4 + 0.0f;
            this.LIZ.cubicTo(f7, f9, f6, f2, 0.0f, f2);
            float f10 = f3 + 0.0f;
            this.LIZ.cubicTo(f10, f2, f, f9, f, 0.0f);
            this.LIZ.cubicTo(f, f8, f10, f5, 0.0f, f5);
        } else {
            float f11 = -f2;
            this.LIZ.moveTo(0.0f, f11);
            float f12 = f3 + 0.0f;
            float f13 = 0.0f - f4;
            this.LIZ.cubicTo(f12, f11, f, f13, f, 0.0f);
            float f14 = f4 + 0.0f;
            this.LIZ.cubicTo(f, f14, f12, f2, 0.0f, f2);
            float f15 = 0.0f - f3;
            float f16 = -f;
            this.LIZ.cubicTo(f15, f2, f16, f14, f16, 0.0f);
            this.LIZ.cubicTo(f16, f13, f15, f11, 0.0f, f11);
        }
        PointF LJI2 = this.LJ.LJI();
        this.LIZ.offset(LJI2.x, LJI2.y);
        this.LIZ.close();
        if (C03970Dp.LIZ && (c34821Yg = this.LJII) != null) {
            c34821Yg.LJ(this.LIZ);
        } else {
            C06310Mp.LIZIZ(this.LIZ, this.LJI);
        }
        this.LJIIIIZZ = true;
        return this.LIZ;
    }

    @Override // X.InterfaceC20640rU
    public final String getName() {
        return this.LIZIZ;
    }

    @Override // X.InterfaceC263811u
    public final <T> void LIZIZ(T t, C06800Om<T> c06800Om) {
        if (t == C0GO.LJI) {
            this.LIZLLL.LJIIJ(c06800Om);
        } else {
            if (t != C0GO.LJII) {
                return;
            }
            this.LJ.LJIIJ(c06800Om);
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
                    if (C03970Dp.LIZ && (c34821Yg = this.LJII) != null) {
                        ((List) c34821Yg.LIZ).add(c34861Yk);
                        c34861Yk.LIZIZ(this);
                    } else {
                        this.LJI = c34861Yk;
                        c34861Yk.LIZIZ(this);
                    }
                }
            }
        }
    }

    public C43621nS(C04740Go c04740Go, AbstractC45041pk abstractC45041pk, C38771fd c38771fd) {
        if (C03970Dp.LIZ) {
            this.LJII = new C34821Yg(0, 0);
        }
        this.LIZIZ = c38771fd.LIZ;
        this.LIZJ = c04740Go;
        AbstractC22650uj<?, ?> LIZ = c38771fd.LIZJ.LIZ();
        this.LIZLLL = (C43791nj) LIZ;
        AbstractC22650uj<PointF, PointF> LIZ2 = c38771fd.LIZIZ.LIZ();
        this.LJ = LIZ2;
        this.LJFF = c38771fd;
        abstractC45041pk.LJFF(LIZ);
        abstractC45041pk.LJFF(LIZ2);
        LIZ.LIZ(this);
        LIZ2.LIZ(this);
    }

    @Override // X.InterfaceC263811u
    public final void LJ(C263711t c263711t, int i, List<C263711t> list, C263711t c263711t2) {
        C06260Mk.LIZLLL(c263711t, i, list, c263711t2, this);
    }
}
