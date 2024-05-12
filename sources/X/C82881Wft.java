package X;

import androidx.lifecycle.Observer;
import kotlin.jvm.internal.o;

/* JADX INFO: Add missing generic type declarations: [INTERFACE] */
/* renamed from: X.Wft, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C82881Wft<INTERFACE> implements Observer<INTERFACE> {
    public InterfaceC88472Yns<? super INTERFACE, C76800UCe> LJLIL;

    @Override // androidx.lifecycle.Observer
    public final void onChanged(INTERFACE r2) {
        InterfaceC88472Yns<? super INTERFACE, C76800UCe> interfaceC88472Yns = this.LJLIL;
        if (interfaceC88472Yns != null) {
            interfaceC88472Yns.invoke(r2);
        }
        this.LJLIL = null;
    }

    public C82881Wft(AbstractC82879Wfr this$0, InterfaceC88472Yns<? super INTERFACE, C76800UCe> interfaceC88472Yns) {
        o.LJIIIZ(this$0, "this$0");
        this.LJLIL = interfaceC88472Yns;
    }
}
