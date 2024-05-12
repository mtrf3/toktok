package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.D2m, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33232D2m extends AbstractC39455Fe7 {
    public final Paint LJ;
    public final DIJ LJFF;

    public C33232D2m() {
        this.LIZJ.LJIIIIZZ(6.02f, 24.94f);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIJ(0.1f, 2.0f, 0.54f, 3.91f, 1.24f, 5.69f);
        this.LIZJ.LJII(3.54f, 32.1f);
        C32856Cuy.Kg(this.LIZJ);
        this.LIZJ.LJIIIIZZ(6.2f, 36.93f);
        C32856Cuy.nh(this.LIZJ);
        this.LIZJ.LJIIL(-2.32f, 3.25f);
        this.LIZJ.LJIIIZ(22.13f, 22.13f, false, true, -5.05f, -5.0f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIIIIZZ(16.11f, 44.54f);
        C32856Cuy.Bm(this.LIZJ);
        this.LIZJ.LJIIIIZZ(28.57f, 45.52f);
        this.LIZJ.LIZJ(22.0f, 22.0f, true, false, 2.43f, 19.65f);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJIIL(3.92f, 0.8f);
        this.LIZJ.LJIIIZ(18.0f, 18.0f, true, true, 21.4f, 21.16f);
        this.LIZJ.LJIIL(0.82f, 3.91f);
        this.LIZJ.LIZLLL();
        Paint LIZ = DIX.LIZ(this.LIZJ, Path.FillType.WINDING);
        this.LJ = LIZ;
        DIJ dij = new DIJ();
        this.LJFF = dij;
        dij.LJIIIIZZ(18.19f, 16.12f);
        dij.LJIIJ(-0.19f, 0.27f, -0.19f, 0.72f, -0.19f, 1.62f);
        dij.LJIILL(12.52f);
        dij.LJIIJ(0.0f, 0.9f, 0.0f, 1.35f, 0.19f, 1.62f);
        dij.LJIIIZ(1.0f, 1.0f, false, false, 0.7f, 0.4f);
        dij.LJIIJ(0.32f, 0.04f, 0.71f, -0.18f, 1.5f, -0.62f);
        dij.LJIIL(11.13f, -6.27f);
        dij.LJIIJ(0.81f, -0.45f, 1.22f, -0.68f, 1.35f, -0.98f);
        dij.LJIIIZ(1.0f, 1.0f, false, false, 0.0f, -0.82f);
        dij.LJIIJ(-0.13f, -0.3f, -0.54f, -0.53f, -1.35f, -0.98f);
        dij.LJIIL(-11.14f, -6.27f);
        dij.LJIIJ(-0.78f, -0.44f, -1.17f, -0.66f, -1.5f, -0.62f);
        dij.LJIIIZ(1.0f, 1.0f, false, false, -0.7f, 0.4f);
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
