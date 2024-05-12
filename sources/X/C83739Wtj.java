package X;

import android.app.Application;
import kotlin.jvm.internal.o;

/* renamed from: X.Wtj, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C83739Wtj {
    public static HV5 LIZ;
    public static Application LIZIZ;

    public static Application LIZ() {
        Application application = LIZIZ;
        if (application != null) {
            return application;
        }
        o.LJIJI("applicationContext");
        throw null;
    }

    public static HV5 LIZIZ() {
        HV5 hv5 = LIZ;
        if (hv5 != null) {
            return hv5;
        }
        o.LJIJI("context");
        throw null;
    }
}
