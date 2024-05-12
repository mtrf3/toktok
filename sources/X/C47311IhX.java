package X;

import com.ss.ttvideoengine.TTVideoEngine;
import com.ss.ttvideoengine.utils.TTVideoEngineLog;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Iterator;

/* renamed from: X.IhX, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C47311IhX {
    public static final C47311IhX LIZLLL = new C47311IhX();
    public final HashMap<Long, WeakReference<TTVideoEngine>> LIZ = new HashMap<>();
    public long LIZIZ;
    public long LIZJ;

    public final synchronized long LIZ() {
        long j;
        j = this.LIZIZ;
        this.LIZIZ = 0L;
        try {
            Iterator<WeakReference<TTVideoEngine>> it = this.LIZ.values().iterator();
            while (it.hasNext()) {
                TTVideoEngine tTVideoEngine = it.next().get();
                if (tTVideoEngine != null) {
                    long LJJIIJZLJL = tTVideoEngine.LJJIIJZLJL(81);
                    if (LJJIIJZLJL > 0) {
                        j += LJJIIJZLJL;
                    }
                }
            }
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("get play waste data size: ");
            LIZ.append(j);
            TTVideoEngineLog.d("VideoInfoCollecor", X1D.LIZIZ(LIZ));
        } catch (Exception unused) {
            return j;
        }
        return j;
    }
}
