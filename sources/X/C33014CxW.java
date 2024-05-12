package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.CxW, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33014CxW extends AbstractC39455Fe7 {
    public final Paint LJ;
    public final DIJ LJFF;
    public final Paint LJI;
    public final DIJ LJII;

    public C33014CxW() {
        this.LIZJ.LJIIIIZZ(19.51f, 14.5f);
        C32856Cuy.K8(this.LIZJ);
        this.LIZJ.LJIILIIL(-1.73f, 3.43f);
        this.LIZJ.LJIIL(-2.7f, 8.3f);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIJJI(5.4f);
        p.LJIIL(-2.7f, -8.3f);
        p.LIZLLL();
        Paint LIZ = DIX.LIZ(this.LIZJ, Path.FillType.EVEN_ODD);
        this.LJ = LIZ;
        DIJ dij = new DIJ();
        this.LJFF = dij;
        dij.LJIILIIL(27.74f, 29.18f);
        dij.LJIIL(1.21f, 3.72f);
        C32856Cuy.Le(dij);
        dij.LJIIIIZZ(35.25f, 32.9f);
        dij.LJIIL(-1.21f, -3.72f);
        dij.LJIIL(-3.66f, -11.23f);
        dij.LJIIL(-0.98f, -2.76f);
        C32856Cuy.wo(dij);
        dij.LJIIZILJ(Path.FillType.WINDING);
        Paint LIZ2 = C42193GhB.LIZ(this.LIZ, LIZ);
        this.LJI = LIZ2;
        DIJ dij2 = new DIJ();
        this.LJII = dij2;
        C32856Cuy.D(dij2);
        dij2.LJIIJJI(14.4f);
        dij2.LJIIJ(2.3f, 0.0f, 3.8f, 0.0f, 4.93f, 0.1f);
        dij2.LJIIJ(1.09f, 0.08f, 1.49f, 0.24f, 1.69f, 0.34f);
        dij2.LJIIIZ(4.0f, 4.0f, false, true, 1.74f, 1.74f);
        dij2.LJIIJ(0.1f, 0.2f, 0.26f, 0.6f, 0.34f, 1.7f);
        dij2.LJIIJ(0.1f, 1.12f, 0.1f, 2.61f, 0.1f, 4.92f);
        dij2.LJIILL(14.4f);
        dij2.LJIIJ(0.0f, 2.3f, 0.0f, 3.8f, -0.1f, 4.93f);
        dij2.LJIIIZ(4.56f, 4.56f, false, true, -0.34f, 1.69f);
        dij2.LJIIIZ(4.0f, 4.0f, false, true, -1.74f, 1.74f);
        dij2.LJIIJ(-0.2f, 0.1f, -0.6f, 0.26f, -1.7f, 0.34f);
        dij2.LJIIJ(-1.12f, 0.1f, -2.61f, 0.1f, -4.92f, 0.1f);
        dij2.LJI(16.8f);
        dij2.LJIIJ(-2.3f, 0.0f, -3.8f, 0.0f, -4.93f, -0.1f);
        dij2.LJIIIZ(4.56f, 4.56f, false, true, -1.69f, -0.34f);
        dij2.LJIIIZ(4.0f, 4.0f, false, true, -1.74f, -1.74f);
        dij2.LJIIJ(-0.1f, -0.2f, -0.26f, -0.6f, -0.34f, -1.7f);
        dij2.LJ(8.0f, 35.0f, 8.0f, 33.52f, 8.0f, 31.2f);
        dij2.LJIJ(16.8f);
        dij2.LJIIJ(0.0f, -2.3f, 0.0f, -3.8f, 0.1f, -4.93f);
        dij2.LJIIJ(0.08f, -1.09f, 0.24f, -1.49f, 0.34f, -1.69f);
        dij2.LJIIIZ(4.0f, 4.0f, false, true, 1.74f, -1.74f);
        dij2.LJIIJ(0.2f, -0.1f, 0.6f, -0.26f, 1.7f, -0.34f);
        dij2.LJ(13.0f, 8.0f, 14.48f, 8.0f, 16.8f, 8.0f);
        dij2.LIZLLL();
        dij2.LJIIZILJ(Path.FillType.EVEN_ODD);
        this.LIZ.add(LIZ2);
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
