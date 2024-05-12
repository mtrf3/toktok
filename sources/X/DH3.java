package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class DH3 extends AbstractC39455Fe7 {
    public DH3() {
        this.LIZJ.LJIIIIZZ(24.0f, 8.4f);
        this.LIZJ.LJIIIZ(15.6f, 15.6f, true, false, 10.03f, 27.55f);
        this.LIZJ.LJIIIZ(3.4f, 3.4f, false, true, 4.37f, 5.2f);
        this.LIZJ.LJIIIZ(22.4f, 22.4f, true, true, 8.0f, -17.16f);
        this.LIZJ.LJIIIZ(3.4f, 3.4f, true, true, -6.8f, 0.01f);
        this.LIZJ.LIZJ(15.6f, 15.6f, false, false, 24.0f, 8.4f);
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
