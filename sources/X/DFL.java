package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class DFL extends AbstractC39455Fe7 {
    public DFL() {
        this.LIZJ.LJIIIIZZ(4.0f, 35.77f);
        this.LIZJ.LJIIIZ(2.0f, 2.0f, false, false, 3.27f, 1.55f);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIL(14.35f, -11.77f);
        this.LIZJ.LJIIIZ(2.0f, 2.0f, false, false, 0.0f, -3.1f);
        this.LIZJ.LJII(7.27f, 10.68f);
        this.LIZJ.LIZJ(2.0f, 2.0f, false, false, 4.0f, 12.23f);
        C78269Unh.LIZJ(this.LIZJ, "p", 23.54f);
        this.LIZJ.LJIIIIZZ(44.0f, 35.77f);
        this.LIZJ.LJIIIZ(2.0f, 2.0f, false, true, -3.27f, 1.55f);
        this.LIZJ.LJII(26.38f, 25.55f);
        this.LIZJ.LJIIIZ(2.0f, 2.0f, false, true, 0.0f, -3.1f);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJIIL(14.35f, -11.77f);
        this.LIZJ.LIZJ(2.0f, 2.0f, false, true, 44.0f, 12.23f);
        C78269Unh.LIZJ(this.LIZJ, "p", 23.54f);
        this.LIZJ.LJIIZILJ(Path.FillType.WINDING);
    }

    @Override // X.AbstractC39455Fe7
    public final void LIZ(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        LIZIZ(48.0f, 48.0f, canvas);
        canvas.drawPath(this.LIZJ.LIZ, this.LIZIZ);
    }
}
