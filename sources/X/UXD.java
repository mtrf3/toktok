package X;

import com.bytedance.android.livesdk.model.Gift;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class UXD {
    public final Gift LIZ;
    public final UXT LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UXD)) {
            return false;
        }
        UXD uxd = (UXD) obj;
        return o.LJ(this.LIZ, uxd.LIZ) && o.LJ(this.LIZIZ, uxd.LIZIZ);
    }

    public final int hashCode() {
        return this.LIZIZ.hashCode() + (this.LIZ.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Data(gift=");
        LIZ.append(this.LIZ);
        LIZ.append(", matchResult=");
        LIZ.append(this.LIZIZ);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public final String LIZ() {
        return this.LIZIZ.LJLJI.LJLIL;
    }

    public UXD(Gift gift, UXT matchResult) {
        o.LJIIIZ(matchResult, "matchResult");
        this.LIZ = gift;
        this.LIZIZ = matchResult;
    }
}
