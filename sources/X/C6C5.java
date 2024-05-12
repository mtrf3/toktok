package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import defpackage.a1;

/* renamed from: X.6C5, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C6C5 extends C19K {
    public boolean LJLJJLL;

    public final boolean getMCanTouchMoved() {
        return this.LJLJJLL;
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.LJLJJLL) {
            return false;
        }
        return super.onTouchEvent(motionEvent);
    }

    public final void setMCanTouchMoved(boolean z) {
        this.LJLJJLL = z;
    }

    public final void setMode(boolean z) {
        this.LJLJJLL = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6C5(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a1.LJFF(context, "context");
    }
}
