package X;

import com.ss.android.ugc.aweme.notification.creator.model.response.NoticeFilterModel;
import com.ss.android.ugc.aweme.notification.creator.model.response.NoticeSortModel;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.MTf, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C56859MTf {
    public final int LIZ;
    public final List<Integer> LIZIZ;
    public final List<NoticeSortModel> LIZJ;
    public final List<NoticeFilterModel> LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C56859MTf)) {
            return false;
        }
        C56859MTf c56859MTf = (C56859MTf) obj;
        return this.LIZ == c56859MTf.LIZ && o.LJ(this.LIZIZ, c56859MTf.LIZIZ) && o.LJ(this.LIZJ, c56859MTf.LIZJ) && o.LJ(this.LIZLLL, c56859MTf.LIZLLL);
    }

    public final int hashCode() {
        int hashCode;
        int LIZIZ = AnonymousClass391.LIZIZ(this.LIZIZ, this.LIZ * 31, 31);
        List<NoticeSortModel> list = this.LIZJ;
        int i = 0;
        if (list == null) {
            hashCode = 0;
        } else {
            hashCode = list.hashCode();
        }
        int i2 = (LIZIZ + hashCode) * 31;
        List<NoticeFilterModel> list2 = this.LIZLLL;
        if (list2 != null) {
            i = list2.hashCode();
        }
        return i2 + i;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("SortAndFilterModel(sortType=");
        LIZ.append(this.LIZ);
        LIZ.append(", filterTypes=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", sortSettings=");
        LIZ.append(this.LIZJ);
        LIZ.append(", filterSettings=");
        return C1NE.LIZIZ(LIZ, this.LIZLLL, ')', LIZ);
    }

    public C56859MTf(int i, List<Integer> filterTypes, List<NoticeSortModel> list, List<NoticeFilterModel> list2) {
        o.LJIIIZ(filterTypes, "filterTypes");
        this.LIZ = i;
        this.LIZIZ = filterTypes;
        this.LIZJ = list;
        this.LIZLLL = list2;
    }
}
