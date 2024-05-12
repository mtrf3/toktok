package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class D5J extends AbstractC39455Fe7 {
    public final Paint LJ;
    public final DIJ LJFF;
    public final Paint LJI;
    public final DIJ LJII;

    public D5J() {
        this.LIZJ.LJIIIIZZ(26.91f, 3.33f);
        this.LIZJ.LJIIIZ(6.0f, 6.0f, false, false, -5.82f, 0.0f);
        this.LIZJ.LJII(5.03f, 12.25f);
        this.LIZJ.LJIIIZ(2.0f, 2.0f, false, false, 0.0f, 3.5f);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIL(16.06f, 8.92f);
        this.LIZJ.LJIIIZ(6.0f, 6.0f, false, false, 5.82f, 0.0f);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJIIL(16.06f, -8.92f);
        this.LIZJ.LJIIIZ(2.0f, 2.0f, false, false, 0.0f, -3.5f);
        this.LIZJ.LJII(26.91f, 3.33f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIILIIL(-3.88f, 3.5f);
        this.LIZJ.LJIIIZ(2.0f, 2.0f, false, true, 1.94f, 0.0f);
        this.LIZJ.LJII(37.88f, 14.0f);
        this.LIZJ.LJIIL(-12.9f, 7.17f);
        this.LIZJ.LJIIIZ(2.0f, 2.0f, false, true, -1.95f, 0.0f);
        this.LIZJ.LJII(10.12f, 14.0f);
        this.LIZJ.LJIIL(12.9f, -7.17f);
        this.LIZJ.LIZLLL();
        Paint LIZ = DIX.LIZ(this.LIZJ, Path.FillType.WINDING);
        this.LJ = LIZ;
        DIJ dij = new DIJ();
        this.LJFF = dij;
        dij.LJIIIIZZ(4.25f, 23.03f);
        C32856Cuy.E5(dij);
        dij.LJII(5.03f, 25.75f);
        dij.LJIIIZ(2.0f, 2.0f, false, true, -0.78f, -2.72f);
        dij.LIZLLL();
        dij.LJIIZILJ(Path.FillType.WINDING);
        Paint LIZ2 = C42193GhB.LIZ(this.LIZ, LIZ);
        this.LJI = LIZ2;
        DIJ dij2 = new DIJ();
        this.LJII = dij2;
        dij2.LJIIIIZZ(4.25f, 33.03f);
        C32856Cuy.E5(dij2);
        dij2.LJII(5.03f, 35.75f);
        dij2.LJIIIZ(2.0f, 2.0f, false, true, -0.78f, -2.72f);
        dij2.LIZLLL();
        dij2.LJIIZILJ(Path.FillType.WINDING);
        this.LIZ.add(LIZ2);
    }

    @Override // X.AbstractC39455Fe7
    public final void LIZ(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        LIZIZ(48.0f, 48.0f, canvas);
        canvas.drawPath(this.LIZJ.LIZ, this.LIZIZ);
        canvas.drawPath(this.LJFF.LIZ, this.LJ);
        canvas.drawPath(this.LJII.LIZ, this.LJI);
    }
}
