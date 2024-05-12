package X;

import java.util.LinkedHashMap;

/* loaded from: classes10.dex */
public final class L3I extends L3N {
    public final java.util.Map<L3F, S2E> LJLJJL;
    public final L3W LJLJJLL;
    public final C53615L2l LJLJL;
    public final C53620L2q LJLJLJ;

    public L3I() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(L3F.DEFAULT, new L3B());
        linkedHashMap.put(L3F.FLASH_SALE, new L35());
        linkedHashMap.put(L3F.FIRST_ORDER, new L3J());
        this.LJLJJL = linkedHashMap;
        this.LJLJJLL = new L3W();
        this.LJLJL = new C53615L2l();
        this.LJLJLJ = new C53620L2q();
    }

    @Override // X.L3N, X.C78685UuP
    public final /* bridge */ /* synthetic */ InterfaceC71465S2z LJJIIZ() {
        return this.LJLJJLL;
    }

    @Override // X.L3N, X.C78685UuP
    public final /* bridge */ /* synthetic */ InterfaceC71480S3o LJJIL() {
        return this.LJLJLJ;
    }

    @Override // X.L3N, X.C78685UuP
    public final java.util.Map<L3F, S2E> LJJJIL() {
        return this.LJLJJL;
    }

    @Override // X.L3N, X.C78685UuP
    public final /* bridge */ /* synthetic */ InterfaceC71429S1p LJJJJIZL() {
        return this.LJLJL;
    }
}
