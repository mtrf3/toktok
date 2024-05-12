package X;

import com.ss.android.ugc.aweme.model.Price;
import kotlin.jvm.internal.o;

/* renamed from: X.9pf, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C248839pf extends AbstractC248869pi {
    public final Price LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C248839pf) && o.LJ(this.LIZ, ((C248839pf) obj).LIZ);
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Selection(price=");
        LIZ.append(this.LIZ);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public C248839pf(Price price) {
        o.LJIIIZ(price, "price");
        this.LIZ = price;
    }
}
