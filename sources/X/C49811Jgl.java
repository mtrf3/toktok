package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewConfiguration;

/* renamed from: X.Jgl, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public class C49811Jgl extends C45738HxG {
    public int LLLF;
    public int LLLFF;
    public int LLLFFI;
    public int LLLFZ;

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z;
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked != 0) {
            if (actionMasked != 2) {
                if (actionMasked != 5) {
                    return super.onInterceptTouchEvent(motionEvent);
                }
                this.LLLF = motionEvent.getPointerId(actionIndex);
                this.LLLFF = (int) (motionEvent.getX(actionIndex) + 0.5f);
                this.LLLFFI = (int) (motionEvent.getY(actionIndex) + 0.5f);
                return super.onInterceptTouchEvent(motionEvent);
            }
            int findPointerIndex = motionEvent.findPointerIndex(this.LLLF);
            if (findPointerIndex < 0) {
                return false;
            }
            int x = (int) (motionEvent.getX(findPointerIndex) + 0.5f);
            int y = (int) (motionEvent.getY(findPointerIndex) + 0.5f);
            if (getScrollState() != 1) {
                int i = x - this.LLLFF;
                int i2 = y - this.LLLFFI;
                boolean LJIJJLI = getLayoutManager().LJIJJLI();
                boolean LJIL = getLayoutManager().LJIL();
                if (LJIJJLI && Math.abs(i) > this.LLLFZ) {
                    if (Math.abs(i) < Math.abs(i2) && !LJIL) {
                        return false;
                    }
                    z = true;
                } else {
                    z = false;
                }
                if (((!LJIL || Math.abs(i2) <= this.LLLFZ || (Math.abs(i2) < Math.abs(i) && !LJIJJLI)) && !z) || !super.onInterceptTouchEvent(motionEvent)) {
                    return false;
                }
                return true;
            }
            return super.onInterceptTouchEvent(motionEvent);
        }
        this.LLLF = motionEvent.getPointerId(0);
        this.LLLFF = (int) (motionEvent.getX() + 0.5f);
        this.LLLFFI = (int) (motionEvent.getY() + 0.5f);
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public void setScrollingTouchSlop(int i) {
        super.setScrollingTouchSlop(i);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        if (i != 0) {
            if (i != 1) {
                return;
            }
            this.LLLFZ = viewConfiguration.getScaledPagingTouchSlop();
            return;
        }
        this.LLLFZ = viewConfiguration.getScaledTouchSlop();
    }

    public C49811Jgl(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LLLF = -1;
        this.LLLFZ = ViewConfiguration.get(getContext()).getScaledTouchSlop();
        addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC13950gh());
    }
}
