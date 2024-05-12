package X;

import com.ss.android.ugc.aweme.im.service.model.ActivityStatus;
import kotlin.jvm.internal.o;

/* renamed from: X.3AD, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3AD {
    public final String LIZ;
    public final long LIZIZ;
    public final ActivityStatus LIZJ;
    public final C3A8 LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3AD)) {
            return false;
        }
        C3AD c3ad = (C3AD) obj;
        return o.LJ(this.LIZ, c3ad.LIZ) && this.LIZIZ == c3ad.LIZIZ && o.LJ(this.LIZJ, c3ad.LIZJ) && this.LIZLLL == c3ad.LIZLLL;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ActivityStatusQuery(userID=");
        LIZ.append(this.LIZ);
        LIZ.append(", lastUpdated=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", status=");
        LIZ.append(this.LIZJ);
        LIZ.append(", cacheState=");
        LIZ.append(this.LIZLLL);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public final int hashCode() {
        int hashCode;
        int LIZJ = JBR.LIZJ(this.LIZIZ, this.LIZ.hashCode() * 31, 31);
        ActivityStatus activityStatus = this.LIZJ;
        if (activityStatus == null) {
            hashCode = 0;
        } else {
            hashCode = activityStatus.hashCode();
        }
        return this.LIZLLL.hashCode() + ((LIZJ + hashCode) * 31);
    }

    public /* synthetic */ C3AD(String str, long j, ActivityStatus activityStatus) {
        this(str, j, activityStatus, C3A8.INITIAL_STATE);
    }

    public C3AD(String userID, long j, ActivityStatus activityStatus, C3A8 cacheState) {
        o.LJIIIZ(userID, "userID");
        o.LJIIIZ(cacheState, "cacheState");
        this.LIZ = userID;
        this.LIZIZ = j;
        this.LIZJ = activityStatus;
        this.LIZLLL = cacheState;
    }

    public static C3AD LIZ(C3AD c3ad, long j, C3A8 c3a8, int i) {
        String userID;
        C3A8 cacheState = c3a8;
        long j2 = j;
        ActivityStatus activityStatus = null;
        if ((i & 1) != 0) {
            userID = c3ad.LIZ;
        } else {
            userID = null;
        }
        if ((i & 2) != 0) {
            j2 = c3ad.LIZIZ;
        }
        if ((i & 4) != 0) {
            activityStatus = c3ad.LIZJ;
        }
        if ((i & 8) != 0) {
            cacheState = c3ad.LIZLLL;
        }
        c3ad.getClass();
        o.LJIIIZ(userID, "userID");
        o.LJIIIZ(cacheState, "cacheState");
        return new C3AD(userID, j2, activityStatus, cacheState);
    }
}
