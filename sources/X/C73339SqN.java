package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.OverScroller;
import defpackage.a1;
import java.lang.reflect.Field;
import kotlin.jvm.internal.o;

/* renamed from: X.SqN, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C73339SqN extends C45631qh {
    @Override // X.C45631qh, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent ev) {
        OverScroller overScroller;
        o.LJIIIZ(ev, "ev");
        if (ev.getAction() == 0) {
            computeScroll();
            if (!canScrollVertically(1) || !canScrollVertically(-1)) {
                try {
                    Field declaredField = C45631qh.class.getDeclaredField("LJLJI");
                    declaredField.setAccessible(true);
                    Object obj = declaredField.get(this);
                    if ((obj instanceof OverScroller) && (overScroller = (OverScroller) obj) != null) {
                        overScroller.forceFinished(true);
                    }
                } catch (Exception e) {
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("Error accessing mScroller field ");
                    LIZ.append(e);
                    C36922EeM.LIZLLL(4, "WorkaroundNestedScrollView", X1D.LIZIZ(LIZ));
                }
            }
        }
        return super.onInterceptTouchEvent(ev);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C73339SqN(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a1.LJFF(context, "context");
    }
}
