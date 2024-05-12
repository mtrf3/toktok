package X;

import com.ss.android.common.applog.AppLog;
import kotlin.jvm.internal.o;

/* renamed from: X.KxZ, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C53401KxZ {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(final int i, final String str, int i2) {
        if ((i2 & 1) != 0) {
            i = 1;
        }
        if ((i2 & 2) != 0) {
            str = null;
        }
        final String str2 = C53366Kx0.LJLJL;
        C53003Kr9.LIZ.getClass();
        if (!((Boolean) C53003Kr9.LIZJ.getValue()).booleanValue() || o.LJ(str2, "2")) {
            return;
        }
        FMX.LIZIZ().execute(new Runnable() { // from class: X.89u
            public final void LIZ() {
                C188727au c188727au = new C188727au();
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append(str2);
                LIZ2.append('/');
                LIZ2.append(C53363Kwx.LIZ());
                c188727au.LJIIIZ("value", X1D.LIZIZ(LIZ2));
                c188727au.LJIIIZ("testId_1", ((RBX) HG3.LJIILL()).getCurUserId());
                c188727au.LJIIIZ("testId_2", AppLog.getServerDeviceId());
                c188727au.LIZLLL(i, "position");
                c188727au.LJIIIZ("real_value", str);
                FMX.LJIIL("system_notification_box_error_report", c188727au.LIZ);
            }

            @Override // java.lang.Runnable
            public final void run() {
                boolean LIZ2;
                try {
                    LIZ();
                } finally {
                    if (LIZ2) {
                    }
                }
            }
        });
    }
}
