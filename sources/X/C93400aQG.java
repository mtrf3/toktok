package X;

import android.content.Context;
import android.graphics.Canvas;
import androidx.appcompat.widget.AppCompatTextView;

/* renamed from: X.aQG, reason: case insensitive filesystem */
/* loaded from: classes32.dex */
public final class C93400aQG extends AppCompatTextView {
    public int LJLJL;
    public int LJLJLJ;

    public C93400aQG(Context context) {
        super(context, null);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        canvas.translate(this.LJLJLJ / 2, this.LJLJL / 2);
        super.draw(canvas);
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        int max = Math.max(measuredWidth, measuredHeight);
        if (measuredWidth > measuredHeight) {
            this.LJLJL = measuredWidth - measuredHeight;
            this.LJLJLJ = 0;
        } else {
            this.LJLJL = 0;
            this.LJLJLJ = measuredHeight - measuredWidth;
        }
        setMeasuredDimension(max, max);
    }
}
