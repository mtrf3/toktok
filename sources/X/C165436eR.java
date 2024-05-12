package X;

import com.ss.android.ugc.aweme.draft.model.AwemeDraft;
import kotlin.jvm.internal.o;

/* renamed from: X.6eR, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C165436eR {
    public final int LIZ;
    public final String LIZIZ;
    public final boolean LIZJ;
    public final AwemeDraft LIZLLL;
    public final C41656GWm LJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C165436eR)) {
            return false;
        }
        C165436eR c165436eR = (C165436eR) obj;
        return this.LIZ == c165436eR.LIZ && o.LJ(this.LIZIZ, c165436eR.LIZIZ) && this.LIZJ == c165436eR.LIZJ && o.LJ(this.LIZLLL, c165436eR.LIZLLL) && o.LJ(this.LJ, c165436eR.LJ);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("PreRestoreDraftCheckResult(status=");
        LIZ.append(this.LIZ);
        LIZ.append(", extraMsg=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", isMusicLegal=");
        LIZ.append(this.LIZJ);
        LIZ.append(", sourceDraft=");
        LIZ.append(this.LIZLLL);
        LIZ.append(", resultWrap=");
        LIZ.append(this.LJ);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode;
        int LJ = C79062V1e.LJ(this.LIZIZ, this.LIZ * 31, 31);
        boolean z = this.LIZJ;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int hashCode2 = (this.LIZLLL.hashCode() + ((LJ + i) * 31)) * 31;
        C41656GWm c41656GWm = this.LJ;
        if (c41656GWm == null) {
            hashCode = 0;
        } else {
            hashCode = c41656GWm.hashCode();
        }
        return hashCode2 + hashCode;
    }

    public C165436eR(int i, AwemeDraft sourceDraft, C41656GWm c41656GWm, String extraMsg, boolean z) {
        o.LJIIIZ(extraMsg, "extraMsg");
        o.LJIIIZ(sourceDraft, "sourceDraft");
        this.LIZ = i;
        this.LIZIZ = extraMsg;
        this.LIZJ = z;
        this.LIZLLL = sourceDraft;
        this.LJ = c41656GWm;
    }
}
