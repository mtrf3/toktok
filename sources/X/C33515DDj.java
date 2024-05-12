package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.DDj, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33515DDj extends AbstractC39455Fe7 {
    public C33515DDj() {
        this.LIZJ.LJIIIIZZ(33.18f, 2.68f);
        C32856Cuy.a0(this.LIZJ);
        this.LIZJ.LJII(35.76f, 2.0f);
        this.LIZJ.LJIIIZ(8.69f, 8.69f, false, true, -6.25f, 10.66f);
        this.LIZJ.LJIIL(4.7f, 17.24f);
        this.LIZJ.LJIIIZ(12.62f, 12.62f, false, true, -9.66f, 15.6f);
        this.LIZJ.LIZJ(12.94f, 12.94f, false, true, 9.61f, 37.0f);
        this.LIZJ.LJIIIZ(12.6f, 12.6f, false, true, 8.9f, -16.03f);
        C32856Cuy.a0(this.LIZJ);
        this.LIZJ.LJIIJ(1.63f, -0.43f, 3.28f, 0.59f, 3.71f, 2.18f);
        this.LIZJ.LJIIL(0.26f, 0.93f);
        this.LIZJ.LJIIIZ(3.1f, 3.1f, false, true, -2.21f, 3.78f);
        this.LIZJ.LJIIIZ(5.49f, 5.49f, false, false, -4.04f, 5.89f);
        this.LIZJ.LJIIIZ(5.6f, 5.6f, false, false, 7.29f, 4.66f);
        this.LIZJ.LJIIJ(2.88f, -0.9f, 4.42f, -4.0f, 3.64f, -6.86f);
        this.LIZJ.LJII(21.92f, 12.2f);
        this.LIZJ.LJIIIZ(6.3f, 6.3f, false, true, 4.53f, -7.74f);
        this.LIZJ.LJIIL(6.73f, -1.78f);
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
