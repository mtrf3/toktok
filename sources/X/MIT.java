package X;

import com.ss.android.ugc.aweme.prop.model.StickerPropAwemeList;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class MIT {
    public final StickerPropAwemeList LIZ;
    public final long LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MIT)) {
            return false;
        }
        MIT mit = (MIT) obj;
        return o.LJ(this.LIZ, mit.LIZ) && this.LIZIZ == mit.LIZIZ;
    }

    public final int hashCode() {
        return C16880lQ.LLJIJIL(this.LIZIZ) + (this.LIZ.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("PropListNode(propList=");
        LIZ.append(this.LIZ);
        LIZ.append(", expiredTime=");
        return C47135Ieh.LIZIZ(LIZ, this.LIZIZ, ')', LIZ);
    }

    public MIT(StickerPropAwemeList propList, long j) {
        o.LJIIIZ(propList, "propList");
        this.LIZ = propList;
        this.LIZIZ = j;
    }
}
