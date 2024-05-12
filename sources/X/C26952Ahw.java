package X;

import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.LogisticDTO;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.LogisticLinkRichText;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Ahw, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26952Ahw {
    public final List<LogisticDTO> LIZ;
    public final List<LogisticLinkRichText> LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C26952Ahw)) {
            return false;
        }
        C26952Ahw c26952Ahw = (C26952Ahw) obj;
        return o.LJ(this.LIZ, c26952Ahw.LIZ) && o.LJ(this.LIZIZ, c26952Ahw.LIZIZ);
    }

    public final int hashCode() {
        int hashCode = this.LIZ.hashCode() * 31;
        List<LogisticLinkRichText> list = this.LIZIZ;
        return hashCode + (list == null ? 0 : list.hashCode());
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ExtraLogisticInfoVO(logistics=");
        LIZ.append(this.LIZ);
        LIZ.append(", rightText=");
        return C1NE.LIZIZ(LIZ, this.LIZIZ, ')', LIZ);
    }

    public C26952Ahw(List<LogisticDTO> logistics, List<LogisticLinkRichText> list) {
        o.LJIIIZ(logistics, "logistics");
        this.LIZ = logistics;
        this.LIZIZ = list;
    }
}
