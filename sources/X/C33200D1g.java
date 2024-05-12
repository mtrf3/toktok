package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.D1g, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33200D1g extends AbstractC39455Fe7 {
    public final Paint LJ;
    public final DIJ LJFF;

    public C33200D1g() {
        this.LIZJ.LJIIIIZZ(15.77f, 4.23f);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIIZ(1.0f, 1.0f, false, true, 1.4f, 0.13f);
        this.LIZJ.LJIIL(5.73f, 6.87f);
        this.LIZJ.LJIIIZ(1.0f, 1.0f, false, true, -0.76f, 1.64f);
        C32856Cuy.t6(this.LIZJ);
        this.LIZJ.LJIIIZ(11.0f, 11.0f, true, false, 0.0f, 22.0f);
        this.LIZJ.LJIIJJI(1.44f);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJIIIZ(1.0f, 1.0f, false, true, 1.0f, 1.0f);
        p2.LJIILL(2.0f);
        p2.LJIIIZ(1.0f, 1.0f, false, true, -1.0f, 1.0f);
        p2.LJI(17.0f);
        this.LIZJ.LJIIIZ(15.0f, 15.0f, false, true, -1.23f, -29.95f);
        this.LIZJ.LJIIL(-1.67f, -2.0f);
        this.LIZJ.LJIIIZ(1.0f, 1.0f, false, true, 0.13f, -1.4f);
        this.LIZJ.LJIIL(1.54f, -1.29f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIIIIZZ(32.23f, 43.51f);
        this.LIZJ.LJIIIZ(1.0f, 1.0f, false, true, -1.4f, -0.13f);
        this.LIZJ.LJIIL(-5.73f, -6.87f);
        this.LIZJ.LJIIIZ(1.0f, 1.0f, false, true, 0.76f, -1.64f);
        C32856Cuy.I6(this.LIZJ);
        this.LIZJ.LJIIIZ(11.0f, 11.0f, true, false, 0.0f, -22.0f);
        this.LIZJ.LJIIJJI(-1.44f);
        C32856Cuy.z4(this.LIZJ);
        C32856Cuy.I6(this.LIZJ);
        this.LIZJ.LJIIIZ(15.0f, 15.0f, false, true, 1.23f, 29.95f);
        this.LIZJ.LJIIL(1.67f, 2.0f);
        this.LIZJ.LJIIIZ(1.0f, 1.0f, false, true, -0.13f, 1.41f);
        this.LIZJ.LJIIL(-1.54f, 1.28f);
        this.LIZJ.LIZLLL();
        Paint LIZ = DIX.LIZ(this.LIZJ, Path.FillType.WINDING);
        this.LJ = LIZ;
        DIJ dij = new DIJ();
        this.LJFF = dij;
        dij.LJIIIIZZ(26.17f, 18.87f);
        dij.LJIIIZ(2.0f, 2.0f, false, false, -3.11f, -1.66f);
        dij.LJIIL(-3.9f, 2.61f);
        dij.LJIIIZ(1.0f, 1.0f, false, false, -0.27f, 1.39f);
        dij.LJII(20.0f, 22.87f);
        dij.LJIIIZ(1.0f, 1.0f, false, false, 1.39f, 0.28f);
        dij.LJIIL(0.78f, -0.54f);
        dij.LJIILL(8.26f);
        C32856Cuy.N8(dij);
        dij.LJIILL(-12.0f);
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
