package X;

import Y.IDRunnableS3S0100100;
import android.os.SystemClock;
import com.ss.android.ugc.bytex.pthread.base.proxy.PthreadThread;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadFactory;

/* renamed from: X.1mz, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C43331mz extends UF5 {
    public static ExecutorService LIZLLL;
    public int LIZIZ;
    public final C1HQ LIZ = new C1HQ();
    public long LIZJ = -1;

    public static void LJIIL() {
        if (LIZLLL == null) {
            synchronized (C43331mz.class) {
                if (LIZLLL == null) {
                    LIZLLL = C16880lQ.LLLLZI(1, new ThreadFactory() { // from class: X.0lw
                        @Override // java.util.concurrent.ThreadFactory
                        public final Thread newThread(Runnable runnable) {
                            return new PthreadThread(runnable, "image-net-requests-monitor");
                        }
                    });
                }
            }
        }
    }

    @Override // X.UF5, X.InterfaceC81754W6s
    public final void LJ(String str) {
        this.LIZ.remove(str);
    }

    @Override // X.UF5, X.InterfaceC81754W6s
    public final void LIZIZ(String str, String str2, java.util.Map<String, String> map) {
        List list = (List) this.LIZ.getOrDefault(str, null);
        if (list != null) {
            list.add(str2);
        }
    }

    @Override // X.UF5, X.InterfaceC81754W6s
    public final void LJIIIIZZ(W5O w5o, String str, boolean z) {
        List list = (List) this.LIZ.remove(str);
        if (list != null && list.contains("NetworkFetchProducer")) {
            android.net.Uri uri = w5o.LIZIZ;
            long j = -1;
            if (this.LIZJ > 0) {
                long elapsedRealtime = SystemClock.elapsedRealtime() - this.LIZJ;
                this.LIZJ = -1L;
                j = elapsedRealtime;
            }
            LJIIL();
            LIZLLL.submit(new IDRunnableS3S0100100(uri, j, 1));
        }
    }

    @Override // X.UF5, X.InterfaceC81754W6s
    public final void LJFF(W5O w5o, String str, Throwable th, boolean z) {
        this.LIZ.remove(str);
        int i = 1;
        int i2 = this.LIZIZ - 1;
        this.LIZIZ = i2;
        if (i2 == 0) {
            LJIIL();
            LIZLLL.submit(new C09H(i, th, w5o));
        }
    }

    @Override // X.UF5, X.InterfaceC81754W6s
    public final void LJIIJ(W5O w5o, Object obj, String str, boolean z) {
        this.LIZ.put(str, new LinkedList());
        if (this.LIZJ == -1) {
            this.LIZJ = SystemClock.elapsedRealtime();
        }
    }
}
