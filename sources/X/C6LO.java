package X;

import Y.AUListenerS91S0100000_2;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.zhiliaoapp.musically.R;
import defpackage.a1;
import kotlin.jvm.internal.o;

/* renamed from: X.6LO, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C6LO extends FrameLayout {
    public final ImageView LJLIL;
    public final InterfaceC135405Tc LJLILLLLZI;
    public final ValueAnimator LJLJI;
    public final ValueAnimator LJLJJI;

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.LJLJI.isRunning()) {
            this.LJLJI.end();
        }
        if (this.LJLJJI.isRunning()) {
            this.LJLJJI.end();
        }
    }

    public final void setBgColorDrawable(Drawable drawable) {
        this.LJLIL.setBackground(drawable);
    }

    public final void setBgColorRes(int i) {
        ImageView imageView = this.LJLIL;
        TDY tdy = new TDY();
        tdy.LIZIZ(i);
        tdy.LIZLLL(1);
        imageView.setBackground(tdy.LIZ());
    }

    public final void setRecordingTintRes(int i) {
        InterfaceC135405Tc interfaceC135405Tc = this.LJLILLLLZI;
        if (interfaceC135405Tc != null) {
            interfaceC135405Tc.setRecordingTintRes(i);
        }
    }

    public final void setStopTintColorRes(int i) {
        InterfaceC135405Tc interfaceC135405Tc = this.LJLILLLLZI;
        if (interfaceC135405Tc != null) {
            interfaceC135405Tc.setStopTintColorRes(i);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6LO(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        a1.LJFF(context, "context");
        ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.72f);
        this.LJLJI = ofFloat;
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.72f, 1.0f);
        this.LJLJJI = ofFloat2;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.ahy, R.attr.ahz, R.attr.b7d}, 0, 0);
        o.LJIIIIZZ(obtainStyledAttributes, "context.obtainStyledAttr…,\n            0\n        )");
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(0, (int) KL2.LIZJ(context, 20.0f));
        int color = obtainStyledAttributes.getColor(2, AnonymousClass636.LJIIIIZZ(R.attr.eb, context));
        int i = obtainStyledAttributes.getInt(1, 1);
        obtainStyledAttributes.recycle();
        ImageView imageView = new ImageView(context);
        this.LJLIL = imageView;
        TDY tdy = new TDY();
        tdy.LIZIZ(color);
        tdy.LIZLLL(1);
        imageView.setBackground(tdy.LIZ());
        addView(imageView, new FrameLayout.LayoutParams(-1, -1));
        if (i != 1) {
            if (i == 2) {
                this.LJLILLLLZI = new C2314296k(context, dimensionPixelSize);
            }
        } else {
            this.LJLILLLLZI = new C6LQ(context, dimensionPixelSize);
        }
        Object obj = this.LJLILLLLZI;
        if (obj != null) {
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(dimensionPixelSize, dimensionPixelSize);
            layoutParams.gravity = 17;
            addView((View) obj, layoutParams);
        }
        ofFloat.addUpdateListener(new AUListenerS91S0100000_2(this, 0));
        ofFloat2.addUpdateListener(new AUListenerS91S0100000_2(this, 1));
    }
}
