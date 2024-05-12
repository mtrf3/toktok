package X;

import ujb.o;

/* renamed from: X.EkU, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37302EkU {
    public static final String LIZ(android.net.Uri uri) {
        String scheme;
        if (!uri.isHierarchical() || (scheme = uri.getScheme()) == null || !o.LJJJLIIL(scheme, "http", false) || uri.getHost() == null || uri.getPath() == null) {
            return null;
        }
        return kotlin.jvm.internal.o.LJIILLIIL(uri.getPath(), uri.getHost());
    }

    public static boolean LIZIZ(android.net.Uri uri) {
        if (!uri.isHierarchical()) {
            return false;
        }
        if ((!kotlin.jvm.internal.o.LJ(uri.getScheme(), "http") && !kotlin.jvm.internal.o.LJ(uri.getScheme(), "https")) || uri.getHost() == null || uri.getPath() == null) {
            return false;
        }
        return true;
    }
}
