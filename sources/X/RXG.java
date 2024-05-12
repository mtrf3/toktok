package X;

import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.BottomNavigation;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class RXG implements C33Q {
    public final BottomNavigation LJLIL;

    public RXG() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof RXG) && o.LJ(this.LJLIL, ((RXG) obj).LJLIL);
    }

    public final int hashCode() {
        BottomNavigation bottomNavigation = this.LJLIL;
        if (bottomNavigation == null) {
            return 0;
        }
        return bottomNavigation.hashCode();
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("PdpBottomState(bottomNavigation=");
        LIZ.append(this.LJLIL);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public RXG(BottomNavigation bottomNavigation) {
        this.LJLIL = bottomNavigation;
    }
}
