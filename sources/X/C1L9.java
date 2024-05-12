package X;

import defpackage.q;
import kotlin.jvm.internal.o;

/* renamed from: X.1L9, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1L9 extends AbstractC07660Ru {
    public final String LIZ;
    public final String LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1L9)) {
            return false;
        }
        C1L9 c1l9 = (C1L9) obj;
        return o.LJ(this.LIZ, c1l9.LIZ) && o.LJ(this.LIZIZ, c1l9.LIZIZ);
    }

    public final int hashCode() {
        return this.LIZIZ.hashCode() + (this.LIZ.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ShowToast(msg=");
        LIZ.append(this.LIZ);
        LIZ.append(", msgId=");
        return q.LIZIZ(LIZ, this.LIZIZ, ')', LIZ);
    }

    public C1L9(String str, String str2) {
        this.LIZ = str;
        this.LIZIZ = str2;
    }
}
