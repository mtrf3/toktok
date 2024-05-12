package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.widget.FrameLayout;

/* renamed from: X.T5s, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public class C74084T5s extends FrameLayout {
    public final C74082T5q LJLIL;

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        C74082T5q c74082T5q = this.LJLIL;
        if (c74082T5q.LJI > 0.0f) {
            canvas.saveLayer(c74082T5q.LIZIZ, null, 31);
        }
        super.draw(canvas);
        this.LJLIL.LIZ(canvas);
    }

    public void setRadius(int i) {
        this.LJLIL.LIZJ(i);
    }

    public C74084T5s(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, -1);
        C74082T5q c74082T5q = new C74082T5q();
        this.LJLIL = c74082T5q;
        c74082T5q.LIZIZ(this);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        C74082T5q c74082T5q = this.LJLIL;
        RectF rectF = c74082T5q.LIZIZ;
        if (rectF != null && c74082T5q.LJI > 0.0f) {
            rectF.set(0.0f, 0.0f, i, i2);
        }
    }
}
