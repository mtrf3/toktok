package com.bytedance.forest;

import X.C141335gf;
import X.C38515F9r;
import X.C39857Fkb;
import X.C39900FlI;
import X.C39930Flm;
import X.C3C5;
import X.C58411MwB;
import X.C60714NsE;
import X.C61021NxB;
import X.C61026NxG;
import X.C61156NzM;
import X.C61160NzQ;
import X.C61282O3i;
import X.C61283O3j;
import X.C61284O3k;
import X.C61287O3n;
import X.C61288O3o;
import X.C61289O3p;
import X.C61292O3s;
import X.C61295O3v;
import X.C61302O4c;
import X.C61325O4z;
import X.C68322mC;
import X.C76800UCe;
import X.C96Q;
import X.EnumC38514F9q;
import X.EnumC61028NxI;
import X.InterfaceC88472Yns;
import X.O40;
import X.O41;
import X.O45;
import X.O4O;
import X.O5M;
import X.OSZ;
import X.RunnableC61025NxF;
import X.X1D;
import Y.ARunnableS29S0200000_10;
import android.app.Application;
import android.os.AsyncTask;
import com.bytedance.forest.chain.fetchers.CDNFetcher;
import com.bytedance.forest.chain.fetchers.GeckoXAdapter;
import com.bytedance.forest.chain.fetchers.ResourceFetcher;
import com.bytedance.forest.model.Request;
import com.bytedance.forest.model.RequestParams;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.UUID;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;
import org.json.JSONObject;
import ujb.s;

/* loaded from: classes11.dex */
public final class Forest {
    public static final Companion Companion = new Companion();
    public static Application app;
    public static C39857Fkb globalConfig;
    public final Application application;
    public final C61156NzM config;
    public final Map<String, Class<? extends ResourceFetcher>> fetcherMap;
    public final GeckoXAdapter geckoXAdapter;
    public final C58411MwB sessionManager;

    /* loaded from: classes7.dex */
    public static final class Companion {
        public final Application getApp() {
            Application application = Forest.app;
            if (application != null) {
                return application;
            }
            o.LJIJI("app");
            throw null;
        }

        public Companion() {
        }

        public final C39857Fkb getGlobalConfig() {
            return Forest.globalConfig;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final void setGlobalConfig(C39857Fkb c39857Fkb) {
            Forest.globalConfig = c39857Fkb;
        }

        public final void initGlobal(C39857Fkb globalConfig) {
            o.LJIIJ(globalConfig, "globalConfig");
            setGlobalConfig(globalConfig);
        }

        public final void setApp(Application application) {
            o.LJIIJ(application, "<set-?>");
            Forest.app = application;
        }
    }

    public final void preload(C60714NsE c60714NsE) {
        preload$default(this, c60714NsE, null, null, 6, null);
    }

    public final void preload(C60714NsE c60714NsE, String str) {
        preload$default(this, c60714NsE, str, null, 4, null);
    }

    public final void preload(String str, RequestParams requestParams) {
        preload$default(this, str, requestParams, false, null, null, 28, null);
    }

    public final void preload(String str, RequestParams requestParams, boolean z) {
        preload$default(this, str, requestParams, z, null, null, 24, null);
    }

    public final void preload(String str, RequestParams requestParams, boolean z, String str2) {
        preload$default(this, str, requestParams, z, str2, null, 16, null);
    }

    public final Application getApplication() {
        return this.application;
    }

    public final C61156NzM getConfig() {
        return this.config;
    }

    public final Map<String, Class<? extends ResourceFetcher>> getFetcherMap$forest_release() {
        return this.fetcherMap;
    }

    public final GeckoXAdapter getGeckoXAdapter() {
        return this.geckoXAdapter;
    }

    public final C58411MwB getSessionManager$forest_release() {
        return this.sessionManager;
    }

