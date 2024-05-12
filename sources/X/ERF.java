package X;

import com.ss.android.ugc.aweme.sticker.model.FaceStickerBean;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class ERF {
    public final InterfaceC65784Pro<Boolean> LIZ;
    public final int LIZIZ;
    public final FaceStickerBean LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ERF)) {
            return false;
        }
        ERF erf = (ERF) obj;
        return o.LJ(this.LIZ, erf.LIZ) && this.LIZIZ == erf.LIZIZ && o.LJ(this.LIZJ, erf.LIZJ);
    }

    public final int hashCode() {
        int hashCode = ((this.LIZ.hashCode() * 31) + this.LIZIZ) * 31;
        FaceStickerBean faceStickerBean = this.LIZJ;
        return hashCode + (faceStickerBean == null ? 0 : faceStickerBean.hashCode());
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ExportConfig(canExport=");
        LIZ.append(this.LIZ);
        LIZ.append(", exportTiming=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", stickerBean=");
        LIZ.append(this.LIZJ);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public ERF(InterfaceC65784Pro<Boolean> canExport, int i, FaceStickerBean faceStickerBean) {
        o.LJIIIZ(canExport, "canExport");
        this.LIZ = canExport;
        this.LIZIZ = i;
        this.LIZJ = faceStickerBean;
    }
}
