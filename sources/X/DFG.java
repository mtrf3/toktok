package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class DFG extends AbstractC39455Fe7 {
    public DFG() {
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIIIZZ(7.0f, 11.0f);
        C32856Cuy.mh(this.LIZJ);
        C32856Cuy.LJLLJ(this.LIZJ);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJIIIZ(4.0f, 4.0f, false, true, -4.0f, 4.0f);
        p2.LJI(11.0f);
        p2.LJIIIZ(4.0f, 4.0f, false, true, -4.0f, -4.0f);
        C32856Cuy.LLZLL(this.LIZJ);
        this.LIZJ.LJIIZILJ(Path.FillType.WINDING);
    }

    @Override // X.AbstractC39455Fe7
    public final void LIZ(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        LIZIZ(48.0f, 48.0f, canvas);
        canvas.drawPath(this.LIZJ.LIZ, this.LIZIZ);
    }
}
