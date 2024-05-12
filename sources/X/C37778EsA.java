package X;

import kotlin.jvm.internal.o;

/* renamed from: X.EsA, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37778EsA implements InterfaceC40311Frv {
    public final /* synthetic */ C37775Es7 LIZ;

    public C37778EsA(C37775Es7 c37775Es7) {
        this.LIZ = c37775Es7;
    }

    @Override // X.InterfaceC40311Frv
    public final void LIZ(InterfaceC78280Uns interfaceC78280Uns, String eventName) {
        o.LJIIJ(eventName, "eventName");
        InterfaceC40516FvE interfaceC40516FvE = (InterfaceC40516FvE) this.LIZ.contextProviderFactory.LIZJ(InterfaceC40516FvE.class);
        if (interfaceC40516FvE != null) {
            interfaceC40516FvE.onEvent(new C37779EsB(interfaceC78280Uns, eventName));
        }
    }
}
