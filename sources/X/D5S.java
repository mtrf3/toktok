package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class D5S extends AbstractC39455Fe7 {
    public final Paint LJ;
    public final DIJ LJFF;

    public D5S() {
        this.LIZJ.LJIIIIZZ(33.0f, 33.95f);
        this.LIZJ.LJIIJ(-0.55f, 0.06f, -1.0f, 0.5f, -1.0f, 1.05f);
        C32856Cuy.A1(this.LIZJ);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIJ(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 0.96f);
        this.LIZJ.LIZJ(14.0f, 14.0f, true, false, 18.04f, 23.0f);
        this.LIZJ.LJIIJ(-0.04f, 0.55f, 0.4f, 1.0f, 0.96f, 1.0f);
        C32856Cuy.z0(this.LIZJ);
        this.LIZJ.LJIIJ(0.55f, 0.0f, 1.0f, -0.45f, 1.05f, -1.0f);
        this.LIZJ.LIZJ(10.0f, 10.0f, true, true, 33.0f, 33.95f);
        this.LIZJ.LIZLLL();
        Paint LIZ = DIX.LIZ(this.LIZJ, Path.FillType.WINDING);
        this.LJ = LIZ;
        DIJ dij = new DIJ();
        this.LJFF = dij;
        dij.LJIIIIZZ(15.0f, 14.05f);
        dij.LJIIJ(0.55f, -0.06f, 1.0f, -0.5f, 1.0f, -1.05f);
        C32856Cuy.LJJLIL(dij);
        dij.LJIIJ(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -0.96f);
        dij.LIZJ(14.0f, 14.0f, true, false, 29.96f, 25.0f);
        dij.LJIIIZ(0.95f, 0.95f, false, false, -0.96f, -1.0f);
        C32856Cuy.LIZLLL(dij);
        dij.LJIIJ(-0.55f, 0.0f, -1.0f, 0.45f, -1.05f, 1.0f);
        dij.LIZJ(10.0f, 10.0f, true, true, 15.0f, 14.05f);
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
