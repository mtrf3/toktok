package com.bytedance.forest.chain.fetchers;

import X.AbstractC61537ODd;
import X.C113554cx;
import X.C25620zW;
import X.C38350F3i;
import X.C39417FdV;
import X.C39857Fkb;
import X.C39929Fll;
import X.C39930Flm;
import X.C61156NzM;
import X.C61157NzN;
import X.C61276O3c;
import X.C61295O3v;
import X.C61520OCm;
import X.C61532OCy;
import X.C70657RoD;
import X.C96Q;
import X.EBC;
import X.InterfaceC39418FdW;
import X.InterfaceC61465OAj;
import X.O2T;
import X.O3E;
import X.O5M;
import X.OSZ;
import X.X1D;
import android.app.Application;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.forest.Forest;
import com.bytedance.forest.model.ForestEnvData;
import com.bytedance.forest.model.ForestEnvType;
import com.bytedance.forest.model.Request;
import com.bytedance.geckox.GeckoGlobalConfig;
import com.bytedance.geckox.OptionCheckUpdateParams;
import com.bytedance.geckox.model.CheckRequestBodyModel;
import com.bytedance.geckox.settings.model.GlobalConfigSettings;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;
import ujb.s;

/* loaded from: classes11.dex */
public final class GeckoXAdapter {
    public static Map<String, String> CDNMultiVersionCommonParamsDelegate;
    public static final Companion Companion = new Companion();
    public static final List<String> fallbackCDNMultiVersionDomains = new ArrayList();
    public static String geckoBucketId = "-1";
    public final Application app;
    public File appFileDir;
    public final Forest forest;
    public final C61156NzM forestConfig;
    public final HashMap<String, C61520OCm> geckoClients;
    public final InterfaceC61465OAj mStatisticMonitor;

    /* loaded from: classes11.dex */
    public static final class Companion {
        public final String dealWithBoeDomainIfNeed(String host) {
            o.LJIIJ(host, "host");
            return host;
        }

