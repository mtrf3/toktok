package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import defpackage.a1;

/* renamed from: X.2QD, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C2QD extends FrameLayout {
    public float LJLIL;
    public Runnable LJLILLLLZI;

    public final float getDisAmount() {
        return this.LJLIL;
    }

    public final Runnable getOnDismiss() {
        return this.LJLILLLLZI;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        Runnable runnable;
        if (motionEvent != null) {
            try {
                if (motionEvent.getAction() == 0 && (runnable = this.LJLILLLLZI) != null) {
                    runnable.run();
                    return false;
                }
                return false;
            } catch (Exception e) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("SwipeUpGuideStrengthenLayout onTouchEvent error: ");
                LIZ.append(e);
                C78983UzD.LJIILL(X1D.LIZIZ(LIZ));
                return false;
            }
        }
        return false;
    }

    public final void setDisAmount(float f) {
        this.LJLIL = f;
    }

    public final void setOnDismiss(Runnable runnable) {
        this.LJLILLLLZI = runnable;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2QD(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        a1.LJFF(context, "context");
    }
}
