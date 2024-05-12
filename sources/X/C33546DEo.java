package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.DEo, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33546DEo extends AbstractC39455Fe7 {
    public C33546DEo() {
        this.LIZJ.LJIIIIZZ(15.88f, 24.0f);
        this.LIZJ.LJII(2.7f, 10.83f);
        C32856Cuy.uf(this.LIZJ);
        this.LIZJ.LJII(23.3f, 22.94f);
        C32856Cuy.LLJIJIL(this.LIZJ);
        this.LIZJ.LJII(6.95f, 41.42f);
        C32856Cuy.nk(this.LIZJ);
        this.LIZJ.LJII(2.7f, 38.59f);
        C32856Cuy.uk(this.LIZJ);
        this.LIZJ.LJII(15.88f, 24.0f);
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
