package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class DFX extends AbstractC39455Fe7 {
    public DFX() {
        C32856Cuy.Rn(this.LIZJ);
        C32856Cuy.O8(this.LIZJ);
        this.LIZJ.LJIILIIL(-11.0f, 7.0f);
        C32856Cuy.m7(this.LIZJ);
        C32856Cuy.LJJIJLIJ(this.LIZJ);
        C32856Cuy.rh(this.LIZJ);
        this.LIZJ.LJIIZILJ(Path.FillType.WINDING);
    }

    @Override // X.AbstractC39455Fe7
    public final void LIZ(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        LIZIZ(48.0f, 48.0f, canvas);
        canvas.drawPath(this.LIZJ.LIZ, this.LIZIZ);
    }
}
