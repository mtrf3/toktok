package X;

import com.bytedance.android.live.wallet.model.IapProductBuyResult;
import kotlin.jvm.internal.o;

/* renamed from: X.A2v, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C25597A2v {
    public final boolean LIZ;
    public final IapProductBuyResult LIZIZ;

    public C25597A2v() {
        this(false, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C25597A2v)) {
            return false;
        }
        C25597A2v c25597A2v = (C25597A2v) obj;
        return this.LIZ == c25597A2v.LIZ && o.LJ(this.LIZIZ, c25597A2v.LIZIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    public final int hashCode() {
        boolean z = this.LIZ;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int i = r0 * 31;
        IapProductBuyResult iapProductBuyResult = this.LIZIZ;
        return i + (iapProductBuyResult == null ? 0 : iapProductBuyResult.hashCode());
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("PaidContentPurchaseStatusModel(purchaseSuccess=");
        LIZ.append(this.LIZ);
        LIZ.append(", purchaseResult=");
        LIZ.append(this.LIZIZ);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public C25597A2v(boolean z, IapProductBuyResult iapProductBuyResult) {
        this.LIZ = z;
        this.LIZIZ = iapProductBuyResult;
    }
}
