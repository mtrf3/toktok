package X;

import kotlin.jvm.internal.o;

/* renamed from: X.4Iu, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C107244Iu {
    public static final /* synthetic */ int LIZ = 0;

    public static boolean LIZIZ(String str) {
        if (str == null || str.length() == 0) {
            return true;
        }
        return false;
    }

    public static boolean LIZ(String str, String str2) {
        if (LIZIZ(str) && LIZIZ(str2)) {
            return true;
        }
        return o.LJ(str, str2);
    }
}
