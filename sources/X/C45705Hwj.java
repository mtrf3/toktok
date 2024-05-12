package X;

import com.ss.ugc.effectplatform.model.ProviderEffect;
import kotlin.jvm.internal.o;

/* renamed from: X.Hwj, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45705Hwj {
    public final boolean LIZ;
    public final boolean LIZIZ;
    public final int LIZJ;
    public final ProviderEffect LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C45705Hwj)) {
            return false;
        }
        C45705Hwj c45705Hwj = (C45705Hwj) obj;
        return this.LIZ == c45705Hwj.LIZ && this.LIZIZ == c45705Hwj.LIZIZ && this.LIZJ == c45705Hwj.LIZJ && o.LJ(this.LIZLLL, c45705Hwj.LIZLLL);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    public final int hashCode() {
        boolean z = this.LIZ;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int i = ((((r0 * 31) + (this.LIZIZ ? 1 : 0)) * 31) + this.LIZJ) * 31;
        ProviderEffect providerEffect = this.LIZLLL;
        return i + (providerEffect == null ? 0 : providerEffect.hashCode());
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("LibraryDownloaderCallback(isFailed=");
        LIZ.append(this.LIZ);
        LIZ.append(", isComplete=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", progress=");
        LIZ.append(this.LIZJ);
        LIZ.append(", effect=");
        LIZ.append(this.LIZLLL);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public C45705Hwj(boolean z, boolean z2, int i, ProviderEffect providerEffect) {
        this.LIZ = z;
        this.LIZIZ = z2;
        this.LIZJ = i;
        this.LIZLLL = providerEffect;
    }
}
