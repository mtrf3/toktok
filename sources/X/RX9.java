package X;

import com.ss.android.ugc.aweme.feed.model.BigThumb;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class RX9 {
    public final BigThumb LIZ;
    public final int LIZIZ;
    public final float LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RX9)) {
            return false;
        }
        RX9 rx9 = (RX9) obj;
        return o.LJ(this.LIZ, rx9.LIZ) && this.LIZIZ == rx9.LIZIZ && Float.compare(this.LIZJ, rx9.LIZJ) == 0;
    }

    public final int hashCode() {
        int hashCode;
        BigThumb bigThumb = this.LIZ;
        if (bigThumb == null) {
            hashCode = 0;
        } else {
            hashCode = bigThumb.hashCode();
        }
        return Float.floatToIntBits(this.LIZJ) + (((hashCode * 31) + this.LIZIZ) * 31);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ThumbData(bigThumb=");
        LIZ.append(this.LIZ);
        LIZ.append(", urlIndex=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", relativeIndex=");
        return C74221TAz.LIZLLL(LIZ, this.LIZJ, ')', LIZ);
    }

    public RX9(BigThumb bigThumb, int i, float f) {
        this.LIZ = bigThumb;
        this.LIZIZ = i;
        this.LIZJ = f;
    }
}