        public final Map<String, String> getCDNMultiVersionCommonParams() {
            String str;
            Companion companion = GeckoXAdapter.Companion;
            String str2 = null;
            if (GeckoXAdapter.CDNMultiVersionCommonParamsDelegate != null) {
                Map<String, String> map = GeckoXAdapter.CDNMultiVersionCommonParamsDelegate;
                if (map != null) {
                    return map;
                }
                o.LJIJI("CDNMultiVersionCommonParamsDelegate");
                throw null;
            }
            C61532OCy c61532OCy = EBC.LIZ;
            o.LJFF(c61532OCy, "GeckoGlobalManager.inst()");
            c61532OCy.LIZIZ();
            if (c61532OCy.LJ != null) {
                OSZ[] oszArr = new OSZ[5];
                o.LJFF(c61532OCy, "GeckoGlobalManager.inst()");
                c61532OCy.LIZIZ();
                GeckoGlobalConfig geckoGlobalConfig = c61532OCy.LJ;
                if (geckoGlobalConfig != null) {
                    str2 = geckoGlobalConfig.getAppVersion();
                }
                oszArr[0] = new OSZ("version_name", str2);
                oszArr[1] = new OSZ("device_platform", "android");
                oszArr[2] = new OSZ("os", "android");
                o.LJFF(c61532OCy, "GeckoGlobalManager.inst()");
                c61532OCy.LIZIZ();
                GeckoGlobalConfig geckoGlobalConfig2 = c61532OCy.LJ;
                if (geckoGlobalConfig2 != null) {
                    str = String.valueOf(geckoGlobalConfig2.getAppId());
                } else {
                    str = null;
                }
                oszArr[3] = new OSZ("aid", str);
                oszArr[4] = new OSZ("gecko_bkt", getGeckoBucketId$default(companion, null, 1, null));
                Map<String, String> LJJL = C113554cx.LJJL(oszArr);
                GeckoXAdapter.CDNMultiVersionCommonParamsDelegate = LJJL;
                return LJJL;
            }
            return C113554cx.LJJL(new OSZ("version_name", ""), new OSZ("device_platform", "android"), new OSZ("os", "android"), new OSZ("aid", ""), new OSZ("gecko_bkt", "9"));
        }

        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final String addCommonParamsForCDNMultiVersionURL(String url) {
            ForestEnvData forestEnvData;
            String str;
            o.LJIIJ(url, "url");
            if (!isCDNMultiVersionResource(url)) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append(url);
                LIZ.append(" is not a cdn-multiple-version url");
                C39930Flm.LJI("GeckoXAdapter", X1D.LIZIZ(LIZ), false, 4);
                return url;
            }
            Map<String, String> cDNMultiVersionCommonParams = getCDNMultiVersionCommonParams();
            if (cDNMultiVersionCommonParams.isEmpty()) {
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("no cdn-multiple-version params need to add on ");
                LIZ2.append(url);
                C39930Flm.LJI("GeckoXAdapter", X1D.LIZIZ(LIZ2), false, 4);
            }
            try {
                Uri parse = UriProtector.parse(url);
                Uri.Builder buildUpon = parse.buildUpon();
                for (Map.Entry<String, String> entry : cDNMultiVersionCommonParams.entrySet()) {
                    if (UriProtector.getQueryParameter(parse, entry.getKey()) == null) {
                        buildUpon.appendQueryParameter(entry.getKey(), entry.getValue());
                    } else {
                        StringBuilder LIZ3 = X1D.LIZ();
                        LIZ3.append("Parameter ");
                        LIZ3.append(entry.getKey());
                        LIZ3.append(" of cdn-multiple-version already exists, value is:");
                        LIZ3.append(entry.getValue());
                        LIZ3.append('.');
                        C39930Flm.LJI("GeckoXAdapter", X1D.LIZIZ(LIZ3), false, 4);
                    }
                }
                C39857Fkb globalConfig = Forest.Companion.getGlobalConfig();
                if (globalConfig != null && (forestEnvData = globalConfig.LIZIZ) != null) {
                    OSZ[] oszArr = new OSZ[2];
                    if (forestEnvData.getType() == ForestEnvType.PPE) {
                        str = "x-use-ppe";
                    } else {
                        str = "x-use-boe";
                    }
                    oszArr[0] = new OSZ(str, "1");
                    oszArr[1] = new OSZ("x-tt-env", forestEnvData.getName());
                    for (Map.Entry entry2 : C113554cx.LJJL(oszArr).entrySet()) {
                        if (UriProtector.getQueryParameter(parse, (String) entry2.getKey()) == null) {
                            buildUpon.appendQueryParameter((String) entry2.getKey(), (String) entry2.getValue());
                        } else {
                            StringBuilder LIZ4 = X1D.LIZ();
                            LIZ4.append("Parameter ");
                            LIZ4.append((String) entry2.getKey());
                            LIZ4.append(" of cdn-multiple-version already exists for ");
                            LIZ4.append(url);
                            LIZ4.append(", except:");
                            LIZ4.append((String) entry2.getValue());
                            LIZ4.append(", current:");
                            LIZ4.append(UriProtector.getQueryParameter(parse, (String) entry2.getKey()));
                            LIZ4.append('.');
                            C39930Flm.LJI("GeckoXAdapter", X1D.LIZIZ(LIZ4), false, 4);
                        }
                    }
                }
                String host = parse.getHost();
                if (host != null) {
                    dealWithBoeDomainIfNeed(host);
                    if (o.LJ(host, host)) {
                        String uri = buildUpon.build().toString();
                        o.LJFF(uri, "builder.build().toString()");
                        return ujb.o.LJJJJZ(uri, host, host, false);
                    }
                    String uri2 = buildUpon.build().toString();
                    o.LJFF(uri2, "builder.build().toString()");
                    return uri2;
                }
                o.LJIIZILJ();
                throw null;
            } catch (Throwable th) {
                StringBuilder LIZIZ = C25620zW.LIZIZ("build cdn-multiple-version for ", url, " failed, error: ");
                LIZIZ.append(th.getMessage());
                C39930Flm.LJ("GeckoXAdapter", X1D.LIZIZ(LIZIZ), 4);
                return url;
            }
        }

