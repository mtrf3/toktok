package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class DG3 extends AbstractC39455Fe7 {
    public DG3() {
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIIIZZ(6.0f, 23.0f);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJIIIZ(1.0f, 1.0f, false, true, 1.0f, -1.0f);
        p2.LJIIJJI(34.0f);
        p2.LJIIIZ(1.0f, 1.0f, false, true, 1.0f, 1.0f);
        p2.LJIILL(2.0f);
        p2.LJIIIZ(1.0f, 1.0f, false, true, -1.0f, 1.0f);
        p2.LJI(7.0f);
        p2.LJIIIZ(1.0f, 1.0f, false, true, -1.0f, -1.0f);
        p2.LJIILL(-2.0f);
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
