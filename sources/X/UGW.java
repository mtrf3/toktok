package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.FrameLayout;

/* loaded from: classes14.dex */
public class UGW extends FrameLayout {
    public UGX LJLIL;

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        UGX ugx = this.LJLIL;
        if (ugx != null) {
            ugx.LJJJJ(motionEvent);
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        UGX ugx = this.LJLIL;
        if (ugx != null) {
            ugx.LIZ();
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setIntercepter(UGX ugx) {
        this.LJLIL = ugx;
    }

    public UGW(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
