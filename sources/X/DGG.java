package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class DGG extends AbstractC39455Fe7 {
    public DGG() {
        C32856Cuy.t3(this.LIZJ);
        this.LIZJ.LJIILIIL(-5.5f, 10.0f);
        C32856Cuy.LLJJJJ(this.LIZJ);
        this.LIZJ.LJIIIIZZ(7.0f, 27.8f);
        C32856Cuy.LJJLIIIJLLLLLLLZ(this.LIZJ);
        this.LIZJ.LJIILIIL(28.5f, 10.0f);
        C32856Cuy.LLJJJJ(this.LIZJ);
        this.LIZJ.LJIIZILJ(Path.FillType.WINDING);
    }

    @Override // X.AbstractC39455Fe7
    public final void LIZ(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        LIZIZ(48.0f, 48.0f, canvas);
        canvas.drawPath(this.LIZJ.LIZ, this.LIZIZ);
    }
}
