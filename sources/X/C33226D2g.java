package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.D2g, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33226D2g extends AbstractC39455Fe7 {
    public final Paint LJ;
    public final DIJ LJFF;

    public C33226D2g() {
        this.LIZJ.LJIIIIZZ(8.13f, 21.28f);
        this.LIZJ.LJIIIZ(15.9f, 15.9f, false, true, 31.74f, 0.0f);
        this.LIZJ.LJIIJ(0.2f, 3.81f, -0.16f, 7.19f, -1.23f, 11.03f);
        this.LIZJ.LJIIJ(-0.78f, 2.77f, -2.86f, 6.49f, -2.86f, 6.49f);
        this.LIZJ.LJIIIZ(2.12f, 2.12f, false, true, -1.98f, 1.36f);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIJJI(-3.87f);
        this.LIZJ.LJIIIZ(3.18f, 3.18f, false, false, -2.75f, -1.6f);
        this.LIZJ.LJIIJJI(-6.36f);
        this.LIZJ.LJIIIZ(3.18f, 3.18f, false, false, -3.18f, 3.19f);
        this.LIZJ.LJIILL(1.06f);
        this.LIZJ.LJIIIZ(3.18f, 3.18f, false, false, 3.18f, 3.17f);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJIIJJI(6.36f);
        this.LIZJ.LJIIJ(1.18f, 0.0f, 2.2f, -0.63f, 2.75f, -1.58f);
        this.LIZJ.LJIIJJI(3.87f);
        this.LIZJ.LJIIIZ(6.36f, 6.36f, false, false, 5.94f, -4.08f);
        this.LIZJ.LJIIL(2.91f, -7.58f);
        C32856Cuy.d0(this.LIZJ);
        DIJ p3 = this.LIZJ;
        o.LJIIIZ(p3, "p");
        p3.LJIIIZ(3.18f, 3.18f, false, false, 3.18f, -3.18f);
        C32856Cuy.LJJLI(this.LIZJ);
        this.LIZJ.LJIIJ(0.0f, -1.39f, -0.9f, -2.57f, -2.14f, -3.0f);
        this.LIZJ.LJIIIZ(20.13f, 20.13f, false, false, -40.22f, 0.0f);
        this.LIZJ.LJIIIZ(3.18f, 3.18f, false, false, -2.14f, 3.0f);
        DIJ p4 = this.LIZJ;
        o.LJIIIZ(p4, "p");
        p4.LJIILL(5.3f);
        this.LIZJ.LJIIIZ(3.18f, 3.18f, false, false, 3.18f, 3.18f);
        C32856Cuy.LLLLLLZ(this.LIZJ);
        this.LIZJ.LJIIJ(1.17f, 0.0f, 2.12f, -0.95f, 2.12f, -2.12f);
        this.LIZJ.LJIILL(-9.34f);
        this.LIZJ.LIZLLL();
        Paint LIZ = DIX.LIZ(this.LIZJ, Path.FillType.WINDING);
        this.LJ = LIZ;
        DIJ dij = new DIJ();
        this.LJFF = dij;
        dij.LJIIIIZZ(32.84f, 36.45f);
        dij.LJIIJ(0.2f, -0.37f, 0.45f, -0.88f, 0.74f, -1.47f);
        dij.LJIIJ(0.6f, -1.23f, 1.19f, -2.61f, 1.49f, -3.67f);
        dij.LJIIJ(0.44f, -1.59f, 0.75f, -3.07f, 0.93f, -4.54f);
        dij.LJIJ(22.6f);
        dij.LJIIIZ(12.0f, 12.0f, true, false, -24.0f, 0.0f);
        dij.LJIILL(9.53f);
        dij.LJIIJ(0.0f, 2.69f, 0.88f, 5.17f, 2.38f, 7.17f);
        dij.LJIIIZ(6.89f, 6.89f, false, true, 6.44f, -4.44f);
        dij.LJIIJJI(6.36f);
        dij.LJIIJ(1.67f, 0.0f, 3.2f, 0.6f, 4.4f, 1.59f);
        dij.LJIIJJI(1.26f);
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
