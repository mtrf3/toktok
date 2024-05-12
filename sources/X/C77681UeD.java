package X;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.HorizontalScrollView;
import kotlin.jvm.internal.o;

/* renamed from: X.UeD, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C77681UeD extends HorizontalScrollView {
    public AnimatorSet LJLIL;
    public final long LJLILLLLZI;
    public boolean LJLJI;
    public InterfaceC77695UeR LJLJJI;

    private final int getOffset() {
        int width;
        View childAt = getChildAt(0);
        if (childAt == null || (width = childAt.getWidth()) <= 0) {
            return 0;
        }
        return width - getMeasuredWidth();
    }

    public final boolean LIZ() {
        if (getOffset() > 0) {
            return true;
        }
        return false;
    }

    public final void LIZIZ() {
        if (!LIZ()) {
            return;
        }
        int offset = getOffset();
        ObjectAnimator ofInt = ObjectAnimator.ofInt(this, "scrollX", offset);
        ObjectAnimator ofInt2 = ObjectAnimator.ofInt(this, "scrollX", -offset);
        AnimatorSet animatorSet = new AnimatorSet();
        this.LJLIL = animatorSet;
        animatorSet.setDuration(this.LJLILLLLZI);
        animatorSet.playSequentially(ofInt, ofInt2);
        AnimatorSet animatorSet2 = this.LJLIL;
        if (animatorSet2 != null) {
            animatorSet2.start();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        AnimatorSet animatorSet = this.LJLIL;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.LJLIL = null;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public final void setOnScrollEndListener(InterfaceC77695UeR l) {
        o.LJIIIZ(l, "l");
        this.LJLJJI = l;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C77681UeD(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C04560Fw.LIZ(context, "context", attributeSet, "attrs");
        this.LJLILLLLZI = 1000L;
    }

    @Override // android.view.View
    public final void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        if (getOffset() - getScrollX() == 0) {
            if (!this.LJLJI) {
                this.LJLJI = true;
                InterfaceC77695UeR interfaceC77695UeR = this.LJLJJI;
                if (interfaceC77695UeR != null) {
                    interfaceC77695UeR.LIZ(true);
                    return;
                }
                return;
            }
            return;
        }
        if (!this.LJLJI) {
            return;
        }
        this.LJLJI = false;
        InterfaceC77695UeR interfaceC77695UeR2 = this.LJLJJI;
        if (interfaceC77695UeR2 == null) {
            return;
        }
        interfaceC77695UeR2.LIZ(false);
    }
}
