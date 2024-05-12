package X;

import defpackage.q;
import kotlin.jvm.internal.o;

/* renamed from: X.9CJ, reason: invalid class name */
/* loaded from: classes5.dex */
public final class C9CJ {
    public final String LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C9CJ) && o.LJ(this.LIZ, ((C9CJ) obj).LIZ);
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
        LIZ.append("USChangeAddressMsgVO(msgValue=");
        return q.LIZIZ(LIZ, this.LIZ, ')', LIZ);
    }

    public C9CJ(String str) {
        this.LIZ = str;
    }
}
