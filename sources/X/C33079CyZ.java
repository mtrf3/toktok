package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.CyZ, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33079CyZ extends AbstractC39455Fe7 {
    public final Paint LJ;
    public final DIJ LJFF;

    public C33079CyZ() {
        this.LIZJ.LJIIIIZZ(12.0f, 2.0f);
        C32856Cuy.Q9(this.LIZJ);
        this.LIZJ.LJIILL(16.27f);
        this.LIZJ.LIZJ(4.0f, 4.0f, false, true, 35.46f, 24.0f);
        this.LIZJ.LJIIL(-11.1f, 4.36f);
        this.LIZJ.LJIIIZ(1.0f, 1.0f, false, true, -0.73f, 0.0f);
        this.LIZJ.LJII(12.53f, 24.0f);
        this.LIZJ.LIZJ(4.0f, 4.0f, false, true, 10.0f, 20.27f);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIJ(4.0f);
        C32856Cuy.ed(this.LIZJ);
        this.LIZJ.LJIILIIL(11.86f, 15.46f);
        this.LIZJ.LJIIIZ(0.3f, 0.3f, false, true, 0.28f, 0.0f);
        this.LIZJ.LJIIL(3.04f, 1.52f);
        this.LIZJ.LJIIIZ(0.6f, 0.6f, false, false, 0.87f, -0.63f);
        this.LIZJ.LJIIL(-0.52f, -3.62f);
        this.LIZJ.LJIIIZ(0.3f, 0.3f, false, true, 0.09f, -0.26f);
        this.LIZJ.LJIIL(2.2f, -2.2f);
        this.LIZJ.LJIIIZ(0.6f, 0.6f, false, false, -0.33f, -1.03f);
        this.LIZJ.LJIIL(-3.22f, -0.5f);
        this.LIZJ.LJIIIZ(0.3f, 0.3f, false, true, -0.23f, -0.17f);
        this.LIZJ.LJIIL(-1.49f, -3.22f);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJIIIZ(0.6f, 0.6f, false, false, -1.1f, 0.0f);
        this.LIZJ.LJIIL(-1.49f, 3.22f);
        this.LIZJ.LJIIIZ(0.3f, 0.3f, false, true, -0.23f, 0.18f);
        this.LIZJ.LJIIL(-3.22f, 0.5f);
        this.LIZJ.LJIIIZ(0.6f, 0.6f, false, false, -0.33f, 1.02f);
        this.LIZJ.LJIIL(2.2f, 2.2f);
        this.LIZJ.LJIIJ(0.07f, 0.07f, 0.1f, 0.17f, 0.09f, 0.26f);
        this.LIZJ.LJIIL(-0.52f, 3.62f);
        this.LIZJ.LJIIIZ(0.6f, 0.6f, false, false, 0.87f, 0.63f);
        this.LIZJ.LJIIL(3.04f, -1.52f);
        this.LIZJ.LIZLLL();
        Paint LIZ = DIX.LIZ(this.LIZJ, Path.FillType.WINDING);
        this.LJ = LIZ;
        DIJ dij = new DIJ();
        this.LJFF = dij;
        dij.LJIIIIZZ(6.06f, 22.11f);
        dij.LJIIJ(0.5f, -0.12f, 0.94f, 0.31f, 0.94f, 0.84f);
        dij.LJIIIZ(4.0f, 4.0f, false, false, 2.44f, 3.68f);
        dij.LJIIL(13.47f, 5.7f);
        dij.LJIIIZ(4.0f, 4.0f, false, false, 3.2f, -0.04f);
        dij.LJIIL(12.53f, -5.63f);
        dij.LIZJ(4.0f, 4.0f, false, false, 41.0f, 23.01f);
        C32856Cuy.v9(dij);
        dij.LJIIJ(0.0f, -0.55f, 0.45f, -1.01f, 0.99f, -0.88f);
        dij.LIZJ(4.0f, 4.0f, false, true, 45.0f, 26.0f);
        C32856Cuy.LJLJJL(dij);
        dij.LJIIIZ(4.0f, 4.0f, false, true, -4.0f, 4.0f);
        dij.LJI(7.0f);
        dij.LJIIIZ(4.0f, 4.0f, false, true, -4.0f, -4.0f);
        C32856Cuy.y9(dij);
        dij.LJIIIZ(4.0f, 4.0f, false, true, 3.06f, -3.89f);
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
