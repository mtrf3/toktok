package X;

import android.content.Context;
import com.ss.android.ugc.aweme.commercialize.download.depend.DownloadConfigDepend;
import com.ss.android.ugc.aweme.commercialize.download.depend.DownloadMonitorLogSender;
import com.ss.android.ugc.aweme.download.component_api.service.IDownloadService;
import com.ss.android.ugc.aweme.download.impl.component_impl.DownloadServiceImpl;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.NeQ, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C59858NeQ {
    public static final AtomicBoolean LIZ = new AtomicBoolean(false);

    public static void LIZ(Context context) {
        IDownloadService LIZJ;
        AtomicBoolean atomicBoolean = LIZ;
        if (atomicBoolean.get()) {
            return;
        }
        synchronized (atomicBoolean) {
            if (atomicBoolean.compareAndSet(false, true) && (LIZJ = DownloadServiceImpl.LIZJ()) != null) {
                LIZJ.LIZ(context, new DownloadMonitorLogSender(), new DownloadConfigDepend());
                if (FCD.LJI(context)) {
                    LIZJ.LIZIZ(new C79043V0l());
                }
            }
        }
    }
}
