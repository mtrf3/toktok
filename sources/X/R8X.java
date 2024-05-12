package X;

import java.util.LinkedHashMap;

/* loaded from: classes12.dex */
public final class R8X<T> implements InterfaceC73518StG {
    public final /* synthetic */ java.util.Map<String, String> LIZ;
    public final /* synthetic */ InterfaceC69056R8i LIZIZ;
    public final /* synthetic */ String LIZJ;
    public final /* synthetic */ int LIZLLL;

    public R8X(int i, InterfaceC69056R8i interfaceC69056R8i, String str, java.util.Map map) {
        this.LIZ = map;
        this.LIZIZ = interfaceC69056R8i;
        this.LIZJ = str;
        this.LIZLLL = i;
    }

    @Override // X.InterfaceC73518StG
    public final void LIZ(C73516StE c73516StE) {
        R8W r8w = new R8W(this.LIZIZ, c73516StE);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        java.util.Map<String, String> map = this.LIZ;
        if (map != null) {
            linkedHashMap.putAll(map);
        }
        this.LIZIZ.bi(r8w);
        this.LIZIZ.r9().LJIIL(this.LIZJ, this.LIZLLL, 0, null, linkedHashMap, r8w);
    }
}
