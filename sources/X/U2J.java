package X;

import Y.AUListenerS100S0100000_13;
import Y.IDAListenerS80S0100000_13;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.widget.FrameLayout;
import com.zhiliaoapp.musically.R;
import defpackage.a1;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class U2J extends FrameLayout {
    public final C74049T4j LJLIL;
    public final C74049T4j LJLILLLLZI;
    public final AnimatorSet LJLJI;
    public int LJLJJI;

    public void setTextColor(int i) {
        this.LJLIL.setTextColor(i);
        this.LJLILLLLZI.setTextColor(i);
    }

    public final void setTextSize(float f) {
        C74049T4j c74049T4j = this.LJLIL;
        if (c74049T4j != null) {
            c74049T4j.setTextSize(f);
        }
        C74049T4j c74049T4j2 = this.LJLILLLLZI;
        if (c74049T4j2 == null) {
            return;
        }
        c74049T4j2.setTextSize(f);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public U2J(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        a1.LJFF(context, "context");
        C16880lQ.LLLLIILL(C16880lQ.LLZIL(getContext()), R.layout.dex, this, true);
        View findViewById = findViewById(R.id.mcm);
        o.LJIIIIZZ(findViewById, "findViewById(R.id.tv_number_1)");
        C74049T4j c74049T4j = (C74049T4j) findViewById;
        this.LJLIL = c74049T4j;
        View findViewById2 = findViewById(R.id.mcn);
        o.LJIIIIZZ(findViewById2, "findViewById(R.id.tv_number_2)");
        C74049T4j c74049T4j2 = (C74049T4j) findViewById2;
        this.LJLILLLLZI = c74049T4j2;
        setClipChildren(false);
        AnimatorSet animatorSet = new AnimatorSet();
        this.LJLJI = animatorSet;
        C83741Wtl c83741Wtl = new C83741Wtl(0.65f, 0.0f, 0.35f, 1.0f);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(c74049T4j, (Property<C74049T4j, Float>) View.ALPHA, 1.0f, 0.0f);
        ofFloat.setInterpolator(c83741Wtl);
        ofFloat.setDuration(500L);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(c74049T4j2, (Property<C74049T4j, Float>) View.ALPHA, 0.0f, 1.0f);
        ofFloat2.setInterpolator(c83741Wtl);
        ofFloat2.setDuration(500L);
        ValueAnimator ofFloat3 = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat3.setDuration(500L);
        ofFloat3.setInterpolator(c83741Wtl);
        ofFloat3.addUpdateListener(new AUListenerS100S0100000_13(this, 103));
        animatorSet.playTogether(ofFloat, ofFloat2, ofFloat3);
    }

    public final void LIZ(int i, boolean z) {
        if (z) {
            int i2 = this.LJLJJI;
            if (i == i2) {
                return;
            }
            this.LJLIL.setText(String.valueOf(i2));
            this.LJLILLLLZI.setText(String.valueOf(i));
            if (this.LJLJI.isRunning()) {
                this.LJLJI.cancel();
            }
            this.LJLIL.setTranslationY(0.0f);
            this.LJLILLLLZI.setTranslationY(getMeasuredHeight());
            this.LJLIL.setAlpha(1.0f);
            this.LJLILLLLZI.setAlpha(0.0f);
            this.LJLILLLLZI.setVisibility(0);
            this.LJLJI.start();
            this.LJLJI.addListener(new IDAListenerS80S0100000_13(this, 3));
            this.LJLJJI = i;
            return;
        }
        this.LJLJJI = i;
        this.LJLIL.setText(String.valueOf(i));
        this.LJLILLLLZI.setText(String.valueOf(i));
        if (this.LJLJI.isRunning()) {
            this.LJLJI.cancel();
        }
        this.LJLIL.setTranslationY(0.0f);
        this.LJLIL.setAlpha(1.0f);
        this.LJLILLLLZI.setVisibility(8);
    }
}
