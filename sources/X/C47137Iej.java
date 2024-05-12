package X;

import com.ss.ttvideoengine.TTVideoEngine;
import java.lang.ref.WeakReference;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.Iej, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C47137Iej {
    public static volatile C47137Iej LIZIZ;
    public final java.util.Map<Integer, WeakReference<TTVideoEngine>> LIZ = new ConcurrentHashMap();

    public static C47137Iej LIZIZ() {
        if (LIZIZ == null) {
            synchronized (C47137Iej.class) {
                if (LIZIZ == null) {
                    LIZIZ = new C47137Iej();
                }
            }
        }
        return LIZIZ;
    }

    public final void LIZ(TTVideoEngine tTVideoEngine) {
        if (tTVideoEngine == null) {
            return;
        }
        if (!((ConcurrentHashMap) this.LIZ).containsKey(Integer.valueOf(tTVideoEngine.hashCode()))) {
            ((ConcurrentHashMap) this.LIZ).put(Integer.valueOf(tTVideoEngine.hashCode()), new WeakReference(tTVideoEngine));
        }
    }
}
