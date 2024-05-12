package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;

/* renamed from: X.COl, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C31255COl extends RunnableC31065CHd {
    public View.OnTouchListener LLLIIIIL;
    public boolean LLLIIIL;

    @Override // android.view.View
    public float getBottomFadingEdgeStrength() {
        if (canScrollVertically(1) || this.LLLIIIL) {
            return 1.0f;
        }
        return 0.0f;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        View.OnTouchListener onTouchListener = this.LLLIIIIL;
        if (onTouchListener != null) {
            onTouchListener.onTouch(this, motionEvent);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public void setOnDispatchTouchEventListener(View.OnTouchListener onTouchListener) {
        this.LLLIIIIL = onTouchListener;
    }

    public C31255COl(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public C31255COl(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC13950gh());
    }
}
