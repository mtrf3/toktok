package X;

import java.util.LinkedHashMap;

/* loaded from: classes10.dex */
public class L3E implements L32 {
    public final C53436Ky8 LIZ = new C53436Ky8();
    public final java.util.Map<L3F, S2E> LIZIZ;
    public final C53617L2n LIZJ;
    public final C53648L3s LIZLLL;
    public final L3V LJ;
    public final C53628L2y LJFF;

    public L3E() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(L3F.DEFAULT, new L3D());
        linkedHashMap.put(L3F.FLASH_SALE, new L36());
        linkedHashMap.put(L3F.FIRST_ORDER, new L3G());
        linkedHashMap.put(L3F.FREE_SHIPPING, new L3C());
        this.LIZIZ = linkedHashMap;
        this.LIZJ = new C53617L2n();
        this.LIZLLL = new C53648L3s();
        this.LJ = new L3V();
        this.LJFF = new C53628L2y();
    }

    @Override // X.L32
    public InterfaceC71480S3o LIZ() {
        return this.LIZ;
    }

    @Override // X.L32
    public InterfaceC54556Lb6 LIZIZ() {
        return this.LJFF;
    }
}
