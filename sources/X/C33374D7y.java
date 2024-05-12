package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.D7y, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33374D7y extends AbstractC39455Fe7 {
    public C33374D7y() {
        C32856Cuy.i4(this.LIZJ);
        this.LIZJ.LJIIIIZZ(24.0f, 8.27f);
        C32856Cuy.o9(this.LIZJ);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIIZ(2.0f, 2.0f, false, true, -2.0f, 2.0f);
        p.LJIIJJI(-2.0f);
        this.LIZJ.LJIIJ(-5.07f, 0.0f, -8.92f, 1.98f, -11.58f, 5.15f);
        this.LIZJ.LJIIIZ(19.44f, 19.44f, false, false, -4.06f, 9.35f);
        this.LIZJ.LIZJ(35.45f, 35.45f, false, true, 20.0f, 30.0f);
        C32856Cuy.z0(this.LIZJ);
        C32856Cuy.wm(this.LIZJ);
        this.LIZJ.LJIILL(7.73f);
        this.LIZJ.LJII(42.88f, 24.0f);
        this.LIZJ.LJII(24.0f, 8.27f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIIZILJ(Path.FillType.EVEN_ODD);
    }

    @Override // X.AbstractC39455Fe7
    public final void LIZ(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        LIZIZ(48.0f, 48.0f, canvas);
        canvas.drawPath(this.LIZJ.LIZ, this.LIZIZ);
    }
}
