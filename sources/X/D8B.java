package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class D8B extends AbstractC39455Fe7 {
    public final Paint LJ;
    public final DIJ LJFF;

    public D8B() {
        this.LIZJ.LJIIIIZZ(20.76f, 17.17f);
        this.LIZJ.LJIIIZ(1.16f, 1.16f, false, false, -1.76f, 0.98f);
        this.LIZJ.LJIILL(11.7f);
        this.LIZJ.LJIIJ(0.0f, 0.9f, 0.99f, 1.45f, 1.76f, 0.98f);
        this.LIZJ.LJIIL(9.68f, -5.85f);
        this.LIZJ.LJIIJ(0.75f, -0.44f, 0.75f, -1.52f, 0.0f, -1.96f);
        this.LIZJ.LJIIL(-9.68f, -5.85f);
        this.LIZJ.LIZLLL();
        Paint LIZ = DIX.LIZ(this.LIZJ, Path.FillType.WINDING);
        this.LJ = LIZ;
        DIJ dij = new DIJ();
        this.LJFF = dij;
        C32856Cuy.Rk(dij);
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
