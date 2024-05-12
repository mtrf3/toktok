package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.widget.FrameLayout;
import defpackage.a1;
import kotlin.jvm.internal.o;

/* renamed from: X.0LD, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0LD extends FrameLayout {
    public float LJLIL;
    public float LJLILLLLZI;

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent e) {
        o.LJIIIZ(e, "e");
        int action = e.getAction();
        if (action != 0) {
            if (action == 2) {
                float x = e.getX() - this.LJLIL;
                float y = e.getY() - this.LJLILLLLZI;
                if ((!canScrollVertically(1) || !canScrollVertically(-1)) && Math.abs(x) < Math.abs(y)) {
                    requestDisallowInterceptTouchEvent(true);
                }
            }
        } else {
            this.LJLIL = e.getX();
            this.LJLILLLLZI = e.getY();
        }
        return super.onInterceptTouchEvent(e);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0LD(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        a1.LJFF(context, "context");
        ViewConfiguration.get(context).getScaledTouchSlop();
    }
}
