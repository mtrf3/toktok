package X;

import com.ss.android.ugc.aweme.im.service.appsettings.ActivityStatusConfig;
import com.ss.android.ugc.aweme.im.service.model.ActivityStatus;
import kotlin.jvm.internal.o;

/* renamed from: X.3AF, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3AF {
    public final InterfaceC65784Pro<Long> LIZ;
    public final C0M6<String, C3AD> LIZIZ;

    public C3AF(int i) {
        C3AL.LIZ.getClass();
        ActivityStatusConfig config = C3AL.LIZ();
        C3AG currentTimeUnix = C3AG.LJLIL;
        o.LJIIIZ(config, "config");
        o.LJIIIZ(currentTimeUnix, "currentTimeUnix");
        this.LIZ = currentTimeUnix;
        this.LIZIZ = new C0M6<>(config.maxCacheSize);
    }

    public final C3AD LIZ(C3AD c3ad, long j) {
        long j2;
        long j3;
        C3A8 c3a8;
        ActivityStatus activityStatus;
        if (!C3AA.LIZIZ) {
            C3AD LIZ = C3AD.LIZ(c3ad, j, null, 13);
            this.LIZIZ.LIZJ(c3ad.LIZ, LIZ);
            return LIZ;
        }
        C3AD LIZIZ = this.LIZIZ.LIZIZ(c3ad.LIZ);
        if (LIZIZ != null && (activityStatus = LIZIZ.LIZJ) != null) {
            j2 = activityStatus.activeTime;
        } else {
            j2 = 0;
        }
        ActivityStatus activityStatus2 = c3ad.LIZJ;
        if (activityStatus2 != null) {
            j3 = activityStatus2.activeTime;
        } else {
            j3 = 0;
        }
        if (LIZIZ == null || (c3a8 = LIZIZ.LIZLLL) == null) {
            c3a8 = C3A8.INITIAL_STATE;
        }
        if (j3 == 0) {
            C3AD LIZ2 = C3AD.LIZ(c3ad, j, C3A8.INITIAL_STATE, 5);
            this.LIZIZ.LIZJ(c3ad.LIZ, LIZ2);
            return LIZ2;
        }
        if (j3 <= j2) {
            if (LIZIZ == null) {
                return null;
            }
            return C3AD.LIZ(LIZIZ, j, null, 13);
        }
        if (activityStatus2 != null && OUP.LJJII(activityStatus2, null, null, 3)) {
            c3a8 = C3A8.OPTIMIZATION_ENABLE;
        } else if (j2 > 0) {
            c3a8 = C3A8.OPTIMIZATION_ENABLE;
        } else if (j3 > 0 && c3a8 == C3A8.INITIAL_STATE) {
            c3a8 = C3A8.ACTIVITY_STATUS_ENABLE;
        }
        C3AD LIZ3 = C3AD.LIZ(c3ad, j, c3a8, 5);
        this.LIZIZ.LIZJ(c3ad.LIZ, LIZ3);
        return LIZ3;
    }
}
