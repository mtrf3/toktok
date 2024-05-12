package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.DCs, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33498DCs extends AbstractC39455Fe7 {
    public C33498DCs() {
        this.LIZJ.LJIIIIZZ(30.54f, 3.46f);
        this.LIZJ.LJIIIZ(2.7f, 2.7f, false, true, 3.73f, -0.07f);
        this.LIZJ.LJIIL(5.1f, 4.7f);
        this.LIZJ.LJIIIZ(2.7f, 2.7f, false, true, 0.08f, 3.9f);
        this.LIZJ.LJII(24.53f, 26.8f);
        this.LIZJ.LJIIJ(-4.14f, 4.1f, -9.17f, 6.35f, -14.43f, 8.59f);
        this.LIZJ.LJIIIZ(1.9f, 1.9f, false, true, -2.52f, -2.43f);
        this.LIZJ.LJIIJ(2.19f, -5.75f, 4.5f, -11.18f, 8.97f, -15.61f);
        this.LIZJ.LJII(30.54f, 3.46f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIIIIZZ(8.0f, 38.0f);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIIZ(1.0f, 1.0f, false, false, -1.0f, 1.0f);
        p.LJIILL(3.0f);
        p.LJIIIZ(1.0f, 1.0f, false, false, 1.0f, 1.0f);
        p.LJIIJJI(32.0f);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJIIIZ(1.0f, 1.0f, false, false, 1.0f, -1.0f);
        p2.LJIILL(-3.0f);
        p2.LJIIIZ(1.0f, 1.0f, false, false, -1.0f, -1.0f);
        p2.LJI(8.0f);
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
