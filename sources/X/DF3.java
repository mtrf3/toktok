package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class DF3 extends AbstractC39455Fe7 {
    public DF3() {
        C32856Cuy.zo(this.LIZJ);
        this.LIZJ.LJIILIIL(18.54f, -8.0f);
        this.LIZJ.LJIIIZ(1.0f, 1.0f, false, false, -1.54f, 0.83f);
        this.LIZJ.LJIILL(14.34f);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIIZ(1.0f, 1.0f, false, false, 1.54f, 0.84f);
        this.LIZJ.LJIIL(11.15f, -7.17f);
        this.LIZJ.LJIIIZ(1.0f, 1.0f, false, false, 0.0f, -1.68f);
        this.LIZJ.LJIIL(-11.15f, -7.17f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIIZILJ(Path.FillType.EVEN_ODD);
    }

    @Override // X.AbstractC39455Fe7
    public final void LIZ(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        LIZIZ(48.0f, 48.0f, canvas);
        canvas.drawPath(this.LIZJ.LIZ, this.LIZIZ);
    }
}
