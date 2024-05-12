package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import java.util.LinkedHashMap;

/* renamed from: X.72r, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1794972r extends VW3 {
    public boolean LJLJL;

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.LJLJL) {
            return super.dispatchTouchEvent(motionEvent);
        }
        return true;
    }

    public final void setScrollable(boolean z) {
        this.LJLJL = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1794972r(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        new LinkedHashMap();
        this.LJLJL = true;
    }
}
