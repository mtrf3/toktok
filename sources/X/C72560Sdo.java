package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import com.zhiliaoapp.musically.R;

/* renamed from: X.Sdo, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public class C72560Sdo extends LinearLayout {
    public int LJLIL;

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
    }

    public void setRadius(int i) {
        this.LJLIL = i;
        if (getHeight() != 0 && getWidth() != 0) {
            int width = getWidth();
            int height = getHeight();
            if (this.LJLIL > 0) {
                setClipToOutline(true);
                setOutlineProvider(new C72443Sbv(this.LJLIL, width, height));
            }
        }
    }

    public C72560Sdo(Context context, AttributeSet attributeSet) {
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
