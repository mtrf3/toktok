package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.D0y, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33192D0y extends AbstractC39455Fe7 {
    public final Paint LJ;
    public final DIJ LJFF;

    public C33192D0y() {
        this.LIZJ.LJIIIIZZ(27.5f, 10.5f);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIJJI(-16.0f);
        C32856Cuy.Cn(this.LIZJ);
        this.LIZJ.LJIILL(16.01f);
        this.LIZJ.LJIIL(4.6f, -4.57f);
        this.LIZJ.LJIIIZ(4.0f, 4.0f, false, true, 5.23f, -0.35f);
        this.LIZJ.LJIIL(17.17f, 13.7f);
        C32856Cuy.v9(this.LIZJ);
        C32856Cuy.LLLLLLJ(this.LIZJ);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJIILL(13.5f);
        DIJ p3 = this.LIZJ;
        o.LJIIIZ(p3, "p");
        p3.LJIIIZ(5.0f, 5.0f, false, true, -5.0f, 5.0f);
        DIJ p4 = this.LIZJ;
        o.LJIIIZ(p4, "p");
        p4.LJIIJJI(-25.0f);
        C32856Cuy.ii(this.LIZJ);
        this.LIZJ.LJIILL(-25.0f);
        C32856Cuy.ji(this.LIZJ);
        DIJ p5 = this.LIZJ;
        o.LJIIIZ(p5, "p");
        p5.LJIIJJI(16.0f);
        p5.LJIIIZ(1.0f, 1.0f, false, true, 1.0f, 1.0f);
        p5.LJIILL(2.0f);
        p5.LJIIIZ(1.0f, 1.0f, false, true, -1.0f, 1.0f);
        this.LIZJ.LIZLLL();
        Paint LIZ = DIX.LIZ(this.LIZJ, Path.FillType.WINDING);
        this.LJ = LIZ;
        DIJ dij = new DIJ();
        this.LJFF = dij;
        dij.LJIIIIZZ(35.65f, 15.47f);
        dij.LJIIIZ(3.0f, 3.0f, false, false, -1.69f, -1.7f);
        dij.LJIIL(-1.18f, -0.46f);
        dij.LJIIIZ(1.0f, 1.0f, false, true, 0.1f, -1.9f);
        dij.LJIIL(0.79f, -0.21f);
        dij.LJIIIZ(3.0f, 3.0f, false, false, 2.02f, -1.9f);
        dij.LJIIL(0.58f, -1.63f);
        dij.LJIIIZ(1.0f, 1.0f, false, true, 1.89f, 0.0f);
        dij.LJIIL(0.57f, 1.63f);
        dij.LJIIIZ(3.0f, 3.0f, false, false, 2.03f, 1.9f);
        dij.LJIIL(0.8f, 0.22f);
        dij.LJIIIZ(1.0f, 1.0f, false, true, 0.1f, 1.89f);
        dij.LJIIL(-1.2f, 0.47f);
        dij.LJIIIZ(3.0f, 3.0f, false, false, -1.68f, 1.69f);
        dij.LJIIL(-0.63f, 1.6f);
        dij.LJIIIZ(1.0f, 1.0f, false, true, -1.87f, 0.0f);
        C279417u.LIZIZ(dij, -0.63f, -1.6f, 28.83f, 22.34f);
        dij.LJIIIZ(0.5f, 0.5f, false, true, 0.28f, 0.28f);
        dij.LJIIL(0.65f, 1.65f);
        dij.LJIIIZ(0.5f, 0.5f, false, false, 0.93f, 0.0f);
        dij.LJIIL(0.65f, -1.65f);
        dij.LJIIIZ(0.5f, 0.5f, false, true, 0.28f, -0.28f);
        dij.LJIIL(1.65f, -0.65f);
        dij.LJIIIZ(0.5f, 0.5f, false, false, 0.0f, -0.93f);
        dij.LJIIL(-1.65f, -0.65f);
        dij.LJIIIZ(0.5f, 0.5f, false, true, -0.28f, -0.28f);
        dij.LJIIL(-0.65f, -1.65f);
        dij.LJIIIZ(0.5f, 0.5f, false, false, -0.93f, 0.0f);
        dij.LJIIL(-0.65f, 1.65f);
        dij.LJIIIZ(0.5f, 0.5f, false, true, -0.28f, 0.28f);
        dij.LJIIL(-1.65f, 0.65f);
        dij.LJIIIZ(0.5f, 0.5f, false, false, 0.0f, 0.93f);
        dij.LJIIL(1.65f, 0.65f);
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
