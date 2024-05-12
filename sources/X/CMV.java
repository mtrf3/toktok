package X;

import android.content.Context;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;

/* loaded from: classes6.dex */
public class CMV extends C47121t6 {
    public boolean LJLLLL;
    public int LJLLLLLL;
    public int LJLZ;

    public final void LJJIJLIJ() {
        this.LJLLLL = false;
        setEllipsize(TextUtils.TruncateAt.MARQUEE);
        setSelected(true);
        setFocusable(true);
        setFocusableInTouchMode(true);
    }

    public final void LJJIL() {
        this.LJLLLL = true;
        setSelected(false);
        setFocusable(false);
        setFocusableInTouchMode(false);
    }

    @Override // android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    @Override // android.widget.TextView, android.view.View
    public float getLeftFadingEdgeStrength() {
        return 0.0f;
    }

    @Override // android.widget.TextView, android.view.View
    public float getRightFadingEdgeStrength() {
        return 0.0f;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onWindowFocusChanged(boolean z) {
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setSelected(false);
    }

    @Override // android.view.View
    public int getLayoutDirection() {
        return this.LJLLLLLL;
    }

    @Override // android.view.View
    public int getTextDirection() {
        return this.LJLZ;
    }

    public CMV(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.LJLLLL = true;
        this.LJLLLLLL = 1;
        this.LJLZ = 4;
        this.LJLLLLLL = CCJ.LIZ(getContext()) ? 1 : 0;
        this.LJLZ = CCJ.LIZ(getContext()) ? 4 : 3;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onFocusChanged(boolean z, int i, Rect rect) {
        super.onFocusChanged(z, i, rect);
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (!this.LJLLLL && ((getRight() - getLeft()) - getCompoundPaddingLeft()) - getCompoundPaddingRight() > 0) {
            setSelected(false);
            setEllipsize(TextUtils.TruncateAt.MARQUEE);
            setSelected(true);
            setFocusable(true);
            setFocusableInTouchMode(true);
        }
    }
}
