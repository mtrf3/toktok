package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import defpackage.a1;

/* renamed from: X.377, reason: invalid class name */
/* loaded from: classes2.dex */
public final class AnonymousClass377 extends FrameLayout {
    public boolean LJLIL;

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.LJLIL) {
            return true;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    public final void setInterceptTouchEvent(boolean z) {
        this.LJLIL = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnonymousClass377(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a1.LJFF(context, "context");
    }
}