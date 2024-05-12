package X;

import java.util.HashSet;

/* renamed from: X.0GR, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0GR {
    public static final java.util.Set<String> LIZ = new HashSet();
    public static int LIZIZ = 0;

    public static void LIZ() {
        int i = LIZIZ;
        if (i > 0) {
            LIZIZ = i - 1;
        }
    }

    public static void LIZIZ(String str) {
        java.util.Set<String> set = LIZ;
        if (((HashSet) set).contains(str)) {
            return;
        }
        ((HashSet) set).add(str);
    }
}
