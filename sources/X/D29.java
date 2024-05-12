package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class D29 extends AbstractC39455Fe7 {
    public D29() {
        this.LIZJ.LJIIIIZZ(12.32f, 4.0f);
        this.LIZJ.LJIIJJI(23.36f);
        C32856Cuy.yf(this.LIZJ);
        this.LIZJ.LJIILL(17.26f);
        C32856Cuy.W9(this.LIZJ);
        this.LIZJ.LJI(17.85f);
        C32856Cuy.Qb(this.LIZJ);
        this.LIZJ.LJIIL(-4.36f, 4.84f);
        this.LIZJ.LJIIJ(-0.38f, 0.43f, -0.76f, 0.84f, -1.09f, 1.15f);
        this.LIZJ.LJIIJ(-0.28f, 0.26f, -0.9f, 0.82f, -1.78f, 0.92f);
        C32856Cuy.Sf(this.LIZJ);
        this.LIZJ.LJ(4.0f, 42.95f, 4.0f, 42.39f, 4.0f, 41.8f);
        C32856Cuy.se(this.LIZJ);
        this.LIZJ.LJ(10.36f, 4.0f, 11.27f, 4.0f, 12.32f, 4.0f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIIIIZZ(9.94f, 8.05f);
        C32856Cuy.z7(this.LIZJ);
        this.LIZJ.LIZJ(34.0f, 34.0f, false, false, 8.0f, 12.4f);
        this.LIZJ.LJIILL(28.29f);
        this.LIZJ.LJIIL(3.6f, -4.0f);
        this.LIZJ.LJIIL(0.13f, -0.14f);
        this.LIZJ.LJIIIZ(9.5f, 9.5f, false, true, 1.73f, -1.65f);
        this.LIZJ.LJIIIZ(6.0f, 6.0f, false, true, 1.83f, -0.81f);
        this.LIZJ.LJIIIZ(9.5f, 9.5f, false, true, 2.38f, -0.19f);
        this.LIZJ.LJI(35.6f);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIIZ(34.0f, 34.0f, false, false, 2.46f, -0.05f);
        p.LJIIJ(0.55f, -0.04f, 0.75f, -0.12f, 0.85f, -0.17f);
        p.LJIIIZ(2.0f, 2.0f, false, false, 0.87f, -0.87f);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJIIJ(0.05f, -0.1f, 0.13f, -0.3f, 0.17f, -0.85f);
        p2.LJIIJ(0.05f, -0.56f, 0.05f, -1.3f, 0.05f, -2.46f);
        this.LIZJ.LJIJ(12.4f);
        this.LIZJ.LJIIJ(0.0f, -1.15f, 0.0f, -1.9f, -0.05f, -2.46f);
        this.LIZJ.LJIIIZ(2.28f, 2.28f, false, false, -0.17f, -0.85f);
        this.LIZJ.LJIIIZ(2.0f, 2.0f, false, false, -0.87f, -0.87f);
        DIJ p3 = this.LIZJ;
        o.LJIIIZ(p3, "p");
        p3.LJIIJ(-0.1f, -0.05f, -0.3f, -0.13f, -0.85f, -0.17f);
        this.LIZJ.LIZJ(34.0f, 34.0f, false, false, 35.6f, 8.0f);
        this.LIZJ.LJI(12.4f);
        DIJ p4 = this.LIZJ;
        o.LJIIIZ(p4, "p");
        p4.LJIIIZ(34.0f, 34.0f, false, false, -2.46f, 0.05f);
        p4.LIZLLL();
        this.LIZJ.LJIIZILJ(Path.FillType.EVEN_ODD);
    }

    @Override // X.AbstractC39455Fe7
    public final void LIZ(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        LIZIZ(48.0f, 48.0f, canvas);
        canvas.drawPath(this.LIZJ.LIZ, this.LIZIZ);
    }
}
