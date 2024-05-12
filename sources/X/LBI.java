package X;

import Y.AUListenerS97S0100000_9;
import android.animation.ValueAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import com.bytedance.tux.icon.TuxIconView;
import com.zhiliaoapp.musically.R;
import defpackage.a1;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class LBI extends RelativeLayout {
    public TuxIconView LJLIL;
    public ValueAnimator LJLILLLLZI;
    public ValueAnimator LJLJI;
    public boolean LJLJJI;

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        View findViewById = findViewById(R.id.d45);
        o.LJIIIIZZ(findViewById, "findViewById(R.id.fake_u…_profile_navigator_image)");
        TuxIconView tuxIconView = (TuxIconView) findViewById;
        this.LJLIL = tuxIconView;
        tuxIconView.setAlpha(0.5f);
    }

    public final void LIZ(ValueAnimator valueAnimator) {
        Object animatedValue = valueAnimator.getAnimatedValue();
        o.LJII(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        float floatValue = ((Float) animatedValue).floatValue();
        TuxIconView tuxIconView = this.LJLIL;
        if (tuxIconView != null) {
            tuxIconView.setAlpha(floatValue);
        } else {
            o.LJIJI("iconImage");
            throw null;
        }
    }

    public final void setAnimationEnabled(boolean z) {
        this.LJLJJI = z;
    }

    public final void setImageResource(int i) {
        TuxIconView tuxIconView = this.LJLIL;
        if (tuxIconView != null) {
            tuxIconView.setIconRes(i);
        } else {
            o.LJIJI("iconImage");
            throw null;
        }
    }

    @Override // android.view.View
    public void setSelected(boolean z) {
        super.setSelected(z);
        ValueAnimator valueAnimator = this.LJLILLLLZI;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            ValueAnimator valueAnimator2 = this.LJLJI;
            if (valueAnimator2 != null) {
                valueAnimator2.cancel();
                if (z) {
                    if (this.LJLJJI) {
                        ValueAnimator valueAnimator3 = this.LJLILLLLZI;
                        if (valueAnimator3 != null) {
                            valueAnimator3.start();
                            return;
                        } else {
                            o.LJIJI("mSelectAnimator");
                            throw null;
                        }
                    }
                    return;
                }
                if (!this.LJLJJI) {
                    return;
                }
                ValueAnimator valueAnimator4 = this.LJLJI;
                if (valueAnimator4 != null) {
                    valueAnimator4.start();
                    return;
                } else {
                    o.LJIJI("mUnSelectAnimator");
                    throw null;
                }
            }
            o.LJIJI("mUnSelectAnimator");
            throw null;
        }
        o.LJIJI("mSelectAnimator");
        throw null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LBI(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        a1.LJFF(context, "context");
        this.LJLJJI = true;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.5f, 1.0f);
        o.LJIIIIZZ(ofFloat, "ofFloat(0.5f, 1f)");
        this.LJLILLLLZI = ofFloat;
        ofFloat.addUpdateListener(new AUListenerS97S0100000_9(this, 2));
        ValueAnimator valueAnimator = this.LJLILLLLZI;
        if (valueAnimator != null) {
            valueAnimator.setDuration(150L);
            ValueAnimator ofFloat2 = ValueAnimator.ofFloat(1.0f, 0.5f);
            o.LJIIIIZZ(ofFloat2, "ofFloat(1f, 0.5f)");
            this.LJLJI = ofFloat2;
            ofFloat2.addUpdateListener(new AUListenerS97S0100000_9(this, 3));
            ValueAnimator valueAnimator2 = this.LJLJI;
            if (valueAnimator2 != null) {
                valueAnimator2.setDuration(150L);
                return;
            } else {
                o.LJIJI("mUnSelectAnimator");
                throw null;
            }
        }
        o.LJIJI("mSelectAnimator");
        throw null;
    }
}
