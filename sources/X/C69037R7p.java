package X;

import java.util.LinkedHashMap;

/* renamed from: X.R7p, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C69037R7p<T> implements InterfaceC73518StG {
    public final /* synthetic */ int LIZ;
    public final /* synthetic */ String LIZIZ;
    public final /* synthetic */ InterfaceC69056R8i LIZJ;
    public final /* synthetic */ String LIZLLL;
    public final /* synthetic */ EnumC69116RAq LJ;
    public final /* synthetic */ EnumC69113RAn LJFF;

    public C69037R7p(int i, String str, InterfaceC69056R8i interfaceC69056R8i, String str2, EnumC69116RAq enumC69116RAq, EnumC69113RAn enumC69113RAn) {
        this.LIZ = i;
        this.LIZIZ = str;
        this.LIZJ = interfaceC69056R8i;
        this.LIZLLL = str2;
        this.LJ = enumC69116RAq;
        this.LJFF = enumC69113RAn;
    }

    @Override // X.InterfaceC73518StG
    public final void LIZ(C73516StE c73516StE) {
        C35936E8m c35936E8m = new C35936E8m();
        c35936E8m.LIZLLL("send_reason", String.valueOf(this.LIZ));
        c35936E8m.LIZLLL("send_method", this.LIZIZ);
        FMX.LJIIL("send_voice_verification_code", c35936E8m.LIZ);
        R88 r88 = new R88(c73516StE, this.LJ, this.LJFF);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (C69093R9t.LJIIJ()) {
            linkedHashMap.put("is6Digits", "1");
        }
        this.LIZJ.bi(r88);
        this.LIZJ.r9().LJFF(this.LIZLLL, this.LIZ, linkedHashMap, r88);
    }
}
