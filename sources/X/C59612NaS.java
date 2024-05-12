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
import com.ss.android.ugc.aweme.crossplatform.platform.adseperatedwebview.AdSeperatedWebChromeClient;
import com.ss.android.ugc.aweme.crossplatform.platform.adseperatedwebview.AdSeperatedWebView$DisableInterceptRegion;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.global.config.settings.pojo.HybridMonitorConfig;
import com.ss.android.ugc.aweme.settings.FetchBridgeSettings;
import com.zhiliaoapp.musically.R;
import defpackage.a1;
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
import kotlin.jvm.internal.IDqS435S0100000_10;
import kotlin.jvm.internal.o;
import org.greenrobot.eventbus.EventBus;
import org.json.JSONObject;
import ujb.s;

/* renamed from: X.NaS, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C59612NaS extends C59615NaV implements GenericLifecycleObserver, InterfaceC38148Ey8, NZR {
    public C38150EyA LJLIL;
    public C59580NZw LJLILLLLZI;
    public F0E LJLJI;
    public InterfaceC59561NZd LJLJJI;
    public AdSeperatedWebChromeClient LJLJJL;
    public AbstractC38279F0p LJLJJLL;
    public AdSeperatedWebView$DisableInterceptRegion[] LJLJL;
    public View.OnTouchListener LJLJLJ;
    public final C62822Ol8 LJLJLLL;
    public boolean LJLL;
    public long LJLLI;
    public List<String> LJLLILLLL;
    public String LJLLJ;
    public String LJLLL;
    public final C5H3 LJLLLL;
    public InterfaceC59820Ndo LJLLLLLL;
    public C59866NeY LJLZ;
    public boolean LJZ;
    public java.util.Map<String, String> LJZI;
    public Boolean LJZL;
    public final C62822Ol8 LL;
    public boolean LLD;
    public InterfaceC59561NZd LLF;
    public boolean LLFF;
    public boolean LLFFF;
    public boolean LLFII;
    public final ArrayList<InterfaceC59637Nar> LLFZ;
    public DownloadListener LLI;
    public Boolean LLIFFJFJJ;
    public Object LLII;
    public String LLIIII;
    public C59618NaY LLIIIILZ;
    public InterfaceC88472Yns<? super String, C76800UCe> LLIIIJ;
    public InterfaceC59568NZk LLIIIL;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C59612NaS(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        o.LJIIIZ(context, "context");
    }

    @Override // X.NZR
    public InterfaceC59575NZr getShouldOverrideUrlLoadingListener() {
        return null;
    }

    @Override // X.NZR
    public View getView() {
        return this;
    }

    public final boolean isAllowJsbMonitor() {
        android.net.Uri parse;
        String host;
        try {
            String str = this.LJLLJ;
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

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
    }

    public void setShouldOverrideUrlLoadingListener(InterfaceC59575NZr listener) {
        o.LJIIIZ(listener, "listener");
    }

    @Override // X.NZR
    public final void transparentBackground() {
        setBackgroundColor(0);
    }

    private final Gson getGson() {
        return (Gson) this.LJLJLLL.getValue();
    }

    private final boolean getInPauseList() {
        List<String> list = this.LJLLILLLL;
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
        return (GestureDetector) this.LL.getValue();
    }

    @Override // X.NZR
    public final void contextDestroy() {
        this.LJLJJLL.onDestroy();
        C59832Ne0.LIZ(this);
        C59580NZw c59580NZw = this.LJLILLLLZI;
        if (c59580NZw != null) {
            NJC njc = c59580NZw.LJLJJLL;
            if (njc != null) {
                C38995FSd.LIZIZ().execute(new ARunnableS46S0100000_10(njc, 198));
            } else {
                o.LJIJI("webviewInterceptor");
                throw null;
            }
        }
    }

    @Override // X.NZR
    public final void contextPause() {
        this.LJLJJLL.onPause();
        super.onPause();
        C59832Ne0.LIZIZ(getContext(), this);
        if (getInPauseList() || this.LLD) {
            pauseTimers();
        }
    }

    @Override // X.NZR
    public final void contextResume() {
        this.LJLJJLL.onResume();
        super.onResume();
        resumeTimers();
    }

    @Override // X.NZR
    public final void destroyPassBackWebInfoBusiness() {
        NTL crossPlatformBusiness;
        PassBackWebInfoBusiness passBackWebInfoBusiness;
        InterfaceC59561NZd interfaceC59561NZd = this.LJLJJI;
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
        AdSeperatedWebChromeClient adSeperatedWebChromeClient = this.LJLJJL;
        if (adSeperatedWebChromeClient != null) {
            return Boolean.valueOf(adSeperatedWebChromeClient.LIZ);
        }
        return null;
    }

    public final String getChromeVersion() {
        return (String) this.LJLLLL.getValue();
    }

    @Override // X.NZR
    public boolean getControlGeolocationPermissions() {
        Boolean allowGeolocationPermissions = this.LJLJJLL.getAllowGeolocationPermissions();
        o.LJIIIIZZ(allowGeolocationPermissions, "baseJsMessageHandler.allowGeolocationPermissions");
        return allowGeolocationPermissions.booleanValue();
    }

    public final C38113ExZ getJsBridge2() {
        C38150EyA c38150EyA = this.LJLIL;
        if (c38150EyA != null) {
            return c38150EyA.LJII;
        }
        return null;
    }

    @Override // X.NZR
    public InterfaceC88471Ynr<WebView, String, Boolean> getShouldOverrideInterceptor() {
        C59580NZw c59580NZw = this.LJLILLLLZI;
        if (c59580NZw != null) {
            return c59580NZw.LJLJI;
        }
        return null;
    }

    @Override // X.NZR
    public List<NZX> getSingleWebViewStatusListeners() {
        C59580NZw c59580NZw = this.LJLILLLLZI;
        if (c59580NZw != null) {
            return c59580NZw.LJLILLLLZI;
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

    @Override // X.C59616NaW, android.webkit.WebView, X.NZR
    public final boolean canGoBack() {
        if (super.canGoBack() && C59312NPo.LIZIZ(this)) {
            return true;
        }
        return false;
    }

    @Override // X.C59616NaW, android.webkit.WebView, X.NZR
    public final boolean canGoForward() {
        return super.canGoForward();
    }

    @Override // android.webkit.WebView, X.NZR
    public final WebBackForwardList copyBackForwardList() {
        WebBackForwardList copyBackForwardList = super.copyBackForwardList();
        o.LJIIIIZZ(copyBackForwardList, "super.copyBackForwardList()");
        return copyBackForwardList;
    }

    @Override // android.webkit.WebView, X.NZR
    public final void destroy() {
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

    @Override // X.C59616NaW, android.webkit.WebView, X.NZR
    public final void goBack() {
        if (C59312NPo.LJ(this)) {
            return;
        }
        C59591Na7.LIZ().LJ(this);
        super.goBack();
    }

    @Override // X.C59616NaW
    public final boolean hasClickInTimeInterval() {
        if (System.currentTimeMillis() - this.LJLLI < getTimeInterval()) {
            return true;
        }
        return false;
    }

    public final void initConfig() {
        C60407NnH c60407NnH = new C60407NnH(getContext());
        c60407NnH.LIZIZ = true;
        c60407NnH.LIZ(this);
        setFocusableInTouchMode(true);
        setScrollBarStyle(0);
        CookieManager.getInstance().setAcceptCookie(true);
        getSettings().setCacheMode(getCacheMode());
        C59445NUr.LIZIZ(new AqS176S0100000_10(this, 39));
    }

    @Override // android.webkit.WebView, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        C59591Na7.LIZ().LJI(this);
        super.onAttachedToWindow();
        EventBus.LIZJ().LJIILJJIL(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        C59866NeY c59866NeY;
        super.onDetachedFromWindow();
        EventBus.LIZJ().LJIJ(this);
        if (this.LJZ && (c59866NeY = this.LJLZ) != null && c59866NeY.LIZJ) {
            F0L.LIZ().LIZIZ(c59866NeY.LJJIJ());
        }
    }

    @Override // X.C59616NaW, android.webkit.WebView, X.NZR
    public final void reload() {
        C59591Na7.LIZ().LJIILIIL(this);
        super.reload();
    }

    @Override // X.NZR
    public final void setLoadNoCache() {
        getSettings().setCacheMode(2);
    }

    @Override // X.C59616NaW, android.webkit.WebView, X.NZR
    public final void clearHistory() {
        super.clearHistory();
    }

    @Override // X.NZR
    public Boolean getAdditionalReportParams() {
        return this.LJZL;
    }

    public final AbstractC38279F0p getBaseJsMessageHandler() {
        return this.LJLJJLL;
    }

    @Override // X.NZR
    public boolean getCanScrollVertically() {
        return this.LLFFF;
    }

    @Override // X.NZR
    public Boolean getCanTouch() {
        return this.LLIFFJFJJ;
    }

    @Override // X.NZR
    public InterfaceC59561NZd getCrossPlatformActivityContainer() {
        return this.LJLJJI;
    }

    @Override // X.NZR
    public InterfaceC59561NZd getCrossPlatformActivityContainerInChrome() {
        return this.LLF;
    }

    public final String getCurUrl() {
        return this.LJLLJ;
    }

    @Override // X.NZR
    public DownloadListener getDownloadListener() {
        return this.LLI;
    }

    @Override // X.NZR
    public boolean getEnableScrollControl() {
        return this.LLFF;
    }

    public final InterfaceC59561NZd getICrossPlatformActivityContainer() {
        return this.LJLJJI;
    }

    public final InterfaceC59561NZd getICrossPlatformActivityContainerInChrome() {
        return this.LLF;
    }

    @Override // X.NZR
    public String getJavascriptInterfaceName() {
        return this.LLIIII;
    }

    @Override // X.NZR
    public Object getJavascriptInterfaceObject() {
        return this.LLII;
    }

    @Override // X.NZR
    public C59866NeY getMonitorSession() {
        return this.LJLZ;
    }

    public final boolean getMonitorSessionCreatedBySelf() {
        return this.LJZ;
    }

    @Override // X.InterfaceC38148Ey8
    public String getSafeUrl() {
        return this.LJLLL;
    }

    public final InterfaceC88472Yns<String, C76800UCe> getTitleCallback() {
        return this.LLIIIJ;
    }

    @Override // X.NZR
    public InterfaceC88472Yns<String, C76800UCe> getTitleCallbck() {
        return this.LLIIIJ;
    }

    @Override // X.NZR
    public View.OnTouchListener getTouchListener() {
        return this.LJLJLJ;
    }

    public final boolean getUseSandbox() {
        return this.LJLL;
    }

    @Override // X.NZR
    public InterfaceC59820Ndo getWebChromeStatus() {
        return this.LJLLLLLL;
    }

    @Override // X.NZR
    public ArrayList<InterfaceC59637Nar> getWebScrollListener() {
        return this.LLFZ;
    }

    @Override // X.C59616NaW, android.webkit.WebView, X.NZR
    public final void goForward() {
        super.goForward();
    }

    @Override // X.C59615NaV, android.webkit.WebView, X.NZR
    public final void onPause() {
        super.onPause();
    }

    @Override // X.C59615NaV, android.webkit.WebView, X.NZR
    public final void onResume() {
        super.onResume();
    }

    @Override // X.C59616NaW, android.webkit.WebView, X.NZR
    public final void stopLoading() {
        super.stopLoading();
    }

    public C59612NaS(Context context) {
        this(context, null, 6, 0);
        if (C52300Kfo.LIZ()) {
            WebSettings settings = getSettings();
            String userAgentString = settings.getUserAgentString();
            if (!userAgentString.contains(" BytedanceWebview/d8a21c6")) {
                C16880lQ.LLZL(settings, userAgentString.concat(" BytedanceWebview/d8a21c6"));
            }
        }
    }

    @Override // X.NZR
    public final void addOnSingleWebViewStatus(NZX nzx) {
        C59580NZw c59580NZw = this.LJLILLLLZI;
        if (c59580NZw != null) {
            ((ArrayList) c59580NZw.LJLILLLLZI).add(nzx);
        }
    }

    @Override // X.NZR
    public final void addOnWebChromeStatus(InterfaceC59820Ndo interfaceC59820Ndo) {
        this.LJLLLLLL = interfaceC59820Ndo;
        AdSeperatedWebChromeClient adSeperatedWebChromeClient = this.LJLJJL;
        if (adSeperatedWebChromeClient != null) {
            adSeperatedWebChromeClient.LJ.add(interfaceC59820Ndo);
        }
    }

    public final String beforeLoadUrl(String str) {
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
        this.LJLLJ = str;
        C59866NeY c59866NeY = this.LJLZ;
        boolean z2 = false;
        if (c59866NeY == null || !c59866NeY.LIZJ) {
            C59639Nat LIZ = F0L.LIZ();
            this.LJLZ = LIZ.LIZ(LIZ.LJI(str));
            this.LJZ = true;
        } else {
            this.LJZ = false;
        }
        C59866NeY c59866NeY2 = this.LJLZ;
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
        C59866NeY c59866NeY3 = this.LJLZ;
        if (c59866NeY3 != null) {
            C59273NOb c59273NOb6 = null;
            if (!c59866NeY3.LIZJ) {
                c59866NeY3 = null;
            }
            if (c59866NeY3 != null) {
                C59639Nat LIZ2 = F0L.LIZ();
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                java.util.Map<String, String> map = this.LJZI;
                if (map != null) {
                    linkedHashMap.putAll(map);
                }
                InterfaceC59561NZd interfaceC59561NZd2 = this.LJLJJI;
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
                InterfaceC59561NZd interfaceC59561NZd3 = this.LJLJJI;
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
                InterfaceC59561NZd interfaceC59561NZd4 = this.LJLJJI;
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
                InterfaceC59561NZd interfaceC59561NZd5 = this.LJLJJI;
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
                if (interfaceC59585Na12 != null && (interfaceC59561NZd = this.LJLJJI) != null && (crossPlatformParams = interfaceC59561NZd.getCrossPlatformParams()) != null && (c59273NOb2 = crossPlatformParams.LIZIZ) != null) {
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
                C59580NZw c59580NZw = this.LJLILLLLZI;
                if (c59580NZw != null) {
                    c59580NZw.LJLJLJ = c59866NeY3;
                }
                AdSeperatedWebChromeClient adSeperatedWebChromeClient = this.LJLJJL;
                if (adSeperatedWebChromeClient != null) {
                    adSeperatedWebChromeClient.LJFF = c59866NeY3;
                }
            }
        }
        AbstractC38279F0p abstractC38279F0p = this.LJLJJLL;
        C59866NeY c59866NeY4 = this.LJLZ;
        C38287F0x c38287F0x = (C38287F0x) abstractC38279F0p;
        c38287F0x.LJLILLLLZI = c59866NeY4;
        c38287F0x.LJLJI.LIZ = c59866NeY4;
        try {
            android.net.Uri parse = UriProtector.parse(str);
            String queryParameter = UriProtector.getQueryParameter(parse, "__status_bar");
            if (queryParameter != null && o.LJ(queryParameter, "true")) {
                Context context = getContext();
                o.LJIIIIZZ(context, "context");
                String builder = parse.buildUpon().appendQueryParameter("status_bar_height", String.valueOf(KL2.LJIILL(EF7.LIZIZ(), C63081OpJ.LJJJJLI(context) + 0.0f))).toString();
                o.LJIIIIZZ(builder, "uri.buildUpon()\n        …              .toString()");
                str = builder;
            }
        } catch (Exception unused2) {
        }
        String LJIIJ = CrossPlatformLegacyServiceImpl.LJIJ().LJIIJ(str);
        if (LJIIJ == null) {
            return str;
        }
        return LJIIJ;
    }

    @Override // android.view.View
    public final boolean canScrollVertically(int i) {
        if (this.LLFF) {
            if (this.LLFFF && super.canScrollVertically(i)) {
                return true;
            }
            return false;
        }
        return super.canScrollVertically(i);
    }

    @Override // X.NZR
    public final void controlGeolocationPermissions(boolean z) {
        this.LJLJJLL.setAllowGeolocationPermissions(Boolean.valueOf(z));
    }

    public final void initWeb(Activity context) {
        o.LJIIIZ(context, "context");
        C61038NxS.LJIILIIL = SystemClock.uptimeMillis();
        this.LJLLI = 0L;
        this.LJLJI = new F0E();
        this.LJLJJLL = C58132Mrg.LIZ(context);
        this.LJLJJI = null;
        this.LJLJJL = null;
        this.LJLJL = null;
        this.LJLLILLLL = null;
        new LinkedHashSet();
        F0E f0e = this.LJLJI;
        f0e.LIZIZ(AbsActivityContainer.class, new C59626Nag(this));
        f0e.LIZIZ(NWV.class, new C59627Nah(this));
        f0e.LIZIZ(C59866NeY.class, new F1Q(this));
        this.LJLILLLLZI = new C59580NZw();
        addOnSingleWebViewStatus(new C59752Nci(this));
        C59580NZw c59580NZw = this.LJLILLLLZI;
        o.LJI(c59580NZw);
        C16880lQ.LLZLLIL(this, c59580NZw);
        AdSeperatedWebChromeClient adSeperatedWebChromeClient = new AdSeperatedWebChromeClient(this);
        this.LJLJJL = adSeperatedWebChromeClient;
        adSeperatedWebChromeClient.LIZJ = this.LJLJJLL;
        setWebChromeClient(adSeperatedWebChromeClient);
        FFL.LJIIIZ().getClass();
        boolean z = true;
        if (FFL.LJIIJ(31744, 1, "use_injection_jsb", false) != 1) {
            z = false;
        }
        C38150EyA LIZ = C38156EyG.LIZ(this);
        AdSeperatedWebChromeClient adSeperatedWebChromeClient2 = this.LJLJJL;
        o.LJI(adSeperatedWebChromeClient2);
        LIZ.LIZJ = adSeperatedWebChromeClient2;
        C59580NZw c59580NZw2 = this.LJLILLLLZI;
        o.LJI(c59580NZw2);
        LIZ.LIZIZ = c59580NZw2;
        LIZ.LJIIJ = this.LJLJI;
        AbstractC38279F0p jsMessageHandler = this.LJLJJLL;
        o.LJIIIZ(jsMessageHandler, "jsMessageHandler");
        LIZ.LIZLLL = jsMessageHandler;
        LIZ.LJIIIIZZ = false;
        LIZ.LJFF = z;
        C38150EyA.LIZIZ(LIZ, null, new AqS192S0100000_10(this, 10), new IDqS435S0100000_10(this, 2), 3);
        this.LJLIL = LIZ;
        this.LJLJJLL.setIesJsBridgeIn3WV(LIZ, this.LJLJI);
        C59580NZw c59580NZw3 = this.LJLILLLLZI;
        o.LJI(c59580NZw3);
        c59580NZw3.LJLIL = this.LJLIL.LJ;
        initConfig();
        addOnAttachStateChangeListener(new IDCListenerS244S0100000_6(this, 2));
    }

    @Override // X.NZR
    public final void injectAdPerfJs(String script) {
        if (script == null || script.length() == 0) {
            return;
        }
        ValueCallback<String> valueCallback = C59578NZu.LIZ;
        o.LJIIIZ(script, "script");
        super.evaluateJavascript(script, valueCallback);
    }

    public final boolean isAd(String str) {
        C59314NPq crossPlatformParams;
        C59273NOb c59273NOb;
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
        InterfaceC59561NZd interfaceC59561NZd = this.LJLJJI;
        if (interfaceC59561NZd == null || (crossPlatformParams = interfaceC59561NZd.getCrossPlatformParams()) == null || (c59273NOb = crossPlatformParams.LIZIZ) == null || c59273NOb.LIZ <= 0) {
            return false;
        }
        return true;
    }

    @Override // X.C59616NaW, android.webkit.WebView, X.NZR
    public final void loadUrl(String url) {
        String LIZLLL = C59312NPo.LIZ.LIZLLL(this, url);
        if (!TextUtils.isEmpty(LIZLLL)) {
            url = LIZLLL;
        }
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
            C59580NZw c59580NZw = this.LJLILLLLZI;
            if (c59580NZw != null) {
                c59580NZw.LJLJL = c40705FyH;
            }
        }
        if (isAd(url)) {
            super.clearHistory();
        }
        super.loadUrl(beforeLoadUrl(url));
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
                    this.LJLJL = (AdSeperatedWebView$DisableInterceptRegion[]) GsonProtectorUtils.fromJson(getGson(), LJJIJ2, AdSeperatedWebView$DisableInterceptRegion[].class);
                    return;
                } catch (com.google.gson.s unused) {
                    this.LJLJL = null;
                    return;
                }
            }
            this.LJLJL = null;
        }
    }

    @Override // X.NZR
    public final void onReceivedTitle(InterfaceC88472Yns<? super String, C76800UCe> interfaceC88472Yns) {
        AdSeperatedWebChromeClient adSeperatedWebChromeClient;
        List<InterfaceC59820Ndo> list;
        C59618NaY c59618NaY;
        this.LLIIIJ = interfaceC88472Yns;
        this.LLIIIILZ = new C59618NaY(this, interfaceC88472Yns);
        if (Build.VERSION.SDK_INT >= 26) {
            WebChromeClient webChromeClient = getWebChromeClient();
            if ((webChromeClient instanceof AdSeperatedWebChromeClient) && (adSeperatedWebChromeClient = (AdSeperatedWebChromeClient) webChromeClient) != null && (list = adSeperatedWebChromeClient.LJ) != null && (c59618NaY = this.LLIIIILZ) != null) {
                c59618NaY.LJ = list;
            }
        }
        setWebChromeClient(this.LLIIIILZ);
    }

    @Override // X.C59616NaW, android.webkit.WebView, android.view.View
    public final boolean onTouchEvent(MotionEvent event) {
        boolean z;
        C59314NPq crossPlatformParams;
        C59273NOb c59273NOb;
        o.LJIIIZ(event, "event");
        InterfaceC59561NZd interfaceC59561NZd = this.LJLJJI;
        if (interfaceC59561NZd != null && (crossPlatformParams = interfaceC59561NZd.getCrossPlatformParams()) != null && (c59273NOb = crossPlatformParams.LIZIZ) != null && c59273NOb.LIZ > 0 && C35730E0o.LIZ() && c59273NOb.LJJJLL == 0) {
            requestDisallowInterceptTouchEvent(true);
        }
        if (event.getActionMasked() == 0) {
            this.LLFII = false;
            getLocationInWindow(new int[2]);
            int LJJJJI = C17N.LJJJJI(event.getRawX() - r2[0]);
            int LJJJJI2 = C17N.LJJJJI(event.getRawY() - r2[1]);
            AdSeperatedWebView$DisableInterceptRegion[] adSeperatedWebView$DisableInterceptRegionArr = this.LJLJL;
            if (adSeperatedWebView$DisableInterceptRegionArr != null) {
                for (AdSeperatedWebView$DisableInterceptRegion adSeperatedWebView$DisableInterceptRegion : adSeperatedWebView$DisableInterceptRegionArr) {
                    double d = LJJJJI;
                    double d2 = adSeperatedWebView$DisableInterceptRegion.x;
                    if (d >= d2 && d <= d2 + adSeperatedWebView$DisableInterceptRegion.width) {
                        double d3 = LJJJJI2;
                        double d4 = adSeperatedWebView$DisableInterceptRegion.y;
                        if (d3 >= d4 && d3 <= d4 + adSeperatedWebView$DisableInterceptRegion.height) {
                            z = true;
                            break;
                        }
                    }
                }
            }
            z = false;
            this.LLFII = z;
        }
        if (this.LLFII) {
            requestDisallowInterceptTouchEvent(true);
        }
        if (this.canTouch) {
            getLastClickDetector().onTouchEvent(event);
            View.OnTouchListener onTouchListener = this.LJLJLJ;
            if (onTouchListener != null) {
                onTouchListener.onTouch(this, event);
            }
        }
        if (this.LLFF) {
            if (this.LLFFF) {
                requestDisallowInterceptTouchEvent(true);
            } else if (event.getAction() == 2) {
                return true;
            }
            return super.onTouchEvent(event);
        }
        return super.onTouchEvent(event);
    }

    @Override // X.NZR
    public final void prefetchH5(String str) {
        C36992EfU c36992EfU = C36992EfU.LIZ;
        C38113ExZ jsBridge2 = getJsBridge2();
        c36992EfU.getClass();
        C36992EfU.LIZJ(jsBridge2, str);
    }

    @Override // X.NZR
    public final void removeOnSingleWebViewStatus(NZX onSingleWebViewStatus) {
        o.LJIIIZ(onSingleWebViewStatus, "onSingleWebViewStatus");
        C59580NZw c59580NZw = this.LJLILLLLZI;
        if (c59580NZw != null) {
            ((ArrayList) c59580NZw.LJLILLLLZI).remove(onSingleWebViewStatus);
        }
    }

    @Override // X.NZR
    public void setAdditionalReportParams(boolean z) {
        this.LJZL = Boolean.valueOf(z);
        if (!z) {
            return;
        }
        this.LJZI = C0JU.LIZ("container_launch_type", "preload");
    }

    public final void setBaseJsMessageHandler(AbstractC38279F0p abstractC38279F0p) {
        o.LJIIIZ(abstractC38279F0p, "<set-?>");
        this.LJLJJLL = abstractC38279F0p;
    }

    @Override // X.NZR
    public void setBusinessEnablePopup(boolean z) {
        AdSeperatedWebChromeClient adSeperatedWebChromeClient = this.LJLJJL;
        if (adSeperatedWebChromeClient == null) {
            return;
        }
        adSeperatedWebChromeClient.LIZ = z;
    }

    @Override // X.NZR
    public void setCanScrollVertically(boolean z) {
        this.LLFFF = z;
    }

    @Override // X.C59616NaW, X.NZR
    public void setCanTouch(boolean z) {
        this.LLIFFJFJJ = Boolean.valueOf(z);
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
            this.LJLJJI = interfaceC59561NZd;
            C78253UnR LIZLLL = LegacyCommercializeServiceImpl.LJIIJ().LIZLLL();
            IAwemeService LIZ = AwemeService.LIZ();
            InterfaceC59561NZd interfaceC59561NZd2 = this.LJLJJI;
            if (interfaceC59561NZd2 != null && (crossPlatformParams3 = interfaceC59561NZd2.getCrossPlatformParams()) != null && (c59273NOb3 = crossPlatformParams3.LIZIZ) != null) {
                str = Long.valueOf(c59273NOb3.LIZ).toString();
            } else {
                str = null;
            }
            Aweme m6 = LIZ.m6(str);
            LIZLLL.getClass();
            this.LLD = C59252NNg.LJI(m6);
            AdSeperatedWebChromeClient adSeperatedWebChromeClient = this.LJLJJL;
            if (adSeperatedWebChromeClient != null) {
                adSeperatedWebChromeClient.LIZLLL = interfaceC59561NZd;
            }
            C59580NZw c59580NZw = this.LJLILLLLZI;
            if (c59580NZw != null) {
                c59580NZw.LJLJLLL = interfaceC59561NZd;
                NTL crossPlatformBusiness = interfaceC59561NZd.getCrossPlatformBusiness();
                if (crossPlatformBusiness != null && (adWebStatBusiness = (AdWebStatBusiness) ((C59484NWe) crossPlatformBusiness).LIZ(AdWebStatBusiness.class)) != null) {
                    NJC njc = c59580NZw.LJLJJLL;
                    if (njc != null) {
                        adWebStatBusiness.LJI = njc;
                    } else {
                        o.LJIJI("webviewInterceptor");
                        throw null;
                    }
                }
                InterfaceC59561NZd interfaceC59561NZd3 = c59580NZw.LJLJLLL;
                if (interfaceC59561NZd3 != null && (crossPlatformParams2 = interfaceC59561NZd3.getCrossPlatformParams()) != null && (c59273NOb2 = crossPlatformParams2.LIZIZ) != null) {
                    NJC njc2 = c59580NZw.LJLJJLL;
                    if (njc2 != null) {
                        njc2.LJI(c59273NOb2);
                    } else {
                        o.LJIJI("webviewInterceptor");
                        throw null;
                    }
                }
                PassBackWebInfoBusiness LIZIZ = c59580NZw.LIZIZ();
                if (LIZIZ != null) {
                    InterfaceC59561NZd interfaceC59561NZd4 = c59580NZw.LJLJLLL;
                    if (interfaceC59561NZd4 != null && (crossPlatformParams = interfaceC59561NZd4.getCrossPlatformParams()) != null) {
                        c59273NOb = crossPlatformParams.LIZIZ;
                    } else {
                        c59273NOb = null;
                    }
                    LIZIZ.LJ(c59273NOb);
                }
            }
            ((C38287F0x) this.LJLJJLL).LJLIL = interfaceC59561NZd;
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
                AbstractC38279F0p abstractC38279F0p = this.LJLJJLL;
                C59273NOb c59273NOb4 = crossPlatformParams4.LIZIZ;
                abstractC38279F0p.setAdInfo(c59273NOb4.LIZ, c59273NOb4.LIZIZ, c59273NOb4.LIZJ, c59273NOb4.LJIIIIZZ, c59273NOb4.LJ, c59273NOb4.LJJIJIIJIL, c59273NOb4.LJJIJIL, c59273NOb4.LJJJJJ);
                AbstractC38279F0p abstractC38279F0p2 = this.LJLJJLL;
                C59310NPm c59310NPm = crossPlatformParams4.LJ;
                abstractC38279F0p2.setAdInfoFromAweme(c59310NPm.LIZ, c59310NPm.LIZIZ, c59310NPm.LIZJ, c59310NPm.LIZLLL, c59310NPm.LJ, c59310NPm.LJFF, c59310NPm.LJI);
                AbstractC38279F0p abstractC38279F0p3 = this.LJLJJLL;
                String str2 = crossPlatformParams4.LIZ.LJ;
                if (str2 != null && (LJJIZ = C38350F3i.LJJIZ(str2)) != null) {
                    j = LJJIZ.longValue();
                } else {
                    j = 0;
                }
                abstractC38279F0p3.setGroupId(j);
                this.LJLJJLL.setPackageName(crossPlatformParams4.LIZIZ.LJI);
                this.LJLJJLL.setAppName(crossPlatformParams4.LIZIZ.LJFF);
                if (crossPlatformParams4.LIZ.LJIIJJI) {
                    super.setLayerType(1, null);
                }
            }
        }
    }

    @Override // X.NZR
    public void setCrossPlatformActivityContainerInChrome(InterfaceC59561NZd interfaceC59561NZd) {
        this.LLF = interfaceC59561NZd;
        C59618NaY c59618NaY = this.LLIIIILZ;
        if (c59618NaY == null) {
            return;
        }
        c59618NaY.LIZLLL = interfaceC59561NZd;
    }

    public final void setCurUrl(String str) {
        this.LJLLJ = str;
    }

    @Override // X.C59616NaW, android.webkit.WebView, X.NZR
    public void setDownloadListener(DownloadListener downloadListener) {
        this.LLI = downloadListener;
        super.setDownloadListener(downloadListener);
    }

    @Override // X.NZR
    public void setEnableScrollControl(boolean z) {
        this.LLFF = z;
    }

    public final void setICrossPlatformActivityContainer(InterfaceC59561NZd interfaceC59561NZd) {
        this.LJLJJI = interfaceC59561NZd;
    }

    public final void setICrossPlatformActivityContainerInChrome(InterfaceC59561NZd interfaceC59561NZd) {
        this.LLF = interfaceC59561NZd;
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
        this.LJLZ = c59866NeY;
    }

    public final void setMonitorSessionCreatedBySelf(boolean z) {
        this.LJZ = z;
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
        C59580NZw c59580NZw = this.LJLILLLLZI;
        if (c59580NZw == null) {
            return;
        }
        c59580NZw.LJLJI = interceptor;
    }

    @Override // X.NZR
    public void setSingleWebViewStatusListeners(List<NZX> list) {
        C59580NZw c59580NZw;
        List<NZX> list2;
        if (list == null || list.isEmpty() || (c59580NZw = this.LJLILLLLZI) == null || (list2 = c59580NZw.LJLILLLLZI) == null) {
            return;
        }
        ((ArrayList) list2).addAll(list);
    }

    public final void setTitleCallback(InterfaceC88472Yns<? super String, C76800UCe> interfaceC88472Yns) {
        this.LLIIIJ = interfaceC88472Yns;
    }

    @Override // X.NZR
    public void setTouchListener(View.OnTouchListener onTouchListener) {
        this.LJLJLJ = onTouchListener;
    }

    public final void setUseSandbox(boolean z) {
        this.LJLL = z;
    }

    @Override // X.NZR
    public void setUserAgentString(String str) {
        C16880lQ.LLZL(getSettings(), str);
    }

    @Override // X.NZR
    public void setWebScrollListener(InterfaceC59637Nar interfaceC59637Nar) {
        if (interfaceC59637Nar != null) {
            this.LLFZ.add(interfaceC59637Nar);
        }
    }

    @Override // X.NZR
    public void setWebScrollListeners(ArrayList<InterfaceC59637Nar> arrayList) {
        if (arrayList != null) {
            this.LLFZ.addAll(arrayList);
        }
    }

    @Override // X.NZR
    public void setWebViewChangeListener(InterfaceC59568NZk listener) {
        o.LJIIIZ(listener, "listener");
        this.LLIIIL = listener;
        C59580NZw c59580NZw = this.LJLILLLLZI;
        if (c59580NZw != null) {
            c59580NZw.LJLJJI = listener;
        }
    }

    @Override // X.NZR
    public final void addJavascriptInterfaceOut(Object obj, String str) {
        this.LLII = obj;
        this.LLIIII = str;
        addJavascriptInterface(obj, str);
    }

    @Override // android.webkit.WebView, X.NZR
    public final void evaluateJavascript(String script, ValueCallback<String> valueCallback) {
        o.LJIIIZ(script, "script");
        super.evaluateJavascript(script, valueCallback);
    }

    @Override // X.C59616NaW, android.webkit.WebView, X.NZR
    public final void loadUrl(String url, java.util.Map additionalHttpHeaders) {
        String LIZLLL = C59312NPo.LIZ.LIZLLL(this, url);
        if (!TextUtils.isEmpty(LIZLLL)) {
            url = LIZLLL;
        }
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
            C59580NZw c59580NZw = this.LJLILLLLZI;
            if (c59580NZw != null) {
                c59580NZw.LJLJL = c40705FyH;
            }
        }
        if (isAd(url)) {
            super.clearHistory();
        }
        super.loadUrl(beforeLoadUrl(url), additionalHttpHeaders);
    }

    public final void reportOnJsbInvoke(String str, EnumC38166EyQ enumC38166EyQ) {
        C59866NeY c59866NeY;
        InterfaceC59585Na1 interfaceC59585Na1;
        if (isAllowJsbMonitor() && (c59866NeY = this.LJLZ) != null && (interfaceC59585Na1 = (InterfaceC59585Na1) c59866NeY.LJJIJIIJI(InterfaceC59585Na1.class)) != null) {
            JSONObject LIZJ = C65232Piu.LIZJ("bridge_name", str);
            int i = C38167EyR.LIZ[enumC38166EyQ.ordinal()];
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
    public final void sendEventToWebView(String str, JSONObject jSONObject) {
        InterfaceC59585Na1 interfaceC59585Na1;
        JSONObject jSONObject2;
        C59866NeY c59866NeY = this.LJLZ;
        if (c59866NeY != null && (interfaceC59585Na1 = (InterfaceC59585Na1) c59866NeY.LJJIJIIJI(InterfaceC59585Na1.class)) != null) {
            if (jSONObject != null) {
                jSONObject2 = jSONObject.put("event_name", str);
            } else {
                jSONObject2 = null;
            }
            interfaceC59585Na1.LJIILJJIL("hybrid_app_monitor_send_event_to_webview", "send_event_to_webview", jSONObject2, null, null);
        }
        this.LJLJJLL.sendEventMsg(str, jSONObject);
    }

    @Override // android.webkit.WebView, android.view.View, X.NZR
    public final void setLayerType(int i, Paint paint) {
        super.setLayerType(i, paint);
    }

    public final boolean shouldChangeWebView(String str, java.util.Map<String, String> map) {
        C59314NPq crossPlatformParams;
        C59308NPk c59308NPk;
        String lowerCase = str.toLowerCase(Locale.ROOT);
        o.LJIIIIZZ(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        if (ujb.o.LJJJLIIL(lowerCase, "http", false)) {
            boolean LIZIZ = NZS.LIZIZ(this.LJLJJI, str, this.LLIIIL, false, map, Boolean.FALSE, true);
            InterfaceC59561NZd interfaceC59561NZd = this.LJLJJI;
            if (interfaceC59561NZd != null && (crossPlatformParams = interfaceC59561NZd.getCrossPlatformParams()) != null && (c59308NPk = crossPlatformParams.LIZ) != null) {
                c59308NPk.LJIIZILJ = false;
            }
            if (LIZIZ) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C59612NaS(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        boolean z;
        a1.LJFF(context, "context");
        this.LJLJI = new F0E();
        this.LJLJJLL = C58132Mrg.LIZ(context);
        this.LJLJLLL = C221108m2.LIZIZ(C59632Nam.LJLIL);
        new LinkedHashSet();
        this.LJLLLL = C221108m2.LIZ(EnumC221088m0.NONE, new AqS160S0100000_10(this, 158));
        setTag(R.id.ni5, new C37039EgF(EnumC37040EgG.THIRD, 2));
        this.LL = C221108m2.LIZIZ(new AqS157S0200000_10(context, this, 11));
        C59591Na7.LIZ().LJIJJLI(this);
        C61038NxS.LJIILIIL = SystemClock.uptimeMillis();
        F0E f0e = this.LJLJI;
        f0e.LIZIZ(AbsActivityContainer.class, new C59620Naa(this));
        f0e.LIZIZ(NWV.class, new C59624Nae(this));
        f0e.LIZIZ(C59866NeY.class, new F1P(this));
        this.LJLILLLLZI = new C59580NZw();
        addOnSingleWebViewStatus(new C59752Nci(this));
        C59580NZw c59580NZw = this.LJLILLLLZI;
        o.LJI(c59580NZw);
        C16880lQ.LLZLLIL(this, c59580NZw);
        AdSeperatedWebChromeClient adSeperatedWebChromeClient = new AdSeperatedWebChromeClient(this);
        this.LJLJJL = adSeperatedWebChromeClient;
        adSeperatedWebChromeClient.LIZJ = this.LJLJJLL;
        setWebChromeClient(adSeperatedWebChromeClient);
        FFL.LJIIIZ().getClass();
        if (FFL.LJIIJ(31744, 1, "use_injection_jsb", false) == 1) {
            z = true;
        } else {
            z = false;
        }
        C38150EyA LIZ = C38156EyG.LIZ(this);
        AdSeperatedWebChromeClient adSeperatedWebChromeClient2 = this.LJLJJL;
        o.LJI(adSeperatedWebChromeClient2);
        LIZ.LIZJ = adSeperatedWebChromeClient2;
        C59580NZw c59580NZw2 = this.LJLILLLLZI;
        o.LJI(c59580NZw2);
        LIZ.LIZIZ = c59580NZw2;
        AbstractC38279F0p jsMessageHandler = this.LJLJJLL;
        o.LJIIIZ(jsMessageHandler, "jsMessageHandler");
        LIZ.LIZLLL = jsMessageHandler;
        LIZ.LJIIJ = this.LJLJI;
        LIZ.LJIIIIZZ = false;
        LIZ.LJFF = z;
        C38150EyA.LIZIZ(LIZ, null, new AqS192S0100000_10(this, 9), new IDqS435S0100000_10(this, 1), 3);
        this.LJLIL = LIZ;
        this.LJLJJLL.setIesJsBridgeIn3WV(LIZ, this.LJLJI);
        C59580NZw c59580NZw3 = this.LJLILLLLZI;
        o.LJI(c59580NZw3);
        c59580NZw3.LJLIL = this.LJLIL.LJ;
        initConfig();
        addOnAttachStateChangeListener(new IDCListenerS244S0100000_6(this, 1));
        if (FetchBridgeSettings.LIZ().enable) {
            C38049EwX c38049EwX = this.LJLIL.LJ;
            if (c38049EwX != null) {
                c38049EwX.LJIIIZ = C38179Eyd.LIZ;
            }
            if (FetchBridgeSettings.LIZ().enableChangeUa) {
                C16880lQ.LLZL(getSettings(), getSettings().getUserAgentString() + " bridge_fetch/1");
            }
            this.LJLL = true;
        }
        this.LLFFF = true;
        this.LLFZ = new ArrayList<>();
        if (C52300Kfo.LIZ()) {
            WebSettings settings = getSettings();
            String userAgentString = settings.getUserAgentString();
            if (!userAgentString.contains(" BytedanceWebview/d8a21c6")) {
                C16880lQ.LLZL(settings, userAgentString.concat(" BytedanceWebview/d8a21c6"));
            }
        }
    }

    public final void reportOnJsbReject(String str, EnumC38166EyQ enumC38166EyQ, int i) {
        C59866NeY c59866NeY;
        InterfaceC59585Na1 interfaceC59585Na1;
        if (isAllowJsbMonitor() && (c59866NeY = this.LJLZ) != null && (interfaceC59585Na1 = (InterfaceC59585Na1) c59866NeY.LJJIJIIJI(InterfaceC59585Na1.class)) != null) {
            JSONObject LIZJ = C65232Piu.LIZJ("bridge_name", str);
            int i2 = C38167EyR.LIZ[enumC38166EyQ.ordinal()];
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

    public /* synthetic */ C59612NaS(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }

    @Override // android.webkit.WebView, android.view.View
    public final void onOverScrolled(int i, int i2, boolean z, boolean z2) {
        C59314NPq crossPlatformParams;
        C59273NOb c59273NOb;
        InterfaceC59561NZd interfaceC59561NZd = this.LJLJJI;
        if (interfaceC59561NZd != null && (crossPlatformParams = interfaceC59561NZd.getCrossPlatformParams()) != null && (c59273NOb = crossPlatformParams.LIZIZ) != null && c59273NOb.LIZ > 0 && C35730E0o.LIZ() && c59273NOb.LJJJLL == 0 && (z || z2)) {
            requestDisallowInterceptTouchEvent(false);
        }
        super.onOverScrolled(i, i2, z, z2);
    }

    @Override // android.webkit.WebView, android.view.View
    public final void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        Iterator<InterfaceC59637Nar> it = this.LLFZ.iterator();
        while (it.hasNext()) {
            it.next().onScrollChanged(i, i2, i3, i4);
        }
    }
}
