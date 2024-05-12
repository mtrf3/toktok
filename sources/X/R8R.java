package X;

import java.util.LinkedHashMap;

/* loaded from: classes12.dex */
public final class R8R<T> implements InterfaceC73518StG {
    public final /* synthetic */ java.util.Map<String, String> LIZ;
    public final /* synthetic */ InterfaceC69056R8i LIZIZ;
    public final /* synthetic */ String LIZJ;
    public final /* synthetic */ String LIZLLL;
    public final /* synthetic */ int LJ;

    public R8R(int i, InterfaceC69056R8i interfaceC69056R8i, String str, String str2, java.util.Map map) {
        this.LIZ = map;
        this.LIZIZ = interfaceC69056R8i;
        this.LIZJ = str;
        this.LIZLLL = str2;
        this.LJ = i;
    }

    @Override // X.InterfaceC73518StG
    public final void LIZ(C73516StE c73516StE) {
        R8N r8n = new R8N(this.LIZIZ, c73516StE);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        java.util.Map<String, String> map = this.LIZ;
        if (map != null) {
            linkedHashMap.putAll(map);
        }
        linkedHashMap.put("rules_version", "v2");
        this.LIZIZ.bi(r8n);
        this.LIZIZ.r9().LJIJ(this.LIZJ, this.LIZLLL, this.LJ, linkedHashMap, r8n);
    }
}
