package X;

import ujb.o;

/* renamed from: X.6kM, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C169106kM {
    public static final /* synthetic */ int LIZ = 0;

    public static boolean LIZ(String str) {
        if (str == null || str.length() == 0) {
            return false;
        }
        if (o.LJJJLIIL(str, "http://", false) || o.LJJJLIIL(str, "https://", false)) {
            return true;
        }
        return false;
    }
}
