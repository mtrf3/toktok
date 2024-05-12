package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.DBm, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33466DBm extends AbstractC39455Fe7 {
    public C33466DBm() {
        this.LIZJ.LJIIIIZZ(22.0f, 37.17f);
        C32856Cuy.wi(this.LIZJ);
        this.LIZJ.LJIILL(32.17f);
        this.LIZJ.LJII(37.88f, 25.3f);
        C32856Cuy.oo(this.LIZJ);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIL(-15.3f, 15.3f);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJIIIZ(2.0f, 2.0f, false, true, -2.82f, 0.0f);
        DIJ p3 = this.LIZJ;
        o.LJIIIZ(p3, "p");
        p3.LJIIL(-15.3f, -15.3f);
        C32856Cuy.We(this.LIZJ);
        this.LIZJ.LJII(22.0f, 37.17f);
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
