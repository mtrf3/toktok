package X;

import com.ss.android.ugc.aweme.aigc.AIGCQuota;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class ST6 {
    public final List<String> LIZ;
    public final List<AIGCQuota> LIZIZ;
    public final String LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ST6)) {
            return false;
        }
        ST6 st6 = (ST6) obj;
        return o.LJ(this.LIZ, st6.LIZ) && o.LJ(this.LIZIZ, st6.LIZIZ) && o.LJ(this.LIZJ, st6.LIZJ);
    }

    public final int hashCode() {
        List<String> list = this.LIZ;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        List<AIGCQuota> list2 = this.LIZIZ;
        int hashCode2 = (hashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
        String str = this.LIZJ;
        return hashCode2 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("{ avatarUris: ");
        LIZ.append(this.LIZ);
        LIZ.append(" \n remainQuota: ");
        LIZ.append(this.LIZIZ);
        LIZ.append(" \n taskId: ");
        return JBR.LJFF(LIZ, this.LIZJ, " }", LIZ);
    }

    public ST6(String str, List list, List list2) {
        this.LIZ = list;
        this.LIZIZ = list2;
        this.LIZJ = str;
    }
}
