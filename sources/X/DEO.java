package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class DEO extends AbstractC39455Fe7 {
    public DEO() {
        C32856Cuy.q7(this.LIZJ);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIIZ(10.0f, 10.0f, true, false, 0.0f, 20.0f);
        p.LJIIIZ(10.0f, 10.0f, false, false, 0.0f, -20.0f);
        p.LIZLLL();
        this.LIZJ.LJIILIIL(0.0f, 23.0f);
        this.LIZJ.LJ(13.06f, 27.0f, 7.0f, 34.92f, 7.0f, 41.44f);
        this.LIZJ.LJ(7.0f, 45.0f, 9.0f, 45.0f, 16.0f, 45.0f);
        C32856Cuy.LJIILLIIL(this.LIZJ);
        this.LIZJ.LJIIJ(7.0f, 0.0f, 9.0f, 0.0f, 9.0f, -3.56f);
        this.LIZJ.LJ(41.0f, 34.92f, 34.94f, 27.0f, 24.0f, 27.0f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIIZILJ(Path.FillType.WINDING);
    }

    @Override // X.AbstractC39455Fe7
    public final void LIZ(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        LIZIZ(48.0f, 48.0f, canvas);
        canvas.drawPath(this.LIZJ.LIZ, this.LIZIZ);
    }
}
