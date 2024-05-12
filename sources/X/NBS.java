package X;

import android.os.Bundle;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class NBS {
    public final Bundle LIZ;
    public final String LIZIZ;
    public final F23 LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NBS)) {
            return false;
        }
        NBS nbs = (NBS) obj;
        return o.LJ(this.LIZ, nbs.LIZ) && o.LJ(this.LIZIZ, nbs.LIZIZ) && o.LJ(this.LIZJ, nbs.LIZJ);
    }

    public final int hashCode() {
        Bundle bundle = this.LIZ;
        int hashCode = (bundle == null ? 0 : bundle.hashCode()) * 31;
        String str = this.LIZIZ;
        return this.LIZJ.hashCode() + ((hashCode + (str != null ? str.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("HybridConfig(infoForFe=");
        LIZ.append(this.LIZ);
        LIZ.append(", accessKey=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", iSparkCustomParam=");
        LIZ.append(this.LIZJ);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public NBS(Bundle bundle, String str, C1PH c1ph) {
        this.LIZ = bundle;
        this.LIZIZ = str;
        this.LIZJ = c1ph;
    }
}
