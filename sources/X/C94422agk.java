package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import kotlin.jvm.internal.o;

/* renamed from: X.agk, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C94422agk extends C94152acO {
    @Override // X.C94152acO
    public final boolean LJI(MotionEvent e) {
        o.LJIIIZ(e, "e");
        return true;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C94422agk(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        o.LJIIIZ(context, "context");
        setMinHeight((int) (C116504hi.LIZ(context) * 0.88f));
        setMaxHeight((int) (C116504hi.LIZ(context) * 0.88f));
        setCriticalHeight(0);
        setCurrentHeight((int) (C116504hi.LIZ(context) * 0.88f));
    }
}
