package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class D5K extends AbstractC39455Fe7 {
    public final Paint LJ;
    public final DIJ LJFF;

    public D5K() {
        this.LIZJ.LJIIIIZZ(39.0f, 24.0f);
        this.LIZJ.LJIIIZ(17.0f, 17.0f, true, false, -5.7f, 12.7f);
        this.LIZJ.LJIIIZ(1.05f, 1.05f, false, true, 1.43f, 0.03f);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIL(1.41f, 1.41f);
        this.LIZJ.LJIIJ(0.4f, 0.4f, 0.4f, 1.03f, -0.01f, 1.4f);
        this.LIZJ.LIZJ(21.0f, 21.0f, true, true, 43.0f, 24.0f);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJIIJJI(4.35f);
        this.LIZJ.LJIIJ(0.53f, 0.0f, 0.84f, 0.55f, 0.52f, 0.94f);
        this.LIZJ.LJIIL(-6.16f, 7.74f);
        this.LIZJ.LJIIIZ(0.94f, 0.94f, false, true, -1.42f, 0.0f);
        this.LIZJ.LJIIL(-6.16f, -7.74f);
        this.LIZJ.LJIIJ(-0.32f, -0.4f, -0.01f, -0.94f, 0.52f, -0.94f);
        DIL.LIZ(this.LIZJ, "p", 39.0f);
        Paint LIZ = DIX.LIZ(this.LIZJ, Path.FillType.WINDING);
        this.LJ = LIZ;
        DIJ dij = new DIJ();
        this.LJFF = dij;
        dij.LJIIIIZZ(19.0f, 14.0f);
        C32856Cuy.B0(dij);
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
