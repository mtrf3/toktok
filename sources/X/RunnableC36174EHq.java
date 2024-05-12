package X;

import android.text.TextUtils;
import com.bytedance.crash.Npth;
import com.ss.android.common.applog.AppLog;
import java.util.HashMap;

/* renamed from: X.EHq, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class RunnableC36174EHq implements Runnable {
    public static final RunnableC36174EHq LJLIL = new RunnableC36174EHq();

    public static void LIZ() {
        if (!TextUtils.isEmpty(AppLog.getServerDeviceId())) {
            synchronized (O3U.class) {
                C61520OCm LJII = O3U.LJII(C38943FQd.LIZ());
                if (LJII != null) {
                    LJII.LIZIZ("normal", null, null, new C40323Fs7());
                }
            }
            HashMap hashMap = new HashMap();
            hashMap.put("gecko_version", "3.4.2.2-bugfix");
            Npth.addTags(hashMap);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            LIZ();
        } finally {
            if (LIZ) {
            }
        }
    }
}
