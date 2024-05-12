package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatImageView;
import defpackage.a1;
import kotlin.jvm.internal.o;

/* renamed from: X.5CM, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C5CM extends AppCompatImageView {
    public float LJLIL;
    public final RectF LJLILLLLZI;
    public final Path LJLJI;

    @Override // android.widget.ImageView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C54339LUh.LIZ(this);
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onDraw(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        this.LJLILLLLZI.left = getPaddingLeft();
        this.LJLILLLLZI.right = getWidth() - getPaddingRight();
        this.LJLILLLLZI.top = getPaddingTop();
        this.LJLILLLLZI.bottom = getHeight() - getPaddingBottom();
        this.LJLJI.reset();
        Path path = this.LJLJI;
        RectF rectF = this.LJLILLLLZI;
        float f = this.LJLIL;
        path.addRoundRect(rectF, f, f, Path.Direction.CW);
        canvas.clipPath(this.LJLJI);
        super.onDraw(canvas);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C5CM(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        o.LJIIIZ(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5CM(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        a1.LJFF(context, "context");
        this.LJLIL = 10 * getResources().getDisplayMetrics().density;
        this.LJLILLLLZI = new RectF(0.0f, 0.0f, 0.0f, 0.0f);
        this.LJLJI = new Path();
    }
}
