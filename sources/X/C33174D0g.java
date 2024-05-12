package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.D0g, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33174D0g extends AbstractC39455Fe7 {
    public final Paint LJ;
    public final DIJ LJFF;

    public C33174D0g() {
        this.LIZJ.LJIIIIZZ(24.0f, 15.25f);
        this.LIZJ.LJIIIZ(9.25f, 9.25f, true, false, 0.0f, 18.5f);
        this.LIZJ.LJIIIZ(9.25f, 9.25f, false, false, 0.0f, -18.5f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIILIIL(-5.75f, 9.25f);
        this.LIZJ.LJIIIZ(5.75f, 5.75f, true, true, 11.5f, 0.0f);
        this.LIZJ.LJIIIZ(5.75f, 5.75f, false, true, -11.5f, 0.0f);
        this.LIZJ.LIZLLL();
        Paint LIZ = DIX.LIZ(this.LIZJ, Path.FillType.WINDING);
        this.LJ = LIZ;
        DIJ dij = new DIJ();
        this.LJFF = dij;
        dij.LJIIIIZZ(21.65f, 4.0f);
        dij.LJIIIZ(10.0f, 10.0f, false, false, -7.22f, 3.08f);
        dij.LJIIJ(-1.27f, 1.33f, -2.33f, 2.1f, -3.38f, 2.2f);
        dij.LJIIL(-1.56f, 0.16f);
        dij.LJIIJ(-0.95f, 0.1f, -1.78f, 0.18f, -2.47f, 0.3f);
        dij.LJIIJ(-0.72f, 0.13f, -1.43f, 0.33f, -2.11f, 0.74f);
        dij.LJIIIZ(6.0f, 6.0f, false, false, -2.34f, 2.58f);
        dij.LJIIIZ(6.08f, 6.08f, false, false, -0.52f, 2.17f);
        dij.LJ(2.0f, 15.93f, 2.0f, 16.76f, 2.0f, 17.72f);
        dij.LJIILL(15.96f);
        C32856Cuy.Ih(dij);
        dij.LJIJ(17.72f);
        dij.LJIIJ(0.0f, -0.96f, 0.0f, -1.8f, -0.05f, -2.49f);
        dij.LJIIIZ(6.08f, 6.08f, false, false, -0.52f, -2.17f);
        dij.LJIIIZ(6.0f, 6.0f, false, false, -2.34f, -2.58f);
        dij.LJIIJ(-0.68f, -0.41f, -1.39f, -0.6f, -2.11f, -0.74f);
        dij.LJIIIZ(34.2f, 34.2f, false, false, -2.47f, -0.3f);
        dij.LJIIL(-1.56f, -0.15f);
        dij.LJIIJ(-1.05f, -0.11f, -2.1f, -0.88f, -3.38f, -2.2f);
        dij.LIZJ(10.0f, 10.0f, false, false, 26.35f, 4.0f);
        dij.LJIIJJI(-4.7f);
        dij.LIZLLL();
        dij.LJIIIIZZ(17.3f, 9.85f);
        dij.LIZJ(6.0f, 6.0f, false, true, 21.65f, 8.0f);
        C32856Cuy.k0(dij);
        dij.LJIIIZ(6.0f, 6.0f, false, true, 4.34f, 1.85f);
        dij.LJIIJ(1.29f, 1.35f, 3.24f, 3.15f, 5.87f, 3.42f);
        dij.LJIIL(1.48f, 0.14f);
        dij.LJIIJ(1.05f, 0.1f, 1.72f, 0.18f, 2.23f, 0.27f);
        dij.LJIIJ(0.49f, 0.09f, 0.67f, 0.17f, 0.76f, 0.23f);
        dij.LJIIJ(0.34f, 0.2f, 0.61f, 0.5f, 0.78f, 0.86f);
        dij.LJIIJ(0.04f, 0.1f, 0.11f, 0.28f, 0.15f, 0.77f);
        dij.LJIIJ(0.04f, 0.52f, 0.04f, 1.2f, 0.04f, 2.25f);
        dij.LJIJ(33.6f);
        C32856Cuy.Bf(dij);
        dij.LIZJ(34.0f, 34.0f, false, true, 6.0f, 33.6f);
        dij.LJIJ(17.8f);
        dij.LJIIJ(0.0f, -1.06f, 0.0f, -1.74f, 0.04f, -2.26f);
        dij.LJIIJ(0.04f, -0.49f, 0.1f, -0.68f, 0.15f, -0.77f);
        dij.LJIIIZ(2.0f, 2.0f, false, true, 0.78f, -0.86f);
        dij.LJIIJ(0.1f, -0.06f, 0.27f, -0.14f, 0.76f, -0.23f);
        dij.LJIIJ(0.51f, -0.1f, 1.18f, -0.16f, 2.23f, -0.27f);
        dij.LJIIL(1.48f, -0.14f);
        dij.LJIIJ(2.63f, -0.27f, 4.58f, -2.07f, 5.87f, -3.42f);
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
