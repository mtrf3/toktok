package X;

import kotlin.jvm.internal.o;

/* renamed from: X.TWt, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C74787TWt {
    public final String LIZ;
    public final long LIZIZ;
    public long LIZJ;
    public String LIZLLL;
    public String LJ;
    public Long LJFF;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C74787TWt)) {
            return false;
        }
        C74787TWt c74787TWt = (C74787TWt) obj;
        return o.LJ(this.LIZ, c74787TWt.LIZ) && this.LIZIZ == c74787TWt.LIZIZ;
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

    public C74787TWt(String toUserType) {
        long currentUserId = ((C29374Bfu) B83.LIZ().LIZIZ()).getCurrentUserId();
        o.LJIIIZ(toUserType, "toUserType");
        this.LIZ = toUserType;
        this.LIZIZ = currentUserId;
        this.LIZLLL = "guest";
        this.LJ = "room";
    }

    public final void LIZ(long j, String userType, String str) {
        o.LJIIIZ(userType, "userType");
        this.LIZJ = j;
        this.LIZLLL = userType;
    }
}
