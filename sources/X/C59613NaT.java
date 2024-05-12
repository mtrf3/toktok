package X;

import Y.ACallableS113S0100000_10;
import Y.ARunnableS46S0100000_10;
import Y.IDCListenerS244S0100000_6;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.graphics.Paint;
import android.os.Build;
import android.os.Handler;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.CookieManager;
import android.webkit.DownloadListener;
import android.webkit.ValueCallback;
import android.webkit.WebBackForwardList;
import android.webkit.WebChromeClient;
import android.webkit.WebHistoryItem;
import android.webkit.WebSettings;
import android.webkit.WebView;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.UriProtector;
import com.google.gson.Gson;
import com.google.gson.j;
import com.google.gson.m;
import com.ss.android.ugc.aweme.CrossPlatformLegacyServiceImpl;
import com.ss.android.ugc.aweme.awemeservice.AwemeService;
import com.ss.android.ugc.aweme.awemeservice.api.IAwemeService;
import com.ss.android.ugc.aweme.commercialize.LegacyCommercializeServiceImpl;
import com.ss.android.ugc.aweme.crossplatform.activity.AbsActivityContainer;
import com.ss.android.ugc.aweme.crossplatform.business.AdWebStatBusiness;
import com.ss.android.ugc.aweme.crossplatform.business.PassBackWebInfoBusiness;
import com.ss.android.ugc.aweme.crossplatform.platform.webview.SingleWebChromeClient;
import com.ss.android.ugc.aweme.crossplatform.platform.webview.SingleWebView$DisableInterceptRegion;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.global.config.settings.pojo.HybridMonitorConfig;
import com.ss.android.ugc.aweme.settings.FetchBridgeSettings;
import defpackage.i0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.AqS157S0200000_10;
import kotlin.jvm.internal.AqS160S0100000_10;
import kotlin.jvm.internal.AqS176S0100000_10;
import kotlin.jvm.internal.AqS192S0100000_10;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.IDqS435S0100000_10;
import kotlin.jvm.internal.o;
import org.greenrobot.eventbus.EventBus;
import org.json.JSONObject;
import ujb.s;

