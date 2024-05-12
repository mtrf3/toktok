package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import defpackage.a1;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.39h, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C792939h extends C45631qh {
    public InterfaceC88472Yns<? super MotionEvent, C76800UCe> LLIFFJFJJ;

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        Integer num;
        InterfaceC88472Yns<? super MotionEvent, C76800UCe> interfaceC88472Yns;
        List LJJIJIIJI = C47261Igj.LJJIJIIJI(0, 1);
        if (motionEvent != null) {
            num = Integer.valueOf(motionEvent.getAction());
        } else {
            num = null;
        }
        if (ORZ.LJLJJI(num, LJJIJIIJI) && motionEvent != null && (interfaceC88472Yns = this.LLIFFJFJJ) != null) {
            interfaceC88472Yns.invoke(motionEvent);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public final void setClickActionListener(InterfaceC88472Yns<? super MotionEvent, C76800UCe> listener) {
        o.LJIIIZ(listener, "listener");
        this.LLIFFJFJJ = listener;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C792939h(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a1.LJFF(context, "context");
    }
}
