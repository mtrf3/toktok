package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class DCL extends AbstractC39455Fe7 {
    public DCL() {
        C32856Cuy.k6(this.LIZJ);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIILL(-6.4f);
        this.LIZJ.LJIIL(9.52f, 8.25f);
        this.LIZJ.LIZJ(1.5f, 1.5f, false, false, 47.0f, 33.72f);
        this.LIZJ.LJIJ(14.28f);
        this.LIZJ.LJIIIZ(1.5f, 1.5f, false, false, -2.48f, -1.13f);
        this.LIZJ.LJII(35.0f, 21.4f);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJIJ(15.0f);
        p2.LJIIIZ(6.0f, 6.0f, false, false, -6.0f, -6.0f);
        p2.LJI(7.0f);
        p2.LIZLLL();
        this.LIZJ.LJIIZILJ(Path.FillType.WINDING);
    }

    @Override // X.AbstractC39455Fe7
    public final void LIZ(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        LIZIZ(48.0f, 48.0f, canvas);
        canvas.drawPath(this.LIZJ.LIZ, this.LIZIZ);
    }
}
