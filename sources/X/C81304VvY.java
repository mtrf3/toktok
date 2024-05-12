package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import defpackage.a1;
import kotlin.jvm.internal.o;

/* renamed from: X.VvY, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C81304VvY extends C81303VvX {
    @Override // X.C81303VvX, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent != null) {
            if (motionEvent.getAction() == 0) {
                this.LJLILLLLZI = motionEvent.getY();
            } else {
                if (motionEvent.getAction() == 2 && C1I1.LIZIZ(motionEvent, this.LJLILLLLZI) > 3.0f) {
                    float y = this.LJLILLLLZI - motionEvent.getY();
                    int scaledTouchSlop = ViewConfiguration.get(this.LJLIL).getScaledTouchSlop();
                    Context context = getContext();
                    o.LJIIIIZZ(context, "context");
                    if (y > scaledTouchSlop - C63081OpJ.LJJJJLI(context)) {
                        return true;
                    }
                }
                return false;
            }
        }
        return false;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C81304VvY(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        a1.LJFF(context, "context");
    }
}
