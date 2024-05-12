package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.DDe, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33510DDe extends AbstractC39455Fe7 {
    public C33510DDe() {
        this.LIZJ.LJIIIIZZ(15.36f, 6.5f);
        this.LIZJ.LJIIIZ(4.82f, 4.82f, false, false, -4.86f, 4.78f);
        this.LIZJ.LJIILL(27.63f);
        this.LIZJ.LJIIJ(0.0f, 0.6f, 0.34f, 1.15f, 0.9f, 1.42f);
        this.LIZJ.LJIIJ(0.54f, 0.27f, 1.2f, 0.22f, 1.68f, -0.14f);
        this.LIZJ.LJII(24.0f, 32.22f);
        this.LIZJ.LJIIL(10.92f, 7.97f);
        this.LIZJ.LJIIJ(0.49f, 0.36f, 1.14f, 0.41f, 1.69f, 0.14f);
        this.LIZJ.LJIIJ(0.55f, -0.27f, 0.89f, -0.82f, 0.89f, -1.42f);
        this.LIZJ.LJIJ(11.28f);
        this.LIZJ.LJIIIZ(4.82f, 4.82f, false, false, -4.86f, -4.78f);
        this.LIZJ.LJI(15.36f);
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
