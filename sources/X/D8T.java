package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class D8T extends AbstractC39455Fe7 {
    public final DIJ LJ;

    public D8T() {
        DIJ LIZIZ = C0H1.LIZIZ();
        this.LJ = LIZIZ;
        C32856Cuy.L5(LIZIZ);
        LIZIZ.LJIIZILJ(Path.FillType.WINDING);
        this.LIZJ.LJIILIIL(1.37f, 25.41f);
        this.LIZJ.LJIIL(14.85f, -14.85f);
        this.LIZJ.LJIIL(1.61f, 1.62f);
        C32856Cuy.fm(this.LIZJ);
        this.LIZJ.LJII(18.7f, 8.1f);
        this.LIZJ.LJIIL(6.71f, -6.72f);
        this.LIZJ.LJIIIZ(3.0f, 3.0f, false, true, 4.25f, 0.0f);
        this.LIZJ.LJIIL(3.55f, 3.56f);
        this.LIZJ.LJIIJ(0.37f, 0.36f, 0.39f, 0.94f, 0.12f, 1.38f);
        this.LIZJ.LJIIIZ(5.94f, 5.94f, false, false, 8.14f, 8.14f);
        this.LIZJ.LJIIJ(0.44f, -0.26f, 1.02f, -0.24f, 1.39f, 0.12f);
        this.LIZJ.LJIIL(3.77f, 3.77f);
        this.LIZJ.LJIIIZ(3.0f, 3.0f, false, true, 0.0f, 4.25f);
        this.LIZJ.LJII(39.9f, 29.3f);
        this.LIZJ.LJIIL(-1.67f, -1.67f);
        C32856Cuy.Bc(this.LIZJ);
        this.LIZJ.LJIIL(1.68f, 1.67f);
        this.LIZJ.LJIIL(-14.85f, 14.85f);
        this.LIZJ.LJIIIZ(3.0f, 3.0f, false, true, -4.25f, 0.0f);
        this.LIZJ.LJIIL(-3.85f, -3.86f);
        this.LIZJ.LJIIJ(-0.34f, -0.34f, -0.38f, -0.88f, -0.16f, -1.32f);
        this.LIZJ.LJIIIZ(5.94f, 5.94f, false, false, -8.0f, -8.0f);
        this.LIZJ.LJIIJ(-0.43f, 0.23f, -0.97f, 0.2f, -1.32f, -0.15f);
        this.LIZJ.LJIIL(-3.64f, -3.64f);
        this.LIZJ.LJIIIZ(3.0f, 3.0f, false, true, 0.0f, -4.25f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIILIIL(20.41f, -10.3f);
        this.LIZJ.LJIIIZ(0.72f, 0.72f, false, false, 0.0f, 1.01f);
        this.LIZJ.LJII(25.0f, 19.35f);
        C32856Cuy.fm(this.LIZJ);
        this.LIZJ.LJIIL(-3.22f, -3.22f);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIIZ(0.72f, 0.72f, false, false, -1.02f, 0.0f);
        p.LJIIL(-1.46f, 1.46f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIILIIL(6.81f, 7.83f);
        this.LIZJ.LJIIL(3.23f, 3.22f);
        this.LIZJ.LJIIJ(0.28f, 0.28f, 0.73f, 0.28f, 1.02f, 0.0f);
        this.LIZJ.LJIIL(1.45f, -1.46f);
        this.LIZJ.LJIIIZ(0.72f, 0.72f, false, false, 0.0f, -1.01f);
        this.LIZJ.LJIIL(-3.22f, -3.23f);
        C32856Cuy.Bc(this.LIZJ);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIIZILJ(Path.FillType.WINDING);
    }

    @Override // X.AbstractC39455Fe7
    public final void LIZ(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        LIZIZ(48.0f, 48.0f, canvas);
        canvas.clipPath(this.LJ.LIZ);
        canvas.drawPath(this.LIZJ.LIZ, this.LIZIZ);
    }
}
