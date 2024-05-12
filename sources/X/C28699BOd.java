package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;

/* renamed from: X.BOd, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C28699BOd extends C29230Bda {
    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action == 1 || action == 3) {
                C73943T0h.LIZ().LIZIZ(new C08700Vu(1));
            }
        } else {
            C73943T0h.LIZ().LIZIZ(new C08700Vu(1));
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public C28699BOd(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
