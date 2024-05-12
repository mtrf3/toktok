package X;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import kotlin.jvm.internal.o;

/* renamed from: X.TDq, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C74290TDq extends AbstractC74292TDs {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C74290TDq(C74291TDr view) {
        super(view);
        o.LJIIIZ(view, "view");
    }

    @Override // X.AbstractC74292TDs
    public final void LIZ(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        this.LIZIZ.set(0.0f, 0.0f, this.LIZ.getWidth(), this.LIZ.getHeight());
        this.LIZJ.reset();
        Path path = this.LIZJ;
        RectF rectF = this.LIZIZ;
        float[] fArr = this.LIZLLL;
        if (fArr != null) {
            path.addRoundRect(rectF, fArr, Path.Direction.CW);
            canvas.clipPath(this.LIZJ);
        } else {
            o.LJIJI("radiusArray");
            throw null;
        }
    }

    @Override // X.AbstractC74292TDs
    public final void LIZIZ(float[] fArr) {
        this.LIZLLL = fArr;
        this.LIZ.setOutlineProvider(null);
        this.LIZ.setClipToOutline(false);
    }
}
