package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.DFp, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33573DFp extends AbstractC39455Fe7 {
    public C33573DFp() {
        this.LIZJ.LJIIIIZZ(16.37f, 24.0f);
        this.LIZJ.LJII(2.71f, 10.33f);
        C32856Cuy.rm(this.LIZJ);
        this.LIZJ.LJII(5.96f, 40.92f);
        C32856Cuy.nk(this.LIZJ);
        this.LIZJ.LJII(2.7f, 39.08f);
        C32856Cuy.uk(this.LIZJ);
        this.LIZJ.LJII(16.37f, 24.0f);
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
