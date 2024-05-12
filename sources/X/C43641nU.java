package X;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.1nU, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C43641nU implements InterfaceC34831Yh, InterfaceC22630uh, InterfaceC34841Yi {
    public final String LIZ;
    public final AbstractC45041pk LIZIZ;
    public final C0M5<LinearGradient> LIZJ = new C0M5<>();
    public final C0M5<RadialGradient> LIZLLL = new C0M5<>();
    public final Matrix LJ = new Matrix();
    public final Path LJFF;
    public final Paint LJI;
    public final RectF LJII;
    public final List<InterfaceC34851Yj> LJIIIIZZ;
    public final EnumC271414s LJIIIZ;
    public final C43761ng LJIIJ;
    public final C43771nh LJIIJJI;
    public final C43791nj LJIIL;
    public final C43791nj LJIILIIL;
    public C35171Zp LJIILJJIL;
    public final C04740Go LJIILL;
    public final int LJIILLIIL;

    public final int LJFF() {
        int i;
        int round = Math.round(this.LJIIL.LJ * this.LJIILLIIL);
        int round2 = Math.round(this.LJIILIIL.LJ * this.LJIILLIIL);
        int round3 = Math.round(this.LJIIJ.LJ * this.LJIILLIIL);
        if (round != 0) {
            i = round * 527;
        } else {
            i = 17;
        }
        if (round2 != 0) {
            i = i * 31 * round2;
        }
        if (round3 != 0) {
            return i * 31 * round3;
        }
        return i;
    }

    @Override // X.InterfaceC22630uh
    public final void LJI() {
        this.LJIILL.invalidateSelf();
    }

    @Override // X.InterfaceC20640rU
    public final String getName() {
        return this.LIZ;
    }

    @Override // X.InterfaceC34831Yh
    public final void LIZ(RectF rectF, Matrix matrix) {
        this.LJFF.reset();
        for (int i = 0; i < ((ArrayList) this.LJIIIIZZ).size(); i++) {
            this.LJFF.addPath(((InterfaceC34851Yj) ListProtector.get(this.LJIIIIZZ, i)).getPath(), matrix);
        }
        this.LJFF.computeBounds(rectF, false);
        rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
    }

    @Override // X.InterfaceC263811u
    public final <T> void LIZIZ(T t, C06800Om<T> c06800Om) {
        C35171Zp c35171Zp;
        if (t == C0GO.LJJ) {
            if (C03970Dp.LIZ && (c35171Zp = this.LJIILJJIL) != null) {
                ((ArrayList) this.LIZIZ.LJIJI).remove(c35171Zp);
            }
            if (c06800Om == null) {
                this.LJIILJJIL = null;
                return;
            }
            C35171Zp c35171Zp2 = new C35171Zp(c06800Om);
            this.LJIILJJIL = c35171Zp2;
            c35171Zp2.LIZ(this);
            this.LIZIZ.LJFF(this.LJIILJJIL);
        }
    }

    @Override // X.InterfaceC20640rU
    public final void LIZLLL(List<InterfaceC20640rU> list, List<InterfaceC20640rU> list2) {
        for (int i = 0; i < list2.size(); i++) {
            InterfaceC20640rU interfaceC20640rU = (InterfaceC20640rU) ListProtector.get(list2, i);
            if (interfaceC20640rU instanceof InterfaceC34851Yj) {
                ((ArrayList) this.LJIIIIZZ).add(interfaceC20640rU);
            }
        }
    }

    public C43641nU(C04740Go c04740Go, AbstractC45041pk abstractC45041pk, C38781fe c38781fe) {
        Path path = new Path();
        this.LJFF = path;
        this.LJII = new RectF();
        this.LJIIIIZZ = new ArrayList();
        if (C03970Dp.LIZ) {
            this.LJI = new C19440pY(1);
        } else {
            this.LJI = new Paint(1);
        }
        this.LIZIZ = abstractC45041pk;
        this.LIZ = c38781fe.LJI;
        this.LJIILL = c04740Go;
        this.LJIIIZ = c38781fe.LIZ;
        path.setFillType(c38781fe.LIZIZ);
        this.LJIILLIIL = (int) (c04740Go.LJLILLLLZI.LIZIZ() / 32.0f);
        AbstractC22650uj<C271314r, C271314r> LIZ = c38781fe.LIZJ.LIZ();
        this.LJIIJ = (C43761ng) LIZ;
        LIZ.LIZ(this);
        abstractC45041pk.LJFF(LIZ);
        AbstractC22650uj<Integer, Integer> LIZ2 = c38781fe.LIZLLL.LIZ();
        this.LJIIJJI = (C43771nh) LIZ2;
        LIZ2.LIZ(this);
        abstractC45041pk.LJFF(LIZ2);
        AbstractC22650uj<PointF, PointF> LIZ3 = c38781fe.LJ.LIZ();
        this.LJIIL = (C43791nj) LIZ3;
        LIZ3.LIZ(this);
        abstractC45041pk.LJFF(LIZ3);
        AbstractC22650uj<PointF, PointF> LIZ4 = c38781fe.LJFF.LIZ();
        this.LJIILIIL = (C43791nj) LIZ4;
        LIZ4.LIZ(this);
        abstractC45041pk.LJFF(LIZ4);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC34831Yh
    public final void LIZJ(Canvas canvas, Matrix matrix, int i) {
        RadialGradient LJ;
        this.LJFF.reset();
        for (int i2 = 0; i2 < ((ArrayList) this.LJIIIIZZ).size(); i2++) {
            this.LJFF.addPath(((InterfaceC34851Yj) ListProtector.get(this.LJIIIIZZ, i2)).getPath(), matrix);
        }
        this.LJFF.computeBounds(this.LJII, false);
        if (this.LJIIIZ == EnumC271414s.Linear) {
            long LJFF = LJFF();
            LJ = this.LIZJ.LJ(LJFF, null);
            if (LJ == null) {
                PointF LJI = this.LJIIL.LJI();
                PointF LJI2 = this.LJIILIIL.LJI();
                C271314r LJI3 = LJI();
                LJ = new LinearGradient(LJI.x, LJI.y, LJI2.x, LJI2.y, LJI3.LIZIZ, LJI3.LIZ, Shader.TileMode.CLAMP);
                this.LIZJ.LJI(LJFF, LJ);
            }
        } else {
            long LJFF2 = LJFF();
            LJ = this.LIZLLL.LJ(LJFF2, null);
            if (LJ == null) {
                PointF LJI4 = this.LJIIL.LJI();
                PointF LJI5 = this.LJIILIIL.LJI();
                C271314r LJI6 = LJI();
                int[] iArr = LJI6.LIZIZ;
                float[] fArr = LJI6.LIZ;
                LJ = new RadialGradient(LJI4.x, LJI4.y, (float) Math.hypot(LJI5.x - r10, LJI5.y - r11), iArr, fArr, Shader.TileMode.CLAMP);
                this.LIZLLL.LJI(LJFF2, LJ);
            }
        }
        this.LJ.set(matrix);
        LJ.setLocalMatrix(this.LJ);
        this.LJI.setShader(LJ);
        C35171Zp c35171Zp = this.LJIILJJIL;
        if (c35171Zp != null) {
            this.LJI.setColorFilter((ColorFilter) c35171Zp.LJI());
        }
        this.LJI.setAlpha(Math.max(0, Math.min(255, (int) ((((i / 255.0f) * LJI().intValue()) / 100.0f) * 255.0f))));
        canvas.drawPath(this.LJFF, this.LJI);
        C0GR.LIZ();
    }

    @Override // X.InterfaceC263811u
    public final void LJ(C263711t c263711t, int i, List<C263711t> list, C263711t c263711t2) {
        C06260Mk.LIZLLL(c263711t, i, list, c263711t2, this);
    }
}
