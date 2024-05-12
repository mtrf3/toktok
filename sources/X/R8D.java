package X;

import java.util.LinkedHashMap;

/* loaded from: classes12.dex */
public final class R8D<T> implements InterfaceC73518StG {
    public final /* synthetic */ java.util.Map<String, String> LIZ;
    public final /* synthetic */ InterfaceC69056R8i LIZIZ;
    public final /* synthetic */ String LIZJ;
    public final /* synthetic */ int LIZLLL;
    public final /* synthetic */ EnumC69113RAn LJ;

    public R8D(java.util.Map<String, String> map, InterfaceC69056R8i interfaceC69056R8i, String str, int i, EnumC69113RAn enumC69113RAn) {
        this.LIZ = map;
        this.LIZIZ = interfaceC69056R8i;
        this.LIZJ = str;
        this.LIZLLL = i;
        this.LJ = enumC69113RAn;
    }

    @Override // X.InterfaceC73518StG
    public final void LIZ(C73516StE c73516StE) {
        R8C r8c = new R8C(c73516StE, this.LJ);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (C69093R9t.LJIIJ()) {
            linkedHashMap.put("is6Digits", "1");
        }
        java.util.Map<String, String> map = this.LIZ;
        if (map != null) {
            linkedHashMap.putAll(map);
        }
        this.LIZIZ.bi(r8c);
        this.LIZIZ.r9().LIZIZ(this.LIZJ, this.LIZLLL, linkedHashMap, r8c);
    }
}
