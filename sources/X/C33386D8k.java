package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.D8k, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33386D8k extends AbstractC39455Fe7 {
    public C33386D8k() {
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIIIZZ(7.0f, 12.0f);
        p.LJIILL(24.0f);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJIIIZ(4.0f, 4.0f, false, false, 4.0f, 4.0f);
        p2.LJIIJJI(26.0f);
        p2.LJIIIZ(4.0f, 4.0f, false, false, 4.0f, -4.0f);
        p2.LJIJ(12.0f);
        p2.LJIIIZ(4.0f, 4.0f, false, false, -4.0f, -4.0f);
        p2.LJI(11.0f);
        DIJ p3 = this.LIZJ;
        o.LJIIIZ(p3, "p");
        p3.LJIIIZ(4.0f, 4.0f, false, false, -4.0f, 4.0f);
        p3.LIZLLL();
        this.LIZJ.LJIILIIL(5.0f, 14.5f);
        C32856Cuy.LJJJJJL(this.LIZJ);
        this.LIZJ.LJIILIIL(11.0f, 6.0f);
        C32856Cuy.LJJJJJL(this.LIZJ);
        this.LIZJ.LJIILIIL(5.5f, -6.5f);
        C32856Cuy.Wm(this.LIZJ);
        DIJ p4 = this.LIZJ;
        o.LJIIIZ(p4, "p");
        p4.LJIIJ(0.0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f);
        p4.LIZLLL();
        this.LIZJ.LJIIIIZZ(12.0f, 32.5f);
        C32856Cuy.J1(this.LIZJ);
        C32856Cuy.Wm(this.LIZJ);
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
