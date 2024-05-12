package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.DAm, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33440DAm extends AbstractC39455Fe7 {
    public C33440DAm() {
        this.LIZJ.LJIIIIZZ(22.59f, 4.59f);
        C32856Cuy.LLLILZLLLI(this.LIZJ);
        this.LIZJ.LJIIL(15.3f, 15.29f);
        C32856Cuy.De(this.LIZJ);
        this.LIZJ.LJII(26.0f, 10.83f);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIJ(43.0f);
        p.LJIIIZ(1.0f, 1.0f, false, true, -1.0f, 1.0f);
        C32856Cuy.LLIIII(this.LIZJ);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJIJ(10.83f);
        this.LIZJ.LJII(10.12f, 22.7f);
        C32856Cuy.Ji(this.LIZJ);
        DIJ p3 = this.LIZJ;
        o.LJIIIZ(p3, "p");
        p3.LJIIL(15.3f, -15.3f);
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
