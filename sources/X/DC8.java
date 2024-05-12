package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class DC8 extends AbstractC39455Fe7 {
    public final Paint LJ;
    public final DIJ LJFF;

    public DC8() {
        C32856Cuy.Fn(this.LIZJ);
        Paint LIZ = DIX.LIZ(this.LIZJ, Path.FillType.WINDING);
        this.LJ = LIZ;
        DIJ dij = new DIJ();
        this.LJFF = dij;
        dij.LJIIIIZZ(24.0f, 2.5f);
        dij.LJIIIZ(21.5f, 21.5f, true, false, 0.0f, 43.0f);
        dij.LJIIIZ(21.5f, 21.5f, false, false, 0.0f, -43.0f);
        dij.LIZLLL();
        dij.LJIIIIZZ(5.5f, 24.0f);
        dij.LJIIIZ(18.5f, 18.5f, true, true, 37.0f, 0.0f);
        dij.LJIIIZ(18.5f, 18.5f, false, true, -37.0f, 0.0f);
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
