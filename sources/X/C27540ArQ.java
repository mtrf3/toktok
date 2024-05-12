package X;

import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.SelfOperatedSloganInfo;
import kotlin.jvm.internal.o;

/* renamed from: X.ArQ, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27540ArQ {
    public final C27546ArW LIZ;
    public final SelfOperatedSloganInfo LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C27540ArQ)) {
            return false;
        }
        C27540ArQ c27540ArQ = (C27540ArQ) obj;
        return o.LJ(this.LIZ, c27540ArQ.LIZ) && o.LJ(this.LIZIZ, c27540ArQ.LIZIZ);
    }

    public final int hashCode() {
        C27546ArW c27546ArW = this.LIZ;
        int hashCode = (c27546ArW == null ? 0 : c27546ArW.hashCode()) * 31;
        SelfOperatedSloganInfo selfOperatedSloganInfo = this.LIZIZ;
        return hashCode + (selfOperatedSloganInfo != null ? selfOperatedSloganInfo.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("TtfMultiShopProfileVO(shopProfileVO=");
        LIZ.append(this.LIZ);
        LIZ.append(", selfOperatedInfo=");
        LIZ.append(this.LIZIZ);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public C27540ArQ(C27546ArW c27546ArW, SelfOperatedSloganInfo selfOperatedSloganInfo) {
        this.LIZ = c27546ArW;
        this.LIZIZ = selfOperatedSloganInfo;
    }
}
