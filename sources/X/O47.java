package X;

import android.os.FileObserver;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class O47 {
    public final O49 LIZ;
    public final ConcurrentHashMap<String, C61295O3v> LIZIZ = new ConcurrentHashMap<>();
    public final ConcurrentHashMap<String, FileObserver> LIZJ = new ConcurrentHashMap<>();

    public O47(int i) {
        this.LIZ = new O49(this, i);
    }

    public final void LIZ(String cacheKey) {
        o.LJIIJ(cacheKey, "cacheKey");
        if (cacheKey.length() == 0) {
            return;
        }
        this.LIZIZ.remove(cacheKey);
        this.LIZ.remove(cacheKey);
        synchronized (this) {
            FileObserver fileObserver = this.LIZJ.get(cacheKey);
            if (fileObserver != null) {
                fileObserver.stopWatching();
            }
            this.LIZJ.remove(cacheKey);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0052, code lost:
    
        if (r4.LIZIZ.get(r3) == null) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZIZ(X.C61295O3v r5, X.O4O r6) {
        /*
            r4 = this;
            java.lang.String r0 = "response"
            kotlin.jvm.internal.o.LJIIJ(r5, r0)
            java.lang.String r0 = "origin"
            kotlin.jvm.internal.o.LJIIJ(r6, r0)
            java.lang.String r1 = r5.LLD
            java.lang.String r0 = "memory"
            boolean r0 = kotlin.jvm.internal.o.LJ(r1, r0)
            if (r0 != 0) goto L1e
            java.lang.String r1 = r5.LLD
            java.lang.String r0 = "builtin"
            boolean r0 = kotlin.jvm.internal.o.LJ(r1, r0)
            if (r0 == 0) goto L1f
        L1e:
            return
        L1f:
            com.bytedance.forest.model.Request r0 = r5.LJZI
            java.lang.String r3 = X.O40.LIZ(r0)
            if (r3 == 0) goto L2d
            int r0 = r3.length()
            if (r0 != 0) goto L5a
        L2d:
            r0 = 1
        L2e:
            java.lang.String r2 = "MemoryManager"
            if (r0 != 0) goto L54
            boolean r0 = r6.LJIILL()
            if (r0 == 0) goto L54
            com.bytedance.forest.model.Request r0 = r5.LJZI
            boolean r0 = r0.isPreload()
            if (r0 != 0) goto L5c
            com.bytedance.forest.model.Request r1 = r5.LJZI
            java.lang.String r0 = "identifier"
            kotlin.jvm.internal.o.LJIIJ(r3, r0)
            java.lang.String r0 = "request"
            kotlin.jvm.internal.o.LJIIJ(r1, r0)
            java.util.concurrent.ConcurrentHashMap<java.lang.String, X.O3v> r0 = r4.LIZIZ
            java.lang.Object r0 = r0.get(r3)
            if (r0 != 0) goto L5c
        L54:
            java.lang.String r0 = "updateByteArrayCache: cache key is empty or data is empty"
            X.C39930Flm.LIZ(r2, r0)
            goto L1e
        L5a:
            r0 = 0
            goto L2e
        L5c:
            X.O49 r0 = r4.LIZ     // Catch: java.lang.Exception -> L62
            r0.put(r3, r6)     // Catch: java.lang.Exception -> L62
            goto L68
        L62:
            r1 = move-exception
            java.lang.String r0 = "error occurs when put bytes to lru cache"
            X.C39930Flm.LIZIZ(r2, r0, r1)
        L68:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.O47.LIZIZ(X.O3v, X.O4O):void");
    }
}
