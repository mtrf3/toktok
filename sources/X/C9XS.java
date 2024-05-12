package X;

import defpackage.q;
import kotlin.jvm.internal.o;

/* renamed from: X.9XS, reason: invalid class name */
/* loaded from: classes5.dex */
public final class C9XS {
    public final String LIZ;
    public final C245589kQ LIZIZ = new C245589kQ(200);

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C9XS) && o.LJ(this.LIZ, ((C9XS) obj).LIZ);
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
        LIZ.append("ConsumeModel(eventType=");
        return q.LIZIZ(LIZ, this.LIZ, ')', LIZ);
    }

    public C9XS(String str) {
        this.LIZ = str;
    }
}
