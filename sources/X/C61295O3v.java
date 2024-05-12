package X;

import android.webkit.WebResourceResponse;
import com.bytedance.forest.Forest;
import com.bytedance.forest.chain.fetchers.ResourceFetcher;
import com.bytedance.forest.model.Request;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.InputStream;
import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.o;

/* renamed from: X.O3v, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C61295O3v extends F9E {
    public String LJLIL;
    public boolean LJLILLLLZI;
    public boolean LJLJI;
    public O44 LJLJJI;
    public java.util.Map<String, String> LJLJJL;
    public C61296O3w LJLJJLL;
    public boolean LJLJL;
    public boolean LJLJLJ;
    public ResourceFetcher LJLJLLL;
    public String LJLL;
    public O4O LJLLI;
    public WeakReference<O4O> LJLLILLLL;
    public String LJLLJ;
    public volatile transient SoftReference<C81392Vwy<W5B>> LJLLL;
    public boolean LJLLLL;
    public boolean LJLLLLLL;
    public boolean LJLZ;
    public final java.util.Map<String, Long> LJZ;
    public Request LJZI;
    public boolean LJZL;
    public final C61287O3n LL;
    public String LLD;
    public String LLF;
    public boolean LLFF;
    public long LLFFF;
    public String LLFII;

    public final synchronized InputStream U() {
        O4O LIZIZ;
        InputStream LJJ;
        if (!this.LJZL) {
            return null;
        }
        Forest forest = this.LJZI.getForest();
        O4O N = N();
        if (N != null) {
            byte[] LJIJI = N.LJIJI();
            if (LJIJI != null) {
                return new ByteArrayInputStream(LJIJI);
            }
            InputStream LJJ2 = N.LJJ(forest, this);
            if (LJJ2 != null) {
                return LJJ2;
            }
        }
        if ((this.LJZI.getEnableMemoryCache() || this.LJZI.getEnableRequestReuse()) && (LIZIZ = O40.LIZIZ(this)) != null && (LJJ = LIZIZ.LJJ(forest, this)) != null) {
            this.LJLLI = LIZIZ;
            return LJJ;
        }
        O40.LIZLLL(this);
        O4O N2 = N();
        if (N2 != null) {
            byte[] LJIJI2 = N2.LJIJI();
            if (LJIJI2 != null) {
                return new ByteArrayInputStream(LJIJI2);
            }
            InputStream LJJ3 = N2.LJJ(forest, this);
            if (LJJ3 != null) {
                return LJJ3;
            }
        }
        this.LJLLI = null;
        C39930Flm.LIZJ(null, "fetch succeeded but IO failed", null, true);
        return null;
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJZI, Boolean.valueOf(this.LJZL), this.LL, this.LLD, this.LLF, Boolean.valueOf(this.LLFF), Long.valueOf(this.LLFFF), this.LLFII};
    }

    public final String L() {
        if (this.LJZL) {
            return this.LJLLJ;
        }
        return null;
    }

    public final String M() {
        String filePath;
        if ((!o.LJ(this.LLD, "cdn")) && (filePath = getFilePath()) != null) {
            return O4C.LIZ(filePath, true);
        }
        return O4C.LIZ(this.LJZI.getUrl(), false);
    }

    public final O4O N() {
        O4O o4o = this.LJLLI;
        if (o4o != null) {
            return o4o;
        }
        WeakReference<O4O> weakReference = this.LJLLILLLL;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    public final C81392Vwy<W5B> O() {
        SoftReference<C81392Vwy<W5B>> softReference = this.LJLLL;
        if (softReference != null) {
            return softReference.get();
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final byte[] S() {
        O4O N;
        String str;
        String str2;
        byte[] LJIJI;
        if (!this.LJZL) {
            return null;
        }
        O4O N2 = N();
        if (N2 != null && (LJIJI = N2.LJIJI()) != null) {
            return LJIJI;
        }
        if (o.LJ(this.LLD, "memory") || this.LJZI.getEnableRequestReuse() || this.LJZI.getEnableMemoryCache()) {
            O4O LIZIZ = O40.LIZIZ(this);
            if (LIZIZ != null) {
                this.LJLLI = LIZIZ;
                byte[] LJIJI2 = LIZIZ.LJIJI();
                if (LJIJI2 != null) {
                    if (this.LJZI.getEnableRequestReuse()) {
                        this.LJLLLL = true;
                    }
                    return LJIJI2;
                }
            }
            String LIZ = O40.LIZ(this.LJZI);
            if (LIZ != null) {
                Request request = this.LJZI;
                o.LJIIJ(request, "request");
                O47 LIZJ = O40.LIZJ();
                LIZJ.getClass();
                C61295O3v c61295O3v = LIZJ.LIZIZ.get(LIZ);
                if (c61295O3v != null && (N = c61295O3v.N()) != null) {
                    this.LJLLI = N;
                    byte[] LJIJI3 = N.LJIJI();
                    if (LJIJI3 != null) {
                        return LJIJI3;
                    }
                }
            }
        }
        O4O N3 = N();
        if (N3 != null) {
            N3.LJJIJIIJIL(this);
            byte[] LJIJI4 = N3.LJIJI();
            if (LJIJI4 != null) {
                return LJIJI4;
            }
        }
        if (!this.LJZL) {
            return null;
        }
        if (o.LJ(this.LLD, "memory")) {
            C39930Flm.LIZJ(null, "resource from memory but call loadAsBytes", null, true);
            this.LL.LIZJ(2, "resource from memory but call loadAsBytes");
            this.LLD = this.LLF;
        }
        this.LJZI.getForest();
        InputStream U = U();
        if (U != null) {
            try {
                str = C62848OlY.LJFF(U);
            } finally {
                try {
                    AnonymousClass636.LJFF(U, null);
                    str2 = str;
                } catch (Throwable th) {
                }
            }
            AnonymousClass636.LJFF(U, null);
            str2 = str;
        } else {
            str2 = null;
        }
        if (str2 != null) {
            return str2;
        }
        O40.LIZLLL(this);
        return null;
    }

    public final WebResourceResponse V() {
        String identity;
        WebResourceResponse webResourceResponse;
        String str;
        java.util.Set<Map.Entry<String, String>> entrySet;
        if (!this.LJZL) {
            return null;
        }
        String dataType = getDataType();
        String L = L();
        InputStream U = U();
        C61296O3w c61296O3w = this.LJLJJLL;
        if (c61296O3w == null || (identity = c61296O3w.LIZLLL.LIZLLL) == null) {
            identity = this.LJZI.getUrl();
        }
        java.util.Map<String, String> map = this.LJLJJL;
        o.LJIIJ(identity, "identity");
        if (o.LJ(dataType, "unknown")) {
            StringBuilder LIZLLL = C1FL.LIZLLL(identity, ", cannot resolve mimetype, ", identity, ", headers: ");
            if (map != null && (entrySet = map.entrySet()) != null) {
                str = ORZ.LLD(entrySet, null, null, null, C122754rn.LJLIL, 31);
            } else {
                str = null;
            }
            LIZLLL.append(str);
            C39930Flm.LIZJ("header", X1D.LIZIZ(LIZLLL), null, true);
            return null;
        }
        if (U == null) {
            return null;
        }
        if (map == null) {
            try {
                map = new HashMap<>();
            } catch (Exception e) {
                C16880lQ.LLLLIIL(e);
                return null;
            }
        }
        if (map.get("Access-Control-Allow-Origin") == null && map.get("access-control-allow-origin") == null) {
            map.put("access-control-allow-origin", "*");
        }
        if (o.LJ("font/ttf", dataType)) {
            webResourceResponse = new WebResourceResponse(dataType, L, 200, "OK", map, U);
        } else {
            webResourceResponse = new WebResourceResponse(dataType, L, U);
            webResourceResponse.setResponseHeaders(map);
        }
        return webResourceResponse;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x002c, code lost:
    
        if (r0 != null) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0061, code lost:
    
        if (r1.equals("jpg") != false) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0098, code lost:
    
        r0 = "image/jpeg";
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0096, code lost:
    
        if (r1.equals("jpeg") != false) goto L48;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String getDataType() {
        /*
            r2 = this;
            boolean r1 = r2.LJZL
            r0 = 0
            if (r1 == 0) goto L1c
            java.lang.String r0 = r2.LJLL
            if (r0 == 0) goto Lf
            int r0 = r0.length()
            if (r0 != 0) goto L1a
        Lf:
            java.lang.String r1 = r2.M()
            if (r1 != 0) goto L1d
        L16:
            java.lang.String r0 = "unknown"
        L18:
            r2.LJLL = r0
        L1a:
            java.lang.String r0 = r2.LJLL
        L1c:
            return r0
        L1d:
            int r0 = r1.hashCode()
            switch(r0) {
                case 3401: goto L2f;
                case 98819: goto L3a;
                case 102340: goto L45;
                case 104085: goto L50;
                case 105441: goto L5b;
                case 111145: goto L64;
                case 114276: goto L6f;
                case 115174: goto L7a;
                case 3213227: goto L85;
                case 3268712: goto L90;
                case 3271912: goto L9c;
                case 3645340: goto La8;
                case 3655064: goto Lb4;
                case 113307034: goto Lc0;
                default: goto L24;
            }
        L24:
            android.webkit.MimeTypeMap r0 = android.webkit.MimeTypeMap.getSingleton()
            java.lang.String r0 = r0.getMimeTypeFromExtension(r1)
            if (r0 == 0) goto L16
            goto L18
        L2f:
            java.lang.String r0 = "js"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L24
            java.lang.String r0 = "application/x-javascript"
            goto L18
        L3a:
            java.lang.String r0 = "css"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L24
            java.lang.String r0 = "text/css"
            goto L18
        L45:
            java.lang.String r0 = "gif"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L24
            java.lang.String r0 = "image/gif"
            goto L18
        L50:
            java.lang.String r0 = "ico"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L24
            java.lang.String r0 = "image/x-icon"
            goto L18
        L5b:
            java.lang.String r0 = "jpg"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L24
            goto L98
        L64:
            java.lang.String r0 = "png"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L24
            java.lang.String r0 = "image/png"
            goto L18
        L6f:
            java.lang.String r0 = "svg"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L24
            java.lang.String r0 = "image/svg+xml"
            goto L18
        L7a:
            java.lang.String r0 = "ttf"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L24
            java.lang.String r0 = "font/ttf"
            goto L18
        L85:
            java.lang.String r0 = "html"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L24
            java.lang.String r0 = "text/html"
            goto L18
        L90:
            java.lang.String r0 = "jpeg"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L24
        L98:
            java.lang.String r0 = "image/jpeg"
            goto L18
        L9c:
            java.lang.String r0 = "json"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L24
            java.lang.String r0 = "application/json"
            goto L18
        La8:
            java.lang.String r0 = "webp"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L24
            java.lang.String r0 = "image/webp"
            goto L18
        Lb4:
            java.lang.String r0 = "woff"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L24
            java.lang.String r0 = "font/woff"
            goto L18
        Lc0:
            java.lang.String r0 = "woff2"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L24
            java.lang.String r0 = "font/woff2"
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C61295O3v.getDataType():java.lang.String");
    }

    public final String getFilePath() {
        File LJIJJ;
        if (!this.LJZL) {
            return null;
        }
        String str = this.LJLIL;
        if (str != null) {
            return str;
        }
        O4O N = N();
        if (N == null || (LJIJJ = N.LJIJJ()) == null) {
            return null;
        }
        return LJIJJ.getAbsolutePath();
    }

    public final void R() {
        O4O N = N();
        if (N != null) {
            N.LJJIJIIJIL(this);
            if (!N.LJIILIIL()) {
                return;
            }
        }
        this.LJZL = false;
        this.LL.LIZLLL(4, "fetch succeeded but IO failed");
    }

    public /* synthetic */ C61295O3v(Request request) {
        this(request, false, new C61287O3n(request, 62), null, null, false, 0L, "");
    }

    public static File T(C61295O3v c61295O3v) {
        File LJIJJ;
        String filePath = c61295O3v.getFilePath();
        if (filePath == null) {
            filePath = "";
        }
        String str = c61295O3v.LLD;
        if (str == null || str.hashCode() != 230960163 || !str.equals("builtin")) {
            O4O N = c61295O3v.N();
            if (N != null && (LJIJJ = N.LJIJJ()) != null) {
                return LJIJJ;
            }
            return new File(filePath);
        }
        return new File(filePath);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final String P(String str) {
        if (str != null) {
            switch (str.hashCode()) {
                case -1077756671:
                    if (str.equals("memory")) {
                        return "memory";
                    }
                    break;
                case 98349:
                    if (str.equals("cdn")) {
                        if (!this.LLFF) {
                            return "cdn";
                        }
                        return "cdn_cache";
                    }
                    break;
                case 98230121:
                    if (str.equals("gecko")) {
                        if (this.LLFF) {
                            return "gecko";
                        }
                        return "gecko_update";
                    }
                    break;
                case 230960163:
                    if (str.equals("builtin")) {
                        return "builtin";
                    }
                    break;
            }
        }
        return "unknown";
    }

    public final void X(O4O o4o) {
        if (o4o == null) {
            O4O o4o2 = this.LJLLI;
            if (o4o2 != null) {
                this.LJLLILLLL = new WeakReference<>(o4o2);
            }
            this.LJLLI = null;
            return;
        }
        if (this.LJLLI != null) {
            return;
        }
        this.LJLLI = o4o;
    }

    public final void W(Long l, String str) {
        long currentTimeMillis;
        java.util.Map<String, Long> map = this.LJZ;
        if (l != null) {
            currentTimeMillis = l.longValue();
        } else {
            currentTimeMillis = System.currentTimeMillis();
        }
        map.put(str, Long.valueOf(currentTimeMillis));
    }

    public C61295O3v(Request request, boolean z, C61287O3n errorInfo, String str, String str2, boolean z2, long j, String successFetcher) {
        o.LJIIJ(errorInfo, "errorInfo");
        o.LJIIJ(successFetcher, "successFetcher");
        this.LJZI = request;
        this.LJZL = z;
        this.LL = errorInfo;
        this.LLD = str;
        this.LLF = str2;
        this.LLFF = z2;
        this.LLFFF = j;
        this.LLFII = successFetcher;
        this.LJZ = new LinkedHashMap();
    }
}
