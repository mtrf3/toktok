package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class D9D extends AbstractC39455Fe7 {
    public final Paint LJ;
    public final DIJ LJFF;

    public D9D() {
        this.LIZJ.LJIIIIZZ(19.55f, 18.36f);
        this.LIZJ.LJIIIZ(4.45f, 4.45f, true, true, 8.9f, 0.0f);
        this.LIZJ.LJIIIZ(4.45f, 4.45f, false, true, -8.9f, 0.0f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIIIIZZ(17.0f, 30.25f);
        this.LIZJ.LJIIIZ(6.74f, 6.74f, false, true, 7.0f, -6.16f);
        this.LIZJ.LJIIJ(5.14f, 0.0f, 7.0f, 4.3f, 7.0f, 6.16f);
        this.LIZJ.LJIIJ(0.0f, 1.48f, -0.82f, 1.48f, -3.7f, 1.48f);
        this.LIZJ.LJIIJJI(-6.6f);
        this.LIZJ.LJIIJ(-2.88f, 0.0f, -3.7f, -0.02f, -3.7f, -1.48f);
        this.LIZJ.LIZLLL();
        Paint LIZ = DIX.LIZ(this.LIZJ, Path.FillType.WINDING);
        this.LJ = LIZ;
        DIJ dij = new DIJ();
        this.LJFF = dij;
        C32856Cuy.y1(dij);
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
