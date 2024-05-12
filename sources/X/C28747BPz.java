package X;

import com.ss.android.ugc.bytex.pthread.base.proxy.PthreadThread;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadFactory;

/* renamed from: X.BPz, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C28747BPz {
    public volatile ExecutorService LIZ;

    public final ExecutorService LIZ() {
        if (this.LIZ == null) {
            synchronized (C28747BPz.class) {
                if (this.LIZ == null) {
                    this.LIZ = C16880lQ.LLLLZLLLI(new ThreadFactory() { // from class: X.BQ3
                        @Override // java.util.concurrent.ThreadFactory
                        public final Thread newThread(Runnable runnable) {
                            return new PthreadThread(runnable, "audio-focus-controller-thread");
                        }
                    });
                }
            }
        }
        return this.LIZ;
    }
}
