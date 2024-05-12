package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.text.style.ImageSpan;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class SJT extends ImageSpan {
    public SJT(Drawable drawable) {
        super(drawable);
    }

    @Override // android.text.style.DynamicDrawableSpan, android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        o.LJIIIZ(canvas, "canvas");
        o.LJIIIZ(paint, "paint");
        canvas.save();
        canvas.translate(f, ((i5 - i3) / 2) - (getDrawable().getBounds().height() / 2));
        getDrawable().draw(canvas);
        canvas.restore();
    }
}
