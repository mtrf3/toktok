package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.DCn, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33493DCn extends AbstractC39455Fe7 {
    public C33493DCn() {
        this.LIZJ.LJIIIIZZ(7.27f, 24.0f);
        this.LIZJ.LJII(21.3f, 9.98f);
        C32856Cuy.Hk(this.LIZJ);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIL(-1.13f, -1.13f);
        C32856Cuy.zk(this.LIZJ);
        this.LIZJ.LJII(2.89f, 23.3f);
        C32856Cuy.Jk(this.LIZJ);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJIIL(15.86f, 15.86f);
        C32856Cuy.Sk(this.LIZJ);
        this.LIZJ.LJII(7.27f, 24.0f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIIZILJ(Path.FillType.WINDING);
    }

    @Override // X.AbstractC39455Fe7
    public final void LIZ(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        LIZIZ(24.0f, 48.0f, canvas);
        canvas.drawPath(this.LIZJ.LIZ, this.LIZIZ);
    }
}
