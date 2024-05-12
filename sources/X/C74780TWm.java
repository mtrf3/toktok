package X;

import kotlin.jvm.internal.o;

/* renamed from: X.TWm, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C74780TWm {
    public final String LIZ;
    public final long LIZIZ;
    public long LIZJ;
    public String LIZLLL;
    public final String LJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C74780TWm)) {
            return false;
        }
        C74780TWm c74780TWm = (C74780TWm) obj;
        return o.LJ(this.LIZ, c74780TWm.LIZ) && this.LIZIZ == c74780TWm.LIZIZ;
    }

    public final int hashCode() {
        return C16880lQ.LLJIJIL(this.LIZIZ) + (this.LIZ.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("TalkEvent(toUserType=");
        LIZ.append(this.LIZ);
        LIZ.append(", toUserId=");
        return C47135Ieh.LIZIZ(LIZ, this.LIZIZ, ')', LIZ);
    }

    public C74780TWm(String str) {
        long currentUserId = ((C29374Bfu) B83.LIZ().LIZIZ()).getCurrentUserId();
        this.LIZ = str;
        this.LIZIZ = currentUserId;
        this.LIZLLL = "guest";
        this.LJ = "room";
    }
}
