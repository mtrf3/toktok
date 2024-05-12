package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import defpackage.a1;
import kotlin.jvm.internal.o;

/* renamed from: X.371, reason: invalid class name */
/* loaded from: classes2.dex */
public final class AnonymousClass371 extends FrameLayout {
    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent ev) {
        o.LJIIIZ(ev, "ev");
        if (ev.getAction() == 0) {
            getParent().requestDisallowInterceptTouchEvent(true);
        }
        return onTouchEvent(ev);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnonymousClass371(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a1.LJFF(context, "context");
    }
}
