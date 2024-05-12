package X;

import defpackage.q;
import kotlin.jvm.internal.o;

/* renamed from: X.9CN, reason: invalid class name */
/* loaded from: classes5.dex */
public final class C9CN {
    public final String LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C9CN) && o.LJ(this.LIZ, ((C9CN) obj).LIZ);
    }

    public final int hashCode() {
        String str = this.LIZ;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("DeliveryPreOrderShippingVO(shippingText=");
        return q.LIZIZ(LIZ, this.LIZ, ')', LIZ);
    }

    public C9CN(String str) {
        this.LIZ = str;
    }
}
