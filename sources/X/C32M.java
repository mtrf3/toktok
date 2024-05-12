package X;

import kotlin.jvm.internal.o;

/* renamed from: X.32M, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C32M {
    public final Long LIZ;
    public final Long LIZIZ;
    public final Long LIZJ;
    public final Long LIZLLL;
    public final Long LJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C32M)) {
            return false;
        }
        C32M c32m = (C32M) obj;
        return o.LJ(this.LIZ, c32m.LIZ) && o.LJ(this.LIZIZ, c32m.LIZIZ) && o.LJ(this.LIZJ, c32m.LIZJ) && o.LJ(this.LIZLLL, c32m.LIZLLL) && o.LJ(this.LJ, c32m.LJ);
    }

    public final int hashCode() {
        Long l = this.LIZ;
        int hashCode = (l == null ? 0 : l.hashCode()) * 31;
        Long l2 = this.LIZIZ;
        int hashCode2 = (hashCode + (l2 == null ? 0 : l2.hashCode())) * 31;
        Long l3 = this.LIZJ;
        int hashCode3 = (hashCode2 + (l3 == null ? 0 : l3.hashCode())) * 31;
        Long l4 = this.LIZLLL;
        int hashCode4 = (hashCode3 + (l4 == null ? 0 : l4.hashCode())) * 31;
        Long l5 = this.LJ;
        return hashCode4 + (l5 != null ? l5.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("UnreadIndicatorParameters(targetMessageIndex=");
        LIZ.append(this.LIZ);
        LIZ.append(", messageCountToLoad=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", unreadCount=");
        LIZ.append(this.LIZJ);
        LIZ.append(", unreadMentionCount=");
        LIZ.append(this.LIZLLL);
        LIZ.append(", lastUnreadMentionIndex=");
        return JBR.LJ(LIZ, this.LJ, ')', LIZ);
    }

    public C32M(Long l, Long l2, Long l3, Long l4, Long l5) {
        this.LIZ = l;
        this.LIZIZ = l2;
        this.LIZJ = l3;
        this.LIZLLL = l4;
        this.LJ = l5;
    }
}
