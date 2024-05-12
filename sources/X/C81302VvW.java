package X;

import Y.IDAListenerS5S0110000_14;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.VvW, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C81302VvW extends C81303VvX {
    public float LJLJLJ;

    public final void setWindowHeight(int i) {
    }

    @Override // X.C81303VvX, android.view.View
    public final boolean onTouchEvent(MotionEvent event) {
        o.LJIIIZ(event, "event");
        this.LJLJJL.addMovement(event);
        if (event.getAction() == 0) {
            this.LJLJLJ = 0.0f;
            this.LJLILLLLZI = event.getY();
        }
        boolean z = false;
        if (event.getAction() == 2) {
            View view = this.LJLJI;
            if ((view == null || view.getTranslationY() <= 0.0f) && !onInterceptTouchEvent(event)) {
                return false;
            }
            float min = Math.min(0.0f, event.getY() - this.LJLILLLLZI);
            if (this.LJLJLJ + min < 0.0f) {
                this.LJLJLJ = -min;
                setTranslationY(min);
            }
        } else if (event.getAction() == 1) {
            float translationY = getTranslationY();
            if (Math.abs(getTranslationY() / this.LJLJI.getHeight()) >= 0.2f) {
                z = true;
            }
            LIZ(translationY, z);
        }
        return true;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C81302VvW(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        new LinkedHashMap();
    }

    @Override // X.C81303VvX
    public final void LIZ(float f, boolean z) {
        long abs;
        this.LJLJJL.computeCurrentVelocity(2);
        long j = 300;
        if (z) {
            if (this.LJLJJL.getYVelocity() == 0.0f) {
                abs = 300;
            } else {
                abs = (getHeight() + f) / Math.abs(this.LJLJJL.getYVelocity());
            }
            this.LJLJJLL = ObjectAnimator.ofFloat(this, "translationY", f, -getHeight());
        } else {
            if (this.LJLJJL.getYVelocity() == 0.0f) {
                abs = 300;
            } else {
                abs = f / Math.abs(this.LJLJJL.getYVelocity());
            }
            this.LJLJJLL = ObjectAnimator.ofFloat(this, "translationY", f, 0.0f);
        }
        AnimatorSet animatorSet = new AnimatorSet();
        if (Math.abs(abs) <= 300) {
            j = Math.abs(abs);
        }
        animatorSet.setDuration(j);
        animatorSet.play(this.LJLJJLL);
        animatorSet.addListener(new IDAListenerS5S0110000_14(this, z, 1));
        animatorSet.start();
    }
}
