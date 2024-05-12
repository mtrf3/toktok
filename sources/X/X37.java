package X;

import Y.ARunnableS51S0100000_15;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import com.ss.android.socialbase.downloader.downloader.DownloadService;
import java.util.concurrent.ExecutorService;

/* loaded from: classes16.dex */
public final class X37 extends X36 {
    public static final String LJLJLLL = C16880lQ.LJLLJ(X37.class);

    @Override // X.X36, X.InterfaceC84204X2y
    public final void LIZJ() {
        this.LJLJI = true;
        this.LJLJJL = false;
        if (C65210PiY.LIZ()) {
            C65210PiY.LIZIZ(LJLJLLL, "onStartCommandOnMainThread", "Run");
        }
    }

    @Override // X.X36, X.InterfaceC84204X2y
    public final void LJ() {
        if (C65210PiY.LIZ()) {
            C65210PiY.LIZIZ(LJLJLLL, "onStartCommand", "Run");
        }
        LJI();
    }

    @Override // X.X36
    public final void LJII(Context context, ServiceConnection serviceConnection) {
        try {
            C16880lQ.LLLL(context, new Intent(context, (Class<?>) DownloadService.class));
        } catch (Throwable unused) {
            LIZJ();
            ExecutorService LJFF = C84212X3g.LJFF();
            if (LJFF != null) {
                LJFF.execute(new ARunnableS51S0100000_15(this, 9));
            }
        }
    }
}
