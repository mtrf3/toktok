package X;

import kotlin.jvm.internal.o;

/* renamed from: X.I8y, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C46140I8y {
    public static final boolean LIZ;

    static {
        FFL.LJIIIZ().getClass();
        LIZ = FFL.LJ(31744, "enable_land_upload_photos_record_from_explore", true, false);
    }

    public static final boolean LIZ(String str) {
        if (o.LJ(str, "homepage_explore") && LIZ) {
            return true;
        }
        return false;
    }
}
