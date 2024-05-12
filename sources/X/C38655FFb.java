package X;

import com.ss.android.ugc.aweme.ab.AbsABValueOptimizer;
import kotlin.jvm.internal.o;

/* renamed from: X.FFb, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38655FFb {
    public final java.util.Map<String, AbsABValueOptimizer> LIZ;
    public final java.util.Map<String, AbstractC38658FFe> LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C38655FFb)) {
            return false;
        }
        C38655FFb c38655FFb = (C38655FFb) obj;
        return o.LJ(this.LIZ, c38655FFb.LIZ) && o.LJ(this.LIZIZ, c38655FFb.LIZIZ);
    }

    public final int hashCode() {
        return this.LIZIZ.hashCode() + (this.LIZ.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Preload(abOptimizerMap=");
        LIZ.append(this.LIZ);
        LIZ.append(", kvOptimizerMap=");
        return C15890jp.LIZ(LIZ, this.LIZIZ, ')', LIZ);
    }

    public C38655FFb(java.util.Map<String, AbsABValueOptimizer> map, java.util.Map<String, AbstractC38658FFe> map2) {
        this.LIZ = map;
        this.LIZIZ = map2;
    }
}
