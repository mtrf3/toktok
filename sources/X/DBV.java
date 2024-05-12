package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class DBV extends AbstractC39455Fe7 {
    public final Paint LJ;
    public final DIJ LJFF;

    public DBV() {
        this.LIZJ.LJIIIIZZ(36.5f, 15.0f);
        this.LIZJ.LJIIJ(0.0f, 0.35f, -0.01f, 0.7f, -0.04f, 1.03f);
        this.LIZJ.LIZJ(16.0f, 16.0f, false, false, 18.45f, 26.2f);
        this.LIZJ.LIZJ(12.5f, 12.5f, true, true, 36.5f, 15.0f);
        this.LIZJ.LIZLLL();
        Paint LIZ = DIX.LIZ(this.LIZJ, Path.FillType.WINDING);
        this.LJ = LIZ;
        DIJ dij = new DIJ();
        this.LJFF = dij;
        dij.LJIIIIZZ(46.46f, 32.25f);
        dij.LJIIIZ(12.5f, 12.5f, true, true, -25.0f, 0.0f);
        dij.LJIIIZ(12.5f, 12.5f, false, true, 25.0f, 0.0f);
        dij.LIZLLL();
        dij.LJIIIIZZ(8.62f, 20.98f);
        dij.LJIIIZ(12.5f, 12.5f, true, false, 12.83f, 21.34f);
        dij.LJIIIZ(15.94f, 15.94f, false, true, -3.91f, -12.13f);
        dij.LJIIIZ(16.56f, 16.56f, false, true, -8.92f, -9.2f);
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
