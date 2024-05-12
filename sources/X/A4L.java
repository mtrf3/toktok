package X;

import com.bytedance.android.live.wallet.model.IapProductGetResult;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class A4L {
    public final boolean LIZ;
    public final boolean LIZIZ;
    public final java.util.Map<String, IapProductGetResult.Item> LIZJ;

    public A4L() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof A4L)) {
            return false;
        }
        A4L a4l = (A4L) obj;
        return this.LIZ == a4l.LIZ && this.LIZIZ == a4l.LIZIZ && o.LJ(this.LIZJ, a4l.LIZJ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8 */
    public final int hashCode() {
        boolean z = this.LIZ;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int i = ((r0 * 31) + (this.LIZIZ ? 1 : 0)) * 31;
        java.util.Map<String, IapProductGetResult.Item> map = this.LIZJ;
        return i + (map == null ? 0 : map.hashCode());
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("PaidContentPriceStatusModel(priceFetchSuccess=");
        LIZ.append(this.LIZ);
        LIZ.append(", isPriceLoading=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", priceMap=");
        return C15890jp.LIZ(LIZ, this.LIZJ, ')', LIZ);
    }

    public /* synthetic */ A4L(int i) {
        this(null, false, false);
    }

    public A4L(java.util.Map map, boolean z, boolean z2) {
        this.LIZ = z;
        this.LIZIZ = z2;
        this.LIZJ = map;
    }
}
