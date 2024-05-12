package X;

import java.util.Map;

/* renamed from: X.EtN, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37853EtN implements InterfaceC31940CgC {
    public final /* synthetic */ Map.Entry LIZ;
    public final /* synthetic */ C31926Cfy LIZIZ;

    @Override // X.InterfaceC31940CgC
    public final InterfaceC37774Es6 LIZ() {
        InterfaceC37774Es6 interfaceC37774Es6 = (InterfaceC37774Es6) ((Class) this.LIZ.getValue()).newInstance();
        interfaceC37774Es6.LIZIZ(this.LIZIZ);
        return interfaceC37774Es6;
    }

    public C37853EtN(Map.Entry entry, C31926Cfy c31926Cfy) {
        this.LIZ = entry;
        this.LIZIZ = c31926Cfy;
    }
}
