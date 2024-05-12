package X;

import com.ss.ttvideoengine.TTVideoEngine;
import com.ss.ttvideoengine.utils.TTVideoEngineLog;
import java.lang.ref.WeakReference;

/* renamed from: X.IhV, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public class RunnableC47309IhV implements Runnable {
    public final WeakReference<TTVideoEngine> LJLIL;
    public final long LJLILLLLZI;

    public final void LIZ() {
        C47311IhX c47311IhX;
        TTVideoEngine tTVideoEngine = this.LJLIL.get();
        if (tTVideoEngine != null && (c47311IhX = C47311IhX.LIZLLL) != null) {
            long j = this.LJLILLLLZI;
            synchronized (c47311IhX) {
                if (!c47311IhX.LIZ.containsKey(Long.valueOf(j))) {
                    c47311IhX.LIZ.put(Long.valueOf(j), new WeakReference<>(tTVideoEngine));
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("new engine: ");
                    LIZ.append(j);
                    TTVideoEngineLog.d("VideoInfoCollecor", X1D.LIZIZ(LIZ));
                }
            }
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

    public RunnableC47309IhV(long j, TTVideoEngine tTVideoEngine) {
        this.LJLIL = new WeakReference<>(tTVideoEngine);
        this.LJLILLLLZI = j;
    }
}
