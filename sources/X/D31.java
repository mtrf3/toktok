package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class D31 extends AbstractC39455Fe7 {
    public final Paint LJ;
    public final DIJ LJFF;
    public final Paint LJI;
    public final DIJ LJII;

    public D31() {
        this.LIZJ.LJIIIIZZ(36.57f, 37.83f);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIJJI(-15.0f);
        this.LIZJ.LJIIIZ(3.37f, 3.37f, false, true, -3.28f, -3.44f);
        this.LIZJ.LJIJ(21.44f);
        this.LIZJ.LJIIJ(0.0f, -1.9f, 1.47f, -3.44f, 3.28f, -3.44f);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJIIJJI(19.14f);
        this.LIZJ.LIZJ(3.37f, 3.37f, false, true, 44.0f, 21.44f);
        this.LIZJ.LJIJ(39.9f);
        this.LIZJ.LJIIJ(0.0f, 0.93f, -0.9f, 1.55f, -1.72f, 1.18f);
        this.LIZJ.LJIIL(-5.71f, -3.25f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIIZILJ(Path.FillType.EVEN_ODD);
        this.LIZIZ.setStyle(Paint.Style.FILL);
        Paint LIZIZ = KMP.LIZIZ(this.LIZIZ, -14289682);
        this.LJ = LIZIZ;
        DIJ dij = new DIJ();
        this.LJFF = dij;
        dij.LJIIIIZZ(5.86f, 38.66f);
        dij.LJIIJ(-0.78f, 0.56f, -1.86f, 0.0f, -1.86f, -0.98f);
        dij.LJIJ(10.2f);
        dij.LJ(4.0f, 8.44f, 5.4f, 7.0f, 7.14f, 7.0f);
        dij.LJIIJJI(25.14f);
        dij.LJIIIZ(3.17f, 3.17f, false, true, 3.14f, 3.2f);
        dij.LJIILL(17.86f);
        dij.LJIIJ(0.0f, 1.77f, -1.4f, 3.2f, -3.14f, 3.2f);
        dij.LJI(15.34f);
        dij.LJIIL(-9.48f, 7.4f);
        dij.LIZLLL();
        dij.LJIIZILJ(Path.FillType.EVEN_ODD);
        LIZIZ.setStyle(Paint.Style.FILL);
        LIZIZ.setColor(-119723);
        Paint LIZ = C42193GhB.LIZ(this.LIZ, LIZIZ);
        this.LJI = LIZ;
        DIJ dij2 = new DIJ();
        this.LJII = dij2;
        dij2.LJIILIIL(18.54f, 17.01f);
        dij2.LJIIL(0.16f, -0.19f);
        dij2.LJIIJ(0.12f, -0.1f, 0.29f, -0.2f, 0.6f, -0.2f);
        dij2.LJIIJ(0.54f, 0.0f, 0.96f, 0.5f, 0.96f, 0.88f);
        dij2.LJIIJ(0.0f, 0.44f, -0.4f, 1.11f, -1.17f, 1.3f);
        dij2.LJIIJ(-0.21f, 0.05f, -0.4f, 0.23f, -0.4f, 0.46f);
        dij2.LJIILL(2.07f);
        dij2.LJIIJ(0.0f, 0.46f, 0.37f, 0.83f, 0.81f, 0.76f);
        dij2.LJIIIZ(4.79f, 4.79f, false, false, 4.02f, -4.59f);
        dij2.LJIIIZ(4.26f, 4.26f, false, false, -4.21f, -4.19f);
        dij2.LJIIJ(-1.05f, 0.0f, -2.0f, 0.34f, -2.76f, 1.02f);
        dij2.LJIIJ(-0.52f, 0.46f, -0.9f, 1.04f, -1.18f, 1.66f);
        dij2.LJIIJ(-0.19f, 0.42f, 0.06f, 0.89f, 0.49f, 1.03f);
        dij2.LJIIL(1.55f, 0.49f);
        dij2.LJIIJ(0.43f, 0.14f, 0.86f, -0.13f, 1.13f, -0.5f);
        dij2.LIZLLL();
        dij2.LJIIIIZZ(19.18f, 26.14f);
        dij2.LJIIJ(0.9f, 0.0f, 1.63f, -0.75f, 1.63f, -1.66f);
        dij2.LJIIJ(0.0f, -0.91f, -0.73f, -1.66f, -1.63f, -1.66f);
        dij2.LJIIJ(-0.9f, 0.0f, -1.64f, 0.75f, -1.64f, 1.66f);
        dij2.LJIIJ(0.0f, 0.91f, 0.73f, 1.66f, 1.64f, 1.66f);
        dij2.LIZLLL();
        dij2.LJIIZILJ(Path.FillType.WINDING);
        LIZ.setStyle(Paint.Style.FILL);
        LIZ.setColor(-1);
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
