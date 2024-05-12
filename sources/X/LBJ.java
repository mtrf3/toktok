package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.RelativeLayout;
import defpackage.a1;

/* loaded from: classes10.dex */
public final class LBJ extends RelativeLayout {
    public LBK LJLIL;

    public final LBK getTouchListener() {
        return this.LJLIL;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        LBK lbk;
        if (motionEvent != null && motionEvent.getAction() == 1 && (lbk = this.LJLIL) != null) {
            lbk.LIZ();
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    public final void setTouchListener(LBK lbk) {
        this.LJLIL = lbk;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LBJ(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        a1.LJFF(context, "context");
    }
}
