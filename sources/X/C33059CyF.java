package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.CyF, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33059CyF extends AbstractC39455Fe7 {
    public final Paint LJ;
    public final DIJ LJFF;

    public C33059CyF() {
        this.LIZJ.LJIIIIZZ(3.0f, 11.0f);
        C32856Cuy.x(this.LIZJ);
        C32856Cuy.LJJIIZI(this.LIZJ);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIIZ(2.0f, 2.0f, false, true, 2.0f, 2.0f);
        p.LJIILL(26.0f);
        p.LJIIIZ(2.0f, 2.0f, false, true, -2.0f, 2.0f);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJI(5.0f);
        p2.LJIIIZ(2.0f, 2.0f, false, true, -2.0f, -2.0f);
        C32856Cuy.LLZLL(this.LIZJ);
        this.LIZJ.LJIILIIL(40.0f, 0.0f);
        C32856Cuy.LLLLLLLZIL(this.LIZJ);
        C32856Cuy.LJLLJ(this.LIZJ);
        C32856Cuy.LJJIIZI(this.LIZJ);
        C32856Cuy.LLZLL(this.LIZJ);
        Paint LIZ = DIX.LIZ(this.LIZJ, Path.FillType.WINDING);
        this.LJ = LIZ;
        DIJ dij = new DIJ();
        this.LJFF = dij;
        dij.LJIIIIZZ(21.3f, 30.7f);
        dij.LJIIJ(0.07f, 0.18f, 0.25f, 0.3f, 0.45f, 0.3f);
        dij.LJIIJJI(0.93f);
        dij.LJIIJ(0.32f, 0.0f, 0.54f, -0.3f, 0.44f, -0.58f);
        dij.LJIIL(-4.97f, -13.13f);
        dij.LJIIIZ(0.47f, 0.47f, false, false, -0.44f, -0.29f);
        dij.LJIIJJI(-1.28f);
        dij.LJIIJ(-0.2f, 0.0f, -0.37f, 0.12f, -0.44f, 0.3f);
        dij.LJIIL(-4.96f, 13.12f);
        dij.LJIIJ(-0.11f, 0.28f, 0.12f, 0.58f, 0.44f, 0.58f);
        dij.LJIIJJI(0.93f);
        dij.LJIIJ(0.2f, 0.0f, 0.37f, -0.12f, 0.44f, -0.3f);
        dij.LJIIL(1.24f, -3.3f);
        dij.LJIIJJI(5.98f);
        dij.LJIIL(1.25f, 3.3f);
        dij.LIZLLL();
        dij.LJIILIIL(-6.61f, -4.92f);
        dij.LJIIL(2.38f, -6.34f);
        dij.LJIIL(2.39f, 6.34f);
        dij.LJIIJJI(-4.77f);
        dij.LIZLLL();
        dij.LJIIIIZZ(25.32f, 30.56f);
        dij.LJIIJ(0.0f, 0.24f, 0.2f, 0.44f, 0.47f, 0.44f);
        dij.LJIIJJI(4.92f);
        dij.LJIIJ(3.97f, 0.0f, 6.29f, -3.0f, 6.29f, -6.97f);
        dij.LJIIJ(0.0f, -3.98f, -2.32f, -7.03f, -6.29f, -7.03f);
        dij.LJI(25.8f);
        dij.LJIIJ(-0.26f, 0.0f, -0.47f, 0.2f, -0.47f, 0.44f);
        dij.LJIILL(13.12f);
        dij.LIZLLL();
        dij.LJIILIIL(1.84f, -1.27f);
        dij.LJIJ(18.71f);
        dij.LJIIJJI(3.55f);
        dij.LJIIJ(2.94f, 0.0f, 4.45f, 2.33f, 4.45f, 5.32f);
        dij.LJIILJJIL(-1.51f, 5.26f, -4.45f, 5.26f, true);
        dij.LJIIJJI(-3.55f);
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
