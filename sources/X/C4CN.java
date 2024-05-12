package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import androidx.recyclerview.widget.RecyclerView;
import defpackage.a1;
import kotlin.jvm.internal.o;

/* renamed from: X.4CN, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C4CN extends RecyclerView {
    public float LLLF;
    public float LLLFF;
    public Boolean LLLFFI;

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent ev) {
        boolean z;
        o.LJIIIZ(ev, "ev");
        ViewParent parent = getParent();
        int action = ev.getAction();
        if (action != 0) {
            boolean z2 = true;
            if (action == 1 || action == 2) {
                if (this.LLLFFI == null) {
                    float scaledTouchSlop = ViewConfiguration.get(getContext()).getScaledTouchSlop();
                    if (Math.abs(ev.getX() - this.LLLF) > scaledTouchSlop || Math.abs(ev.getY() - this.LLLFF) > scaledTouchSlop) {
                        if (Math.abs(ev.getX() - this.LLLF) >= Math.abs(ev.getY() - this.LLLFF)) {
                            z = true;
                        } else {
                            z = false;
                        }
                        this.LLLFFI = Boolean.valueOf(z);
                    }
                }
                if (parent != null) {
                    Boolean bool = this.LLLFFI;
                    if (bool != null) {
                        z2 = bool.booleanValue();
                    }
                    parent.requestDisallowInterceptTouchEvent(z2);
                }
            }
        } else {
            this.LLLF = ev.getX();
            this.LLLFF = ev.getY();
            this.LLLFFI = null;
        }
        return super.dispatchTouchEvent(ev);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4CN(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        a1.LJFF(context, "context");
        addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC13950gh());
    }
}
