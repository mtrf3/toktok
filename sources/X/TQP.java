package X;

import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class TQP {
    public final C74600TPo LIZ;
    public final String LIZIZ;
    public final Boolean LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TQP)) {
            return false;
        }
        TQP tqp = (TQP) obj;
        return o.LJ(this.LIZ, tqp.LIZ) && o.LJ(this.LIZIZ, tqp.LIZIZ) && o.LJ(this.LIZJ, tqp.LIZJ);
    }

    public final int hashCode() {
        int hashCode;
        C74600TPo c74600TPo = this.LIZ;
        int i = 0;
        if (c74600TPo == null) {
            hashCode = 0;
        } else {
            hashCode = c74600TPo.hashCode();
        }
        int LJ = C79062V1e.LJ(this.LIZIZ, hashCode * 31, 31);
        Boolean bool = this.LIZJ;
        if (bool != null) {
            i = bool.hashCode();
        }
        return LJ + i;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ClosePreviewPanelData(previewData=");
        LIZ.append(this.LIZ);
        LIZ.append(", source=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", closeBySave=");
        return C78920UyC.LIZIZ(LIZ, this.LIZJ, ')', LIZ);
    }

    public TQP(C74600TPo c74600TPo, String str, Boolean bool) {
        this.LIZ = c74600TPo;
        this.LIZIZ = str;
        this.LIZJ = bool;
    }
}
