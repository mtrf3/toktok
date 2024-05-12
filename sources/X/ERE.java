package X;

import com.ss.android.ugc.aweme.creative.model.UploadableMobileEffect2;
import com.ss.android.ugc.aweme.sticker.model.FaceStickerBean;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class ERE {
    public final UploadableMobileEffect2 LIZ;
    public final FaceStickerBean LIZIZ;
    public final int LIZJ;
    public int LIZLLL;
    public final InterfaceC65784Pro<Boolean> LJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ERE)) {
            return false;
        }
        ERE ere = (ERE) obj;
        return o.LJ(this.LIZ, ere.LIZ) && o.LJ(this.LIZIZ, ere.LIZIZ) && this.LIZJ == ere.LIZJ && this.LIZLLL == ere.LIZLLL && o.LJ(this.LJ, ere.LJ);
    }

    public final int hashCode() {
        int hashCode = this.LIZ.hashCode() * 31;
        FaceStickerBean faceStickerBean = this.LIZIZ;
        return this.LJ.hashCode() + ((((((hashCode + (faceStickerBean == null ? 0 : faceStickerBean.hashCode())) * 31) + this.LIZJ) * 31) + this.LIZLLL) * 31);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ExportStatus(exportEffect=");
        LIZ.append(this.LIZ);
        LIZ.append(", stickerBean=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", exportTiming=");
        LIZ.append(this.LIZJ);
        LIZ.append(", exportProgress=");
        LIZ.append(this.LIZLLL);
        LIZ.append(", canExport=");
        return C06540Nm.LIZJ(LIZ, this.LJ, ')', LIZ);
    }

    public ERE(UploadableMobileEffect2 uploadableMobileEffect2, FaceStickerBean faceStickerBean, int i, InterfaceC65784Pro canExport) {
        o.LJIIIZ(canExport, "canExport");
        this.LIZ = uploadableMobileEffect2;
        this.LIZIZ = faceStickerBean;
        this.LIZJ = i;
        this.LIZLLL = 0;
        this.LJ = canExport;
    }
}
