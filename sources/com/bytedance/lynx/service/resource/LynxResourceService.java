package com.bytedance.lynx.service.resource;

import X.C1B6;
import X.C278817o;
import X.C36882Edi;
import X.C38515F9r;
import X.C40033FnR;
import X.C46713IUz;
import X.C47148Ieu;
import X.C47396Iiu;
import X.C61023NxD;
import X.C61156NzM;
import X.C61157NzN;
import X.C61295O3v;
import X.C61532OCy;
import X.C70657RoD;
import X.C96Q;
import X.EBC;
import X.EnumC61028NxI;
import X.InterfaceC79289V9x;
import X.O3M;
import X.O3N;
import X.O3O;
import X.O3P;
import X.O3Q;
import X.O3R;
import X.O3S;
import X.O3T;
import X.VA4;
import android.app.Application;
import android.net.Uri;
import com.bytedance.forest.Forest;
import com.bytedance.forest.chain.fetchers.GeckoXAdapter;
import com.bytedance.forest.model.RequestParams;
import com.bytedance.geckox.settings.model.GlobalConfigSettings;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.lynx.tasm.base.LLog;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.o;
import ujb.s;

/* loaded from: classes11.dex */
public final class LynxResourceService implements VA4 {
    public static File appFileDir;
    public static C61156NzM forestConfig;
    public static Forest forestLoader;
    public static C40033FnR lynxServiceConfig;
    public static LinkedHashMap<String, String> prefixMap;
    public static final LynxResourceService INSTANCE = new LynxResourceService();
    public static final ReentrantLock lock = new ReentrantLock();

    private final C61156NzM initForestConfig() {
        C40033FnR c40033FnR = lynxServiceConfig;
        if (c40033FnR != null) {
            String str = c40033FnR.LIZJ;
            long parseLong = CastLongProtector.parseLong(c40033FnR.LIZLLL);
            C40033FnR c40033FnR2 = lynxServiceConfig;
            if (c40033FnR2 != null) {
                C61157NzN c61157NzN = new C61157NzN(parseLong, "", str, c40033FnR2.LJ, c40033FnR2.LJI, c40033FnR2.LJII, true);
                C40033FnR c40033FnR3 = lynxServiceConfig;
                if (c40033FnR3 != null) {
                    C61156NzM c61156NzM = new C61156NzM(c40033FnR3.LIZIZ, c61157NzN);
                    c61156NzM.LIZIZ = true;
                    return c61156NzM;
                }
                o.LJIIZILJ();
                throw null;
            }
            o.LJIIZILJ();
            throw null;
        }
        o.LJIIZILJ();
        throw null;
    }

    private final boolean isForestInitial() {
        if (forestLoader != null) {
            return true;
        }
        return false;
    }

    private final boolean isInitial() {
        if (lynxServiceConfig != null && prefixMap != null && forestConfig != null) {
            return true;
        }
        return false;
    }

    public final void initForest() {
        C40033FnR c40033FnR = lynxServiceConfig;
        if (c40033FnR != null) {
            Application application = c40033FnR.LIZ;
            C61156NzM c61156NzM = forestConfig;
            if (c61156NzM != null) {
                forestLoader = new Forest(application, c61156NzM);
                return;
            } else {
                o.LJIIZILJ();
                throw null;
            }
        }
        o.LJIIZILJ();
        throw null;
    }

