package X;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.util.Property;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS158S0100000_8;
import kotlin.jvm.internal.o;

/* renamed from: X.KTv, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51779KTv extends FrameLayout {
    public AnimatorSet LJLIL;
    public final C62822Ol8 LJLILLLLZI;

    private final C47121t6 getTextView() {
        Object value = this.LJLILLLLZI.getValue();
        o.LJIIIIZZ(value, "<get-textView>(...)");
        return (C47121t6) value;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        getTextView().LJJIJIL(R.style.oy);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, (Property<C51779KTv, Float>) View.ALPHA, 0.0f, 1.0f);
        ofFloat.setDuration(300L);
        ofFloat.setInterpolator(new LinearInterpolator());
        ValueAnimator ofFloat2 = ObjectAnimator.ofFloat(0.0f, 1.0f);
        ofFloat2.setDuration(8000L);
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(this, (Property<C51779KTv, Float>) View.ALPHA, 1.0f, 0.0f);
        ofFloat3.setDuration(300L);
        ofFloat3.setInterpolator(new LinearInterpolator());
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.play(ofFloat).before(ofFloat2);
        animatorSet.play(ofFloat3).after(ofFloat2);
        animatorSet.start();
        this.LJLIL = animatorSet;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        AnimatorSet animatorSet = this.LJLIL;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C51779KTv(Context context) {
        super(context, null, 0);
        new LinkedHashMap();
        this.LJLILLLLZI = C221108m2.LIZIZ(new AqS158S0100000_8(this, 2));
        C16880lQ.LLLLIILL(C16880lQ.LLZIL(context), R.layout.ddj, this, true);
    }
}
