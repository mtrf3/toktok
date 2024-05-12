package X;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import kotlin.jvm.internal.o;

/* renamed from: X.ShD, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C72771ShD extends Drawable {
    public float LIZ;
    public final Paint LIZIZ = C6D8.LIZIZ(true);
    public final RectF LIZJ = new RectF();
    public final Paint LIZLLL;

    @Override // android.graphics.drawable.Drawable
    public final /* bridge */ /* synthetic */ int getOpacity() {
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public final /* bridge */ /* synthetic */ void setAlpha(int i) {
    }

    @Override // android.graphics.drawable.Drawable
    /* renamed from: LIZ, reason: merged with bridge method [inline-methods] */
    public final ColorFilter getColorFilter() {
        return this.LIZIZ.getColorFilter();
    }

    public C72771ShD() {
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setColor(0);
        this.LIZLLL = paint;
    }

    @Override // android.graphics.drawable.Drawable
    /* renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final void setColorFilter(ColorFilter colorFilter) {
        this.LIZIZ.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        this.LIZJ.set(getBounds());
        RectF rectF = this.LIZJ;
        float f = this.LIZ;
        canvas.drawRoundRect(rectF, f, f, this.LIZLLL);
    }
}
