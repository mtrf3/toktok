package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.DGf, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33589DGf extends AbstractC39455Fe7 {
    public C33589DGf() {
        this.LIZJ.LJIIIIZZ(28.67f, 4.54f);
        this.LIZJ.LJIIIZ(5.61f, 5.61f, false, false, 5.79f, 2.4f);
        this.LIZJ.LJIIIZ(5.61f, 5.61f, false, true, 6.6f, 6.6f);
        this.LIZJ.LJIIIZ(5.61f, 5.61f, false, false, 2.4f, 5.79f);
        this.LIZJ.LJIIIZ(5.61f, 5.61f, false, true, 0.0f, 9.34f);
        this.LIZJ.LJIIIZ(5.61f, 5.61f, false, false, -2.4f, 5.79f);
        this.LIZJ.LJIIIZ(5.61f, 5.61f, false, true, -6.6f, 6.6f);
        this.LIZJ.LJIIIZ(5.61f, 5.61f, false, false, -5.79f, 2.4f);
        this.LIZJ.LJIIIZ(5.61f, 5.61f, false, true, -9.34f, 0.0f);
        this.LIZJ.LJIIIZ(5.61f, 5.61f, false, false, -5.79f, -2.4f);
        this.LIZJ.LJIIIZ(5.61f, 5.61f, false, true, -6.6f, -6.6f);
        this.LIZJ.LJIIIZ(5.61f, 5.61f, false, false, -2.4f, -5.79f);
        this.LIZJ.LJIIIZ(5.61f, 5.61f, false, true, 0.0f, -9.34f);
        this.LIZJ.LJIIIZ(5.61f, 5.61f, false, false, 2.4f, -5.79f);
        this.LIZJ.LJIIIZ(5.61f, 5.61f, false, true, 6.6f, -6.6f);
        this.LIZJ.LJIIJ(2.24f, 0.44f, 4.52f, -0.5f, 5.79f, -2.4f);
        this.LIZJ.LJIIIZ(5.61f, 5.61f, false, true, 9.34f, 0.0f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIIIIZZ(17.23f, 22.4f);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIIZ(0.83f, 0.83f, false, false, -1.18f, 0.0f);
        this.LIZJ.LJIIL(-2.2f, 2.2f);
        this.LIZJ.LJIIIZ(0.83f, 0.83f, false, false, 0.0f, 1.17f);
        this.LIZJ.LJIIL(6.1f, 6.1f);
        this.LIZJ.LJIIJ(0.66f, 0.66f, 1.71f, 0.66f, 2.36f, 0.0f);
        this.LIZJ.LJIIL(11.74f, -11.72f);
        this.LIZJ.LJIIIZ(0.83f, 0.83f, false, false, 0.0f, -1.18f);
        this.LIZJ.LJIIL(-2.2f, -2.2f);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJIIIZ(0.83f, 0.83f, false, false, -1.18f, 0.0f);
        this.LIZJ.LJIIL(-9.53f, 9.54f);
        this.LIZJ.LJIIL(-3.91f, -3.91f);
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
