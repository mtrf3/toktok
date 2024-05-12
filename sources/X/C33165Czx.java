package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.Czx, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33165Czx extends AbstractC39455Fe7 {
    public final Paint LJ;
    public final DIJ LJFF;

    public C33165Czx() {
        this.LIZJ.LJIIIIZZ(24.01f, 29.5f);
        this.LIZJ.LJIIJ(-0.85f, 0.0f, -1.5f, -0.65f, -1.5f, -1.5f);
        this.LIZJ.LJIILJJIL(0.65f, -1.5f, 1.5f, -1.5f, true);
        this.LIZJ.LJIILJJIL(1.5f, 0.65f, 1.5f, 1.5f, true);
        this.LIZJ.LJIILJJIL(-0.65f, 1.5f, -1.5f, 1.5f, true);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIIIIZZ(23.47f, 15.59f);
        this.LIZJ.LJIIIZ(3.65f, 3.65f, false, true, 2.23f, 0.18f);
        this.LIZJ.LJIIJ(0.6f, 0.27f, 1.1f, 0.75f, 1.47f, 1.47f);
        this.LIZJ.LJIIIZ(3.3f, 3.3f, false, true, -0.55f, 3.55f);
        this.LIZJ.LJIIIZ(6.56f, 6.56f, false, true, -3.04f, 1.63f);
        this.LIZJ.LJIIIZ(0.56f, 0.56f, false, false, -0.45f, 0.58f);
        this.LIZJ.LJIIL(0.1f, 1.0f);
        this.LIZJ.LJIIJ(0.03f, 0.27f, 0.27f, 0.47f, 0.54f, 0.42f);
        this.LIZJ.LJIIIZ(8.55f, 8.55f, false, false, 4.25f, -2.2f);
        this.LIZJ.LJIIIZ(5.08f, 5.08f, false, false, 0.93f, -5.89f);
        this.LIZJ.LJIIIZ(5.05f, 5.05f, false, false, -2.43f, -2.38f);
        this.LIZJ.LJIIIZ(5.64f, 5.64f, false, false, -3.44f, -0.32f);
        this.LIZJ.LJIIIZ(5.33f, 5.33f, false, false, -3.1f, 2.0f);
        this.LIZJ.LJIIJ(-0.57f, 0.71f, -0.98f, 1.5f, -1.25f, 2.18f);
        this.LIZJ.LJIIJ(-0.1f, 0.26f, 0.03f, 0.54f, 0.3f, 0.63f);
        this.LIZJ.LJIIL(0.94f, 0.32f);
        this.LIZJ.LJIIJ(0.27f, 0.09f, 0.55f, -0.05f, 0.66f, -0.3f);
        this.LIZJ.LJIIJ(0.2f, -0.51f, 0.52f, -1.08f, 0.92f, -1.58f);
        this.LIZJ.LJIIIZ(3.34f, 3.34f, false, true, 1.92f, -1.29f);
        this.LIZJ.LIZLLL();
        Paint LIZ = DIX.LIZ(this.LIZJ, Path.FillType.WINDING);
        this.LJ = LIZ;
        DIJ dij = new DIJ();
        this.LJFF = dij;
        dij.LJIIIIZZ(6.0f, 12.0f);
        C32856Cuy.ff(dij);
        dij.LJIILL(19.0f);
        dij.LJIIIZ(4.0f, 4.0f, false, true, -4.0f, 4.0f);
        C32856Cuy.p6(dij);
        dij.LJIIL(-6.3f, 6.3f);
        dij.LJIIIZ(1.0f, 1.0f, false, true, -1.7f, -0.71f);
        C32856Cuy.LLZLLIL(dij);
        dij.LJIILIIL(6.88f, 21.3f);
        dij.LJIIIZ(1.0f, 1.0f, false, true, 0.7f, -0.3f);
        dij.LJI(38.0f);
        dij.LJIIIZ(2.0f, 2.0f, false, false, 2.0f, -2.0f);
        C32856Cuy.Pf(dij);
        C32856Cuy.l6(dij);
        C32856Cuy.ym(dij);
        dij.LJIILL(26.17f);
        dij.LJIIL(4.88f, -4.88f);
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
