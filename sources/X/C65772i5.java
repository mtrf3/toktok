package X;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import defpackage.a1;

/* renamed from: X.2i5, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C65772i5 extends LinearLayout {
    public InterfaceC88474Ynu<? super Integer, ? super Integer, ? super Integer, ? super Integer, C76800UCe> LJLIL;

    public final void setOnSizeChangedListener(InterfaceC88474Ynu<? super Integer, ? super Integer, ? super Integer, ? super Integer, C76800UCe> interfaceC88474Ynu) {
        this.LJLIL = interfaceC88474Ynu;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C65772i5(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        a1.LJFF(context, "context");
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        InterfaceC88474Ynu<? super Integer, ? super Integer, ? super Integer, ? super Integer, C76800UCe> interfaceC88474Ynu = this.LJLIL;
        if (interfaceC88474Ynu != null) {
            interfaceC88474Ynu.invoke(Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4));
        }
    }
}
