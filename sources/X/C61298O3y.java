package X;

import android.webkit.WebResourceRequest;
import com.bytedance.forest.pollyfill.DefaultForestNetAPI;
import java.io.File;
import java.util.Locale;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.AqS62S1100000_9;
import kotlin.jvm.internal.o;

/* renamed from: X.O3y, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C61298O3y implements InterfaceC61309O4j {
    public static final C61298O3y LIZJ = new C61298O3y();
    public static AbstractC40715FyR LIZ = new DefaultForestNetAPI();
    public static final ConcurrentHashMap<String, C61296O3w> LIZIZ = new ConcurrentHashMap<>();

    public static O4L LJ(C61295O3v c61295O3v) {
        if (c61295O3v.LJZI.getLoadToMemory() || c61295O3v.LJZI.getParallelLoading()) {
            return O4L.FORCE_MEMORY;
        }
        if (c61295O3v.LJZI.getNeedLocalFile()) {
            return O4L.FORCE_WRITE_BACK;
        }
        return O4L.AUTO;
    }

    @Override // X.InterfaceC61309O4j
    public final void LIZIZ(C61296O3w c61296O3w) {
        Object obj = c61296O3w.LJIIJJI;
        if (!(obj instanceof AbstractC40713FyP)) {
            obj = null;
        }
        AbstractC40713FyP abstractC40713FyP = (AbstractC40713FyP) obj;
        if (abstractC40713FyP != null) {
            abstractC40713FyP.LIZ();
        }
    }

    public static AbstractC40713FyP LIZLLL(C61296O3w fetchTask, Object obj) {
        o.LJIIJ(fetchTask, "fetchTask");
        if (obj != null && (obj instanceof WebResourceRequest)) {
            WebResourceRequest webResourceRequest = (WebResourceRequest) obj;
            String method = webResourceRequest.getMethod();
            o.LJFF(method, "webResourceRequest.method");
            Locale locale = Locale.ENGLISH;
            o.LJFF(locale, "Locale.ENGLISH");
            String lowerCase = method.toLowerCase(locale);
            o.LJFF(lowerCase, "(this as java.lang.String).toLowerCase(locale)");
            if (!o.LJ(lowerCase, "get")) {
                return null;
            }
            return LIZ.LIZ(webResourceRequest, fetchTask);
        }
        return LIZ.LIZIZ(fetchTask, null);
    }

    public static O44 LJFF(C61296O3w fetchTask, AbstractC40713FyP abstractC40713FyP) {
        O44 LIZJ2;
        o.LJIIJ(fetchTask, "fetchTask");
        Throwable th = null;
        while (true) {
            boolean z = false;
            if (fetchTask.LIZ == O4F.CANCEL) {
                break;
            }
            C61286O3m c61286O3m = fetchTask.LIZLLL;
            int i = c61286O3m.LJFF;
            if (i > 0) {
                z = true;
            }
            c61286O3m.LJFF = i - 1;
            if (!z) {
                break;
            }
            try {
                LIZJ2 = LIZ.LIZJ(abstractC40713FyP);
            } catch (C40716FyS e) {
                C39930Flm.LIZJ("TTNetDepender", "Forest defined exception", e, true);
            } catch (Throwable th2) {
                th = th2;
                C39930Flm.LIZJ("TTNetDepender", "net error", th, true);
            }
            if (!O44.LJ.contains(Integer.valueOf(LIZJ2.LIZIZ))) {
                fetchTask.LJIIL.LJLJJI = LIZJ2;
                return LIZJ2;
            }
        }
        if (th == null) {
            return null;
        }
        throw th;
    }

    /* JADX WARN: Code restructure failed: missing block: B:154:0x01f0, code lost:
    
        if (r11 != null) goto L78;
     */
    @Override // X.InterfaceC61309O4j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ(android.content.Context r18, X.C61296O3w r19) {
        /*
            Method dump skipped, instructions count: 1377
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C61298O3y.LIZ(android.content.Context, X.O3w):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC61309O4j
    public final Boolean LIZJ(String url, File file) {
        o.LJIIJ(url, "url");
        String name = file.getName();
        if (name == null) {
            name = "";
        }
        C68322mC c68322mC = new C68322mC();
        c68322mC.element = null;
        O4A.LIZJ(url, null, new AqS62S1100000_9(name, c68322mC, 0));
        return (Boolean) c68322mC.element;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0079, code lost:
    
        if (r1 != null) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJI(java.util.Map r5, X.C61296O3w r6, boolean r7) {
        /*
            X.O3v r2 = r6.LJIIL
            if (r5 == 0) goto L53
            java.lang.String r0 = "content-type"
            java.lang.Object r0 = r5.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            if (r0 == 0) goto L7c
        Le:
            X.Fin r4 = X.C39745Fin.LIZJ(r0)
            if (r4 != 0) goto L57
            java.lang.String r3 = "text/html"
        L16:
            java.lang.String r1 = "utf-8"
        L18:
            X.OSZ r0 = new X.OSZ
            r0.<init>(r3, r1)
            java.lang.Object r1 = r0.getFirst()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r0 = r0.getSecond()
            java.lang.String r0 = (java.lang.String) r0
            r2.LJLL = r1
            r2.LJLLJ = r0
            java.lang.String r0 = "x-gecko-proxy-pkgid"
            java.lang.Object r0 = r5.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            if (r0 == 0) goto L54
            java.lang.Long r0 = X.C38350F3i.LJJIZ(r0)
            if (r0 == 0) goto L54
            long r0 = r0.longValue()
        L41:
            r2.LLFFF = r0
            com.bytedance.forest.model.Request r0 = r2.LJZI
            boolean r0 = r0.isWebRequest()
            if (r0 == 0) goto L53
            if (r7 == 0) goto L51
            java.util.Map r5 = X.O4C.LJ(r5)
        L51:
            r2.LJLJJL = r5
        L53:
            return
        L54:
            r0 = 0
            goto L41
        L57:
            java.lang.StringBuilder r1 = X.X1D.LIZ()
            java.lang.String r0 = r4.LIZIZ
            r1.append(r0)
            java.lang.String r0 = "/"
            r1.append(r0)
            java.lang.String r0 = r4.LIZJ
            r1.append(r0)
            java.lang.String r3 = X.X1D.LIZIZ(r1)
            r0 = 0
            java.nio.charset.Charset r0 = r4.LIZ(r0)
            if (r0 == 0) goto L16
            java.lang.String r1 = r0.toString()
            if (r1 == 0) goto L16
            goto L18
        L7c:
            java.lang.String r0 = "text/html; charset=UTF-8"
            goto Le
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C61298O3y.LJI(java.util.Map, X.O3w, boolean):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:55:0x0243, code lost:
    
        if (r20 == false) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0246, code lost:
    
        if (r20 == false) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0249, code lost:
    
        if (r20 == false) goto L91;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [T, X.O4O] */
    /* JADX WARN: Type inference failed for: r1v16, types: [T, X.O4O] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean LJII(java.util.Map r16, X.AbstractC40713FyP r17, X.C61296O3w r18, X.O4B r19, boolean r20) {
        /*
            Method dump skipped, instructions count: 635
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C61298O3y.LJII(java.util.Map, X.FyP, X.O3w, X.O4B, boolean):boolean");
    }
}
