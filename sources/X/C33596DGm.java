package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.DGm, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33596DGm extends AbstractC39455Fe7 {
    public C33596DGm() {
        this.LIZJ.LJIILIIL(12.51f, 23.44f);
        this.LIZJ.LJIIL(2.37f, -2.02f);
        this.LIZJ.LJIIIZ(1.0f, 1.0f, false, true, 1.41f, 0.11f);
        this.LIZJ.LJIIL(0.65f, 0.76f);
        this.LIZJ.LJIIIZ(1.0f, 1.0f, false, true, -0.11f, 1.41f);
        this.LIZJ.LJIIL(-4.62f, 3.94f);
        this.LIZJ.LJIIIZ(1.5f, 1.5f, false, true, -1.9f, 0.03f);
        this.LIZJ.LJIIL(-5.11f, -4.1f);
        this.LIZJ.LJIIIZ(1.0f, 1.0f, false, true, -0.16f, -1.4f);
        this.LIZJ.LJIIL(0.63f, -0.78f);
        this.LIZJ.LJIIIZ(1.0f, 1.0f, false, true, 1.4f, -0.15f);
        this.LIZJ.LJIIL(2.45f, 1.96f);
        this.LIZJ.LJIIIZ(14.5f, 14.5f, true, true, 4.73f, 11.54f);
        this.LIZJ.LJIIJ(-0.4f, -0.38f, -0.39f, -1.01f, 0.0f, -1.4f);
        this.LIZJ.LJIIL(0.73f, -0.69f);
        this.LIZJ.LJIIJ(0.4f, -0.38f, 1.03f, -0.36f, 1.44f, 0.0f);
        this.LIZJ.LJIIIZ(11.5f, 11.5f, true, false, -3.91f, -9.21f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIIZILJ(Path.FillType.EVEN_ODD);
    }

    @Override // X.AbstractC39455Fe7
    public final void LIZ(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        LIZIZ(48.0f, 48.0f, canvas);
        canvas.drawPath(this.LIZJ.LIZ, this.LIZIZ);
    }
}
