package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.text.style.ImageSpan;

/* loaded from: classes13.dex */
public final class SJU extends ImageSpan {
    public SJU(int i, Context context) {
        super(context, i, 1);
    }

    @Override // android.text.style.DynamicDrawableSpan, android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        Drawable drawable = getDrawable();
        canvas.save();
        canvas.translate(f + 0, (i5 - drawable.getBounds().bottom) / 2);
        drawable.draw(canvas);
        canvas.restore();
    }
}
