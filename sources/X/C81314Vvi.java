package X;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import kotlin.jvm.internal.o;

/* renamed from: X.Vvi, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C81314Vvi extends Drawable {
    public final Paint LIZ;
    public EnumC81316Vvk LIZIZ;
    public final /* synthetic */ C81312Vvg LIZJ;

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }

    public final int LIZ() {
        int i = C81317Vvl.LIZ[this.LIZIZ.ordinal()];
        if (i != 1 && i != 2) {
            if (i == 3) {
                return this.LIZJ.LJLL;
            }
            throw new C162476Zf();
        }
        return this.LIZJ.LJLJLJ;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return LIZ();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return LIZ();
    }

    public C81314Vvi(C81312Vvg c81312Vvg) {
        this.LIZJ = c81312Vvg;
        Paint paint = new Paint();
        this.LIZ = paint;
        this.LIZIZ = EnumC81316Vvk.NORMAL;
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(-1);
        paint.setAntiAlias(true);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        canvas.drawCircle(getBounds().exactCenterX(), getBounds().exactCenterY(), LIZ() / 2.0f, this.LIZ);
    }
}
