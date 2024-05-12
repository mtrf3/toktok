package X;

import Y.ARunnableS42S0100000_6;
import android.app.Application;
import android.os.Build;
import kotlin.jvm.internal.o;

/* renamed from: X.E4d, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C35823E4d {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(Application application) {
        o.LJIIIZ(application, "application");
        if (C36152EGu.LJ() || Build.VERSION.SDK_INT >= 26 || ((Number) C35329Dtl.LIZ.getValue()).intValue() == 0) {
            return;
        }
        C38995FSd.LIZIZ().execute(new ARunnableS42S0100000_6(application, 153));
    }
}
