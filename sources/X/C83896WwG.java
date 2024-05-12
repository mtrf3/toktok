package X;

import java.util.LinkedHashMap;

/* renamed from: X.WwG, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C83896WwG extends AbstractC65781Prl implements InterfaceC65784Pro<java.util.Map<Class<InterfaceC83847WvT>, ? extends InterfaceC83847WvT>> {
    public final /* synthetic */ C83895WwF LJLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C83896WwG(C83895WwF c83895WwF) {
        super(0);
        this.LJLIL = c83895WwF;
    }

    @Override // X.InterfaceC65784Pro
    public final java.util.Map<Class<InterfaceC83847WvT>, ? extends InterfaceC83847WvT> invoke() {
        java.util.Set<InterfaceC83847WvT> keySet = this.LJLIL.LIZJ.LIZ().LIZLLL.keySet();
        int LJJIIZ = C51029K0z.LJJIIZ(C32I.LJJL(keySet, 10));
        if (LJJIIZ < 16) {
            LJJIIZ = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(LJJIIZ);
        for (InterfaceC83847WvT interfaceC83847WvT : keySet) {
            linkedHashMap.put(interfaceC83847WvT.getClass(), interfaceC83847WvT);
        }
        return linkedHashMap;
    }
}
