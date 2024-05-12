package X;

import X.C06490Nh;
import X.C09900aA;
import X.C109434Rf;
import X.C16880lQ;
import X.C34175Db9;
import X.C37891Etz;
import X.C47135Ieh;
import X.C58283Mu7;
import X.C59273NOb;
import X.C59313NPp;
import X.C59314NPq;
import X.C59484NWe;
import X.C61326O5a;
import X.C73305Spp;
import X.F3V;
import X.F46;
import X.FMX;
import X.InterfaceC59561NZd;
import X.NK2;
import X.NTL;
import X.NZQ;
import X.NZU;
import X.NZX;
import X.NZZ;
import X.X1D;
import Y.AObjectS43S1200000_10;
import Y.AObjectS45S0101000_13;
import Y.AObjectS83S0300000_10;
import Y.ARunnableS25S0200000_6;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Bitmap;
import android.net.Uri;
import android.net.http.SslCertificate;
import android.net.http.SslError;
import android.os.Build;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.SslErrorHandler;
import android.webkit.WebBackForwardList;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.widget.FrameLayout;
import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.aweme.ad.preload.AdLandPagePreloadServiceImpl;
import com.ss.android.ugc.aweme.ad.preload.IAdLandPagePreloadService;
import com.ss.android.ugc.aweme.ad.prerender.IPreRenderLandPageModule;
import com.ss.android.ugc.aweme.ad.prerender.PreRenderWebViewManager;
import com.ss.android.ugc.aweme.crossplatform.activity.CrossPlatformActivity;
import com.ss.android.ugc.aweme.crossplatform.business.AdWebStatBusiness;
import com.ss.android.ugc.aweme.crossplatform.business.XpathBusiness;
import com.ss.android.ugc.aweme.log.AdWebLogModel;
import com.ss.android.ugc.bytex.pthread.base.proxy.PthreadTimer;
import com.zhiliaoapp.musically.R;
import java.lang.ref.Reference;
import java.util.ArrayList;
import java.util.HashSet;
import kotlin.jvm.internal.AqS160S0100000_10;
import kotlin.jvm.internal.o;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;
import org.json.JSONException;
import org.json.JSONObject;
import ujb.s;

/* loaded from: classes11.dex */
public class NZQ extends FrameLayout implements NZC, InterfaceC59566NZi {
    public static final /* synthetic */ int LLIIIILZ = 0;
    public final NZV LJLIL;
    public C50948Jz6 LJLILLLLZI;
    public final C59563NZf LJLJI;
    public boolean LJLJJI;
    public final C62822Ol8 LJLJJL;
    public boolean LJLJJLL;
    public C59615NaV LJLJL;
    public final NZT LJLJLJ;
    public final boolean LJLJLLL;
    public PthreadTimer LJLL;
    public View.OnTouchListener LJLLI;
    public InterfaceC59637Nar LJLLILLLL;
    public boolean LJLLJ;
    public final java.util.Set<Object> LJLLL;
    public final NZY LJLLLL;
    public NZO LJLLLLLL;
    public int LJLZ;
    public boolean LJZ;
    public NZX LJZI;
    public final String LJZL;
    public InterfaceC59561NZd LL;
    public C59866NeY LLD;
    public boolean LLF;
    public C59484NWe LLFF;
    public String LLFFF;
    public int LLFII;
    public int LLFZ;
    public boolean LLI;
    public long LLIFFJFJJ;
    public boolean LLII;
    public final java.util.Map<Integer, View> LLIIII;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public NZQ(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
        o.LJIIIZ(context, "context");
    }

