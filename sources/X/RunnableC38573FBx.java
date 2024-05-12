package X;

import com.bytedance.crash.CrashType;
import com.bytedance.crash.Npth;
import com.ss.android.ugc.aweme.ecommercebase.monitor.PageMonitor;

/* renamed from: X.FBx, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class RunnableC38573FBx implements Runnable {
    public static final RunnableC38573FBx LJLIL = new RunnableC38573FBx();

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            Npth.addAttachUserData(PageMonitor.LJIIIIZZ, CrashType.JAVA);
            Npth.addTag("is_ecom", "1");
        } finally {
            if (LIZ) {
            }
        }
    }
}
