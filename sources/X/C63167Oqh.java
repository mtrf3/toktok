package X;

import Y.IDcS135S0200000_1;

/* renamed from: X.Oqh, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C63167Oqh implements InterfaceC86963bA<java.util.Map<String, Long>> {
    public final /* synthetic */ java.util.Map LIZ;
    public final /* synthetic */ InterfaceC86963bA LIZIZ;
    public final /* synthetic */ C63356Otk LIZJ;

    @Override // X.InterfaceC86963bA
    public final void LIZIZ(C63623Oy3 c63623Oy3) {
        C63356Otk c63356Otk = this.LIZJ;
        java.util.Map map = this.LIZ;
        InterfaceC86963bA interfaceC86963bA = this.LIZIZ;
        c63356Otk.getClass();
        C63356Otk.LIZ(map, interfaceC86963bA, null);
    }

    @Override // X.InterfaceC86963bA
    public final void onSuccess(java.util.Map<String, Long> map) {
        C63356Otk c63356Otk = this.LIZJ;
        java.util.Map map2 = this.LIZ;
        InterfaceC86963bA interfaceC86963bA = this.LIZIZ;
        c63356Otk.getClass();
        C63356Otk.LIZ(map2, interfaceC86963bA, map);
    }

    public C63167Oqh(C63356Otk c63356Otk, java.util.Map map, IDcS135S0200000_1 iDcS135S0200000_1) {
        this.LIZJ = c63356Otk;
        this.LIZ = map;
        this.LIZIZ = iDcS135S0200000_1;
    }
}
