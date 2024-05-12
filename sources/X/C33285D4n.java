package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.D4n, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33285D4n extends AbstractC39455Fe7 {
    public C33285D4n() {
        this.LIZJ.LJIIIIZZ(13.0f, 3.0f);
        C32856Cuy.Kf(this.LIZJ);
        C32856Cuy.LJLLL(this.LIZJ);
        C32856Cuy.Mf(this.LIZJ);
        C32856Cuy.LJIJJ(this.LIZJ);
        C32856Cuy.Lf(this.LIZJ);
        C32856Cuy.h9(this.LIZJ);
        C32856Cuy.Jf(this.LIZJ);
        C32856Cuy.LLLLIILLL(this.LIZJ);
        this.LIZJ.LJIILIIL(4.0f, 11.0f);
        C32856Cuy.aj(this.LIZJ);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIILIIL(0.0f, 8.0f);
        C32856Cuy.aj(this.LIZJ);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJIILIIL(-1.0f, 9.0f);
        p2.LJIIIZ(1.0f, 1.0f, false, true, 1.0f, -1.0f);
        DIJ p3 = this.LIZJ;
        o.LJIIIZ(p3, "p");
        p3.LJIIJJI(8.0f);
        p3.LJIIIZ(1.0f, 1.0f, false, true, 1.0f, 1.0f);
        p3.LJIILL(2.0f);
        p3.LJIIIZ(1.0f, 1.0f, false, true, -1.0f, 1.0f);
        p3.LJIIJJI(-8.0f);
        p3.LJIIIZ(1.0f, 1.0f, false, true, -1.0f, -1.0f);
        p3.LJIILL(-2.0f);
        p3.LIZLLL();
        this.LIZJ.LJIIZILJ(Path.FillType.EVEN_ODD);
    }

    @Override // X.AbstractC39455Fe7
    public final void LIZ(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        LIZIZ(48.0f, 48.0f, canvas);
        canvas.drawPath(this.LIZJ.LIZ, this.LIZIZ);
    }
}
