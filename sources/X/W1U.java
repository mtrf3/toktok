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
public class W1U extends FrameLayout {
    public int LJLIL;
    public float LJLILLLLZI;
    public float LJLJI;
    public float LJLJJI;
    public int LJLJJL;
    public int LJLJJLL;
    public W1V LJLJL;
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

    public final void LIZ(String str) {
        View LLLLIILL = C16880lQ.LLLLIILL(C16880lQ.LLZIL(getContext()), R.layout.c_t, this.LJLJLLL, false);
        o.LJII(LLLLIILL, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView = (TextView) LLLLIILL;
        textView.setText(str);
        textView.setTextSize(0, this.LJLJJI);
        textView.setTextColor(this.LJLJJL);
        C16880lQ.LJIJI(textView, this.LJLLI);
        this.LJLJLLL.addView(textView);
    }

    public final void setCurrentItem(int i) {
        W1V w1v;
        if (i != this.LJLIL && (w1v = this.LJLJL) != null) {
            w1v.LIZ(i);
        }
        this.LJLIL = i;
        LIZIZ(this.LJLJJLL, this.LJLJLLL.getChildAt(i));
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

    public final void setOnItemChangeListener(W1V listener) {
        o.LJIIIZ(listener, "listener");
        this.LJLJL = listener;
    }

    public final void setSelectedItemBackground(Drawable drawable) {
        o.LJIIIZ(drawable, "drawable");
        this.LJLJLJ.setBackground(drawable);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public W1U(Context context, AttributeSet attributeSet) {
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
        ofFloat.setDuration(250L);
        ofFloat.addUpdateListener(new AUListenerS101S0100000_14(this, 53));
        this.LJLL = ofFloat;
        this.LJLLI = new ACListenerS34S0100000_14(this, 119);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.ajl, R.attr.ajn, R.attr.ajp, R.attr.ajq}, 0, 0);
        o.LJIIIIZZ(obtainStyledAttributes, "context.obtainStyledAttr…ioGroup, defStyleAttr, 0)");
        Drawable drawable = obtainStyledAttributes.getDrawable(0);
        this.LJLJJI = obtainStyledAttributes.getDimension(3, 0.0f);
        this.LJLJJL = obtainStyledAttributes.getColor(1, 0);
        this.LJLJJLL = obtainStyledAttributes.getColor(2, -1);
        obtainStyledAttributes.recycle();
        view.setBackground(drawable);
        addView(view);
        addView(linearLayout);
    }

    public final void LIZIZ(int i, View view) {
        if (view != null && (view instanceof TextView) && this.LJLJJLL != -1) {
            ((TextView) view).setTextColor(i);
        }
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
