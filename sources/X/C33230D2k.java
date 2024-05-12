package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.D2k, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33230D2k extends AbstractC39455Fe7 {
    public final Paint LJ;
    public final DIJ LJFF;

    public C33230D2k() {
        this.LIZJ.LJIIIIZZ(6.5f, 39.02f);
        this.LIZJ.LJIIJ(-0.21f, 0.21f, -0.57f, 0.0f, -0.49f, -0.3f);
        this.LIZJ.LJIIL(2.83f, -10.67f);
        this.LIZJ.LJII(13.2f, 11.5f);
        this.LIZJ.LIZJ(2.0f, 2.0f, false, true, 15.14f, 10.0f);
        C32856Cuy.S6(this.LIZJ);
        this.LIZJ.LJIIIZ(1.0f, 1.0f, false, true, 0.98f, 1.2f);
        this.LIZJ.LJIIL(-3.9f, 18.55f);
        this.LIZJ.LJIIIZ(2.0f, 2.0f, false, true, -1.96f, 1.59f);
        this.LIZJ.LJI(14.55f);
        this.LIZJ.LJII(6.5f, 39.02f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIILIIL(9.65f, -3.68f);
        this.LIZJ.LJII(9.27f, 41.9f);
        this.LIZJ.LJIIJ(-3.14f, 3.0f, -8.24f, -0.01f, -7.13f, -4.2f);
        this.LIZJ.LJIIL(2.84f, -10.67f);
        C32856Cuy.LJJJJL(this.LIZJ);
        this.LIZJ.LJIIL(4.36f, -16.56f);
        this.LIZJ.LIZJ(6.0f, 6.0f, false, true, 15.14f, 6.0f);
        C32856Cuy.S6(this.LIZJ);
        this.LIZJ.LJIIIZ(5.0f, 5.0f, false, true, 4.9f, 6.03f);
        this.LIZJ.LJIIL(-3.91f, 18.54f);
        this.LIZJ.LJIIIZ(6.0f, 6.0f, false, true, -5.87f, 4.77f);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJI(16.15f);
        this.LIZJ.LIZLLL();
        Paint LIZ = DIX.LIZ(this.LIZJ, Path.FillType.EVEN_ODD);
        this.LJ = LIZ;
        DIJ dij = new DIJ();
        this.LJFF = dij;
        dij.LJIIIIZZ(30.72f, 12.04f);
        dij.LJIIJ(0.42f, -0.28f, 0.94f, 0.18f, 0.73f, 0.63f);
        dij.LJIIL(-3.58f, 7.53f);
        dij.LJIIL(3.0f, 1.65f);
        dij.LJIIIZ(0.5f, 0.5f, false, true, 0.03f, 0.86f);
        dij.LJIIL(-8.86f, 5.9f);
        dij.LJIIJ(-0.43f, 0.29f, -0.96f, -0.19f, -0.72f, -0.65f);
        dij.LJIIL(2.5f, -4.74f);
        dij.LJIIL(-5.1f, -2.45f);
        dij.LJIIIZ(0.5f, 0.5f, false, true, -0.05f, -0.87f);
        dij.LJIIL(12.05f, -7.86f);
        dij.LIZLLL();
        dij.LJIIZILJ(Path.FillType.EVEN_ODD);
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
