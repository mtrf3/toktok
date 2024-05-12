package X;

import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.HeaderNavigation;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class RXD implements C33Q {
    public final HeaderNavigation LJLIL;
    public final List<com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.Tab> LJLILLLLZI;

    public RXD() {
        this(null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RXD)) {
            return false;
        }
        RXD rxd = (RXD) obj;
        return o.LJ(this.LJLIL, rxd.LJLIL) && o.LJ(this.LJLILLLLZI, rxd.LJLILLLLZI);
    }

    public final int hashCode() {
        HeaderNavigation headerNavigation = this.LJLIL;
        int hashCode = (headerNavigation == null ? 0 : headerNavigation.hashCode()) * 31;
        List<com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.Tab> list = this.LJLILLLLZI;
        return hashCode + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("PdpHeadState(headerNavigation=");
        LIZ.append(this.LJLIL);
        LIZ.append(", tabs=");
        return C1NE.LIZIZ(LIZ, this.LJLILLLLZI, ')', LIZ);
    }

    public RXD(HeaderNavigation headerNavigation, List<com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.Tab> list) {
        this.LJLIL = headerNavigation;
        this.LJLILLLLZI = list;
    }
}
