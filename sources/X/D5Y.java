package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class D5Y extends AbstractC39455Fe7 {
    public final Paint LJ;
    public final DIJ LJFF;

    public D5Y() {
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIIIZZ(17.0f, 23.0f);
        p.LJIIJ(1.66f, 0.0f, 3.0f, -1.8f, 3.0f, -4.0f);
        p.LJIILJJIL(-1.34f, -4.0f, -3.0f, -4.0f, true);
        p.LJIILJJIL(-3.0f, 1.8f, -3.0f, 4.0f, true);
        p.LJIILJJIL(1.34f, 4.0f, 3.0f, 4.0f, true);
        p.LIZLLL();
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJIIIIZZ(34.0f, 19.0f);
        p2.LJIIJ(0.0f, 2.2f, -1.34f, 4.0f, -3.0f, 4.0f);
        DIJ p3 = this.LIZJ;
        o.LJIIIZ(p3, "p");
        p3.LJIILJJIL(-3.0f, -1.8f, -3.0f, -4.0f, true);
        p3.LJIILJJIL(1.34f, -4.0f, 3.0f, -4.0f, true);
        p3.LJIILJJIL(3.0f, 1.8f, 3.0f, 4.0f, true);
        p3.LIZLLL();
        this.LIZJ.LJIIIIZZ(16.56f, 30.95f);
        this.LIZJ.LJIIIZ(0.95f, 0.95f, false, false, 0.2f, 1.35f);
        this.LIZJ.LJIIL(1.45f, 1.1f);
        this.LIZJ.LJIIJ(0.44f, 0.33f, 1.08f, 0.24f, 1.46f, -0.16f);
        this.LIZJ.LJIIJ(0.88f, -0.91f, 2.52f, -2.33f, 4.33f, -2.33f);
        this.LIZJ.LJIIJ(1.68f, 0.0f, 3.42f, 1.47f, 4.34f, 2.39f);
        this.LIZJ.LJIIJ(0.37f, 0.38f, 0.98f, 0.44f, 1.41f, 0.12f);
        this.LIZJ.LJIIL(1.5f, -1.12f);
        this.LIZJ.LJIIIZ(0.95f, 0.95f, false, false, 0.19f, -1.35f);
        this.LIZJ.LJ(29.66f, 28.68f, 27.2f, 27.0f, 24.0f, 27.0f);
        this.LIZJ.LJIILJJIL(-5.65f, 1.66f, -7.44f, 3.95f, true);
        this.LIZJ.LIZLLL();
        Paint LIZ = DIX.LIZ(this.LIZJ, Path.FillType.WINDING);
        this.LJ = LIZ;
        DIJ dij = new DIJ();
        this.LJFF = dij;
        C32856Cuy.Sg(dij);
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
