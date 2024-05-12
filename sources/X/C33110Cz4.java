package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.Cz4, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33110Cz4 extends AbstractC39455Fe7 {
    public final Paint LJ;
    public final DIJ LJFF;

    public C33110Cz4() {
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIIIZZ(9.0f, 8.0f);
        C32856Cuy.LJIJJLI(this.LIZJ);
        C32856Cuy.An(this.LIZJ);
        this.LIZJ.LJIILL(8.18f);
        this.LIZJ.LJIIIZ(1.0f, 1.0f, false, false, 1.14f, 0.99f);
        this.LIZJ.LJIIL(2.0f, -0.29f);
        this.LIZJ.LJIIIZ(1.0f, 1.0f, false, false, 0.86f, -0.99f);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJIJ(9.0f);
        p2.LJIIIZ(5.0f, 5.0f, false, false, -5.0f, -5.0f);
        p2.LJI(9.0f);
        p2.LJIIIZ(5.0f, 5.0f, false, false, -5.0f, 5.0f);
        DIJ p3 = this.LIZJ;
        o.LJIIIZ(p3, "p");
        p3.LJIILL(18.0f);
        p3.LJIIIZ(5.0f, 5.0f, false, false, 5.0f, 5.0f);
        this.LIZJ.LJIIJJI(14.6f);
        DIJ p4 = this.LIZJ;
        o.LJIIIZ(p4, "p");
        p4.LJIIIZ(1.0f, 1.0f, false, false, 1.0f, -1.0f);
        p4.LJIILL(-2.0f);
        p4.LJIIIZ(1.0f, 1.0f, false, false, -1.0f, -1.0f);
        p4.LJI(9.0f);
        p4.LJIIIZ(1.0f, 1.0f, false, true, -1.0f, -1.0f);
        p4.LJIJ(9.0f);
        p4.LJIIIZ(1.0f, 1.0f, false, true, 1.0f, -1.0f);
        p4.LIZLLL();
        Paint LIZ = DIX.LIZ(this.LIZJ, Path.FillType.WINDING);
        this.LJ = LIZ;
        DIJ dij = new DIJ();
        this.LJFF = dij;
        dij.LJIIIIZZ(25.57f, 17.27f);
        dij.LJIIIZ(0.84f, 0.84f, false, true, 0.0f, 1.46f);
        dij.LJII(17.3f, 23.4f);
        dij.LJIIJ(-0.58f, 0.32f, -1.3f, -0.09f, -1.3f, -0.74f);
        dij.LJIILL(-9.3f);
        dij.LJIIJ(0.0f, -0.65f, 0.72f, -1.06f, 1.3f, -0.74f);
        C279417u.LIZIZ(dij, 8.27f, 4.66f, 27.0f, 36.0f);
        dij.LJIIIZ(5.0f, 5.0f, true, false, 5.0f, 5.0f);
        dij.LJIJ(27.48f);
        dij.LJIIL(10.6f, -1.52f);
        C32856Cuy.H9(dij);
        C32856Cuy.S6(dij);
        dij.LJIIIZ(5.0f, 5.0f, true, false, 5.0f, 5.0f);
        dij.LJIJ(22.2f);
        dij.LJIIIZ(1.0f, 1.0f, false, false, -1.14f, -1.0f);
        dij.LJIIL(-15.4f, 2.2f);
        dij.LJIIIZ(1.0f, 1.0f, false, false, -0.86f, 1.0f);
        C32856Cuy.J9(dij);
        dij.LJI(27.0f);
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
