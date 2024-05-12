package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.2WT, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C2WT {
    public final List<Aweme> LIZ;
    public final String LIZIZ;
    public final boolean LIZJ;
    public final java.util.Map<String, Long> LIZLLL = null;
    public final List<Long> LJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2WT)) {
            return false;
        }
        C2WT c2wt = (C2WT) obj;
        return o.LJ(this.LIZ, c2wt.LIZ) && o.LJ(this.LIZIZ, c2wt.LIZIZ) && this.LIZJ == c2wt.LIZJ && o.LJ(this.LIZLLL, c2wt.LIZLLL) && o.LJ(this.LJ, c2wt.LJ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        List<Aweme> list = this.LIZ;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        String str = this.LIZIZ;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        boolean z = this.LIZJ;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (hashCode2 + i) * 31;
        java.util.Map<String, Long> map = this.LIZLLL;
        int hashCode3 = (i2 + (map == null ? 0 : map.hashCode())) * 31;
        List<Long> list2 = this.LJ;
        return hashCode3 + (list2 != null ? list2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("WatchHistoryList(items=");
        LIZ.append(this.LIZ);
        LIZ.append(", cursor=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", hashMore=");
        LIZ.append(this.LIZJ);
        LIZ.append(", idTimestampsMap=");
        LIZ.append(this.LIZLLL);
        LIZ.append(", timestampsList=");
        return C1NE.LIZIZ(LIZ, this.LJ, ')', LIZ);
    }

    public C2WT(List list, String str, boolean z, List list2) {
        this.LIZ = list;
        this.LIZIZ = str;
        this.LIZJ = z;
        this.LJ = list2;
    }
}
