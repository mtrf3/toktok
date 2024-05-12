package X;

import com.ss.android.ugc.aweme.model.CollectionDetailModel;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.9z7, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C254699z7 {
    public final List<CollectionDetailModel> LIZ;
    public final List<Long> LIZIZ;
    public final Long LIZJ;

    public C254699z7() {
        this((List) null, (List) null, 7);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C254699z7)) {
            return false;
        }
        C254699z7 c254699z7 = (C254699z7) obj;
        return o.LJ(this.LIZ, c254699z7.LIZ) && o.LJ(this.LIZIZ, c254699z7.LIZIZ) && o.LJ(this.LIZJ, c254699z7.LIZJ);
    }

    public final int hashCode() {
        int hashCode;
        int LIZIZ = AnonymousClass391.LIZIZ(this.LIZIZ, this.LIZ.hashCode() * 31, 31);
        Long l = this.LIZJ;
        if (l == null) {
            hashCode = 0;
        } else {
            hashCode = l.hashCode();
        }
        return LIZIZ + hashCode;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("CreatorSeriesData(allSeries=");
        LIZ.append(this.LIZ);
        LIZ.append(", liveAddedCollectionIds=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", pinnedSeriesId=");
        return JBR.LJ(LIZ, this.LIZJ, ')', LIZ);
    }

    public C254699z7(Long l, List allSeries, List liveAddedCollectionIds) {
        o.LJIIIZ(allSeries, "allSeries");
        o.LJIIIZ(liveAddedCollectionIds, "liveAddedCollectionIds");
        this.LIZ = allSeries;
        this.LIZIZ = liveAddedCollectionIds;
        this.LIZJ = l;
    }

    public C254699z7(List list, List list2, int i) {
        this((Long) null, (i & 1) != 0 ? C61878OQg.INSTANCE : list, (i & 2) != 0 ? C61878OQg.INSTANCE : list2);
    }
}
