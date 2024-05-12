package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class DFD extends AbstractC39455Fe7 {
    public DFD() {
        this.LIZJ.LJIIIIZZ(36.0f, 25.75f);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIIZ(1.0f, 1.0f, false, true, -1.0f, 1.0f);
        p.LJI(13.0f);
        p.LJIIIZ(1.0f, 1.0f, false, true, -1.0f, -1.0f);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJIILL(-3.5f);
        p2.LJIIIZ(1.0f, 1.0f, false, true, 1.0f, -1.0f);
        DIJ p3 = this.LIZJ;
        o.LJIIIZ(p3, "p");
        p3.LJIIJJI(22.0f);
        p3.LJIIIZ(1.0f, 1.0f, false, true, 1.0f, 1.0f);
        C78269Unh.LIZJ(this.LIZJ, "p", 3.5f);
        this.LIZJ.LJIIZILJ(Path.FillType.WINDING);
    }

    @Override // X.AbstractC39455Fe7
    public final void LIZ(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        LIZIZ(48.0f, 48.0f, canvas);
        canvas.drawPath(this.LIZJ.LIZ, this.LIZIZ);
    }
}
