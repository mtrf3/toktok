package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.Cxb, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33019Cxb extends AbstractC39455Fe7 {
    public final Paint LJ;
    public final DIJ LJFF;

    public C33019Cxb() {
        this.LIZJ.LJIIIIZZ(33.62f, 10.87f);
        this.LIZJ.LIZJ(2.0f, 2.0f, false, true, 34.75f, 12.0f);
        this.LIZJ.LJIIL(0.96f, 2.44f);
        this.LIZJ.LJIIJ(0.12f, 0.3f, 0.55f, 0.3f, 0.67f, 0.0f);
        this.LIZJ.LJIIL(0.96f, -2.44f);
        this.LIZJ.LJIIIZ(2.0f, 2.0f, false, true, 1.13f, -1.13f);
        this.LIZJ.LJIIL(2.43f, -0.96f);
        this.LIZJ.LJIIJ(0.3f, -0.12f, 0.3f, -0.55f, 0.0f, -0.67f);
        this.LIZJ.LJIIL(-2.43f, -0.96f);
        this.LIZJ.LJIIIZ(2.0f, 2.0f, false, true, -1.13f, -1.13f);
        this.LIZJ.LJIIL(-0.96f, -2.43f);
        this.LIZJ.LJIIIZ(0.36f, 0.36f, false, false, -0.67f, 0.0f);
        this.LIZJ.LJIIL(-0.96f, 2.43f);
        this.LIZJ.LJIIIZ(2.0f, 2.0f, false, true, -1.13f, 1.13f);
        this.LIZJ.LJIIL(-2.44f, 0.96f);
        this.LIZJ.LJIIJ(-0.3f, 0.12f, -0.3f, 0.55f, 0.0f, 0.67f);
        this.LIZJ.LJIIL(2.44f, 0.96f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIIIIZZ(34.56f, 29.9f);
        this.LIZJ.LJIIJ(0.0f, 6.31f, -4.73f, 13.02f, -10.56f, 13.02f);
        this.LIZJ.LJIILJJIL(-10.56f, -6.7f, -10.56f, -13.01f, true);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIILL(-3.42f);
        this.LIZJ.LJIIJ(0.0f, -0.25f, 0.2f, -0.46f, 0.45f, -0.46f);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJIIJJI(20.22f);
        this.LIZJ.LJIIJ(0.25f, 0.0f, 0.45f, 0.2f, 0.45f, 0.46f);
        C78269Unh.LIZJ(this.LIZJ, "p", 3.42f);
        Paint LIZ = DIX.LIZ(this.LIZJ, Path.FillType.WINDING);
        this.LJ = LIZ;
        DIJ dij = new DIJ();
        this.LJFF = dij;
        dij.LJIIIIZZ(5.0f, 23.92f);
        dij.LJIIIZ(19.0f, 19.0f, false, true, 19.0f, -19.0f);
        dij.LJIIJJI(1.11f);
        C32856Cuy.An(dij);
        dij.LJIILL(2.23f);
        dij.LJIIIZ(1.0f, 1.0f, false, true, -1.0f, 1.0f);
        dij.LJI(24.0f);
        dij.LIZJ(14.78f, 14.78f, false, false, 9.22f, 23.92f);
        dij.LJIILL(15.9f);
        C32856Cuy.bk(dij);
        dij.LJIILL(-15.9f);
        dij.LIZLLL();
        dij.LJIIIIZZ(43.0f, 24.92f);
        dij.LJIIJ(0.0f, -1.01f, 0.0f, -4.74f, -1.99f, -7.84f);
        dij.LJIIJ(-0.3f, -0.46f, -0.93f, -0.53f, -1.36f, -0.18f);
        dij.LJIIL(-1.74f, 1.38f);
        dij.LJIIJ(-0.43f, 0.35f, -0.5f, 0.98f, -0.23f, 1.46f);
        dij.LJIIJ(1.06f, 1.91f, 1.1f, 4.27f, 1.1f, 5.24f);
        dij.LJIJ(39.8f);
        C32856Cuy.En(dij);
        C32856Cuy.Na(dij);
        dij.LJIILL(-14.9f);
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
