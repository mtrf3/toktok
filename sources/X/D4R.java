package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class D4R extends AbstractC39455Fe7 {
    public final Paint LJ;
    public final DIJ LJFF;

    public D4R() {
        this.LIZJ.LJIIIIZZ(13.3f, 23.3f);
        C32856Cuy.LLLLLLLLL(this.LIZJ);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJII(26.0f, 18.83f);
        p.LJIJ(35.0f);
        p.LJIIIZ(1.0f, 1.0f, false, true, -1.0f, 1.0f);
        p.LJIIJJI(-2.0f);
        p.LJIIIZ(1.0f, 1.0f, false, true, -1.0f, -1.0f);
        p.LJIJ(18.83f);
        p.LJIIL(-5.88f, 5.88f);
        p.LJIIIZ(1.0f, 1.0f, false, true, -1.41f, 0.0f);
        p.LJIIL(-1.42f, -1.42f);
        this.LIZJ.LIZLLL();
        Paint LIZ = DIX.LIZ(this.LIZJ, Path.FillType.WINDING);
        this.LJ = LIZ;
        DIJ dij = new DIJ();
        this.LJFF = dij;
        C32856Cuy.al(dij);
        dij.LJIILIIL(22.0f, 18.0f);
        dij.LJIIIZ(18.0f, 18.0f, true, true, 0.0f, -36.0f);
        dij.LJIIIZ(18.0f, 18.0f, false, true, 0.0f, 36.0f);
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
