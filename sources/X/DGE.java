package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class DGE extends AbstractC39455Fe7 {
    public DGE() {
        this.LIZJ.LJIILIIL(7.59f, 22.59f);
        this.LIZJ.LJIIL(9.29f, -9.3f);
        C32856Cuy.oo(this.LIZJ);
        this.LIZJ.LJII(11.83f, 24.0f);
        C32856Cuy.Oj(this.LIZJ);
        this.LIZJ.LJIIZILJ(Path.FillType.WINDING);
    }

    @Override // X.AbstractC39455Fe7
    public final void LIZ(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        LIZIZ(48.0f, 48.0f, canvas);
        canvas.drawPath(this.LIZJ.LIZ, this.LIZIZ);
    }
}
