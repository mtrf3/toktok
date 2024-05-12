package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.Cz9, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33115Cz9 extends AbstractC39455Fe7 {
    public final Paint LJ;
    public final DIJ LJFF;
    public final Paint LJI;
    public final DIJ LJII;

    public C33115Cz9() {
        C32856Cuy.bd(this.LIZJ);
        this.LIZJ.LJIIZILJ(Path.FillType.WINDING);
        this.LIZIZ.setStyle(Paint.Style.FILL);
        Paint LIZIZ = KMP.LIZIZ(this.LIZIZ, -411877);
        this.LJ = LIZIZ;
        DIJ dij = new DIJ();
        this.LJFF = dij;
        dij.LJIIIIZZ(34.69f, 5.0f);
        dij.LJIIJ(-0.81f, 0.0f, -0.68f, 2.72f, -1.95f, 3.99f);
        dij.LJIILJJIL(-3.99f, 1.14f, -3.99f, 1.95f, true);
        dij.LJIIJ(0.0f, 0.8f, 2.72f, 0.67f, 3.99f, 1.95f);
        dij.LJIIJ(1.27f, 1.27f, 1.14f, 3.98f, 1.95f, 3.98f);
        dij.LJIIJ(0.8f, 0.0f, 0.67f, -2.71f, 1.95f, -3.98f);
        dij.LJIIJ(1.27f, -1.28f, 3.98f, -1.14f, 3.98f, -1.95f);
        dij.LJIILJJIL(-2.71f, -0.68f, -3.98f, -1.95f, true);
        dij.LJ(35.36f, 7.72f, 35.5f, 5.0f, 34.69f, 5.0f);
        dij.LIZLLL();
        dij.LJIIZILJ(Path.FillType.WINDING);
        LIZIZ.setStyle(Paint.Style.FILL);
        LIZIZ.setColor(-1);
        Paint LIZ = C42193GhB.LIZ(this.LIZ, LIZIZ);
        this.LJI = LIZ;
        DIJ dij2 = new DIJ();
        this.LJII = dij2;
        dij2.LJIIIIZZ(41.16f, 14.42f);
        dij2.LJIIJ(0.17f, 0.53f, 0.26f, 1.08f, 0.26f, 1.66f);
        dij2.LJIILL(15.84f);
        dij2.LJIIIZ(5.54f, 5.54f, false, true, -5.55f, 5.54f);
        dij2.LJI(12.14f);
        dij2.LJIIIZ(5.54f, 5.54f, false, true, -5.55f, -5.54f);
        dij2.LJIJ(16.08f);
        dij2.LJIIIZ(5.54f, 5.54f, false, true, 5.54f, -5.54f);
        dij2.LJI(25.6f);
        dij2.LJIIJ(-0.33f, 3.18f, 2.58f, 3.64f, 4.88f, 4.59f);
        C32856Cuy.Z(dij2);
        C32856Cuy.j1(dij2);
        dij2.LJIIJ(0.9f, 2.15f, 1.0f, 4.9f, 4.2f, 4.9f);
        dij2.LJIIJ(2.97f, 0.0f, 3.31f, -2.78f, 4.19f, -4.9f);
        dij2.LJIILL(-0.02f);
        dij2.LJIIJJI(0.02f);
        dij2.LJIIJ(0.73f, -0.3f, 1.52f, -0.43f, 2.26f, -0.7f);
        dij2.LIZLLL();
        dij2.LJIIIIZZ(29.15f, 24.7f);
        dij2.LJIIIZ(0.8f, 0.8f, false, false, 0.0f, -1.38f);
        dij2.LJIIL(-8.32f, -4.8f);
        dij2.LJIIIZ(0.8f, 0.8f, false, false, -1.18f, 0.7f);
        dij2.LJIILL(9.59f);
        dij2.LJIIJ(0.0f, 0.6f, 0.66f, 0.99f, 1.18f, 0.68f);
        dij2.LJIIL(8.32f, -4.8f);
        dij2.LIZLLL();
        dij2.LJIIZILJ(Path.FillType.WINDING);
        LIZ.setStyle(Paint.Style.FILL);
        LIZ.setColor(-1);
        this.LIZ.add(LIZ);
    }

    @Override // X.AbstractC39455Fe7
    public final void LIZ(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        LIZIZ(48.0f, 48.0f, canvas);
        canvas.drawPath(this.LIZJ.LIZ, this.LIZIZ);
        canvas.drawPath(this.LJFF.LIZ, this.LJ);
        canvas.drawPath(this.LJII.LIZ, this.LJI);
    }
}
