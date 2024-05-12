package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.D6x, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33347D6x extends AbstractC39455Fe7 {
    public C33347D6x() {
        C32856Cuy.p7(this.LIZJ);
        this.LIZJ.LJIIIZ(22.0f, 22.0f, true, true, 0.0f, 44.0f);
        this.LIZJ.LJIIIZ(22.0f, 22.0f, false, true, 0.0f, -44.0f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIILIIL(1.0f, 8.0f);
        C32856Cuy.LLII(this.LIZJ);
        this.LIZJ.LJIILL(2.49f);
        this.LIZJ.LJIIJ(-3.6f, 0.63f, -5.83f, 3.07f, -5.83f, 6.09f);
        this.LIZJ.LJIIJ(0.0f, 3.77f, 2.84f, 5.1f, 5.83f, 5.93f);
        this.LIZJ.LJIILL(6.26f);
        this.LIZJ.LJIIIZ(9.2f, 9.2f, false, true, -3.53f, -1.84f);
        this.LIZJ.LJIIJ(-0.5f, -0.4f, -1.24f, -0.37f, -1.62f, 0.15f);
        this.LIZJ.LJIIL(-0.9f, 1.23f);
        this.LIZJ.LJIIJ(-0.28f, 0.4f, -0.24f, 0.94f, 0.12f, 1.26f);
        this.LIZJ.LIZJ(11.22f, 11.22f, false, false, 22.0f, 35.22f);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIJ(37.0f);
        p.LJIIIZ(1.0f, 1.0f, false, false, 1.0f, 1.0f);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJIIJJI(2.0f);
        p2.LJIIIZ(1.0f, 1.0f, false, false, 1.0f, -1.0f);
        this.LIZJ.LJIILL(-1.74f);
        this.LIZJ.LJIIJ(4.44f, -0.57f, 6.42f, -3.36f, 6.42f, -6.5f);
        this.LIZJ.LJIIJ(0.0f, -4.07f, -3.25f, -5.4f, -6.42f, -6.26f);
        this.LIZJ.LJIILL(-5.55f);
        this.LIZJ.LJIIJ(1.03f, 0.27f, 2.04f, 0.73f, 2.93f, 1.4f);
        this.LIZJ.LJIIJ(0.49f, 0.36f, 1.2f, 0.32f, 1.56f, -0.17f);
        this.LIZJ.LJIIL(0.88f, -1.16f);
        this.LIZJ.LJIIJ(0.31f, -0.4f, 0.27f, -0.98f, -0.12f, -1.3f);
        this.LIZJ.LIZJ(10.84f, 10.84f, false, false, 26.0f, 13.47f);
        C32856Cuy.Tc(this.LIZJ);
        this.LIZJ.LIZLLL();
        C32856Cuy.gn(this.LIZJ);
        this.LIZJ.LJIIZILJ(Path.FillType.WINDING);
    }

    @Override // X.AbstractC39455Fe7
    public final void LIZ(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        LIZIZ(48.0f, 48.0f, canvas);
        canvas.drawPath(this.LIZJ.LIZ, this.LIZIZ);
    }
}