        public final void addDefaultCDNMultiVersionDomains(List<String> domains) {
            o.LJIIJ(domains, "domains");
            GeckoXAdapter.fallbackCDNMultiVersionDomains.addAll(domains);
        }

        public final boolean canParsed(String url) {
            GlobalConfigSettings.ResourceMeta resourceMeta;
            o.LJIIJ(url, "url");
            if (url.length() == 0) {
                return false;
            }
            Uri uri = UriProtector.parse(url);
            o.LJFF(uri, "uri");
            if (uri.getScheme() != null) {
                String scheme = uri.getScheme();
                o.LJFF(scheme, "uri.scheme");
                if (ujb.o.LJJJLIIL(scheme, "http", false)) {
                    C61532OCy c61532OCy = EBC.LIZ;
                    o.LJFF(c61532OCy, "GeckoGlobalManager.inst()");
                    GlobalConfigSettings LJFF = c61532OCy.LJFF();
                    String str = null;
                    if (LJFF != null) {
                        resourceMeta = LJFF.getResourceMeta();
                    } else {
                        resourceMeta = null;
                    }
                    if (resourceMeta == null) {
                        C39930Flm.LJ(null, "could not get any valid resource meta", 5);
                        return false;
                    }
                    String path = uri.getPath();
                    if (path == null) {
                        path = "";
                    }
                    String prefixAsGeckoCDN = getPrefixAsGeckoCDN(path);
                    if (prefixAsGeckoCDN.length() == 0) {
                        return false;
                    }
                    GlobalConfigSettings.CurrentLevelConfig config = resourceMeta.getConfig();
                    if (config == null) {
                        C39930Flm.LJ(null, "could not get any valid config", 5);
                        return false;
                    }
                    Map<String, String> prefix2AccessKey = config.getPrefix2AccessKey();
                    if (prefix2AccessKey != null) {
                        str = prefix2AccessKey.get(prefixAsGeckoCDN);
                    }
                    return C96Q.LIZ(str);
                }
            }
            return false;
        }

        public final String getGeckoBucketId(Long l) {
            String deviceId;
            String str;
            if (!o.LJ(GeckoXAdapter.geckoBucketId, "-1")) {
                return GeckoXAdapter.geckoBucketId;
            }
            if (l == null) {
                C61532OCy c61532OCy = EBC.LIZ;
                o.LJFF(c61532OCy, "GeckoGlobalManager.inst()");
                c61532OCy.LIZIZ();
                GeckoGlobalConfig geckoGlobalConfig = c61532OCy.LJ;
                if (geckoGlobalConfig == null || (deviceId = geckoGlobalConfig.getDeviceId()) == null || (l = C38350F3i.LJJIZ(deviceId)) == null) {
                    return "9";
                }
            }
            int longValue = (int) (l.longValue() % 100);
            if (longValue == 0) {
                str = "s01";
            } else {
                if (1 <= longValue) {
                    if (4 >= longValue) {
                        str = "s05";
                    } else if (9 >= longValue) {
                        str = CardStruct.IStatusCode.DEFAULT;
                    }
                }
                str = String.valueOf(longValue / 10);
            }
            GeckoXAdapter.geckoBucketId = str;
            return str;
        }

