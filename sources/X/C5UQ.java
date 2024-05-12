package X;

import android.content.Context;
import android.view.MotionEvent;
import android.widget.HorizontalScrollView;

/* renamed from: X.5UQ, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C5UQ extends HorizontalScrollView {
    public boolean LJLIL;

    public C5UQ(Context context) {
        super(context);
        this.LJLIL = true;
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.LJLIL) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        return false;
    }

    public void setScrollable(boolean z) {
        this.LJLIL = z;
    }
}
