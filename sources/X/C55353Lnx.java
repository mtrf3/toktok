package X;

import kotlin.jvm.internal.o;

/* renamed from: X.Lnx, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C55353Lnx implements PRT {
    public final /* synthetic */ InterfaceC65784Pro<C76800UCe> LJLIL;
    public final /* synthetic */ InterfaceC65784Pro<C76800UCe> LJLILLLLZI;

    @Override // X.PRT
    public final void LIZIZ(String type) {
        o.LJIIIZ(type, "type");
        InterfaceC65784Pro<C76800UCe> interfaceC65784Pro = this.LJLIL;
        if (interfaceC65784Pro != null) {
            interfaceC65784Pro.invoke();
        }
    }

    @Override // X.PRT
    public final void onStop(String type) {
        o.LJIIIZ(type, "type");
        InterfaceC65784Pro<C76800UCe> interfaceC65784Pro = this.LJLILLLLZI;
        if (interfaceC65784Pro != null) {
            interfaceC65784Pro.invoke();
        }
    }

    public C55353Lnx(InterfaceC65784Pro<C76800UCe> interfaceC65784Pro, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro2) {
        this.LJLIL = interfaceC65784Pro;
        this.LJLILLLLZI = interfaceC65784Pro2;
    }
}
