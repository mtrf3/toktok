package X;

import java.util.Arrays;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class RTX {
    public final boolean LIZ;
    public final long LIZIZ;
    public final long[] LIZJ;

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("MultiRoomConfig(isMultiRoomMode=");
        LIZ.append(this.LIZ);
        LIZ.append(", roomId=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", roomIds=");
        LIZ.append(Arrays.toString(this.LIZJ));
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public final int hashCode() {
        int i;
        int LIZJ = JBR.LIZJ(this.LIZIZ, C16880lQ.LLJILJIL(this.LIZ) * 31, 31);
        long[] jArr = this.LIZJ;
        if (jArr != null) {
            i = Arrays.hashCode(jArr);
        } else {
            i = 0;
        }
        return LIZJ + i;
    }

    public final boolean equals(Object obj) {
        Class<?> cls;
        if (this == obj) {
            return true;
        }
        if (obj != null) {
            cls = obj.getClass();
        } else {
            cls = null;
        }
        if (!o.LJ(RTX.class, cls)) {
            return false;
        }
        o.LJII(obj, "null cannot be cast to non-null type com.ss.android.ugc.aweme.ecommerce.base.livefeed.LiveFeedStarter.MultiRoomConfig");
        RTX rtx = (RTX) obj;
        if (this.LIZ != rtx.LIZ || this.LIZIZ != rtx.LIZIZ) {
            return false;
        }
        long[] jArr = this.LIZJ;
        if (jArr != null) {
            long[] jArr2 = rtx.LIZJ;
            if (jArr2 == null || !Arrays.equals(jArr, jArr2)) {
                return false;
            }
        } else if (rtx.LIZJ != null) {
            return false;
        }
        return true;
    }

    public RTX(long j, long[] jArr, boolean z) {
        this.LIZ = z;
        this.LIZIZ = j;
        this.LIZJ = jArr;
    }
}