        public final String getPrefixAsGeckoCDN(String path) {
            o.LJIIJ(path, "path");
            List LJLJJL = s.LJLJJL(path, new String[]{"/"}, 0, 6);
            if (LJLJJL.isEmpty() || LJLJJL.size() < 6) {
                return "";
            }
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append('/');
            LIZ.append((String) ListProtector.get(LJLJJL, 1));
            LIZ.append('/');
            LIZ.append((String) ListProtector.get(LJLJJL, 2));
            LIZ.append('/');
            LIZ.append((String) ListProtector.get(LJLJJL, 3));
            LIZ.append('/');
            LIZ.append((String) ListProtector.get(LJLJJL, 4));
            LIZ.append('/');
            LIZ.append((String) ListProtector.get(LJLJJL, 5));
            return X1D.LIZIZ(LIZ);
        }

        public final boolean isCDNMultiVersionResource(String str) {
            List<String> list;
            GlobalConfigSettings.ResourceMeta resourceMeta;
            GlobalConfigSettings.CurrentLevelConfig config;
            GlobalConfigSettings.CDNMultiVersion cDNMultiVersion;
            if (str == null || ujb.o.LJJJJJL(str)) {
                return false;
            }
            C61532OCy c61532OCy = EBC.LIZ;
            o.LJFF(c61532OCy, "GeckoGlobalManager.inst()");
            GlobalConfigSettings LJFF = c61532OCy.LJFF();
            if (LJFF == null || (resourceMeta = LJFF.getResourceMeta()) == null || (config = resourceMeta.getConfig()) == null || (cDNMultiVersion = config.getCDNMultiVersion()) == null || (list = cDNMultiVersion.getDomains()) == null) {
                list = GeckoXAdapter.fallbackCDNMultiVersionDomains;
            }
            Iterator<String> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                String next = it.next();
                String it2 = next;
                o.LJFF(it2, "it");
                if (s.LJJJLZIJ(str, it2, false)) {
                    if (next != null) {
                        return true;
                    }
                }
            }
            return false;
        }

        public static /* synthetic */ String getGeckoBucketId$default(Companion companion, Long l, int i, Object obj) {
            if ((i & 1) != 0) {
                l = null;
            }
            return companion.getGeckoBucketId(l);
        }

        private final OptionCheckUpdateParams buildChannelOptionParams(GeckoXAdapter geckoXAdapter, Request request, boolean z, AbstractC61537ODd abstractC61537ODd, boolean z2, boolean z3) {
            OptionCheckUpdateParams result = new OptionCheckUpdateParams();
            result.setCustomParam(geckoXAdapter.getCustomParams$forest_release(request.getGeckoModel().LJLIL));
            result.setListener(abstractC61537ODd);
            result.setLazyUpdate(z);
            result.setLowStorageUpdate(z2);
            result.setIgnoreLowStorageLimit(z3);
            if (request.getUseInteraction()) {
                o.LJFF(result, "result");
                result.setChannelUpdatePriority(3);
            }
            o.LJFF(result, "result");
            return result;
        }

        public final void checkUpdate(Forest forest, boolean z, String str, Request request, InterfaceC39418FdW listener, boolean z2, boolean z3) {
            o.LJIIJ(forest, "forest");
            o.LJIIJ(request, "request");
            o.LJIIJ(listener, "listener");
            if (str == null || str.length() == 0) {
                listener.LIZ("", new Exception("update failed because channel is null"));
                return;
            }
            String str2 = request.getGeckoModel().LJLIL;
            C39417FdV c39417FdV = new C39417FdV(listener, str, str2);
            GeckoXAdapter geckoXAdapter = forest.getGeckoXAdapter();
            C61520OCm normalGeckoXClient$forest_release = geckoXAdapter.getNormalGeckoXClient$forest_release(request);
            if (normalGeckoXClient$forest_release != null) {
                HashMap hashMap = new HashMap();
                ArrayList arrayList = new ArrayList();
                arrayList.add(new CheckRequestBodyModel.TargetChannel(str));
                hashMap.put(str2, arrayList);
                normalGeckoXClient$forest_release.LIZ(null, hashMap, buildChannelOptionParams(geckoXAdapter, request, z, c39417FdV, z2, z3));
                return;
            }
            listener.LIZ(str, new Throwable("GeckoXClient is null"));
        }

        public static /* synthetic */ OptionCheckUpdateParams buildChannelOptionParams$default(Companion companion, GeckoXAdapter geckoXAdapter, Request request, boolean z, AbstractC61537ODd abstractC61537ODd, boolean z2, boolean z3, int i, Object obj) {
            if ((i & 16) != 0) {
                z2 = false;
            }
            if ((i & 32) != 0) {
                z3 = false;
            }
            return companion.buildChannelOptionParams(geckoXAdapter, request, z, abstractC61537ODd, z2, z3);
        }

        public static /* synthetic */ void checkUpdate$default(Companion companion, Forest forest, boolean z, String str, Request request, InterfaceC39418FdW interfaceC39418FdW, boolean z2, boolean z3, int i, Object obj) {
            if ((i & 2) != 0) {
                z = false;
            }
            if ((i & 32) != 0) {
                z2 = false;
            }
            if ((i & 64) != 0) {
                z3 = false;
            }
            companion.checkUpdate(forest, z, str, request, interfaceC39418FdW, z2, z3);
        }
    }

    public final Application getApp() {
        return this.app;
    }

    private final C61520OCm initGeckoXMultiClient(Request request) {
        String str = request.getGeckoModel().LJLIL;
        C61520OCm LIZ = O3E.LIZ(str);
        if (LIZ != null) {
            return LIZ;
        }
        C61157NzN LIZ2 = this.forestConfig.LIZ(str);
        C61520OCm c61520OCm = null;
        if (LIZ2 == null) {
            return null;
        }
        String str2 = LIZ2.LJ;
        File geckoXOfflineRootDirFileWithoutAccessKey = getGeckoXOfflineRootDirFileWithoutAccessKey(LIZ2.LIZIZ, LIZ2.LJI);
        try {
            O2T o2t = new O2T(this.app);
            o2t.LJIIIZ = this.forestConfig.LJ;
            o2t.LIZJ(LIZ2.LIZJ);
            o2t.LJII = LIZ2.LIZLLL;
            o2t.LIZ = null;
            o2t.LJFF = null;
            o2t.LJ = this.mStatisticMonitor;
            o2t.LJIIJJI = LIZ2.LJFF;
            o2t.LIZ(str);
            o2t.LIZIZ(str);
            o2t.LJIIIIZZ = str2;
            o2t.LJIIJ = geckoXOfflineRootDirFileWithoutAccessKey;
            c61520OCm = C61520OCm.LIZLLL(new C61276O3c(o2t));
            return c61520OCm;
        } catch (Exception e) {
            C39930Flm.LIZIZ("GeckoXAdapter", "GeckoClient.create error", e);
            return c61520OCm;
        }
    }

    public final Map<String, Map<String, String>> getCustomParams$forest_release(String str) {
        String str2;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (str != null) {
            str2 = str;
        } else {
            str2 = "";
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        C61157NzN LIZ = this.forestConfig.LIZ(str);
        if (LIZ != null) {
            linkedHashMap2.put("business_version", LIZ.LIZLLL);
        }
        linkedHashMap.put(str2, linkedHashMap2);
        return linkedHashMap;
    }

    public final C61520OCm getNormalGeckoXClient$forest_release(Request request) {
        o.LJIIJ(request, "request");
        String str = request.getGeckoModel().LJLIL;
        C61520OCm c61520OCm = this.geckoClients.get(str);
        if (c61520OCm == null) {
            C61520OCm initGeckoXMultiClient = initGeckoXMultiClient(request);
            this.geckoClients.put(str, initGeckoXMultiClient);
            return initGeckoXMultiClient;
        }
        return c61520OCm;
    }

    public GeckoXAdapter(Application app, Forest forest) {
        o.LJIIJ(app, "app");
        o.LJIIJ(forest, "forest");
        this.app = app;
        this.forest = forest;
        this.forestConfig = forest.getConfig();
        this.geckoClients = new HashMap<>();
        this.mStatisticMonitor = C39929Fll.LIZ;
    }

    private final File getGeckoXOfflineRootDirFileWithoutAccessKey(String str, boolean z) {
        if (!z) {
            return new File(str);
        }
        if (this.appFileDir == null) {
            this.appFileDir = this.app.getFilesDir();
        }
        try {
            File file = new File(this.appFileDir, str);
            if (!file.exists()) {
                file.mkdirs();
                return file;
            }
            return file;
        } catch (Exception unused) {
            return new File(str);
        }
    }

    public final boolean checkChannelExists(String accessKey, String channel) {
        C61157NzN LIZ;
        o.LJIIJ(accessKey, "accessKey");
        o.LJIIJ(channel, "channel");
        if (TextUtils.isEmpty(accessKey) || TextUtils.isEmpty(channel) || (LIZ = this.forestConfig.LIZ(accessKey)) == null) {
            return false;
        }
        getGeckoXOfflineRootDirFileWithoutAccessKey(LIZ.LIZIZ, LIZ.LJI);
        if (C70657RoD.LJIIL(accessKey, channel) == null) {
            return false;
        }
        return true;
    }

    public final long getChannelVersion(String accessKey, String channel) {
        C61157NzN LIZ;
        o.LJIIJ(accessKey, "accessKey");
        o.LJIIJ(channel, "channel");
        if (TextUtils.isEmpty(accessKey) || TextUtils.isEmpty(channel) || (LIZ = this.forestConfig.LIZ(accessKey)) == null) {
            return 0L;
        }
        getGeckoXOfflineRootDirFileWithoutAccessKey(LIZ.LIZIZ, LIZ.LJI);
        Long LJIIL = C70657RoD.LJIIL(accessKey, channel);
        if (LJIIL == null) {
            return 0L;
        }
        return LJIIL.longValue();
    }

    public final boolean checkIsExists(String rootDir, String accessKey, String channel) {
        C61157NzN LIZ;
        o.LJIIJ(rootDir, "rootDir");
        o.LJIIJ(accessKey, "accessKey");
        o.LJIIJ(channel, "channel");
        if (TextUtils.isEmpty(accessKey) || TextUtils.isEmpty(channel) || (LIZ = this.forestConfig.LIZ(accessKey)) == null) {
            return false;
        }
        getGeckoXOfflineRootDirFileWithoutAccessKey(rootDir, LIZ.LJI);
        if (C70657RoD.LJIIL(accessKey, channel) == null) {
            return false;
        }
        return true;
    }

    public final long getChannelVersion(String rootDir, String accessKey, String channel) {
        C61157NzN LIZ;
        o.LJIIJ(rootDir, "rootDir");
        o.LJIIJ(accessKey, "accessKey");
        o.LJIIJ(channel, "channel");
        if (TextUtils.isEmpty(accessKey) || TextUtils.isEmpty(channel) || (LIZ = this.forestConfig.LIZ(accessKey)) == null) {
            return 0L;
        }
        getGeckoXOfflineRootDirFileWithoutAccessKey(rootDir, LIZ.LJI);
        Long LJIIL = C70657RoD.LJIIL(accessKey, channel);
        if (LJIIL == null) {
            return 0L;
        }
        return LJIIL.longValue();
    }

    /* JADX WARN: Code restructure failed: missing block: B:101:0x01a0, code lost:
    
        if ((!r2.isEmpty()) == false) goto L138;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x01a2, code lost:
    
        r1 = r2.removeLast();
        kotlin.jvm.internal.o.LJFF(r1, "indices.removeLast()");
        com.bytedance.mt.protector.impl.collections.ListProtector.remove(r6, ((java.lang.Number) r1).intValue());
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x01b5, code lost:
    
        if (r12 == null) goto L114;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x01b7, code lost:
    
        r2 = r12.getCdnFallback();
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x01bb, code lost:
    
        if (r2 == null) goto L114;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x01c1, code lost:
    
        if (r2.getDomains() == null) goto L113;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x01c3, code lost:
    
        r1 = r2.getDomains();
        kotlin.jvm.internal.o.LJFF(r1, "fallbackConfig.domains");
        r18.setFallbackDomains(r1);
        r0 = r2.getMaxAttempts();
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x01d3, code lost:
    
        if (r0 >= 1) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x01d5, code lost:
    
        r0 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x01d6, code lost:
    
        r18.setLoadRetryTimes(r0 - 1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x01de, code lost:
    
        if (r2.getShuffle() != 1) goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x01e0, code lost:
    
        r4 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x01e1, code lost:
    
        r18.setSupportShuffle(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x01e4, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x01e5, code lost:
    
        if (r13 == null) goto L118;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x01e7, code lost:
    
        r2 = r13.getCdnFallback();
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x01eb, code lost:
    
        if (r2 == null) goto L118;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x01ee, code lost:
    
        r2 = r14.getCdnFallback();
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x01f2, code lost:
    
        if (r2 == null) goto L113;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x011c, code lost:
    
        if (r11 != null) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x0123, code lost:
    
        if (r11 != null) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00de, code lost:
    
        if (r11 != null) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00e6, code lost:
    
        if ((!r11.isEmpty()) == false) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00e8, code lost:
    
        r6 = r18.getFetcherSequence();
        r2 = new java.util.LinkedList();
        r9 = r6.iterator();
        r8 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00fa, code lost:
    
        if (r9.hasNext() == false) goto L122;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00fc, code lost:
    
        r7 = r9.next();
        r1 = r8 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0102, code lost:
    
        if (r8 < 0) goto L121;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x010a, code lost:
    
        if (X.C61022NxC.LJII.contains(r7) == false) goto L124;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x010c, code lost:
    
        r2.add(java.lang.Integer.valueOf(r8));
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0113, code lost:
    
        r8 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0129, code lost:
    
        X.C47261Igj.LJJJJJ();
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x012c, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x012d, code lost:
    
        r11 = r11.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0135, code lost:
    
        if (r11.hasNext() == false) goto L125;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0137, code lost:
    
        r10 = r11.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x013d, code lost:
    
        if (r10 != null) goto L126;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0145, code lost:
    
        if (r2.isEmpty() == false) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0147, code lost:
    
        r7 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x014b, code lost:
    
        r8 = r10.getType();
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0150, code lost:
    
        if (r8 == 1) goto L127;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0152, code lost:
    
        if (r8 == 2) goto L128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0155, code lost:
    
        if (r8 == 3) goto L129;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x015f, code lost:
    
        r1 = "builtin";
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x017f, code lost:
    
        if (r7 != null) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0192, code lost:
    
        if (r7.intValue() != (-1)) goto L131;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0194, code lost:
    
        r6.add(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0181, code lost:
    
        kotlin.jvm.internal.o.LJFF(r7, "index");
        com.bytedance.mt.protector.impl.collections.ListProtector.set(r6, r7.intValue(), r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0177, code lost:
    
        if (r10.getNoCache() == 1) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0179, code lost:
    
        r0 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x017a, code lost:
    
        r18.setEnableCDNCache(r0);
        r1 = "cdn";
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0198, code lost:
    
        r0 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0162, code lost:
    
        r0 = r10.getUpdate();
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0166, code lost:
    
        if (r0 == 1) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0168, code lost:
    
        if (r0 != 2) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x0171, code lost:
    
        r0 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x016b, code lost:
    
        r18.setWaitGeckoUpdate(r0);
        r1 = "gecko";
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x016a, code lost:
    
        r0 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0158, code lost:
    
        r7 = (java.lang.Integer) r2.pop();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean isGeckoCDNAndMergeConfig(android.net.Uri r16, java.lang.String r17, com.bytedance.forest.model.Request r18) {
        /*
            Method dump skipped, instructions count: 501
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.forest.chain.fetchers.GeckoXAdapter.isGeckoCDNAndMergeConfig(android.net.Uri, java.lang.String, com.bytedance.forest.model.Request):boolean");
    }

    private final OSZ<String, Long> getPathByLoader(String str, String str2, String str3, String str4) {
        try {
            O5M LIZ = this.forest.getSessionManager$forest_release().LIZ(str, str2);
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append(str3);
            LIZ2.append(File.separator);
            LIZ2.append(str4);
            return new OSZ<>(LIZ.LIZ(X1D.LIZIZ(LIZ2)), (Long) ((HashMap) LIZ.LIZ.LIZIZ()).get(str3));
        } catch (Exception e) {
            C39930Flm.LIZIZ("GeckoXAdapter", "getPathByLoader error", e);
            return null;
        }
    }

    public final String getGeckoResourcePath(C61295O3v response, String accessKey, String channel, String bundle) {
        boolean z;
        long j;
        o.LJIIJ(response, "response");
        o.LJIIJ(accessKey, "accessKey");
        o.LJIIJ(channel, "channel");
        o.LJIIJ(bundle, "bundle");
        if (accessKey.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        String str = null;
        if (!z && channel.length() != 0 && bundle.length() != 0) {
            String sessionId = response.LJZI.getSessionId();
            if (sessionId != null) {
                OSZ<String, Long> pathByLoader = getPathByLoader(sessionId, accessKey, channel, bundle);
                if (pathByLoader != null) {
                    str = pathByLoader.getFirst();
                    Long second = pathByLoader.getSecond();
                    if (second != null) {
                        j = second.longValue();
                        response.LLFFF = j;
                        return str;
                    }
                }
                j = 0;
                response.LLFFF = j;
                return str;
            }
            C61157NzN LIZ = this.forestConfig.LIZ(accessKey);
            if (LIZ != null) {
                StringBuilder LIZ2 = X1D.LIZ();
                getGeckoXOfflineRootDirFileWithoutAccessKey(LIZ.LIZIZ, LIZ.LJI);
                LIZ2.append(C70657RoD.LJIIIZ(accessKey, channel));
                LIZ2.append(File.separator);
                LIZ2.append(s.LJJLL("/", bundle));
                return X1D.LIZIZ(LIZ2);
            }
        }
        return null;
    }

    public final String getGeckoResourcePath(C61295O3v response, String offlineDir, String accessKey, String channel, String bundle) {
        boolean z;
        long j;
        o.LJIIJ(response, "response");
        o.LJIIJ(offlineDir, "offlineDir");
        o.LJIIJ(accessKey, "accessKey");
        o.LJIIJ(channel, "channel");
        o.LJIIJ(bundle, "bundle");
        if (accessKey.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        String str = null;
        if (!z && channel.length() != 0 && bundle.length() != 0) {
            String sessionId = response.LJZI.getSessionId();
            if (sessionId != null) {
                OSZ<String, Long> pathByLoader = getPathByLoader(sessionId, accessKey, channel, bundle);
                if (pathByLoader != null) {
                    str = pathByLoader.getFirst();
                    Long second = pathByLoader.getSecond();
                    if (second != null) {
                        j = second.longValue();
                        response.LLFFF = j;
                        return str;
                    }
                }
                j = 0;
                response.LLFFF = j;
                return str;
            }
            C61157NzN LIZ = this.forestConfig.LIZ(accessKey);
            if (LIZ != null) {
                StringBuilder LIZ2 = X1D.LIZ();
                getGeckoXOfflineRootDirFileWithoutAccessKey(offlineDir, LIZ.LJI);
                LIZ2.append(C70657RoD.LJIIIZ(accessKey, channel));
                LIZ2.append(File.separator);
                LIZ2.append(s.LJJLL("/", bundle));
                return X1D.LIZIZ(LIZ2);
            }
        }
        return null;
    }
}
