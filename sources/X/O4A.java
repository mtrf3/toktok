package X;

import Y.ARunnableS11S1100000_10;
import java.lang.ref.WeakReference;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class O4A {
    public static final ConcurrentHashMap<String, WeakReference<O4I<O4B>>> LIZ = new ConcurrentHashMap<>();

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0040, code lost:
    
        r3 = X.O4W.LIZ.getStringJustDisk(r7, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0047, code lost:
    
        if (r3 == null) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0049, code lost:
    
        r5 = ujb.s.LJLJJL(r3, new java.lang.String[]{","}, 0, 6);
        r4 = r5.size() - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x005b, code lost:
    
        if (r4 < 0) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0063, code lost:
    
        r6.LIZ(new X.O4B(r7, (java.lang.String) r5.get(r4)));
        r0 = X.C76800UCe.LIZ;
        X.C3C5.m7constructorimpl(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0071, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0072, code lost:
    
        r0 = X.C141335gf.LIZ(r0);
        X.C3C5.m7constructorimpl(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x008a, code lost:
    
        return r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x008c, code lost:
    
        return r6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.O4I LIZ(java.lang.String r7) {
        /*
            java.lang.String r0 = "url"
            kotlin.jvm.internal.o.LJIIJ(r7, r0)
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.ref.WeakReference<X.O4I<X.O4B>>> r0 = X.O4A.LIZ
            java.lang.Object r0 = r0.get(r7)
            java.lang.ref.Reference r0 = (java.lang.ref.Reference) r0
            if (r0 == 0) goto L1a
            java.lang.Object r0 = r0.get()
            X.O4I r0 = (X.O4I) r0
            if (r0 == 0) goto L1a
            monitor-enter(r0)
            monitor-exit(r0)
            return r0
        L1a:
            X.O4I r6 = new X.O4I
            r6.<init>()
            monitor-enter(r6)
            java.lang.ref.WeakReference r2 = new java.lang.ref.WeakReference     // Catch: java.lang.Throwable -> L8d
            r2.<init>(r6)     // Catch: java.lang.Throwable -> L8d
        L25:
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.ref.WeakReference<X.O4I<X.O4B>>> r1 = X.O4A.LIZ     // Catch: java.lang.Throwable -> L8d
            java.lang.Object r0 = r1.putIfAbsent(r7, r2)     // Catch: java.lang.Throwable -> L8d
            java.lang.ref.WeakReference r0 = (java.lang.ref.WeakReference) r0     // Catch: java.lang.Throwable -> L8d
            if (r0 == 0) goto L40
            java.lang.Object r0 = r0.get()     // Catch: java.lang.Throwable -> L8d
            X.O4I r0 = (X.O4I) r0     // Catch: java.lang.Throwable -> L8d
            if (r0 == 0) goto L3a
            monitor-enter(r0)     // Catch: java.lang.Throwable -> L8d
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L8d
            goto L3e
        L3a:
            r1.remove(r7)     // Catch: java.lang.Throwable -> L8d
            goto L25
        L3e:
            monitor-exit(r6)
            return r0
        L40:
            com.bytedance.keva.Keva r1 = X.O4W.LIZ     // Catch: java.lang.Throwable -> L8d
            r0 = 0
            java.lang.String r3 = r1.getStringJustDisk(r7, r0)     // Catch: java.lang.Throwable -> L8d
            if (r3 == 0) goto L8b
            java.lang.String r0 = ","
            java.lang.String[] r2 = new java.lang.String[]{r0}     // Catch: java.lang.Throwable -> L8d
            r1 = 0
            r0 = 6
            java.util.List r5 = ujb.s.LJLJJL(r3, r2, r1, r0)     // Catch: java.lang.Throwable -> L8d
            int r4 = r5.size()     // Catch: java.lang.Throwable -> L8d
            r3 = 1
            int r4 = r4 - r3
        L5b:
            if (r4 < 0) goto L89
            java.lang.Object r1 = r5.get(r4)     // Catch: java.lang.Throwable -> L8d
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Throwable -> L8d
            X.O4B r0 = new X.O4B     // Catch: java.lang.Throwable -> L71
            r0.<init>(r7, r1)     // Catch: java.lang.Throwable -> L71
            r6.LIZ(r0)     // Catch: java.lang.Throwable -> L71
            X.UCe r0 = X.C76800UCe.LIZ     // Catch: java.lang.Throwable -> L71
            X.C3C5.m7constructorimpl(r0)     // Catch: java.lang.Throwable -> L71
            goto L79
        L71:
            r0 = move-exception
            X.3C4 r0 = X.C141335gf.LIZ(r0)     // Catch: java.lang.Throwable -> L8d
            X.C3C5.m7constructorimpl(r0)     // Catch: java.lang.Throwable -> L8d
        L79:
            java.lang.Throwable r2 = X.C3C5.m10exceptionOrNullimpl(r0)     // Catch: java.lang.Throwable -> L8d
            if (r2 == 0) goto L86
            java.lang.String r1 = "ResponseCacheManager"
            java.lang.String r0 = "error happens when creating cache"
            X.C39930Flm.LIZJ(r1, r0, r2, r3)     // Catch: java.lang.Throwable -> L8d
        L86:
            int r4 = r4 + (-1)
            goto L5b
        L89:
            monitor-exit(r6)
            return r6
        L8b:
            monitor-exit(r6)
            return r6
        L8d:
            r0 = move-exception
            monitor-exit(r6)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.O4A.LIZ(java.lang.String):X.O4I");
    }

    public static void LIZIZ(O4I o4i, String url) {
        o.LJIIJ(url, "url");
        C61325O4z.LIZLLL(new ARunnableS11S1100000_10(o4i, url, 9));
    }

    public static void LIZJ(String url, C61296O3w c61296O3w, InterfaceC88472Yns interfaceC88472Yns) {
        O4I<O4B> LIZ2;
        o.LJIIJ(url, "url");
        if (c61296O3w == null || (LIZ2 = c61296O3w.LJFF) == null) {
            LIZ2 = LIZ(url);
        }
        C61311O4l c61311O4l = LIZ2.LIZIZ.LIZ.get();
        if (!(c61311O4l instanceof C61311O4l)) {
            c61311O4l = null;
        }
        O4B o4b = (O4B) c61311O4l;
        boolean z = false;
        while (o4b != null) {
            String LIZIZ = o4b.LIZIZ();
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append("get file cache key, ");
            LIZ3.append(LIZIZ);
            C39930Flm.LJI("ResponseCacheManager", X1D.LIZIZ(LIZ3), false, 4);
            if (ujb.o.LJJJJJL(LIZIZ)) {
                C39930Flm.LIZJ("ResponseCacheManager", "hash cache key is blank", null, true);
                o4b = o4b.LIZJ();
            } else if (!o4b.LIZ()) {
                o4b = o4b.LIZJ();
            } else {
                OSZ osz = (OSZ) interfaceC88472Yns.invoke(o4b);
                if (z || ((Boolean) osz.getSecond()).booleanValue()) {
                    z = true;
                } else {
                    z = false;
                }
                if (((Boolean) osz.getFirst()).booleanValue()) {
                    break;
                } else {
                    o4b = o4b.LIZJ();
                }
            }
        }
        if (z) {
            LIZ2.LIZ = true;
            LIZIZ(LIZ2, url);
        }
    }
}
