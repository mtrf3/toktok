package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.DCh, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33487DCh extends AbstractC39455Fe7 {
    public C33487DCh() {
        this.LIZJ.LJIILIIL(24.0f, 18.55f);
        this.LIZJ.LJIIL(14.02f, 14.02f);
        C32856Cuy.Sk(this.LIZJ);
        this.LIZJ.LJII(24.71f, 14.17f);
        C32856Cuy.yk(this.LIZJ);
        this.LIZJ.LJII(7.43f, 30.02f);
        C32856Cuy.Ik(this.LIZJ);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIL(1.13f, 1.13f);
        C32856Cuy.Dk(this.LIZJ);
        this.LIZJ.LJII(24.0f, 18.55f);
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
