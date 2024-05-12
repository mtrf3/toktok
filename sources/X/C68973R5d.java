package X;

import defpackage.i0;
import kotlin.jvm.internal.o;

/* renamed from: X.R5d, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C68973R5d {
    public static String LIZ(String str) {
        return i0.LJFF(str, "_is_show");
    }

    public static boolean LIZIZ(EnumC85993Xoz type) {
        o.LJIIIZ(type, "type");
        if (type != EnumC85993Xoz.GOOGLE) {
            return true;
        }
        QB3 LIZ = QBA.LIZIZ().LIZ("google_web");
        if (LIZ != null && LIZ.LJJZZIII()) {
            return true;
        }
        QB3 LIZ2 = QBA.LIZIZ().LIZ("google");
        if (LIZ2 != null && LIZ2.LJJZZIII()) {
            return true;
        }
        return false;
    }
}
