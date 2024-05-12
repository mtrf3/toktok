package X;

import defpackage.q;
import kotlin.jvm.internal.o;

/* renamed from: X.TPp, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C74601TPp {
    public final C74600TPo LIZ;
    public final String LIZIZ;
    public final String LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C74601TPp)) {
            return false;
        }
        C74601TPp c74601TPp = (C74601TPp) obj;
        return o.LJ(this.LIZ, c74601TPp.LIZ) && o.LJ(this.LIZIZ, c74601TPp.LIZIZ) && o.LJ(this.LIZJ, c74601TPp.LIZJ);
    }

    public final int hashCode() {
        int hashCode;
        C74600TPo c74600TPo = this.LIZ;
        if (c74600TPo == null) {
            hashCode = 0;
        } else {
            hashCode = c74600TPo.hashCode();
        }
        return this.LIZJ.hashCode() + C79062V1e.LJ(this.LIZIZ, hashCode * 31, 31);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("OpenPreviewPanelData(previewData=");
        LIZ.append(this.LIZ);
        LIZ.append(", openSource=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", from=");
        return q.LIZIZ(LIZ, this.LIZJ, ')', LIZ);
    }

    public C74601TPp(C74600TPo c74600TPo, String str, String str2) {
        this.LIZ = c74600TPo;
        this.LIZIZ = str;
        this.LIZJ = str2;
    }
}
