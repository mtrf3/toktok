package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.LinearLayout;
import defpackage.a1;

/* renamed from: X.2Uc, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C59222Uc extends LinearLayout {
    public boolean LJLIL;
    public View.OnTouchListener LJLILLLLZI;

    public final View.OnTouchListener getDispatchOnTouchListener() {
        return this.LJLILLLLZI;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        View.OnTouchListener onTouchListener;
        if (motionEvent != null && motionEvent.getAction() == 0) {
            this.LJLIL = false;
        }
        boolean dispatchTouchEvent = super.dispatchTouchEvent(motionEvent);
        if (dispatchTouchEvent && motionEvent != null && motionEvent.getAction() == 0) {
            this.LJLIL = true;
        }
        if (this.LJLIL && (onTouchListener = this.LJLILLLLZI) != null) {
            onTouchListener.onTouch(this, motionEvent);
        }
        return dispatchTouchEvent;
    }

    public final void setDispatchOnTouchListener(View.OnTouchListener onTouchListener) {
        this.LJLILLLLZI = onTouchListener;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C59222Uc(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a1.LJFF(context, "context");
    }
}
