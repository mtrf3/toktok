package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class D34 extends AbstractC39455Fe7 {
    public final Paint LJ;
    public final DIJ LJFF;
    public final Paint LJI;
    public final DIJ LJII;

    public D34() {
        this.LIZJ.LJIIIIZZ(29.03f, 12.48f);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIILL(7.82f);
        this.LIZJ.LJIIL(2.77f, 1.73f);
        this.LIZJ.LJIIJ(0.07f, 0.02f, 0.23f, 0.02f, 0.3f, 0.0f);
        this.LIZJ.LJII(44.0f, 14.09f);
        this.LIZJ.LJIIJ(0.0f, -0.94f, -0.89f, -1.61f, -1.39f, -1.61f);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJI(29.03f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIIZILJ(Path.FillType.WINDING);
        this.LIZIZ.setStyle(Paint.Style.FILL);
        Paint LIZIZ = KMP.LIZIZ(this.LIZIZ, -16747834);
        this.LJ = LIZIZ;
        DIJ dij = new DIJ();
        this.LJFF = dij;
        dij.LJIILIIL(29.03f, 23.22f);
        dij.LJIIL(2.53f, 1.72f);
        dij.LJIIJ(0.35f, 0.26f, 0.78f, 0.0f, 0.78f, 0.0f);
        dij.LJ(31.9f, 25.2f, 44.0f, 17.26f, 44.0f, 17.26f);
        dij.LJIILL(14.38f);
        dij.LJIIJ(0.0f, 1.56f, -1.01f, 2.22f, -2.15f, 2.22f);
        dij.LJI(29.03f);
        dij.LJIJ(23.22f);
        dij.LIZLLL();
        dij.LJIIIIZZ(15.97f, 19.62f);
        dij.LJIIJ(-0.86f, 0.0f, -1.55f, 0.4f, -2.05f, 1.2f);
        dij.LJIIJ(-0.5f, 0.8f, -0.76f, 1.85f, -0.76f, 3.16f);
        dij.LJIIJ(0.0f, 1.34f, 0.25f, 2.4f, 0.76f, 3.17f);
        dij.LJIIJ(0.5f, 0.77f, 1.17f, 1.16f, 1.99f, 1.16f);
        dij.LJIIIZ(2.3f, 2.3f, false, false, 2.01f, -1.13f);
        dij.LJIIJ(0.5f, -0.76f, 0.75f, -1.8f, 0.75f, -3.14f);
        dij.LJIIJ(0.0f, -1.4f, -0.24f, -2.48f, -0.73f, -3.26f);
        dij.LJIIIZ(2.22f, 2.22f, false, false, -1.97f, -1.16f);
        dij.LIZLLL();
        dij.LJIIZILJ(Path.FillType.WINDING);
        LIZIZ.setStyle(Paint.Style.FILL);
        LIZIZ.setColor(-16747834);
        Paint LIZ = C42193GhB.LIZ(this.LIZ, LIZIZ);
        this.LJI = LIZ;
        DIJ dij2 = new DIJ();
        this.LJII = dij2;
        dij2.LJIIIIZZ(4.0f, 8.5f);
        dij2.LJIILL(30.62f);
        dij2.LJII(27.54f, 44.0f);
        dij2.LJIJ(4.0f);
        dij2.LJII(4.0f, 8.5f);
        dij2.LIZLLL();
        dij2.LJIIIIZZ(19.75f, 29.0f);
        dij2.LJIIJ(-0.99f, 1.3f, -2.29f, 1.94f, -3.89f, 1.94f);
        dij2.LJIIIZ(4.62f, 4.62f, false, true, -3.81f, -1.88f);
        dij2.LJIIIZ(7.74f, 7.74f, false, true, -1.47f, -4.9f);
        dij2.LJIIJ(0.0f, -2.14f, 0.5f, -3.86f, 1.5f, -5.17f);
        dij2.LIZJ(4.74f, 4.74f, false, true, 16.03f, 17.0f);
        dij2.LJIIJ(1.55f, 0.0f, 2.8f, 0.63f, 3.77f, 1.9f);
        dij2.LJIIJ(0.96f, 1.25f, 1.44f, 2.9f, 1.44f, 4.97f);
        dij2.LJIIJ(0.0f, 2.12f, -0.5f, 3.82f, -1.5f, 5.12f);
        dij2.LIZLLL();
        dij2.LJIIZILJ(Path.FillType.WINDING);
        LIZ.setStyle(Paint.Style.FILL);
        LIZ.setColor(-16747834);
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