    public View LJFF(int i) {
        java.util.Map<Integer, View> map = this.LLIIII;
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

    @Override // X.NZC
    public final void LJIIIIZZ() {
        this.LLI = true;
    }

    public final Throwable getError() {
        return null;
    }

    private final C59612NaS getAdSeperatedWebView() {
        C59612NaS poll;
        int i = 0;
        int i2 = 6;
        AttributeSet attributeSet = null;
        if (C58612Rt.LIZ && this.LJLJLLL) {
            C54353LUv LIZLLL = C54353LUv.LIZLLL();
            if (LIZLLL.LIZIZ.size() <= 0 || (poll = LIZLLL.LIZIZ.poll()) == null) {
                Context context = getContext();
                o.LJIIIIZZ(context, "context");
                return new C59612NaS(context, attributeSet, i2, i);
            }
            return poll;
        }
        Context context2 = getContext();
        o.LJIIIIZZ(context2, "context");
        return new C59612NaS(context2, attributeSet, i2, i);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [X.NaV, X.NZR] */
    private final View getCurrentContainer() {
        if (this.LJLZ != 1) {
            return null;
        }
        ?? r0 = this.LJLJL;
        if (r0 != 0) {
            return r0.getView();
        }
        o.LJIJI("iWebViewRuntime");
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final C59613NaT getSingleWebView() {
        C59613NaT poll;
        if (C58612Rt.LIZ && this.LJLJLLL) {
            C54352LUu LIZLLL = C54352LUu.LIZLLL();
            if (LIZLLL.LIZIZ.size() <= 0 || (poll = LIZLLL.LIZIZ.poll()) == null) {
                Context context = getContext();
                o.LJIIIIZZ(context, "context");
                return new C59613NaT(context, null, 0, 6, 0 == true ? 1 : 0);
            }
            return poll;
        }
        Context context2 = getContext();
        o.LJIIIIZZ(context2, "context");
        return new C59613NaT(context2, null, 0, 6, 0 == true ? 1 : 0);
    }

    private final C59570NZm getTimeStatisticsUtils() {
        return (C59570NZm) this.LJLJJL.getValue();
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [X.NaV, X.NZR] */
    /* JADX WARN: Type inference failed for: r1v1, types: [X.NaV, X.NZR] */
    /* JADX WARN: Type inference failed for: r1v2, types: [X.NaV, X.NZR] */
    public final void LJIILJJIL() {
        ?? r1 = this.LJLJL;
        if (r1 != 0) {
            r1.setWebViewChangeListener(new NZW(this));
            ?? r12 = this.LJLJL;
            if (r12 != 0) {
                r12.addOnSingleWebViewStatus(new NZX() { // from class: com.ss.android.ugc.aweme.crossplatform.view.CrossPlatformWebView$initWebView$1
                    public boolean LJLIL;

                    @Override // X.NZX
                    public final void LIZ(WebView webView, String str) {
                        C59314NPq crossPlatformParams;
                        C59313NPp c59313NPp;
                        String reactId;
                        NK2 nk2;
                        NTL crossPlatformBusiness;
                        XpathBusiness xpathBusiness;
                        NZX LJII;
                        NZQ.this.LJIILIIL("onPageFinished");
                        InterfaceC59561NZd interfaceC59561NZd = NZQ.this.LL;
                        if (interfaceC59561NZd != null && (LJII = interfaceC59561NZd.LJII()) != null) {
                            LJII.LIZ(webView, str);
                        }
                        NZX customWebViewStatus = NZQ.this.getCustomWebViewStatus();
                        if (customWebViewStatus != null) {
                            customWebViewStatus.LIZ(webView, str);
                        }
                        ((C73305Spp) NZQ.this.LJFF(R.id.g94)).setVisibility(8);
                        if (!this.LJLIL) {
                            ((C73305Spp) NZQ.this.LJFF(R.id.cyv)).setVisibility(8);
                            NZQ.this.LJIJJ("", 0, true, str);
                        }
                        NZQ nzq = NZQ.this;
                        nzq.LJZ = true;
                        nzq.getRegistry().LIZ(NZZ.LOAD_FINISH);
                        InterfaceC59561NZd interfaceC59561NZd2 = NZQ.this.LL;
                        if (interfaceC59561NZd2 != null && (crossPlatformBusiness = interfaceC59561NZd2.getCrossPlatformBusiness()) != null && (xpathBusiness = (XpathBusiness) ((C59484NWe) crossPlatformBusiness).LIZ(XpathBusiness.class)) != null) {
                            xpathBusiness.xpathDirect(NZQ.this.getCrossPlatformParams(), webView);
                        }
                        AdWebStatBusiness webStatBusiness = NZQ.this.getWebStatBusiness();
                        if (webStatBusiness != null && webStatBusiness.LIZJ() && AdWebStatBusiness.LIZLLL(str) && (nk2 = webStatBusiness.LJFF) != null) {
                            nk2.LJI(str, new AObjectS43S1200000_10(webStatBusiness, webView, str, 1), webView);
                        }
                        if (webView != null && (reactId = NZQ.this.getReactId()) != null) {
                            if (F46.LIZ("_jsmanage_tt_oldwebview_reactid")) {
                                webView.post(new ARunnableS25S0200000_6(new C37891Etz(reactId), webView, 29));
                            } else {
                                StringBuilder LIZJ = C06490Nh.LIZJ("javascript:(function () {    window.reactId = '", reactId, "';try {if (window.WJSIReport && window.WJSIReport.postMessage) {  var u = location.href;  window.WJSIReport.postMessage(    JSON.stringify({      eventName: 'js_inject_manage_old',      category: {        js_name: '_jsmanage_tt_oldwebview_reactid',        current_url: u,        type: 2,      },      metrics: {        totalDuration: Date.now() - ", System.currentTimeMillis());
                                LIZJ.append(",      },      url: u,    })  );}}catch(e){}})();");
                                C16880lQ.LLZZ(webView, X1D.LIZIZ(LIZJ));
                                JSONObject jSONObject = new JSONObject();
                                JSONObject LJ = C47135Ieh.LJ("js_name", "_jsmanage_tt_oldwebview_reactid", "current_url", str);
                                LJ.put("type", 1);
                                F3V.LIZ("js_inject_manage_old", str, jSONObject, LJ);
                            }
                        }
                        NZQ nzq2 = NZQ.this;
                        int i = !this.LJLIL ? 1 : 0;
                        if (!nzq2.LLII && (crossPlatformParams = nzq2.getCrossPlatformParams()) != null && (c59313NPp = crossPlatformParams.LIZLLL) != null && c59313NPp.LIZJ != null) {
                            C59314NPq crossPlatformParams2 = nzq2.getCrossPlatformParams();
                            o.LJI(crossPlatformParams2);
                            JSONObject jSONObject2 = new JSONObject(crossPlatformParams2.LIZLLL.LIZJ);
                            try {
                                jSONObject2.put("status", String.valueOf(i)).put("duration", System.currentTimeMillis() - CrossPlatformActivity.LJLL);
                            } catch (JSONException e) {
                                C16880lQ.LLLLIIL(e);
                            }
                            FMX.LJIILJJIL("request_anchor_detail", jSONObject2);
                            nzq2.LLII = true;
                        }
                        if (webView != null) {
                            NZQ.this.LJIJJLI(true, 0, "");
                        }
                    }

                    @Override // X.NZX
                    public final void onPageCommitVisible(WebView webView, String str) {
                        NZX customWebViewStatus = NZQ.this.getCustomWebViewStatus();
                        if (customWebViewStatus != null) {
                            customWebViewStatus.onPageCommitVisible(webView, str);
                        }
                    }

                    @Override // X.NZX
                    public final void LJ(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
                        boolean z;
                        String str;
                        Uri uri;
                        Boolean bool;
                        String path;
                        int i;
                        Uri url;
                        String path2;
                        CharSequence description;
                        NZX LJII;
                        Uri uri2;
                        Integer num;
                        CharSequence charSequence;
                        if (webResourceRequest != null && webResourceRequest.isForMainFrame()) {
                            z = true;
                        } else {
                            z = false;
                        }
                        Integer num2 = null;
                        if (z) {
                            StringBuilder LIZ = X1D.LIZ();
                            LIZ.append("onReceivedError url ");
                            if (webResourceRequest != null) {
                                uri2 = webResourceRequest.getUrl();
                            } else {
                                uri2 = null;
                            }
                            LIZ.append(uri2);
                            LIZ.append(" errorCode ");
                            if (webResourceError != null) {
                                num = Integer.valueOf(webResourceError.getErrorCode());
                            } else {
                                num = null;
                            }
                            LIZ.append(num);
                            LIZ.append(" description ");
                            if (webResourceError != null) {
                                charSequence = webResourceError.getDescription();
                            } else {
                                charSequence = null;
                            }
                            LIZ.append((Object) charSequence);
                            X1D.LIZIZ(LIZ);
                        }
                        NZQ.this.LJIILIIL("onReceivedError");
                        InterfaceC59561NZd interfaceC59561NZd = NZQ.this.LL;
                        if (interfaceC59561NZd != null && (LJII = interfaceC59561NZd.LJII()) != null) {
                            LJII.LJ(webView, webResourceRequest, webResourceError);
                        }
                        NZX customWebViewStatus = NZQ.this.getCustomWebViewStatus();
                        if (customWebViewStatus != null) {
                            customWebViewStatus.LJ(webView, webResourceRequest, webResourceError);
                        }
                        if (webResourceError != null && (description = webResourceError.getDescription()) != null) {
                            str = description.toString();
                        } else {
                            str = null;
                        }
                        if (webResourceRequest != null) {
                            uri = webResourceRequest.getUrl();
                        } else {
                            uri = null;
                        }
                        String valueOf = String.valueOf(uri);
                        if (webResourceRequest != null) {
                            bool = Boolean.valueOf(webResourceRequest.isForMainFrame());
                        } else {
                            bool = null;
                        }
                        if (o.LJ(bool, Boolean.TRUE)) {
                            if (webResourceRequest != null && (url = webResourceRequest.getUrl()) != null && (path2 = url.getPath()) != null && ujb.o.LJJJJ(path2, ".apk", false)) {
                                return;
                            }
                            this.LJLIL = true;
                            NZQ.this.LJJIIJ();
                            NZQ nzq = NZQ.this;
                            if (webResourceError != null) {
                                num2 = Integer.valueOf(webResourceError.getErrorCode());
                            }
                            nzq.LJIJJ(str, num2, false, valueOf);
                        } else if (o.LJ(bool, Boolean.FALSE)) {
                            Uri url2 = webResourceRequest.getUrl();
                            if (url2 != null && (path = url2.getPath()) != null && ujb.o.LJJJJ(path, "favicon.ico", false)) {
                                return;
                            }
                            JSONObject jSONObject = new JSONObject();
                            C109434Rf.LJIILJJIL(jSONObject, "host", webResourceRequest.getUrl().getHost());
                            C109434Rf.LJIILJJIL(jSONObject, "path", webResourceRequest.getUrl().getPath());
                            C109434Rf.LJIILJJIL(jSONObject, "statusCode", null);
                            C109434Rf.LJIILJJIL(jSONObject, "errorCode", Integer.valueOf(webResourceError.getErrorCode()));
                            C09900aA.LJIIJJI("aweme_webview_assets_error", 0, jSONObject);
                        }
                        int i2 = -1;
                        if (webResourceError != null) {
                            i = webResourceError.getErrorCode();
                        } else {
                            i = -1;
                        }
                        webStatBusinessOnReceivedError(webView, webResourceRequest, str, i);
                        if (webView != null) {
                            NZQ nzq2 = NZQ.this;
                            if (webResourceError != null) {
                                i2 = webResourceError.getErrorCode();
                            }
                            if (str == null) {
                                str = "";
                            }
                            nzq2.LJIJJLI(false, i2, str);
                        }
                    }

                    @Override // X.NZX
                    public final void LJIIL(WebView webView, String str, Bitmap bitmap) {
                        NK2 nk2;
                        NZX LJII;
                        InterfaceC59561NZd interfaceC59561NZd = NZQ.this.LL;
                        if (interfaceC59561NZd != null && (LJII = interfaceC59561NZd.LJII()) != null) {
                            LJII.LJIIL(webView, str, bitmap);
                        }
                        NZX customWebViewStatus = NZQ.this.getCustomWebViewStatus();
                        if (customWebViewStatus != null) {
                            customWebViewStatus.LJIIL(webView, str, bitmap);
                        }
                        int i = 0;
                        this.LJLIL = false;
                        NZQ nzq = NZQ.this;
                        nzq.LJZ = false;
                        nzq.getRegistry().LIZ(NZZ.LOAD_START);
                        NZQ nzq2 = NZQ.this;
                        if (nzq2.LJJIII() && !TextUtils.equals("about:blank", str)) {
                            ((C61326O5a) nzq2.LJFF(R.id.hju)).setProgress(0);
                            nzq2.LJFF(R.id.hju).setVisibility(0);
                            if (nzq2.LJLJJLL) {
                                nzq2.LJFF(R.id.aji).setVisibility(0);
                            }
                        }
                        AdWebStatBusiness webStatBusiness = NZQ.this.getWebStatBusiness();
                        if (webStatBusiness != null) {
                            C59273NOb c59273NOb = webStatBusiness.LIZIZ.LIZIZ;
                            if (webStatBusiness.LIZJ() && AdWebStatBusiness.LIZLLL(str) && (nk2 = webStatBusiness.LJFF) != null) {
                                nk2.LIZJ(str, new AObjectS45S0101000_13(3, webStatBusiness, 8));
                                C58283Mu7.LIZIZ.LIZ(str);
                            }
                            if (webStatBusiness.LJFF != null && webStatBusiness.LIZJ()) {
                                C59273NOb c59273NOb2 = webStatBusiness.LIZIZ.LIZIZ;
                                c59273NOb2.getClass();
                                o.LJIIIZ(str, "<set-?>");
                                c59273NOb2.LJJJLZIJ = str;
                                webStatBusiness.LIZIZ.LIZIZ.LJJJZ = webStatBusiness.LJFF.LJFF();
                            }
                            IAdLandPagePreloadService LJJI = AdLandPagePreloadServiceImpl.LJJI();
                            if (AdWebStatBusiness.LIZLLL(str) && !webStatBusiness.LJ) {
                                if (LJJI != null) {
                                    LJJI.LJI();
                                    if (TextUtils.isEmpty(c59273NOb.LJIILIIL)) {
                                        String.valueOf(c59273NOb.LIZ);
                                    }
                                }
                                webStatBusiness.LJ = true;
                            }
                        }
                        if (NZQ.this.LJJIII() && C34175Db9.LIZ() == 2) {
                            NZQ.this.getClass();
                            if (!TextUtils.equals("about:blank", str)) {
                                NZQ.this.LJJI();
                                NZQ.this.LJLL = new PthreadTimer("CrossPlatformWebView$initWebView$1");
                                StringBuilder LIZ = X1D.LIZ();
                                LIZ.append("new timer ");
                                PthreadTimer pthreadTimer = NZQ.this.LJLL;
                                if (pthreadTimer != null) {
                                    i = pthreadTimer.hashCode();
                                }
                                LIZ.append(i);
                                X1D.LIZIZ(LIZ);
                                PthreadTimer pthreadTimer2 = NZQ.this.LJLL;
                                if (pthreadTimer2 != null) {
                                    pthreadTimer2.schedule(new NZU(NZQ.this), 1000L, 1000L);
                                }
                            }
                        }
                    }

                    @Override // X.NZX
                    public final void LJIILIIL(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
                        String str;
                        int i;
                        NZX LJII;
                        String str2;
                        int i2;
                        StringBuilder LIZ = X1D.LIZ();
                        LIZ.append("onReceivedSslError url ");
                        String str3 = null;
                        if (webView != null) {
                            str = webView.getUrl();
                        } else {
                            str = null;
                        }
                        LIZ.append(str);
                        X1D.LIZIZ(LIZ);
                        AdWebStatBusiness webStatBusiness = NZQ.this.getWebStatBusiness();
                        if (webStatBusiness != null) {
                            if (webView != null) {
                                str2 = webView.getUrl();
                            } else {
                                str2 = null;
                            }
                            if (sslError != null) {
                                SslCertificate certificate = sslError.getCertificate();
                                if (certificate != null) {
                                    str3 = certificate.toString();
                                }
                                i2 = sslError.getPrimaryError();
                            } else {
                                i2 = 9999;
                            }
                            webStatBusiness.LJ(webView, i2, str2, str3);
                        }
                        InterfaceC59561NZd interfaceC59561NZd = NZQ.this.LL;
                        if (interfaceC59561NZd != null && (LJII = interfaceC59561NZd.LJII()) != null) {
                            LJII.LJIILIIL(webView, sslErrorHandler, sslError);
                        }
                        NZX customWebViewStatus = NZQ.this.getCustomWebViewStatus();
                        if (customWebViewStatus != null) {
                            customWebViewStatus.LJIILIIL(webView, sslErrorHandler, sslError);
                        }
                        NZQ.this.LJIILIIL("onReceivedSslError");
                        if (webView != null) {
                            NZQ nzq = NZQ.this;
                            if (sslError != null) {
                                i = sslError.getPrimaryError();
                            } else {
                                i = 5;
                            }
                            nzq.LJIJJLI(false, i, "onReceivedSslError");
                        }
                    }

                    @Override // X.NZX
                    public final void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
                        NZX LJII;
                        String str;
                        if (webResourceRequest != null && webResourceRequest.isForMainFrame()) {
                            StringBuilder LIZ = X1D.LIZ();
                            LIZ.append("onReceivedHttpError url ");
                            if (webView != null) {
                                str = webView.getUrl();
                            } else {
                                str = null;
                            }
                            LIZ.append(str);
                            LIZ.append(" error ");
                            LIZ.append(webResourceResponse);
                            X1D.LIZIZ(LIZ);
                        }
                        InterfaceC59561NZd interfaceC59561NZd = NZQ.this.LL;
                        if (interfaceC59561NZd != null && (LJII = interfaceC59561NZd.LJII()) != null) {
                            LJII.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
                        }
                        NZX customWebViewStatus = NZQ.this.getCustomWebViewStatus();
                        if (customWebViewStatus != null) {
                            customWebViewStatus.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
                        }
                        JSONObject jSONObject = new JSONObject();
                        C109434Rf.LJIILJJIL(jSONObject, "host", webResourceRequest.getUrl().getHost());
                        C109434Rf.LJIILJJIL(jSONObject, "path", webResourceRequest.getUrl().getPath());
                        C109434Rf.LJIILJJIL(jSONObject, "statusCode", Integer.valueOf(webResourceResponse.getStatusCode()));
                        C109434Rf.LJIILJJIL(jSONObject, "errorCode", 1001);
                        C09900aA.LJIIJJI("aweme_webview_assets_error", 0, jSONObject);
                        AdWebStatBusiness webStatBusiness = NZQ.this.getWebStatBusiness();
                        if (webStatBusiness != null) {
                            webStatBusiness.LJFF(webView, webResourceRequest, webResourceResponse.getReasonPhrase(), webResourceResponse.getStatusCode());
                        }
                        NZQ.this.LJIILIIL("onReceivedHttpError");
                        if (webView != null) {
                            NZQ.this.LJIJJLI(false, webResourceResponse.getStatusCode(), "onReceivedHttpError");
                        }
                    }

                    @Override // X.NZX
                    public final void LJFF(WebView webView, int i, String str, String str2) {
                        NZX LJII;
                        NZQ.this.LJIILIIL("onReceivedError");
                        if (Build.VERSION.SDK_INT >= 23) {
                            return;
                        }
                        AdWebStatBusiness webStatBusiness = NZQ.this.getWebStatBusiness();
                        if (webStatBusiness != null) {
                            webStatBusiness.LJ(webView, i, str2, str);
                        }
                        InterfaceC59561NZd interfaceC59561NZd = NZQ.this.LL;
                        if (interfaceC59561NZd != null && (LJII = interfaceC59561NZd.LJII()) != null) {
                            LJII.LJFF(webView, i, str, str2);
                        }
                        NZX customWebViewStatus = NZQ.this.getCustomWebViewStatus();
                        if (customWebViewStatus != null) {
                            customWebViewStatus.LJFF(webView, i, str, str2);
                        }
                        this.LJLIL = true;
                        NZQ.this.LJJIIJ();
                        NZQ.this.LJIJJ(str, Integer.valueOf(i), false, str2);
                        if (webView != null) {
                            NZQ nzq = NZQ.this;
                            if (str == null) {
                                str = "";
                            }
                            nzq.LJIJJLI(false, i, str);
                        }
                    }

                    @Override // X.NZX
                    public final boolean LJIILJJIL(WebView webView, String str, WebResourceRequest webResourceRequest, boolean z) {
                        Boolean bool;
                        StringBuilder LIZ = X1D.LIZ();
                        LIZ.append("shouldOverrideUrlLoading isRedirect ");
                        if (webResourceRequest != null) {
                            bool = Boolean.valueOf(webResourceRequest.isRedirect());
                        } else {
                            bool = null;
                        }
                        LIZ.append(bool);
                        LIZ.append(" url ");
                        LIZ.append(str);
                        X1D.LIZIZ(LIZ);
                        AdWebStatBusiness webStatBusiness = NZQ.this.getWebStatBusiness();
                        if (webStatBusiness != null) {
                            C59273NOb c59273NOb = webStatBusiness.LIZIZ.LIZIZ;
                            if (webStatBusiness.LIZJ() && AdWebStatBusiness.LIZLLL(str)) {
                                boolean z2 = !z;
                                if (webResourceRequest != null && Build.VERSION.SDK_INT >= 24) {
                                    z2 = webResourceRequest.isRedirect();
                                }
                                NK2 nk2 = webStatBusiness.LJFF;
                                if (nk2 != null) {
                                    nk2.LJII(str, z2, 0, new AObjectS83S0300000_10(webStatBusiness, c59273NOb, webView, 1), webView);
                                }
                            }
                        }
                        NZX customWebViewStatus = NZQ.this.getCustomWebViewStatus();
                        if (customWebViewStatus != null && customWebViewStatus.LJIILJJIL(webView, str, webResourceRequest, z)) {
                            return true;
                        }
                        return false;
                    }

                    public final void webStatBusinessOnReceivedError(WebView webView, WebResourceRequest webResourceRequest, String str, int i) {
                        AdWebStatBusiness webStatBusiness = NZQ.this.getWebStatBusiness();
                        if (webStatBusiness != null) {
                            webStatBusiness.LJFF(webView, webResourceRequest, str, i);
                        }
                    }
                });
                ?? r13 = this.LJLJL;
                if (r13 != 0) {
                    r13.addOnWebChromeStatus(new NZK(this));
                    ((C61326O5a) LJFF(R.id.hju)).setColor(C04330Ez.LIZIZ(getContext(), R.color.acl));
                    return;
                } else {
                    o.LJIJI("iWebViewRuntime");
                    throw null;
                }
            }
            o.LJIJI("iWebViewRuntime");
            throw null;
        }
        o.LJIJI("iWebViewRuntime");
        throw null;
    }

    public final void LJJI() {
        PthreadTimer pthreadTimer = this.LJLL;
        if (pthreadTimer != null) {
            pthreadTimer.cancel();
        }
        this.LJLL = null;
        this.LLFII = 0;
    }

    @Override // X.NZC
    public final boolean canGoBack() {
        if (this.LJLZ == 1 && this.LJLJLJ.LIZ()) {
            return true;
        }
        return false;
    }

    @Override // X.NZC
    public final boolean canGoForward() {
        if (this.LJLZ == 1) {
            C59615NaV c59615NaV = this.LJLJL;
            if (c59615NaV != null) {
                if (c59615NaV.canGoForward()) {
                    return true;
                }
            } else {
                o.LJIJI("iWebViewRuntime");
                throw null;
            }
        }
        return false;
    }

    @Override // X.InterfaceC59488NWi
    public NTL getCrossPlatformBusiness() {
        InterfaceC59561NZd interfaceC59561NZd = this.LL;
        if (interfaceC59561NZd != null) {
            NTL crossPlatformBusiness = interfaceC59561NZd.getCrossPlatformBusiness();
            o.LJIIIIZZ(crossPlatformBusiness, "iCrossPlatformActivityCo…r!!.crossPlatformBusiness");
            return crossPlatformBusiness;
        }
        if (this.LLFF == null) {
            this.LLFF = new C59484NWe(this);
        }
        C59484NWe c59484NWe = this.LLFF;
        o.LJI(c59484NWe);
        return c59484NWe;
    }

    @Override // X.InterfaceC59488NWi
    public C59314NPq getCrossPlatformParams() {
        InterfaceC59561NZd interfaceC59561NZd = this.LL;
        if (interfaceC59561NZd != null) {
            o.LJI(interfaceC59561NZd);
            return interfaceC59561NZd.getCrossPlatformParams();
        }
        return null;
    }

    @Override // X.NZC
    public String getCurrentUrl() {
        String str = this.LLFFF;
        if (str == null) {
            str = "";
        }
        if (s.LJJJLZIJ(str, "wallet/home", false)) {
            return this.LLFFF;
        }
        C59615NaV c59615NaV = this.LJLJL;
        if (c59615NaV != null) {
            String url = c59615NaV.getUrl();
            if (url == null) {
                return "";
            }
            return url;
        }
        o.LJIJI("iWebViewRuntime");
        throw null;
    }

    public String getReactId() {
        C59866NeY c59866NeY = this.LLD;
        if (c59866NeY != null) {
            return c59866NeY.LJJIJ();
        }
        return null;
    }

    @Override // X.NZC
    public WebBackForwardList getWebBackForwardList() {
        C59615NaV c59615NaV = this.LJLJL;
        if (c59615NaV != null) {
            return c59615NaV.copyBackForwardList();
        }
        o.LJIJI("iWebViewRuntime");
        throw null;
    }

    public final AdWebStatBusiness getWebStatBusiness() {
        NTL crossPlatformBusiness;
        InterfaceC59561NZd interfaceC59561NZd = this.LL;
        if (interfaceC59561NZd != null && (crossPlatformBusiness = interfaceC59561NZd.getCrossPlatformBusiness()) != null) {
            return (AdWebStatBusiness) ((C59484NWe) crossPlatformBusiness).LIZ(AdWebStatBusiness.class);
        }
        return null;
    }

    @Override // X.InterfaceC59488NWi
    public final void refresh() {
        C59615NaV c59615NaV = this.LJLJL;
        if (c59615NaV != null) {
            c59615NaV.reload();
        } else {
            o.LJIJI("iWebViewRuntime");
            throw null;
        }
    }

    public final boolean LJIIZILJ() {
        long j;
        C59273NOb c59273NOb;
        C59314NPq crossPlatformParams = getCrossPlatformParams();
        if (crossPlatformParams != null && (c59273NOb = crossPlatformParams.LIZIZ) != null) {
            j = c59273NOb.LIZ;
        } else {
            j = 0;
        }
        if (j <= 0 || C34175Db9.LIZ() == 99) {
            return false;
        }
        return true;
    }

    public final boolean LJJIII() {
        C59309NPl c59309NPl;
        if (LJIIZILJ()) {
            if (C34175Db9.LIZ() != 1 && C34175Db9.LIZ() != 2) {
                return false;
            }
            return true;
        }
        C59314NPq crossPlatformParams = getCrossPlatformParams();
        if (crossPlatformParams == null || (c59309NPl = crossPlatformParams.LIZJ) == null || !c59309NPl.LJJIII) {
            return false;
        }
        return true;
    }

    public final void LJJIIJ() {
        ((C73305Spp) LJFF(R.id.g94)).setVisibility(8);
        C73305Spp c73305Spp = (C73305Spp) LJFF(R.id.cyv);
        C73306Spq c73306Spq = new C73306Spq();
        C73312Spw.LJI(c73306Spq, new AqS160S0100000_10(this, 160));
        c73305Spp.setStatus(c73306Spq);
        ((C73305Spp) LJFF(R.id.cyv)).setVisibility(0);
    }

    public Activity getActivity() {
        Context context = getContext();
        o.LJIIIIZZ(context, "context");
        while (context instanceof ContextWrapper) {
            if (context instanceof Activity) {
                return (Activity) context;
            }
            context = ((ContextWrapper) context).getBaseContext();
            o.LJIIIIZZ(context, "context.baseContext");
        }
        return null;
    }

    public LayoutInflater getLayoutInflater() {
        return C16880lQ.LLZIL(getContext());
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00f5  */
    @Override // X.NZC
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean goBack() {
        /*
            Method dump skipped, instructions count: 256
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.NZQ.goBack():boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0021, code lost:
    
        if (r4 != null) goto L12;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0090  */
    /* JADX WARN: Type inference failed for: r0v16, types: [X.NaV, X.NZR] */
    @Override // X.NZC
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean goForward() {
        /*
            r7 = this;
            X.NPq r0 = r7.getCrossPlatformParams()
            boolean r0 = X.NWB.LIZIZ(r0)
            java.lang.String r6 = "iWebViewRuntime"
            r2 = 0
            if (r0 == 0) goto L64
            X.NPq r0 = r7.getCrossPlatformParams()
            if (r0 == 0) goto L94
            X.NOb r5 = r0.LIZIZ
            if (r5 == 0) goto L23
            long r0 = r5.LIZ
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            java.lang.String r4 = r0.toString()
            if (r4 != 0) goto L27
        L23:
            java.lang.String r4 = ""
            if (r5 == 0) goto L92
        L27:
            java.lang.String r3 = r5.LJIIIIZZ
        L29:
            java.lang.String r1 = "landing_ad"
            java.lang.String r0 = "forward"
            X.N0h r3 = X.C58704N2e.LJ(r1, r0, r4, r3, r2)
            if (r5 == 0) goto L90
            java.lang.String r1 = r5.LJJJLZIJ
        L35:
            java.lang.String r0 = "url"
            r3.LIZIZ(r1, r0)
            if (r5 == 0) goto L8e
            int r0 = r5.LJJJZ
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
        L42:
            java.lang.String r0 = "first_page"
            r3.LIZIZ(r1, r0)
            boolean r0 = r7.canGoForward()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            java.lang.String r0 = "is_enabled"
            r3.LIZIZ(r1, r0)
            X.NaV r0 = r7.LJLJL
            if (r0 == 0) goto La4
            java.lang.String r1 = r0.getForwardUrl()
            java.lang.String r0 = "forward_url"
            r3.LIZIZ(r1, r0)
            r3.LJI()
        L64:
            java.lang.StringBuilder r1 = X.X1D.LIZ()
            java.lang.String r0 = "canGoForward "
            r1.append(r0)
            X.NaV r0 = r7.LJLJL
            if (r0 == 0) goto La0
            boolean r0 = r0.canGoForward()
            r1.append(r0)
            X.X1D.LIZIZ(r1)
            X.NaV r0 = r7.LJLJL
            if (r0 == 0) goto L9c
            boolean r0 = r0.canGoForward()
            if (r0 == 0) goto L9a
            X.NaV r0 = r7.LJLJL
            if (r0 == 0) goto L96
            r0.goForward()
            r0 = 1
            return r0
        L8e:
            r1 = r2
            goto L42
        L90:
            r1 = r2
            goto L35
        L92:
            r3 = r2
            goto L29
        L94:
            r5 = r2
            goto L23
        L96:
            kotlin.jvm.internal.o.LJIJI(r6)
            throw r2
        L9a:
            r0 = 0
            return r0
        L9c:
            kotlin.jvm.internal.o.LJIJI(r6)
            throw r2
        La0:
            kotlin.jvm.internal.o.LJIJI(r6)
            throw r2
        La4:
            kotlin.jvm.internal.o.LJIJI(r6)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.NZQ.goForward():boolean");
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ((ArrayList) this.LJLIL.LIZ).clear();
    }

    @Override // X.InterfaceC59488NWi
    public final boolean LJIIJ() {
        return this.LJZ;
    }

    public final int getCurrentLoadingTime() {
        return this.LLFII;
    }

    public final int getCurrentMode() {
        return this.LJLZ;
    }

    public final NZX getCustomWebViewStatus() {
        return this.LJZI;
    }

    public final boolean getDisplayed() {
        return this.LJLJJI;
    }

    public final NZO getIFullScreen() {
        return this.LJLLLLLL;
    }

    public final String getLogTag() {
        return this.LJZL;
    }

    @Override // X.NZC
    public C59866NeY getMonitorSession() {
        return this.LLD;
    }

    public final int getProgress() {
        return this.LLFZ;
    }

    public final NZV getRegistry() {
        return this.LJLIL;
    }

    public final C50948Jz6 getSearchEnterParam() {
        return this.LJLILLLLZI;
    }

    public final boolean getShouldShowProgressBarBg() {
        return this.LJLJJLL;
    }

    @Override // X.NZC
    public NZV getViewStatusRegistry() {
        return this.LJLIL;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.NaV, X.NZR] */
    @Override // X.InterfaceC59566NZi
    public final void LIZ(NZR nzr) {
        ?? r0 = this.LJLJL;
        if (r0 != 0) {
            r0.getView().setFocusable(true);
        } else {
            o.LJIJI("iWebViewRuntime");
            throw null;
        }
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [X.NaV, X.NZR] */
    @Override // X.NZC
    public final void LIZIZ(Activity activity) {
        o.LJIIIZ(activity, "activity");
        C59565NZh.LIZ().LIZ(1, this.LLFFF, getCurrentContainer());
        LJJII("viewDisappeared", null);
        LJJII("invisible", null);
        ?? r0 = this.LJLJL;
        if (r0 != 0) {
            r0.contextPause();
            LJJ("onPause");
        } else {
            o.LJIJI("iWebViewRuntime");
            throw null;
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [X.NaV, X.NZR] */
    /* JADX WARN: Type inference failed for: r0v7, types: [X.NaV, X.NZR] */
    @Override // X.NZC
    public void LIZJ(Activity activity) {
        C59565NZh.LIZ().LIZ(2, this.LLFFF, getCurrentContainer());
        ?? r0 = this.LJLJL;
        if (r0 != 0) {
            r0.contextDestroy();
            LJJ("onDestroy");
            C59866NeY c59866NeY = this.LLD;
            if (c59866NeY != null && c59866NeY.LIZJ) {
                F0L.LIZ().LIZIZ(c59866NeY.LJJIJ());
            }
            EventBus.LIZJ().LJIJ(this);
            C59563NZf c59563NZf = this.LJLJI;
            NZQ nzq = c59563NZf.LIZ;
            nzq.getClass();
            ((HashSet) nzq.LJLLL).remove(c59563NZf);
            ?? r02 = this.LJLJL;
            if (r02 != 0) {
                r02.destroyPassBackWebInfoBusiness();
                return;
            } else {
                o.LJIJI("iWebViewRuntime");
                throw null;
            }
        }
        o.LJIJI("iWebViewRuntime");
        throw null;
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [X.NaV, X.NZR] */
    @Override // X.NZC
    public final void LIZLLL(Activity activity) {
        int i;
        o.LJIIIZ(activity, "activity");
        C59565NZh.LIZ().LIZJ(1, this.LLFFF, getCurrentContainer());
        LJJII("viewAppeared", null);
        JSONObject jSONObject = new JSONObject();
        if (this.LLI) {
            i = 2;
        } else {
            i = 0;
        }
        jSONObject.put("code", i);
        LJJII("visible", jSONObject);
        this.LLI = false;
        ?? r0 = this.LJLJL;
        if (r0 != 0) {
            r0.contextResume();
            LJJ("onResume");
        } else {
            o.LJIJI("iWebViewRuntime");
            throw null;
        }
    }

    /* JADX WARN: Type inference failed for: r0v11, types: [X.NaV, X.NZR] */
    /* JADX WARN: Type inference failed for: r0v13, types: [X.NaV, X.NZR] */
    /* JADX WARN: Type inference failed for: r0v15, types: [X.NaV, X.NZR] */
    /* JADX WARN: Type inference failed for: r0v5, types: [X.NaV, X.NZR] */
    /* JADX WARN: Type inference failed for: r0v9, types: [X.NaV, X.NZR] */
    @Override // X.InterfaceC59566NZi
    public final void LJ(NZR nzr) {
        nzr.getView().setVisibility(8);
        nzr.destroyPassBackWebInfoBusiness();
        ViewGroup viewGroup = (ViewGroup) LJFF(R.id.nig);
        View view = nzr.getView();
        if (C78996UzQ.LJJIIJZLJL(view)) {
            C78996UzQ.LJI();
        }
        viewGroup.removeView(view);
        nzr.destroy();
        int childCount = ((ViewGroup) LJFF(R.id.nig)).getChildCount();
        if (childCount < 1) {
            return;
        }
        int i = childCount - 1;
        while (true) {
            if (-1 >= i) {
                break;
            }
            if (((ViewGroup) LJFF(R.id.nig)).getChildAt(i) instanceof C59613NaT) {
                View childAt = ((ViewGroup) LJFF(R.id.nig)).getChildAt(i);
                o.LJII(childAt, "null cannot be cast to non-null type com.ss.android.ugc.aweme.crossplatform.platform.webview.SingleWebView");
                this.LJLJL = (C59615NaV) childAt;
                break;
            } else {
                if (((ViewGroup) LJFF(R.id.nig)).getChildAt(i) instanceof C59612NaS) {
                    View childAt2 = ((ViewGroup) LJFF(R.id.nig)).getChildAt(i);
                    o.LJII(childAt2, "null cannot be cast to non-null type com.ss.android.ugc.aweme.crossplatform.platform.adseperatedwebview.AdSeperatedWebView");
                    this.LJLJL = (C59615NaV) childAt2;
                    break;
                }
                i--;
            }
        }
        ?? r0 = this.LJLJL;
        if (r0 != 0) {
            r0.getView().setVisibility(0);
            C59615NaV c59615NaV = this.LJLJL;
            if (c59615NaV != null) {
                c59615NaV.onResume();
                C59615NaV c59615NaV2 = this.LJLJL;
                if (c59615NaV2 != null) {
                    c59615NaV2.reload();
                    ?? r02 = this.LJLJL;
                    if (r02 != 0) {
                        r02.getView().setFocusable(true);
                        ?? r03 = this.LJLJL;
                        if (r03 != 0) {
                            r03.getView().requestFocus();
                            ?? r04 = this.LJLJL;
                            if (r04 != 0) {
                                r04.getView().setEnabled(true);
                                ?? r05 = this.LJLJL;
                                if (r05 != 0) {
                                    r05.getView().setFocusableInTouchMode(true);
                                    return;
                                } else {
                                    o.LJIJI("iWebViewRuntime");
                                    throw null;
                                }
                            }
                            o.LJIJI("iWebViewRuntime");
                            throw null;
                        }
                        o.LJIJI("iWebViewRuntime");
                        throw null;
                    }
                    o.LJIJI("iWebViewRuntime");
                    throw null;
                }
                o.LJIJI("iWebViewRuntime");
                throw null;
            }
            o.LJIJI("iWebViewRuntime");
            throw null;
        }
        o.LJIJI("iWebViewRuntime");
        throw null;
    }

    @Override // X.NZC
    public final <T extends InterfaceC26281ATd> T LJI(Class<T> cls) {
        if (o.LJ(cls, NXI.class)) {
            NZY nzy = this.LJLLLL;
            o.LJII(nzy, "null cannot be cast to non-null type T of com.ss.android.ugc.aweme.crossplatform.view.CrossPlatformWebView.getViewWrap");
            return nzy;
        }
        return new C59567NZj();
    }

    public final void LJIILIIL(String str) {
        if (C34175Db9.LIZ() == 2) {
            LJJI();
        }
        ((C61326O5a) LJFF(R.id.hju)).setProgress(100);
        LJFF(R.id.hju).setVisibility(8);
        if (this.LJLJJLL) {
            LJFF(R.id.aji).setVisibility(8);
        }
    }

    public final void LJJ(String str) {
        String str2;
        C59308NPk c59308NPk;
        C59308NPk c59308NPk2;
        Integer num;
        C59314NPq crossPlatformParams = getCrossPlatformParams();
        String str3 = null;
        if (crossPlatformParams != null && (c59308NPk2 = crossPlatformParams.LIZ) != null && (num = c59308NPk2.LIZ) != null) {
            int intValue = num.intValue();
            if (intValue != 1) {
                if (intValue != 3) {
                    str2 = "unknown";
                } else {
                    str2 = "webview_back";
                }
            } else {
                str2 = "webview";
            }
        } else {
            str2 = null;
        }
        String str4 = this.LLFFF;
        if (str4 != null) {
            str3 = str4;
        } else {
            C59314NPq crossPlatformParams2 = getCrossPlatformParams();
            if (crossPlatformParams2 != null && (c59308NPk = crossPlatformParams2.LIZ) != null) {
                str3 = c59308NPk.LIZJ;
            }
        }
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("platform", str2);
        c188727au.LJIIIZ("status", str);
        c188727au.LJIIIZ("module_name", "null");
        c188727au.LJIIIZ("url", str3);
        FMX.LJIIL("crossplatform_view", c188727au.LIZ);
    }

    @Override // X.NZC
    public final void onCreate(Activity activity) {
        o.LJIIIZ(activity, "activity");
        LJJ("onCreate");
    }

    @QD3
    public final void onEvent(C40264FrA c40264FrA) {
        String str;
        Activity activity;
        if (c40264FrA == null || (str = c40264FrA.LJLIL) == null || str.length() == 0 || !ujb.o.LJJJJIZL(c40264FrA.LJLIL, getReactId(), true) || 1 == 0 || (activity = getActivity()) == null || !(!activity.isFinishing())) {
            return;
        }
        activity.finish();
    }

    @QD3(threadMode = ThreadMode.MAIN)
    public final void onJsBroadcastEvent(C56642Ke broadCastEvent) {
        o.LJIIIZ(broadCastEvent, "broadCastEvent");
        LJJII("notification", broadCastEvent.LJLIL);
    }

    public final void setAdditionalReportParams(boolean z) {
        this.LLF = z;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [X.NaV, X.NZR] */
    @Override // X.NZC
    public void setCrossPlatformActivityContainer(InterfaceC59561NZd iCrossPlatformActivityContainer) {
        o.LJIIIZ(iCrossPlatformActivityContainer, "iCrossPlatformActivityContainer");
        this.LL = iCrossPlatformActivityContainer;
        ?? r0 = this.LJLJL;
        if (r0 != 0) {
            r0.setCrossPlatformActivityContainer(iCrossPlatformActivityContainer);
        } else {
            o.LJIJI("iWebViewRuntime");
            throw null;
        }
    }

    public final void setCurrentLoadingTime(int i) {
        this.LLFII = i;
    }

    public final void setCurrentMode(int i) {
        this.LJLZ = i;
    }

    public final void setCustomWebViewStatus(NZX nzx) {
        this.LJZI = nzx;
    }

    public final void setDisplayed(boolean z) {
        this.LJLJJI = z;
    }

    @Override // X.NZC
    public void setFullScreen(NZO iFullScreen) {
        o.LJIIIZ(iFullScreen, "iFullScreen");
        this.LJLLLLLL = iFullScreen;
    }

    public final void setIFullScreen(NZO nzo) {
        this.LJLLLLLL = nzo;
    }

    public final void setProgress(int i) {
        this.LLFZ = i;
    }

    public final void setSearchEnterParam(C50948Jz6 c50948Jz6) {
        this.LJLILLLLZI = c50948Jz6;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [X.NaV, X.NZR] */
    public final void setShouldOverrideInterceptor(InterfaceC88471Ynr<? super WebView, ? super String, Boolean> interceptor) {
        o.LJIIIZ(interceptor, "interceptor");
        ?? r0 = this.LJLJL;
        if (r0 != 0) {
            r0.setShouldOverrideInterceptor(interceptor);
        } else {
            o.LJIJI("iWebViewRuntime");
            throw null;
        }
    }

    public final void setShouldShowProgressBarBg(boolean z) {
        this.LJLJJLL = z;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.NaV, X.NZR] */
    @Override // X.NZC
    public void setWebScrollListener(InterfaceC59637Nar interfaceC59637Nar) {
        this.LJLLILLLL = interfaceC59637Nar;
        ?? r0 = this.LJLJL;
        if (r0 != 0) {
            r0.setWebScrollListener(interfaceC59637Nar);
        } else {
            o.LJIJI("iWebViewRuntime");
            throw null;
        }
    }

    @Override // X.NZC
    public void setWebViewTouchListener(View.OnTouchListener onTouchListener) {
        this.LJLLI = onTouchListener;
        this.LJLLLL.LIZ().setTouchListener(onTouchListener);
    }

    /* JADX WARN: Code restructure failed: missing block: B:152:0x01a1, code lost:
    
        if (r3 != null) goto L94;
     */
    /* JADX WARN: Removed duplicated region for block: B:115:0x026e  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x029c  */
    /* JADX WARN: Type inference failed for: r0v35, types: [X.NaV, X.NZR] */
    /* JADX WARN: Type inference failed for: r0v5, types: [X.NaV, X.NZR] */
    /* JADX WARN: Type inference failed for: r0v55, types: [X.NaV, X.NZR] */
    /* JADX WARN: Type inference failed for: r0v57, types: [X.NaV, X.NZR] */
    /* JADX WARN: Type inference failed for: r0v59, types: [X.NaV, X.NZR] */
    /* JADX WARN: Type inference failed for: r0v7, types: [X.NaV, X.NZR] */
    /* JADX WARN: Type inference failed for: r0v77, types: [X.NaV, X.NZR] */
    /* JADX WARN: Type inference failed for: r1v7, types: [X.NaV, X.NZR] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void LJIIL(java.lang.String r14, java.util.Map<java.lang.String, java.lang.String> r15) {
        /*
            Method dump skipped, instructions count: 696
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.NZQ.LJIIL(java.lang.String, java.util.Map):void");
    }

    public void LJIJ(String str, boolean z) {
        String queryParameter;
        android.net.Uri parse = UriProtector.parse(str);
        if (o.LJ(parse.getScheme(), "http") || o.LJ(parse.getScheme(), "https")) {
            LJIJI(this, str, true, null, 12);
            return;
        }
        String queryParameter2 = UriProtector.getQueryParameter(parse, "url");
        if (queryParameter2 == null || queryParameter2.length() == 0 || (queryParameter = UriProtector.getQueryParameter(parse, "url")) == null) {
            return;
        }
        LJIJI(this, queryParameter, true, null, 12);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.NaV, X.NZR] */
    /* JADX WARN: Type inference failed for: r0v3, types: [X.NaV, X.NZR] */
    public final void LJJII(String str, JSONObject jSONObject) {
        ?? r0 = this.LJLJL;
        if (r0 != 0) {
            if (r0.getView().getVisibility() == 0) {
                ?? r02 = this.LJLJL;
                if (r02 != 0) {
                    r02.sendEventToWebView(str, jSONObject);
                    return;
                } else {
                    o.LJIJI("iWebViewRuntime");
                    throw null;
                }
            }
            return;
        }
        o.LJIJI("iWebViewRuntime");
        throw null;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v33, types: [X.NaV, X.NZR] */
    /* JADX WARN: Type inference failed for: r0v35, types: [X.NaV, X.NZR] */
    /* JADX WARN: Type inference failed for: r0v39, types: [X.NaV, X.NZR] */
    /* JADX WARN: Type inference failed for: r0v41, types: [X.NaV, X.NZR] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public NZQ(android.content.Context r11, android.util.AttributeSet r12, int r13) {
        /*
            Method dump skipped, instructions count: 379
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.NZQ.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    public final void LJIJJLI(boolean z, int i, String str) {
        InterfaceC59561NZd interfaceC59561NZd;
        C59314NPq crossPlatformParams;
        C59273NOb c59273NOb;
        String str2 = this.LLFFF;
        if ((str2 == null || !str2.equals("about:blank")) && (interfaceC59561NZd = this.LL) != null && (crossPlatformParams = interfaceC59561NZd.getCrossPlatformParams()) != null && (c59273NOb = crossPlatformParams.LIZIZ) != null) {
            IPreRenderLandPageModule LIZ = PreRenderWebViewManager.LIZ();
            String valueOf = String.valueOf(c59273NOb.LIZ);
            String str3 = this.LLFFF;
            if (str3 == null) {
                str3 = "";
            }
            LIZ.LLLLII(i, valueOf, str3, str, c59273NOb.LJJL, z);
        }
    }

    public final void LJJIFFI(JSONObject jSONObject, String str, Object obj) {
        if (C38354F3m.LJ(str) || obj == null) {
            return;
        }
        try {
            jSONObject.put(str, obj);
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
        }
    }

    public final void LJIJJ(String str, Integer num, boolean z, String str2) {
        long j;
        Long l;
        C59273NOb c59273NOb;
        C59273NOb c59273NOb2;
        JSONObject jSONObject = new JSONObject();
        LJJIFFI(jSONObject, "errorCode", num);
        if (!TextUtils.isEmpty(str)) {
            LJJIFFI(jSONObject, "errorDesc", str);
        }
        if (!TextUtils.isEmpty(str2)) {
            android.net.Uri parse = UriProtector.parse(str2);
            LJJIFFI(jSONObject, "url", str2);
            LJJIFFI(jSONObject, "host", parse.getHost());
            LJJIFFI(jSONObject, "path", parse.getPath());
            if (str2 != null && !ujb.o.LJJJLIIL(str2, "about:blank", false)) {
                JSONObject jSONObject2 = new JSONObject();
                try {
                    if (o.LJ(UriProtector.getQueryParameter(parse, "_enable_loading_duration_report"), "1")) {
                        if (!TextUtils.isEmpty(UriProtector.getQueryParameter(parse, "_project_name"))) {
                            LJJIFFI(jSONObject2, "project_name", UriProtector.getQueryParameter(parse, "_project_name"));
                        }
                        if (!TextUtils.isEmpty(UriProtector.getQueryParameter(parse, "_enter_from"))) {
                            LJJIFFI(jSONObject2, "enter_from", UriProtector.getQueryParameter(parse, "_enter_from"));
                        }
                        jSONObject2.put("duration", SystemClock.elapsedRealtime() - this.LLIFFJFJJ);
                        FMX.LJIILJJIL("client_loading_duration", jSONObject2);
                    }
                } catch (Exception unused) {
                }
            }
        }
        C59314NPq crossPlatformParams = getCrossPlatformParams();
        if (crossPlatformParams != null && (c59273NOb2 = crossPlatformParams.LIZIZ) != null) {
            j = c59273NOb2.LIZ;
        } else {
            j = 0;
        }
        if (j > 0) {
            C59314NPq crossPlatformParams2 = getCrossPlatformParams();
            if (crossPlatformParams2 != null && (c59273NOb = crossPlatformParams2.LIZIZ) != null) {
                l = Long.valueOf(c59273NOb.LIZ);
            } else {
                l = null;
            }
            LJJIFFI(jSONObject, "creativeId", l);
            if (z) {
                if (this.LLIFFJFJJ > 0) {
                    LJJIFFI(jSONObject, "duration", Long.valueOf(SystemClock.elapsedRealtime() - this.LLIFFJFJJ));
                }
            } else {
                C09900aA.LJIIJJI("aweme_ad_landingpage_open_error", 1, jSONObject);
            }
            C09900aA.LJIIJJI("aweme_ad_landingpage_open_error_rate", !z ? 1 : 0, jSONObject);
        }
        C09900aA.LJIIJJI("aweme_webview_open_error_rate", 1 ^ (z ? 1 : 0), jSONObject);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [X.NaV, X.NZR] */
    /* JADX WARN: Type inference failed for: r0v11, types: [X.NaV, X.NZR] */
    /* JADX WARN: Type inference failed for: r0v22, types: [X.NaV, X.NZR] */
    /* JADX WARN: Type inference failed for: r0v3, types: [X.NaV, X.NZR] */
    /* JADX WARN: Type inference failed for: r0v34, types: [X.NaV, X.NZR] */
    /* JADX WARN: Type inference failed for: r0v36, types: [X.NaV, X.NZR] */
    /* JADX WARN: Type inference failed for: r0v9, types: [X.NaV, X.NZR] */
    /* JADX WARN: Type inference failed for: r1v5, types: [X.NaV, X.NZR] */
    /* JADX WARN: Type inference failed for: r3v0, types: [X.NaW, X.NaV, X.NZR] */
    public final void LJIL(boolean z, boolean z2, String str, Boolean bool) {
        String str2;
        Long l;
        NZR nzr;
        C59314NPq crossPlatformParams;
        C59273NOb c59273NOb;
        C59314NPq crossPlatformParams2;
        C59308NPk c59308NPk;
        InterfaceC59561NZd interfaceC59561NZd = this.LL;
        if (interfaceC59561NZd != null && (crossPlatformParams2 = interfaceC59561NZd.getCrossPlatformParams()) != null && (c59308NPk = crossPlatformParams2.LIZ) != null) {
            str2 = c59308NPk.LIZJ;
        } else {
            str2 = null;
        }
        ?? r0 = this.LJLJL;
        if (r0 != 0) {
            r0.getView().setVisibility(8);
            ?? r02 = this.LJLJL;
            if (r02 != 0) {
                r02.destroyPassBackWebInfoBusiness();
                ?? r3 = this.LJLJL;
                if (r3 != 0) {
                    InterfaceC59561NZd interfaceC59561NZd2 = this.LL;
                    if (interfaceC59561NZd2 != null && (crossPlatformParams = interfaceC59561NZd2.getCrossPlatformParams()) != null && (c59273NOb = crossPlatformParams.LIZIZ) != null) {
                        l = Long.valueOf(c59273NOb.LIZ);
                    } else {
                        l = null;
                    }
                    if (NZS.LIZJ(str, String.valueOf(l))) {
                        C59612NaS adSeperatedWebView = getAdSeperatedWebView();
                        ?? r03 = this.LJLJL;
                        if (r03 != 0) {
                            NZS.LIZ(r03, adSeperatedWebView);
                            C59615NaV c59615NaV = this.LJLJL;
                            if (c59615NaV != null) {
                                c59615NaV.onPause();
                                ?? r04 = this.LJLJL;
                                if (r04 != 0) {
                                    r04.getView().setFocusable(false);
                                    this.LJLJL = adSeperatedWebView;
                                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
                                    adSeperatedWebView.getView();
                                    adSeperatedWebView.setVisibility(0);
                                    if (z || (z2 && TextUtils.equals(str2, str))) {
                                        ((ViewGroup) LJFF(R.id.nig)).removeAllViews();
                                        this.LJLJLJ.LIZJ();
                                    }
                                    ((ViewGroup) LJFF(R.id.nig)).addView(adSeperatedWebView, ((ViewGroup) LJFF(R.id.nig)).getChildCount(), layoutParams);
                                } else {
                                    o.LJIJI("iWebViewRuntime");
                                    throw null;
                                }
                            } else {
                                o.LJIJI("iWebViewRuntime");
                                throw null;
                            }
                        } else {
                            o.LJIJI("iWebViewRuntime");
                            throw null;
                        }
                    } else {
                        C59613NaT singleWebView = getSingleWebView();
                        ?? r05 = this.LJLJL;
                        if (r05 != 0) {
                            NZS.LIZ(r05, singleWebView);
                            C59615NaV c59615NaV2 = this.LJLJL;
                            if (c59615NaV2 != null) {
                                c59615NaV2.onPause();
                                ?? r06 = this.LJLJL;
                                if (r06 != 0) {
                                    r06.getView().setFocusable(false);
                                    this.LJLJL = singleWebView;
                                    FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -1);
                                    singleWebView.getView();
                                    singleWebView.setVisibility(0);
                                    if (z || (z2 && TextUtils.equals(str2, str))) {
                                        ((ViewGroup) LJFF(R.id.nig)).removeAllViews();
                                        this.LJLJLJ.LIZJ();
                                    }
                                    ((ViewGroup) LJFF(R.id.nig)).addView(singleWebView, ((ViewGroup) LJFF(R.id.nig)).getChildCount(), layoutParams2);
                                } else {
                                    o.LJIJI("iWebViewRuntime");
                                    throw null;
                                }
                            } else {
                                o.LJIJI("iWebViewRuntime");
                                throw null;
                            }
                        } else {
                            o.LJIJI("iWebViewRuntime");
                            throw null;
                        }
                    }
                    if (o.LJ(bool, Boolean.TRUE)) {
                        if (r3.canGoBack()) {
                            r3.goBack();
                        } else {
                            ViewGroup viewGroup = (ViewGroup) LJFF(R.id.nig);
                            View view = r3.getView();
                            if (C78996UzQ.LJJIIJZLJL(view)) {
                                C78996UzQ.LJI();
                            }
                            viewGroup.removeView(view);
                            NZT nzt = this.LJLJLJ;
                            if (!((ArrayList) nzt.LIZ).isEmpty() && (nzr = (NZR) ((Reference) ORS.LJJLL(nzt.LIZ)).get()) != null) {
                                nzr.destroy();
                            }
                        }
                    }
                    NZT nzt2 = this.LJLJLJ;
                    ?? r07 = this.LJLJL;
                    if (r07 != 0) {
                        nzt2.LIZIZ(r07);
                        ?? r1 = this.LJLJL;
                        if (r1 != 0) {
                            r1.setWebViewChangeListener(new NZW(this));
                            return;
                        } else {
                            o.LJIJI("iWebViewRuntime");
                            throw null;
                        }
                    }
                    o.LJIJI("iWebViewRuntime");
                    throw null;
                }
                o.LJIJI("iWebViewRuntime");
                throw null;
            }
            o.LJIJI("iWebViewRuntime");
            throw null;
        }
        o.LJIJI("iWebViewRuntime");
        throw null;
    }

    public static void LJIJI(NZQ nzq, String url, boolean z, java.util.Map map, int i) {
        boolean LJI;
        boolean z2;
        AdWebStatBusiness webStatBusiness;
        String str;
        C59273NOb c59273NOb;
        C59314NPq crossPlatformParams;
        C59314NPq crossPlatformParams2;
        C59273NOb c59273NOb2;
        C59273NOb c59273NOb3;
        C59273NOb c59273NOb4;
        C59273NOb c59273NOb5;
        String str2;
        IAdLandPagePreloadService LJJI;
        java.util.Map map2 = map;
        if ((i & 2) != 0) {
            z = false;
        }
        if ((i & 4) != 0) {
            map2 = null;
        }
        nzq.getClass();
        o.LJIIIZ(url, "url");
        nzq.LLFFF = url;
        C59639Nat LIZ = F0L.LIZ();
        if (nzq.getParent() == null) {
            LJI = false;
        } else {
            LJI = LIZ.LJI(url);
        }
        nzq.LLD = LIZ.LIZ(LJI);
        C59314NPq crossPlatformParams3 = nzq.getCrossPlatformParams();
        if (crossPlatformParams3 != null && (c59273NOb5 = crossPlatformParams3.LIZIZ) != null && (str2 = c59273NOb5.LJIJJLI) != null && (LJJI = AdLandPagePreloadServiceImpl.LJJI()) != null) {
            LJJI.LJI();
            NHG.LJIIIZ(str2);
        }
        C59314NPq crossPlatformParams4 = nzq.getCrossPlatformParams();
        boolean z3 = true;
        if (crossPlatformParams4 != null && (c59273NOb4 = crossPlatformParams4.LIZIZ) != null && c59273NOb4.LIZ == 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        boolean z4 = !z2;
        C774832i.LIZ().LIZJ(url);
        if (!z4 || (((crossPlatformParams = nzq.getCrossPlatformParams()) == null || (c59273NOb3 = crossPlatformParams.LIZIZ) == null || c59273NOb3.LJJ != 4) && ((crossPlatformParams2 = nzq.getCrossPlatformParams()) == null || (c59273NOb2 = crossPlatformParams2.LIZIZ) == null || c59273NOb2.LJJII != 1))) {
            z3 = false;
        }
        NJ2.LJIILJJIL = z3;
        if (z4 && (webStatBusiness = nzq.getWebStatBusiness()) != null) {
            C59615NaV c59615NaV = nzq.LJLJL;
            if (c59615NaV != null) {
                C59314NPq crossPlatformParams5 = nzq.getCrossPlatformParams();
                if (crossPlatformParams5 != null && (c59273NOb = crossPlatformParams5.LIZIZ) != null) {
                    str = c59273NOb.LJIIIZ;
                } else {
                    str = null;
                }
                NJ2.LJIILLIIL = null;
                NJ2.LJIILL = false;
                C59273NOb c59273NOb6 = webStatBusiness.LIZIZ.LIZIZ;
                if (webStatBusiness.LJFF != null && webStatBusiness.LIZJ() && AdWebStatBusiness.LIZLLL(url)) {
                    C59273NOb c59273NOb7 = webStatBusiness.LIZIZ.LIZIZ;
                    c59273NOb7.LJIIIZ = str;
                    c59273NOb7.LJJLIIIJLLLLLLLZ = false;
                    boolean z5 = c59273NOb6.LJJIFFI;
                    webStatBusiness.LJFF.LJIIJ(new AdWebLogModel(String.valueOf(c59273NOb6.LIZ), c59273NOb6.LJIIIIZZ, c59273NOb6.LJJJLL, c59273NOb6.LJJIII, z5 ? 1 : 0, webStatBusiness.LIZIZ.LIZ.LIZJ, str, c59273NOb6.LJJL, c59273NOb6.LJJLI, c59273NOb6.LJJLIIIIJ, c59273NOb6.LJJ, c59273NOb6.LJJII, c59273NOb6.LJIJJLI, c59273NOb6.LJIL, c59273NOb6.LJJLIIIJJI, c59273NOb6.LJJLIIIJJIZ, C84763XOl.LJIIIIZZ() instanceof CrossPlatformActivity), url);
                    C59303NPf.LIZLLL(c59273NOb6.LJJJZ, c59615NaV, "crossplatform");
                    C35998EAw.LIZJ(c59615NaV, url, c59273NOb6.LJJLIIIJJIZ, c59273NOb6.LJJLIIIJ, c59273NOb6.LJJJJJL);
                }
            } else {
                o.LJIJI("iWebViewRuntime");
                throw null;
            }
        }
        if (z) {
            nzq.LJIIL(UriProtector.parse(url).buildUpon().appendQueryParameter("reactId", nzq.getReactId()).toString(), map2);
        } else {
            nzq.LJIIL(url, map2);
        }
    }
}
