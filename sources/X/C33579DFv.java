package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.DFv, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33579DFv extends AbstractC39455Fe7 {
    public C33579DFv() {
        this.LIZJ.LJIIIIZZ(37.5f, 10.5f);
        this.LIZJ.LJ(35.78f, 8.78f, 32.0f, 9.1f, 32.0f, 8.0f);
        this.LIZJ.LJIILJJIL(3.78f, -0.78f, 5.5f, -2.5f, true);
        this.LIZJ.LJ(39.22f, 3.78f, 38.9f, 0.0f, 40.0f, 0.0f);
        this.LIZJ.LJIILJJIL(0.78f, 3.78f, 2.5f, 5.5f, true);
        this.LIZJ.LJ(44.22f, 7.22f, 48.0f, 6.9f, 48.0f, 8.0f);
        this.LIZJ.LJIILJJIL(-3.78f, 0.78f, -5.5f, 2.5f, true);
        this.LIZJ.LJ(40.78f, 12.22f, 41.1f, 16.0f, 40.0f, 16.0f);
        this.LIZJ.LJIILJJIL(-0.78f, -3.78f, -2.5f, -5.5f, true);
        this.LIZJ.LIZLLL();
        C32856Cuy.Qj(this.LIZJ);
        this.LIZJ.LJIIIIZZ(12.89f, 24.0f);
        this.LIZJ.LJIIJ(2.37f, 0.81f, 5.03f, 2.04f, 7.06f, 4.07f);
        this.LIZJ.LJIIJ(2.02f, 2.02f, 3.25f, 4.68f, 4.06f, 7.05f);
        this.LIZJ.LJIIJ(0.81f, -2.37f, 2.04f, -5.03f, 4.07f, -7.05f);
        this.LIZJ.LJIIJ(2.02f, -2.03f, 4.68f, -3.26f, 7.05f, -4.07f);
        this.LIZJ.LJIIJ(-2.37f, -0.81f, -5.03f, -2.04f, -7.05f, -4.06f);
        this.LIZJ.LJIIJ(-2.03f, -2.03f, -3.26f, -4.69f, -4.07f, -7.06f);
        this.LIZJ.LJIIJ(-0.81f, 2.37f, -2.04f, 5.03f, -4.06f, 7.06f);
        this.LIZJ.LJIIJ(-2.03f, 2.02f, -4.69f, 3.25f, -7.06f, 4.06f);
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
