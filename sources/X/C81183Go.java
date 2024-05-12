package X;

import defpackage.q;
import kotlin.jvm.internal.o;

/* renamed from: X.3Go, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C81183Go {
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C81183Go)) {
            return false;
        }
        C81183Go c81183Go = (C81183Go) obj;
        return o.LJ(this.LIZ, c81183Go.LIZ) && o.LJ(this.LIZIZ, c81183Go.LIZIZ) && o.LJ(this.LIZJ, c81183Go.LIZJ);
    }

    public final int hashCode() {
        int hashCode;
        String str = this.LIZ;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int LJ = C79062V1e.LJ(this.LIZIZ, hashCode * 31, 31);
        String str2 = this.LIZJ;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return LJ + i;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("MemberFetchParam(conversationId=");
        LIZ.append(this.LIZ);
        LIZ.append(", sender=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", secSender=");
        return q.LIZIZ(LIZ, this.LIZJ, ')', LIZ);
    }

    public C81183Go(String str, String sender, String str2) {
        o.LJIIIZ(sender, "sender");
        this.LIZ = str;
        this.LIZIZ = sender;
        this.LIZJ = str2;
    }
}
