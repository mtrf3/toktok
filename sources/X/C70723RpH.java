package X;

import com.ss.android.ugc.aweme.ecommerce.base.review.repo.dto.ReviewAspectPercentageCard;
import com.ss.android.ugc.aweme.ecommerce.base.review.repo.dto.ReviewFilterStruct;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.RpH, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C70723RpH {
    public final List<ReviewFilterStruct> LIZ;
    public final List<ReviewFilterStruct> LIZIZ;
    public final List<ReviewAspectPercentageCard> LIZJ;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C70723RpH() {
        /*
            r2 = this;
            r1 = 0
            r0 = 7
            r2.<init>(r1, r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C70723RpH.<init>():void");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C70723RpH)) {
            return false;
        }
        C70723RpH c70723RpH = (C70723RpH) obj;
        return o.LJ(this.LIZ, c70723RpH.LIZ) && o.LJ(this.LIZIZ, c70723RpH.LIZIZ) && o.LJ(this.LIZJ, c70723RpH.LIZJ);
    }

    public final int hashCode() {
        List<ReviewFilterStruct> list = this.LIZ;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        List<ReviewFilterStruct> list2 = this.LIZIZ;
        int hashCode2 = (hashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<ReviewAspectPercentageCard> list3 = this.LIZJ;
        return hashCode2 + (list3 != null ? list3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ReviewFilterVO(filters=");
        LIZ.append(this.LIZ);
        LIZ.append(", ratingFilters=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", reviewAspectPercentageCard=");
        return C1NE.LIZIZ(LIZ, this.LIZJ, ')', LIZ);
    }

    public /* synthetic */ C70723RpH(List list, List list2, int i) {
        this((List<ReviewFilterStruct>) ((i & 1) != 0 ? null : list), (List<ReviewFilterStruct>) ((i & 2) != 0 ? null : list2), (List<ReviewAspectPercentageCard>) null);
    }

    public C70723RpH(List<ReviewFilterStruct> list, List<ReviewFilterStruct> list2, List<ReviewAspectPercentageCard> list3) {
        this.LIZ = list;
        this.LIZIZ = list2;
        this.LIZJ = list3;
    }
}
