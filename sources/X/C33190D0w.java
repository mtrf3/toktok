package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.D0w, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33190D0w extends AbstractC39455Fe7 {
    public final Paint LJ;
    public final DIJ LJFF;

    public C33190D0w() {
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIIIZZ(4.0f, 16.8f);
        p.LJIIJ(0.0f, -4.48f, 0.0f, -6.72f, 0.87f, -8.43f);
        p.LJIIIZ(8.0f, 8.0f, false, true, 3.5f, -3.5f);
        p.LJ(10.07f, 4.0f, 12.32f, 4.0f, 16.8f, 4.0f);
        p.LJIIJJI(14.4f);
        p.LJIIJ(4.48f, 0.0f, 6.72f, 0.0f, 8.43f, 0.87f);
        p.LJIIIZ(8.0f, 8.0f, false, true, 3.5f, 3.5f);
        p.LJIIJ(0.87f, 1.7f, 0.87f, 3.95f, 0.87f, 8.43f);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJIILL(7.63f);
        this.LIZJ.LJIIIZ(14.0f, 14.0f, false, false, -4.0f, -1.92f);
        DIJ p3 = this.LIZJ;
        o.LJIIIZ(p3, "p");
        p3.LJIJ(16.8f);
        p3.LJIIJ(0.0f, -2.3f, 0.0f, -3.8f, -0.1f, -4.93f);
        p3.LJIIIZ(4.56f, 4.56f, false, false, -0.34f, -1.69f);
        p3.LJIIIZ(4.0f, 4.0f, false, false, -1.74f, -1.74f);
        p3.LJIIJ(-0.2f, -0.1f, -0.6f, -0.26f, -1.7f, -0.34f);
        p3.LJ(35.0f, 8.0f, 33.52f, 8.0f, 31.2f, 8.0f);
        p3.LJI(16.8f);
        C32856Cuy.LLJJJJLIIL(this.LIZJ);
        this.LIZJ.LJIIJJI(5.71f);
        this.LIZJ.LJIIIZ(14.0f, 14.0f, false, false, 1.92f, 4.0f);
        DIJ p4 = this.LIZJ;
        o.LJIIIZ(p4, "p");
        p4.LJI(16.8f);
        p4.LJIIJ(-4.48f, 0.0f, -6.72f, 0.0f, -8.43f, -0.87f);
        p4.LJIIIZ(8.0f, 8.0f, false, true, -3.5f, -3.5f);
        p4.LJ(4.0f, 37.92f, 4.0f, 35.68f, 4.0f, 31.2f);
        p4.LJIJ(16.8f);
        p4.LIZLLL();
        Paint LIZ = DIX.LIZ(this.LIZJ, Path.FillType.WINDING);
        this.LJ = LIZ;
        DIJ dij = new DIJ();
        this.LJFF = dij;
        C32856Cuy.n4(dij);
        dij.LJIIIIZZ(25.94f, 36.0f);
        dij.LJIIIZ(10.05f, 10.05f, true, true, 20.12f, 0.0f);
        dij.LJIIIZ(10.05f, 10.05f, true, true, -20.12f, 0.0f);
        dij.LIZLLL();
        dij.LJIILIIL(12.38f, -4.38f);
        dij.LJIIL(-3.6f, 5.82f);
        dij.LJIIL(-1.49f, -1.74f);
        dij.LJIIIZ(1.1f, 1.1f, false, false, -1.54f, -0.12f);
        dij.LJIIL(-1.0f, 0.85f);
        dij.LJIIIZ(1.1f, 1.1f, false, false, -0.12f, 1.54f);
        dij.LJIIL(3.04f, 3.57f);
        dij.LJIIJ(0.38f, 0.42f, 0.91f, 0.64f, 1.47f, 0.6f);
        dij.LJIIIZ(1.72f, 1.72f, false, false, 1.35f, -0.83f);
        dij.LJIIL(4.85f, -7.83f);
        dij.LJIIJ(0.33f, -0.52f, 0.17f, -1.2f, -0.35f, -1.5f);
        dij.LJIIL(-1.12f, -0.7f);
        dij.LJIIIZ(1.09f, 1.09f, false, false, -1.5f, 0.34f);
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
