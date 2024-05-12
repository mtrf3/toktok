package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.widget.ImageView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.6rh, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C173656rh extends ImageView {
    public final Path LJLIL;
    public final int LJLILLLLZI;

    @Override // android.widget.ImageView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C54339LUh.LIZ(this);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        if (this.LJLILLLLZI > 0) {
            Path path = this.LJLIL;
            RectF rectF = new RectF(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
            int i = this.LJLILLLLZI;
            path.addRoundRect(rectF, i, i, Path.Direction.CW);
            canvas.clipPath(this.LJLIL);
        }
        try {
            super.draw(canvas);
        } catch (Throwable unused) {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C173656rh(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        o.LJIIIZ(context, "context");
        this.LJLIL = new Path();
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, new int[]{R.attr.a94}, 0, 0);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        obtainStyledAttributes.recycle();
        this.LJLILLLLZI = dimensionPixelSize;
    }
}