    private final RequestParams createRequestParams(O3M o3m) {
        ArrayList arrayList = new ArrayList();
        Iterator<O3N> it = o3m.LIZIZ.iterator();
        while (it.hasNext()) {
            O3N lynxServiceFetcherType = it.next();
            o.LJFF(lynxServiceFetcherType, "lynxServiceFetcherType");
            String forestType = toForestType(lynxServiceFetcherType);
            if (forestType != null) {
                arrayList.add(forestType);
            }
        }
        RequestParams requestParams = new RequestParams(null, 1, null);
        requestParams.setResourceScene(EnumC61028NxI.valueOf(o3m.LIZ.toString()));
        requestParams.setFetcherSequence(arrayList);
        String str = o3m.LIZJ;
        o.LJFF(str, "lynxResourceRequestParams.accessKey");
        requestParams.setAccessKey(str);
        requestParams.setChannel(null);
        requestParams.setBundle(null);
        Boolean bool = o3m.LIZLLL;
        o.LJFF(bool, "lynxResourceRequestParams.waitGeckoUpdate");
        requestParams.setWaitGeckoUpdate(bool.booleanValue());
        Boolean bool2 = o3m.LJ;
        o.LJFF(bool2, "lynxResourceRequestParams.loadToMemory");
        requestParams.setLoadToMemory(bool2.booleanValue());
        Boolean bool3 = o3m.LJFF;
        o.LJFF(bool3, "lynxResourceRequestParams.allowIOOnMainThread");
        requestParams.setAllowIOOnMainThread(bool3.booleanValue());
        Boolean bool4 = o3m.LJI;
        o.LJFF(bool4, "lynxResourceRequestParams.checkGeckoFileAvailable");
        requestParams.setCheckGeckoFileAvailable(bool4.booleanValue());
        Boolean bool5 = o3m.LJII;
        o.LJFF(bool5, "lynxResourceRequestParams.disableCdn");
        requestParams.setDisableCdn(bool5.booleanValue());
        Boolean bool6 = o3m.LJIIIIZZ;
        o.LJFF(bool6, "lynxResourceRequestParams.disableBuiltin");
        requestParams.setDisableBuiltin(bool6.booleanValue());
        Boolean bool7 = o3m.LJIIIZ;
        o.LJFF(bool7, "lynxResourceRequestParams.disableOffline");
        requestParams.setDisableOffline(bool7.booleanValue());
        Boolean bool8 = o3m.LJIIJ;
        o.LJFF(bool8, "lynxResourceRequestParams.onlyLocal");
        requestParams.setOnlyLocal(bool8.booleanValue());
        Boolean bool9 = o3m.LJIIJJI;
        o.LJFF(bool9, "lynxResourceRequestParams.onlyOnline");
        requestParams.setOnlyOnline(bool9.booleanValue());
        Integer num = o3m.LJIIL;
        o.LJFF(num, "lynxResourceRequestParams.loadRetryTimes");
        requestParams.setLoadRetryTimes(num.intValue());
        requestParams.setEnableNegotiation(null);
        requestParams.setEnableMemoryCache(o3m.LJIILIIL);
        requestParams.setEnableCDNCache(null);
        String str2 = o3m.LJIILJJIL;
        o.LJFF(str2, "lynxResourceRequestParams.groupId");
        requestParams.setGroupId(str2);
        Boolean bool10 = o3m.LJIILL;
        o.LJFF(bool10, "lynxResourceRequestParams.enableRequestReuse");
        requestParams.setEnableRequestReuse(bool10.booleanValue());
        return requestParams;
    }

