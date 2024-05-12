package X;

import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.2Wa, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C59722Wa {
    public final int LIZ;
    public final java.util.Map<String, String> LIZIZ;
    public final List<C166116fX> LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C59722Wa)) {
            return false;
        }
        C59722Wa c59722Wa = (C59722Wa) obj;
        return this.LIZ == c59722Wa.LIZ && o.LJ(this.LIZIZ, c59722Wa.LIZIZ) && o.LJ(this.LIZJ, c59722Wa.LIZJ);
    }

    public final int hashCode() {
        int i = this.LIZ * 31;
        java.util.Map<String, String> map = this.LIZIZ;
        int hashCode = (i + (map == null ? 0 : map.hashCode())) * 31;
        List<C166116fX> list = this.LIZJ;
        return hashCode + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("VoiceChangeError(errorCode=");
        LIZ.append(this.LIZ);
        LIZ.append(", params=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", processedModels=");
        return C1NE.LIZIZ(LIZ, this.LIZJ, ')', LIZ);
    }

    public C59722Wa(java.util.Map map, int i, List list) {
        this.LIZ = i;
        this.LIZIZ = map;
        this.LIZJ = list;
    }
}
