package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class D3H extends AbstractC39455Fe7 {
    public final Paint LJ;
    public final DIJ LJFF;
    public final Paint LJI;
    public final DIJ LJII;

    public D3H() {
        this.LIZJ.LJIIIIZZ(14.04f, 1.9f);
        this.LIZJ.LJIIIZ(6.0f, 6.0f, false, false, -5.96f, 5.37f);
        this.LIZJ.LJIIL(-0.35f, 3.32f);
        this.LIZJ.LJIIIZ(7.97f, 7.97f, false, true, 3.66f, -0.89f);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIJJI(25.32f);
        this.LIZJ.LJIIJ(1.27f, 0.0f, 2.48f, 0.3f, 3.56f, 0.83f);
        this.LIZJ.LJIIL(-0.35f, -3.26f);
        this.LIZJ.LJIIIZ(6.0f, 6.0f, false, false, -5.96f, -5.37f);
        this.LIZJ.LJI(14.04f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIIZILJ(Path.FillType.WINDING);
        this.LIZIZ.setStyle(Paint.Style.FILL);
        Paint LIZIZ = KMP.LIZIZ(this.LIZIZ, -16595489);
        this.LJ = LIZIZ;
        DIJ dij = new DIJ();
        this.LJFF = dij;
        dij.LJIIIIZZ(27.92f, 23.27f);
        dij.LJIIIZ(1.62f, 1.62f, true, true, 0.0f, 2.3f);
        dij.LJIIL(-1.15f, -1.15f);
        dij.LJIIL(1.15f, -1.15f);
        dij.LIZLLL();
        dij.LJIIIIZZ(17.82f, 23.27f);
        dij.LJIIIZ(1.62f, 1.62f, false, true, 2.3f, 0.0f);
        dij.LJIIL(1.14f, 1.15f);
        dij.LJIIL(-1.15f, 1.14f);
        dij.LJIIIZ(1.62f, 1.62f, false, true, -2.29f, -2.29f);
        dij.LIZLLL();
        dij.LJIIZILJ(Path.FillType.WINDING);
        LIZIZ.setStyle(Paint.Style.FILL);
        LIZIZ.setColor(-49299);
        Paint LIZ = C42193GhB.LIZ(this.LIZ, LIZIZ);
        this.LJI = LIZ;
        DIJ dij2 = new DIJ();
        this.LJII = dij2;
        dij2.LJIIIIZZ(11.39f, 13.7f);
        dij2.LJIIIZ(4.0f, 4.0f, false, false, -3.97f, 3.52f);
        dij2.LJII(4.9f, 38.2f);
        dij2.LJIIIZ(6.0f, 6.0f, false, false, 5.96f, 6.71f);
        dij2.LJIIJJI(26.38f);
        dij2.LJIIIZ(6.0f, 6.0f, false, false, 5.95f, -6.71f);
        dij2.LJIIL(-2.5f, -20.97f);
        dij2.LJIIIZ(4.0f, 4.0f, false, false, -3.98f, -3.52f);
        dij2.LJI(11.39f);
        dij2.LIZLLL();
        dij2.LJIILIIL(20.27f, 21.2f);
        dij2.LJIIJ(0.38f, 0.38f, 1.0f, 0.38f, 1.38f, 0.0f);
        dij2.LJIIL(1.37f, -1.38f);
        dij2.LJIIJ(0.39f, -0.38f, 0.39f, -1.0f, 0.0f, -1.37f);
        dij2.LJIIL(-2.82f, -2.83f);
        dij2.LJIIIZ(5.52f, 5.52f, true, false, -6.43f, -8.8f);
        dij2.LJIIL(-1.14f, 1.14f);
        dij2.LJIIL(-1.15f, -1.14f);
        dij2.LJIIIZ(5.52f, 5.52f, true, false, -6.44f, 8.8f);
        dij2.LJIIL(-2.84f, 2.84f);
        dij2.LJIIIZ(0.97f, 0.97f, false, false, 0.0f, 1.38f);
        dij2.LJIIL(1.37f, 1.37f);
        dij2.LJIIJ(0.38f, 0.39f, 1.0f, 0.39f, 1.38f, 0.0f);
        dij2.LJIIL(7.57f, -7.56f);
        dij2.LJIIL(0.1f, -0.1f);
        dij2.LJIIL(0.08f, 0.08f);
        dij2.LJIIL(7.57f, 7.57f);
        dij2.LIZLLL();
        dij2.LJIIZILJ(Path.FillType.EVEN_ODD);
        LIZ.setStyle(Paint.Style.FILL);
        LIZ.setColor(-49299);
        this.LIZ.add(LIZ);
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
