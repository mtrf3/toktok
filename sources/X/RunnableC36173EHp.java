package X;

import android.text.TextUtils;
import com.ss.android.common.applog.AppLog;

/* renamed from: X.EHp, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class RunnableC36173EHp implements Runnable {
    public static final RunnableC36173EHp LJLIL = new RunnableC36173EHp();

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            if (!TextUtils.isEmpty(AppLog.getServerDeviceId())) {
                synchronized (O3U.class) {
                    C61520OCm LJIIIZ = O3U.LJIIIZ();
                    if (LJIIIZ != null) {
                        LJIIIZ.LIZIZ("high_priority", null, null, new C40323Fs7());
                    }
                }
            }
        } finally {
            if (LIZ) {
            }
        }
    }
}
