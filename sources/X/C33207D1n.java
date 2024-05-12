package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.D1n, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33207D1n extends AbstractC39455Fe7 {
    public final Paint LJ;
    public final DIJ LJFF;

    public C33207D1n() {
        this.LIZJ.LJIIIIZZ(35.67f, 8.67f);
        this.LIZJ.LJIIJ(0.35f, -0.35f, 0.4f, -0.92f, 0.06f, -1.3f);
        this.LIZJ.LIZJ(15.5f, 15.5f, false, false, 8.5f, 17.5f);
        this.LIZJ.LJIILL(13.46f);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIL(-3.03f, -3.02f);
        C32856Cuy.r9(this.LIZJ);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJIIL(7.3f, 7.3f);
        p2.LJIIIZ(2.5f, 2.5f, false, false, 3.53f, 0.0f);
        p2.LJIIL(7.3f, -7.3f);
        p2.LJIIIZ(1.0f, 1.0f, false, false, 0.0f, -1.4f);
        p2.LJIIL(-2.13f, -2.13f);
        p2.LJIIIZ(1.0f, 1.0f, false, false, -1.41f, 0.0f);
        p2.LJIIL(-3.03f, 3.02f);
        DIJ p3 = this.LIZJ;
        o.LJIIIZ(p3, "p");
        p3.LJIJ(17.5f);
        this.LIZJ.LJIIIZ(10.5f, 10.5f, false, true, 18.47f, -6.83f);
        this.LIZJ.LJIIJ(0.41f, 0.48f, 1.15f, 0.55f, 1.6f, 0.1f);
        this.LIZJ.LJIIL(2.1f, -2.1f);
        this.LIZJ.LIZLLL();
        Paint LIZ = DIX.LIZ(this.LIZJ, Path.FillType.WINDING);
        this.LJ = LIZ;
        DIJ dij = new DIJ();
        this.LJFF = dij;
        dij.LJIIIIZZ(22.7f, 46.0f);
        dij.LJIIJ(-3.63f, 0.0f, -6.94f, -1.36f, -9.46f, -3.6f);
        dij.LJIIJ(-0.4f, -0.37f, -0.4f, -1.0f, -0.01f, -1.39f);
        dij.LJIIL(2.12f, -2.11f);
        dij.LJIIJ(0.4f, -0.4f, 1.03f, -0.39f, 1.46f, -0.03f);
        dij.LIZJ(9.16f, 9.16f, false, false, 22.7f, 41.0f);
        C32856Cuy.A6(dij);
        dij.LJIIJ(5.8f, 0.0f, 10.5f, -4.7f, 10.5f, -10.5f);
        dij.LJIJ(20.04f);
        dij.LJIIL(-3.03f, 3.02f);
        dij.LJIIIZ(1.0f, 1.0f, false, true, -1.4f, 0.0f);
        dij.LJIIL(-2.13f, -2.12f);
        dij.LJIIIZ(1.0f, 1.0f, false, true, 0.0f, -1.41f);
        dij.LJIIL(7.3f, -7.3f);
        dij.LJIIIZ(2.5f, 2.5f, false, true, 3.53f, 0.0f);
        dij.LJIIL(7.3f, 7.3f);
        dij.LJIIIZ(1.0f, 1.0f, false, true, 0.0f, 1.4f);
        dij.LJIIL(-2.13f, 2.13f);
        C32856Cuy.r4(dij);
        dij.LJIJ(30.5f);
        dij.LIZJ(15.5f, 15.5f, false, true, 24.0f, 46.0f);
        dij.LJIIJJI(-1.3f);
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
