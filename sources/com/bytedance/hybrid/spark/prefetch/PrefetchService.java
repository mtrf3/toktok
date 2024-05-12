package com.bytedance.hybrid.spark.prefetch;

import X.C36982EfK;
import X.C37000Efc;
import X.C79043V0l;
import X.InterfaceC36604EYe;
import X.OSJ;
import X.OSZ;
import X.Q89;
import X.X1D;
import Y.ARunnableS5S1200000_6;
import android.net.Uri;
import com.bytedance.mt.protector.impl.UriProtector;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.o;
import ujb.s;

/* loaded from: classes7.dex */
public final class PrefetchService {
    public static final PrefetchService INSTANCE = new PrefetchService();
    public static final AtomicBoolean isCacheUsed = new AtomicBoolean(false);
    public static final HashSet<String> routerUriSet = new HashSet<>();

    private final String assembleUrl(Uri uri) {
        boolean z;
        String LJIJJ = C79043V0l.LJIJJ(uri, "channel");
        String LJIJJ2 = C79043V0l.LJIJJ(uri, "bundle");
        boolean z2 = true;
        if (LJIJJ == null || LJIJJ.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            if (LJIJJ2 != null && LJIJJ2.length() != 0) {
                z2 = false;
            }
            if (!z2) {
                Uri.Builder builder = new Uri.Builder();
                Uri.Builder authority = builder.scheme(uri.getScheme()).authority("prefetch");
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append('/');
                LIZ.append(LJIJJ);
                LIZ.append('/');
                LIZ.append(LJIJJ2);
                authority.path(X1D.LIZIZ(LIZ)).query(uri.getQuery());
                String builder2 = builder.toString();
                o.LJFF(builder2, "Uri.Builder().apply {\n  …\n            }.toString()");
                return builder2;
            }
        }
        String LJFF = C79043V0l.LJFF(uri);
        String str = "";
        if (LJFF == null) {
            return "";
        }
        try {
            Uri.Builder buildUpon = UriProtector.parse(LJFF).buildUpon();
            buildUpon.query(uri.getQuery());
            str = buildUpon.toString();
            return str;
        } catch (Throwable unused) {
            return str;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:61:0x0077, code lost:
    
        if (r3.equals("https") == false) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void prefetch(java.lang.String r8) {
        /*
            r7 = this;
            android.net.Uri r1 = com.bytedance.mt.protector.impl.UriProtector.parse(r8)     // Catch: java.lang.Throwable -> L8
            X.C3C5.m7constructorimpl(r1)     // Catch: java.lang.Throwable -> L8
            goto L10
        L8:
            r0 = move-exception
            X.3C4 r1 = X.C141335gf.LIZ(r0)
            X.C3C5.m7constructorimpl(r1)
        L10:
            boolean r2 = X.C3C5.m12isFailureimpl(r1)
            r0 = 0
            if (r2 == 0) goto L18
            r1 = r0
        L18:
            android.net.Uri r1 = (android.net.Uri) r1
            if (r1 == 0) goto Le2
            X.Efc r0 = X.C36982EfK.LJ
            boolean r0 = r7.tryPrefetchByCache(r0, r8, r1)
            if (r0 != 0) goto Le2
            long r5 = java.lang.System.currentTimeMillis()
            java.lang.String r3 = r1.getScheme()     // Catch: java.lang.Exception -> Lde
            if (r3 != 0) goto L59
        L2e:
            java.lang.String r4 = r1.getAuthority()     // Catch: java.lang.Exception -> Lde
            if (r4 == 0) goto L52
            java.lang.String r0 = "_"
            java.lang.String[] r3 = new java.lang.String[]{r0}     // Catch: java.lang.Exception -> Lde
            r2 = 0
            r0 = 6
            java.util.List r0 = ujb.s.LJLJJL(r4, r3, r2, r0)     // Catch: java.lang.Exception -> Lde
            java.lang.Object r3 = X.ORZ.LJLLLL(r0)     // Catch: java.lang.Exception -> Lde
            java.lang.String r3 = (java.lang.String) r3     // Catch: java.lang.Exception -> Lde
            if (r3 == 0) goto L52
        L48:
            int r2 = r3.hashCode()     // Catch: java.lang.Exception -> Lde
            r0 = -1772600516(0xffffffff9658433c, float:-1.7469556E-25)
            if (r2 == r0) goto L9d
            goto L80
        L52:
            java.lang.String r3 = r1.getAuthority()     // Catch: java.lang.Exception -> Lde
            if (r3 != 0) goto L48
            goto L8a
        L59:
            int r2 = r3.hashCode()     // Catch: java.lang.Exception -> Lde
            r0 = 3213448(0x310888, float:4.503E-39)
            if (r2 == r0) goto L68
            r0 = 99617003(0x5f008eb, float:2.2572767E-35)
            if (r2 == r0) goto L71
            goto L2e
        L68:
            java.lang.String r0 = "http"
            boolean r0 = r3.equals(r0)     // Catch: java.lang.Exception -> Lde
            if (r0 == 0) goto L2e
            goto L79
        L71:
            java.lang.String r0 = "https"
            boolean r0 = r3.equals(r0)     // Catch: java.lang.Exception -> Lde
            if (r0 == 0) goto L2e
        L79:
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Exception -> Lde
        L7d:
            if (r1 == 0) goto L8a
            goto Lb2
        L80:
            r0 = -1202757124(0xffffffffb84f61fc, float:-4.94439E-5)
            if (r2 == r0) goto L94
            r0 = 1224424441(0x48fb3bf9, float:514527.78)
            if (r2 == r0) goto L8b
        L8a:
            return
        L8b:
            java.lang.String r0 = "webview"
            boolean r0 = r3.equals(r0)     // Catch: java.lang.Exception -> Lde
            if (r0 == 0) goto L8a
            goto La5
        L94:
            java.lang.String r0 = "hybrid"
            boolean r0 = r3.equals(r0)     // Catch: java.lang.Exception -> Lde
            if (r0 == 0) goto L8a
            goto La5
        L9d:
            java.lang.String r0 = "lynxview"
            boolean r0 = r3.equals(r0)     // Catch: java.lang.Exception -> Lde
            if (r0 == 0) goto L8a
        La5:
            java.lang.String r1 = r7.assembleUrl(r1)     // Catch: java.lang.Exception -> Lde
            boolean r0 = ujb.o.LJJJJJL(r1)     // Catch: java.lang.Exception -> Lde
            r0 = r0 ^ 1
            if (r0 == 0) goto L8a
            goto L7d
        Lb2:
            X.Efe r0 = X.C36982EfK.LIZIZ(r1)     // Catch: java.lang.Exception -> Lde
            if (r0 == 0) goto Le2
            r0.LIZJ(r1)     // Catch: java.lang.Exception -> Lde
            java.lang.StringBuilder r2 = X.X1D.LIZ()     // Catch: java.lang.Exception -> Lde
            java.lang.String r0 = "start prefetch:"
            r2.append(r0)     // Catch: java.lang.Exception -> Lde
            r2.append(r1)     // Catch: java.lang.Exception -> Lde
            java.lang.String r0 = ", with time cost:"
            r2.append(r0)     // Catch: java.lang.Exception -> Lde
            long r0 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Exception -> Lde
            long r0 = r0 - r5
            r2.append(r0)     // Catch: java.lang.Exception -> Lde
            java.lang.String r1 = X.X1D.LIZIZ(r2)     // Catch: java.lang.Exception -> Lde
            java.io.PrintStream r0 = java.lang.System.out     // Catch: java.lang.Exception -> Lde
            r0.println(r1)     // Catch: java.lang.Exception -> Lde
            goto Le2
        Lde:
            r0 = move-exception
            X.C16880lQ.LLLLIIL(r0)
        Le2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.hybrid.spark.prefetch.PrefetchService.prefetch(java.lang.String):void");
    }

    public final void prefetchWhenLoad(String url) {
        o.LJIIJ(url, "url");
        if (!routerUriSet.remove(url)) {
            prefetch(url);
        }
    }

    public final void prefetchWhenNavigate(String url) {
        o.LJIIJ(url, "url");
        routerUriSet.add(url);
        prefetch(url);
    }

    private final boolean tryPrefetchByCache(C37000Efc c37000Efc, String str, Uri uri) {
        InterfaceC36604EYe interfaceC36604EYe;
        String LJIJJ;
        String LJIJJ2;
        if (c37000Efc != null && !isCacheUsed.get()) {
            C37000Efc.LIZLLL.getClass();
            Executor executor = C37000Efc.LIZIZ;
            if (executor != null && (interfaceC36604EYe = C37000Efc.LIZJ) != null) {
                String str2 = c37000Efc.LIZ.LJFF;
                if (!s.LJJJLZIJ(str, str2, false) && (((LJIJJ = C79043V0l.LJIJJ(uri, "url")) == null || !s.LJJJLZIJ(LJIJJ, str2, false)) && ((LJIJJ2 = C79043V0l.LJIJJ(uri, "surl")) == null || !s.LJJJLZIJ(LJIJJ2, str2, false)))) {
                    return false;
                }
                StringBuilder sb = new StringBuilder(c37000Efc.LIZ.LJI);
                sb.append('?');
                Iterator<OSZ<String, String>> it = c37000Efc.LIZ.LIZLLL.iterator();
                boolean z = true;
                while (it.hasNext()) {
                    OSZ<String, String> next = it.next();
                    String LJIJJ3 = C79043V0l.LJIJJ(uri, next.getFirst());
                    if (LJIJJ3 == null) {
                        return false;
                    }
                    if (!z) {
                        sb.append('&');
                    } else {
                        z = false;
                    }
                    String second = next.getSecond();
                    if (second == null) {
                        second = next.getFirst();
                    }
                    Q89.LIZIZ(sb, second, '=', LJIJJ3);
                }
                if (!isCacheUsed.compareAndSet(false, true)) {
                    return false;
                }
                Iterator<OSZ<String, String>> it2 = c37000Efc.LIZ.LJ.iterator();
                while (it2.hasNext()) {
                    OSZ<String, String> next2 = it2.next();
                    if (!z) {
                        sb.append('&');
                    } else {
                        z = false;
                    }
                    sb.append(next2.getFirst());
                    sb.append('=');
                    sb.append(next2.getSecond());
                }
                String sb2 = sb.toString();
                o.LJFF(sb2, "builder.toString()");
                String url = c37000Efc.LIZ.LJI;
                long currentTimeMillis = System.currentTimeMillis();
                o.LJIIJ(url, "url");
                C36982EfK.LIZLLL = new OSJ<>(url, Long.valueOf(currentTimeMillis), null);
                executor.execute(new ARunnableS5S1200000_6(interfaceC36604EYe, sb2, c37000Efc, 0));
                return true;
            }
        }
        return false;
    }
}
