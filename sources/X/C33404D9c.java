package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.D9c, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33404D9c extends AbstractC39455Fe7 {
    public C33404D9c() {
        C32856Cuy.LLLLZLL(this.LIZJ);
        C32856Cuy.Z9(this.LIZJ);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIJJI(32.0f);
        p.LJIIIZ(1.0f, 1.0f, false, true, 1.0f, 1.0f);
        C32856Cuy.Ei(this.LIZJ);
        C32856Cuy.W6(this.LIZJ);
        this.LIZJ.LJIIIIZZ(39.06f, 27.94f);
        C32856Cuy.w(this.LIZJ);
        C32856Cuy.og(this.LIZJ);
        this.LIZJ.LJIJ(21.04f);
        C32856Cuy.Nn(this.LIZJ);
        this.LIZJ.LJIIZILJ(Path.FillType.WINDING);
    }

    @Override // X.AbstractC39455Fe7
    public final void LIZ(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        LIZIZ(48.0f, 48.0f, canvas);
        canvas.drawPath(this.LIZJ.LIZ, this.LIZIZ);
    }
}
