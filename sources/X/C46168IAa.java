package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.ScrollView;
import defpackage.a1;

/* renamed from: X.IAa, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C46168IAa extends ScrollView {
    public boolean LJLIL;

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (C38413F5t.LIZ("dispatchScrollViewTouchEvent")) {
            C35532Dx2.LIZLLL();
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.widget.ScrollView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        Integer valueOf;
        if (motionEvent != null && (valueOf = Integer.valueOf(motionEvent.getAction())) != null) {
            if (valueOf.intValue() == 0) {
                this.LJLIL = true;
            } else if (valueOf != null && (valueOf.intValue() == 3 || valueOf.intValue() == 1)) {
                this.LJLIL = false;
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    public final void setManuallyScrolling(boolean z) {
        this.LJLIL = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C46168IAa(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        a1.LJFF(context, "context");
    }
}
