package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.D0s, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33186D0s extends AbstractC39455Fe7 {
    public final Paint LJ;
    public final DIJ LJFF;

    public C33186D0s() {
        this.LIZJ.LJIIIIZZ(19.95f, 7.0f);
        C32856Cuy.S7(this.LIZJ);
        this.LIZJ.LJIIIIZZ(8.1f, 36.28f);
        this.LIZJ.LJIIJ(1.21f, -4.8f, 4.15f, -7.7f, 7.51f, -9.02f);
        this.LIZJ.LJIIIZ(12.45f, 12.45f, false, true, 10.28f, 0.6f);
        this.LIZJ.LJIIJ(0.24f, 0.13f, 0.55f, 0.05f, 0.69f, -0.2f);
        this.LIZJ.LJIIL(0.5f, -0.85f);
        this.LIZJ.LJIIIZ(0.49f, 0.49f, false, false, -0.18f, -0.68f);
        this.LIZJ.LJIIIZ(14.45f, 14.45f, false, false, -12.02f, -0.73f);
        this.LIZJ.LJIIJ(-4.0f, 1.56f, -7.37f, 5.01f, -8.74f, 10.44f);
        this.LIZJ.LJIIIZ(0.5f, 0.5f, false, false, 0.37f, 0.6f);
        this.LIZJ.LJIIL(0.98f, 0.22f);
        this.LIZJ.LJIIJ(0.27f, 0.06f, 0.53f, -0.11f, 0.6f, -0.38f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIIIIZZ(36.17f, 34.3f);
        this.LIZJ.LJIIJ(0.0f, 0.62f, -0.34f, 1.16f, -0.84f, 1.45f);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIILL(1.9f);
        this.LIZJ.LJIIJ(0.0f, 0.23f, -0.18f, 0.42f, -0.41f, 0.42f);
        this.LIZJ.LJIIJJI(-0.84f);
        this.LIZJ.LJIIIZ(0.42f, 0.42f, false, true, -0.41f, -0.42f);
        this.LIZJ.LJIILL(-1.9f);
        this.LIZJ.LJIIIZ(1.68f, 1.68f, false, true, 0.83f, -3.12f);
        this.LIZJ.LJIIJ(0.92f, 0.0f, 1.67f, 0.75f, 1.67f, 1.67f);
        this.LIZJ.LIZLLL();
        Paint LIZ = DIX.LIZ(this.LIZJ, Path.FillType.WINDING);
        this.LJ = LIZ;
        DIJ dij = new DIJ();
        this.LJFF = dij;
        dij.LJIIIIZZ(39.08f, 27.6f);
        dij.LJIILL(1.68f);
        C32856Cuy.d0(dij);
        dij.LJIIIZ(2.5f, 2.5f, false, true, 2.5f, 2.51f);
        dij.LJIILL(6.7f);
        dij.LIZJ(2.5f, 2.5f, false, true, 39.5f, 41.0f);
        dij.LJIIJJI(-10.0f);
        dij.LJIIIZ(2.5f, 2.5f, false, true, -2.5f, -2.51f);
        dij.LJIILL(-6.7f);
        dij.LJIIIZ(2.5f, 2.5f, false, true, 2.5f, -2.51f);
        C32856Cuy.d0(dij);
        dij.LJIJ(27.6f);
        dij.LJIIIZ(4.6f, 4.6f, true, true, 9.16f, 0.0f);
        dij.LIZLLL();
        dij.LJIILIIL(-7.5f, 0.0f);
        dij.LJIILL(1.68f);
        dij.LJIIJJI(5.84f);
        dij.LJIJ(27.6f);
        dij.LJIIIZ(2.92f, 2.92f, true, false, -5.84f, 0.0f);
        dij.LIZLLL();
        dij.LJIILIIL(-2.91f, 4.2f);
        dij.LJIILL(6.69f);
        dij.LJIIJ(0.0f, 0.46f, 0.37f, 0.84f, 0.83f, 0.84f);
        C32856Cuy.LJIIJJI(dij);
        dij.LJIIJ(0.46f, 0.0f, 0.83f, -0.38f, 0.83f, -0.84f);
        dij.LJIILL(-6.7f);
        dij.LJIIIZ(0.84f, 0.84f, false, false, -0.83f, -0.84f);
        dij.LJIIJJI(-10.0f);
        dij.LJIIIZ(0.84f, 0.84f, false, false, -0.83f, 0.84f);
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
