package X;

import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.BundleInfoResponseData;
import kotlin.jvm.internal.o;

/* renamed from: X.Dyh, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C35635Dyh {
    public final BundleInfoResponseData LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C35635Dyh) && o.LJ(this.LIZ, ((C35635Dyh) obj).LIZ);
    }

    public final int hashCode() {
        BundleInfoResponseData bundleInfoResponseData = this.LIZ;
        if (bundleInfoResponseData == null) {
            return 0;
        }
        return bundleInfoResponseData.hashCode();
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("BundleDealVO(bundleDealData=");
        LIZ.append(this.LIZ);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public C35635Dyh(BundleInfoResponseData bundleInfoResponseData) {
        this.LIZ = bundleInfoResponseData;
    }
}
