package X;

import Y.AUListenerS101S0100000_14;
import Y.IDLListenerS199S0100000_14;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.cardview.widget.CardView;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import defpackage.a1;
import kotlin.jvm.internal.o;

/* renamed from: X.Vqw, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class ViewOnClickListenerC81018Vqw extends CardView implements View.OnClickListener {
    public final ImageView LJLJLJ;
    public final TuxTextView LJLJLLL;
    public boolean LJLL;
    public InterfaceC45885Hzd LJLLI;
    public final int LJLLILLLL;
    public final int LJLLJ;
    public final int LJLLL;
    public final Drawable LJLLLL;
    public final Drawable LJLLLLLL;
    public boolean LJLZ;
    public int LJZ;
    public int LJZI;
    public final C80390Vgo LJZL;
    public ValueAnimator LL;

    public final void LJ() {
        if (this.LL == null) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 100.0f);
            ofFloat.setDuration(150L);
            ofFloat.addUpdateListener(new AUListenerS101S0100000_14(this, 13));
            this.LL = ofFloat;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.LJLL = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.LJLL = false;
    }

    public final InterfaceC45885Hzd getOnModeChangeListener() {
        return this.LJLLI;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (!this.LJLZ) {
            LJ();
            ValueAnimator valueAnimator = this.LL;
            o.LJI(valueAnimator);
            if (valueAnimator.isRunning()) {
                return;
            }
            ValueAnimator valueAnimator2 = this.LL;
            o.LJI(valueAnimator2);
            valueAnimator2.start();
            return;
        }
        LJ();
        ValueAnimator valueAnimator3 = this.LL;
        o.LJI(valueAnimator3);
        if (valueAnimator3.isRunning()) {
            return;
        }
        ValueAnimator valueAnimator4 = this.LL;
        o.LJI(valueAnimator4);
        valueAnimator4.start();
    }

    public final void setOnModeChangeListener(InterfaceC45885Hzd interfaceC45885Hzd) {
        this.LJLLI = interfaceC45885Hzd;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewOnClickListenerC81018Vqw(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        a1.LJFF(context, "context");
        ImageView imageView = new ImageView(context);
        this.LJLJLJ = imageView;
        TuxTextView tuxTextView = new TuxTextView(context, null, 6, 0);
        this.LJLJLLL = tuxTextView;
        this.LJZL = new C80390Vgo();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.a7e, R.attr.b1m, R.attr.b1n, R.attr.b1o, R.attr.b1p}, 0, 0);
        o.LJIIIIZZ(obtainStyledAttributes, "context.obtainStyledAttr…ectView, defStyleAttr, 0)");
        int dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelOffset(0, 0);
        this.LJLLL = dimensionPixelOffset;
        this.LJLLILLLL = obtainStyledAttributes.getColor(1, 0);
        this.LJLLJ = obtainStyledAttributes.getColor(3, 0);
        this.LJLLLL = obtainStyledAttributes.getDrawable(2);
        Drawable drawable = obtainStyledAttributes.getDrawable(4);
        this.LJLLLLLL = drawable;
        obtainStyledAttributes.recycle();
        imageView.setLayoutParams(new FrameLayout.LayoutParams(dimensionPixelOffset, dimensionPixelOffset));
        imageView.setImageDrawable(drawable);
        imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        tuxTextView.setGravity(17);
        tuxTextView.setTuxFont(53);
        tuxTextView.setMaxLines(1);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -1);
        layoutParams.setMarginStart(dimensionPixelOffset);
        tuxTextView.setLayoutParams(layoutParams);
        tuxTextView.setText(tuxTextView.getResources().getString(R.string.i_s));
        if (C173636rf.LIZIZ(context)) {
            tuxTextView.setPadding(dimensionPixelOffset / 2, 0, 0, 0);
        } else {
            tuxTextView.setPadding(0, 0, dimensionPixelOffset / 2, 0);
        }
        Context context2 = tuxTextView.getContext();
        o.LJIIIIZZ(context2, "this.context");
        tuxTextView.setTextColor(AnonymousClass636.LJIIIIZZ(R.attr.go, context2));
        setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        addView(imageView);
        addView(tuxTextView);
        setOnClickListener(new ViewOnClickListenerC13880ga(this));
        setClipChildren(false);
        getViewTreeObserver().addOnGlobalLayoutListener(new IDLListenerS199S0100000_14(this, 4));
    }
}
