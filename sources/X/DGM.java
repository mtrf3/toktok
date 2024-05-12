package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class DGM extends AbstractC39455Fe7 {
    public DGM() {
        C32856Cuy.R(this.LIZJ);
        this.LIZJ.LJIIJ(1.45f, 0.0f, 2.82f, 0.14f, 4.11f, 0.4f);
        this.LIZJ.LJIIIZ(5.16f, 5.16f, false, false, -2.3f, 3.7f);
        this.LIZJ.LJIIJ(-0.58f, -0.07f, -1.18f, -0.1f, -1.8f, -0.1f);
        this.LIZJ.LJIIJ(-8.09f, 0.0f, -12.69f, 5.16f, -12.99f, 13.0f);
        this.LIZJ.LJIIJ(-0.02f, 0.55f, -0.46f, 1.0f, -1.02f, 1.0f);
        C32856Cuy.Sn(this.LIZJ);
        C32856Cuy.E4(this.LIZJ);
        this.LIZJ.LJIIZILJ(Path.FillType.WINDING);
    }

    @Override // X.AbstractC39455Fe7
    public final void LIZ(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        LIZIZ(48.0f, 48.0f, canvas);
        canvas.drawPath(this.LIZJ.LIZ, this.LIZIZ);
    }
}
