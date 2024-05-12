package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.Czl, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33153Czl extends AbstractC39455Fe7 {
    public final Paint LJ;
    public final DIJ LJFF;
    public final Paint LJI;
    public final DIJ LJII;

    public C33153Czl() {
        C32856Cuy.Xe(this.LIZJ);
        Paint LIZ = DIX.LIZ(this.LIZJ, Path.FillType.WINDING);
        this.LJ = LIZ;
        DIJ dij = new DIJ();
        this.LJFF = dij;
        C32856Cuy.Nf(dij);
        dij.LJIIZILJ(Path.FillType.WINDING);
        Paint LIZ2 = C42193GhB.LIZ(this.LIZ, LIZ);
        this.LJI = LIZ2;
        DIJ dij2 = new DIJ();
        this.LJII = dij2;
        dij2.LJIIIIZZ(25.54f, 37.11f);
        dij2.LJIIJJI(1.64f);
        dij2.LJIIIZ(1.2f, 1.2f, false, false, 1.13f, -1.61f);
        dij2.LJIIL(-5.68f, -15.27f);
        dij2.LJIIIZ(2.2f, 2.2f, false, false, -2.06f, -1.43f);
        dij2.LJIIJJI(-1.12f);
        dij2.LJIIIZ(2.2f, 2.2f, false, false, -2.06f, 1.43f);
        dij2.LJIIL(-5.7f, 15.26f);
        dij2.LJIIIZ(1.2f, 1.2f, false, false, 1.13f, 1.62f);
        dij2.LJIIJJI(1.69f);
        dij2.LJIIJ(0.51f, 0.0f, 0.97f, -0.33f, 1.14f, -0.82f);
        dij2.LJIIL(1.15f, -3.47f);
        dij2.LJIIJJI(6.42f);
        dij2.LJIIL(1.18f, 3.48f);
        dij2.LJIIJ(0.17f, 0.49f, 0.63f, 0.81f, 1.14f, 0.81f);
        dij2.LIZLLL();
        dij2.LJIILIIL(-7.96f, -16.8f);
        dij2.LJIIL(0.01f, -0.05f);
        C279417u.LIZIZ(dij2, -0.01f, 0.04f, 22.0f, 29.27f);
        C32856Cuy.LJFF(dij2);
        dij2.LJII(20.0f, 23.37f);
        dij2.LJIIL(2.0f, 5.9f);
        dij2.LIZLLL();
        dij2.LJIIZILJ(Path.FillType.WINDING);
        this.LIZ.add(LIZ2);
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
