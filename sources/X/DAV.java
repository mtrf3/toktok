package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class DAV extends AbstractC39455Fe7 {
    public DAV() {
        this.LIZJ.LJIILIIL(38.09f, 11.2f);
        this.LIZJ.LJIIL(4.53f, -0.63f);
        this.LIZJ.LJIIIZ(0.5f, 0.5f, false, false, 0.43f, -0.56f);
        this.LIZJ.LJIIL(-0.35f, -2.48f);
        this.LIZJ.LJIIIZ(5.0f, 5.0f, false, false, -5.65f, -4.26f);
        this.LIZJ.LJIIL(-5.03f, 0.71f);
        this.LIZJ.LJIIL(6.07f, 7.23f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIIIIZZ(27.35f, 4.64f);
        this.LIZJ.LJIIL(-5.23f, 0.73f);
        this.LIZJ.LJIIL(6.06f, 7.23f);
        this.LIZJ.LJIIL(5.23f, -0.74f);
        this.LIZJ.LJIIL(-6.06f, -7.22f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIIIIZZ(12.22f, 6.76f);
        this.LIZJ.LJIIL(5.23f, -0.73f);
        this.LIZJ.LJIIL(6.06f, 7.23f);
        this.LIZJ.LJIIL(-5.23f, 0.73f);
        this.LIZJ.LJIIL(-6.06f, -7.23f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIIIIZZ(7.55f, 7.43f);
        this.LIZJ.LJIIIZ(5.0f, 5.0f, false, false, -3.97f, 5.6f);
        this.LIZJ.LJIIL(0.35f, 2.47f);
        this.LIZJ.LJIIJ(0.04f, 0.28f, 0.3f, 0.47f, 0.56f, 0.43f);
        this.LIZJ.LJIIL(9.12f, -1.28f);
        this.LIZJ.LJIIL(-6.06f, -7.22f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIIIIZZ(4.5f, 17.0f);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIIZ(0.5f, 0.5f, false, false, -0.5f, 0.5f);
        p.LJIJ(38.0f);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJIIIZ(6.0f, 6.0f, false, false, 6.0f, 6.0f);
        p2.LJIIJJI(28.0f);
        p2.LJIIIZ(6.0f, 6.0f, false, false, 6.0f, -6.0f);
        DIJ p3 = this.LIZJ;
        o.LJIIIZ(p3, "p");
        p3.LJIJ(17.5f);
        C32856Cuy.LLJJIJI(this.LIZJ);
        this.LIZJ.LJIIJJI(-39.0f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIILIIL(25.33f, 13.9f);
        this.LIZJ.LJIIL(-7.68f, 5.08f);
        DIJ p4 = this.LIZJ;
        o.LJIIIZ(p4, "p");
        p4.LJIIIZ(1.0f, 1.0f, false, true, -1.55f, -0.84f);
        C32856Cuy.x9(this.LIZJ);
        this.LIZJ.LJIIIZ(1.0f, 1.0f, false, true, 1.55f, -0.83f);
        this.LIZJ.LJIIL(7.68f, 5.07f);
        this.LIZJ.LJIIIZ(1.0f, 1.0f, false, true, 0.0f, 1.67f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIIZILJ(Path.FillType.WINDING);
    }

    @Override // X.AbstractC39455Fe7
    public final void LIZ(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        LIZIZ(48.0f, 48.0f, canvas);
        canvas.drawPath(this.LIZJ.LIZ, this.LIZIZ);
    }
}
