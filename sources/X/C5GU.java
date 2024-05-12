package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.zhiliaoapp.musically.R;
import defpackage.a1;

/* renamed from: X.5GU, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C5GU extends FrameLayout {
    public float LJLIL;
    public final float[] LJLILLLLZI;
    public final RectF LJLJI;
    public final RectF LJLJJI;
    public final Path LJLJJL;

    public final float getRadius() {
        return this.LJLIL;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        if (canvas != null) {
            canvas.saveLayer(this.LJLJJI, null, 31);
            canvas.clipPath(this.LJLJJL);
        }
        super.dispatchDraw(canvas);
        if (canvas != null) {
            canvas.restore();
        }
    }

    public final void setRadius(float f) {
        this.LJLIL = f;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5GU(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        a1.LJFF(context, "context");
        this.LJLJI = new RectF();
        this.LJLJJI = new RectF();
        this.LJLJJL = new Path();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.b6h});
        this.LJLIL = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        C34B.LIZIZ("SimpleRoundCornerLayout", "radius: " + this.LJLIL);
        obtainStyledAttributes.recycle();
        float f = this.LJLIL;
        this.LJLILLLLZI = new float[]{f, f, f, f, f, f, f, f};
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        RectF rectF = this.LJLJI;
        rectF.left = getPaddingLeft();
        rectF.top = getPaddingTop();
        float f = i;
        rectF.right = f - getPaddingRight();
        float f2 = i2;
        rectF.bottom = f2 - getPaddingBottom();
        this.LJLJJI.set(0.0f, 0.0f, f, f2);
        this.LJLJJL.addRoundRect(this.LJLJI, this.LJLILLLLZI, Path.Direction.CW);
    }
}
