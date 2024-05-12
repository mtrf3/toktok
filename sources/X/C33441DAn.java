package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.DAn, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33441DAn extends AbstractC39455Fe7 {
    public C33441DAn() {
        C32856Cuy.Vm(this.LIZJ);
        this.LIZJ.LJIILIIL(7.0f, 15.0f);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIIZ(2.0f, 2.0f, false, false, -2.0f, -2.0f);
        p.LJI(12.0f);
        C32856Cuy.ym(this.LIZJ);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJIILL(13.0f);
        p2.LJIIJ(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        C32856Cuy.LJIL(this.LIZJ);
        DIJ p3 = this.LIZJ;
        o.LJIIIZ(p3, "p");
        p3.LJIIIZ(2.0f, 2.0f, false, false, 2.0f, -2.0f);
        p3.LJIJ(26.0f);
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
