package X;

import com.bytedance.keva.Keva;

/* loaded from: classes12.dex */
public final class PM9 implements Runnable {
    public static final PM9 LJLIL = new PM9();

    public static void LIZ() {
        try {
            if (C36839Ed1.LIZIZ(EF7.LIZIZ())) {
                Keva keva = PMA.LIZIZ;
                OQY oqy = OQY.INSTANCE;
                java.util.Set<String> stringSet = keva.getStringSet("allow_service_name", oqy);
                java.util.Set<String> stringSet2 = keva.getStringSet("allow_log_type", oqy);
                if ((stringSet != null && !stringSet.isEmpty()) || (stringSet2 != null && !stringSet2.isEmpty())) {
                    PMA.LIZJ = new C1FC(2, stringSet, stringSet2);
                }
            }
        } catch (Throwable unused) {
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            LIZ();
        } finally {
            if (LIZ) {
            }
        }
    }
}
