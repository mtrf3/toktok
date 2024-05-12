package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class DFZ extends AbstractC39455Fe7 {
    public DFZ() {
        C32856Cuy.s7(this.LIZJ);
        this.LIZJ.LJIIIZ(13.5f, 13.5f, false, true, 13.5f, 13.49f);
        this.LIZJ.LJIIJ(0.0f, 6.98f, -6.84f, 14.3f, -12.52f, 17.7f);
        this.LIZJ.LJIIJ(-0.3f, 0.18f, -0.62f, 0.31f, -0.98f, 0.31f);
        this.LIZJ.LJIIJ(-0.35f, 0.0f, -0.68f, -0.13f, -0.98f, -0.31f);
        this.LIZJ.LJIIJ(-5.36f, -3.2f, -12.52f, -10.87f, -12.52f, -17.7f);
        this.LIZJ.LIZJ(13.5f, 13.5f, false, true, 24.0f, 8.0f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIILIIL(0.0f, 17.18f);
        this.LIZJ.LJIIIZ(5.0f, 5.0f, false, false, 4.97f, -5.0f);
        this.LIZJ.LIZJ(5.0f, 5.0f, false, false, 24.0f, 15.15f);
        this.LIZJ.LJIIIZ(5.0f, 5.0f, false, false, -4.97f, 5.01f);
        this.LIZJ.LIZJ(5.0f, 5.0f, false, false, 24.0f, 25.18f);
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
