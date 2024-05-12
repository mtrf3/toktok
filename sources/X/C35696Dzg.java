package X;

import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Dzg, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C35696Dzg {
    public final String LIZ;
    public final List<String> LIZIZ;
    public final Boolean LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C35696Dzg)) {
            return false;
        }
        C35696Dzg c35696Dzg = (C35696Dzg) obj;
        return o.LJ(this.LIZ, c35696Dzg.LIZ) && o.LJ(this.LIZIZ, c35696Dzg.LIZIZ) && o.LJ(this.LIZJ, c35696Dzg.LIZJ);
    }

    public final int hashCode() {
        int hashCode = this.LIZ.hashCode() * 31;
        List<String> list = this.LIZIZ;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        Boolean bool = this.LIZJ;
        return hashCode2 + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ProductTitleData(title=");
        LIZ.append(this.LIZ);
        LIZ.append(", logoUrls=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", isFavorite=");
        return C78920UyC.LIZIZ(LIZ, this.LIZJ, ')', LIZ);
    }

    public C35696Dzg(Boolean bool, String str, List list) {
        this.LIZ = str;
        this.LIZIZ = list;
        this.LIZJ = bool;
    }
}
