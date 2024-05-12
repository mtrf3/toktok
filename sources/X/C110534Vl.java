package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.FrameLayout;

/* renamed from: X.4Vl, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C110534Vl extends FrameLayout {
    public static final int LJLIL = C17N.LJIILL(8.0d);

    public C110534Vl(Context context) {
        super(context);
    }

    public final void LIZ(MotionEvent motionEvent) {
        if (motionEvent.getAction() != 0) {
            return;
        }
        motionEvent.getX();
        motionEvent.getY();
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        super.onInterceptTouchEvent(motionEvent);
        LIZ(motionEvent);
        return false;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        LIZ(motionEvent);
        return true;
    }

    public C110534Vl(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
