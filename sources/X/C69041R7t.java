package X;

import java.util.LinkedHashMap;

/* renamed from: X.R7t, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C69041R7t<T> implements InterfaceC73518StG {
    public final /* synthetic */ String LIZ;
    public final /* synthetic */ String LIZIZ;
    public final /* synthetic */ java.util.Map<String, String> LIZJ = null;
    public final /* synthetic */ InterfaceC69056R8i LIZLLL;
    public final /* synthetic */ String LJ;

    public C69041R7t(InterfaceC69056R8i interfaceC69056R8i, String str, String str2, String str3) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZLLL = interfaceC69056R8i;
        this.LJ = str3;
    }

    @Override // X.InterfaceC73518StG
    public final void LIZ(C73516StE c73516StE) {
        R8A r8a = new R8A(this.LIZLLL, c73516StE);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("conditional_login_ticket", this.LIZ);
        C69093R9t.LJJIIJ(this.LIZIZ, linkedHashMap);
        java.util.Map<String, String> map = this.LIZJ;
        if (map != null) {
            linkedHashMap.putAll(map);
        }
        this.LIZLLL.bi(r8a);
        this.LIZLLL.r9().LJIIIZ(this.LJ, linkedHashMap, r8a);
    }
}
