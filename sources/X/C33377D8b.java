package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.D8b, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33377D8b extends AbstractC39455Fe7 {
    public C33377D8b() {
        this.LIZJ.LJIIIIZZ(41.11f, 5.34f);
        this.LIZJ.LIZJ(2.0f, 2.0f, false, true, 42.0f, 7.0f);
        this.LIZJ.LJIILL(33.36f);
        this.LIZJ.LJIIIZ(2.0f, 2.0f, false, true, -2.7f, 1.87f);
        this.LIZJ.LJIIL(-7.88f, -2.97f);
        this.LIZJ.LIZJ(9.89f, 9.89f, false, true, 23.65f, 43.0f);
        this.LIZJ.LJIIIZ(9.77f, 9.77f, false, true, -9.82f, -10.38f);
        this.LIZJ.LJII(8.0f, 30.42f);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIILL(1.24f);
        C32856Cuy.Dl(this.LIZJ);
        this.LIZJ.LJIJ(16.34f);
        C32856Cuy.LLLLLLJ(this.LIZJ);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJIILL(1.78f);
        this.LIZJ.LJII(39.23f, 5.15f);
        this.LIZJ.LJIIIZ(2.0f, 2.0f, false, true, 1.88f, 0.19f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIIIIZZ(8.0f, 22.44f);
        this.LIZJ.LJIILL(3.7f);
        this.LIZJ.LJIIL(30.0f, 11.33f);
        C32856Cuy.h9(this.LIZJ);
        this.LIZJ.LJII(8.0f, 22.45f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIILIIL(9.87f, 11.7f);
        this.LIZJ.LJIIIZ(5.91f, 5.91f, false, false, 9.47f, 3.57f);
        this.LIZJ.LJIIL(-9.47f, -3.56f);
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
