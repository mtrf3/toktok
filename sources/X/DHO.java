package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class DHO extends AbstractC39455Fe7 {
    public DHO() {
        C32856Cuy.n5(this.LIZJ);
        this.LIZJ.LJIIZILJ(Path.FillType.EVEN_ODD);
    }

    @Override // X.AbstractC39455Fe7
    public final void LIZ(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        LIZIZ(48.0f, 48.0f, canvas);
        canvas.drawPath(this.LIZJ.LIZ, this.LIZIZ);
    }
}