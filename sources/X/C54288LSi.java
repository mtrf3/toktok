package X;

import com.bytedance.keva.Keva;
import com.ss.android.common.applog.AppLog;

/* renamed from: X.LSi, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C54288LSi {
    public static String LIZIZ = AppLog.getServerDeviceId();
    public static C54288LSi LIZJ;
    public final Keva LIZ;

    public C54288LSi() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("inbox_moving_reminder");
        LIZ.append(LIZIZ);
        this.LIZ = Keva.getRepo(X1D.LIZIZ(LIZ));
    }
}
