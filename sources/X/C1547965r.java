package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import defpackage.a1;

/* renamed from: X.65r, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1547965r extends T5T {
    public boolean LJLJJLL;
    public long LJLJL;

    @Override // android.widget.TextView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.LJLJJLL) {
            this.LJLJL = System.currentTimeMillis();
            return false;
        }
        return super.onTouchEvent(motionEvent);
    }

    public final void setMode(boolean z) {
        this.LJLJJLL = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1547965r(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        a1.LJFF(context, "context");
    }
}
