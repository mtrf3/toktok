package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class D5V extends AbstractC39455Fe7 {
    public final Paint LJ;
    public final DIJ LJFF;

    public D5V() {
        this.LIZJ.LJIIIIZZ(34.5f, 70.36f);
        this.LIZJ.LJIIIZ(1.52f, 1.52f, false, false, 2.44f, 0.0f);
        this.LIZJ.LJIIL(8.85f, -11.85f);
        this.LIZJ.LJIIJJI(19.84f);
        this.LIZJ.LJIIIZ(3.75f, 3.75f, false, false, 3.75f, -3.74f);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIILL(-50.0f);
        this.LIZJ.LJIIIZ(3.75f, 3.75f, false, false, -3.75f, -3.74f);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJI(5.8f);
        this.LIZJ.LJIIIZ(3.75f, 3.75f, false, false, -3.74f, 3.74f);
        DIJ p3 = this.LIZJ;
        o.LJIIIZ(p3, "p");
        p3.LJIILL(50.0f);
        this.LIZJ.LIZJ(3.75f, 3.75f, false, false, 5.8f, 58.5f);
        this.LIZJ.LJIIJJI(19.85f);
        this.LIZJ.LJIIL(8.85f, 11.85f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIIIIZZ(5.1f, 4.77f);
        DIJ p4 = this.LIZJ;
        o.LJIIIZ(p4, "p");
        p4.LJIIJ(0.0f, -0.38f, 0.32f, -0.69f, 0.7f, -0.69f);
        this.LIZJ.LJIIJJI(59.83f);
        this.LIZJ.LJIIJ(0.38f, 0.0f, 0.69f, 0.31f, 0.69f, 0.7f);
        DIJ p5 = this.LIZJ;
        o.LJIIIZ(p5, "p");
        p5.LJIILL(50.0f);
        this.LIZJ.LJIIIZ(0.7f, 0.7f, false, true, -0.7f, 0.69f);
        this.LIZJ.LJIIJJI(-20.6f);
        this.LIZJ.LJIIJ(-0.48f, 0.0f, -0.93f, 0.22f, -1.22f, 0.6f);
        this.LIZJ.LJII(35.72f, 66.9f);
        this.LIZJ.LJIIL(-8.08f, -10.82f);
        this.LIZJ.LJIIIZ(1.52f, 1.52f, false, false, -1.22f, -0.62f);
        DIJ p6 = this.LIZJ;
        o.LJIIIZ(p6, "p");
        p6.LJI(5.8f);
        this.LIZJ.LJIIIZ(0.7f, 0.7f, false, true, -0.7f, -0.69f);
        DIJ p7 = this.LIZJ;
        o.LJIIIZ(p7, "p");
        p7.LJIILL(-50.0f);
        this.LIZJ.LIZLLL();
        Paint LIZ = DIX.LIZ(this.LIZJ, Path.FillType.WINDING);
        this.LJ = LIZ;
        DIJ dij = new DIJ();
        this.LJFF = dij;
        dij.LJIIIIZZ(49.7f, 31.3f);
        dij.LJI(21.74f);
        dij.LJIIIZ(1.52f, 1.52f, true, true, 0.0f, -3.06f);
        dij.LJI(49.7f);
        dij.LJIIIZ(1.52f, 1.52f, true, true, 0.0f, 3.06f);
        dij.LIZLLL();
        dij.LJIIZILJ(Path.FillType.WINDING);
        this.LIZ.add(LIZ);
    }

    @Override // X.AbstractC39455Fe7
    public final void LIZ(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        LIZIZ(72.0f, 72.0f, canvas);
        canvas.drawPath(this.LIZJ.LIZ, this.LIZIZ);
        canvas.drawPath(this.LJFF.LIZ, this.LJ);
    }
}
