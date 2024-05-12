package X;

import defpackage.q;
import kotlin.jvm.internal.o;

/* renamed from: X.AeR, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26735AeR {
    public String LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C26735AeR) && o.LJ(this.LIZ, ((C26735AeR) obj).LIZ);
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
        LIZ.append("USLogisticSelectByZipcodeVO(inputValue=");
        return q.LIZIZ(LIZ, this.LIZ, ')', LIZ);
    }

    public C26735AeR(String str) {
        this.LIZ = str;
    }
}
