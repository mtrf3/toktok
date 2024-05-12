package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class DFR extends AbstractC39455Fe7 {
    public DFR() {
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIIIZZ(7.0f, 8.0f);
        p.LJIIIZ(5.0f, 5.0f, false, true, 5.0f, -5.0f);
        C32856Cuy.no(this.LIZJ);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIILIIL(23.73f, 8.34f);
        C32856Cuy.Rl(this.LIZJ);
        this.LIZJ.LJIIZILJ(Path.FillType.WINDING);
    }

    @Override // X.AbstractC39455Fe7
    public final void LIZ(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        LIZIZ(48.0f, 48.0f, canvas);
        canvas.drawPath(this.LIZJ.LIZ, this.LIZIZ);
    }
}
