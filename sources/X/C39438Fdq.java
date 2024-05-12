package X;

import android.app.Activity;
import android.app.ActivityManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Rect;
import android.view.View;
import android.webkit.CookieManager;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.bytedance.apm.core.ActivityLifeObserver;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.lynx.hybrid.settings.HybridSettings;
import com.ss.android.ugc.aweme.hybridkit.task.HybridKitConfigTask;
import com.ss.android.ugc.aweme.hybridkit.task.SparkSettingInfo;
import com.ss.android.ugc.aweme.hybridkit.task.SparkXGetSettingsMethodParamModel;
import com.ss.android.ugc.aweme.setting.services.ISettingService;
import com.ss.android.ugc.aweme.setting.services.SettingServiceImpl;
import com.ss.android.ugc.aweme.settingsrequest.SettingsRequestServiceImpl;
import com.ss.android.ugc.effectmanager.common.utils.JsonExtKt;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.Fdq, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39438Fdq extends C39858Fkc {
    public final /* synthetic */ String LJLJJLL;
    public final /* synthetic */ String LJLJL;
    public final /* synthetic */ HybridKitConfigTask LJLJLJ;

    @Override // X.C39858Fkc
    public InterfaceC60703Ns3 getWebViewNavigationServiceProtocol() {
        return new C40139Fp9(this.LJLJLJ);
    }

    public static String LIZ(String str) {
        android.net.Uri LIZ = C35546DxG.LIZ(str);
        if (LIZ.isOpaque()) {
            return str;
        }
        if (o.LJ(C78926UyI.LJJJJI(LIZ, "__status_bar"), "true")) {
            C39836FkG.LJII.getClass();
            LIZ = LIZ.buildUpon().appendQueryParameter("status_bar_height", String.valueOf((int) (((C63081OpJ.LJJJJLI(C38262Ezy.LIZ().LIZIZ()) + 0.0f) / C38262Ezy.LIZ().LIZIZ().getResources().getDisplayMetrics().density) + 0.5f))).build();
            o.LJIIIIZZ(LIZ, "url.buildUpon().appendQu…                ).build()");
        }
        String uri = LIZ.toString();
        o.LJIIIIZZ(uri, "url.toString()");
        return uri;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0056, code lost:
    
        if (X.C19N.LJ("awewebview_append_common_params_enabled", true) != false) goto L7;
     */
    @Override // X.C39858Fkc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String applyAppendCommonParamsUrl(java.lang.String r6) {
        /*
            r5 = this;
            java.lang.String r0 = "url"
            kotlin.jvm.internal.o.LJIIIZ(r6, r0)
            android.net.Uri r1 = X.C35546DxG.LIZ(r6)
            boolean r0 = r1.isHierarchical()
            r4 = 0
            if (r0 == 0) goto L1b
            java.lang.String r0 = r1.getHost()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            r3 = 1
            if (r0 == 0) goto L30
        L1b:
            r3 = 0
        L1c:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r6)
            if (r3 == 0) goto L2f
            com.ss.android.common.applog.AppLog.appendCommonParams(r0, r4)
            java.lang.String r6 = r0.toString()
            java.lang.String r0 = "builder.toString()"
            kotlin.jvm.internal.o.LJIIIIZZ(r6, r0)
        L2f:
            return r6
        L30:
            java.util.List r0 = X.C35776E2i.LIZ()
            java.lang.String r2 = r1.getHost()
            java.util.Iterator r1 = r0.iterator()
        L3c:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L1b
            java.lang.Object r0 = r1.next()
            java.lang.String r0 = (java.lang.String) r0
            if (r2 == 0) goto L3c
            boolean r0 = ujb.o.LJJJJ(r2, r0, r4)
            if (r0 == 0) goto L3c
            java.lang.String r0 = "awewebview_append_common_params_enabled"
            boolean r0 = X.C19N.LJ(r0, r3)
            if (r0 == 0) goto L1b
            goto L1c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C39438Fdq.applyAppendCommonParamsUrl(java.lang.String):java.lang.String");
    }

    @Override // X.C39858Fkc
    public String applyGlobalLoadUrl(String url) {
        o.LJIIIZ(url, "url");
        return LIZ(url);
    }

    @Override // X.C38518F9u
    public Object getABParamsValue(String abKey) {
        java.util.Map<String, Object> map;
        o.LJIIIZ(abKey, "abKey");
        JSONObject LJFF = SettingsRequestServiceImpl.LJIILLIIL().LJFF(abKey);
        if (LJFF == null || (map = JsonExtKt.toMap(LJFF)) == null) {
            return abKey;
        }
        return map;
    }

    @Override // X.C38518F9u
    public HashMap<String, Object> getCommonVarParams(InterfaceC60761Nsz kitView) {
        boolean z;
        int i;
        int i2;
        boolean z2;
        int max;
        Resources resources;
        Configuration configuration;
        o.LJIIIZ(kitView, "kitView");
        HashMap<String, Object> hashMap = new HashMap<>();
        String str = this.LJLJJLL;
        String str2 = this.LJLJL;
        hashMap.put("region", str);
        hashMap.put("language", C39419FdX.LIZ().toString());
        hashMap.put("appLanguage", SettingServiceImpl.LIZ().getAppLanguage());
        hashMap.put("appLocale", C85999Xp5.LIZIZ());
        double LJJIJ = C45804HyK.LJJIJ(EF7.LIZIZ());
        int LJJIIJZLJL = O6R.LJJIIJZLJL(LJJIJ);
        JSONObject jSONObject = HybridSettings.INSTANCE.get("safe_area_height_double");
        int i3 = 0;
        if (jSONObject != null && !jSONObject.optBoolean("enable", true)) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            hashMap.put("statusBarHeight", Double.valueOf(LJJIJ));
            hashMap.put("topHeight", Double.valueOf(LJJIJ));
        } else {
            hashMap.put("statusBarHeight", Integer.valueOf(LJJIIJZLJL));
            hashMap.put("topHeight", Integer.valueOf(LJJIIJZLJL));
        }
        FCH.LIZIZ.getClass();
        Context LIZIZ = FCG.LIZIZ();
        SparkContext sparkContext = null;
        if (LIZIZ == null) {
            View LIZJ = kitView.LIZJ();
            if (LIZJ != null) {
                LIZIZ = LIZJ.getContext();
            } else {
                LIZIZ = null;
            }
        }
        if (LIZIZ != null) {
            i = C60605NqT.LJIIJ(C60605NqT.LJFF(LIZIZ), LIZIZ);
            i2 = C60605NqT.LJIIJ(C60605NqT.LIZJ(LIZIZ), LIZIZ);
        } else {
            i = 0;
            i2 = 0;
        }
        hashMap.put("screenWidth", Integer.valueOf(i));
        hashMap.put("screenHeight", Integer.valueOf(i2));
        if (LIZIZ != null && (resources = LIZIZ.getResources()) != null && (configuration = resources.getConfiguration()) != null && configuration.orientation == 2) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            max = Math.min(i, i2);
        } else {
            max = Math.max(i, i2);
        }
        while (LIZIZ instanceof ContextWrapper) {
            if (LIZIZ instanceof Activity) {
                try {
                    ((Activity) LIZIZ).getWindow().getDecorView().getWindowVisibleDisplayFrame(new Rect());
                } catch (Throwable unused) {
                }
                int LJJJJI = max - C17N.LJJJJI(r1.bottom);
                int max2 = Math.max(LJJJJI - LJJIIJZLJL, 0);
                int max3 = Math.max(LJJJJI, 0);
                hashMap.put("contentHeight", Integer.valueOf(Math.max((max - max2) - LJJIIJZLJL, 0)));
                hashMap.put("bottomHeight", Integer.valueOf(max2));
                hashMap.put("navigationBarHeight", Integer.valueOf(max3));
                try {
                    Object LLILLIZIL = C16880lQ.LLILLIZIL((ContextWrapper) LIZIZ);
                    o.LJII(LLILLIZIL, "null cannot be cast to non-null type android.app.ActivityManager");
                    hashMap.put("glesVer", Integer.valueOf(((ActivityManager) LLILLIZIL).getDeviceConfigurationInfo().reqGlEsVersion));
                } catch (Throwable unused2) {
                }
            }
            hashMap.put("homeTabHeight", Integer.valueOf(HybridKitConfigTask.LJLJI));
            LIZIZ = ((ContextWrapper) LIZIZ).getBaseContext();
        }
        hashMap.put("deviceId", str2);
        hashMap.put("isAppBackground", Integer.valueOf(!ActivityLifeObserver.getInstance().isForeground() ? 1 : 0));
        if (!C60806Nti.LIZ) {
            ISettingService LIZ = SettingServiceImpl.LIZ();
            if (LIZIZ != null) {
                i3 = LIZIZ.hashCode();
            }
            hashMap.put("theme", LIZ.getTheme(i3));
        } else {
            C60737Nsb hybridContext = kitView.getHybridContext();
            if (hybridContext instanceof SparkContext) {
                sparkContext = (SparkContext) hybridContext;
            }
            if (sparkContext != null) {
                String LJIJ = sparkContext.LJIJ();
                hashMap.put("appTheme", LJIJ);
                hashMap.put("theme", LJIJ);
            } else {
                ISettingService LIZ2 = SettingServiceImpl.LIZ();
                if (LIZIZ != null) {
                    i3 = LIZIZ.hashCode();
                }
                hashMap.put("theme", LIZ2.getTheme(i3));
            }
        }
        String str3 = C64707PaR.LIZJ;
        if (str3 == null) {
            str3 = "";
        }
        hashMap.put("store_region", str3);
        hashMap.put("isPad", Integer.valueOf(LFH.LIZIZ.LIZLLL().LJIJ().LIZLLL()));
        return hashMap;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x008d  */
    @Override // X.C39858Fkc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean applyCommonShouldOverrideUrl(android.webkit.WebView r9, java.lang.String r10) {
        /*
            r8 = this;
            r7 = 0
            if (r10 == 0) goto L97
            java.lang.String r4 = LIZ(r10)
            if (r4 == 0) goto L98
            com.ss.android.ugc.aweme.hybridkit.task.HybridKitConfigTask r6 = r8.LJLJLJ
            if (r9 == 0) goto L49
            android.content.Context r3 = r9.getContext()
        L11:
            java.lang.String r0 = "http"
            r2 = 0
            boolean r0 = ujb.o.LJJJLIIL(r4, r0, r2)
            if (r0 != 0) goto L98
            android.net.Uri r0 = X.C35546DxG.LIZ(r4)
            java.lang.String r5 = r0.getScheme()
            if (r5 == 0) goto L47
            java.lang.String r1 = "getDefault()"
            java.lang.String r0 = "this as java.lang.String).toLowerCase(locale)"
            java.lang.String r1 = X.AnonymousClass028.LIZJ(r1, r5, r0)
        L2c:
            java.lang.String r0 = "sslocal"
            boolean r0 = kotlin.jvm.internal.o.LJ(r0, r1)
            if (r0 != 0) goto L3c
            java.lang.String r0 = "localsdk"
            boolean r0 = kotlin.jvm.internal.o.LJ(r0, r1)
            if (r0 == 0) goto L45
        L3c:
            java.lang.String r4 = X.FX2.LIZLLL(r4)
            java.lang.String r0 = "tryConvertScheme(rawUrl)"
            kotlin.jvm.internal.o.LJIIIIZZ(r4, r0)
        L45:
            r5 = 1
            goto L4b
        L47:
            r1 = r7
            goto L2c
        L49:
            r3 = r7
            goto L11
        L4b:
            boolean r0 = X.FX2.LIZIZ(r3, r4, r7)     // Catch: java.lang.Exception -> L6b
            if (r0 != 0) goto L6a
            r6.getClass()     // Catch: java.lang.Exception -> L6b
            boolean r0 = com.ss.android.ugc.aweme.hybridkit.task.HybridKitConfigTask.LJII(r3, r4)     // Catch: java.lang.Exception -> L6b
            if (r0 == 0) goto L5b
            goto L6a
        L5b:
            java.lang.String r0 = "intent"
            boolean r0 = kotlin.jvm.internal.o.LJ(r0, r1)     // Catch: java.lang.Exception -> L6b
            if (r0 == 0) goto L6b
            boolean r0 = X.FX2.LIZJ(r3, r4)     // Catch: java.lang.Exception -> L6b
            if (r0 == 0) goto L6b
            return r5
        L6a:
            r2 = 1
        L6b:
            boolean r0 = X.C35546DxG.LIZLLL(r4)
            if (r0 == 0) goto L77
            java.lang.String r0 = "&use_spark=1"
            java.lang.String r4 = r4.concat(r0)
        L77:
            X.Ol8 r0 = com.ss.android.ugc.aweme.hybridkit.task.HybridKitConfigTask.LJLJJLL
            java.lang.Object r1 = r0.getValue()
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            boolean r0 = kotlin.jvm.internal.o.LJ(r1, r0)
            if (r0 == 0) goto L8d
            com.bytedance.router.SmartRoute r0 = com.bytedance.router.SmartRouter.buildRoute(r3, r4)
            r0.open()
        L8c:
            return r5
        L8d:
            if (r2 != 0) goto L8c
            com.bytedance.router.SmartRoute r0 = com.bytedance.router.SmartRouter.buildRoute(r3, r4)
            r0.open()
            goto L8c
        L97:
            r4 = r7
        L98:
            boolean r0 = super.applyCommonShouldOverrideUrl(r9, r4)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C39438Fdq.applyCommonShouldOverrideUrl(android.webkit.WebView, java.lang.String):boolean");
    }

    @Override // X.C39858Fkc
    public void applyGlobalSettings(WebSettings settings, WebView webView) {
        o.LJIIIZ(settings, "settings");
        o.LJIIIZ(webView, "webView");
        C60407NnH c60407NnH = new C60407NnH(webView.getContext());
        c60407NnH.LIZIZ = true;
        c60407NnH.LIZ(webView);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(settings.getUserAgentString());
        LIZ.append(" AppVersion/");
        LIZ.append(EF7.LIZLLL());
        C16880lQ.LLZL(settings, X1D.LIZIZ(LIZ));
        webView.setFocusableInTouchMode(true);
        webView.setScrollBarStyle(0);
        CookieManager.getInstance().setAcceptCookie(true);
    }

    @Override // X.C38518F9u
    public HashMap<String, Object> getPreloadSettingKeys(InterfaceC60761Nsz kitView, String preloadSettingsKeys) {
        boolean z;
        o.LJIIIZ(kitView, "kitView");
        o.LJIIIZ(preloadSettingsKeys, "preloadSettingsKeys");
        try {
            List<SparkSettingInfo> list = ((SparkXGetSettingsMethodParamModel) C75792yF.LIZIZ().LJI(preloadSettingsKeys, SparkXGetSettingsMethodParamModel.class)).keys;
            ArrayList arrayList = new ArrayList();
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            for (SparkSettingInfo sparkSettingInfo : list) {
                String str = sparkSettingInfo.key;
                String str2 = sparkSettingInfo.biz;
                if (str2 == null) {
                    str2 = "";
                }
                FJ7 fj7 = FJ6.Companion;
                String str3 = sparkSettingInfo.type;
                fj7.getClass();
                FJ6 LIZ = FJ7.LIZ(str3);
                if (str.length() > 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (z && LIZ != FJ6.UNSUPPORTED) {
                    FCU fcu = new FCU(str, LIZ);
                    fcu.LIZ = str2;
                    arrayList.add(fcu);
                    linkedHashSet.add(str);
                }
            }
            if (arrayList.isEmpty()) {
                return null;
            }
            List<FCV> LIZ2 = FCS.LIZ(arrayList);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Iterator it = ((ArrayList) LIZ2).iterator();
            while (it.hasNext()) {
                FCV fcv = (FCV) it.next();
                linkedHashMap.put(fcv.LIZ, fcv.LIZIZ);
            }
            HashMap<String, Object> hashMap = new HashMap<>();
            hashMap.put("preload_setting_values", linkedHashMap);
            return hashMap;
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C39438Fdq(String str, String str2, String str3, String str4, HybridKitConfigTask hybridKitConfigTask, String str5) {
        super(str, str2, str3, str5, false);
        this.LJLJJLL = str;
        this.LJLJL = str4;
        this.LJLJLJ = hybridKitConfigTask;
    }
}
