package X;

import com.ss.ugc.effectplatform.model.ProviderEffect;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class E47 {
    public final long LIZ;
    public final String LIZIZ;
    public final ProviderEffect LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof E47)) {
            return false;
        }
        E47 e47 = (E47) obj;
        return this.LIZ == e47.LIZ && o.LJ(this.LIZIZ, e47.LIZIZ) && o.LJ(this.LIZJ, e47.LIZJ);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("LibraryDownloadItem(timestamp=");
        LIZ.append(this.LIZ);
        LIZ.append(", key=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", data=");
        LIZ.append(this.LIZJ);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public final int hashCode() {
        int hashCode;
        int LJ = C79062V1e.LJ(this.LIZIZ, C16880lQ.LLJIJIL(this.LIZ) * 31, 31);
        ProviderEffect providerEffect = this.LIZJ;
        if (providerEffect == null) {
            hashCode = 0;
        } else {
            hashCode = providerEffect.hashCode();
        }
        return LJ + hashCode;
    }

    public E47(long j, String str, ProviderEffect providerEffect) {
        this.LIZ = j;
        this.LIZIZ = str;
        this.LIZJ = providerEffect;
    }
}
