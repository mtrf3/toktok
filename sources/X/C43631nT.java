package X;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.1nT, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C43631nT implements InterfaceC34831Yh, InterfaceC22630uh, InterfaceC34841Yi {
    public final Path LIZ;
    public final Paint LIZIZ;
    public final AbstractC45041pk LIZJ;
    public final String LIZLLL;
    public final List<InterfaceC34851Yj> LJ;
    public final C43741ne LJFF;
    public final C43771nh LJI;
    public C35171Zp LJII;
    public final C04740Go LJIIIIZZ;

    @Override // X.InterfaceC22630uh
    public final void LJI() {
        this.LJIIIIZZ.invalidateSelf();
    }

    @Override // X.InterfaceC20640rU
    public final String getName() {
        return this.LIZLLL;
    }

    @Override // X.InterfaceC34831Yh
    public final void LIZ(RectF rectF, Matrix matrix) {
        this.LIZ.reset();
        for (int i = 0; i < ((ArrayList) this.LJ).size(); i++) {
            this.LIZ.addPath(((InterfaceC34851Yj) ListProtector.get(this.LJ, i)).getPath(), matrix);
        }
        this.LIZ.computeBounds(rectF, false);
        rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
    }

    @Override // X.InterfaceC263811u
    public final <T> void LIZIZ(T t, C06800Om<T> c06800Om) {
        C35171Zp c35171Zp;
        if (t == C0GO.LIZ) {
            LJIIJ(c06800Om);
            return;
        }
        if (t == C0GO.LIZLLL) {
            LJIIJ(c06800Om);
            return;
        }
        if (t != C0GO.LJJ) {
            return;
        }
        if (C03970Dp.LIZ && (c35171Zp = this.LJII) != null) {
            ((ArrayList) this.LIZJ.LJIJI).remove(c35171Zp);
        }
        if (c06800Om == null) {
            this.LJII = null;
            return;
        }
        C35171Zp c35171Zp2 = new C35171Zp(c06800Om);
        this.LJII = c35171Zp2;
        c35171Zp2.LIZ(this);
        this.LIZJ.LJFF(this.LJII);
    }

    @Override // X.InterfaceC20640rU
    public final void LIZLLL(List<InterfaceC20640rU> list, List<InterfaceC20640rU> list2) {
        for (int i = 0; i < list2.size(); i++) {
            InterfaceC20640rU interfaceC20640rU = (InterfaceC20640rU) ListProtector.get(list2, i);
            if (interfaceC20640rU instanceof InterfaceC34851Yj) {
                ((ArrayList) this.LJ).add(interfaceC20640rU);
            }
        }
    }

    public C43631nT(C04740Go c04740Go, AbstractC45041pk abstractC45041pk, C38841fk c38841fk) {
        Path path = new Path();
        this.LIZ = path;
        this.LIZIZ = new Paint(1);
        this.LJ = new ArrayList();
        this.LIZJ = abstractC45041pk;
        this.LIZLLL = c38841fk.LIZJ;
        this.LJIIIIZZ = c04740Go;
        if (c38841fk.LIZLLL == null || c38841fk.LJ == null) {
            this.LJFF = null;
            this.LJI = null;
            return;
        }
        path.setFillType(c38841fk.LIZIZ);
        AbstractC22650uj<Integer, Integer> LIZ = c38841fk.LIZLLL.LIZ();
        this.LJFF = (C43741ne) LIZ;
        LIZ.LIZ(this);
        abstractC45041pk.LJFF(LIZ);
        AbstractC22650uj<Integer, Integer> LIZ2 = c38841fk.LJ.LIZ();
        this.LJI = (C43771nh) LIZ2;
        LIZ2.LIZ(this);
        abstractC45041pk.LJFF(LIZ2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC34831Yh
    public final void LIZJ(Canvas canvas, Matrix matrix, int i) {
        this.LIZIZ.setColor(LJI().intValue());
        Paint paint = this.LIZIZ;
        int min = Math.min(255, (int) ((((i / 255.0f) * LJI().intValue()) / 100.0f) * 255.0f));
        paint.setAlpha(Math.max(0, min));
        C35171Zp c35171Zp = this.LJII;
        if (c35171Zp != null) {
            this.LIZIZ.setColorFilter((ColorFilter) c35171Zp.LJI());
        }
        this.LIZ.reset();
        for (int i2 = 0; i2 < ((ArrayList) this.LJ).size(); i2++) {
            this.LIZ.addPath(((InterfaceC34851Yj) ListProtector.get(this.LJ, i2)).getPath(), matrix);
        }
        canvas.drawPath(this.LIZ, this.LIZIZ);
        C0GR.LIZ();
    }

    @Override // X.InterfaceC263811u
    public final void LJ(C263711t c263711t, int i, List<C263711t> list, C263711t c263711t2) {
        C06260Mk.LIZLLL(c263711t, i, list, c263711t2, this);
    }
}
