package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.DBy, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33478DBy extends AbstractC39455Fe7 {
    public C33478DBy() {
        this.LIZJ.LJIIIIZZ(26.02f, 2.54f);
        this.LIZJ.LJIIIZ(4.0f, 4.0f, false, false, -4.0f, 0.0f);
        this.LIZJ.LJII(6.0f, 11.78f);
        this.LIZJ.LJIIIZ(4.0f, 4.0f, false, false, -2.0f, 3.47f);
        this.LIZJ.LJIILL(18.5f);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIIZ(4.0f, 4.0f, false, false, 2.0f, 3.46f);
        this.LIZJ.LJIIL(16.02f, 9.24f);
        this.LIZJ.LJIIIZ(4.0f, 4.0f, false, false, 4.0f, 0.0f);
        this.LIZJ.LJIIL(16.01f, -9.24f);
        this.LIZJ.LJIIIZ(4.0f, 4.0f, false, false, 2.0f, -3.47f);
        this.LIZJ.LJIILL(-18.5f);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJIIIZ(4.0f, 4.0f, false, false, -2.0f, -3.46f);
        this.LIZJ.LJII(26.02f, 2.54f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIIIIZZ(28.15f, 12.0f);
        this.LIZJ.LJIIJ(0.0f, 3.3f, 2.67f, 5.99f, 5.98f, 5.99f);
        this.LIZJ.LJIILL(3.99f);
        this.LIZJ.LJIIIZ(9.93f, 9.93f, false, true, -5.98f, -2.0f);
        this.LIZJ.LJIILL(8.31f);
        this.LIZJ.LJIIIZ(7.65f, 7.65f, true, true, -6.65f, -7.58f);
        this.LIZJ.LJIILL(4.06f);
        this.LIZJ.LJIIIZ(3.83f, 3.83f, false, false, -1.0f, -0.13f);
        this.LIZJ.LJIIIZ(3.66f, 3.66f, true, false, 3.66f, 3.65f);
        C32856Cuy.j9(this.LIZJ);
        this.LIZJ.LJIIJJI(3.99f);
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
