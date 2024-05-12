package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.D5w, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33320D5w extends AbstractC39455Fe7 {
    public C33320D5w() {
        this.LIZJ.LJIIIIZZ(18.0f, 3.0f);
        C32856Cuy.Pm(this.LIZJ);
        C32856Cuy.LJIIJJI(this.LIZJ);
        C32856Cuy.Ef(this.LIZJ);
        C32856Cuy.Pm(this.LIZJ);
        C32856Cuy.D0(this.LIZJ);
        C32856Cuy.pj(this.LIZJ);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIILL(31.0f);
        C32856Cuy.c4(this.LIZJ);
        C32856Cuy.nl(this.LIZJ);
        C32856Cuy.D0(this.LIZJ);
        C32856Cuy.Ef(this.LIZJ);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIILIIL(7.0f, 29.0f);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJIIJJI(-8.0f);
        p2.LJIIIZ(1.0f, 1.0f, false, false, -1.0f, 1.0f);
        DIJ p3 = this.LIZJ;
        o.LJIIIZ(p3, "p");
        p3.LJIILL(2.0f);
        p3.LJIIIZ(1.0f, 1.0f, false, false, 1.0f, 1.0f);
        p3.LJIIJJI(8.0f);
        p3.LJIIIZ(1.0f, 1.0f, false, false, 1.0f, -1.0f);
        p3.LJIILL(-2.0f);
        p3.LJIIIZ(1.0f, 1.0f, false, false, -1.0f, -1.0f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIILIIL(6.0f, -8.0f);
        C32856Cuy.Fo(this.LIZJ);
        this.LIZJ.LJIILIIL(0.0f, -8.0f);
        C32856Cuy.Fo(this.LIZJ);
        this.LIZJ.LJIIZILJ(Path.FillType.WINDING);
    }

    @Override // X.AbstractC39455Fe7
    public final void LIZ(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        LIZIZ(48.0f, 48.0f, canvas);
        canvas.drawPath(this.LIZJ.LIZ, this.LIZIZ);
    }
}
