package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.RelativeLayout;
import com.zhiliaoapp.musically.R;
import defpackage.a1;
import kotlin.jvm.internal.o;

/* renamed from: X.36u, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C786436u extends RelativeLayout {
    public InterfaceC88472Yns<? super MotionEvent, Boolean> LJLIL;

    public final InterfaceC88472Yns<MotionEvent, Boolean> getMOnInterceptorHandler() {
        return this.LJLIL;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent ev) {
        o.LJIIIZ(ev, "ev");
        InterfaceC88472Yns<? super MotionEvent, Boolean> interfaceC88472Yns = this.LJLIL;
        if (interfaceC88472Yns != null) {
            interfaceC88472Yns.invoke(ev);
        }
        return super.dispatchTouchEvent(ev);
    }

    public final void setMOnInterceptorHandler(InterfaceC88472Yns<? super MotionEvent, Boolean> interfaceC88472Yns) {
        this.LJLIL = interfaceC88472Yns;
    }

    public final void setOnInterceptorHandler(InterfaceC88472Yns<? super MotionEvent, Boolean> block) {
        o.LJIIIZ(block, "block");
        this.LJLIL = block;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C786436u(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a1.LJFF(context, "context");
        C16880lQ.LLLLIILL(C16880lQ.LLZIL(context), R.layout.wc, this, true);
    }
}
