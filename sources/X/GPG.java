package X;

import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class GPG {
    public final EnumC41422GNm LIZ;
    public final C41421GNl LIZIZ;
    public final List<String> LIZJ;
    public final boolean LIZLLL;
    public final GP9 LJ;
    public final GPH LJFF;

    public GPG() {
        this(null, null, null, false, null, null, 63);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GPG)) {
            return false;
        }
        GPG gpg = (GPG) obj;
        return this.LIZ == gpg.LIZ && o.LJ(this.LIZIZ, gpg.LIZIZ) && o.LJ(this.LIZJ, gpg.LIZJ) && this.LIZLLL == gpg.LIZLLL && this.LJ == gpg.LJ && this.LJFF == gpg.LJFF;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("DraftListQuerySqlParams(sortStrategy=");
        LIZ.append(this.LIZ);
        LIZ.append(", limit=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", excludeList=");
        LIZ.append(this.LIZJ);
        LIZ.append(", currentUser=");
        LIZ.append(this.LIZLLL);
        LIZ.append(", draftQueryType=");
        LIZ.append(this.LJ);
        LIZ.append(", draftFormatQueryType=");
        LIZ.append(this.LJFF);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode;
        int hashCode2 = this.LIZ.hashCode() * 31;
        C41421GNl c41421GNl = this.LIZIZ;
        if (c41421GNl == null) {
            hashCode = 0;
        } else {
            hashCode = c41421GNl.hashCode();
        }
        int LIZIZ = AnonymousClass391.LIZIZ(this.LIZJ, (hashCode2 + hashCode) * 31, 31);
        boolean z = this.LIZLLL;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return this.LJFF.hashCode() + ((this.LJ.hashCode() + ((LIZIZ + i) * 31)) * 31);
    }

    public GPG(EnumC41422GNm sortStrategy, C41421GNl c41421GNl, List excludeList, boolean z, GP9 draftQueryType, GPH draftFormatQueryType, int i) {
        sortStrategy = (i & 1) != 0 ? EnumC41422GNm.FIRST_SAVE_TIME : sortStrategy;
        c41421GNl = (i & 2) != 0 ? null : c41421GNl;
        excludeList = (i & 4) != 0 ? GPF.LJ() : excludeList;
        z = (i & 8) != 0 ? true : z;
        draftQueryType = (i & 16) != 0 ? GP9.NORMAL : draftQueryType;
        draftFormatQueryType = (i & 32) != 0 ? GPH.EXCEPT_TTN : draftFormatQueryType;
        o.LJIIIZ(sortStrategy, "sortStrategy");
        o.LJIIIZ(excludeList, "excludeList");
        o.LJIIIZ(draftQueryType, "draftQueryType");
        o.LJIIIZ(draftFormatQueryType, "draftFormatQueryType");
        this.LIZ = sortStrategy;
        this.LIZIZ = c41421GNl;
        this.LIZJ = excludeList;
        this.LIZLLL = z;
        this.LJ = draftQueryType;
        this.LJFF = draftFormatQueryType;
    }
}