/* renamed from: X.NaT, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C59613NaT extends C59615NaV implements GenericLifecycleObserver, InterfaceC38148Ey8, NZR {
    public java.util.Map<Integer, View> _$_findViewCache;
    public java.util.Map<String, String> additionReportParams;
    public AbstractC38279F0p baseJsMessageHandler;
    public boolean canScrollVertically;
    public Boolean canTouch;
    public final C5H3 chromeVersion$delegate;
    public F0E contextProviderFactory;
    public String curUrl;
    public boolean disableIntercept;
    public SingleWebView$DisableInterceptRegion[] disableInterceptRegionList;
    public DownloadListener downloadListener;
    public boolean enableScrollControl;
    public final C5H3 gson$delegate;
    public InterfaceC59561NZd iCrossPlatformActivityContainer;
    public InterfaceC59561NZd iCrossPlatformActivityContainerInChrome;
    public InterfaceC59568NZk iWebViewChangeListener;
    public C38150EyA iesJsBridge;
    public boolean isVastAd;
    public String jsName;
    public Object jsObject;
    public final C5H3 lastClickDetector$delegate;
    public long lastClickTime;
    public C40705FyH mTTNetInterceptorWrapper;
    public C59866NeY monitorSession;
    public boolean monitorSessionCreatedBySelf;
    public SingleWebChromeClient newWebChromeClient;
    public InterfaceC59820Ndo onWebChromeStatus;
    public String pageCommitVisibleUrl;
    public String pageStartUrl;
    public List<String> pauseList;
    public ArrayList<InterfaceC59637Nar> scrollListeners;
    public Boolean shouldAdditionalReportParams;
    public SingleWebChromeClient singleWebChromeClient;
    public C59581NZx singleWebViewClient;
    public InterfaceC88472Yns<? super String, C76800UCe> titleCallback;
    public boolean useSandbox;
    public java.util.Set<String> visitedUrls;
    public View.OnTouchListener webviewTouchListener;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C59613NaT(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        o.LJIIIZ(context, "context");
    }

    private final boolean isAllowJsbMonitor() {
        android.net.Uri parse;
        String host;
        try {
            String str = this.curUrl;
            if (str != null && (parse = UriProtector.parse(str)) != null && (host = parse.getHost()) != null) {
                F0L.LIZ().getClass();
                HybridMonitorConfig LIZLLL = C59639Nat.LIZLLL();
                if (LIZLLL != null) {
                    if (LIZLLL.getJsbHostAllowList().isEmpty()) {
                        return true;
                    }
                    for (String hostInList : LIZLLL.getJsbHostAllowList()) {
                        o.LJIIIIZZ(hostInList, "hostInList");
                        if (s.LJJJLZIJ(host, hostInList, false)) {
                            return true;
                        }
                    }
                }
            }
        } catch (Exception unused) {
        }
        return false;
    }

    public void _$_clearFindViewByIdCache() {
        this._$_findViewCache.clear();
    }

    public View _$_findCachedViewById(int i) {
        java.util.Map<Integer, View> map = this._$_findViewCache;
        View view = map.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        if (findViewById == null) {
            return null;
        }
        map.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // X.C59616NaW, android.webkit.WebView, X.NZR
    public boolean canGoBack() {
        return com_ss_android_ugc_aweme_crossplatform_platform_webview_SingleWebView_com_ss_android_ugc_tiktok_security_lancet_web_SecLinkLancet_canGoBack(this);
    }

    @Override // X.NZR
    public InterfaceC59575NZr getShouldOverrideUrlLoadingListener() {
        return null;
    }

    @Override // X.NZR
    public View getView() {
        return this;
    }

    @Override // X.C59616NaW, android.webkit.WebView, X.NZR
    public void goBack() {
        com_ss_android_ugc_aweme_crossplatform_platform_webview_SingleWebView_com_ss_android_ugc_tiktok_security_lancet_web_SecLinkLancet_goBack(this);
    }

    @Override // X.C59616NaW, android.webkit.WebView, X.NZR
    public void loadUrl(String str) {
        com_ss_android_ugc_aweme_crossplatform_platform_webview_SingleWebView_com_ss_android_ugc_tiktok_security_lancet_web_SecLinkLancet_loadUrl(this, str);
    }

    @Override // X.C59616NaW, android.webkit.WebView, X.NZR
    public void loadUrl(String str, java.util.Map map) {
        com_ss_android_ugc_aweme_crossplatform_platform_webview_SingleWebView_com_ss_android_ugc_tiktok_security_lancet_web_SecLinkLancet_loadUrl(this, str, map);
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
    }

    public void setShouldOverrideUrlLoadingListener(InterfaceC59575NZr listener) {
        o.LJIIIZ(listener, "listener");
    }

    @Override // X.NZR
    public void transparentBackground() {
        setBackgroundColor(0);
    }

    private final void addPageStartListener() {
        addOnSingleWebViewStatus(new C59751Nch(this));
    }

    private final Gson getGson() {
        return (Gson) this.gson$delegate.getValue();
    }

    private final boolean getInPauseList() {
        List<String> list = this.pauseList;
        if (list == null) {
            return false;
        }
        C115524g8 c115524g8 = new C115524g8(OJ4.LJJJJIZL(ORZ.LJLIIIL(list)));
        while (c115524g8.hasNext()) {
            String str = (String) c115524g8.next();
            String url = getUrl();
            if (url != null && ujb.o.LJJJLIIL(url, str, false)) {
                return true;
            }
        }
        return false;
    }

    private final GestureDetector getLastClickDetector() {
        return (GestureDetector) this.lastClickDetector$delegate.getValue();
    }

    @Override // X.NZR
    public void contextDestroy() {
        this.baseJsMessageHandler.onDestroy();
        C59832Ne0.LIZ(this);
        C59581NZx c59581NZx = this.singleWebViewClient;
        if (c59581NZx != null) {
            NJD njd = c59581NZx.LJLJJLL;
            if (njd != null) {
                C38995FSd.LIZIZ().execute(new ARunnableS46S0100000_10(njd, 198));
            } else {
                o.LJIJI("webviewInterceptor");
                throw null;
            }
        }
    }

    @Override // X.NZR
    public void contextPause() {
        this.baseJsMessageHandler.onPause();
        onPause();
        C59832Ne0.LIZIZ(getContext(), this);
        if (getInPauseList() || this.isVastAd) {
            pauseTimers();
        }
    }

    @Override // X.NZR
    public void contextResume() {
        this.baseJsMessageHandler.onResume();
        onResume();
        resumeTimers();
    }

    @Override // X.NZR
    public void destroyPassBackWebInfoBusiness() {
        NTL crossPlatformBusiness;
        PassBackWebInfoBusiness passBackWebInfoBusiness;
        InterfaceC59561NZd interfaceC59561NZd = this.iCrossPlatformActivityContainer;
        if (interfaceC59561NZd != null && (crossPlatformBusiness = interfaceC59561NZd.getCrossPlatformBusiness()) != null && (passBackWebInfoBusiness = (PassBackWebInfoBusiness) ((C59484NWe) crossPlatformBusiness).LIZ(PassBackWebInfoBusiness.class)) != null) {
            if (passBackWebInfoBusiness.LIZ()) {
                passBackWebInfoBusiness.LJIILJJIL = null;
                C10K.LIZJ(new ACallableS113S0100000_10(passBackWebInfoBusiness, 26));
            }
            ((Handler) passBackWebInfoBusiness.LIZLLL.getValue()).removeCallbacksAndMessages(null);
        }
    }

    @Override // X.NZR
    public Boolean getBusinessEnablePopup() {
        SingleWebChromeClient singleWebChromeClient = this.singleWebChromeClient;
        if (singleWebChromeClient != null) {
            return Boolean.valueOf(singleWebChromeClient.LIZ);
        }
        return null;
    }

    public final String getChromeVersion() {
        return (String) this.chromeVersion$delegate.getValue();
    }

    @Override // X.NZR
    public boolean getControlGeolocationPermissions() {
        Boolean allowGeolocationPermissions = this.baseJsMessageHandler.getAllowGeolocationPermissions();
        o.LJIIIIZZ(allowGeolocationPermissions, "baseJsMessageHandler.allowGeolocationPermissions");
        return allowGeolocationPermissions.booleanValue();
    }

    public final C38113ExZ getJsBridge2$crossplatform_release() {
        C38150EyA c38150EyA = this.iesJsBridge;
        if (c38150EyA != null) {
            return c38150EyA.LJII;
        }
        return null;
    }

    @Override // X.NZR
    public InterfaceC88471Ynr<WebView, String, Boolean> getShouldOverrideInterceptor() {
        C59581NZx c59581NZx = this.singleWebViewClient;
        if (c59581NZx != null) {
            return c59581NZx.LJLJI;
        }
        return null;
    }

    @Override // X.NZR
    public List<NZX> getSingleWebViewStatusListeners() {
        C59581NZx c59581NZx = this.singleWebViewClient;
        if (c59581NZx != null) {
            return c59581NZx.LJLILLLLZI;
        }
        return null;
    }

    private final Activity getActivity() {
        for (Context context = getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof Activity) {
                return (Activity) context;
            }
        }
        return null;
    }

    private final int getCacheMode() {
        android.net.Uri uri;
        Intent intent;
        Activity activity = getActivity();
        List<String> list = null;
        if (activity != null && (intent = activity.getIntent()) != null) {
            uri = intent.getData();
        } else {
            uri = null;
        }
        String decode = android.net.Uri.decode(String.valueOf(uri));
        try {
            list = C2YJ.LIZIZ.LIZ.getWebviewCacheUrls();
        } catch (Throwable unused) {
        }
        if (list != null && decode != null) {
            Iterator<String> it = list.iterator();
            while (it.hasNext()) {
                if (s.LJJJLZIJ(decode, it.next(), false)) {
                    return 2;
                }
            }
            return -1;
        }
        return -1;
    }

    private final void initConfig() {
        C60407NnH c60407NnH = new C60407NnH(getContext());
        c60407NnH.LIZIZ = true;
        c60407NnH.LIZ(this);
        setFocusableInTouchMode(true);
        setScrollBarStyle(0);
        CookieManager.getInstance().setAcceptCookie(true);
        getSettings().setCacheMode(getCacheMode());
        C59445NUr.LIZIZ(new AqS176S0100000_10(this, 40));
    }

    @Override // X.C59616NaW, android.webkit.WebView, X.NZR
    public boolean canGoForward() {
        return super.canGoForward();
    }

    public boolean com_ss_android_ugc_aweme_crossplatform_platform_webview_SingleWebView__canGoBack$___twin___() {
        return super.canGoBack();
    }

    public void com_ss_android_ugc_aweme_crossplatform_platform_webview_SingleWebView__goBack$___twin___() {
        C59591Na7.LIZ().LJ(this);
        super.goBack();
    }

    @Override // android.webkit.WebView, X.NZR
    public WebBackForwardList copyBackForwardList() {
        WebBackForwardList copyBackForwardList = super.copyBackForwardList();
        o.LJIIIIZZ(copyBackForwardList, "super.copyBackForwardList()");
        return copyBackForwardList;
    }

    @Override // android.webkit.WebView, X.NZR
    public void destroy() {
        C59591Na7.LIZ().LJIIL(this);
        super.destroy();
    }

    @Override // X.NZR
    public String getBackUrl() {
        WebHistoryItem itemAtIndex;
        WebBackForwardList copyBackForwardList = copyBackForwardList();
        int currentIndex = copyBackForwardList.getCurrentIndex();
        if (currentIndex <= 0 || (itemAtIndex = copyBackForwardList.getItemAtIndex(currentIndex - 1)) == null) {
            return null;
        }
        return itemAtIndex.getUrl();
    }

    @Override // X.NZR
    public String getForwardUrl() {
        WebHistoryItem itemAtIndex;
        WebBackForwardList copyBackForwardList = copyBackForwardList();
        int currentIndex = copyBackForwardList.getCurrentIndex();
        if (currentIndex == copyBackForwardList.getSize() - 1 || (itemAtIndex = copyBackForwardList.getItemAtIndex(currentIndex + 1)) == null) {
            return null;
        }
        return itemAtIndex.getUrl();
    }

    @Override // X.NZR
    public boolean getJavaScriptEnabled() {
        return getSettings().getJavaScriptEnabled();
    }

    @Override // X.NZR
    public int getLoadingProgress() {
        return getProgress();
    }

    @Override // X.NZR
    public boolean getMediaPlaybackRequiresUserGesture() {
        return getSettings().getMediaPlaybackRequiresUserGesture();
    }

    @Override // X.NZR
    public int getSettingsTextZoom() {
        return getSettings().getTextZoom();
    }

    @Override // android.webkit.WebView, X.NZR
    public String getTitle() {
        return super.getTitle();
    }

    @Override // X.C59616NaW, android.webkit.WebView, X.NZR
    public String getUrl() {
        return super.getUrl();
    }

    @Override // X.NZR
    public String getUserAgentString() {
        String userAgentString = getSettings().getUserAgentString();
        o.LJIIIIZZ(userAgentString, "this.settings.userAgentString");
        return userAgentString;
    }

    @Override // X.C59616NaW
    public boolean hasClickInTimeInterval() {
        if (System.currentTimeMillis() - this.lastClickTime < getTimeInterval()) {
            return true;
        }
        return false;
    }

    @Override // android.webkit.WebView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        C59591Na7.LIZ().LJI(this);
        super.onAttachedToWindow();
        EventBus.LIZJ().LJIILJJIL(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        C59866NeY c59866NeY;
        super.onDetachedFromWindow();
        EventBus.LIZJ().LJIJ(this);
        if (this.monitorSessionCreatedBySelf && (c59866NeY = this.monitorSession) != null && c59866NeY.LIZJ) {
            F0L.LIZ().LIZIZ(c59866NeY.LJJIJ());
        }
    }

    @Override // X.C59616NaW, android.webkit.WebView, X.NZR
    public void reload() {
        C59591Na7.LIZ().LJIILIIL(this);
        super.reload();
    }

    @Override // X.NZR
    public void setLoadNoCache() {
        getSettings().setCacheMode(2);
    }

    @Override // X.C59616NaW, android.webkit.WebView, X.NZR
    public void clearHistory() {
        super.clearHistory();
    }

    @Override // X.NZR
    public Boolean getAdditionalReportParams() {
        return this.shouldAdditionalReportParams;
    }

    public final AbstractC38279F0p getBaseJsMessageHandler() {
        return this.baseJsMessageHandler;
    }

    @Override // X.NZR
    public boolean getCanScrollVertically() {
        return this.canScrollVertically;
    }

    @Override // X.NZR
    public Boolean getCanTouch() {
        return this.canTouch;
    }

    @Override // X.NZR
    public InterfaceC59561NZd getCrossPlatformActivityContainer() {
        return this.iCrossPlatformActivityContainer;
    }

    @Override // X.NZR
    public InterfaceC59561NZd getCrossPlatformActivityContainerInChrome() {
        return this.iCrossPlatformActivityContainerInChrome;
    }

    public final String getCurUrl() {
        return this.curUrl;
    }

    @Override // X.NZR
    public DownloadListener getDownloadListener() {
        return this.downloadListener;
    }

    @Override // X.NZR
    public boolean getEnableScrollControl() {
        return this.enableScrollControl;
    }

    public final InterfaceC59561NZd getICrossPlatformActivityContainer() {
        return this.iCrossPlatformActivityContainer;
    }

    public final InterfaceC59561NZd getICrossPlatformActivityContainerInChrome() {
        return this.iCrossPlatformActivityContainerInChrome;
    }

    @Override // X.NZR
    public String getJavascriptInterfaceName() {
        return this.jsName;
    }

    @Override // X.NZR
    public Object getJavascriptInterfaceObject() {
        return this.jsObject;
    }

    public final long getLastClickTime() {
        return this.lastClickTime;
    }

    @Override // X.NZR
    public C59866NeY getMonitorSession() {
        return this.monitorSession;
    }

    public final SingleWebChromeClient getNewWebChromeClient() {
        return this.newWebChromeClient;
    }

    @Override // X.InterfaceC38148Ey8
    public String getSafeUrl() {
        return this.pageStartUrl;
    }

    public final InterfaceC88472Yns<String, C76800UCe> getTitleCallback() {
        return this.titleCallback;
    }

    @Override // X.NZR
    public InterfaceC88472Yns<String, C76800UCe> getTitleCallbck() {
        return this.titleCallback;
    }

    @Override // X.NZR
    public View.OnTouchListener getTouchListener() {
        return this.webviewTouchListener;
    }

    public final boolean getUseSandbox() {
        return this.useSandbox;
    }

    @Override // X.NZR
    public InterfaceC59820Ndo getWebChromeStatus() {
        return this.onWebChromeStatus;
    }

    @Override // X.NZR
    public ArrayList<InterfaceC59637Nar> getWebScrollListener() {
        return this.scrollListeners;
    }

    @Override // X.C59616NaW, android.webkit.WebView, X.NZR
    public void goForward() {
        super.goForward();
    }

    @Override // X.C59615NaV, android.webkit.WebView, X.NZR
    public void onPause() {
        super.onPause();
    }

    @Override // X.C59615NaV, android.webkit.WebView, X.NZR
    public void onResume() {
        super.onResume();
    }

    @Override // X.C59616NaW, android.webkit.WebView, X.NZR
    public void stopLoading() {
        super.stopLoading();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C59613NaT(Context context) {
        this(context, null, 0, 6, 0 == true ? 1 : 0);
        o.LJIIIZ(context, "context");
        if (C52300Kfo.LIZ()) {
            WebSettings settings = getSettings();
            String userAgentString = settings.getUserAgentString();
            if (!userAgentString.contains(" BytedanceWebview/d8a21c6")) {
                C16880lQ.LLZL(settings, userAgentString.concat(" BytedanceWebview/d8a21c6"));
            }
        }
    }

    private final String appendStatusBarHeightIfNeeded(String str) {
        try {
            android.net.Uri parse = UriProtector.parse(str);
            String queryParameter = UriProtector.getQueryParameter(parse, "__status_bar");
            if (queryParameter != null && o.LJ(queryParameter, "true")) {
                Context context = getContext();
                o.LJIIIIZZ(context, "context");
                String builder = parse.buildUpon().appendQueryParameter("status_bar_height", String.valueOf(KL2.LJIILL(EF7.LIZIZ(), C63081OpJ.LJJJJLI(context) + 0.0f))).toString();
                o.LJIIIIZZ(builder, "uri.buildUpon()\n        …              .toString()");
                return builder;
            }
        } catch (Exception unused) {
        }
        return str;
    }

    private final String beforeLoadUrl(String str) {
        C59273NOb c59273NOb;
        C59314NPq c59314NPq;
        String str2;
        C59314NPq c59314NPq2;
        String str3;
        C59314NPq c59314NPq3;
        String str4;
        InterfaceC59561NZd interfaceC59561NZd;
        C59314NPq crossPlatformParams;
        C59273NOb c59273NOb2;
        C59273NOb c59273NOb3;
        C59273NOb c59273NOb4;
        C59273NOb c59273NOb5;
        C59314NPq crossPlatformParams2;
        InterfaceC59585Na1 interfaceC59585Na1;
        boolean z;
        this.curUrl = str;
        C59866NeY c59866NeY = this.monitorSession;
        boolean z2 = false;
        if (c59866NeY == null || !c59866NeY.LIZJ) {
            C59639Nat LIZ = F0L.LIZ();
            this.monitorSession = LIZ.LIZ(LIZ.LJI(str));
            this.monitorSessionCreatedBySelf = true;
        } else {
            this.monitorSessionCreatedBySelf = false;
        }
        C59866NeY c59866NeY2 = this.monitorSession;
        if (c59866NeY2 != null && (interfaceC59585Na1 = (InterfaceC59585Na1) c59866NeY2.LJJIJIIJI(InterfaceC59585Na1.class)) != null) {
            F0L.LIZ().getClass();
            HybridMonitorConfig LIZLLL = C59639Nat.LIZLLL();
            if (LIZLLL != null) {
                try {
                    Boolean h5StaticResourceReportEnabled = LIZLLL.getH5StaticResourceReportEnabled();
                    o.LJIIIIZZ(h5StaticResourceReportEnabled, "{\n                    it…Enabled\n                }");
                    z = h5StaticResourceReportEnabled.booleanValue();
                } catch (C158056If unused) {
                    z = false;
                }
                interfaceC59585Na1.LJJIII(z);
                List<String> h5StaticResourceReportAllowList = LIZLLL.getH5StaticResourceReportAllowList();
                if (h5StaticResourceReportAllowList == null) {
                    h5StaticResourceReportAllowList = Collections.emptyList();
                    o.LJIIIIZZ(h5StaticResourceReportAllowList, "emptyList()");
                }
                interfaceC59585Na1.LJJIIZ(h5StaticResourceReportAllowList);
            }
        }
        C59866NeY c59866NeY3 = this.monitorSession;
        if (c59866NeY3 != null) {
            C59273NOb c59273NOb6 = null;
            if (!c59866NeY3.LIZJ) {
                c59866NeY3 = null;
            }
            if (c59866NeY3 != null) {
                C59639Nat LIZ2 = F0L.LIZ();
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                java.util.Map<String, String> map = this.additionReportParams;
                if (map != null) {
                    linkedHashMap.putAll(map);
                }
                InterfaceC59561NZd interfaceC59561NZd2 = this.iCrossPlatformActivityContainer;
                if (interfaceC59561NZd2 != null && (crossPlatformParams2 = interfaceC59561NZd2.getCrossPlatformParams()) != null) {
                    c59273NOb = crossPlatformParams2.LIZIZ;
                } else {
                    c59273NOb = null;
                }
                LIZ2.getClass();
                String LJ = C59639Nat.LJ(c59273NOb);
                if (LJ != null) {
                    linkedHashMap.put("package", LJ);
                }
                InterfaceC59561NZd interfaceC59561NZd3 = this.iCrossPlatformActivityContainer;
                if (interfaceC59561NZd3 != null) {
                    c59314NPq = interfaceC59561NZd3.getCrossPlatformParams();
                } else {
                    c59314NPq = null;
                }
                if (c59314NPq != null && (c59273NOb5 = c59314NPq.LIZIZ) != null) {
                    str2 = c59273NOb5.LJJIJL;
                } else {
                    str2 = null;
                }
                if (str2 != null) {
                    linkedHashMap.put("enter_from", str2);
                }
                InterfaceC59561NZd interfaceC59561NZd4 = this.iCrossPlatformActivityContainer;
                if (interfaceC59561NZd4 != null) {
                    c59314NPq2 = interfaceC59561NZd4.getCrossPlatformParams();
                } else {
                    c59314NPq2 = null;
                }
                if (c59314NPq2 != null && (c59273NOb4 = c59314NPq2.LIZIZ) != null) {
                    str3 = c59273NOb4.LJJIZ;
                } else {
                    str3 = null;
                }
                if (str3 != null) {
                    linkedHashMap.put("challenge_id", str3);
                }
                InterfaceC59561NZd interfaceC59561NZd5 = this.iCrossPlatformActivityContainer;
                if (interfaceC59561NZd5 != null) {
                    c59314NPq3 = interfaceC59561NZd5.getCrossPlatformParams();
                } else {
                    c59314NPq3 = null;
                }
                if (c59314NPq3 != null && (c59273NOb3 = c59314NPq3.LIZIZ) != null) {
                    str4 = c59273NOb3.LJJJ;
                } else {
                    str4 = null;
                }
                if (str4 != null) {
                    linkedHashMap.put("sticker_id", str4);
                }
                linkedHashMap.put("chrome_version", getChromeVersion());
                linkedHashMap.put("webview_type", "SystemWebView");
                c59866NeY3.LJJIJIIJIL(C58738N3m.LIZ(str), this, linkedHashMap);
                InterfaceC59585Na1 interfaceC59585Na12 = (InterfaceC59585Na1) c59866NeY3.LJJIJIIJI(InterfaceC59585Na1.class);
                if (interfaceC59585Na12 != null && (interfaceC59561NZd = this.iCrossPlatformActivityContainer) != null && (crossPlatformParams = interfaceC59561NZd.getCrossPlatformParams()) != null && (c59273NOb2 = crossPlatformParams.LIZIZ) != null) {
                    String str5 = c59273NOb2.LJIILIIL;
                    if (str5 == null || str5.length() == 0) {
                        z2 = true;
                    }
                    if (true ^ z2) {
                        c59273NOb6 = c59273NOb2;
                    }
                    if (c59273NOb6 != null) {
                        C59642Naw.LIZIZ(interfaceC59585Na12, c59273NOb6.LJIILIIL, c59273NOb6.LJIIIIZZ, c59273NOb6.LJIJJLI, c59273NOb6.LJJI);
                        interfaceC59585Na12.LJIIJ();
                    }
                }
                C59581NZx c59581NZx = this.singleWebViewClient;
                if (c59581NZx != null) {
                    c59581NZx.LJLJLJ = c59866NeY3;
                }
                SingleWebChromeClient singleWebChromeClient = this.singleWebChromeClient;
                if (singleWebChromeClient != null) {
                    singleWebChromeClient.LJFF = c59866NeY3;
                }
            }
        }
        AbstractC38279F0p abstractC38279F0p = this.baseJsMessageHandler;
        C59866NeY c59866NeY4 = this.monitorSession;
        C38287F0x c38287F0x = (C38287F0x) abstractC38279F0p;
        c38287F0x.LJLILLLLZI = c59866NeY4;
        c38287F0x.LJLJI.LIZ = c59866NeY4;
        String appendStatusBarHeightIfNeeded = appendStatusBarHeightIfNeeded(str);
        String LJIIJ = CrossPlatformLegacyServiceImpl.LJIJ().LJIIJ(appendStatusBarHeightIfNeeded);
        if (LJIIJ == null) {
            return appendStatusBarHeightIfNeeded;
        }
        return LJIIJ;
    }

    public static boolean com_ss_android_ugc_aweme_crossplatform_platform_webview_SingleWebView_com_ss_android_ugc_tiktok_security_lancet_web_SecLinkLancet_canGoBack(C59613NaT c59613NaT) {
        if (c59613NaT.com_ss_android_ugc_aweme_crossplatform_platform_webview_SingleWebView__canGoBack$___twin___() && C59312NPo.LIZIZ(c59613NaT)) {
            return true;
        }
        return false;
    }

    public static void com_ss_android_ugc_aweme_crossplatform_platform_webview_SingleWebView_com_ss_android_ugc_tiktok_security_lancet_web_SecLinkLancet_goBack(C59613NaT c59613NaT) {
        if (C59312NPo.LJ(c59613NaT)) {
            return;
        }
        c59613NaT.com_ss_android_ugc_aweme_crossplatform_platform_webview_SingleWebView__goBack$___twin___();
    }

    private final boolean isAd(String str) {
        C59314NPq crossPlatformParams;
        C59273NOb c59273NOb;
        if (str == null) {
            return false;
        }
        Locale locale = Locale.ROOT;
        String lowerCase = str.toLowerCase(locale);
        o.LJIIIIZZ(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        if (!ujb.o.LJJJLIIL(lowerCase, "http://", false)) {
            String lowerCase2 = str.toLowerCase(locale);
            o.LJIIIIZZ(lowerCase2, "this as java.lang.String).toLowerCase(Locale.ROOT)");
            if (!ujb.o.LJJJLIIL(lowerCase2, "https://", false)) {
                return false;
            }
        }
        InterfaceC59561NZd interfaceC59561NZd = this.iCrossPlatformActivityContainer;
        if (interfaceC59561NZd == null || (crossPlatformParams = interfaceC59561NZd.getCrossPlatformParams()) == null || (c59273NOb = crossPlatformParams.LIZIZ) == null || c59273NOb.LIZ <= 0) {
            return false;
        }
        return true;
    }

    @Override // X.NZR
    public void addOnSingleWebViewStatus(NZX onSingleWebViewStatus) {
        o.LJIIIZ(onSingleWebViewStatus, "onSingleWebViewStatus");
        C59581NZx c59581NZx = this.singleWebViewClient;
        if (c59581NZx != null) {
            ((ArrayList) c59581NZx.LJLILLLLZI).add(onSingleWebViewStatus);
        }
    }

    @Override // X.NZR
    public void addOnWebChromeStatus(InterfaceC59820Ndo onWebChromeStatus) {
        o.LJIIIZ(onWebChromeStatus, "onWebChromeStatus");
        this.onWebChromeStatus = onWebChromeStatus;
        SingleWebChromeClient singleWebChromeClient = this.singleWebChromeClient;
        if (singleWebChromeClient != null) {
            singleWebChromeClient.LJ.add(onWebChromeStatus);
        }
    }

    @Override // android.view.View
    public boolean canScrollVertically(int i) {
        if (this.enableScrollControl) {
            if (this.canScrollVertically && super.canScrollVertically(i)) {
                return true;
            }
            return false;
        }
        return super.canScrollVertically(i);
    }

    public void com_ss_android_ugc_aweme_crossplatform_platform_webview_SingleWebView__loadUrl$___twin___(String url) {
        o.LJIIIZ(url, "url");
        if (TextUtils.isEmpty(url) || shouldChangeWebView(url, null)) {
            return;
        }
        C59591Na7.LIZ().LIZLLL(this, url);
        EAC eac = EAC.LIZ;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("");
        LIZ.append(url);
        String LIZIZ = X1D.LIZIZ(LIZ);
        eac.getClass();
        if (EAC.LIZ(LIZIZ)) {
            C40705FyH c40705FyH = new C40705FyH(i0.LJFF("", url));
            this.mTTNetInterceptorWrapper = c40705FyH;
            C59581NZx c59581NZx = this.singleWebViewClient;
            if (c59581NZx != null) {
                c59581NZx.LJLJL = c40705FyH;
            }
        }
        if (isAd(url)) {
            clearHistory();
        }
        super.loadUrl(beforeLoadUrl(url));
    }

    @Override // X.NZR
    public void controlGeolocationPermissions(boolean z) {
        this.baseJsMessageHandler.setAllowGeolocationPermissions(Boolean.valueOf(z));
    }

    public void initWeb(Activity context) {
        o.LJIIIZ(context, "context");
        C61038NxS.LJIILIIL = SystemClock.uptimeMillis();
        this.lastClickTime = 0L;
        this.contextProviderFactory = new F0E();
        this.baseJsMessageHandler = C58132Mrg.LIZ(context);
        this.iCrossPlatformActivityContainer = null;
        this.singleWebChromeClient = null;
        this.disableInterceptRegionList = null;
        this.pauseList = null;
        this.mTTNetInterceptorWrapper = null;
        this.visitedUrls = new LinkedHashSet();
        F0E f0e = this.contextProviderFactory;
        f0e.LIZIZ(AbsActivityContainer.class, new C59628Nai(this));
        f0e.LIZIZ(NWV.class, new C59629Naj(this));
        f0e.LIZIZ(C59866NeY.class, new F1S(this));
        this.singleWebViewClient = new C59581NZx();
        addPageStartListener();
        C59581NZx c59581NZx = this.singleWebViewClient;
        o.LJI(c59581NZx);
        C16880lQ.LLZLLLL(this, c59581NZx);
        SingleWebChromeClient singleWebChromeClient = new SingleWebChromeClient(this);
        this.singleWebChromeClient = singleWebChromeClient;
        singleWebChromeClient.LIZJ = this.baseJsMessageHandler;
        setWebChromeClient(singleWebChromeClient);
        FFL.LJIIIZ().getClass();
        boolean z = true;
        if (FFL.LJIIJ(31744, 1, "use_injection_jsb", false) != 1) {
            z = false;
        }
        C38150EyA LIZ = C38156EyG.LIZ(this);
        SingleWebChromeClient singleWebChromeClient2 = this.singleWebChromeClient;
        o.LJI(singleWebChromeClient2);
        LIZ.LIZJ = singleWebChromeClient2;
        C59581NZx c59581NZx2 = this.singleWebViewClient;
        o.LJI(c59581NZx2);
        LIZ.LIZIZ = c59581NZx2;
        LIZ.LJIIJ = this.contextProviderFactory;
        AbstractC38279F0p jsMessageHandler = this.baseJsMessageHandler;
        o.LJIIIZ(jsMessageHandler, "jsMessageHandler");
        LIZ.LIZLLL = jsMessageHandler;
        LIZ.LJIIIIZZ = false;
        LIZ.LJFF = z;
        C38150EyA.LIZIZ(LIZ, null, new AqS192S0100000_10(this, 12), new IDqS435S0100000_10(this, 4), 3);
        this.iesJsBridge = LIZ;
        this.baseJsMessageHandler.setIesJsBridge(LIZ, this.contextProviderFactory);
        C59581NZx c59581NZx3 = this.singleWebViewClient;
        o.LJI(c59581NZx3);
        c59581NZx3.LJLIL = this.iesJsBridge.LJ;
        initConfig();
        addOnAttachStateChangeListener(new IDCListenerS244S0100000_6(this, 4));
    }

    @Override // X.NZR
    public void injectAdPerfJs(String str) {
        if (str == null || str.length() == 0) {
            return;
        }
        evaluateJavascript(str, C59579NZv.LIZ);
    }

    public final boolean isVisited(String url) {
        o.LJIIIZ(url, "url");
        return this.visitedUrls.contains(url);
    }

    @QD3
    public final void onJsBroadcast(C56642Ke event) {
        String str;
        o.LJIIIZ(event, "event");
        m LJIIZILJ = GsonProtectorUtils.parse(new com.google.gson.o(), event.LJLIL.toString()).LJIIZILJ();
        j LJJIJ = LJIIZILJ.LJJIJ("eventName");
        if (LJJIJ != null) {
            str = LJJIJ.LJJIFFI();
        } else {
            str = null;
        }
        if (o.LJ(str, "disableIntercept")) {
            j LJJIJ2 = LJIIZILJ.LJJIJ("data");
            if (LJJIJ2 != null) {
                try {
                    this.disableInterceptRegionList = (SingleWebView$DisableInterceptRegion[]) GsonProtectorUtils.fromJson(getGson(), LJJIJ2, SingleWebView$DisableInterceptRegion[].class);
                    return;
                } catch (com.google.gson.s unused) {
                    this.disableInterceptRegionList = null;
                    return;
                }
            }
            this.disableInterceptRegionList = null;
        }
    }

    @Override // X.NZR
    public void onReceivedTitle(InterfaceC88472Yns<? super String, C76800UCe> callback) {
        SingleWebChromeClient singleWebChromeClient;
        List<InterfaceC59820Ndo> list;
        SingleWebChromeClient singleWebChromeClient2;
        o.LJIIIZ(callback, "callback");
        this.titleCallback = callback;
        this.newWebChromeClient = new C59619NaZ(this, callback);
        if (Build.VERSION.SDK_INT >= 26) {
            WebChromeClient webChromeClient = getWebChromeClient();
            if ((webChromeClient instanceof SingleWebChromeClient) && (singleWebChromeClient = (SingleWebChromeClient) webChromeClient) != null && (list = singleWebChromeClient.LJ) != null && (singleWebChromeClient2 = this.newWebChromeClient) != null) {
                singleWebChromeClient2.LJ = list;
            }
        }
        setWebChromeClient(this.newWebChromeClient);
    }

    @Override // X.C59616NaW, android.webkit.WebView, android.view.View
    public boolean onTouchEvent(MotionEvent event) {
        boolean z;
        C59314NPq crossPlatformParams;
        C59273NOb c59273NOb;
        o.LJIIIZ(event, "event");
        InterfaceC59561NZd interfaceC59561NZd = this.iCrossPlatformActivityContainer;
        if (interfaceC59561NZd != null && (crossPlatformParams = interfaceC59561NZd.getCrossPlatformParams()) != null && (c59273NOb = crossPlatformParams.LIZIZ) != null && c59273NOb.LIZ > 0 && C35730E0o.LIZ() && c59273NOb.LJJJLL == 0) {
            requestDisallowInterceptTouchEvent(true);
        }
        if (event.getActionMasked() == 0) {
            this.disableIntercept = false;
            getLocationInWindow(new int[2]);
            int LJJJJI = C17N.LJJJJI(event.getRawX() - r2[0]);
            int LJJJJI2 = C17N.LJJJJI(event.getRawY() - r2[1]);
            SingleWebView$DisableInterceptRegion[] singleWebView$DisableInterceptRegionArr = this.disableInterceptRegionList;
            if (singleWebView$DisableInterceptRegionArr != null) {
                for (SingleWebView$DisableInterceptRegion singleWebView$DisableInterceptRegion : singleWebView$DisableInterceptRegionArr) {
                    double d = LJJJJI;
                    double d2 = singleWebView$DisableInterceptRegion.x;
                    if (d >= d2 && d <= d2 + singleWebView$DisableInterceptRegion.width) {
                        double d3 = LJJJJI2;
                        double d4 = singleWebView$DisableInterceptRegion.y;
                        if (d3 >= d4 && d3 <= d4 + singleWebView$DisableInterceptRegion.height) {
                            z = true;
                            break;
                        }
                    }
                }
            }
            z = false;
            this.disableIntercept = z;
        }
        if (this.disableIntercept) {
            requestDisallowInterceptTouchEvent(true);
        }
        if (super.canTouch) {
            getLastClickDetector().onTouchEvent(event);
            View.OnTouchListener onTouchListener = this.webviewTouchListener;
            if (onTouchListener != null) {
                onTouchListener.onTouch(this, event);
            }
        }
        if (this.enableScrollControl) {
            if (this.canScrollVertically) {
                requestDisallowInterceptTouchEvent(true);
            } else if (event.getAction() == 2) {
                return true;
            }
            return super.onTouchEvent(event);
        }
        return super.onTouchEvent(event);
    }

    @Override // X.NZR
    public void prefetchH5(String str) {
        C36992EfU c36992EfU = C36992EfU.LIZ;
        C38113ExZ jsBridge2$crossplatform_release = getJsBridge2$crossplatform_release();
        c36992EfU.getClass();
        C36992EfU.LIZJ(jsBridge2$crossplatform_release, str);
    }

    @Override // X.NZR
    public void removeOnSingleWebViewStatus(NZX onSingleWebViewStatus) {
        o.LJIIIZ(onSingleWebViewStatus, "onSingleWebViewStatus");
        C59581NZx c59581NZx = this.singleWebViewClient;
        if (c59581NZx != null) {
            ((ArrayList) c59581NZx.LJLILLLLZI).remove(onSingleWebViewStatus);
        }
    }

    public final void removeOnWebChromeStatus(InterfaceC59820Ndo onWebChromeStatus) {
        o.LJIIIZ(onWebChromeStatus, "onWebChromeStatus");
        SingleWebChromeClient singleWebChromeClient = this.singleWebChromeClient;
        if (singleWebChromeClient != null) {
            singleWebChromeClient.LJ.remove(onWebChromeStatus);
        }
    }

    @Override // X.NZR
    public void setAdditionalReportParams(boolean z) {
        this.shouldAdditionalReportParams = Boolean.valueOf(z);
        if (!z) {
            return;
        }
        this.additionReportParams = C0JU.LIZ("container_launch_type", "preload");
    }

    public final void setBaseJsMessageHandler(AbstractC38279F0p abstractC38279F0p) {
        o.LJIIIZ(abstractC38279F0p, "<set-?>");
        this.baseJsMessageHandler = abstractC38279F0p;
    }

    @Override // X.NZR
    public void setBusinessEnablePopup(boolean z) {
        SingleWebChromeClient singleWebChromeClient = this.singleWebChromeClient;
        if (singleWebChromeClient == null) {
            return;
        }
        singleWebChromeClient.LIZ = z;
    }

    @Override // X.NZR
    public void setCanScrollVertically(boolean z) {
        this.canScrollVertically = z;
    }

    @Override // X.C59616NaW, X.NZR
    public void setCanTouch(boolean z) {
        this.canTouch = Boolean.valueOf(z);
        super.setCanTouch(z);
    }

    @Override // X.NZR
    public void setCrossPlatformActivityContainer(InterfaceC59561NZd interfaceC59561NZd) {
        String str;
        C59273NOb c59273NOb;
        C59314NPq crossPlatformParams;
        C59314NPq crossPlatformParams2;
        C59273NOb c59273NOb2;
        AdWebStatBusiness adWebStatBusiness;
        long j;
        Long LJJIZ;
        C59314NPq crossPlatformParams3;
        C59273NOb c59273NOb3;
        if (interfaceC59561NZd != null) {
            this.iCrossPlatformActivityContainer = interfaceC59561NZd;
            C78253UnR LIZLLL = LegacyCommercializeServiceImpl.LJIIJ().LIZLLL();
            IAwemeService LIZ = AwemeService.LIZ();
            InterfaceC59561NZd interfaceC59561NZd2 = this.iCrossPlatformActivityContainer;
            if (interfaceC59561NZd2 != null && (crossPlatformParams3 = interfaceC59561NZd2.getCrossPlatformParams()) != null && (c59273NOb3 = crossPlatformParams3.LIZIZ) != null) {
                str = Long.valueOf(c59273NOb3.LIZ).toString();
            } else {
                str = null;
            }
            Aweme m6 = LIZ.m6(str);
            LIZLLL.getClass();
            this.isVastAd = C59252NNg.LJI(m6);
            SingleWebChromeClient singleWebChromeClient = this.singleWebChromeClient;
            if (singleWebChromeClient != null) {
                singleWebChromeClient.LIZLLL = interfaceC59561NZd;
            }
            C59581NZx c59581NZx = this.singleWebViewClient;
            if (c59581NZx != null) {
                c59581NZx.LJLJLLL = interfaceC59561NZd;
                NTL crossPlatformBusiness = interfaceC59561NZd.getCrossPlatformBusiness();
                if (crossPlatformBusiness != null && (adWebStatBusiness = (AdWebStatBusiness) ((C59484NWe) crossPlatformBusiness).LIZ(AdWebStatBusiness.class)) != null) {
                    NJD njd = c59581NZx.LJLJJLL;
                    if (njd != null) {
                        adWebStatBusiness.LJI = njd;
                    } else {
                        o.LJIJI("webviewInterceptor");
                        throw null;
                    }
                }
                InterfaceC59561NZd interfaceC59561NZd3 = c59581NZx.LJLJLLL;
                if (interfaceC59561NZd3 != null && (crossPlatformParams2 = interfaceC59561NZd3.getCrossPlatformParams()) != null && (c59273NOb2 = crossPlatformParams2.LIZIZ) != null) {
                    NJD njd2 = c59581NZx.LJLJJLL;
                    if (njd2 != null) {
                        njd2.LJI(c59273NOb2);
                    } else {
                        o.LJIJI("webviewInterceptor");
                        throw null;
                    }
                }
                PassBackWebInfoBusiness LIZIZ = c59581NZx.LIZIZ();
                if (LIZIZ != null) {
                    InterfaceC59561NZd interfaceC59561NZd4 = c59581NZx.LJLJLLL;
                    if (interfaceC59561NZd4 != null && (crossPlatformParams = interfaceC59561NZd4.getCrossPlatformParams()) != null) {
                        c59273NOb = crossPlatformParams.LIZIZ;
                    } else {
                        c59273NOb = null;
                    }
                    LIZIZ.LJ(c59273NOb);
                }
            }
            ((C38287F0x) this.baseJsMessageHandler).LJLIL = interfaceC59561NZd;
            C59314NPq crossPlatformParams4 = interfaceC59561NZd.getCrossPlatformParams();
            if (crossPlatformParams4 != null) {
                boolean z = crossPlatformParams4.LIZ.LJI;
                try {
                    FFL.LJIIIZ().getClass();
                    if (FFL.LJ(31744, "enable_audio_auto_play_experiment", true, false)) {
                        getSettings().setMediaPlaybackRequiresUserGesture(!z);
                    } else {
                        getSettings().setMediaPlaybackRequiresUserGesture(true);
                    }
                } catch (Exception unused) {
                    getSettings().setMediaPlaybackRequiresUserGesture(true);
                }
                AbstractC38279F0p abstractC38279F0p = this.baseJsMessageHandler;
                C59273NOb c59273NOb4 = crossPlatformParams4.LIZIZ;
                abstractC38279F0p.setAdInfo(c59273NOb4.LIZ, c59273NOb4.LIZIZ, c59273NOb4.LIZJ, c59273NOb4.LJIIIIZZ, c59273NOb4.LJ, c59273NOb4.LJJIJIIJIL, c59273NOb4.LJJIJIL, c59273NOb4.LJJJJJ);
                AbstractC38279F0p abstractC38279F0p2 = this.baseJsMessageHandler;
                C59310NPm c59310NPm = crossPlatformParams4.LJ;
                abstractC38279F0p2.setAdInfoFromAweme(c59310NPm.LIZ, c59310NPm.LIZIZ, c59310NPm.LIZJ, c59310NPm.LIZLLL, c59310NPm.LJ, c59310NPm.LJFF, c59310NPm.LJI);
                AbstractC38279F0p abstractC38279F0p3 = this.baseJsMessageHandler;
                String str2 = crossPlatformParams4.LIZ.LJ;
                if (str2 != null && (LJJIZ = C38350F3i.LJJIZ(str2)) != null) {
                    j = LJJIZ.longValue();
                } else {
                    j = 0;
                }
                abstractC38279F0p3.setGroupId(j);
                this.baseJsMessageHandler.setPackageName(crossPlatformParams4.LIZIZ.LJI);
                this.baseJsMessageHandler.setAppName(crossPlatformParams4.LIZIZ.LJFF);
                if (crossPlatformParams4.LIZ.LJIIJJI) {
                    setLayerType(1, null);
                }
            }
        }
    }

    @Override // X.NZR
    public void setCrossPlatformActivityContainerInChrome(InterfaceC59561NZd interfaceC59561NZd) {
        this.iCrossPlatformActivityContainerInChrome = interfaceC59561NZd;
        SingleWebChromeClient singleWebChromeClient = this.newWebChromeClient;
        if (singleWebChromeClient == null) {
            return;
        }
        singleWebChromeClient.LIZLLL = interfaceC59561NZd;
    }

    public final void setCurUrl(String str) {
        this.curUrl = str;
    }

    @Override // X.C59616NaW, android.webkit.WebView, X.NZR
    public void setDownloadListener(DownloadListener downloadListener) {
        this.downloadListener = downloadListener;
        super.setDownloadListener(downloadListener);
    }

    @Override // X.NZR
    public void setEnableScrollControl(boolean z) {
        this.enableScrollControl = z;
    }

    public final void setICrossPlatformActivityContainer(InterfaceC59561NZd interfaceC59561NZd) {
        this.iCrossPlatformActivityContainer = interfaceC59561NZd;
    }

    public final void setICrossPlatformActivityContainerInChrome(InterfaceC59561NZd interfaceC59561NZd) {
        this.iCrossPlatformActivityContainerInChrome = interfaceC59561NZd;
    }

    @Override // X.NZR
    public void setJavaScriptEnabled(boolean z) {
        getSettings().setJavaScriptEnabled(z);
    }

    @Override // X.NZR
    public void setMediaPlaybackRequiresUserGesture(boolean z) {
        getSettings().setMediaPlaybackRequiresUserGesture(z);
    }

    @Override // X.NZR
    public void setMonitorSession(C59866NeY c59866NeY) {
        this.monitorSession = c59866NeY;
    }

    public final void setNewWebChromeClient(SingleWebChromeClient singleWebChromeClient) {
        this.newWebChromeClient = singleWebChromeClient;
    }

    @Override // X.C59615NaV, android.webkit.WebView, android.view.View, X.NZR
    public void setOverScrollMode(int i) {
        super.setOverScrollMode(i);
    }

    @Override // X.NZR
    public void setSettingsTextZoom(int i) {
        getSettings().setTextZoom(i);
    }

    @Override // X.NZR
    public void setShouldOverrideInterceptor(InterfaceC88471Ynr<? super WebView, ? super String, Boolean> interceptor) {
        o.LJIIIZ(interceptor, "interceptor");
        C59581NZx c59581NZx = this.singleWebViewClient;
        if (c59581NZx == null) {
            return;
        }
        c59581NZx.LJLJI = interceptor;
    }

    @Override // X.NZR
    public void setSingleWebViewStatusListeners(List<NZX> list) {
        C59581NZx c59581NZx;
        List<NZX> list2;
        if (list == null || list.isEmpty() || (c59581NZx = this.singleWebViewClient) == null || (list2 = c59581NZx.LJLILLLLZI) == null) {
            return;
        }
        ((ArrayList) list2).addAll(list);
    }

    public final void setTitleCallback(InterfaceC88472Yns<? super String, C76800UCe> interfaceC88472Yns) {
        this.titleCallback = interfaceC88472Yns;
    }

    @Override // X.NZR
    public void setTouchListener(View.OnTouchListener onTouchListener) {
        this.webviewTouchListener = onTouchListener;
    }

    public final void setUseSandbox(boolean z) {
        this.useSandbox = z;
    }

    @Override // X.NZR
    public void setUserAgentString(String str) {
        C16880lQ.LLZL(getSettings(), str);
    }

    @Override // X.NZR
    public void setWebScrollListener(InterfaceC59637Nar interfaceC59637Nar) {
        if (interfaceC59637Nar != null) {
            this.scrollListeners.add(interfaceC59637Nar);
        }
    }

    @Override // X.NZR
    public void setWebScrollListeners(ArrayList<InterfaceC59637Nar> arrayList) {
        if (arrayList != null) {
            this.scrollListeners.addAll(arrayList);
        }
    }

    @Override // X.NZR
    public void setWebViewChangeListener(InterfaceC59568NZk listener) {
        o.LJIIIZ(listener, "listener");
        this.iWebViewChangeListener = listener;
        C59581NZx c59581NZx = this.singleWebViewClient;
        if (c59581NZx != null) {
            c59581NZx.LJLJJI = listener;
        }
    }

    public final void visit(String url) {
        o.LJIIIZ(url, "url");
        this.visitedUrls.add(url);
    }

    public static void com_ss_android_ugc_aweme_crossplatform_platform_webview_SingleWebView_com_ss_android_ugc_tiktok_security_lancet_web_SecLinkLancet_loadUrl(C59613NaT c59613NaT, String str) {
        String LIZLLL = C59312NPo.LIZ.LIZLLL(c59613NaT, str);
        if (!TextUtils.isEmpty(LIZLLL)) {
            str = LIZLLL;
        }
        c59613NaT.com_ss_android_ugc_aweme_crossplatform_platform_webview_SingleWebView__loadUrl$___twin___(str);
    }

    private final boolean shouldChangeWebView(String str, java.util.Map<String, String> map) {
        C59314NPq crossPlatformParams;
        C59308NPk c59308NPk;
        if (str != null && ujb.o.LJJJLIIL(str, "http", false)) {
            boolean LIZIZ = NZS.LIZIZ(this.iCrossPlatformActivityContainer, str, this.iWebViewChangeListener, true, map, Boolean.FALSE, true);
            InterfaceC59561NZd interfaceC59561NZd = this.iCrossPlatformActivityContainer;
            if (interfaceC59561NZd != null && (crossPlatformParams = interfaceC59561NZd.getCrossPlatformParams()) != null && (c59308NPk = crossPlatformParams.LIZ) != null) {
                c59308NPk.LJIIZILJ = false;
            }
            if (LIZIZ) {
                return true;
            }
        }
        return false;
    }

    @Override // X.NZR
    public void addJavascriptInterfaceOut(Object object, String name) {
        o.LJIIIZ(object, "object");
        o.LJIIIZ(name, "name");
        this.jsObject = object;
        this.jsName = name;
        addJavascriptInterface(object, name);
    }

    public void com_ss_android_ugc_aweme_crossplatform_platform_webview_SingleWebView__loadUrl$___twin___(String url, java.util.Map<String, String> additionalHttpHeaders) {
        o.LJIIIZ(url, "url");
        o.LJIIIZ(additionalHttpHeaders, "additionalHttpHeaders");
        if (TextUtils.isEmpty(url) || shouldChangeWebView(url, additionalHttpHeaders)) {
            return;
        }
        C59591Na7.LIZ().LIZLLL(this, url);
        EAC eac = EAC.LIZ;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("");
        LIZ.append(url);
        String LIZIZ = X1D.LIZIZ(LIZ);
        eac.getClass();
        if (EAC.LIZ(LIZIZ)) {
            C40705FyH c40705FyH = new C40705FyH(i0.LJFF("", url));
            this.mTTNetInterceptorWrapper = c40705FyH;
            C59581NZx c59581NZx = this.singleWebViewClient;
            if (c59581NZx != null) {
                c59581NZx.LJLJL = c40705FyH;
            }
        }
        if (isAd(url)) {
            clearHistory();
        }
        super.loadUrl(beforeLoadUrl(url), additionalHttpHeaders);
    }

    @Override // android.webkit.WebView, X.NZR
    public void evaluateJavascript(String script, ValueCallback<String> valueCallback) {
        o.LJIIIZ(script, "script");
        super.evaluateJavascript(script, valueCallback);
    }

    public final void reportOnJsbInvoke(String str, EnumC38166EyQ enumC38166EyQ) {
        C59866NeY c59866NeY;
        InterfaceC59585Na1 interfaceC59585Na1;
        if (isAllowJsbMonitor() && (c59866NeY = this.monitorSession) != null && (interfaceC59585Na1 = (InterfaceC59585Na1) c59866NeY.LJJIJIIJI(InterfaceC59585Na1.class)) != null) {
            JSONObject LIZJ = C65232Piu.LIZJ("bridge_name", str);
            int i = C38168EyS.LIZ[enumC38166EyQ.ordinal()];
            if (i != 1) {
                if (i == 2) {
                    LIZJ.put("bridge_access", "private");
                }
            } else {
                LIZJ.put("bridge_access", "public");
            }
            interfaceC59585Na1.LJIILJJIL("hybrid_app_monitor_bridge_invoke_event", "bridge_invoke", LIZJ, null, null);
        }
    }

    @Override // X.NZR
    public void sendEventToWebView(String event, JSONObject jSONObject) {
        o.LJIIIZ(event, "event");
        this.baseJsMessageHandler.sendEventMsg(event, jSONObject);
    }

    @Override // android.webkit.WebView, android.view.View, X.NZR
    public void setLayerType(int i, Paint paint) {
        super.setLayerType(i, paint);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C59613NaT(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        boolean z;
        this._$_findViewCache = C62850Ola.LJFF(context, "context");
        this.contextProviderFactory = new F0E();
        this.baseJsMessageHandler = C58132Mrg.LIZ(context);
        this.gson$delegate = C221108m2.LIZIZ(C59633Nan.LJLIL);
        this.visitedUrls = new LinkedHashSet();
        this.chromeVersion$delegate = C221108m2.LIZ(EnumC221088m0.NONE, new AqS160S0100000_10(this, 159));
        this.lastClickDetector$delegate = C221108m2.LIZIZ(new AqS157S0200000_10(context, this, 12));
        C59591Na7.LIZ().LJIJJLI(this);
        C61038NxS.LJIILIIL = SystemClock.uptimeMillis();
        F0E f0e = this.contextProviderFactory;
        f0e.LIZIZ(AbsActivityContainer.class, new C59621Nab(this));
        f0e.LIZIZ(NWV.class, new C59625Naf(this));
        f0e.LIZIZ(C59866NeY.class, new F1R(this));
        this.singleWebViewClient = new C59581NZx();
        addPageStartListener();
        C59581NZx c59581NZx = this.singleWebViewClient;
        o.LJI(c59581NZx);
        C16880lQ.LLZLLLL(this, c59581NZx);
        SingleWebChromeClient singleWebChromeClient = new SingleWebChromeClient(this);
        this.singleWebChromeClient = singleWebChromeClient;
        singleWebChromeClient.LIZJ = this.baseJsMessageHandler;
        setWebChromeClient(singleWebChromeClient);
        FFL.LJIIIZ().getClass();
        if (FFL.LJIIJ(31744, 1, "use_injection_jsb", false) == 1) {
            z = true;
        } else {
            z = false;
        }
        C38150EyA LIZ = C38156EyG.LIZ(this);
        SingleWebChromeClient singleWebChromeClient2 = this.singleWebChromeClient;
        o.LJI(singleWebChromeClient2);
        LIZ.LIZJ = singleWebChromeClient2;
        C59581NZx c59581NZx2 = this.singleWebViewClient;
        o.LJI(c59581NZx2);
        LIZ.LIZIZ = c59581NZx2;
        AbstractC38279F0p jsMessageHandler = this.baseJsMessageHandler;
        o.LJIIIZ(jsMessageHandler, "jsMessageHandler");
        LIZ.LIZLLL = jsMessageHandler;
        LIZ.LJIIJ = this.contextProviderFactory;
        LIZ.LJIIIIZZ = false;
        LIZ.LJFF = z;
        C38150EyA.LIZIZ(LIZ, null, new AqS192S0100000_10(this, 11), new IDqS435S0100000_10(this, 3), 3);
        this.iesJsBridge = LIZ;
        this.baseJsMessageHandler.setIesJsBridge(LIZ, this.contextProviderFactory);
        C59581NZx c59581NZx3 = this.singleWebViewClient;
        o.LJI(c59581NZx3);
        c59581NZx3.LJLIL = this.iesJsBridge.LJ;
        initConfig();
        addOnAttachStateChangeListener(new IDCListenerS244S0100000_6(this, 3));
        if (FetchBridgeSettings.LIZ().enable) {
            C38049EwX c38049EwX = this.iesJsBridge.LJ;
            if (c38049EwX != null) {
                c38049EwX.LJIIIZ = C38180Eye.LIZ;
            }
            if (FetchBridgeSettings.LIZ().enableChangeUa) {
                C16880lQ.LLZL(getSettings(), getSettings().getUserAgentString() + " bridge_fetch/1");
            }
            this.useSandbox = true;
        }
        this.canScrollVertically = true;
        this.scrollListeners = new ArrayList<>();
        if (C52300Kfo.LIZ()) {
            WebSettings settings = getSettings();
            String userAgentString = settings.getUserAgentString();
            if (!userAgentString.contains(" BytedanceWebview/d8a21c6")) {
                C16880lQ.LLZL(settings, userAgentString.concat(" BytedanceWebview/d8a21c6"));
            }
        }
    }

    public static void com_ss_android_ugc_aweme_crossplatform_platform_webview_SingleWebView_com_ss_android_ugc_tiktok_security_lancet_web_SecLinkLancet_loadUrl(C59613NaT c59613NaT, String str, java.util.Map map) {
        String LIZLLL = C59312NPo.LIZ.LIZLLL(c59613NaT, str);
        if (!TextUtils.isEmpty(LIZLLL)) {
            str = LIZLLL;
        }
        c59613NaT.com_ss_android_ugc_aweme_crossplatform_platform_webview_SingleWebView__loadUrl$___twin___(str, map);
    }

    public final void reportOnJsbReject(String str, EnumC38166EyQ enumC38166EyQ, int i) {
        C59866NeY c59866NeY;
        InterfaceC59585Na1 interfaceC59585Na1;
        if (isAllowJsbMonitor() && (c59866NeY = this.monitorSession) != null && (interfaceC59585Na1 = (InterfaceC59585Na1) c59866NeY.LJJIJIIJI(InterfaceC59585Na1.class)) != null) {
            JSONObject LIZJ = C65232Piu.LIZJ("bridge_name", str);
            int i2 = C38168EyS.LIZ[enumC38166EyQ.ordinal()];
            if (i2 != 1) {
                if (i2 == 2) {
                    LIZJ.put("bridge_access", "private");
                }
            } else {
                LIZJ.put("bridge_access", "public");
            }
            LIZJ.put("reason", String.valueOf(i));
            interfaceC59585Na1.LJIILJJIL("hybrid_app_monitor_bridge_invoke_event", "bridge_reject", LIZJ, null, null);
        }
    }

    @Override // android.webkit.WebView, android.view.View
    public void onOverScrolled(int i, int i2, boolean z, boolean z2) {
        C59314NPq crossPlatformParams;
        C59273NOb c59273NOb;
        InterfaceC59561NZd interfaceC59561NZd = this.iCrossPlatformActivityContainer;
        if (interfaceC59561NZd != null && (crossPlatformParams = interfaceC59561NZd.getCrossPlatformParams()) != null && (c59273NOb = crossPlatformParams.LIZIZ) != null && c59273NOb.LIZ > 0 && C35730E0o.LIZ() && c59273NOb.LJJJLL == 0 && (z || z2)) {
            requestDisallowInterceptTouchEvent(false);
        }
        super.onOverScrolled(i, i2, z, z2);
    }

    @Override // android.webkit.WebView, android.view.View
    public void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        Iterator<InterfaceC59637Nar> it = this.scrollListeners.iterator();
        while (it.hasNext()) {
            it.next().onScrollChanged(i, i2, i3, i4);
        }
    }

    public /* synthetic */ C59613NaT(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
