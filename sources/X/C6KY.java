package X;

import Y.AUListenerS91S0100000_2;
import android.animation.ValueAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import defpackage.a1;
import kotlin.jvm.internal.o;

/* renamed from: X.6KY, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C6KY extends FrameLayout {
    public ImageView LJLIL;
    public C6KZ LJLILLLLZI;
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6KY(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a1.LJFF(context, "context");
        ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.72f);
        this.LJLJI = ofFloat;
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.72f, 1.0f);
        this.LJLJJI = ofFloat2;
        ImageView imageView = new ImageView(getContext());
        this.LJLIL = imageView;
        imageView.setBackground(C78127UlP.LIZ(-16776961, -1, 0));
        View view = this.LJLIL;
        if (view != null) {
            addView(view, new FrameLayout.LayoutParams(-1, -1));
            Context context2 = getContext();
            o.LJIIIIZZ(context2, "context");
            this.LJLILLLLZI = new C6KZ(context2);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams((int) KL2.LIZJ(getContext(), 20.0f), (int) KL2.LIZJ(getContext(), 20.0f));
            layoutParams.topMargin = (int) KL2.LIZJ(getContext(), 26.0f);
            layoutParams.leftMargin = (int) KL2.LIZJ(getContext(), 26.0f);
            layoutParams.setMarginStart((int) KL2.LIZJ(getContext(), 26.0f));
            View view2 = this.LJLILLLLZI;
            if (view2 != null) {
                addView(view2, layoutParams);
                ofFloat.addUpdateListener(new AUListenerS91S0100000_2(this, 9));
                ofFloat2.addUpdateListener(new AUListenerS91S0100000_2(this, 10));
                return;
            }
            o.LJIJI("centerView");
            throw null;
        }
        o.LJIJI("bgView");
        throw null;
    }
}
