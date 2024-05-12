package X;

import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class TQB {
    public static final /* synthetic */ TQB LIZ = new TQB();

    public static String LIZ(@TQC String disconnectionType) {
        o.LJIIIZ(disconnectionType, "disconnectionType");
        if (o.LJ(disconnectionType, "profile_page")) {
            return "quick_leave_normally";
        }
        return "leave_normally";
    }
}
