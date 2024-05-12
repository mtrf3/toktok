package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class CX0 extends AbstractC31467CWp {
    public final Bitmap LJI;
    public final Rect LJII;

    @Override // X.AbstractC31467CWp
    public final int LJ(Paint paint) {
        o.LJIIIZ(paint, "paint");
        int width = (this.LJI.getWidth() * this.LIZJ) / this.LJI.getHeight();
        Rect rect = this.LJII;
        rect.right = width;
        rect.bottom = this.LIZJ;
        return width;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CX0(Context context, Bitmap bitmap) {
        super(context);
        o.LJIIIZ(context, "context");
        this.LJI = bitmap;
        this.LJII = new Rect();
    }

    @Override // X.AbstractC31467CWp
    public final void LIZLLL(Canvas canvas, Paint paint) {
        o.LJIIIZ(canvas, "canvas");
        o.LJIIIZ(paint, "paint");
        if (!this.LJI.isRecycled()) {
            canvas.drawBitmap(this.LJI, (Rect) null, this.LJII, (Paint) null);
        }
    }
}
