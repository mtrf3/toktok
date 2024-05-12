package X;

import com.ss.android.ugc.aweme.ecommerce.search.sug.repo.EcSearchSugResponse;
import com.ss.android.ugc.aweme.search.model.SearchSugEntity;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class KA5 implements C33Q {
    public final EcSearchSugResponse LJLIL;
    public final List<? extends SearchSugEntity> LJLILLLLZI;
    public final Boolean LJLJI;

    public KA5() {
        this(null, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof KA5)) {
            return false;
        }
        KA5 ka5 = (KA5) obj;
        return o.LJ(this.LJLIL, ka5.LJLIL) && o.LJ(this.LJLILLLLZI, ka5.LJLILLLLZI) && o.LJ(this.LJLJI, ka5.LJLJI);
    }

    public final int hashCode() {
        EcSearchSugResponse ecSearchSugResponse = this.LJLIL;
        int hashCode = (ecSearchSugResponse == null ? 0 : ecSearchSugResponse.hashCode()) * 31;
        List<? extends SearchSugEntity> list = this.LJLILLLLZI;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        Boolean bool = this.LJLJI;
        return hashCode2 + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("EcSearchSugState(data=");
        LIZ.append(this.LJLIL);
        LIZ.append(", entityList=");
        LIZ.append(this.LJLILLLLZI);
        LIZ.append(", isSuccess=");
        return C78920UyC.LIZIZ(LIZ, this.LJLJI, ')', LIZ);
    }

    public KA5(EcSearchSugResponse ecSearchSugResponse, List<? extends SearchSugEntity> list, Boolean bool) {
        this.LJLIL = ecSearchSugResponse;
        this.LJLILLLLZI = list;
        this.LJLJI = bool;
    }
}
