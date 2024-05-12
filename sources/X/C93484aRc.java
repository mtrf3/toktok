package X;

import kotlin.jvm.internal.o;

/* renamed from: X.aRc, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C93484aRc {
    public final long LIZ;
    public final EnumC93483aRb LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C93484aRc)) {
            return false;
        }
        C93484aRc c93484aRc = (C93484aRc) obj;
        return this.LIZ == c93484aRc.LIZ && o.LJ(this.LIZIZ, c93484aRc.LIZIZ);
    }

    public final int hashCode() {
        int LLJIJIL = C16880lQ.LLJIJIL(this.LIZ) * 31;
        EnumC93483aRb enumC93483aRb = this.LIZIZ;
        return LLJIJIL + (enumC93483aRb != null ? enumC93483aRb.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("CanvasFeatureOperateData(featureId=");
        LIZ.append(this.LIZ);
        LIZ.append(", type=");
        LIZ.append(this.LIZIZ);
        LIZ.append(")");
        return X1D.LIZIZ(LIZ);
    }

    public C93484aRc(long j, EnumC93483aRb type) {
        o.LJIIIZ(type, "type");
        this.LIZ = j;
        this.LIZIZ = type;
    }
}
