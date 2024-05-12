package X;

import defpackage.s0;
import kotlin.jvm.internal.o;

/* renamed from: X.2WU, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C2WU {
    public final String LIZ;
    public final String LIZIZ;
    public final Integer LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2WU)) {
            return false;
        }
        C2WU c2wu = (C2WU) obj;
        return o.LJ(this.LIZ, c2wu.LIZ) && o.LJ(this.LIZIZ, c2wu.LIZIZ) && o.LJ(this.LIZJ, c2wu.LIZJ);
    }

    public final int hashCode() {
        int hashCode;
        int LJ = C79062V1e.LJ(this.LIZIZ, this.LIZ.hashCode() * 31, 31);
        Integer num = this.LIZJ;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        return LJ + hashCode;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("DebugUrlMessage(url=");
        LIZ.append(this.LIZ);
        LIZ.append(", message=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", type=");
        return s0.LIZJ(LIZ, this.LIZJ, ')', LIZ);
    }

    public /* synthetic */ C2WU(String str, String str2) {
        this(str, str2, 0);
    }

    public C2WU(String url, String message, Integer num) {
        o.LJIIIZ(url, "url");
        o.LJIIIZ(message, "message");
        this.LIZ = url;
        this.LIZIZ = message;
        this.LIZJ = num;
    }
}
