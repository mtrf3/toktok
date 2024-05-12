package X;

import defpackage.q;
import kotlin.jvm.internal.o;

/* renamed from: X.3V3, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3V3 {
    public final String LIZ;
    public final String LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3V3)) {
            return false;
        }
        C3V3 c3v3 = (C3V3) obj;
        return o.LJ(this.LIZ, c3v3.LIZ) && o.LJ(this.LIZIZ, c3v3.LIZIZ);
    }

    public final int hashCode() {
        return this.LIZIZ.hashCode() + (this.LIZ.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("LogMessageTypeV2(messageTypeV2=");
        LIZ.append(this.LIZ);
        LIZ.append(", contentType=");
        return q.LIZIZ(LIZ, this.LIZIZ, ')', LIZ);
    }

    public C3V3(String str, String str2) {
        this.LIZ = str;
        this.LIZIZ = str2;
    }
}
