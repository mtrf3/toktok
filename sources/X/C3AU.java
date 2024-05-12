package X;

import kotlin.jvm.internal.o;

/* renamed from: X.3AU, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3AU {
    public static final /* synthetic */ int LIZ = 0;

    public static boolean LIZ() {
        String[] stringArray = C3AT.LIZ().getStringArray("allow_items", new String[0]);
        o.LJIIIIZZ(stringArray, "repo.getStringArray(ALLOW_ITEMS, arrayOf())");
        if (stringArray.length == 0) {
            return false;
        }
        long currentTimeMillis = System.currentTimeMillis();
        long j = C3AT.LIZ().getLong("next_push_time_in_mills", -1L);
        if (currentTimeMillis >= j || j == -1) {
            return false;
        }
        return true;
    }

    public static String LIZIZ() {
        if (LIZ()) {
            String[] stringArray = C3AT.LIZ().getStringArray("allow_items", new String[0]);
            o.LJIIIIZZ(stringArray, "repo.getStringArray(ALLOW_ITEMS, arrayOf())");
            return (String) ORY.LJJJ(stringArray);
        }
        return null;
    }
}
