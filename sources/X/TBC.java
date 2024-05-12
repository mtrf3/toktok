package X;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.TextPaint;
import android.util.AttributeSet;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class TBC extends C47121t6 {
    public final float LJLLLL;
    public final int LJLLLLLL;
    public final C62822Ol8 LJLZ;

    private final TextPaint getTextPaint() {
        return (TextPaint) this.LJLZ.getValue();
    }

    @Override // android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        if (this.LJLLLL > 0.0f) {
            getTextPaint().set(getPaint());
            ColorStateList textColors = getTextColors();
            setTextColor(this.LJLLLLLL);
            getPaint().setStyle(Paint.Style.STROKE);
            getPaint().setStrokeWidth(this.LJLLLL);
            super.onDraw(canvas);
            setTextColor(textColors);
            getPaint().setStyle(Paint.Style.FILL);
            super.onDraw(canvas);
            return;
        }
        super.onDraw(canvas);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TBC(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C04560Fw.LIZ(context, "context", attributeSet, "attrs");
        this.LJLLLLLL = R.color.a3l;
        this.LJLZ = C221108m2.LIZIZ(TBD.LJLIL);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, new int[]{R.attr.b3f, R.attr.b3g}, 0, 0);
        try {
            this.LJLLLL = obtainStyledAttributes.getDimension(1, 0.0f);
            this.LJLLLLLL = obtainStyledAttributes.getInteger(0, R.color.a3l);
        } finally {
            obtainStyledAttributes.recycle();
        }
    }
}
