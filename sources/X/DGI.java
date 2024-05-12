package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class DGI extends AbstractC39455Fe7 {
    public DGI() {
        this.LIZJ.LJIIIIZZ(36.38f, 15.1f);
        this.LIZJ.LJIIIZ(5.13f, 5.13f, true, false, 0.0f, -10.26f);
        this.LIZJ.LJIIIZ(5.13f, 5.13f, false, false, 0.0f, 10.26f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIIIIZZ(28.9f, 28.0f);
        C32856Cuy.v3(this.LIZJ);
        this.LIZJ.LJIILIIL(7.5f, 0.0f);
        this.LIZJ.LJIIIZ(13.5f, 13.5f, true, true, -27.0f, 0.0f);
        this.LIZJ.LJIIIZ(13.5f, 13.5f, false, true, 27.0f, 0.0f);
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
