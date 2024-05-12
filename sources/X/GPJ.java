package X;

import com.ss.android.ugc.aweme.draft.model.AwemeDraft;
import kotlin.jvm.internal.AqS138S0200000_7;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class GPJ {
    public final boolean LIZ;
    public final boolean LIZIZ;
    public final GP9 LIZJ;
    public final GPH LIZLLL;
    public final InterfaceC88472Yns<AwemeDraft, Boolean> LJ;

    public GPJ() {
        this(false, false, null, null, 31);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GPJ)) {
            return false;
        }
        GPJ gpj = (GPJ) obj;
        return this.LIZ == gpj.LIZ && this.LIZIZ == gpj.LIZIZ && this.LIZJ == gpj.LIZJ && this.LIZLLL == gpj.LIZLLL && o.LJ(this.LJ, gpj.LJ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v14 */
    public final int hashCode() {
        boolean z = this.LIZ;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int hashCode = (this.LIZLLL.hashCode() + ((this.LIZJ.hashCode() + (((r0 * 31) + (this.LIZIZ ? 1 : 0)) * 31)) * 31)) * 31;
        InterfaceC88472Yns<AwemeDraft, Boolean> interfaceC88472Yns = this.LJ;
        return hashCode + (interfaceC88472Yns == null ? 0 : interfaceC88472Yns.hashCode());
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("DraftListQueryParams(currentUser=");
        LIZ.append(this.LIZ);
        LIZ.append(", excludePublishingAndSoOn=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", draftQueryType=");
        LIZ.append(this.LIZJ);
        LIZ.append(", draftFormatQueryType=");
        LIZ.append(this.LIZLLL);
        LIZ.append(", filter=");
        return C249109q6.LIZIZ(LIZ, this.LJ, ')', LIZ);
    }

    public GPJ(boolean z, boolean z2, GPH draftFormatQueryType, AqS138S0200000_7 aqS138S0200000_7, int i) {
        GP9 draftQueryType;
        z = (i & 1) != 0 ? false : z;
        z2 = (i & 2) != 0 ? false : z2;
        if ((i & 4) != 0) {
            draftQueryType = GP9.ALL;
        } else {
            draftQueryType = null;
        }
        draftFormatQueryType = (i & 8) != 0 ? GPH.EXCEPT_TTN : draftFormatQueryType;
        aqS138S0200000_7 = (i & 16) != 0 ? null : aqS138S0200000_7;
        o.LJIIIZ(draftQueryType, "draftQueryType");
        o.LJIIIZ(draftFormatQueryType, "draftFormatQueryType");
        this.LIZ = z;
        this.LIZIZ = z2;
        this.LIZJ = draftQueryType;
        this.LIZLLL = draftFormatQueryType;
        this.LJ = aqS138S0200000_7;
    }
}
