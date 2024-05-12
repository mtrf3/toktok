package X;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import defpackage.a1;

/* renamed from: X.2RZ, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C2RZ extends FrameLayout {
    public InterfaceC88472Yns<? super Integer, Boolean> LJLIL;

    public final InterfaceC88472Yns<Integer, Boolean> getCanVerticalScrollCallback() {
        return this.LJLIL;
    }

    @Override // android.view.View
    public final boolean canScrollVertically(int i) {
        InterfaceC88472Yns<? super Integer, Boolean> interfaceC88472Yns = this.LJLIL;
        if (interfaceC88472Yns == null) {
            return super.canScrollVertically(i);
        }
        return interfaceC88472Yns.invoke(Integer.valueOf(i)).booleanValue();
    }

    public final void setCanVerticalScrollCallback(InterfaceC88472Yns<? super Integer, Boolean> interfaceC88472Yns) {
        this.LJLIL = interfaceC88472Yns;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2RZ(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        a1.LJFF(context, "context");
    }
}
