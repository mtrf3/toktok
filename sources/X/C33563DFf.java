package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.DFf, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33563DFf extends AbstractC39455Fe7 {
    public C33563DFf() {
        C32856Cuy.LLLIILIL(this.LIZJ);
        this.LIZJ.LJIIIIZZ(35.24f, 38.06f);
        this.LIZJ.LJIIIZ(18.0f, 18.0f, false, true, -25.3f, -25.3f);
        this.LIZJ.LJIIL(25.3f, 25.3f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIILIIL(2.82f, -2.82f);
        this.LIZJ.LJIIL(-25.3f, -25.3f);
        this.LIZJ.LJIIIZ(18.0f, 18.0f, false, true, 25.3f, 25.3f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIIZILJ(Path.FillType.WINDING);
    }

    @Override // X.AbstractC39455Fe7
    public final void LIZ(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        LIZIZ(48.0f, 48.0f, canvas);
        canvas.drawPath(this.LIZJ.LIZ, this.LIZIZ);
    }
}
