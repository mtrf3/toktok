package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;

/* renamed from: X.6JM, reason: invalid class name */
/* loaded from: classes3.dex */
public class C6JM extends T5T {
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

    public void setMode(boolean z) {
        this.LJLJJLL = z;
    }

    public C6JM(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
