package X;

import com.bytedance.android.livesdk.chatroom.api.BenefitView;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class CDP {
    public final int LIZ;
    public final BenefitView LIZIZ;

    public CDP() {
        this(0, 3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CDP)) {
            return false;
        }
        CDP cdp = (CDP) obj;
        return this.LIZ == cdp.LIZ && o.LJ(this.LIZIZ, cdp.LIZIZ);
    }

    public final int hashCode() {
        int i = this.LIZ * 31;
        BenefitView benefitView = this.LIZIZ;
        return i + (benefitView == null ? 0 : benefitView.hashCode());
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("PrivilegeItemData(viewType=");
        LIZ.append(this.LIZ);
        LIZ.append(", benefitView=");
        LIZ.append(this.LIZIZ);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public /* synthetic */ CDP(int i, int i2) {
        this((i2 & 1) != 0 ? 0 : i, (BenefitView) null);
    }

    public CDP(int i, BenefitView benefitView) {
        this.LIZ = i;
        this.LIZIZ = benefitView;
    }
}
