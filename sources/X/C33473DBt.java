package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.DBt, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33473DBt extends AbstractC39455Fe7 {
    public C33473DBt() {
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIIIZZ(3.0f, 19.0f);
        C32856Cuy.le(this.LIZJ);
        this.LIZJ.LIZJ(2.0f, 2.0f, false, true, 24.0f, 6.38f);
        C32856Cuy.Pn(this.LIZJ);
        C32856Cuy.LLLLLLZ(this.LIZJ);
        C32856Cuy.vl(this.LIZJ);
        this.LIZJ.LIZJ(6.0f, 6.0f, false, true, 10.15f, 20.0f);
        C32856Cuy.LLLLLLZZ(this.LIZJ);
        C32856Cuy.x3(this.LIZJ);
        C32856Cuy.a6(this.LIZJ);
        this.LIZJ.LJIIZILJ(Path.FillType.WINDING);
    }

    @Override // X.AbstractC39455Fe7
    public final void LIZ(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        LIZIZ(48.0f, 48.0f, canvas);
        canvas.drawPath(this.LIZJ.LIZ, this.LIZIZ);
    }
}
