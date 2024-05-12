package X;

import java.util.LinkedHashMap;

/* renamed from: X.R7u, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C69042R7u<T> implements InterfaceC73518StG {
    public final /* synthetic */ java.util.Map<String, String> LIZ;
    public final /* synthetic */ InterfaceC69056R8i LIZIZ;
    public final /* synthetic */ int LIZJ;
    public final /* synthetic */ String LIZLLL;

    public C69042R7u(int i, InterfaceC69056R8i interfaceC69056R8i, String str, java.util.Map map) {
        this.LIZ = map;
        this.LIZIZ = interfaceC69056R8i;
        this.LIZJ = i;
        this.LIZLLL = str;
    }

    @Override // X.InterfaceC73518StG
    public final void LIZ(C73516StE c73516StE) {
        R8I r8i = new R8I(this.LIZIZ, c73516StE);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        java.util.Map<String, String> map = this.LIZ;
        if (map != null) {
            linkedHashMap.putAll(map);
        }
        this.LIZIZ.bi(r8i);
        this.LIZIZ.r9().LJJI(this.LIZJ, this.LIZLLL, linkedHashMap, r8i);
    }
}
