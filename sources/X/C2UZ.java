package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.constraintlayout.widget.ConstraintLayout;
import defpackage.a1;
import kotlin.jvm.internal.o;

/* renamed from: X.2UZ, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C2UZ extends ConstraintLayout {
    public boolean LJLIL;

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.LJLIL) {
            return true;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public final void setInterceptTouchEvent$im_base_release(boolean z) {
        this.LJLIL = z;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C2UZ(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        o.LJIIIZ(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2UZ(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        a1.LJFF(context, "context");
    }
}
