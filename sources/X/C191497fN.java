package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewConfiguration;

/* renamed from: X.7fN, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public class C191497fN extends C191487fM {
    public double LLLF;
    public double LLLFF;

    public C191497fN(Context context) {
        super(context);
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action == 2) {
                double abs = Math.abs(motionEvent.getX() - this.LLLF);
                double abs2 = Math.abs(motionEvent.getY() - this.LLLFF);
                if (abs > ViewConfiguration.get(getContext()).getScaledTouchSlop() && abs > abs2) {
                    return false;
                }
            }
        } else {
            this.LLLF = motionEvent.getX();
            this.LLLFF = motionEvent.getY();
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    public C191497fN(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
