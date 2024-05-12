package X;

import com.ss.android.ugc.aweme.ecommerce.base.address.dto.Region;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.DispatchTo;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.ReachableAddress;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Afl, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26817Afl {
    public final Object LIZ;
    public DispatchTo LIZIZ;

    public C26817Afl() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C26817Afl) && o.LJ(this.LIZ, ((C26817Afl) obj).LIZ);
    }

    public final int hashCode() {
        Object obj = this.LIZ;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final ReachableAddress LIZ() {
        Object obj = this.LIZ;
        if (obj instanceof ReachableAddress) {
            return (ReachableAddress) obj;
        }
        return null;
    }

    public final List<Region> LIZIZ() {
        Object obj = this.LIZ;
        if (obj instanceof List) {
            return (List) obj;
        }
        return null;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ShipToInfo(shipToInfo=");
        return U26.LIZJ(LIZ, this.LIZ, ')', LIZ);
    }

    public C26817Afl(Object obj) {
        this.LIZ = obj;
    }

    public final void LIZJ(InterfaceC88472Yns interfaceC88472Yns) {
        ReachableAddress LIZ = LIZ();
        if (LIZ != null) {
            interfaceC88472Yns.invoke(LIZ);
        }
    }
}
