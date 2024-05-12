package X;

import X.InterfaceC57357MfB;
import X.InterfaceC84562XGs;
import kotlin.jvm.internal.o;

/* renamed from: X.Mf8, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C57354Mf8<DTO extends InterfaceC57357MfB, PO, Q extends InterfaceC84562XGs<DTO>> {
    public final InterfaceC54816LfI<String, PO> LIZ;
    public final InterfaceC88471Ynr<Q, PO, DTO> LIZIZ;
    public final InterfaceC88472Yns<DTO, PO> LIZJ;
    public final Class<DTO> LIZLLL;
    public final Class<PO> LJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C57354Mf8)) {
            return false;
        }
        C57354Mf8 c57354Mf8 = (C57354Mf8) obj;
        return o.LJ(this.LIZ, c57354Mf8.LIZ) && o.LJ(this.LIZIZ, c57354Mf8.LIZIZ) && o.LJ(this.LIZJ, c57354Mf8.LIZJ) && o.LJ(this.LIZLLL, c57354Mf8.LIZLLL) && o.LJ(this.LJ, c57354Mf8.LJ);
    }

    public final int hashCode() {
        int hashCode = this.LIZ.hashCode() * 31;
        InterfaceC88471Ynr<Q, PO, DTO> interfaceC88471Ynr = this.LIZIZ;
        int hashCode2 = (hashCode + (interfaceC88471Ynr == null ? 0 : interfaceC88471Ynr.hashCode())) * 31;
        InterfaceC88472Yns<DTO, PO> interfaceC88472Yns = this.LIZJ;
        return this.LJ.hashCode() + ((this.LIZLLL.hashCode() + ((hashCode2 + (interfaceC88472Yns != null ? interfaceC88472Yns.hashCode() : 0)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("CacheWithMapper(cache=");
        LIZ.append(this.LIZ);
        LIZ.append(", onFetch=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", onQuery=");
        LIZ.append(this.LIZJ);
        LIZ.append(", dtoCls=");
        LIZ.append(this.LIZLLL);
        LIZ.append(", poCls=");
        LIZ.append(this.LJ);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C57354Mf8(InterfaceC54816LfI<String, PO> cache, InterfaceC88471Ynr<? super Q, ? super PO, ? extends DTO> interfaceC88471Ynr, InterfaceC88472Yns<? super DTO, ? extends PO> interfaceC88472Yns, Class<DTO> cls, Class<PO> cls2) {
        o.LJIIIZ(cache, "cache");
        this.LIZ = cache;
        this.LIZIZ = interfaceC88471Ynr;
        this.LIZJ = interfaceC88472Yns;
        this.LIZLLL = cls;
        this.LJ = cls2;
    }
}
