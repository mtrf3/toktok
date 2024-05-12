package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.DAr, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33445DAr extends AbstractC39455Fe7 {
    public C33445DAr() {
        this.LIZJ.LJIIIIZZ(37.3f, 19.3f);
        C32856Cuy.yk(this.LIZJ);
        this.LIZJ.LJII(26.0f, 29.16f);
        C32856Cuy.W0(this.LIZJ);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIILL(24.17f);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJIIL(-9.88f, -9.88f);
        C32856Cuy.ln(this.LIZJ);
        DIJ p3 = this.LIZJ;
        o.LJIIIZ(p3, "p");
        p3.LJIIL(13.3f, 13.3f);
        DIJ p4 = this.LIZJ;
        o.LJIIIZ(p4, "p");
        p4.LJIIIZ(2.0f, 2.0f, false, false, 2.82f, 0.0f);
        DIJ p5 = this.LIZJ;
        o.LJIIIZ(p5, "p");
        p5.LJIIL(13.3f, -13.3f);
        C32856Cuy.x2(this.LIZJ);
        C32856Cuy.LJJJ(this.LIZJ);
        this.LIZJ.LJIIZILJ(Path.FillType.WINDING);
    }

    @Override // X.AbstractC39455Fe7
    public final void LIZ(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        LIZIZ(48.0f, 48.0f, canvas);
        canvas.drawPath(this.LIZJ.LIZ, this.LIZIZ);
    }
}
