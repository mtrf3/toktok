package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.DCz, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33505DCz extends AbstractC39455Fe7 {
    public C33505DCz() {
        this.LIZJ.LJIIIIZZ(27.76f, 24.0f);
        this.LIZJ.LJII(14.59f, 10.83f);
        C32856Cuy.uk(this.LIZJ);
        this.LIZJ.LJII(17.4f, 6.6f);
        C32856Cuy.pk(this.LIZJ);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIL(16.35f, 16.35f);
        C32856Cuy.LLJIJIL(this.LIZJ);
        this.LIZJ.LJII(18.83f, 41.41f);
        C32856Cuy.mk(this.LIZJ);
        this.LIZJ.LJII(14.6f, 38.6f);
        C32856Cuy.uk(this.LIZJ);
        this.LIZJ.LJII(27.76f, 24.0f);
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
