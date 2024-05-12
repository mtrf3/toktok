package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.D9n, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33415D9n extends AbstractC39455Fe7 {
    public C33415D9n() {
        C32856Cuy.hm(this.LIZJ);
        this.LIZJ.LJIIIIZZ(18.0f, 9.0f);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIIZ(1.0f, 1.0f, false, false, -1.0f, -1.0f);
        p.LJI(8.0f);
        C32856Cuy.LLIIJLIL(this.LIZJ);
        C32856Cuy.LLLZ(this.LIZJ);
        C32856Cuy.T9(this.LIZJ);
        this.LIZJ.LJIIIIZZ(30.0f, 39.0f);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJIIIZ(1.0f, 1.0f, false, false, 1.0f, 1.0f);
        p2.LJIIJJI(9.0f);
        p2.LJIIIZ(6.0f, 6.0f, false, false, 6.0f, -6.0f);
        p2.LJIJ(14.0f);
        DIJ p3 = this.LIZJ;
        o.LJIIIZ(p3, "p");
        p3.LJIIIZ(6.0f, 6.0f, false, false, -6.0f, -6.0f);
        p3.LJIIJJI(-9.0f);
        p3.LJIIIZ(1.0f, 1.0f, false, false, -1.0f, 1.0f);
        C78269Unh.LIZJ(this.LIZJ, "p", 30.0f);
        this.LIZJ.LJIIZILJ(Path.FillType.WINDING);
    }

    @Override // X.AbstractC39455Fe7
    public final void LIZ(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        LIZIZ(48.0f, 48.0f, canvas);
        canvas.drawPath(this.LIZJ.LIZ, this.LIZIZ);
    }
}
