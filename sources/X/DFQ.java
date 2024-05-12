package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class DFQ extends AbstractC39455Fe7 {
    public DFQ() {
        this.LIZJ.LJIILIIL(25.77f, 9.23f);
        this.LIZJ.LJIIL(9.3f, 9.3f);
        C32856Cuy.X2(this.LIZJ);
        this.LIZJ.LJII(24.0f, 14.54f);
        C32856Cuy.yc(this.LIZJ);
        this.LIZJ.LJIIIIZZ(25.77f, 24.23f);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIL(9.3f, 9.3f);
        C32856Cuy.X2(this.LIZJ);
        this.LIZJ.LJII(24.0f, 29.54f);
        C32856Cuy.yc(this.LIZJ);
        this.LIZJ.LJIIZILJ(Path.FillType.WINDING);
    }

    @Override // X.AbstractC39455Fe7
    public final void LIZ(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        LIZIZ(48.0f, 48.0f, canvas);
        canvas.drawPath(this.LIZJ.LIZ, this.LIZIZ);
    }
}
