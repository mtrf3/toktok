package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.HorizontalScrollView;
import java.util.LinkedHashMap;

/* renamed from: X.5Ci, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C131045Ci extends HorizontalScrollView {
    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent != null && motionEvent.getAction() == 0) {
            getParent().requestDisallowInterceptTouchEvent(true);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C131045Ci(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        new LinkedHashMap();
    }
}
