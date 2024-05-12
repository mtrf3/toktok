package X;

import com.ss.android.ugc.aweme.shortvideo.SynthetiseResult;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class GV6 {
    public final String LIZ;
    public final SynthetiseResult LIZIZ;

    public GV6() {
        this("", null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GV6)) {
            return false;
        }
        GV6 gv6 = (GV6) obj;
        return o.LJ(this.LIZ, gv6.LIZ) && o.LJ(this.LIZIZ, gv6.LIZIZ);
    }

    public final int hashCode() {
        int hashCode = this.LIZ.hashCode() * 31;
        SynthetiseResult synthetiseResult = this.LIZIZ;
        return hashCode + (synthetiseResult == null ? 0 : synthetiseResult.hashCode());
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("EditPrePublishInfo(flowId=");
        LIZ.append(this.LIZ);
        LIZ.append(", result=");
        LIZ.append(this.LIZIZ);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public GV6(String flowId, SynthetiseResult synthetiseResult) {
        o.LJIIIZ(flowId, "flowId");
        this.LIZ = flowId;
        this.LIZIZ = synthetiseResult;
    }
}
