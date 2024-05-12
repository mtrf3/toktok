package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.DFn, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33571DFn extends AbstractC39455Fe7 {
    public C33571DFn() {
        this.LIZJ.LJIIIIZZ(24.18f, 1.58f);
        this.LIZJ.LJIIIZ(1.5f, 1.5f, false, false, -2.36f, 1.84f);
        this.LIZJ.LJIIL(3.2f, 4.1f);
        this.LIZJ.LJII(24.0f, 7.5f);
        this.LIZJ.LIZJ(19.5f, 19.5f, true, false, 43.5f, 27.0f);
        this.LIZJ.LJIIIZ(1.5f, 1.5f, false, false, -3.0f, 0.0f);
        this.LIZJ.LJIIIZ(16.5f, 16.5f, true, true, -15.47f, -16.47f);
        this.LIZJ.LJIIL(-4.07f, 3.89f);
        this.LIZJ.LJIIIZ(1.5f, 1.5f, false, false, 2.08f, 2.16f);
        this.LIZJ.LJIIL(6.26f, -5.98f);
        this.LIZJ.LJIIJ(0.63f, -0.6f, 0.7f, -1.59f, 0.16f, -2.27f);
        this.LIZJ.LJIIL(-5.28f, -6.75f);
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
