package X;

import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.friends.service.ISocialFriendsService;
import com.ss.android.ugc.aweme.ug.UgCommonServiceImpl;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class UQB {
    public static final UQB LIZ = new UQB();
    public static final Keva LIZIZ;
    public static Boolean LIZJ;
    public static Boolean LIZLLL;

    static {
        Keva repo = Keva.getRepo("repo_new_version_journey");
        o.LJIIIIZZ(repo, "getRepo(FriendsConstants.REPO_NEW_VERSION_JOURNEY)");
        LIZIZ = repo;
    }

    public static void LIZ() {
        Keva keva = LIZIZ;
        keva.storeBoolean("key_new_version", false);
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("key_cache_ready_");
        LIZ2.append(LIZIZ());
        keva.storeBoolean(X1D.LIZIZ(LIZ2), true);
    }

    public static final boolean LIZLLL() {
        Keva keva = LIZIZ;
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("key_rec_friends_has_shown_");
        LIZ.getClass();
        LIZ2.append(LIZIZ());
        return keva.getBoolean(X1D.LIZIZ(LIZ2), false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0026, code lost:
    
        if (X.UPT.LIZIZ() != false) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean LJ() {
        /*
            java.lang.Boolean r0 = X.UQB.LIZLLL
            if (r0 != 0) goto L2e
            X.UUc r0 = X.C77266UUc.LIZIZ
            X.Mfn r0 = r0.LJIILLIIL()
            boolean r0 = r0.LIZJ()
            if (r0 != 0) goto L38
            X.UQB r0 = X.UQB.LIZ
            r0.getClass()
            r1 = 1
            boolean r0 = LIZJ(r1)
            if (r0 != 0) goto L38
            boolean r0 = X.URL.LIZ()
            if (r0 == 0) goto L38
            boolean r0 = X.UPT.LIZIZ()
            if (r0 == 0) goto L38
        L28:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
            X.UQB.LIZLLL = r0
        L2e:
            java.lang.Boolean r0 = X.UQB.LIZLLL
            kotlin.jvm.internal.o.LJI(r0)
            boolean r0 = r0.booleanValue()
            return r0
        L38:
            r1 = 0
            goto L28
        */
        throw new UnsupportedOperationException("Method not decompiled: X.UQB.LJ():boolean");
    }

    public static final boolean LJFF() {
        Boolean bool;
        boolean z;
        if (LIZJ == null) {
            C85990Xow.LIZ.getClass();
            if (!C85990Xow.LJIIL()) {
                if (!C77266UUc.LIZIZ.LJIIJ().LIZJ()) {
                    LIZ.getClass();
                    if (!LIZJ(2) && URL.LIZ() && UPT.LIZIZ()) {
                        z = true;
                        bool = Boolean.valueOf(z);
                    }
                }
                z = false;
                bool = Boolean.valueOf(z);
            } else {
                bool = Boolean.FALSE;
            }
            LIZJ = bool;
        }
        Boolean bool2 = LIZJ;
        o.LJI(bool2);
        return bool2.booleanValue();
    }

    public static String LIZIZ() {
        return ((RBX) HG3.LJIILL()).getCurUserId();
    }

    public static final boolean LJI() {
        long LJIIIZ = UgCommonServiceImpl.LJIJ().LJIIIZ();
        if (LJIIIZ == 0) {
            LJIIIZ = LIZIZ.getLong("key_first_launch_time", 0L);
        }
        if (LJIIIZ == 0 || System.currentTimeMillis() - LJIIIZ < TimeUnit.DAYS.toMillis(LIZIZ.getLong("key_rec_friends_frequency", 30L))) {
            return true;
        }
        return false;
    }

    public static boolean LIZJ(int i) {
        OSZ<Boolean, Long> LJ;
        ISocialFriendsService LJJIL = C77266UUc.LIZIZ.LJJIL();
        if (LJJIL != null && (LJ = LJJIL.LJ(i)) != null && LJ.getFirst().booleanValue() && System.currentTimeMillis() < LJ.getSecond().longValue() + 2592000000L) {
            return true;
        }
        return false;
    }
}
