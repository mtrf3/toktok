package X;

import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import com.ss.android.ugc.bytex.pthread.base.proxy.PThreadPoolExecutor;
import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

/* renamed from: X.Qne, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C68074Qne {
    public static volatile C68074Qne LJII;
    public final String LIZ = "FA";
    public final C67688QhQ LIZIZ = C67688QhQ.LIZ;
    public final ExecutorService LIZJ;
    public final V8Q LIZLLL;
    public int LJ;
    public boolean LJFF;
    public volatile InterfaceC68207Qpn LJI;

    public final void LIZIZ(AbstractRunnableC68155Qox abstractRunnableC68155Qox) {
        this.LIZJ.execute(abstractRunnableC68155Qox);
    }

    public C68074Qne(Context context, Bundle bundle) {
        PThreadPoolExecutor pThreadPoolExecutor = new PThreadPoolExecutor(1, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new ThreadFactoryC39011FSt());
        pThreadPoolExecutor.allowCoreThreadTimeOut(true);
        this.LIZJ = Executors.unconfigurableExecutorService(pThreadPoolExecutor);
        this.LIZLLL = new V8Q(this);
        new ArrayList();
        try {
            if (C78540Us4.LJJIJ(context, C68053QnJ.LIZ(context)) != null) {
                try {
                    Class.forName("com.google.firebase.analytics.FirebaseAnalytics");
                } catch (ClassNotFoundException unused) {
                    this.LJFF = true;
                    return;
                }
            }
        } catch (IllegalStateException unused2) {
        }
        LIZIZ(new C68156Qoy(this, context, bundle));
        Application application = (Application) C16880lQ.LLLLL(context);
        if (application == null) {
            return;
        }
        application.registerActivityLifecycleCallbacks(new C68217Qpx(this));
    }

    public static C68074Qne LIZJ(Context context, Bundle bundle) {
        QH7.LJIIIIZZ(context);
        if (LJII == null) {
            synchronized (C68074Qne.class) {
                if (LJII == null) {
                    LJII = new C68074Qne(context, bundle);
                }
            }
        }
        return LJII;
    }

    public final void LIZ(Exception exc, boolean z, boolean z2) {
        this.LJFF |= z;
        if (!z && z2) {
            LIZIZ(new C68154Qow(this, "Error with data collection. Data lost.", exc));
        }
    }
}
