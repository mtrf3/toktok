package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.DDr, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33523DDr extends AbstractC39455Fe7 {
    public C33523DDr() {
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIIIZZ(8.0f, 6.0f);
        C32856Cuy.A4(this.LIZJ);
        C32856Cuy.l7(this.LIZJ);
        DIK.LIZIZ(this.LIZJ, "p", 6.0f);
        this.LIZJ.LJIIIIZZ(30.0f, 6.0f);
        C32856Cuy.A4(this.LIZJ);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJIIJJI(-8.0f);
        p2.LJIIIZ(1.0f, 1.0f, false, true, -1.0f, -1.0f);
        DIK.LIZIZ(this.LIZJ, "p", 6.0f);
        this.LIZJ.LJIIZILJ(Path.FillType.WINDING);
    }

    @Override // X.AbstractC39455Fe7
    public final void LIZ(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        LIZIZ(48.0f, 48.0f, canvas);
        canvas.drawPath(this.LIZJ.LIZ, this.LIZIZ);
    }
}
