package X;

import kotlin.jvm.internal.o;
import webcast.api.partnership.AnchorInfoResponse;

/* renamed from: X.Bx6, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C30440Bx6 {
    public final boolean LIZ = true;
    public final AnchorInfoResponse.ResponseData LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C30440Bx6)) {
            return false;
        }
        C30440Bx6 c30440Bx6 = (C30440Bx6) obj;
        return this.LIZ == c30440Bx6.LIZ && o.LJ(this.LIZIZ, c30440Bx6.LIZIZ);
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
        AnchorInfoResponse.ResponseData responseData = this.LIZIZ;
        return i + (responseData == null ? 0 : responseData.hashCode());
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("GamePartnershipEntranceInfo(permission=");
        LIZ.append(this.LIZ);
        LIZ.append(", info=");
        LIZ.append(this.LIZIZ);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public C30440Bx6(AnchorInfoResponse.ResponseData responseData) {
        this.LIZIZ = responseData;
    }
}
