package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.recyclerview.widget.RecyclerView;
import defpackage.a1;
import kotlin.jvm.internal.o;

/* renamed from: X.4Di, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C105824Di extends RecyclerView {
    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent ev) {
        o.LJIIIZ(ev, "ev");
        if (ev.getPointerCount() > 1) {
            requestDisallowInterceptTouchEvent(true);
        }
        return super.dispatchTouchEvent(ev);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C105824Di(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        a1.LJFF(context, "context");
        addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC13950gh());
    }
}
