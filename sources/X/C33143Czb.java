package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.Czb, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33143Czb extends AbstractC39455Fe7 {
    public final Paint LJ;
    public final DIJ LJFF;

    public C33143Czb() {
        this.LIZJ.LJIIIIZZ(22.91f, 23.67f);
        this.LIZJ.LJIIJ(0.49f, -0.84f, 1.7f, -0.84f, 2.18f, 0.0f);
        this.LIZJ.LJIIL(1.4f, 2.4f);
        this.LIZJ.LJIIL(2.72f, 0.6f);
        this.LIZJ.LJIIJ(0.94f, 0.2f, 1.32f, 1.34f, 0.67f, 2.07f);
        this.LIZJ.LJIIL(-1.85f, 2.07f);
        this.LIZJ.LJIIL(0.28f, 2.77f);
        this.LIZJ.LJIIJ(0.1f, 0.96f, -0.88f, 1.67f, -1.76f, 1.28f);
        this.LIZJ.LJII(24.0f, 33.74f);
        this.LIZJ.LJIIL(-2.55f, 1.12f);
        this.LIZJ.LJIIIZ(1.26f, 1.26f, false, true, -1.76f, -1.28f);
        this.LIZJ.LJIIL(0.28f, -2.77f);
        this.LIZJ.LJIIL(-1.85f, -2.07f);
        this.LIZJ.LJIIIZ(1.26f, 1.26f, false, true, 0.67f, -2.08f);
        this.LIZJ.LJIIL(2.72f, -0.59f);
        this.LIZJ.LJIIL(1.4f, -2.4f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIIIIZZ(24.0f, 25.2f);
        this.LIZJ.LJIIL(-1.1f, 1.9f);
        this.LIZJ.LJIIJ(-0.19f, 0.31f, -0.49f, 0.53f, -0.83f, 0.6f);
        this.LIZJ.LJIIL(-2.16f, 0.47f);
        this.LIZJ.LJIIL(1.47f, 1.65f);
        this.LIZJ.LJIIJ(0.24f, 0.26f, 0.35f, 0.61f, 0.32f, 0.96f);
        this.LIZJ.LJIIL(-0.23f, 2.2f);
        this.LIZJ.LJIIL(2.02f, -0.9f);
        this.LIZJ.LJIIJ(0.33f, -0.14f, 0.7f, -0.14f, 1.02f, 0.0f);
        this.LIZJ.LJIIL(2.02f, 0.9f);
        this.LIZJ.LJIIL(-0.23f, -2.2f);
        this.LIZJ.LJIIJ(-0.03f, -0.35f, 0.08f, -0.7f, 0.32f, -0.96f);
        this.LIZJ.LJIIL(1.47f, -1.65f);
        this.LIZJ.LJIIL(-2.16f, -0.46f);
        this.LIZJ.LJIIJ(-0.34f, -0.08f, -0.64f, -0.3f, -0.82f, -0.6f);
        this.LIZJ.LJII(24.0f, 25.2f);
        this.LIZJ.LIZLLL();
        Paint LIZ = DIX.LIZ(this.LIZJ, Path.FillType.WINDING);
        this.LJ = LIZ;
        DIJ dij = new DIJ();
        this.LJFF = dij;
        dij.LJIIIIZZ(5.89f, 13.39f);
        dij.LJIIIZ(2.0f, 2.0f, false, true, 1.7f, -2.26f);
        dij.LJIIL(29.7f, -4.18f);
        dij.LJIIIZ(2.0f, 2.0f, false, true, 2.27f, 1.7f);
        dij.LJIIL(0.55f, 3.96f);
        dij.LJIIIZ(2.0f, 2.0f, false, true, -1.7f, 2.26f);
        dij.LJII(16.17f, 18.0f);
        dij.LJI(39.0f);
        dij.LJIIIZ(2.0f, 2.0f, false, true, 2.0f, 2.0f);
        C32856Cuy.j(dij);
        dij.LJI(9.0f);
        dij.LJIIIZ(2.0f, 2.0f, false, true, -2.0f, -2.0f);
        C32856Cuy.s9(dij);
        dij.LJIIIZ(2.0f, 2.0f, false, true, 0.4f, -1.21f);
        dij.LJIIIZ(2.0f, 2.0f, false, true, -0.96f, -1.44f);
        I9A.LIZIZ(dij, -0.55f, -3.96f, 1.98f, -0.28f);
        dij.LJIIL(0.55f, 3.96f);
        dij.LJIIL(29.71f, -4.18f);
        dij.LJIIL(-0.55f, -3.96f);
        dij.LJIIL(-29.71f, 4.18f);
        dij.LIZLLL();
        dij.LJIIIIZZ(39.0f, 20.0f);
        C32856Cuy.LLLLLZIL(dij);
        C32856Cuy.LJLJL(dij);
        C32856Cuy.LJJIII(dij);
        dij.LJIJ(20.0f);
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
