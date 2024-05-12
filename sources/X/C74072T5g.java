package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.Layout;
import android.util.AttributeSet;

/* renamed from: X.T5g, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public class C74072T5g extends C47121t6 {
    public int LJLLLL;
    public int LJLLLLLL;
    public boolean LJLZ;
    public boolean LJZ;

    @Override // android.view.View
    public final void scrollBy(int i, int i2) {
    }

    @Override // android.view.View
    public final void scrollTo(int i, int i2) {
    }

    private int getSpaceExtra() {
        if (getLineCount() == this.LJLLLLLL) {
            return this.LJLLLL;
        }
        int lineCount = getLineCount();
        this.LJLLLLLL = lineCount;
        this.LJLLLL = 0;
        int i = lineCount - 1;
        Layout layout = getLayout();
        if (i >= 0 && getMeasuredHeight() == layout.getHeight()) {
            Paint.FontMetricsInt fontMetricsInt = layout.getPaint().getFontMetricsInt();
            Rect rect = new Rect();
            this.LJLLLL = (rect.bottom - (fontMetricsInt.ascent - layout.getLineAscent(i))) - (getLineBounds(i, rect) + fontMetricsInt.bottom);
        }
        return this.LJLLLL;
    }

    @Override // android.widget.TextView, android.view.View
    public void onDraw(Canvas canvas) {
        try {
            super.onDraw(canvas);
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
        }
        if (this.LJLZ) {
            invalidate();
        }
    }

    @Override // android.view.View
    public void setAlpha(float f) {
        super.setAlpha(f);
    }

    public void setAlwaysInvalidate(boolean z) {
        this.LJLZ = z;
    }

    public void setSpaceExplore(boolean z) {
        this.LJZ = z;
    }

    public C74072T5g(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
    }

    @Override // X.C47121t6, androidx.appcompat.widget.AppCompatTextView, android.widget.TextView, android.view.View
    public void onMeasure(int i, int i2) {
        int spaceExtra;
        super.onMeasure(i, i2);
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        if (this.LJZ) {
            spaceExtra = 0;
        } else {
            spaceExtra = getSpaceExtra();
        }
        setMeasuredDimension(measuredWidth, measuredHeight - spaceExtra);
    }

    public C74072T5g(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
