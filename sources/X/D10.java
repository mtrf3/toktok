package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class D10 extends AbstractC39455Fe7 {
    public final Paint LJ;
    public final DIJ LJFF;

    public D10() {
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIIIZZ(39.0f, 22.0f);
        C32856Cuy.R2(this.LIZJ);
        this.LIZJ.LJII(13.47f, 6.4f);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJIIIZ(1.0f, 1.0f, false, false, -0.87f, 1.0f);
        p2.LJIJ(30.0f);
        C32856Cuy.LLLLLZIL(this.LIZJ);
        C32856Cuy.Ed(this.LIZJ);
        DIJ p3 = this.LIZJ;
        o.LJIIIZ(p3, "p");
        p3.LJIJ(21.1f);
        this.LIZJ.LJIIJ(1.2f, 0.14f, 2.33f, 0.45f, 3.4f, 0.9f);
        this.LIZJ.LIZLLL();
        Paint LIZ = DIX.LIZ(this.LIZJ, Path.FillType.WINDING);
        this.LJ = LIZ;
        DIJ dij = new DIJ();
        this.LJFF = dij;
        dij.LJIIIIZZ(41.62f, 38.8f);
        dij.LJIIIZ(9.0f, 9.0f, true, false, -2.83f, 2.83f);
        dij.LJIIL(5.09f, 5.08f);
        C32856Cuy.LJZI(dij);
        dij.LJIIL(-5.09f, -5.09f);
        dij.LIZLLL();
        dij.LJIIIIZZ(34.0f, 39.0f);
        C32856Cuy.ak(dij);
        dij.LJIIZILJ(Path.FillType.EVEN_ODD);
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
