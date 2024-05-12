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
import com.zhiliaoapp.musically.R;
import defpackage.a1;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public class U2K extends C1K4 {
    public final C74050T4k LJLJI;
    public final C74050T4k LJLJJI;
    public final AnimatorSet LJLJJL;
    public int LJLJJLL;

    public void setTextColor(int i) {
        this.LJLJI.setTextColor(i);
        this.LJLJJI.setTextColor(i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public U2K(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        a1.LJFF(context, "context");
        C16880lQ.LLLLIILL(C16880lQ.LLZIL(getContext()), R.layout.dj0, this, true);
        View findViewById = findViewById(R.id.mcm);
        o.LJIIIIZZ(findViewById, "findViewById(R.id.tv_number_1)");
        C74050T4k c74050T4k = (C74050T4k) findViewById;
        this.LJLJI = c74050T4k;
        View findViewById2 = findViewById(R.id.mcn);
        o.LJIIIIZZ(findViewById2, "findViewById(R.id.tv_number_2)");
        C74050T4k c74050T4k2 = (C74050T4k) findViewById2;
        this.LJLJJI = c74050T4k2;
        setClipChildren(false);
        AnimatorSet animatorSet = new AnimatorSet();
        this.LJLJJL = animatorSet;
        C83741Wtl c83741Wtl = new C83741Wtl(0.65f, 0.0f, 0.35f, 1.0f);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(c74050T4k, (Property<C74050T4k, Float>) View.ALPHA, 1.0f, 0.0f);
        ofFloat.setInterpolator(c83741Wtl);
        ofFloat.setDuration(500L);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(c74050T4k2, (Property<C74050T4k, Float>) View.ALPHA, 0.0f, 1.0f);
        ofFloat2.setInterpolator(c83741Wtl);
        ofFloat2.setDuration(500L);
        ValueAnimator ofFloat3 = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat3.setDuration(500L);
        ofFloat3.setInterpolator(c83741Wtl);
        ofFloat3.addUpdateListener(new AUListenerS100S0100000_13(this, 87));
        animatorSet.playTogether(ofFloat, ofFloat2, ofFloat3);
    }

    public final void LIZ(int i, boolean z) {
        if (z) {
            int i2 = this.LJLJJLL;
            if (i == i2) {
                return;
            }
            this.LJLJI.setText(String.valueOf(i2));
            this.LJLJJI.setText(String.valueOf(i));
            if (this.LJLJJL.isRunning()) {
                this.LJLJJL.cancel();
            }
            this.LJLJI.setTranslationY(0.0f);
            this.LJLJJI.setTranslationY(getMeasuredHeight());
            this.LJLJI.setAlpha(1.0f);
            this.LJLJJI.setAlpha(0.0f);
            this.LJLJJI.setVisibility(0);
            this.LJLJJL.start();
            this.LJLJJL.addListener(new IDAListenerS80S0100000_13(this, 6));
            this.LJLJJLL = i;
            return;
        }
        this.LJLJJLL = i;
        this.LJLJI.setText(String.valueOf(i));
        this.LJLJJI.setText(String.valueOf(i));
        if (this.LJLJJL.isRunning()) {
            this.LJLJJL.cancel();
        }
        this.LJLJI.setTranslationY(0.0f);
        this.LJLJI.setAlpha(1.0f);
        this.LJLJJI.setVisibility(8);
    }
}
