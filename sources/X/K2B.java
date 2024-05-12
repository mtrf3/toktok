package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes9.dex */
public class K2B extends RecyclerView {
    public float LLLF;
    public float LLLFF;
    public float LLLFFI;
    public int LLLFZ;

    @Override // android.view.View
    public final boolean canScrollVertically(int i) {
        if (!((Boolean) DWB.LIZIZ.getValue()).booleanValue()) {
            return super.canScrollVertically(i);
        }
        if (i != -1) {
            return super.canScrollVertically(i);
        }
        C0A2 layoutManager = getLayoutManager();
        if (!(layoutManager instanceof LinearLayoutManager)) {
            return super.canScrollVertically(i);
        }
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
        int LLILL = linearLayoutManager.LLILL();
        int LLIL = linearLayoutManager.LLIL();
        View LJJIJIL = linearLayoutManager.LJJIJIL(0);
        if (LLILL == 1 && LLIL == 0 && (LJJIJIL instanceof MKT) && LJJIJIL.getHeight() == 0) {
            return false;
        }
        return super.canScrollVertically(i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        int actionIndex = motionEvent.getActionIndex();
        int i = 0;
        if (action != 0) {
            if (action != 2) {
                if (action != 5) {
                    if (action == 6) {
                        int actionIndex2 = motionEvent.getActionIndex();
                        if (motionEvent.getPointerId(actionIndex2) == this.LLLFZ) {
                            if (actionIndex2 == 0) {
                                i = 1;
                            }
                            this.LLLFZ = motionEvent.getPointerId(i);
                            this.LLLF = motionEvent.getX(i);
                            this.LLLFF = motionEvent.getY(i);
                        }
                    }
                } else {
                    this.LLLFZ = motionEvent.getPointerId(actionIndex);
                    this.LLLF = motionEvent.getX();
                    this.LLLFF = motionEvent.getY();
                }
            } else {
                int findPointerIndex = motionEvent.findPointerIndex(this.LLLFZ);
                float x = motionEvent.getX(findPointerIndex);
                float y = motionEvent.getY(findPointerIndex);
                float abs = Math.abs(x - this.LLLF);
                float abs2 = Math.abs(y - this.LLLFF);
                if (abs > this.LLLFFI && abs > abs2) {
                    return false;
                }
            }
        } else {
            this.LLLFZ = motionEvent.getPointerId(0);
            this.LLLF = motionEvent.getX();
            this.LLLFF = motionEvent.getY();
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    public K2B(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.LLLFZ = -1;
        this.LLLFFI = ViewConfiguration.get(context).getScaledTouchSlop();
    }
}
