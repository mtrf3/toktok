package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.CyI, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33062CyI extends AbstractC39455Fe7 {
    public final Paint LJ;
    public final DIJ LJFF;

    public C33062CyI() {
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIIIZZ(22.0f, 9.0f);
        C32856Cuy.Cg(this.LIZJ);
        C32856Cuy.p8(this.LIZJ);
        this.LIZJ.LJIIIIZZ(16.0f, 28.0f);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJIIIZ(8.0f, 8.0f, true, true, 16.0f, 0.0f);
        p2.LJIIIZ(8.0f, 8.0f, false, true, -16.0f, 0.0f);
        p2.LIZLLL();
        this.LIZJ.LJIILIIL(8.0f, -4.0f);
        C32856Cuy.Id(this.LIZJ);
        Paint LIZ = DIX.LIZ(this.LIZJ, Path.FillType.WINDING);
        this.LJ = LIZ;
        DIJ dij = new DIJ();
        this.LJFF = dij;
        dij.LJIIIIZZ(45.13f, 28.33f);
        dij.LJIIIZ(1.0f, 1.0f, false, false, 0.0f, -0.66f);
        dij.LJ(41.99f, 18.8f, 33.67f, 12.0f, 24.0f, 12.0f);
        dij.LJIIJ(-9.83f, 0.0f, -17.93f, 6.63f, -21.13f, 15.67f);
        dij.LJIIIZ(1.0f, 1.0f, false, false, 0.0f, 0.66f);
        dij.LJ(6.07f, 37.37f, 14.17f, 44.0f, 24.0f, 44.0f);
        dij.LJIIJ(9.83f, 0.0f, 17.93f, -6.63f, 21.13f, -15.67f);
        dij.LIZLLL();
        dij.LJIIIIZZ(41.0f, 28.0f);
        dij.LJIILJJIL(-4.25f, 12.0f, -17.0f, 12.0f, false);
        dij.LJIILLIIL(7.0f, 28.0f, 7.0f, 28.0f, true);
        dij.LJIILJJIL(4.25f, -12.0f, 17.0f, -12.0f, true);
        dij.LJIILJJIL(17.0f, 12.0f, 17.0f, 12.0f, true);
        dij.LIZLLL();
        dij.LJIIIIZZ(13.37f, 12.56f);
        dij.LIZJ(1.0f, 1.0f, false, true, 12.0f, 12.2f);
        dij.LJII(9.5f, 7.87f);
        dij.LJIIIZ(1.0f, 1.0f, false, true, 0.37f, -1.37f);
        dij.LJIIL(1.73f, -1.0f);
        dij.LJIIIZ(1.0f, 1.0f, false, true, 1.36f, 0.37f);
        dij.LJIIL(2.5f, 4.33f);
        dij.LJIIIZ(1.0f, 1.0f, false, true, -0.36f, 1.36f);
        C279417u.LIZIZ(dij, -1.73f, 1.0f, 36.0f, 12.2f);
        dij.LJIIIZ(1.0f, 1.0f, false, true, -1.37f, 0.36f);
        dij.LJIIL(-1.73f, -1.0f);
        dij.LJIIIZ(1.0f, 1.0f, false, true, -0.36f, -1.36f);
        dij.LJIIL(2.5f, -4.33f);
        dij.LJIIIZ(1.0f, 1.0f, false, true, 1.36f, -0.37f);
        dij.LJIIL(1.73f, 1.0f);
        dij.LJIIIZ(1.0f, 1.0f, false, true, 0.37f, 1.37f);
        dij.LJII(36.0f, 12.2f);
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
