package X;

import com.ss.ttvideoengine.TTVideoEngine;
import com.ss.ttvideoengine.utils.TTVideoEngineLog;

/* renamed from: X.IhW, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public class RunnableC47310IhW implements Runnable {
    public final long LJLIL;

    public final void LIZ() {
        C47311IhX c47311IhX = C47311IhX.LIZLLL;
        if (c47311IhX != null) {
            long j = this.LJLIL;
            synchronized (c47311IhX) {
                try {
                    if (c47311IhX.LIZ.containsKey(Long.valueOf(j))) {
                        TTVideoEngine tTVideoEngine = c47311IhX.LIZ.get(Long.valueOf(j)).get();
                        if (tTVideoEngine != null) {
                            long LJJIIJZLJL = tTVideoEngine.LJJIIJZLJL(81);
                            if (LJJIIJZLJL > 0) {
                                c47311IhX.LIZIZ += LJJIIJZLJL;
                            }
                            c47311IhX.LIZ.remove(Long.valueOf(j));
                            StringBuilder LIZ = X1D.LIZ();
                            LIZ.append("delete engine: ");
                            LIZ.append(j);
                            LIZ.append(", waste data: ");
                            LIZ.append(LJJIIJZLJL);
                            TTVideoEngineLog.d("VideoInfoCollecor", X1D.LIZIZ(LIZ));
                        }
                    }
                } catch (Exception unused) {
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

    public RunnableC47310IhW(long j) {
        this.LJLIL = j;
    }
}
