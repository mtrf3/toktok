package X;

import Y.ACListenerS34S0100000_14;
import Y.AUListenerS101S0100000_14;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import com.zhiliaoapp.musically.R;
import defpackage.a1;
import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public final class W1W extends FrameLayout {
    public int LJLIL;
    public float LJLILLLLZI;
    public float LJLJI;
    public float LJLJJI;
    public int LJLJJL;
    public int LJLJJLL;
    public W1X LJLJL;
    public final View LJLJLJ;
    public final LinearLayout LJLJLLL;
    public final ValueAnimator LJLL;
    public final ACListenerS34S0100000_14 LJLLI;

    public final LinearLayout getContainer() {
        return this.LJLJLLL;
    }

    public final int getItemTextNormalColor() {
        return this.LJLJJL;
    }

    public final int getItemTextSelectColor() {
        return this.LJLJJLL;
    }

    public final float getItemTextSize() {
        return this.LJLJJI;
    }

    public final void setItemTextNormalColor(int i) {
        this.LJLJJL = i;
    }

    public final void setItemTextSelectColor(int i) {
        this.LJLJJLL = i;
    }

    public final void setItemTextSize(float f) {
        this.LJLJJI = f;
    }

    public final void setOnItemChangeListener(W1X listener) {
        o.LJIIIZ(listener, "listener");
        this.LJLJL = listener;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public W1W(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        a1.LJFF(context, "context");
        this.LJLIL = -1;
        View view = new View(context);
        C278517l.LIZIZ(-1, -1, view);
        this.LJLJLJ = view;
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        this.LJLJLLL = linearLayout;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.setDuration(10L);
        ofFloat.addUpdateListener(new AUListenerS101S0100000_14(this, 30));
        this.LJLL = ofFloat;
        this.LJLLI = new ACListenerS34S0100000_14(this, 84);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.ajl, R.attr.ajn, R.attr.ajp, R.attr.ajq}, 0, 0);
        o.LJIIIIZZ(obtainStyledAttributes, "context.obtainStyledAttr…ioGroup, defStyleAttr, 0)");
        Drawable drawable = obtainStyledAttributes.getDrawable(0);
        this.LJLJJI = obtainStyledAttributes.getDimension(3, 0.0f);
        this.LJLJJL = -1;
        this.LJLJJLL = -16777216;
        obtainStyledAttributes.recycle();
        view.setBackground(drawable);
        addView(view);
        addView(linearLayout);
    }

    public final void LIZ(int i, View view) {
        if (view != null && (view instanceof TextView) && this.LJLJJLL != -1) {
            ((TextView) view).setTextColor(i);
        }
    }

    public final void LIZIZ(int i, String newSpeed) {
        o.LJIIIZ(newSpeed, "newSpeed");
        View childAt = this.LJLJLLL.getChildAt(i);
        o.LJII(childAt, "null cannot be cast to non-null type android.widget.TextView");
        ((TextView) childAt).setText(newSpeed);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        measureChild(this.LJLJLJ, View.MeasureSpec.makeMeasureSpec(((View.MeasureSpec.getSize(i) - getPaddingLeft()) - getPaddingRight()) / this.LJLJLLL.getChildCount(), LiveLayoutPreloadThreadPriority.DEFAULT), i2);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        View childAt = this.LJLJLLL.getChildAt(this.LJLIL);
        if (childAt != null) {
            this.LJLJLJ.setX(childAt.getX());
        }
    }
}
