package X;

import Y.ALAdapterS3S0100000_4;
import Y.ARunnableS40S0100000_4;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.animation.Interpolator;
import android.view.animation.PathInterpolator;
import android.widget.LinearLayout;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS154S0100000_4;
import kotlin.jvm.internal.o;

/* renamed from: X.95p, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2312195p extends LinearLayout {
    public final C62822Ol8 LJLIL;

    private final TuxTextView getIncreasePointsTextView() {
        return (TuxTextView) this.LJLIL.getValue();
    }

    public final void LIZ() {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, "alpha", 1.0f, 0.0f);
        ofFloat.setDuration(150L);
        ofFloat.setInterpolator(getAnimInterpolator());
        ofFloat.addListener(new ALAdapterS3S0100000_4(this, 1));
        ofFloat.start();
    }

    private final Interpolator getAnimInterpolator() {
        PathInterpolator LIZIZ = C18950ol.LIZIZ(0.25f, 0.0f, 0.25f, 1.0f);
        o.LJIIIIZZ(LIZIZ, "PathInterpolatorCompat.c…ate(0.25f, 0f, 0.25f, 1f)");
        return LIZIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2312195p(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        o.LJIIIZ(context, "context");
        this.LJLIL = C221108m2.LIZIZ(new AqS154S0100000_4(this, 1069));
        LinearLayout.inflate(context, R.layout.csy, this);
        setGravity(16);
    }

    public static void LIZIZ(C2312195p c2312195p, String content) {
        c2312195p.getClass();
        o.LJIIIZ(content, "content");
        c2312195p.getIncreasePointsTextView().setText(content);
        c2312195p.setVisibility(0);
        AnimatorSet animatorSet = new AnimatorSet();
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(c2312195p, "alpha", 0.0f, 1.0f);
        ofFloat.setDuration(335L);
        ofFloat.setInterpolator(c2312195p.getAnimInterpolator());
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(c2312195p, "translationY", C32151Nz.LJIIZILJ(36), 0.0f);
        ofFloat2.setDuration(335L);
        ofFloat2.setInterpolator(c2312195p.getAnimInterpolator());
        animatorSet.playTogether(ofFloat, ofFloat2);
        animatorSet.start();
        c2312195p.setTranslationY(0.0f);
        c2312195p.postDelayed(new ARunnableS40S0100000_4(c2312195p, 96), 5000L);
    }
}
