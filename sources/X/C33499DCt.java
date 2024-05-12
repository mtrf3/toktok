package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.DCt, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33499DCt extends AbstractC39455Fe7 {
    public C33499DCt() {
        this.LIZJ.LJIIIIZZ(18.55f, 24.0f);
        this.LIZJ.LJII(32.57f, 9.98f);
        C32856Cuy.Hk(this.LIZJ);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIL(-1.13f, -1.14f);
        C32856Cuy.yk(this.LIZJ);
        this.LIZJ.LJII(14.16f, 23.3f);
        C32856Cuy.Ik(this.LIZJ);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJIIL(15.86f, 15.86f);
        C32856Cuy.Dk(this.LIZJ);
        DIJ p3 = this.LIZJ;
        o.LJIIIZ(p3, "p");
        p3.LJIIL(1.13f, -1.14f);
        C32856Cuy.Hk(this.LIZJ);
        this.LIZJ.LJII(18.55f, 24.0f);
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