    private final String getPath(String str) {
        boolean z;
        if (str == null || ujb.o.LJJJJJL(str)) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return null;
        }
        Uri uri = UriProtector.parse(str);
        o.LJFF(uri, "uri");
        if (uri.getScheme() != null) {
            String scheme = uri.getScheme();
            if (scheme != null) {
                o.LJFF(scheme, "uri.getScheme()!!");
                if (ujb.o.LJJJLIIL(scheme, "http", false)) {
                    return uri.getPath();
                }
            } else {
                o.LJIIZILJ();
                throw null;
            }
        }
        return null;
    }

    private final String getPrefix(String str) {
        ReentrantLock reentrantLock = lock;
        reentrantLock.lock();
        try {
            LinkedHashMap<String, String> linkedHashMap = prefixMap;
            if (linkedHashMap != null) {
                String str2 = linkedHashMap.get(str);
                reentrantLock.unlock();
                return str2;
            }
            o.LJIIZILJ();
            throw null;
        } catch (Throwable th) {
            lock.unlock();
            throw th;
        }
    }

    private final boolean isContainerGeckoResource(String str) {
        Uri parse = UriProtector.parse(str);
        if (C96Q.LIZ(UriProtector.getQueryParameter(parse, "bundle")) && C96Q.LIZ(UriProtector.getQueryParameter(parse, "channel"))) {
            return true;
        }
        return C96Q.LIZ(UriProtector.getQueryParameter(parse, "prefix"));
    }

    private final boolean isFrescoLocalResource(String str) {
        if (!ujb.o.LJJJLIIL(str, "file://", false) && !ujb.o.LJJJLIIL(str, "content://", false) && !ujb.o.LJJJLIIL(str, "asset://", false) && !ujb.o.LJJJLIIL(str, "data:", false)) {
            return false;
        }
        return true;
    }

    private final String prefix2AccessKey(String str) {
        GlobalConfigSettings.ResourceMeta resourceMeta;
        C61532OCy c61532OCy = EBC.LIZ;
        o.LJFF(c61532OCy, "GeckoGlobalManager.inst()");
        GlobalConfigSettings LJFF = c61532OCy.LJFF();
        if (LJFF != null) {
            resourceMeta = LJFF.getResourceMeta();
        } else {
            resourceMeta = null;
        }
        if (resourceMeta == null) {
            LLog.LIZLLL(4, "LynxResourceService", "could not get any valid resource meta");
            return null;
        }
        GlobalConfigSettings.CurrentLevelConfig config = resourceMeta.getConfig();
        if (config == null) {
            LLog.LIZLLL(4, "LynxResourceService", "could not get any valid config");
            return null;
        }
        Map<String, String> prefix2AccessKey = config.getPrefix2AccessKey();
        if (prefix2AccessKey == null) {
            return null;
        }
        return prefix2AccessKey.get(str);
    }

    private final String toForestType(O3N o3n) {
        if (o3n == O3N.GECKO) {
            return "gecko";
        }
        if (o3n == O3N.BUILTIN) {
            return "builtin";
        }
        if (o3n == O3N.MEMORY) {
            return "memory";
        }
        if (o3n == O3N.CDN) {
            return "cdn";
        }
        return null;
    }

    @Override // X.VA4
    public String geckoResourcePathForUrlString(String str) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        C61023NxD LIZ;
        if (!isInitial()) {
            return null;
        }
        boolean z5 = true;
        if (str == null || str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return null;
        }
        String path = getPath(str);
        if (path == null || path.length() == 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            return null;
        }
        String prefix = getPrefix(path);
        if (prefix == null || prefix.length() == 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (z3) {
            prefix = queryPrefixFromUrl(str, path);
        }
        if (prefix == null || prefix.length() == 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4) {
            prefix = GeckoXAdapter.Companion.getPrefixAsGeckoCDN(path);
        }
        if (C96Q.LIZ(prefix)) {
            setPrefix(path, prefix);
            String prefix2AccessKey = prefix2AccessKey(prefix);
            if (prefix2AccessKey != null && prefix2AccessKey.length() != 0) {
                z5 = false;
            }
            if (!z5 && (LIZ = C36882Edi.LIZ(str, prefix)) != null) {
                if (appFileDir == null) {
                    C40033FnR c40033FnR = lynxServiceConfig;
                    if (c40033FnR != null) {
                        appFileDir = c40033FnR.LIZ.getFilesDir();
                    } else {
                        o.LJIIZILJ();
                        throw null;
                    }
                }
                C40033FnR c40033FnR2 = lynxServiceConfig;
                if (c40033FnR2 != null) {
                    String str2 = c40033FnR2.LIZJ;
                    try {
                        File file = new File(appFileDir, str2);
                        if (!file.exists()) {
                            file.mkdirs();
                        }
                    } catch (Exception unused) {
                        new File(str2);
                    }
                    StringBuilder LIZJ = C278817o.LIZJ(C70657RoD.LJIIIZ(prefix2AccessKey, LIZ.LJLILLLLZI));
                    LIZJ.append(File.separator);
                    LIZJ.append(s.LJJLL("/", LIZ.LJLJI));
                    String sb = LIZJ.toString();
                    if (C1B6.LIZIZ(sb)) {
                        return sb;
                    }
                } else {
                    o.LJIIZILJ();
                    throw null;
                }
            }
        }
        return null;
    }

    public final void initialize(C40033FnR lynxServiceConfig2) {
        o.LJIIJ(lynxServiceConfig2, "lynxServiceConfig");
        lynxServiceConfig = lynxServiceConfig2;
        forestConfig = initForestConfig();
        prefixMap = new C46713IUz();
    }

    @Override // X.VA4
    public int isGeckoResource(String str) {
        String str2;
        if (isInitial()) {
            C40033FnR c40033FnR = lynxServiceConfig;
            if (c40033FnR != null) {
                if (!c40033FnR.LJIIJJI) {
                    if (str == null || str.length() == 0 || isFrescoLocalResource(str)) {
                        return 0;
                    }
                    if (!ujb.o.LJJJLIIL(str, "http", false)) {
                        return -1;
                    }
                    String path = getPath(str);
                    if (path == null || path.length() == 0) {
                        return 0;
                    }
                    C61532OCy c61532OCy = EBC.LIZ;
                    o.LJFF(c61532OCy, "GeckoGlobalManager.inst()");
                    GlobalConfigSettings LJFF = c61532OCy.LJFF();
                    if (LJFF == null || LJFF.getResourceMeta() == null) {
                        LLog.LIZLLL(4, "LynxResourceService", "could not get any valid resource meta");
                        return 0;
                    }
                    LinkedHashMap<String, String> linkedHashMap = prefixMap;
                    if (linkedHashMap != null) {
                        if (!linkedHashMap.containsKey(path) || (str2 = getPrefix(path)) == null) {
                            str2 = "";
                        }
                        if ((str2.length() == 0 && (str2 = queryPrefixFromUrl(str, path)) == null) || str2.length() == 0) {
                            str2 = GeckoXAdapter.Companion.getPrefixAsGeckoCDN(path);
                        }
                        if (str2.length() == 0) {
                            if (isContainerGeckoResource(str)) {
                                return -1;
                            }
                            return 0;
                        }
                        setPrefix(path, str2);
                        if (C96Q.LIZ(prefix2AccessKey(str2))) {
                            return 1;
                        }
                        if (isContainerGeckoResource(str)) {
                            return -1;
                        }
                        return 0;
                    }
                    o.LJIIZILJ();
                    throw null;
                }
            } else {
                o.LJIIZILJ();
                throw null;
            }
        }
        return -1;
    }

    private final String queryPrefixFromUrl(String str, String str2) {
        boolean z;
        String queryParameter = UriProtector.getQueryParameter(UriProtector.parse(str), "prefix");
        if (queryParameter == null || queryParameter.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return "";
        }
        Integer valueOf = Integer.valueOf(s.LJJLIIIJL(str2, queryParameter, 0, false, 6));
        if (valueOf.intValue() == -1) {
            return "";
        }
        String substring = str2.substring(0, queryParameter.length() + valueOf.intValue());
        o.LJFF(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        return substring;
    }

    private final void setPrefix(String str, String str2) {
        ReentrantLock reentrantLock = lock;
        reentrantLock.lock();
        try {
            LinkedHashMap<String, String> linkedHashMap = prefixMap;
            if (linkedHashMap != null) {
                linkedHashMap.put(str, str2);
                reentrantLock.unlock();
            } else {
                o.LJIIZILJ();
                throw null;
            }
        } catch (Throwable th) {
            lock.unlock();
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:86:0x0139 A[LOOP:6: B:86:0x0139->B:88:0x013f, LOOP_START, PHI: r4
      0x0139: PHI (r4v1 int) = (r4v0 int), (r4v2 int) binds: [B:85:0x0137, B:88:0x013f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:92:? A[RETURN, SYNTHETIC] */
    @Override // X.VA4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void cancelPreloadMedia(java.lang.String r12, java.lang.String r13) {
        /*
            Method dump skipped, instructions count: 338
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.lynx.service.resource.LynxResourceService.cancelPreloadMedia(java.lang.String, java.lang.String):void");
    }

    @Override // X.VA4
    public InterfaceC79289V9x fetchResourceSync(String str, O3M lynxResourceRequestParams) {
        C61295O3v LIZ;
        o.LJIIJ(lynxResourceRequestParams, "lynxResourceRequestParams");
        if (!isInitial()) {
            return new O3P(-1, "LynxResourceService is Not initialized");
        }
        if (str == null || str.length() == 0) {
            return new O3P(2, "empty url");
        }
        String path = getPath(str);
        if (path == null || path.length() == 0) {
            return new O3P(3, "invalid url");
        }
        if (!isForestInitial()) {
            initForest();
        }
        Forest forest = forestLoader;
        if (forest != null) {
            C38515F9r createSyncRequest = forest.createSyncRequest(str, createRequestParams(lynxResourceRequestParams));
            if (createSyncRequest == null || (LIZ = new O3Q(createSyncRequest).LIZ.LIZ()) == null) {
                return null;
            }
            return new O3T(LIZ);
        }
        o.LJIIZILJ();
        throw null;
    }

    @Override // X.VA4
    public void preload(String str, O3M lynxResourceRequestParams) {
        String path;
        o.LJIIJ(lynxResourceRequestParams, "lynxResourceRequestParams");
        if (!isInitial() || str == null || str.length() == 0 || (path = getPath(str)) == null || path.length() == 0) {
            return;
        }
        if (!isForestInitial()) {
            initForest();
        }
        Forest forest = forestLoader;
        if (forest != null) {
            Forest.preload$default(forest, str, createRequestParams(lynxResourceRequestParams), false, null, null, 28, null);
        } else {
            o.LJIIZILJ();
            throw null;
        }
    }

    @Override // X.VA4
    public O3S fetchResourceAsync(String str, O3M lynxResourceRequestParams, O3R callback) {
        o.LJIIJ(lynxResourceRequestParams, "lynxResourceRequestParams");
        o.LJIIJ(callback, "callback");
        if (!isInitial()) {
            callback.LIZ(new O3P(-1, "LynxResourceService is Not initialized"));
            return null;
        }
        if (str == null || str.length() == 0) {
            callback.LIZ(new O3P(2, "empty url"));
            return null;
        }
        String path = getPath(str);
        if (path == null || path.length() == 0) {
            callback.LIZ(new O3P(3, "invalid url"));
            return null;
        }
        if (!isForestInitial()) {
            initForest();
        }
        Forest forest = forestLoader;
        if (forest != null) {
            C38515F9r fetchResourceAsync = forest.fetchResourceAsync(str, createRequestParams(lynxResourceRequestParams), new O3O(callback));
            if (fetchResourceAsync == null) {
                return null;
            }
            return new O3Q(fetchResourceAsync);
        }
        o.LJIIZILJ();
        throw null;
    }

    @Override // X.VA4
    public void preloadMedia(String url, String preloadKey, String str, long j) {
        o.LJIIJ(url, "url");
        o.LJIIJ(preloadKey, "preloadKey");
        C47148Ieu.LIZ.LJIILLIIL(new C47396Iiu(j, preloadKey, str, new String[]{url}));
    }
}
