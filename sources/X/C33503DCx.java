package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.DCx, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33503DCx extends AbstractC39455Fe7 {
    public C33503DCx() {
        C32856Cuy.v8(this.LIZJ);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIIIZZ(7.0f, 17.0f);
        p.LJIIIZ(1.0f, 1.0f, false, false, -1.0f, 1.0f);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJIILL(2.0f);
        p2.LJIIIZ(1.0f, 1.0f, false, false, 1.0f, 1.0f);
        p2.LJIIJJI(22.0f);
        p2.LJIIIZ(1.0f, 1.0f, false, false, 1.0f, -1.0f);
        p2.LJIILL(-2.0f);
        p2.LJIIIZ(1.0f, 1.0f, false, false, -1.0f, -1.0f);
        p2.LJI(7.0f);
        p2.LIZLLL();
        this.LIZJ.LJIIIIZZ(7.0f, 37.0f);
        DIJ p3 = this.LIZJ;
        o.LJIIIZ(p3, "p");
        p3.LJIIIZ(1.0f, 1.0f, false, false, -1.0f, 1.0f);
        p3.LJIILL(2.0f);
        p3.LJIIIZ(1.0f, 1.0f, false, false, 1.0f, 1.0f);
        p3.LJIIJJI(22.0f);
        p3.LJIIIZ(1.0f, 1.0f, false, false, 1.0f, -1.0f);
        p3.LJIILL(-2.0f);
        p3.LJIIIZ(1.0f, 1.0f, false, false, -1.0f, -1.0f);
        p3.LJI(7.0f);
        p3.LIZLLL();
        C32856Cuy.I2(this.LIZJ);
        this.LIZJ.LJIIZILJ(Path.FillType.WINDING);
    }

    @Override // X.AbstractC39455Fe7
    public final void LIZ(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        LIZIZ(48.0f, 48.0f, canvas);
        canvas.drawPath(this.LIZJ.LIZ, this.LIZIZ);
    }
}
