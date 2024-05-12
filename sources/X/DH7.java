package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class DH7 extends AbstractC39455Fe7 {
    public DH7() {
        this.LIZJ.LJIIIIZZ(12.0f, 40.0f);
        C32856Cuy.y8(this.LIZJ);
        this.LIZJ.LJIIIIZZ(28.0f, 40.0f);
        C32856Cuy.y8(this.LIZJ);
        this.LIZJ.LJIIZILJ(Path.FillType.WINDING);
    }

    @Override // X.AbstractC39455Fe7
    public final void LIZ(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        LIZIZ(48.0f, 48.0f, canvas);
        canvas.drawPath(this.LIZJ.LIZ, this.LIZIZ);
    }
}
