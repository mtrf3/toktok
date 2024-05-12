package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.DAu, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33448DAu extends AbstractC39455Fe7 {
    public C33448DAu() {
        this.LIZJ.LJIIIIZZ(9.34f, 9.0f);
        this.LIZJ.LJIIIZ(1.0f, 1.0f, false, true, 0.97f, -1.0f);
        this.LIZJ.LJIIJJI(27.37f);
        this.LIZJ.LJIIIZ(1.0f, 1.0f, false, true, 0.97f, 1.0f);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIILL(2.5f);
        this.LIZJ.LJIIIZ(1.0f, 1.0f, false, true, -0.97f, 1.0f);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJI(10.3f);
        this.LIZJ.LJIIIZ(1.0f, 1.0f, false, true, -0.97f, -1.0f);
        C32856Cuy.T9(this.LIZJ);
        this.LIZJ.LJIIIIZZ(5.37f, 20.8f);
        this.LIZJ.LJIIIZ(3.9f, 3.9f, false, true, 3.86f, -4.3f);
        this.LIZJ.LJIIJJI(29.53f);
        this.LIZJ.LJIIIZ(3.9f, 3.9f, false, true, 3.86f, 4.3f);
        this.LIZJ.LJIIL(-1.86f, 15.7f);
        this.LIZJ.LJIIIZ(3.89f, 3.89f, false, true, -3.87f, 3.5f);
        DIJ p3 = this.LIZJ;
        o.LJIIIZ(p3, "p");
        p3.LJI(11.1f);
        this.LIZJ.LJIIJ(-1.99f, 0.0f, -3.66f, -1.52f, -3.85f, -3.5f);
        this.LIZJ.LJII(5.37f, 20.8f);
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
