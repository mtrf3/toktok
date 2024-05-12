package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import defpackage.a1;

/* loaded from: classes5.dex */
public final class AKK extends C45621qg {
    public boolean LLFII;

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.LLFII) {
            return true;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public final void setNoClick(boolean z) {
        this.LLFII = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AKK(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        a1.LJFF(context, "context");
    }
}