    public final void closeSession(String sessionId) {
        o.LJIIJ(sessionId, "sessionId");
        C58411MwB c58411MwB = this.sessionManager;
        c58411MwB.getClass();
        Iterator it = ((LinkedHashMap) c58411MwB.LIZ).entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            if (o.LJ(((OSZ) entry.getKey()).getFirst(), sessionId)) {
                ((O5M) entry.getValue()).LIZ.LIZJ();
                it.remove();
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x002a, code lost:
    
        if (r14.isPreload$forest_release() == false) goto L9;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [X.O3v, T] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C61295O3v fetchSync$forest_release(X.C38515F9r r18) {
        /*
            Method dump skipped, instructions count: 487
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.forest.Forest.fetchSync$forest_release(X.F9r):X.O3v");
    }

    public final String openSession(String str) {
        this.sessionManager.getClass();
        if (str != null) {
            return str;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(String.valueOf(System.currentTimeMillis()));
        LIZ.append("-");
        LIZ.append(UUID.randomUUID().toString());
        return X1D.LIZIZ(LIZ);
    }

    public final void unregisterCustomFetcher(String fetcherName) {
        o.LJIIJ(fetcherName, "fetcherName");
        if (C61160NzQ.LIZ.contains(fetcherName)) {
            C39930Flm.LJ("ForestFacade", "can't remove builtin fetcher", 4);
        } else {
            this.fetcherMap.remove(fetcherName);
        }
    }

    public Forest(Application application, C61156NzM config) {
        Object LIZ;
        o.LJIIJ(application, "application");
        o.LJIIJ(config, "config");
        this.application = application;
        this.config = config;
        this.geckoXAdapter = new GeckoXAdapter(application, this);
        app = application;
        CDNFetcher.Companion.getClass();
        if (!CDNFetcher.isInitialized) {
            CDNFetcher.isInitialized = true;
            O4O.LJLLLL.add(new O45());
            try {
                C61325O4z.LIZJ(O41.LJLIL);
                LIZ = C76800UCe.LIZ;
                C3C5.m7constructorimpl(LIZ);
            } catch (Throwable th) {
                LIZ = C141335gf.LIZ(th);
                C3C5.m7constructorimpl(LIZ);
            }
            Throwable m10exceptionOrNullimpl = C3C5.m10exceptionOrNullimpl(LIZ);
            if (m10exceptionOrNullimpl != null) {
                JSONObject jSONObject = new JSONObject();
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("start idle task failed: ");
                LIZ2.append(m10exceptionOrNullimpl.getMessage());
                jSONObject.put("error", X1D.LIZIZ(LIZ2));
                jSONObject.put("tag", "TTNetDepender");
                jSONObject.put("type", 2);
                C61288O3o.LIZIZ("", null, jSONObject);
            }
        }
        this.fetcherMap = new LinkedHashMap();
        this.sessionManager = new C58411MwB(this.application);
    }

    private final boolean checkParams(String str, RequestParams requestParams) {
        if ((!C96Q.LIZ(requestParams.getChannel()) || !C96Q.LIZ(requestParams.getBundle())) && !C61026NxG.LIZ(str)) {
            return false;
        }
        return true;
    }

    public final C38515F9r createSyncRequest(String url, RequestParams params) {
        o.LJIIJ(url, "url");
        o.LJIIJ(params, "params");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("url:");
        LIZ.append(url);
        LIZ.append(" params:");
        LIZ.append(params);
        C39930Flm.LIZ("createSyncRequest", X1D.LIZIZ(LIZ));
        if (!checkParams(url, params)) {
            return null;
        }
        return new C38515F9r(params, url, this, null, EnumC38514F9q.PENDING);
    }

    public final void registerCustomFetcher(String fetcherName, Class<? extends ResourceFetcher> fetcherClass) {
        o.LJIIJ(fetcherName, "fetcherName");
        o.LJIIJ(fetcherClass, "fetcherClass");
        if (C61160NzQ.LIZ.contains(fetcherName)) {
            C39930Flm.LJ("ForestFacade", "fetcherName clash with builtin fetchers", 4);
        } else {
            this.fetcherMap.put(fetcherName, fetcherClass);
        }
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [T, X.O4c] */
    public final C38515F9r fetchResourceAsync(String url, RequestParams params, InterfaceC88472Yns<? super C61295O3v, C76800UCe> callback) {
        boolean z;
        o.LJIIJ(url, "url");
        o.LJIIJ(params, "params");
        o.LJIIJ(callback, "callback");
        long currentTimeMillis = System.currentTimeMillis();
        if (!checkParams(url, params)) {
            C39930Flm.LJ(null, "url invalid and channel/bundle not provided", 5);
            C61295O3v c61295O3v = new C61295O3v(new Request(url, this, params.getCustomParams(), null, false, false, false, false, false, false, false, false, false, false, 0, null, false, null, false, false, false, 0L, null, false, false, null, null, false, false, false, null, false, -8, null));
            C61287O3n c61287O3n = c61295O3v.LL;
            c61287O3n.getClass();
            c61287O3n.LJIIJJI = "url invalid and channel/bundle not provided";
            callback.invoke(c61295O3v);
            return null;
        }
        boolean LIZIZ = C61325O4z.LIZIZ();
        if (params.getEnableRequestReuse() || (C61283O3j.LIZIZ(url) != null && !params.isPreload$forest_release())) {
            C68322mC c68322mC = new C68322mC();
            c68322mC.element = null;
            ?? LIZ = C61283O3j.LIZ(url, new C61289O3p(this, c68322mC, params, currentTimeMillis, LIZIZ, callback, url));
            c68322mC.element = LIZ;
            if (LIZ != 0) {
                return null;
            }
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("request reuse failed, url:");
            LIZ2.append(url);
            z = true;
            C39930Flm.LJI(null, X1D.LIZIZ(LIZ2), true, 1);
        } else {
            z = true;
        }
        C39900FlI.LIZIZ(url, params);
        long currentTimeMillis2 = System.currentTimeMillis();
        Request LIZ3 = C61021NxB.LIZ(this, params, url, z);
        C39900FlI.LIZJ(LIZ3);
        StringBuilder LIZ4 = X1D.LIZ();
        LIZ4.append("request:");
        LIZ4.append(LIZ3);
        C39930Flm.LIZ("fetchResourceAsync", X1D.LIZIZ(LIZ4));
        C61295O3v c61295O3v2 = new C61295O3v(LIZ3);
        c61295O3v2.W(Long.valueOf(currentTimeMillis), "res_load_start");
        c61295O3v2.W(Long.valueOf(currentTimeMillis2), "init_start");
        C61284O3k LIZ5 = C61282O3i.LIZ(this, LIZ3);
        c61295O3v2.W(null, "init_finish");
        C38515F9r c38515F9r = new C38515F9r(params, url, this, LIZ5, EnumC38514F9q.FETCHING);
        LIZ5.LIZ(LIZ3, c61295O3v2, new C61292O3s(this, LIZ3, LIZIZ, c38515F9r, callback));
        return c38515F9r;
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x00e7 A[LOOP:5: B:51:0x00e1->B:53:0x00e7, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void preload(X.C60714NsE r13, java.lang.String r14, java.lang.String r15) {
        /*
            Method dump skipped, instructions count: 273
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.forest.Forest.preload(X.NsE, java.lang.String, java.lang.String):void");
    }

    public final void triggerCallback(boolean z, InterfaceC88472Yns<? super C61295O3v, C76800UCe> interfaceC88472Yns, C61295O3v c61295O3v) {
        if (z) {
            C61325O4z.LJFF(new ARunnableS29S0200000_10(interfaceC88472Yns, c61295O3v, 4));
        } else {
            interfaceC88472Yns.invoke(c61295O3v);
        }
    }

    public static /* synthetic */ String openSession$default(Forest forest, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        return forest.openSession(str);
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x0098, code lost:
    
        if (r1.LJIJ() != true) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00e9, code lost:
    
        if (r1 != null) goto L42;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void finishWithCallback(X.C61295O3v r8, boolean r9, X.C38515F9r r10, X.InterfaceC88472Yns<? super X.C61295O3v, X.C76800UCe> r11) {
        /*
            r7 = this;
            X.O4O r1 = r8.N()
            boolean r0 = r8.LJZL
            java.lang.String r6 = "ForestFacade"
            r3 = 0
            r5 = 0
            r4 = 1
            if (r0 == 0) goto L16
            if (r1 != 0) goto L16
            java.lang.String r0 = "load succeeds with no ForestBuffer"
            X.C39930Flm.LIZJ(r6, r0, r3, r4)
            r8.LJZL = r5
        L16:
            boolean r0 = r8.LJZL
            if (r0 == 0) goto Lb9
            com.bytedance.forest.model.Request r0 = r8.LJZI
            boolean r0 = r0.getLoadToMemory()
            if (r0 == 0) goto L3b
            boolean r0 = X.C61325O4z.LIZIZ()
            if (r0 == 0) goto L2e
            java.lang.String r2 = "IO operation in UI thread"
            r0 = 4
            X.C39930Flm.LJ(r6, r2, r0)
        L2e:
            r8.R()
            if (r1 == 0) goto L39
            boolean r0 = r1.LJIJ()
            if (r0 == r4) goto L3b
        L39:
            r8.LJZL = r5
        L3b:
            com.bytedance.forest.model.Request r0 = r8.LJZI
            boolean r0 = r0.getNeedLocalFile()
            if (r0 == 0) goto L5a
            java.lang.String r0 = r8.getFilePath()
            if (r0 != 0) goto L5a
            java.lang.String r2 = "forest"
            java.lang.String r0 = "escape from fetcher"
            X.C39930Flm.LIZJ(r2, r0, r3, r4)
            if (r1 == 0) goto L58
            boolean r0 = r1.LJJIZ(r8)
            if (r0 == r4) goto L5a
        L58:
            r8.LJZL = r5
        L5a:
            boolean r0 = r8.LJZL
            if (r0 == 0) goto Le9
            com.bytedance.forest.model.Request r0 = r8.LJZI
            boolean r0 = r0.getEnableMemoryCache()
            if (r0 == 0) goto Le9
            java.lang.String r2 = r8.LLD
            java.lang.String r0 = "memory"
            boolean r0 = kotlin.jvm.internal.o.LJ(r2, r0)
            r0 = r0 ^ 1
            if (r0 == 0) goto Le9
            java.lang.String r2 = r8.LLD
            java.lang.String r0 = "builtin"
            boolean r0 = kotlin.jvm.internal.o.LJ(r2, r0)
            r0 = r0 ^ 1
            if (r0 == 0) goto Le9
            X.O40.LJFF(r8)
            if (r1 == 0) goto L9a
            boolean r0 = r1.LJIILL()
            if (r0 != 0) goto L91
            X.O4L r0 = X.O4L.FORCE_MEMORY
            boolean r0 = r1.LJIIL(r0)
            if (r0 == 0) goto L94
        L91:
            X.O40.LJ(r8, r1)
        L94:
            boolean r0 = r1.LJIJ()
            if (r0 == r4) goto Lb9
        L9a:
            com.bytedance.forest.model.Request r0 = r8.LJZI
            boolean r0 = r0.getParallelLoading()
            if (r0 == 0) goto Lb9
            if (r1 == 0) goto La9
            X.O4L r0 = X.O4L.FORCE_MEMORY
            r1.LJIIL(r0)
        La9:
            java.lang.ref.WeakReference r2 = new java.lang.ref.WeakReference
            r2.<init>(r8)
            kotlin.jvm.internal.AqS160S0100000_10 r1 = new kotlin.jvm.internal.AqS160S0100000_10
            r0 = 16
            r1.<init>(r2, r0)
            X.C61325O4z.LJ(r1)
        Lb9:
            java.lang.String r0 = "res_load_finish"
            r8.W(r3, r0)
            X.F9q r1 = X.EnumC38514F9q.FINISHED
            r10.getClass()
            java.lang.String r0 = "<set-?>"
            kotlin.jvm.internal.o.LJIIJ(r1, r0)
            r10.LJ = r1
            r7.triggerCallback(r9, r11, r8)
            java.lang.StringBuilder r1 = X.X1D.LIZ()
            java.lang.String r0 = "response:"
            r1.append(r0)
            r1.append(r8)
            java.lang.String r1 = X.X1D.LIZIZ(r1)
            java.lang.String r0 = "fetchResourceAsync"
            X.C39930Flm.LIZ(r0, r1)
            X.C39900FlI.LIZ(r8)
            X.C61288O3o.LIZJ(r8)
            return
        Le9:
            if (r1 == 0) goto L9a
            goto L94
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.forest.Forest.finishWithCallback(X.O3v, boolean, X.F9r, X.Yns):void");
    }

    public final C61295O3v reuseResponse(C61295O3v c61295O3v, C61302O4c c61302O4c, RequestParams requestParams, long j) {
        Request request = c61295O3v.LJZI;
        boolean z = c61295O3v.LJZL;
        C61287O3n errorInfo = c61295O3v.LL;
        String str = c61295O3v.LLD;
        String str2 = c61295O3v.LLF;
        boolean z2 = c61295O3v.LLFF;
        long j2 = c61295O3v.LLFFF;
        String successFetcher = c61295O3v.LLFII;
        o.LJIIJ(request, "request");
        o.LJIIJ(errorInfo, "errorInfo");
        o.LJIIJ(successFetcher, "successFetcher");
        C61295O3v c61295O3v2 = new C61295O3v(request, z, errorInfo, str, str2, z2, j2, successFetcher);
        Request copy$default = Request.copy$default(c61295O3v.LJZI, null, null, null, null, false, false, false, false, false, false, false, false, false, false, 0, null, false, null, false, false, false, 0L, null, false, false, null, null, false, false, false, null, false, -1, null);
        o.LJIIJ(copy$default, "<set-?>");
        c61295O3v2.LJZI = copy$default;
        c61295O3v2.LJLLLLLL = true;
        c61295O3v2.LJLL = c61295O3v.getDataType();
        c61295O3v2.LJLLJ = c61295O3v.L();
        c61295O3v2.LJLLL = c61295O3v.LJLLL;
        c61295O3v2.LJLJJI = c61295O3v.LJLJJI;
        c61295O3v2.LJZI.setPreload(false);
        c61295O3v2.LJZI.setEnableRequestReuse(true);
        c61295O3v2.LJZI.setGroupId(requestParams.getGroupId());
        c61295O3v2.LJZI.setCustomParams(requestParams.getCustomParams());
        if (c61295O3v2.LJZI.getScene() == EnumC61028NxI.LYNX_IMAGE && c61295O3v2.O() != null) {
            c61295O3v2.LJLLLL = true;
        }
        O4O N = c61295O3v.N();
        if (N != null || (N = O40.LIZIZ(c61295O3v2)) != null) {
            if (!N.LJIJ() && c61295O3v2.LJZI.getLoadToMemory()) {
                N.LJJIJIIJIL(c61295O3v2);
            } else if (c61302O4c == null || !c61302O4c.LJLILLLLZI) {
                c61295O3v2.LJLLLL = true;
            }
            c61295O3v2.X(N);
        }
        if ((c61302O4c == null || !c61302O4c.LJLILLLLZI) && c61295O3v2.LJLLLL && (!o.LJ(c61295O3v2.LLD, "memory"))) {
            c61295O3v2.LLF = c61295O3v.LLD;
            c61295O3v2.LLD = "memory";
        }
        ((LinkedHashMap) c61295O3v2.LJZ).clear();
        c61295O3v2.W(Long.valueOf(j), "res_load_start");
        c61295O3v2.W(Long.valueOf(System.currentTimeMillis()), "res_load_finish");
        return c61295O3v2;
    }

    public final void preload(String url, RequestParams params, boolean z, String str, String str2) {
        String str3;
        String str4;
        boolean z2;
        o.LJIIJ(url, "url");
        o.LJIIJ(params, "params");
        C61283O3j c61283O3j = C61283O3j.LIZLLL;
        C61283O3j.LJFF(url);
        if (str != null) {
            str3 = str;
        } else {
            str3 = "";
        }
        params.setGroupId(str3);
        params.setSessionId(str2);
        c61283O3j.LJ(this, url, params);
        boolean z3 = false;
        if (s.LJJJLZIJ(url, "?", false)) {
            str4 = url.substring(0, s.LJJLIIIJL(url, "?", 0, false, 6));
            o.LJFF(str4, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        } else {
            str4 = url;
        }
        if (ujb.o.LJJJJ(str4, ".html", false) || ujb.o.LJJJJ(str4, ".htm", false) || params.getResourceScene() == EnumC61028NxI.WEB_MAIN_DOCUMENT) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (ujb.o.LJJJJ(str4, "/template.js", false) || params.getResourceScene() == EnumC61028NxI.LYNX_TEMPLATE) {
            z3 = true;
        }
        if ((!z2 && !z3) || !z) {
            C39930Flm.LIZ("PreloadAPI", "Url:" + url + " not need sub-resources preload, withSubResources=" + z + ", scene=" + params.getResourceScene());
            return;
        }
        RunnableC61025NxF runnableC61025NxF = new RunnableC61025NxF(this, str4, str, str2, params, url, z2);
        if (C61325O4z.LIZIZ()) {
            AsyncTask.THREAD_POOL_EXECUTOR.execute(runnableC61025NxF);
        } else {
            runnableC61025NxF.run();
        }
    }

    public static /* synthetic */ void preload$default(Forest forest, C60714NsE c60714NsE, String str, String str2, int i, Object obj) {
        if ((i & 2) != 0) {
            str = null;
        }
        if ((i & 4) != 0) {
            str2 = null;
        }
        forest.preload(c60714NsE, str, str2);
    }

    public static /* synthetic */ void preload$default(Forest forest, String str, RequestParams requestParams, boolean z, String str2, String str3, int i, Object obj) {
        boolean z2 = z;
        String str4 = str2;
        if ((i & 4) != 0) {
            z2 = false;
        }
        String str5 = null;
        if ((i & 8) != 0) {
            str4 = null;
        }
        if ((i & 16) == 0) {
            str5 = str3;
        }
        forest.preload(str, requestParams, z2, str4, str5);
    }
}
