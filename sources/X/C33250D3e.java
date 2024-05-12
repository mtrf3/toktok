package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.D3e, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33250D3e extends AbstractC39455Fe7 {
    public final Paint LJ;
    public final DIJ LJFF;

    public C33250D3e() {
        this.LIZJ.LJIIIIZZ(27.8f, 42.23f);
        this.LIZJ.LJIIIZ(1.5f, 1.5f, false, false, 2.14f, 0.0f);
        this.LIZJ.LJIIL(4.08f, -4.1f);
        this.LIZJ.LJIIL(4.09f, 4.1f);
        this.LIZJ.LJIIJ(0.29f, 0.3f, 0.68f, 0.44f, 1.07f, 0.44f);
        this.LIZJ.LJIILJJIL(0.77f, -0.15f, 1.07f, -0.45f, true);
        this.LIZJ.LJIIJ(0.59f, -0.59f, 0.59f, -1.54f, 0.0f, -2.13f);
        this.LIZJ.LJIIL(-4.09f, -4.1f);
        this.LIZJ.LJIIL(4.09f, -4.08f);
        this.LIZJ.LJIIIZ(1.51f, 1.51f, false, false, -2.14f, -2.14f);
        this.LIZJ.LJIIL(-4.09f, 4.09f);
        this.LIZJ.LJIIL(-4.09f, -4.09f);
        this.LIZJ.LJIIIZ(1.51f, 1.51f, false, false, -2.14f, 2.14f);
        this.LIZJ.LJII(31.9f, 36.0f);
        this.LIZJ.LJIIL(-4.1f, 4.09f);
        this.LIZJ.LJIIIZ(1.51f, 1.51f, false, false, 0.0f, 2.13f);
        this.LIZJ.LIZLLL();
        Paint LIZ = DIX.LIZ(this.LIZJ, Path.FillType.WINDING);
        this.LJ = LIZ;
        DIJ dij = new DIJ();
        this.LJFF = dij;
        dij.LJIIIIZZ(25.74f, 1.03f);
        dij.LJI(42.3f);
        dij.LJIIIZ(4.44f, 4.44f, false, true, 4.43f, 4.43f);
        dij.LJIILL(14.29f);
        dij.LJIIIZ(20.61f, 20.61f, false, true, 7.88f, 14.73f);
        dij.LJIIJJI(2.07f);
        dij.LJIIIZ(1.51f, 1.51f, true, true, 0.0f, 3.02f);
        dij.LJI(54.6f);
        dij.LJIIIZ(20.61f, 20.61f, false, true, -7.88f, 14.74f);
        dij.LJIILL(14.3f);
        dij.LJIIIZ(4.44f, 4.44f, false, true, -4.43f, 4.42f);
        dij.LJI(25.74f);
        dij.LJIIIZ(4.44f, 4.44f, false, true, -4.43f, -4.43f);
        dij.LJIILL(-14.3f);
        dij.LIZJ(20.6f, 20.6f, false, true, 13.37f, 36.0f);
        dij.LIZJ(20.66f, 20.66f, false, true, 43.7f, 17.78f);
        dij.LJIJ(5.46f);
        dij.LJIIJ(0.0f, -0.77f, -0.63f, -1.4f, -1.4f, -1.4f);
        dij.LJI(25.74f);
        dij.LJIIJ(-0.77f, 0.0f, -1.4f, 0.63f, -1.4f, 1.4f);
        dij.LJIILL(8.33f);
        dij.LJIIIZ(1.51f, 1.51f, true, true, -3.02f, 0.0f);
        dij.LJIJ(5.46f);
        dij.LJIIIZ(4.44f, 4.44f, false, true, 4.43f, -4.43f);
        dij.LIZLLL();
        dij.LJIILIIL(8.28f, 55.6f);
        dij.LJIIJ(-3.5f, 0.0f, -6.8f, -0.87f, -9.68f, -2.41f);
        dij.LJIILL(12.32f);
        dij.LJIIJ(0.0f, 0.77f, 0.63f, 1.4f, 1.4f, 1.4f);
        dij.LJI(42.3f);
        dij.LJIIJ(0.77f, 0.0f, 1.4f, -0.63f, 1.4f, -1.4f);
        dij.LJIJ(54.22f);
        dij.LJIIIZ(20.54f, 20.54f, false, true, -9.68f, 2.41f);
        dij.LIZLLL();
        dij.LJIIIIZZ(16.4f, 36.0f);
        dij.LJIIIZ(17.63f, 17.63f, false, false, 35.24f, 0.0f);
        dij.LJIIIZ(17.63f, 17.63f, false, false, -35.24f, 0.0f);
        dij.LIZLLL();
        dij.LJIIZILJ(Path.FillType.WINDING);
        this.LIZ.add(LIZ);
    }

    @Override // X.AbstractC39455Fe7
    public final void LIZ(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        LIZIZ(72.0f, 72.0f, canvas);
        canvas.drawPath(this.LIZJ.LIZ, this.LIZIZ);
        canvas.drawPath(this.LJFF.LIZ, this.LJ);
    }
}
