package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.D9g, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33408D9g extends AbstractC39455Fe7 {
    public C33408D9g() {
        this.LIZJ.LJIIIIZZ(26.0f, 7.0f);
        C32856Cuy.P7(this.LIZJ);
        C32856Cuy.LJLJJI(this.LIZJ);
        C32856Cuy.LLLLLL(this.LIZJ);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIJJI(15.0f);
        p.LJIILL(15.0f);
        C32856Cuy.N8(this.LIZJ);
        C32856Cuy.y9(this.LIZJ);
        C32856Cuy.Hm(this.LIZJ);
        C32856Cuy.C6(this.LIZJ);
        C32856Cuy.R9(this.LIZJ);
        this.LIZJ.LJIIZILJ(Path.FillType.WINDING);
    }

    @Override // X.AbstractC39455Fe7
    public final void LIZ(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        LIZIZ(48.0f, 48.0f, canvas);
        canvas.drawPath(this.LIZJ.LIZ, this.LIZIZ);
    }
}
