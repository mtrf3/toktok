package X;

import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.LogisticPromotion;
import defpackage.q;
import kotlin.jvm.internal.o;

/* renamed from: X.AfU, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26800AfU {
    public final LogisticPromotion LIZ;
    public final String LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C26800AfU)) {
            return false;
        }
        C26800AfU c26800AfU = (C26800AfU) obj;
        return o.LJ(this.LIZ, c26800AfU.LIZ) && o.LJ(this.LIZIZ, c26800AfU.LIZIZ);
    }

    public final int hashCode() {
        int hashCode = this.LIZ.hashCode() * 31;
        String str = this.LIZIZ;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("DeliveryPromotionVO(promotion=");
        LIZ.append(this.LIZ);
        LIZ.append(", couponDaInfo=");
        return q.LIZIZ(LIZ, this.LIZIZ, ')', LIZ);
    }

    public C26800AfU(LogisticPromotion logisticPromotion, String str) {
        this.LIZ = logisticPromotion;
        this.LIZIZ = str;
    }
}
