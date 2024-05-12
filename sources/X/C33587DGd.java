package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.DGd, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33587DGd extends AbstractC39455Fe7 {
    public C33587DGd() {
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIIIZZ(40.0f, 0.0f);
        this.LIZJ.LJIIJ(-1.09f, 0.0f, -0.78f, 3.78f, -2.5f, 5.5f);
        this.LIZJ.LJ(35.78f, 7.22f, 32.0f, 6.91f, 32.0f, 8.0f);
        this.LIZJ.LJIILJJIL(3.78f, 0.78f, 5.5f, 2.5f, true);
        this.LIZJ.LJIIJ(1.72f, 1.72f, 1.41f, 5.5f, 2.5f, 5.5f);
        this.LIZJ.LJIILJJIL(0.78f, -3.78f, 2.5f, -5.5f, true);
        this.LIZJ.LJ(44.22f, 8.78f, 48.0f, 9.09f, 48.0f, 8.0f);
        this.LIZJ.LJIILJJIL(-3.78f, -0.78f, -5.5f, -2.5f, true);
        this.LIZJ.LJ(40.78f, 3.78f, 41.09f, 0.0f, 40.0f, 0.0f);
        this.LIZJ.LIZLLL();
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJIIIIZZ(24.0f, 3.0f);
        this.LIZJ.LJIIJ(2.86f, 0.0f, 2.39f, 9.6f, 6.89f, 14.11f);
        this.LIZJ.LJ(35.4f, 21.61f, 45.0f, 21.14f, 45.0f, 24.0f);
        this.LIZJ.LJIIJ(0.0f, 2.86f, -9.6f, 2.39f, -14.11f, 6.89f);
        this.LIZJ.LJ(26.39f, 35.4f, 26.86f, 45.0f, 24.0f, 45.0f);
        this.LIZJ.LJIIJ(-2.86f, 0.0f, -2.39f, -9.6f, -6.89f, -14.11f);
        this.LIZJ.LJ(12.6f, 26.39f, 3.0f, 26.86f, 3.0f, 24.0f);
        this.LIZJ.LJIIJ(0.0f, -2.86f, 9.6f, -2.39f, 14.11f, -6.89f);
        this.LIZJ.LJ(21.61f, 12.6f, 21.14f, 3.0f, 24.0f, 3.0f);
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
