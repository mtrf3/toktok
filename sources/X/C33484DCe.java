package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.DCe, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33484DCe extends AbstractC39455Fe7 {
    public C33484DCe() {
        this.LIZJ.LJIILIIL(29.05f, 32.46f);
        this.LIZJ.LJIIL(8.12f, 8.13f);
        C32856Cuy.P9(this.LIZJ);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIL(0.7f, -0.71f);
        C32856Cuy.y5(this.LIZJ);
        this.LIZJ.LJIIL(-7.98f, -8.0f);
        this.LIZJ.LJIIIZ(14.0f, 14.0f, true, false, -1.56f, 1.27f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIIIIZZ(33.0f, 21.0f);
        C32856Cuy.Pa(this.LIZJ);
        this.LIZJ.LJIIZILJ(Path.FillType.WINDING);
    }

    @Override // X.AbstractC39455Fe7
    public final void LIZ(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        LIZIZ(48.0f, 48.0f, canvas);
        canvas.drawPath(this.LIZJ.LIZ, this.LIZIZ);
    }
}
