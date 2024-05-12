package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.o;

/* renamed from: X.aij, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C94545aij extends RecyclerView {
    public int LLLF;
    public int LLLFF;
    public final int LLLFFI;
    public int LLLFZ;

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent ev) {
        o.LJIIIZ(ev, "ev");
        try {
            int action = ev.getAction();
            int actionIndex = ev.getActionIndex();
            int i = 0;
            if (action != 0) {
                if (action != 2) {
                    if (action != 5) {
                        if (action == 6) {
                            int actionIndex2 = ev.getActionIndex();
                            if (ev.getPointerId(actionIndex2) == this.LLLFZ) {
                                if (actionIndex2 == 0) {
                                    i = 1;
                                }
                                this.LLLFZ = ev.getPointerId(i);
                                this.LLLF = (int) (ev.getX(i) + 0.5f);
                                this.LLLFF = (int) (ev.getY(i) + 0.5f);
                            }
                        }
                    } else {
                        this.LLLFZ = ev.getPointerId(actionIndex);
                        this.LLLF = (int) (ev.getX(actionIndex) + 0.5f);
                        this.LLLFF = (int) (ev.getY(actionIndex) + 0.5f);
                    }
                } else {
                    int findPointerIndex = ev.findPointerIndex(this.LLLFZ);
                    int x = (int) (ev.getX(findPointerIndex) + 0.5f);
                    int y = (int) (ev.getY(findPointerIndex) + 0.5f);
                    float abs = Math.abs(x - this.LLLF);
                    float abs2 = Math.abs(y - this.LLLFF);
                    if (abs > this.LLLFFI && abs > abs2) {
                        return false;
                    }
                }
            } else {
                this.LLLFZ = ev.getPointerId(0);
                this.LLLF = (int) (ev.getX() + 0.5f);
                this.LLLFF = (int) (ev.getY() + 0.5f);
            }
            return super.onInterceptTouchEvent(ev);
        } catch (Throwable unused) {
            return true;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C94545aij(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        o.LJIIIZ(context, "context");
        this.LLLFZ = -1;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        o.LJIIIIZZ(viewConfiguration, "ViewConfiguration.get(context)");
        this.LLLFFI = viewConfiguration.getScaledTouchSlop();
        setOverScrollMode(2);
        addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC13950gh());
    }
}
