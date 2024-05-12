package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.D0n, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33181D0n extends AbstractC39455Fe7 {
    public final Paint LJ;
    public final DIJ LJFF;

    public C33181D0n() {
        this.LIZJ.LJIIIIZZ(15.16f, 10.12f);
        this.LIZJ.LJ(13.18f, 12.25f, 12.0f, 15.7f, 12.0f, 21.0f);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIIZ(19.0f, 19.0f, false, false, 3.6f, 11.21f);
        this.LIZJ.LJ(17.84f, 35.2f, 20.82f, 37.0f, 24.0f, 37.0f);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJIIJ(3.19f, 0.0f, 6.17f, -1.81f, 8.4f, -4.79f);
        this.LIZJ.LIZJ(19.0f, 19.0f, false, false, 36.0f, 21.0f);
        DIJ p3 = this.LIZJ;
        o.LJIIIZ(p3, "p");
        p3.LJIIJ(0.0f, -5.3f, -1.18f, -8.75f, -3.16f, -10.88f);
        this.LIZJ.LJ(30.86f, 8.0f, 27.93f, 7.0f, 24.0f, 7.0f);
        DIJ p4 = this.LIZJ;
        o.LJIIIZ(p4, "p");
        p4.LJIIJ(-3.93f, 0.0f, -6.86f, 1.0f, -8.84f, 3.12f);
        p4.LIZLLL();
        this.LIZJ.LJIIIIZZ(13.7f, 8.76f);
        this.LIZJ.LJ(16.18f, 6.08f, 19.75f, 5.0f, 24.0f, 5.0f);
        DIJ p5 = this.LIZJ;
        o.LJIIIZ(p5, "p");
        p5.LJIIJ(4.25f, 0.0f, 7.82f, 1.08f, 10.3f, 3.76f);
        this.LIZJ.LJ(36.77f, 11.4f, 38.0f, 15.46f, 38.0f, 21.0f);
        DIJ p6 = this.LIZJ;
        o.LJIIIZ(p6, "p");
        p6.LJIIIZ(21.0f, 21.0f, false, true, -4.0f, 12.41f);
        this.LIZJ.LJ(31.5f, 36.73f, 28.0f, 39.0f, 24.0f, 39.0f);
        DIJ p7 = this.LIZJ;
        o.LJIIIZ(p7, "p");
        p7.LJIILJJIL(-7.51f, -2.27f, -10.0f, -5.59f, true);
        this.LIZJ.LIZJ(21.0f, 21.0f, false, true, 10.0f, 21.0f);
        C32856Cuy.K7(this.LIZJ);
        Paint LIZ = DIX.LIZ(this.LIZJ, Path.FillType.WINDING);
        this.LJ = LIZ;
        DIJ dij = new DIJ();
        this.LJFF = dij;
        C32856Cuy.Zi(dij);
        dij.LJIIIIZZ(13.09f, 39.24f);
        C32856Cuy.Cl(dij);
        dij.LJIIIZ(58.96f, 58.96f, false, true, 2.95f, 4.1f);
        dij.LJIIJ(0.13f, 0.2f, 0.07f, 0.46f, -0.13f, 0.59f);
        dij.LJII(17.0f, 43.0f);
        dij.LJIIL(-0.52f, 0.32f);
        dij.LJIIIZ(0.4f, 0.4f, false, true, -0.54f, -0.12f);
        dij.LJIIIZ(57.0f, 57.0f, false, false, -2.85f, -3.95f);
        dij.LIZLLL();
        dij.LJIIIIZZ(34.56f, 39.22f);
        dij.LJIIJ(1.62f, -2.2f, 3.85f, -4.66f, 6.45f, -6.1f);
        dij.LJIIIZ(0.52f, 0.52f, false, false, 0.21f, -0.67f);
        C32856Cuy.pe(dij);
        dij.LJIIJ(-3.0f, 1.64f, -5.46f, 4.38f, -7.16f, 6.7f);
        dij.LJIIIZ(37.17f, 37.17f, false, false, -2.65f, 4.14f);
        dij.LJIIJ(-0.1f, 0.2f, -0.02f, 0.46f, 0.19f, 0.56f);
        dij.LJII(31.0f, 43.0f);
        dij.LJIIL(0.57f, 0.28f);
        dij.LJIIJ(0.18f, 0.1f, 0.4f, 0.02f, 0.5f, -0.16f);
        dij.LJIIL(0.51f, -0.91f);
        dij.LJIIJ(0.46f, -0.77f, 1.12f, -1.84f, 1.98f, -3.0f);
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
