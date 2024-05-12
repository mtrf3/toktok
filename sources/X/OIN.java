package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.RelativeLayout;
import defpackage.a1;

/* loaded from: classes11.dex */
public final class OIN extends RelativeLayout {
    public OM3 LJLIL;

    public final OM3 getBackgroundTouchListener() {
        return this.LJLIL;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        OM3 om3;
        OM3 om32 = this.LJLIL;
        if (om32 != null && om32.LIZIZ() && (om3 = this.LJLIL) != null) {
            om3.LIZJ(motionEvent);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public final void setBackgroundTouchListener(OM3 om3) {
        this.LJLIL = om3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OIN(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a1.LJFF(context, "context");
    }
}
