package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class D5I extends AbstractC39455Fe7 {
    public final Paint LJ;
    public final DIJ LJFF;

    public D5I() {
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIIIZZ(23.0f, 35.0f);
        p.LJIIIZ(1.0f, 1.0f, false, true, -1.0f, -1.0f);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJIILL(-8.0f);
        p2.LJIIJJI(-8.0f);
        C32856Cuy.z4(this.LIZJ);
        DIJ p3 = this.LIZJ;
        o.LJIIIZ(p3, "p");
        p3.LJIIJJI(8.0f);
        p3.LJIILL(-8.0f);
        DIJ p4 = this.LIZJ;
        o.LJIIIZ(p4, "p");
        p4.LJIIIZ(1.0f, 1.0f, false, true, 1.0f, -1.0f);
        p4.LJIIJJI(2.0f);
        p4.LJIIIZ(1.0f, 1.0f, false, true, 1.0f, 1.0f);
        p4.LJIILL(8.0f);
        C32856Cuy.C4(this.LIZJ);
        DIJ p5 = this.LIZJ;
        o.LJIIIZ(p5, "p");
        p5.LJIILL(8.0f);
        p5.LJIIIZ(1.0f, 1.0f, false, true, -1.0f, 1.0f);
        p5.LJIIJJI(-2.0f);
        p5.LIZLLL();
        Paint LIZ = DIX.LIZ(this.LIZJ, Path.FillType.WINDING);
        this.LJ = LIZ;
        DIJ dij = new DIJ();
        this.LJFF = dij;
        dij.LJIIIIZZ(8.44f, 8.44f);
        dij.LJIIIZ(22.0f, 22.0f, true, true, 31.12f, 31.12f);
        dij.LIZJ(22.0f, 22.0f, false, true, 8.44f, 8.44f);
        dij.LIZLLL();
        dij.LJIILIIL(28.29f, 2.83f);
        dij.LJIIIZ(18.0f, 18.0f, true, false, -25.46f, 25.46f);
        dij.LJIIIZ(18.0f, 18.0f, false, false, 25.46f, -25.46f);
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
