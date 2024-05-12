package X;

import com.ss.android.ugc.aweme.filter.FilterBean;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.effectmanager.effect.model.EffectCategoryResponse;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public final class WQF {
    public final List<FilterBean> LIZ;
    public final List<EffectCategoryResponse> LIZIZ;
    public final List<OSZ<EffectCategoryResponse, List<FilterBean>>> LIZJ;
    public final java.util.Map<String, Effect> LIZLLL;
    public final List<FilterBean> LJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WQF)) {
            return false;
        }
        WQF wqf = (WQF) obj;
        return o.LJ(this.LIZ, wqf.LIZ) && o.LJ(this.LIZIZ, wqf.LIZIZ) && o.LJ(this.LIZJ, wqf.LIZJ) && o.LJ(this.LIZLLL, wqf.LIZLLL) && o.LJ(this.LJ, wqf.LJ);
    }

    public final int hashCode() {
        List<FilterBean> list = this.LIZ;
        int hashCode = (list != null ? list.hashCode() : 0) * 31;
        List<EffectCategoryResponse> list2 = this.LIZIZ;
        int hashCode2 = (hashCode + (list2 != null ? list2.hashCode() : 0)) * 31;
        List<OSZ<EffectCategoryResponse, List<FilterBean>>> list3 = this.LIZJ;
        int hashCode3 = (hashCode2 + (list3 != null ? list3.hashCode() : 0)) * 31;
        java.util.Map<String, Effect> map = this.LIZLLL;
        int hashCode4 = (hashCode3 + (map != null ? map.hashCode() : 0)) * 31;
        List<FilterBean> list4 = this.LJ;
        return hashCode4 + (list4 != null ? list4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("FilterDataObserveBundle(filters=");
        LIZ.append(this.LIZ);
        LIZ.append(", categories=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", categoryMap=");
        LIZ.append(this.LIZJ);
        LIZ.append(", effectMap=");
        LIZ.append(this.LIZLLL);
        LIZ.append(", availableFilters=");
        LIZ.append(this.LJ);
        LIZ.append(")");
        return X1D.LIZIZ(LIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public WQF(List<? extends FilterBean> list, List<EffectCategoryResponse> list2, List<? extends OSZ<EffectCategoryResponse, ? extends List<? extends FilterBean>>> list3, java.util.Map<String, ? extends Effect> map, List<? extends FilterBean> list4) {
        this.LIZ = list;
        this.LIZIZ = list2;
        this.LIZJ = list3;
        this.LIZLLL = map;
        this.LJ = list4;
    }
}
