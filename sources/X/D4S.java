package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class D4S extends AbstractC39455Fe7 {
    public final Paint LJ;
    public final DIJ LJFF;
    public final Paint LJI;
    public final DIJ LJII;

    public D4S() {
        this.LIZJ.LJIIIIZZ(41.5f, 30.1f);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIIZ(0.5f, 0.5f, false, false, -0.1f, -0.7f);
        this.LIZJ.LJIIL(-0.8f, -0.6f);
        this.LIZJ.LJIIIZ(0.5f, 0.5f, false, false, -0.7f, 0.1f);
        this.LIZJ.LJIIL(-7.85f, 10.6f);
        this.LIZJ.LJIIL(-4.97f, -5.68f);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJIIIZ(0.5f, 0.5f, false, false, -0.7f, -0.05f);
        this.LIZJ.LJIIL(-0.76f, 0.66f);
        this.LIZJ.LJIIIZ(0.5f, 0.5f, false, false, -0.04f, 0.7f);
        this.LIZJ.LJIIL(5.66f, 6.49f);
        this.LIZJ.LJIIJ(0.49f, 0.55f, 1.36f, 0.52f, 1.8f, -0.07f);
        this.LIZJ.LJII(41.5f, 30.1f);
        this.LIZJ.LIZLLL();
        Paint LIZ = DIX.LIZ(this.LIZJ, Path.FillType.WINDING);
        this.LJ = LIZ;
        DIJ dij = new DIJ();
        this.LJFF = dij;
        C32856Cuy.R3(dij);
        dij.LJIIZILJ(Path.FillType.WINDING);
        Paint LIZ2 = C42193GhB.LIZ(this.LIZ, LIZ);
        this.LJI = LIZ2;
        DIJ dij2 = new DIJ();
        this.LJII = dij2;
        C32856Cuy.LLJILLL(dij2);
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
