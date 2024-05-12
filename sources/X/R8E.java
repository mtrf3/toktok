package X;

import java.util.LinkedHashMap;

/* loaded from: classes12.dex */
public final class R8E<T> implements InterfaceC73518StG {
    public final /* synthetic */ java.util.Map<String, String> LIZ;
    public final /* synthetic */ InterfaceC69056R8i LIZIZ;
    public final /* synthetic */ String LIZJ;
    public final /* synthetic */ int LIZLLL;
    public final /* synthetic */ String LJ;
    public final /* synthetic */ int LJFF;
    public final /* synthetic */ String LJI;
    public final /* synthetic */ EnumC69116RAq LJII;
    public final /* synthetic */ EnumC69113RAn LJIIIIZZ;

    public R8E(java.util.Map<String, String> map, InterfaceC69056R8i interfaceC69056R8i, String str, int i, String str2, int i2, String str3, EnumC69116RAq enumC69116RAq, EnumC69113RAn enumC69113RAn) {
        this.LIZ = map;
        this.LIZIZ = interfaceC69056R8i;
        this.LIZJ = str;
        this.LIZLLL = i;
        this.LJ = str2;
        this.LJFF = i2;
        this.LJI = str3;
        this.LJII = enumC69116RAq;
        this.LJIIIIZZ = enumC69113RAn;
    }

    @Override // X.InterfaceC73518StG
    public final void LIZ(C73516StE c73516StE) {
        int i;
        if (C78555UsJ.LJIJI(C58725N2z.LIZ) == 0) {
            i = 1;
        } else {
            i = 0;
        }
        R87 r87 = new R87(c73516StE, this.LJII, this.LJIIIIZZ);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (C69093R9t.LJIIJ()) {
            linkedHashMap.put("is6Digits", "1");
        }
        java.util.Map<String, String> map = this.LIZ;
        if (map != null) {
            linkedHashMap.putAll(map);
        }
        this.LIZIZ.bi(r87);
        this.LIZIZ.r9().LJIILLIIL(this.LIZJ, this.LIZLLL, this.LJ, this.LJFF, i, "", this.LJI, linkedHashMap, r87);
    }
}
