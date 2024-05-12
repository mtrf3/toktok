package X;

import Y.ARunnableS10S0101000_6;
import com.ss.android.ugc.bytex.pthread.base.proxy.PthreadThread;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadFactory;

/* renamed from: X.FMh, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38843FMh {
    public final ExecutorService LIZ;
    public final java.util.Map<String, Object> LIZIZ;

    public C38843FMh() {
        C38027EwB c38027EwB = new C38027EwB(FSY.FIXED);
        c38027EwB.LIZIZ = "cold-boot-preload";
        c38027EwB.LJI = new ThreadFactory() { // from class: X.FMm
            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                return new PthreadThread(new ARunnableS10S0101000_6(2, runnable, 8), "ColdBootCacheProvider");
            }
        };
        c38027EwB.LIZJ = 1;
        this.LIZ = C37191Eih.LIZ(c38027EwB);
        this.LIZIZ = new ConcurrentHashMap();
    }
}
