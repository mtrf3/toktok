package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.RelativeLayout;

/* loaded from: classes8.dex */
public class I43 extends RelativeLayout {
    public I4T LJLIL;

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        I4T i4t = this.LJLIL;
        if (i4t != null) {
            i4t.LIZ();
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public void setNoBlockTouchListener(I4T i4t) {
        this.LJLIL = i4t;
    }

    public I43(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
