package X;

import com.ss.android.ugc.aweme.sticker.model.NewFaceStickerListBean;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class MIS {
    public final NewFaceStickerListBean LIZ;
    public final long LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MIS)) {
            return false;
        }
        MIS mis = (MIS) obj;
        return o.LJ(this.LIZ, mis.LIZ) && this.LIZIZ == mis.LIZIZ;
    }

    public final int hashCode() {
        return C16880lQ.LLJIJIL(this.LIZIZ) + (this.LIZ.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("PropDetailNode(propDetail=");
        LIZ.append(this.LIZ);
        LIZ.append(", expiredTime=");
        return C47135Ieh.LIZIZ(LIZ, this.LIZIZ, ')', LIZ);
    }

    public MIS(NewFaceStickerListBean propDetail, long j) {
        o.LJIIIZ(propDetail, "propDetail");
        this.LIZ = propDetail;
        this.LIZIZ = j;
    }
}
