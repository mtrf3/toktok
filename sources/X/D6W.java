package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class D6W extends AbstractC39455Fe7 {
    public final Paint LJ;
    public final DIJ LJFF;

    public D6W() {
        this.LIZJ.LJIIIIZZ(22.0f, 24.0f);
        this.LIZJ.LJIIIZ(2.0f, 2.0f, false, false, 0.85f, 1.64f);
        this.LIZJ.LJIIL(9.19f, 6.43f);
        this.LIZJ.LJIIIZ(1.0f, 1.0f, false, false, 1.39f, -0.25f);
        this.LIZJ.LJIIL(1.15f, -1.64f);
        this.LIZJ.LJIIIZ(1.0f, 1.0f, false, false, -0.25f, -1.39f);
        this.LIZJ.LJIIL(-7.9f, -5.53f);
        C32856Cuy.LLLIL(this.LIZJ);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIJJI(-2.0f);
        p.LJIIIZ(1.0f, 1.0f, false, false, -1.0f, 1.0f);
        p.LJIILL(11.0f);
        this.LIZJ.LIZLLL();
        Paint LIZ = DIX.LIZ(this.LIZJ, Path.FillType.WINDING);
        this.LJ = LIZ;
        DIJ dij = new DIJ();
        this.LJFF = dij;
        C32856Cuy.Sg(dij);
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
