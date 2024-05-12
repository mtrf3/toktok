package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class DBB extends AbstractC39455Fe7 {
    public final Paint LJ;
    public final DIJ LJFF;

    public DBB() {
        this.LIZJ.LJIIIIZZ(24.0f, 22.33f);
        this.LIZJ.LJIIIZ(12.46f, 12.46f, false, true, 10.16f, -3.22f);
        this.LIZJ.LIZJ(10.01f, 10.01f, false, false, 24.5f, 6.5f);
        this.LIZJ.LJIIIZ(10.0f, 10.0f, false, false, -9.68f, 12.52f);
        this.LIZJ.LJIIL(0.68f, -0.02f);
        this.LIZJ.LJIIJ(3.28f, 0.0f, 6.27f, 1.27f, 8.5f, 3.33f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIIIIZZ(22.34f, 24.21f);
        this.LIZJ.LJIIIZ(10.0f, 10.0f, true, false, 0.0f, 14.58f);
        this.LIZJ.LJIIIZ(12.44f, 12.44f, false, true, 0.0f, -14.58f);
        this.LIZJ.LIZLLL();
        Paint LIZ = DIX.LIZ(this.LIZJ, Path.FillType.WINDING);
        this.LJ = LIZ;
        DIJ dij = new DIJ();
        this.LJFF = dij;
        dij.LJIIIIZZ(32.5f, 41.5f);
        dij.LJIIIZ(10.0f, 10.0f, true, false, 0.0f, -20.0f);
        dij.LJIIIZ(10.0f, 10.0f, false, false, 0.0f, 20.0f);
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
