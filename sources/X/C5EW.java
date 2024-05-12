package X;

import Y.ARunnableS0S0100001_2;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import androidx.appcompat.widget.AppCompatImageView;
import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import defpackage.a1;
import kotlin.jvm.internal.AqS152S0100000_2;
import kotlin.jvm.internal.o;

/* renamed from: X.5EW, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C5EW extends AppCompatImageView {
    public int LJLIL;
    public int LJLILLLLZI;
    public C5EV LJLJI;
    public final C62822Ol8 LJLJJI;
    public ViewGroup.MarginLayoutParams LJLJJL;
    public float LJLJJLL;

    public final ViewGroup.MarginLayoutParams getParams() {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        if (this.LJLJJL == null) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            } else {
                marginLayoutParams = null;
            }
            this.LJLJJL = marginLayoutParams;
        }
        return this.LJLJJL;
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C54339LUh.LIZ(this);
    }

    public final int getMaxStartMargin() {
        return this.LJLILLLLZI;
    }

    public final int getMinStartMargin() {
        return this.LJLIL;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        Integer num;
        float rawX;
        float f;
        if (motionEvent != null) {
            num = Integer.valueOf(motionEvent.getAction());
        } else {
            num = null;
        }
        if (num != null) {
            if (num.intValue() == 0) {
                this.LJLJJLL = motionEvent.getRawX();
                ViewPropertyAnimator animate = animate();
                animate.scaleX(1.1f);
                animate.scaleY(1.1f);
                animate.setDuration(50L);
                animate.start();
            } else if (num.intValue() == 2) {
                ViewGroup.MarginLayoutParams params = getParams();
                if (params == null) {
                    return true;
                }
                int marginStart = params.getMarginStart();
                if (((Boolean) this.LJLJJI.getValue()).booleanValue()) {
                    rawX = this.LJLJJLL;
                    f = motionEvent.getRawX();
                } else {
                    rawX = motionEvent.getRawX();
                    f = this.LJLJJLL;
                }
                params.setMarginStart(marginStart + ((int) (rawX - f)));
                params.setMarginStart(Math.max(this.LJLIL, params.getMarginStart()));
                params.setMarginStart(Math.min(this.LJLILLLLZI, params.getMarginStart()));
                setLayoutParams(params);
                this.LJLJJLL = motionEvent.getRawX();
                C5EV c5ev = this.LJLJI;
                if (c5ev != null) {
                    int marginStart2 = params.getMarginStart();
                    int i = this.LJLIL;
                    c5ev.LIZIZ((marginStart2 - i) / (this.LJLILLLLZI - i));
                }
            } else if (num.intValue() == 1 || num.intValue() == 3) {
                ViewPropertyAnimator animate2 = animate();
                animate2.scaleX(1.0f);
                animate2.scaleY(1.0f);
                animate2.setDuration(50L);
                animate2.start();
            }
        }
        return true;
    }

    public final void setMaxStartMargin(int i) {
        this.LJLILLLLZI = i;
    }

    public final void setMinStartMargin(int i) {
        this.LJLIL = i;
    }

    public final void setOnProgressChangedListener(C5EV onProgressChangedListener) {
        o.LJIIIZ(onProgressChangedListener, "onProgressChangedListener");
        this.LJLJI = onProgressChangedListener;
    }

    public final void setProgress(float f) {
        if (getParams() == null) {
            post(new ARunnableS0S0100001_2(this, f, 3));
            return;
        }
        ViewGroup.MarginLayoutParams params = getParams();
        if (params != null) {
            params.setMarginStart(this.LJLIL + ((int) ((this.LJLILLLLZI - r1) * f)));
        }
        setLayoutParams(getParams());
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C5EW(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        o.LJIIIZ(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5EW(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        a1.LJFF(context, "context");
        this.LJLIL = LiveLayoutPreloadThreadPriority.DEFAULT;
        this.LJLILLLLZI = Integer.MAX_VALUE;
        this.LJLJJI = C221108m2.LIZIZ(new AqS152S0100000_2(context, 592));
    }
}
