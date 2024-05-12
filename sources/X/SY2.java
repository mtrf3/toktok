package X;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import defpackage.a1;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class SY2 extends View {
    public final Paint LJLIL;
    public int LJLILLLLZI;
    public int LJLJI;
    public int LJLJJI;

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        Drawable background = getBackground();
        if (background == null) {
            return;
        }
        int saveLayer = canvas.saveLayer(0.0f, 0.0f, getWidth(), getHeight(), null, 31);
        background.draw(canvas);
        float f = this.LJLJI;
        float f2 = this.LJLJJI;
        float height = getHeight();
        Paint paint = this.LJLIL;
        o.LJI(paint);
        canvas.drawRect(f, 0.0f, f2, height, paint);
        canvas.restoreToCount(saveLayer);
    }

    public final void setColor(int i) {
        Paint paint = this.LJLIL;
        o.LJI(paint);
        paint.setColor(i);
        invalidate();
    }

    public final void setLength(int i) {
        this.LJLILLLLZI = i;
        int i2 = this.LJLJI;
        this.LJLJJI = C78609UtB.LJJIIZ(i + i2, i2, getWidth() - getPaddingRight());
        invalidate();
    }

    public final void setStart(int i) {
        this.LJLJI = i;
        this.LJLJJI = C78609UtB.LJJIIZ(this.LJLILLLLZI + i, i, getWidth() - getPaddingRight());
        invalidate();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SY2(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        a1.LJFF(context, "context");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.color}, 0, 0);
        o.LJIIIIZZ(obtainStyledAttributes, "context.obtainStyledAttr…KTVView, defStyleAttr, 0)");
        int color = obtainStyledAttributes.getColor(0, -16777216);
        obtainStyledAttributes.recycle();
        Paint paint = new Paint(1);
        this.LJLIL = paint;
        paint.setStyle(Paint.Style.FILL);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_ATOP));
        paint.setColor(color);
    }
}
