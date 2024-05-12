package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import defpackage.a1;

/* renamed from: X.2Nv, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C57592Nv extends FrameLayout {
    public boolean LJLIL;

    public final boolean getIntercept() {
        return this.LJLIL;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.LJLIL) {
            return true;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    public final void setIntercept(boolean z) {
        this.LJLIL = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C57592Nv(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        a1.LJFF(context, "context");
    }
}
