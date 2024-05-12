package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class D8H extends AbstractC39455Fe7 {
    public final Paint LJ;
    public final DIJ LJFF;

    public D8H() {
        this.LIZJ.LJIIIIZZ(28.83f, 24.5f);
        this.LIZJ.LIZJ(4.88f, 4.88f, false, true, 24.0f, 29.42f);
        this.LIZJ.LJIIIZ(4.88f, 4.88f, false, true, -4.83f, -4.92f);
        this.LIZJ.LIZJ(4.88f, 4.88f, false, true, 24.0f, 19.58f);
        this.LIZJ.LJIIJ(2.67f, 0.0f, 4.83f, 2.2f, 4.83f, 4.92f);
        this.LIZJ.LIZLLL();
        Paint LIZ = DIX.LIZ(this.LIZJ, Path.FillType.WINDING);
        this.LJ = LIZ;
        DIJ dij = new DIJ();
        this.LJFF = dij;
        dij.LJIIIIZZ(24.0f, 42.0f);
        dij.LJIIJ(14.0f, 0.0f, 21.0f, -12.35f, 22.0f, -17.5f);
        dij.LJ(45.0f, 19.35f, 38.0f, 7.0f, 24.0f, 7.0f);
        dij.LJIILLIIL(3.0f, 19.35f, 2.0f, 24.5f, true);
        dij.LJ(3.0f, 29.65f, 10.0f, 42.0f, 24.0f, 42.0f);
        dij.LIZLLL();
        dij.LJIILIIL(9.12f, -17.5f);
        dij.LJIIJ(0.0f, 5.13f, -4.08f, 9.3f, -9.12f, 9.3f);
        dij.LJIIIZ(9.21f, 9.21f, false, true, -9.12f, -9.3f);
        dij.LJIIJ(0.0f, -5.13f, 4.08f, -9.3f, 9.12f, -9.3f);
        dij.LJIIIZ(9.21f, 9.21f, false, true, 9.12f, 9.3f);
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
