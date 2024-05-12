package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.zhiliaoapp.musically.R;

/* renamed from: X.Sdn, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public class C72559Sdn extends FrameLayout {
    public int LJLIL;

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
    }

    public void setRadius(int i) {
        this.LJLIL = i;
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        if (this.LJLIL > 0) {
            setClipToOutline(true);
            setOutlineProvider(new C72443Sbv(this.LJLIL, measuredWidth, measuredHeight));
        }
    }

    public C72559Sdn(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, new int[]{R.attr.b9d}, 0, 0);
        if (obtainStyledAttributes.hasValue(0)) {
            this.LJLIL = obtainStyledAttributes.getDimensionPixelOffset(0, 0);
        }
        obtainStyledAttributes.recycle();
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (this.LJLIL > 0) {
            setClipToOutline(true);
            setOutlineProvider(new C72443Sbv(this.LJLIL, i, i2));
        }
    }
}
