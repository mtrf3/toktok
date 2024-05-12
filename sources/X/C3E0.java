package X;

import com.bytedance.keva.Keva;
import kotlin.jvm.internal.o;

/* renamed from: X.3E0, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3E0 {
    public static final C3E0 LIZ = new C3E0();
    public static final Keva LIZIZ;

    static {
        Keva repo = Keva.getRepo("repo_mention_privacy_update");
        o.LJIIIIZZ(repo, "getRepo(IMConstants.REPO_MENTION_PRIVACY_UPDATE)");
        LIZIZ = repo;
    }

    public static boolean LIZ() {
        if ((System.currentTimeMillis() - LIZIZ.getLong("key_cold_start_time", 0L)) / 1000 >= J9A.LIZIZ("im_mention_check_valid_duration_for_cold_start", 86400L)) {
            return true;
        }
        return false;
    }

    public static void LIZJ(int i) {
        if (i != 0) {
            if (i != 1) {
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("Illegal argument of startType=");
                LIZ2.append(i);
                C34B.LIZIZ("MentionPrivacyUpdate", X1D.LIZIZ(LIZ2));
                return;
            }
            LIZIZ.storeLong("key_warm_start_time", System.currentTimeMillis());
            return;
        }
        LIZIZ.storeLong("key_cold_start_time", System.currentTimeMillis());
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZIZ(X.InterfaceC67352kd<? super X.C76800UCe> r15) {
        /*
            Method dump skipped, instructions count: 547
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C3E0.LIZIZ(X.2kd):java.lang.Object");
    }
}
