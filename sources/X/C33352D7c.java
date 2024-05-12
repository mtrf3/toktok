package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.D7c, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33352D7c extends AbstractC39455Fe7 {
    public final Paint LJ;
    public final DIJ LJFF;

    public C33352D7c() {
        C32856Cuy.ua(this.LIZJ);
        this.LIZJ.LJIILIIL(11.81f, 12.2f);
        this.LIZJ.LJIIIZ(0.51f, 0.51f, false, true, -0.38f, 0.07f);
        this.LIZJ.LJIIJ(-5.94f, -1.37f, -13.73f, 1.51f, -15.82f, 9.53f);
        this.LIZJ.LJIIIZ(0.52f, 0.52f, false, true, -0.6f, 0.38f);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIL(-0.98f, -0.22f);
        p.LJIIIZ(0.5f, 0.5f, false, true, -0.37f, -0.6f);
        this.LIZJ.LJIIJ(2.48f, -9.7f, 12.16f, -12.96f, 19.28f, -10.76f);
        this.LIZJ.LJIIJ(0.4f, 0.13f, 0.44f, 0.65f, 0.09f, 0.86f);
        this.LIZJ.LJIIL(-1.22f, 0.75f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIIIIZZ(40.2f, 33.81f);
        this.LIZJ.LJIIJ(0.04f, 0.12f, 0.04f, 0.26f, 0.0f, 0.38f);
        this.LIZJ.LJIIJ(-0.28f, 0.8f, -0.91f, 1.97f, -1.96f, 3.02f);
        this.LIZJ.LJIIIZ(7.15f, 7.15f, false, true, -5.18f, 2.19f);
        this.LIZJ.LJIIIZ(7.15f, 7.15f, false, true, -5.18f, -2.19f);
        this.LIZJ.LJIIIZ(8.48f, 8.48f, false, true, -1.96f, -3.02f);
        this.LIZJ.LJIIIZ(0.57f, 0.57f, false, true, 0.0f, -0.38f);
        this.LIZJ.LJIIJ(0.27f, -0.8f, 0.91f, -1.97f, 1.96f, -3.02f);
        this.LIZJ.LJIIIZ(7.15f, 7.15f, false, true, 5.18f, -2.19f);
        this.LIZJ.LJIIJ(2.23f, 0.0f, 3.93f, 0.94f, 5.18f, 2.19f);
        this.LIZJ.LJIIIZ(8.48f, 8.48f, false, true, 1.96f, 3.02f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIIIIZZ(33.06f, 41.0f);
        this.LIZJ.LJIIJ(5.65f, 0.0f, 8.53f, -4.74f, 9.03f, -6.87f);
        this.LIZJ.LJIIIZ(0.55f, 0.55f, false, false, 0.0f, -0.26f);
        this.LIZJ.LJIIJ(-0.5f, -2.13f, -3.38f, -6.87f, -9.03f, -6.87f);
        this.LIZJ.LJIIJ(-5.65f, 0.0f, -8.53f, 4.74f, -9.03f, 6.87f);
        this.LIZJ.LJIIIZ(0.55f, 0.55f, false, false, 0.0f, 0.26f);
        this.LIZJ.LJIIJ(0.5f, 2.13f, 3.38f, 6.87f, 9.03f, 6.87f);
        this.LIZJ.LIZLLL();
        Paint LIZ = DIX.LIZ(this.LIZJ, Path.FillType.WINDING);
        this.LJ = LIZ;
        DIJ dij = new DIJ();
        this.LJFF = dij;
        dij.LJIIIIZZ(33.06f, 35.32f);
        dij.LJIIIZ(1.32f, 1.32f, true, true, 0.0f, -2.64f);
        dij.LJIIIZ(1.32f, 1.32f, false, true, 0.0f, 2.64f);
        dij.LIZLLL();
        dij.LJIILIIL(0.0f, 1.77f);
        dij.LJIIIZ(3.09f, 3.09f, true, false, 0.0f, -6.18f);
        dij.LJIIIZ(3.09f, 3.09f, false, false, 0.0f, 6.18f);
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
