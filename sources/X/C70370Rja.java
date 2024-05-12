package X;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.HorizontalScrollView;
import defpackage.a1;

/* renamed from: X.Rja, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C70370Rja extends HorizontalScrollView {
    public InterfaceC70369RjZ LJLIL;

    public final void setScrollViewListener(InterfaceC70369RjZ interfaceC70369RjZ) {
        this.LJLIL = interfaceC70369RjZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C70370Rja(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        a1.LJFF(context, "context");
    }

    @Override // android.view.View
    public final void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        InterfaceC70369RjZ interfaceC70369RjZ = this.LJLIL;
        if (interfaceC70369RjZ != null) {
            interfaceC70369RjZ.LIZ(i, i3);
        }
    }
}
