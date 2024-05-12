package X;

import com.ss.android.ugc.aweme.draft.model.AwemeDraft;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class GPP {
    public final AwemeDraft LIZ;
    public final C41360GLc LIZIZ;
    public final boolean LIZJ;
    public final InterfaceC88472Yns<InterfaceC67352kd<? super C76800UCe>, Object> LIZLLL;
    public final InterfaceC88472Yns<InterfaceC67352kd<? super C76800UCe>, Object> LJ;
    public final InterfaceC88472Yns<InterfaceC67352kd<? super C76800UCe>, Object> LJFF;

    public GPP() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GPP)) {
            return false;
        }
        GPP gpp = (GPP) obj;
        return o.LJ(this.LIZ, gpp.LIZ) && o.LJ(this.LIZIZ, gpp.LIZIZ) && this.LIZJ == gpp.LIZJ && o.LJ(this.LIZLLL, gpp.LIZLLL) && o.LJ(this.LJ, gpp.LJ) && o.LJ(this.LJFF, gpp.LJFF);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode = (this.LIZIZ.hashCode() + (this.LIZ.hashCode() * 31)) * 31;
        boolean z = this.LIZJ;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (hashCode + i) * 31;
        InterfaceC88472Yns<InterfaceC67352kd<? super C76800UCe>, Object> interfaceC88472Yns = this.LIZLLL;
        int hashCode2 = (i2 + (interfaceC88472Yns == null ? 0 : interfaceC88472Yns.hashCode())) * 31;
        InterfaceC88472Yns<InterfaceC67352kd<? super C76800UCe>, Object> interfaceC88472Yns2 = this.LJ;
        int hashCode3 = (hashCode2 + (interfaceC88472Yns2 == null ? 0 : interfaceC88472Yns2.hashCode())) * 31;
        InterfaceC88472Yns<InterfaceC67352kd<? super C76800UCe>, Object> interfaceC88472Yns3 = this.LJFF;
        return hashCode3 + (interfaceC88472Yns3 != null ? interfaceC88472Yns3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("DraftDeleteParams(draft=");
        LIZ.append(this.LIZ);
        LIZ.append(", extraInfo=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", deletePersistentFile=");
        LIZ.append(this.LIZJ);
        LIZ.append(", dbDeletedAction=");
        LIZ.append(this.LIZLLL);
        LIZ.append(", fileDeletedAction=");
        LIZ.append(this.LJ);
        LIZ.append(", fileDeleteLatch=");
        return C249109q6.LIZIZ(LIZ, this.LJFF, ')', LIZ);
    }

    public GPP(AwemeDraft draft, C41360GLc c41360GLc, C41465GPd c41465GPd, InterfaceC88472Yns interfaceC88472Yns, int i) {
        boolean z;
        if ((i & 4) != 0) {
            z = true;
        } else {
            z = false;
        }
        c41465GPd = (i & 8) != 0 ? null : c41465GPd;
        interfaceC88472Yns = (i & 32) != 0 ? null : interfaceC88472Yns;
        o.LJIIIZ(draft, "draft");
        this.LIZ = draft;
        this.LIZIZ = c41360GLc;
        this.LIZJ = z;
        this.LIZLLL = c41465GPd;
        this.LJ = null;
        this.LJFF = interfaceC88472Yns;
    }
}
