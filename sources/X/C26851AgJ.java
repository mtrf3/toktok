package X;

import com.ss.android.ugc.aweme.ecommerce.base.osp.module.extrafee.ExtraFeeStatement;
import kotlin.jvm.internal.o;

/* renamed from: X.AgJ, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26851AgJ {
    public final ExtraFeeStatement LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C26851AgJ) && o.LJ(this.LIZ, ((C26851AgJ) obj).LIZ);
    }

    public final int hashCode() {
        ExtraFeeStatement extraFeeStatement = this.LIZ;
        if (extraFeeStatement == null) {
            return 0;
        }
        return extraFeeStatement.hashCode();
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ExtraFeeHintVO(extraFeeStatement=");
        LIZ.append(this.LIZ);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public C26851AgJ(ExtraFeeStatement extraFeeStatement) {
        this.LIZ = extraFeeStatement;
    }
}
