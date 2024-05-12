package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.recyclerview.widget.RecyclerView;
import defpackage.a1;
import kotlin.jvm.internal.o;

/* renamed from: X.4CM, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C4CM extends RecyclerView {
    public boolean LLLF;
    public C4CB LLLFF;

    public final C4CB getPopHelper() {
        return this.LLLFF;
    }

    public final boolean getSwipeEnabled() {
        return this.LLLF;
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent e) {
        boolean z;
        o.LJIIIZ(e, "e");
        int action = e.getAction();
        Boolean bool = null;
        if (action != 0) {
            if (action != 1) {
                if (action != 2) {
                    if (action != 3) {
                        bool = Boolean.FALSE;
                    }
                } else {
                    C4CB c4cb = this.LLLFF;
                    if (c4cb != null) {
                        bool = Boolean.valueOf(c4cb.LIZLLL(e));
                    }
                }
            }
            C4CB c4cb2 = this.LLLFF;
            if (c4cb2 != null) {
                bool = Boolean.valueOf(c4cb2.LIZIZ());
            }
        } else {
            C4CB c4cb3 = this.LLLFF;
            if (c4cb3 != null) {
                bool = Boolean.valueOf(c4cb3.LIZJ(e));
            }
        }
        boolean LJ = o.LJ(bool, Boolean.TRUE);
        if (this.LLLF && super.onInterceptTouchEvent(e)) {
            z = true;
            C4CB c4cb4 = this.LLLFF;
            if (c4cb4 != null) {
                c4cb4.LIZIZ();
            }
        } else {
            z = false;
        }
        if (LJ || z) {
            return true;
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public final boolean onTouchEvent(MotionEvent e) {
        o.LJIIIZ(e, "e");
        if (this.LLLF && super.onTouchEvent(e)) {
            return true;
        }
        return false;
    }

    public final void setPopHelper(C4CB c4cb) {
        this.LLLFF = c4cb;
    }

    public final void setSwipeEnabled(boolean z) {
        this.LLLF = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4CM(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        a1.LJFF(context, "context");
        this.LLLF = true;
        addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC13950gh());
    }
}
