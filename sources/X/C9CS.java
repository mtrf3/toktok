package X;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import defpackage.a1;

/* renamed from: X.9CS, reason: invalid class name */
/* loaded from: classes5.dex */
public final class C9CS extends FrameLayout {
    public InterfaceC92693kP LJLIL;

    public final InterfaceC92693kP getDisposable() {
        return this.LJLIL;
    }

    public final void setDisposable(InterfaceC92693kP interfaceC92693kP) {
        this.LJLIL = interfaceC92693kP;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9CS(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        a1.LJFF(context, "context");
    }
}
