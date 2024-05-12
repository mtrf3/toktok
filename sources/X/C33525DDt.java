package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.DDt, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33525DDt extends AbstractC39455Fe7 {
    public C33525DDt() {
        this.LIZJ.LJIIIIZZ(10.84f, 13.94f);
        this.LIZJ.LJIIIZ(13.22f, 13.22f, false, true, 26.32f, 0.0f);
        this.LIZJ.LJIIL(1.02f, 10.59f);
        this.LIZJ.LJIIJ(0.3f, 3.19f, 3.4f, 5.86f, 5.27f, 8.23f);
        C32856Cuy.Ne(this.LIZJ);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIJ(1.87f, -2.37f, 4.96f, -5.04f, 5.27f, -8.23f);
        this.LIZJ.LJIIL(1.02f, -10.59f);
        this.LIZJ.LIZLLL();
        C32856Cuy.K2(this.LIZJ);
        this.LIZJ.LJIIZILJ(Path.FillType.WINDING);
    }

    @Override // X.AbstractC39455Fe7
    public final void LIZ(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        LIZIZ(48.0f, 48.0f, canvas);
        canvas.drawPath(this.LIZJ.LIZ, this.LIZIZ);
    }
}
