package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import defpackage.a1;

/* renamed from: X.8ne, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C222108ne extends C80766Vms {
    public boolean LLJJJIL;

    public final boolean getAllowScroll() {
        return this.LLJJJIL;
    }

    @Override // X.C80769Vmv, android.view.View
    public final boolean canScrollHorizontally(int i) {
        if (this.LLJJJIL) {
            return super.canScrollHorizontally(i);
        }
        return false;
    }

    @Override // android.view.View
    public final boolean canScrollVertically(int i) {
        if (this.LLJJJIL) {
            return super.canScrollVertically(i);
        }
        return false;
    }

    @Override // X.C80766Vms, X.C80769Vmv, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.LLJJJIL) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        return false;
    }

    @Override // X.C80766Vms, X.C80769Vmv, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.LLJJJIL) {
            return super.onTouchEvent(motionEvent);
        }
        return false;
    }

    public final void setAllowScroll(boolean z) {
        this.LLJJJIL = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C222108ne(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a1.LJFF(context, "context");
        this.LLJJJIL = true;
    }
}
