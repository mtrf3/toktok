package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class DFV extends AbstractC39455Fe7 {
    public DFV() {
        this.LIZJ.LJIIIIZZ(38.7f, 24.0f);
        this.LIZJ.LJII(14.4f, 38.03f);
        this.LIZJ.LJIJ(9.97f);
        this.LIZJ.LJII(38.7f, 24.0f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIILIIL(4.3f, 2.6f);
        C32856Cuy.i6(this.LIZJ);
        this.LIZJ.LJIIZILJ(Path.FillType.WINDING);
    }

    @Override // X.AbstractC39455Fe7
    public final void LIZ(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        LIZIZ(48.0f, 48.0f, canvas);
        canvas.drawPath(this.LIZJ.LIZ, this.LIZIZ);
    }
}
