package X;

import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillCpfInfo;
import kotlin.jvm.internal.o;

/* renamed from: X.Az2, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C28012Az2 {
    public final BillCpfInfo LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C28012Az2) && o.LJ(this.LIZ, ((C28012Az2) obj).LIZ);
    }

    public final int hashCode() {
        BillCpfInfo billCpfInfo = this.LIZ;
        if (billCpfInfo == null) {
            return 0;
        }
        return billCpfInfo.hashCode();
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("CpfVO(billCpfInfo=");
        LIZ.append(this.LIZ);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public C28012Az2(BillCpfInfo billCpfInfo) {
        this.LIZ = billCpfInfo;
    }
}
