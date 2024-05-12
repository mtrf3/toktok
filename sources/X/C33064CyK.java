package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.CyK, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33064CyK extends AbstractC39455Fe7 {
    public final Paint LJ;
    public final DIJ LJFF;

    public C33064CyK() {
        this.LIZJ.LJIILIIL(15.8f, 19.4f);
        this.LIZJ.LJIIL(-2.5f, 6.89f);
        C32856Cuy.D0(this.LIZJ);
        this.LIZJ.LJIIL(-2.5f, -6.89f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIIIIZZ(29.0f, 29.0f);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIJJI(2.9f);
        this.LIZJ.LJIIJ(3.17f, 0.0f, 5.01f, -2.28f, 5.01f, -5.02f);
        this.LIZJ.LJIIJ(0.0f, -2.8f, -1.72f, -4.99f, -4.99f, -4.99f);
        C32856Cuy.F6(this.LIZJ);
        DIK.LIZIZ(this.LIZJ, "p", 29.0f);
        Paint LIZ = DIX.LIZ(this.LIZJ, Path.FillType.WINDING);
        this.LJ = LIZ;
        DIJ dij = new DIJ();
        this.LJFF = dij;
        C32856Cuy.X5(dij);
        dij.LJIILIIL(17.58f, 23.64f);
        dij.LJIIIZ(1.0f, 1.0f, false, true, -0.93f, 1.36f);
        dij.LJIIJJI(-1.71f);
        dij.LJIIIZ(1.0f, 1.0f, false, true, -0.94f, -0.65f);
        dij.LJIIL(-0.76f, -2.06f);
        dij.LJIIJJI(-6.87f);
        dij.LJIIL(-0.76f, 2.06f);
        dij.LJIIIZ(1.0f, 1.0f, false, true, -0.94f, 0.65f);
        dij.LJI(8.96f);
        dij.LJIIIZ(1.0f, 1.0f, false, true, -0.94f, -1.36f);
        dij.LJIIL(5.4f, -14.0f);
        dij.LJIIIZ(1.0f, 1.0f, false, true, 0.93f, -0.65f);
        dij.LJIIJJI(2.9f);
        dij.LJIIIZ(1.0f, 1.0f, false, true, 0.94f, 0.64f);
        I9A.LIZIZ(dij, 5.4f, 14.01f, 16.81f, -6.66f);
        dij.LJIIJ(0.0f, 4.85f, -3.48f, 8.02f, -8.47f, 8.02f);
        dij.LJI(26.6f);
        C32856Cuy.sh(dij);
        dij.LJIIJJI(5.3f);
        dij.LJIIJ(5.02f, 0.0f, 8.5f, 3.18f, 8.5f, 7.98f);
        dij.LIZLLL();
        dij.LJIIZILJ(Path.FillType.WINDING);
        this.LIZ.add(LIZ);
    }

    @Override // X.AbstractC39455Fe7
    public final void LIZ(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        LIZIZ(48.0f, 48.0f, canvas);
        canvas.drawPath(this.LIZJ.LIZ, this.LIZIZ);
        canvas.drawPath(this.LJFF.LIZ, this.LJ);
    }
}
