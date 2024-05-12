package X;

import android.app.Notification;
import android.os.Build;
import androidx.work.impl.foreground.SystemForegroundService;
import java.io.PrintStream;

/* renamed from: X.0mz, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC17850mz implements Runnable {
    public final /* synthetic */ int LJLIL;
    public final /* synthetic */ Notification LJLILLLLZI;
    public final /* synthetic */ int LJLJI;
    public final /* synthetic */ SystemForegroundService LJLJJI;

    public final void LIZ() {
        if (Build.VERSION.SDK_INT >= 29) {
            this.LJLJJI.startForeground(this.LJLIL, this.LJLILLLLZI, this.LJLJI);
            return;
        }
        SystemForegroundService systemForegroundService = this.LJLJJI;
        int i = this.LJLIL;
        Notification notification = this.LJLILLLLZI;
        if (C40684Fxw.LIZ() && systemForegroundService != null) {
            PrintStream printStream = System.err;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("service info---->:");
            LIZ.append(systemForegroundService.getClass().getCanonicalName());
            printStream.println(X1D.LIZIZ(LIZ));
        }
        systemForegroundService.startForeground(i, notification);
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

    public RunnableC17850mz(SystemForegroundService systemForegroundService, int i, Notification notification, int i2) {
        this.LJLJJI = systemForegroundService;
        this.LJLIL = i;
        this.LJLILLLLZI = notification;
        this.LJLJI = i2;
    }
}
