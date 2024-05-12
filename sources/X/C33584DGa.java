package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.DGa, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33584DGa extends AbstractC39455Fe7 {
    public C33584DGa() {
        this.LIZJ.LJIIIIZZ(33.46f, 67.47f);
        this.LIZJ.LJIIIZ(4.3f, 4.3f, false, false, 5.08f, 0.0f);
        this.LIZJ.LJIIJ(7.7f, -5.62f, 32.77f, -25.39f, 32.43f, -43.7f);
        this.LIZJ.LIZJ(20.7f, 20.7f, false, false, 50.28f, 3.09f);
        this.LIZJ.LIZJ(20.68f, 20.68f, false, false, 36.0f, 8.84f);
        this.LIZJ.LIZJ(20.7f, 20.7f, false, false, 21.72f, 3.1f);
        this.LIZJ.LIZJ(20.7f, 20.7f, false, false, 1.03f, 23.74f);
        this.LIZJ.LJ(0.7f, 42.08f, 25.77f, 61.85f, 33.46f, 67.47f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIIIIZZ(4.07f, 23.77f);
        this.LIZJ.LJIIIZ(17.63f, 17.63f, false, true, 30.78f, -11.73f);
        this.LIZJ.LJIIIZ(1.52f, 1.52f, false, false, 2.28f, 0.0f);
        this.LIZJ.LJIIIZ(17.66f, 17.66f, false, true, 13.15f, -5.91f);
        this.LIZJ.LJIIJ(9.73f, 0.0f, 17.64f, 7.91f, 17.64f, 17.67f);
        this.LIZJ.LJ(68.25f, 41.1f, 42.0f, 61.17f, 36.74f, 65.0f);
        this.LIZJ.LJIIJ(-0.45f, 0.33f, -1.04f, 0.33f, -1.49f, 0.0f);
        this.LIZJ.LJ(30.0f, 61.17f, 3.75f, 41.11f, 4.07f, 23.77f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIIZILJ(Path.FillType.WINDING);
    }

    @Override // X.AbstractC39455Fe7
    public final void LIZ(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        LIZIZ(72.0f, 72.0f, canvas);
        canvas.drawPath(this.LIZJ.LIZ, this.LIZIZ);
    }
}
