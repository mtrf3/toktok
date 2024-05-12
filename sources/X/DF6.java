package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class DF6 extends AbstractC39455Fe7 {
    public DF6() {
        C32856Cuy.lg(this.LIZJ);
        this.LIZJ.LJIILIIL(10.0f, 12.0f);
        C32856Cuy.ze(this.LIZJ);
        this.LIZJ.LJIILIIL(11.0f, 11.0f);
        C32856Cuy.B(this.LIZJ);
        DIL.LIZ(this.LIZJ, "p", 26.0f);
        this.LIZJ.LJIIZILJ(Path.FillType.WINDING);
    }

    @Override // X.AbstractC39455Fe7
    public final void LIZ(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        LIZIZ(48.0f, 48.0f, canvas);
        canvas.drawPath(this.LIZJ.LIZ, this.LIZIZ);
    }
}
