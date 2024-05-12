package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class D6F extends AbstractC39455Fe7 {
    public D6F() {
        this.LIZJ.LJIIIIZZ(25.0f, 0.0f);
        this.LIZJ.LJIIJ(0.55f, 0.0f, 1.0f, 0.51f, 1.0f, 1.14f);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIILL(5.72f);
        this.LIZJ.LJ(26.0f, 7.49f, 25.55f, 8.0f, 25.0f, 8.0f);
        C32856Cuy.LIZLLL(this.LIZJ);
        this.LIZJ.LJIIJ(-0.55f, 0.0f, -1.0f, -0.51f, -1.0f, -1.14f);
        this.LIZJ.LJIJ(1.14f);
        this.LIZJ.LJ(22.0f, 0.51f, 22.45f, 0.0f, 23.0f, 0.0f);
        C32856Cuy.LJJIJ(this.LIZJ);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJIIIIZZ(11.0f, 12.0f);
        this.LIZJ.LJIIJ(-1.43f, 0.0f, -2.4f, 1.41f, -1.84f, 2.68f);
        this.LIZJ.LJIIL(4.29f, 8.65f);
        this.LIZJ.LJIIIZ(2.0f, 2.0f, false, false, 1.84f, 1.17f);
        DIJ p3 = this.LIZJ;
        o.LJIIIZ(p3, "p");
        p3.LJIIJJI(17.36f);
        this.LIZJ.LJIIIZ(2.0f, 2.0f, false, false, 1.84f, -1.17f);
        this.LIZJ.LJIIL(4.28f, -8.65f);
        this.LIZJ.LJIIJ(0.57f, -1.27f, -0.4f, -2.68f, -1.83f, -2.68f);
        C32856Cuy.LLLLIIL(this.LIZJ);
        this.LIZJ.LJIIIIZZ(34.9f, 4.48f);
        this.LIZJ.LJIIJ(0.32f, -0.56f, 0.2f, -1.23f, -0.28f, -1.51f);
        DIJ p4 = this.LIZJ;
        o.LJIIIZ(p4, "p");
        p4.LJIIL(-1.74f, -1.0f);
        this.LIZJ.LJIIJ(-0.47f, -0.28f, -1.12f, -0.05f, -1.45f, 0.5f);
        this.LIZJ.LJII(29.1f, 6.53f);
        this.LIZJ.LJIIJ(-0.32f, 0.56f, -0.2f, 1.24f, 0.28f, 1.51f);
        DIJ p5 = this.LIZJ;
        o.LJIIIZ(p5, "p");
        p5.LJIIL(1.74f, 1.0f);
        this.LIZJ.LJIIJ(0.47f, 0.28f, 1.12f, 0.05f, 1.45f, -0.5f);
        this.LIZJ.LJIIL(2.33f, -4.05f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIIIIZZ(13.38f, 2.97f);
        this.LIZJ.LJIIJ(-0.47f, 0.28f, -0.6f, 0.95f, -0.28f, 1.5f);
        this.LIZJ.LJIIL(2.33f, 4.05f);
        this.LIZJ.LJIIJ(0.33f, 0.56f, 0.98f, 0.79f, 1.45f, 0.51f);
        this.LIZJ.LJIIL(1.74f, -1.0f);
        this.LIZJ.LJIIJ(0.47f, -0.27f, 0.6f, -0.95f, 0.28f, -1.5f);
        this.LIZJ.LJIIL(-2.33f, -4.05f);
        this.LIZJ.LJIIJ(-0.33f, -0.56f, -0.98f, -0.79f, -1.45f, -0.51f);
        this.LIZJ.LJIIL(-1.74f, 1.0f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIIIIZZ(14.5f, 29.9f);
        this.LIZJ.LJIIJ(0.0f, -1.05f, 0.9f, -1.9f, 2.0f, -1.9f);
        C32856Cuy.LJIILL(this.LIZJ);
        this.LIZJ.LJIIJ(1.1f, 0.0f, 2.0f, 0.85f, 2.0f, 1.9f);
        DIJ p6 = this.LIZJ;
        o.LJIIIZ(p6, "p");
        p6.LJIILL(14.2f);
        this.LIZJ.LJIIJ(0.0f, 1.05f, -0.9f, 1.9f, -2.0f, 1.9f);
        DIJ p7 = this.LIZJ;
        o.LJIIIZ(p7, "p");
        p7.LJIIJJI(-15.0f);
        this.LIZJ.LJIIJ(-1.1f, 0.0f, -2.0f, -0.85f, -2.0f, -1.9f);
        this.LIZJ.LJIJ(29.9f);
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
