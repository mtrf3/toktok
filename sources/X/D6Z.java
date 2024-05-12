package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class D6Z extends AbstractC39455Fe7 {
    public final Paint LJ;
    public final DIJ LJFF;

    public D6Z() {
        this.LIZJ.LJIIIIZZ(20.37f, 26.38f);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIJJI(7.26f);
        this.LIZJ.LJII(24.1f, 14.55f);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJIIJJI(-0.2f);
        this.LIZJ.LJIIL(-3.53f, 11.83f);
        this.LIZJ.LIZLLL();
        Paint LIZ = DIX.LIZ(this.LIZJ, Path.FillType.WINDING);
        this.LJ = LIZ;
        DIJ dij = new DIJ();
        this.LJFF = dij;
        C32856Cuy.Da(dij);
        dij.LJIILIIL(15.74f, 4.35f);
        dij.LJIIIZ(1.0f, 1.0f, false, true, 0.95f, -0.69f);
        dij.LJIIJJI(4.85f);
        dij.LJIIIZ(1.0f, 1.0f, false, true, 0.95f, 0.69f);
        dij.LJIIL(7.4f, 22.63f);
        dij.LJIIIZ(0.5f, 0.5f, false, true, -0.47f, 0.65f);
        dij.LJIIJJI(-3.05f);
        dij.LJIIIZ(1.0f, 1.0f, false, true, -0.96f, -0.71f);
        dij.LJIIL(-1.64f, -5.51f);
        dij.LJIIJJI(-9.28f);
        dij.LJIIL(-1.64f, 5.5f);
        dij.LJIIIZ(1.0f, 1.0f, false, true, -0.96f, 0.72f);
        dij.LJIIJJI(-3.08f);
        dij.LJIIIZ(0.5f, 0.5f, false, true, -0.48f, -0.65f);
        dij.LJIIL(7.41f, -22.63f);
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
