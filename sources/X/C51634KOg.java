package X;

import Y.AUListenerS96S0100000_8;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.WindowManager;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.FrameLayout;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.KOg, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public class C51634KOg extends FrameLayout {
    public int LJLIL;
    public int LJLILLLLZI;
    public float LJLJI;
    public float LJLJJI;
    public boolean LJLJJL;
    public boolean LJLJJLL;
    public final WindowManager.LayoutParams LJLJL;
    public int LJLJLJ;
    public int LJLJLLL;
    public int LJLL;
    public final AnimatorSet LJLLI;

    public final void LIZ() {
        WindowManager windowManager;
        if (this.LJLJJL) {
            return;
        }
        if (this.LJLLI.isStarted()) {
            this.LJLLI.cancel();
        }
        if (getParent() != null && (windowManager = getWindowManager()) != null) {
            C51639KOl.LIZIZ(new Object[]{this});
            windowManager.removeView(this);
        }
        this.LJLJJL = true;
    }

    public final void LIZIZ() {
        if (!this.LJLJJL) {
            return;
        }
        this.LJLJJL = false;
        this.LJLJL.token = null;
        WindowManager windowManager = getWindowManager();
        if (windowManager != null) {
            WindowManager.LayoutParams layoutParams = this.LJLJL;
            C51639KOl.LIZ(new Object[]{this, layoutParams});
            windowManager.addView(this, layoutParams);
        }
    }

    private final WindowManager getWindowManager() {
        Activity LJIILL = C78949Uyf.LJIILL(getContext());
        if (LJIILL != null) {
            return LJIILL.getWindowManager();
        }
        return null;
    }

    public final void LIZJ() {
        WindowManager windowManager;
        if (getParent() != null && (windowManager = getWindowManager()) != null) {
            windowManager.updateViewLayout(this, this.LJLJL);
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        Integer num;
        int i;
        int LJJII;
        if (motionEvent != null) {
            num = Integer.valueOf(motionEvent.getAction());
        } else {
            num = null;
        }
        if (num != null) {
            if (num.intValue() == 0) {
                WindowManager.LayoutParams layoutParams = this.LJLJL;
                this.LJLIL = layoutParams.x;
                this.LJLILLLLZI = layoutParams.y;
                this.LJLJI = motionEvent.getRawX();
                this.LJLJJI = motionEvent.getRawY();
            } else if (num != null) {
                if (num.intValue() == 2) {
                    if (Math.abs(motionEvent.getRawX() - this.LJLJI) > C7MY.LIZIZ(10) || Math.abs(motionEvent.getRawY() - this.LJLJJI) > C7MY.LIZIZ(10)) {
                        this.LJLJJLL = true;
                        this.LJLJL.x = (int) ((motionEvent.getRawX() + this.LJLIL) - this.LJLJI);
                        this.LJLJL.y = (int) ((motionEvent.getRawY() + this.LJLILLLLZI) - this.LJLJJI);
                        LIZJ();
                    }
                } else if (num.intValue() == 1) {
                    if (this.LJLJJLL) {
                        if (this.LJLLI.isStarted()) {
                            this.LJLLI.cancel();
                        }
                        Activity LJIILL = C78949Uyf.LJIILL(getContext());
                        if (LJIILL != null) {
                            WindowManager.LayoutParams layoutParams2 = this.LJLJL;
                            float f = layoutParams2.x;
                            float f2 = layoutParams2.y;
                            int LJJIIZ = O6R.LJJIIZ(C32151Nz.LJIIZILJ(Double.valueOf(C45804HyK.LJJJLIIL(LJIILL, Double.valueOf(C45804HyK.LJJIJ(LJIILL))))));
                            int height = getHeight() + this.LJLJL.y;
                            int i2 = this.LJLL;
                            if (height + i2 > LJJIIZ) {
                                i = (LJJIIZ - i2) - getHeight();
                            } else {
                                i = this.LJLJL.y;
                                int i3 = this.LJLJLLL;
                                if (i < i3) {
                                    i = i3;
                                }
                            }
                            Context context = getContext();
                            o.LJIIIIZZ(context, "context");
                            if (!C26338AVi.LIZJ(context)) {
                                LJJII = this.LJLJLJ;
                            } else {
                                Context context2 = getContext();
                                o.LJIIIIZZ(context2, "context");
                                LJJII = (C32151Nz.LJJII(context2) - this.LJLJLJ) - getWidth();
                            }
                            ValueAnimator ofInt = ValueAnimator.ofInt((int) f2, i);
                            ofInt.addUpdateListener(new AUListenerS96S0100000_8(this, 9));
                            ofInt.setInterpolator(new AccelerateDecelerateInterpolator());
                            ValueAnimator ofInt2 = ValueAnimator.ofInt((int) f, LJJII);
                            ofInt2.addUpdateListener(new AUListenerS96S0100000_8(this, 10));
                            ofInt2.setInterpolator(new AccelerateDecelerateInterpolator());
                            AnimatorSet animatorSet = this.LJLLI;
                            animatorSet.setDuration(300L);
                            animatorSet.playTogether(ofInt2, ofInt);
                            animatorSet.start();
                        }
                    }
                    this.LJLJJLL = false;
                }
            }
        }
        return true;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C51634KOg(ActivityC45651qj context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        o.LJIIIZ(context, "context");
        new LinkedHashMap();
        this.LJLJJL = true;
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        layoutParams.type = 2;
        layoutParams.flags = 552;
        layoutParams.format = 1;
        layoutParams.gravity = 8388659;
        layoutParams.width = -2;
        layoutParams.height = -2;
        layoutParams.token = null;
        this.LJLJL = layoutParams;
        this.LJLLI = new AnimatorSet();
    }
}
