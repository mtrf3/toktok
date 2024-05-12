package X;

import Y.ACListenerS30S0100000_10;
import Y.ARunnableS29S0200000_10;
import Y.ARunnableS46S0100000_10;
import Y.IDTListenerS119S0100000_10;
import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.activity.OnBackPressedDispatcher;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.ies.bullet.ui.common.BulletActivityWrapper;
import com.bytedance.lynx.hybrid.webkit.WebKitView;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.bullet.business.AdLynxStatBusiness;
import com.ss.android.ugc.aweme.commercialize.business.DownloadBusiness;
import com.ss.android.ugc.aweme.commercialize.feed.popupwebview.AdPopUpLynxContainer;
import com.ss.android.ugc.aweme.commercialize.feed.popupwebview.AdPopUpSparkWebContainer;
import com.ss.android.ugc.aweme.commercialize.feed.popupwebview.AdPopUpWebBottomSheetBehavior;
import com.ss.android.ugc.aweme.commercialize.feed.popupwebview.AdPopUpWebPageContainer;
import com.ss.android.ugc.aweme.commercialize.model.LandingPageSurveyModel;
import com.ss.android.ugc.aweme.commercialize.model.NativeSiteConfig;
import com.ss.android.ugc.aweme.crossplatform.business.AdWebStatBusiness;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.landpage.survey.IAdLandPageSurveyService;
import com.ss.android.ugc.aweme.log.AdWebLogService;
import com.ss.android.ugc.aweme.log.IAdWebLogService;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.share.ShareH5Service;
import com.ss.android.ugc.aweme.web.experiment.CommerceWebCrossToSparkExt;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.UUID;
import kotlin.jvm.internal.AqS157S0200000_10;
import kotlin.jvm.internal.AqS160S0100000_10;
import kotlin.jvm.internal.o;
import org.greenrobot.eventbus.ThreadMode;

/* loaded from: classes11.dex */
public final class NWF extends FrameLayout implements GenericLifecycleObserver {
    public static final /* synthetic */ int LLILL = 0;
    public NWM LJLIL;
    public AdPopUpWebPageContainer LJLILLLLZI;
    public AdPopUpLynxContainer LJLJI;
    public AdPopUpSparkWebContainer LJLJJI;
    public boolean LJLJJL;
    public final boolean LJLJJLL;
    public boolean LJLJL;
    public boolean LJLJLJ;
    public NWW LJLJLLL;
    public NWE LJLL;
    public InterfaceC59489NWj LJLLI;
    public NX0 LJLLILLLL;
    public InterfaceC65784Pro<? extends Object> LJLLJ;
    public NOJ LJLLL;
    public boolean LJLLLL;
    public boolean LJLLLLLL;
    public VNS LJLZ;
    public SparkContext LJZ;
    public ARunnableS46S0100000_10 LJZI;
    public ARunnableS29S0200000_10 LJZL;
    public boolean LL;
    public boolean LLD;
    public boolean LLF;
    public boolean LLFF;
    public String LLFFF;
    public final C5H3 LLFII;
    public final C62822Ol8 LLFZ;
    public final OnBackPressedDispatcher LLI;
    public final NPP LLIFFJFJJ;
    public final C62822Ol8 LLII;
    public final C62822Ol8 LLIIII;
    public final C59493NWn LLIIIILZ;
    public int LLIIIJ;
    public int LLIIIL;
    public final NXP LLIIIZ;
    public boolean LLIIJI;
    public final NXQ LLIIJLIL;
    public final NWG LLIIL;
    public final NWK LLIILII;
    public final C59486NWg LLIILZL;
    public final IDTListenerS119S0100000_10 LLIIZ;
    public final NWC LLIL;
    public final NWO LLILII;
    public final java.util.Map<Integer, View> LLILIL = new LinkedHashMap();

    public final View LIZ(int i) {
        java.util.Map<Integer, View> map = this.LLILIL;
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

    public final void LJIJ() {
        InterfaceC60761Nsz interfaceC60761Nsz;
        WebKitView webKitView;
        this.LLF = true;
        if (this.LJLJJL) {
            if (this.LJLJJLL) {
                WebKitView webView = ((C59232NMm) LIZ(R.id.hxj)).getWebView();
                if (webView != null) {
                    webView.loadUrl("about:blank");
                } else {
                    SparkContext sparkContext = this.LJZ;
                    if (sparkContext != null) {
                        interfaceC60761Nsz = sparkContext.LJI();
                    } else {
                        interfaceC60761Nsz = null;
                    }
                    if ((interfaceC60761Nsz instanceof WebKitView) && (webKitView = (WebKitView) interfaceC60761Nsz) != null) {
                        webKitView.loadUrl("about:blank");
                    }
                }
                this.LJZ = null;
            } else {
                C59614NaU webView2 = ((NWH) LIZ(R.id.hxi)).getWebView();
                if (webView2 != null) {
                    webView2.loadUrl("about:blank");
                }
            }
            VNS vns = this.LJLZ;
            if (vns != null) {
                vns.removeAllViews();
                return;
            }
            return;
        }
        NOJ noj = this.LJLLL;
        if (noj != null && noj.LJIIL) {
            return;
        }
        if (CommerceWebCrossToSparkExt.LIZIZ()) {
            NWI nwi = (NWI) LIZ(R.id.uv);
            nwi.getClass();
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("reLoad ");
            LIZ.append("about:blank");
            C59500NWu.LIZ(X1D.LIZIZ(LIZ));
            WebKitView webKitView2 = nwi.LJLJL;
            if (webKitView2 == null) {
                return;
            }
            webKitView2.loadUrl("about:blank");
            return;
        }
        NZQ pop_up_web_page_webview = (NZQ) LIZ(R.id.hxh);
        o.LJIIIIZZ(pop_up_web_page_webview, "pop_up_web_page_webview");
        NZQ.LJIJI(pop_up_web_page_webview, "about:blank", false, null, 14);
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
    }

    private final IAdLandPageSurveyService getAdLandPageSurveyService() {
        return (IAdLandPageSurveyService) this.LLFZ.getValue();
    }

    private final GestureDetector getWebViewGestureDetector() {
        return (GestureDetector) this.LLFII.getValue();
    }

    public final void LIZJ() {
        if (this.LJLJJL) {
            if (this.LJLJJLL) {
                WebKitView webView = ((C59232NMm) LIZ(R.id.hxj)).getWebView();
                if (webView != null) {
                    webView.clearHistory();
                    return;
                }
                return;
            }
            C59614NaU webView2 = ((NWH) LIZ(R.id.hxi)).getWebView();
            if (webView2 == null) {
                return;
            }
            webView2.clearHistory();
            return;
        }
        C59615NaV c59615NaV = ((NZQ) LIZ(R.id.hxh)).LJLJL;
        if (c59615NaV != null) {
            c59615NaV.clearHistory();
        } else {
            o.LJIJI("iWebViewRuntime");
            throw null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002e, code lost:
    
        if (r1.longValue() > 0) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0043, code lost:
    
        if (X.NWB.LIZIZ(((X.NZQ) LIZ(com.zhiliaoapp.musically.R.id.hxh)).getCrossPlatformParams()) != false) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LJIIJ() {
        /*
            r7 = this;
            boolean r0 = r7.LJLJJL
            r6 = 0
            r5 = 1
            if (r0 != 0) goto L46
            boolean r0 = com.ss.android.ugc.aweme.web.experiment.CommerceWebCrossToSparkExt.LIZIZ()
            if (r0 == 0) goto L32
            r0 = 2131362211(0x7f0a01a3, float:1.8344196E38)
            android.view.View r0 = r7.LIZ(r0)
            X.NWI r0 = (X.NWI) r0
            X.NMc r0 = r0.LJLL
            if (r0 == 0) goto L46
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r0 = r0.LIZ
            if (r0 == 0) goto L46
            java.lang.Long r1 = r0.getCreativeId()
            java.lang.String r0 = "it.creativeId"
            kotlin.jvm.internal.o.LJIIIIZZ(r1, r0)
            long r3 = r1.longValue()
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 <= 0) goto L46
        L30:
            r6 = 1
        L31:
            return r6
        L32:
            r0 = 2131373272(0x7f0a2cd8, float:1.836663E38)
            android.view.View r0 = r7.LIZ(r0)
            X.NZQ r0 = (X.NZQ) r0
            X.NPq r0 = r0.getCrossPlatformParams()
            boolean r0 = X.NWB.LIZIZ(r0)
            if (r0 == 0) goto L46
            goto L30
        L46:
            X.NWW r1 = r7.LJLJLLL
            if (r1 == 0) goto L31
            boolean r0 = r1.LJFF
            if (r0 != r5) goto L4f
            goto L30
        L4f:
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r0 = r1.LJ
            if (r0 == 0) goto L31
            int r0 = r0.getWebviewPannelStyle()
            if (r0 != r5) goto L31
            goto L30
        */
        throw new UnsupportedOperationException("Method not decompiled: X.NWF.LJIIJ():boolean");
    }

    public final boolean LJIL() {
        NWW nww;
        NWW nww2 = this.LJLJLLL;
        AwemeRawAd awemeRawAd = null;
        if (nww2 != null) {
            awemeRawAd = nww2.LJ;
        }
        if ((NOX.LIZJ(awemeRawAd) || ((nww = this.LJLJLLL) != null && nww.LJI != null)) && this.LJLJJL) {
            return true;
        }
        return false;
    }

    public final NWJ getBulletLoadListener() {
        return (NWJ) this.LLIIII.getValue();
    }

    public final NXA getLoadListener() {
        return (NXA) this.LLII.getValue();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        Bundle bundle;
        int i;
        LifecycleOwner lifecycleOwner;
        AwemeRawAd awemeRawAd;
        String str;
        AwemeRawAd awemeRawAd2;
        LifecycleOwner lifecycleOwner2;
        NUT nut;
        DownloadBusiness downloadBusiness;
        NUT nut2;
        DownloadBusiness downloadBusiness2;
        C59472NVs c59472NVs;
        NP1 np1;
        NUT nut3;
        C59273NOb c59273NOb;
        String str2;
        super.onAttachedToWindow();
        NWW nww = this.LJLJLLL;
        if (nww == null || (bundle = nww.LIZLLL) == null) {
            return;
        }
        if (nww.LJI != null) {
            this.LJLJJL = true;
        }
        C42625Go9.LIZIZ(this);
        View.inflate(getContext(), R.layout.bay, this);
        View LIZ = LIZ(R.id.hfe);
        ViewGroup.LayoutParams layoutParams = LIZ.getLayoutParams();
        o.LJII(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        NWW nww2 = this.LJLJLLL;
        if (nww2 != null) {
            i = nww2.LIZJ;
        } else {
            i = 0;
        }
        marginLayoutParams.topMargin = i;
        LIZ.requestLayout();
        C60996Nwm.LJIIIIZZ(getContext());
        C60996Nwm.LJ(getContext());
        Context context = getContext();
        o.LJIIIIZZ(context, "context");
        C63081OpJ.LJJJJLI(context);
        C59501NWv c59501NWv = (C59501NWv) LIZ(R.id.hx7);
        View pop_up_web_round_layout = LIZ(R.id.hxm);
        o.LJIIIIZZ(pop_up_web_round_layout, "pop_up_web_round_layout");
        c59501NWv.getClass();
        ViewGroup.LayoutParams layoutParams2 = pop_up_web_round_layout.getLayoutParams();
        o.LJII(layoutParams2, "null cannot be cast to non-null type androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams");
        ((C06F) layoutParams2).LIZIZ(c59501NWv.LLFII);
        String string = bundle.getString("title");
        if (TextUtils.isEmpty(string)) {
            string = bundle.getString("bundle_web_title");
        }
        if (TextUtils.isEmpty(string)) {
            NWW nww3 = this.LJLJLLL;
            if (nww3 != null) {
                str2 = nww3.LIZ;
            } else {
                str2 = null;
            }
            string = UriProtector.getQueryParameter(UriProtector.parse(str2), "title");
        }
        C2314696o c2314696o = (C2314696o) LIZ(R.id.hxq);
        c2314696o.LIZLLL(string);
        C7FC.LIZIZ(c2314696o.LIZ(R.id.hx8));
        C7FC.LIZIZ(c2314696o.LIZ(R.id.hx9));
        C7FC.LIZIZ(c2314696o.LIZ(R.id.hxk));
        C7FC.LIZIZ(c2314696o.LIZ(R.id.hxn));
        C7FC.LIZIZ(c2314696o.LIZ(R.id.b8r));
        C16880lQ.LJJIJIIJIL((C116474hf) c2314696o.LIZ(R.id.hx9), new ACListenerS30S0100000_10(c2314696o, 155));
        C16880lQ.LJJJ((TuxIconView) c2314696o.LIZ(R.id.b8r), new ACListenerS30S0100000_10(c2314696o, 156));
        C16880lQ.LJJJ((TuxIconView) c2314696o.LIZ(R.id.hxk), new ACListenerS30S0100000_10(c2314696o, 157));
        C16880lQ.LJJJ((TuxIconView) c2314696o.LIZ(R.id.hx8), new ACListenerS30S0100000_10(c2314696o, 158));
        C16880lQ.LJJJ((TuxIconView) c2314696o.LIZ(R.id.hxn), new ACListenerS30S0100000_10(c2314696o, 159));
        if (bundle.getBoolean("isFromChallenge")) {
            C2314696o c2314696o2 = (C2314696o) LIZ(R.id.hxq);
            ((ImageView) c2314696o2.LIZ(R.id.hx9)).setVisibility(8);
            ((ImageView) c2314696o2.LIZ(R.id.b8r)).setVisibility(0);
            ((ImageView) c2314696o2.LIZ(R.id.hxk)).setVisibility(8);
            ((ImageView) c2314696o2.LIZ(R.id.hx8)).setVisibility(8);
            ((ImageView) c2314696o2.LIZ(R.id.hxn)).setVisibility(8);
            c2314696o2.LIZ(R.id.hxp).setVisibility(8);
        }
        if (this.LJLJJL) {
            if (this.LJLJJLL) {
                NVO rootContainer = ((C59232NMm) LIZ(R.id.hxj)).getRootContainer();
                if (rootContainer != null) {
                    rootContainer.LLFZ = true;
                }
                LIZ(R.id.hxj).setVisibility(0);
                ((C59232NMm) LIZ(R.id.hxj)).setScrollListener(new NWY(this, bundle));
            } else {
                C59451NUx rootContainer2 = ((NWH) LIZ(R.id.hxi)).getRootContainer();
                if (rootContainer2 != null) {
                    rootContainer2.LLFII = true;
                }
                LIZ(R.id.hxi).setVisibility(0);
                ((NWH) LIZ(R.id.hxi)).setScrollListener(new NWZ(this, bundle));
            }
            LIZ(R.id.hxh).setVisibility(8);
            LIZ(R.id.uv).setVisibility(8);
        } else if (CommerceWebCrossToSparkExt.LIZIZ()) {
            LIZ(R.id.uv).setVisibility(0);
            LIZ(R.id.hxh).setVisibility(8);
            ((NWI) LIZ(R.id.uv)).setScrollListener(new NWX(this, bundle));
        } else {
            LIZ(R.id.uv).setVisibility(8);
            LIZ(R.id.hxh).setVisibility(0);
            ((NXI) ((NZQ) LIZ(R.id.hxh)).LJI(NXI.class)).LIZ().setWebScrollListener(new C59480NWa(this, bundle));
        }
        if (!CommerceWebCrossToSparkExt.LIZIZ() && LJIIJ()) {
            LIZ(R.id.hxm).setBackgroundResource(R.drawable.a0u);
            ((NZQ) LIZ(R.id.hxh)).setShouldShowProgressBarBg(true);
        }
        C7FC.LIZIZ(LIZ(R.id.hxl));
        View LIZ2 = LIZ(R.id.c4e);
        if (LIZ2 != null) {
            LIZ2.setVisibility(8);
        } else if (LJIIL()) {
            LIZ(R.id.d43).setVisibility(0);
            ((C59501NWv) LIZ(R.id.hx7)).getBehavior().LJJII = true;
        } else {
            LIZ(R.id.d43).setVisibility(8);
        }
        Context context2 = getContext();
        o.LJIIIIZZ(context2, "context");
        Activity LJIJJ = C45804HyK.LJIJJ(context2);
        if (LJIJJ != null) {
            if (CommerceWebCrossToSparkExt.LIZIZ()) {
                Context context3 = getContext();
                o.LJIIIIZZ(context3, "context");
                NMV nmv = new NMV(context3);
                nmv.LIZ = new NWD(this);
                ((NWI) LIZ(R.id.uv)).setIAdWebTitleBar(nmv);
                NWI nwi = (NWI) LIZ(R.id.uv);
                Context context4 = getContext();
                o.LJIIIIZZ(context4, "context");
                nwi.setIAdWebBottomBar(new C59572NZo(context4));
            } else {
                NZR webView = getWebView();
                if (webView != null) {
                    webView.onReceivedTitle(new C59482NWc(this));
                }
            }
            this.LJLIL = new NWM(LJIJJ, this);
            if (this.LJLJJL) {
                NWW nww4 = this.LJLJLLL;
                if (nww4 != null && (lifecycleOwner2 = nww4.LIZIZ) != null) {
                    if (this.LJLJJLL) {
                        NVO rootContainer3 = ((C59232NMm) LIZ(R.id.hxj)).getRootContainer();
                        if (rootContainer3 != null && (nut2 = rootContainer3.LJLIL) != null && (downloadBusiness2 = (DownloadBusiness) nut2.LIZ(DownloadBusiness.class)) != null) {
                            downloadBusiness2.LIZJ = R.id.tk;
                        }
                    } else {
                        ((NWH) LIZ(R.id.hxi)).LJIILLIIL(C57415Mg7.LIZ().LJIILIIL(), getBulletLoadListener(), new BulletActivityWrapper(LJIJJ), lifecycleOwner2);
                        C59451NUx rootContainer4 = ((NWH) LIZ(R.id.hxi)).getRootContainer();
                        if (rootContainer4 != null && (nut = rootContainer4.LJLILLLLZI) != null && (downloadBusiness = (DownloadBusiness) nut.LIZ(DownloadBusiness.class)) != null) {
                            downloadBusiness.LIZJ = R.id.tk;
                        }
                    }
                }
            } else {
                NWW nww5 = this.LJLJLLL;
                if (nww5 != null && (lifecycleOwner = nww5.LIZIZ) != null) {
                    if (CommerceWebCrossToSparkExt.LIZIZ()) {
                        C59222NMc c59222NMc = new C59222NMc(0);
                        NWW nww6 = this.LJLJLLL;
                        if (nww6 != null) {
                            awemeRawAd = nww6.LJ;
                        } else {
                            awemeRawAd = null;
                        }
                        c59222NMc.LIZ = awemeRawAd;
                        if (nww6 != null && (awemeRawAd2 = nww6.LJ) != null) {
                            str = awemeRawAd2.getWebTitle();
                        } else {
                            str = null;
                        }
                        c59222NMc.LIZIZ = str;
                        c59222NMc.LJII = true;
                        c59222NMc.LIZLLL = bundle.getString("commerce_enter_from");
                        ((NWI) LIZ(R.id.uv)).setAdWebModel(c59222NMc);
                    } else {
                        NZQ pop_up_web_page_webview = (NZQ) LIZ(R.id.hxh);
                        o.LJIIIIZZ(pop_up_web_page_webview, "pop_up_web_page_webview");
                        this.LJLILLLLZI = C59483NWd.LIZ(LJIJJ, pop_up_web_page_webview, getLoadListener(), bundle, lifecycleOwner);
                        NZR webView2 = getWebView();
                        if (webView2 != null) {
                            webView2.setCrossPlatformActivityContainerInChrome(this.LJLILLLLZI);
                        }
                    }
                }
            }
            ((C59501NWv) LIZ(R.id.hx7)).setCallback(this.LLIIL);
            ((C59501NWv) LIZ(R.id.hx7)).getBehavior().LJIJJLI = true;
            C16880lQ.LJJJJI((TuxTextView) LIZ(R.id.hxl), new ACListenerS30S0100000_10(this, 160));
            ((C2314696o) LIZ(R.id.hxq)).setTitleBarListener(this.LLIL);
            ((C59571NZn) LIZ(R.id.hxb)).setNaviBarListener(this.LLILII);
            LIZ(R.id.hxq).setOnTouchListener(new IDTListenerS119S0100000_10(this, 10));
            if (this.LJLJJL) {
                if (this.LJLJJLL) {
                    ((C59232NMm) LIZ(R.id.hxj)).setOutTouchDelegate(this.LLIIZ);
                } else {
                    ((NWH) LIZ(R.id.hxi)).setOutTouchDelegate(this.LLIIZ);
                }
            } else {
                if (CommerceWebCrossToSparkExt.LIZIZ()) {
                    ((NWI) LIZ(R.id.uv)).setTouchListener(this.LLIIZ);
                } else {
                    ((NZQ) LIZ(R.id.hxh)).setWebViewTouchListener(this.LLIIZ);
                }
                if (LJIIJ() && !CommerceWebCrossToSparkExt.LIZIZ()) {
                    ShareH5Service.LIZ.getClass();
                    ShareH5Service LIZ3 = C58149Mrx.LIZ();
                    NTL crossPlatformBusiness = ((NZQ) LIZ(R.id.hxh)).getCrossPlatformBusiness();
                    NZR LIZ4 = ((NXI) ((NZQ) LIZ(R.id.hxh)).LJI(NXI.class)).LIZ();
                    o.LJIIIIZZ(LIZ4, "pop_up_web_page_webview.…Wrap::class.java).webView");
                    LIZ3.LJIJJLI(crossPlatformBusiness, LIZ4, 2);
                }
            }
            if (LJIIJ()) {
                ((C2314696o) LIZ(R.id.hxq)).LJ();
                int LJIILL = C17N.LJIILL(52.5d);
                View pop_up_web_page_webview2 = LIZ(R.id.hxh);
                o.LJIIIIZZ(pop_up_web_page_webview2, "pop_up_web_page_webview");
                LJIJJLI(LJIILL, pop_up_web_page_webview2);
                View pop_up_web_page_webview_bullet = LIZ(R.id.hxi);
                o.LJIIIIZZ(pop_up_web_page_webview_bullet, "pop_up_web_page_webview_bullet");
                LJIJJLI(LJIILL, pop_up_web_page_webview_bullet);
                View pop_up_web_page_webview_spark = LIZ(R.id.hxj);
                o.LJIIIIZZ(pop_up_web_page_webview_spark, "pop_up_web_page_webview_spark");
                LJIJJLI(LJIILL, pop_up_web_page_webview_spark);
                View pop_up_web_network_error_view = LIZ(R.id.hxg);
                o.LJIIIIZZ(pop_up_web_network_error_view, "pop_up_web_network_error_view");
                LJIJJLI(LJIILL, pop_up_web_network_error_view);
            }
        }
        InterfaceC65784Pro<? extends Object> interfaceC65784Pro = this.LJLLJ;
        if (interfaceC65784Pro != null) {
            interfaceC65784Pro.invoke();
        }
        if (!this.LJLJJL) {
            if (CommerceWebCrossToSparkExt.LIZIZ()) {
                C59222NMc adWebModel = ((NWI) LIZ(R.id.uv)).getAdWebModel();
                if (adWebModel == null) {
                    return;
                }
                adWebModel.LJIIJJI = 1;
                return;
            }
            C59314NPq crossPlatformParams = ((NZQ) LIZ(R.id.hxh)).getCrossPlatformParams();
            if (crossPlatformParams == null || (c59273NOb = crossPlatformParams.LIZIZ) == null) {
                return;
            }
            c59273NOb.LJJJLL = 1;
            return;
        }
        C59451NUx rootContainer5 = ((NWH) LIZ(R.id.hxi)).getRootContainer();
        if (rootContainer5 != null && (nut3 = rootContainer5.LJLILLLLZI) != null) {
            c59472NVs = nut3.getParams();
        } else {
            c59472NVs = null;
        }
        if (!(c59472NVs instanceof NP1) || (np1 = (NP1) c59472NVs) == null) {
            return;
        }
        np1.LLIFFJFJJ = 1;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        boolean z;
        NUT nut;
        DownloadBusiness downloadBusiness;
        NUT nut2;
        DownloadBusiness downloadBusiness2;
        if (this.LJLJJL) {
            if (this.LJLJJLL) {
                AdPopUpLynxContainer adPopUpLynxContainer = this.LJLJI;
                if (adPopUpLynxContainer != null) {
                    adPopUpLynxContainer.LJLIL.getLifecycle().removeObserver(adPopUpLynxContainer);
                }
                NVO rootContainer = ((C59232NMm) LIZ(R.id.hxj)).getRootContainer();
                if (rootContainer != null && (nut2 = rootContainer.LJLIL) != null && (downloadBusiness2 = (DownloadBusiness) nut2.LIZ(DownloadBusiness.class)) != null) {
                    downloadBusiness2.LIZIZ();
                }
                SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS = ((C59232NMm) LIZ(R.id.hxj)).LJLIL;
                if (sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS != null) {
                    SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS.LJ(sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS);
                }
            } else {
                C59451NUx rootContainer2 = ((NWH) LIZ(R.id.hxi)).getRootContainer();
                if (rootContainer2 != null && (nut = rootContainer2.LJLILLLLZI) != null && (downloadBusiness = (DownloadBusiness) nut.LIZ(DownloadBusiness.class)) != null) {
                    downloadBusiness.LIZIZ();
                }
                ((C60193Njp) LIZ(R.id.hxi)).release();
            }
        } else if (CommerceWebCrossToSparkExt.LIZIZ()) {
            NWI nwi = (NWI) LIZ(R.id.uv);
            nwi.getClass();
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("release ");
            if (nwi.LJLIL == null) {
                z = true;
            } else {
                z = false;
            }
            LIZ.append(z);
            C59500NWu.LIZ(X1D.LIZIZ(LIZ));
            SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS2 = nwi.LJLIL;
            if (sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS2 != null) {
                SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS.LJ(sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS2);
            }
            nwi.LJLJL = null;
            nwi.LJLJJI = null;
            AdPopUpSparkWebContainer adPopUpSparkWebContainer = this.LJLJJI;
            if (adPopUpSparkWebContainer != null) {
                adPopUpSparkWebContainer.LJLIL.getLifecycle().removeObserver(adPopUpSparkWebContainer);
            }
        } else {
            AdPopUpWebPageContainer adPopUpWebPageContainer = this.LJLILLLLZI;
            if (adPopUpWebPageContainer != null) {
                adPopUpWebPageContainer.LJLJJLL.getLifecycle().removeObserver(adPopUpWebPageContainer);
                adPopUpWebPageContainer.LJ();
                if (adPopUpWebPageContainer.LJLJLLL) {
                    adPopUpWebPageContainer.LJLJLJ = false;
                    adPopUpWebPageContainer.LJLILLLLZI.LIZJ(adPopUpWebPageContainer.LJLIL);
                    adPopUpWebPageContainer.LJLJJL.getClass();
                }
            }
        }
        C42625Go9.LIZJ(this);
        super.onDetachedFromWindow();
        NWM nwm = this.LJLIL;
        if (nwm != null) {
            nwm.enable(false);
        }
        this.LJLIL = null;
    }

    public final boolean LJIIIZ() {
        C59501NWv c59501NWv = (C59501NWv) LIZ(R.id.hx7);
        java.util.Map<Integer, View> map = c59501NWv.LLIFFJFJJ;
        View view = map.get(Integer.valueOf(R.id.hxm));
        if (view == null) {
            view = c59501NWv.findViewById(R.id.hxm);
            if (view != null) {
                map.put(Integer.valueOf(R.id.hxm), view);
            } else {
                view = null;
            }
        }
        if (view.getY() == 0.0f) {
            return true;
        }
        return false;
    }

    public final boolean LJIIJJI() {
        C59501NWv c59501NWv = (C59501NWv) LIZ(R.id.hx7);
        if (c59501NWv == null) {
            return false;
        }
        int i = c59501NWv.LLFII.LJIIIIZZ;
        if (i != 3 && i != 4) {
            return false;
        }
        return true;
    }

    public final boolean LJIIL() {
        if (((C59501NWv) LIZ(R.id.hx7)).getActionMode().LIZJ == 4 || ((C59501NWv) LIZ(R.id.hx7)).getActionMode().LIZJ == 5 || ((C59501NWv) LIZ(R.id.hx7)).getActionMode().LIZJ == 6) {
            return true;
        }
        return false;
    }

    public final boolean LJIILIIL() {
        if (((C59501NWv) LIZ(R.id.hx7)).getActionMode().LIZJ == 1) {
            return true;
        }
        return false;
    }

    public final boolean LJIILJJIL() {
        if (((C59501NWv) LIZ(R.id.hx7)).getActionMode().LIZJ == 5) {
            return true;
        }
        return false;
    }

    public final void LJJI() {
        if ((((C59501NWv) LIZ(R.id.hx7)).getActionMode().LIZJ == 3 || ((C59501NWv) LIZ(R.id.hx7)).getActionMode().LIZJ == 5) && ((C59501NWv) LIZ(R.id.hx7)).getBehavior().LJIIIIZZ == 6) {
            ((C59501NWv) LIZ(R.id.hx7)).LJIJJLI();
        }
    }

    public final NWN getActionMode() {
        return ((C59501NWv) LIZ(R.id.hx7)).getActionMode();
    }

    public final WebKitView getAdWebSparkView() {
        return ((NWI) LIZ(R.id.uv)).getWebView();
    }

    public final NZR getWebView() {
        return ((NXI) ((NZQ) LIZ(R.id.hxh)).LJI(NXI.class)).LIZ();
    }

    public final boolean getFromTitleBarClick() {
        return this.LLD;
    }

    public final NX0 getKeyDownCallBack() {
        return this.LJLLILLLL;
    }

    public final InterfaceC59489NWj getMBehaviorCallback() {
        return this.LJLLI;
    }

    public final int getMDownX() {
        return this.LLIIIJ;
    }

    public final int getMDownY() {
        return this.LLIIIL;
    }

    public final NWW getParams() {
        return this.LJLJLLL;
    }

    public final String getRenderType() {
        return this.LLFFF;
    }

    public final NWE getTitleBarCallback() {
        return this.LJLL;
    }

    public NWF(Context context) {
        super(context, null, 0);
        this.LJLJJLL = C59294NOw.LIZ();
        this.LLFFF = "";
        this.LLFII = C221108m2.LIZ(EnumC221088m0.NONE, new AqS157S0200000_10(context, this, 39));
        this.LLFZ = C221108m2.LIZIZ(NMX.LJLIL);
        ActivityC45651qj LJJIFFI = C45804HyK.LJJIFFI(context);
        this.LLI = LJJIFFI != null ? LJJIFFI.getOnBackPressedDispatcher() : null;
        this.LLIFFJFJJ = new NPP(this);
        this.LLII = C221108m2.LIZIZ(new AqS160S0100000_10(this, 521));
        this.LLIIII = C221108m2.LIZIZ(new AqS160S0100000_10(this, 520));
        this.LLIIIILZ = new C59493NWn(this);
        this.LLIIIZ = new NXP(this);
        this.LLIIJLIL = new NXQ(this);
        this.LLIIL = new NWG(context, this);
        this.LLIILII = new NWK(context, this);
        this.LLIILZL = new C59486NWg(context, this);
        this.LLIIZ = new IDTListenerS119S0100000_10(this, 9);
        this.LLIL = new NWC(context, this);
        this.LLILII = new NWO(this);
    }

    private final void setShouldHideBottomNavBar(String str) {
        boolean z;
        if (TextUtils.equals(UriProtector.getQueryParameter(UriProtector.parse(str), "hide_bottom_nav_bar"), "1") || TextUtils.equals(UriProtector.getQueryParameter(UriProtector.parse(str), "hide_title_bar"), "1") || TextUtils.equals(UriProtector.getQueryParameter(UriProtector.parse(str), "hide_nav_bar"), "1")) {
            z = true;
        } else {
            z = false;
        }
        this.LLFF = z;
    }

    public final boolean LIZIZ(boolean z) {
        Activity LJIJJ;
        WebKitView webKitView;
        if (!LJIIIZ()) {
            return false;
        }
        if (!CommerceWebCrossToSparkExt.LIZIZ() ? ((NXI) ((NZQ) LIZ(R.id.hxh)).LJI(NXI.class)).canGoBack() : (webKitView = ((NWI) LIZ(R.id.uv)).LJLJL) != null && webKitView.canGoBack()) {
            if (!z) {
                return false;
            }
        }
        Context context = getContext();
        if (context == null || (LJIJJ = C45804HyK.LJIJJ(context)) == null) {
            return false;
        }
        return getAdLandPageSurveyService().LIZLLL(LJIJJ, new AqS160S0100000_10(this, 85));
    }

    public final void LIZLLL(boolean z) {
        WebView webView;
        int i;
        if (this.LJLJJL) {
            if (this.LJLJJLL) {
                WebKitView webView2 = ((C59232NMm) LIZ(R.id.hxj)).getWebView();
                if (webView2 != null) {
                    webView2.destroy();
                }
            } else {
                C59614NaU webView3 = ((NWH) LIZ(R.id.hxi)).getWebView();
                if (webView3 != null) {
                    webView3.destroy();
                }
            }
            VNS vns = this.LJLZ;
            if (vns != null) {
                vns.removeAllViews();
            }
        } else {
            NOJ noj = this.LJLLL;
            if ((noj == null || !noj.LJIIL) && !CommerceWebCrossToSparkExt.LIZIZ() && (webView = (WebView) LIZ(R.id.hxh).findViewById(R.id.nie)) != null) {
                webView.destroy();
            }
        }
        if (LJIIL() && !z) {
            AdPopUpWebBottomSheetBehavior<C59501NWv> behavior = ((C59501NWv) LIZ(R.id.hx7)).getBehavior();
            if (behavior.LIZJ) {
                i = -1;
            } else {
                i = behavior.LIZIZ;
            }
            if (i != ((int) KL2.LIZJ(getContext(), 64.0f))) {
                InterfaceC59489NWj interfaceC59489NWj = this.LJLLI;
                if (interfaceC59489NWj != null) {
                    interfaceC59489NWj.LIZLLL(this.LLIIL.LIZ, Boolean.FALSE);
                }
                LIZ(R.id.hxa).setVisibility(8);
                LIZ(R.id.d43).setVisibility(0);
                LIZ(R.id.d43).setAlpha(1.0f);
            }
            ((C59501NWv) LIZ(R.id.hx7)).getBehavior().setPeekHeight((int) KL2.LIZJ(getContext(), 64.0f));
            ((C59501NWv) LIZ(R.id.hx7)).LLFII.setState(4);
        } else {
            ((C59501NWv) LIZ(R.id.hx7)).getBehavior().LJI = true;
            AdPopUpWebBottomSheetBehavior<C59501NWv> adPopUpWebBottomSheetBehavior = ((C59501NWv) LIZ(R.id.hx7)).LLFII;
            int i2 = adPopUpWebBottomSheetBehavior.LJIIIIZZ;
            if (i2 == 3 || i2 == 4 || i2 == 6) {
                adPopUpWebBottomSheetBehavior.setState(5);
            }
        }
        C9UE.LIZIZ(getContext());
        LIZ(R.id.qi).removeCallbacks(this.LJZI);
        LIZ(R.id.qi).removeCallbacks(this.LJZL);
    }

    public final C62562cu LJ(User user) {
        UrlModel avatarLarger;
        if (user == null) {
            return null;
        }
        if (user.getAvatarMedium() != null) {
            avatarLarger = user.getAvatarMedium();
        } else if (user.getAvatarThumb() != null) {
            avatarLarger = user.getAvatarThumb();
        } else {
            if (user.getAvatarLarger() != null) {
                avatarLarger = user.getAvatarLarger();
            }
            return null;
        }
        if (avatarLarger != null) {
            return new C62562cu(avatarLarger.getUrlList());
        }
        return null;
    }

    public final String LJFF(AwemeRawAd awemeRawAd) {
        String str;
        String str2;
        NativeSiteConfig nativeSiteConfig;
        String str3 = null;
        if (!NOX.LIZJ(awemeRawAd)) {
            return null;
        }
        if (awemeRawAd == null || (nativeSiteConfig = awemeRawAd.getNativeSiteConfig()) == null || (str = nativeSiteConfig.getLynxScheme()) == null) {
            str = "";
        }
        Bundle bundle = new Bundle();
        if (awemeRawAd != null) {
            str2 = awemeRawAd.getPageId();
        } else {
            str2 = null;
        }
        bundle.putString("page_id", str2);
        bundle.putString("landPageShowType", String.valueOf(C59445NUr.LIZJ(awemeRawAd)));
        Uri.Builder buildUpon = UriProtector.parse(C40179Fpn.LIZ(bundle, str)).buildUpon();
        YG5.LIZIZ.getAdLynxLandPageUtil();
        buildUpon.appendQueryParameter("lynx_landing_page_data", NOX.LIZ(awemeRawAd, getContext(), Boolean.TRUE));
        if (awemeRawAd != null) {
            str3 = awemeRawAd.getWebTitle();
        }
        buildUpon.appendQueryParameter("lynx_landing_page_title", str3);
        String builder = buildUpon.toString();
        o.LJIIIIZZ(builder, "urlBuilder.toString()");
        return builder;
    }

    public final void LJII(NOJ noj) {
        C59273NOb c59273NOb;
        C59314NPq c59314NPq;
        C59273NOb c59273NOb2;
        if (noj != null) {
            String LIZ = AnonymousClass629.LIZ("randomUUID().toString()");
            if (CommerceWebCrossToSparkExt.LIZIZ()) {
                C59222NMc adWebModel = ((NWI) LIZ(R.id.uv)).getAdWebModel();
                if (adWebModel != null) {
                    adWebModel.LJIIL = noj.LJIIJ;
                }
                C59222NMc adWebModel2 = ((NWI) LIZ(R.id.uv)).getAdWebModel();
                if (adWebModel2 == null) {
                    return;
                }
                adWebModel2.LJIIJ = LIZ;
                return;
            }
            AdPopUpWebPageContainer adPopUpWebPageContainer = this.LJLILLLLZI;
            if (adPopUpWebPageContainer != null && (c59314NPq = adPopUpWebPageContainer.LJLJJI) != null && (c59273NOb2 = c59314NPq.LIZIZ) != null) {
                c59273NOb2.LJJIFFI = noj.LJIIJ;
            }
            C59314NPq crossPlatformParams = ((NZQ) LIZ(R.id.hxh)).getCrossPlatformParams();
            if (crossPlatformParams == null || (c59273NOb = crossPlatformParams.LIZIZ) == null) {
                return;
            }
            c59273NOb.LJJL = LIZ;
        }
    }

    public final void LJIIIIZZ(InterfaceC65784Pro<? extends Object> interfaceC65784Pro) {
        if (LIZ(R.id.hfe) == null) {
            this.LJLLJ = interfaceC65784Pro;
        } else {
            interfaceC65784Pro.invoke();
        }
    }

    public final void LJIIZILJ(boolean z) {
        NOJ noj;
        AwemeRawAd awemeRawAd;
        String str;
        String str2;
        String str3;
        String str4;
        Aweme aweme;
        C59222NMc adWebModel;
        C59314NPq c59314NPq;
        C59273NOb c59273NOb;
        if (LJIIIZ() && (noj = this.LJLLL) != null && (awemeRawAd = noj.LIZIZ) != null) {
            if (z) {
                AdPopUpWebPageContainer adPopUpWebPageContainer = this.LJLILLLLZI;
                if (adPopUpWebPageContainer == null || (c59314NPq = adPopUpWebPageContainer.LJLJJI) == null || (c59273NOb = c59314NPq.LIZIZ) == null || (str = c59273NOb.LJJIJL) == null) {
                    str = "";
                }
                if (CommerceWebCrossToSparkExt.LIZIZ() && ((adWebModel = ((NWI) LIZ(R.id.uv)).getAdWebModel()) == null || (str = adWebModel.LIZLLL) == null)) {
                    str = "";
                }
                LandingPageSurveyModel landingPageSurvey = awemeRawAd.getLandingPageSurvey();
                if (landingPageSurvey != null) {
                    IAdLandPageSurveyService adLandPageSurveyService = getAdLandPageSurveyService();
                    Long adId = awemeRawAd.getAdId();
                    if (adId == null) {
                        str2 = "";
                    } else {
                        str2 = String.valueOf(adId);
                    }
                    Long creativeId = awemeRawAd.getCreativeId();
                    if (creativeId == null) {
                        str3 = "";
                    } else {
                        str3 = String.valueOf(creativeId);
                    }
                    NOJ noj2 = this.LJLLL;
                    if (noj2 == null || (aweme = noj2.LJIIIIZZ) == null || (str4 = aweme.getRequestId()) == null) {
                        str4 = "";
                    }
                    adLandPageSurveyService.LJ(str, str2, str3, str4, awemeRawAd.getLogExtra(), landingPageSurvey.getSchemaUrl(), landingPageSurvey.getEnableLandingPageSurvey(), landingPageSurvey.getShowSurveyTimeInterval(), landingPageSurvey.getPageDwellTime());
                    return;
                }
                return;
            }
            getAdLandPageSurveyService().LIZ();
        }
    }

    public final void LJIJI(String str) {
        View LIZ;
        String num;
        WebKitView webView;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String str2 = "";
        if (str == null) {
            str = "";
        }
        linkedHashMap.put("url", str);
        if (!CommerceWebCrossToSparkExt.LIZIZ() ? !((LIZ = LIZ(R.id.hxh)) == null || (num = Integer.valueOf(LIZ.hashCode()).toString()) == null) : !((webView = ((NWI) LIZ(R.id.uv)).getWebView()) == null || (num = Integer.valueOf(webView.hashCode()).toString()) == null)) {
            str2 = num;
        }
        linkedHashMap.put("container_id", str2);
        long currentTimeMillis = System.currentTimeMillis();
        new F15();
        C72818Shy.LIZ(new C76052yf(currentTimeMillis, F15.LIZLLL(linkedHashMap), "ad_webview_generate"));
    }

    public final void LJIJJ(String str) {
        C59484NWe c59484NWe;
        AdWebStatBusiness adWebStatBusiness;
        NUT nut;
        AdLynxStatBusiness adLynxStatBusiness;
        NUT nut2;
        com.ss.android.ugc.aweme.bullet.business.AdWebStatBusiness adWebStatBusiness2;
        NUT nut3;
        AdLynxStatBusiness adLynxStatBusiness2;
        NUT nut4;
        com.ss.android.ugc.aweme.bullet.business.AdWebStatBusiness adWebStatBusiness3;
        C59451NUx rootContainer = ((NWH) LIZ(R.id.hxi)).getRootContainer();
        if (rootContainer != null && (nut4 = rootContainer.LJLILLLLZI) != null && (adWebStatBusiness3 = (com.ss.android.ugc.aweme.bullet.business.AdWebStatBusiness) nut4.LIZ(com.ss.android.ugc.aweme.bullet.business.AdWebStatBusiness.class)) != null) {
            adWebStatBusiness3.LJIILJJIL(true);
        }
        C59451NUx rootContainer2 = ((NWH) LIZ(R.id.hxi)).getRootContainer();
        if (rootContainer2 != null && (nut3 = rootContainer2.LJLILLLLZI) != null && (adLynxStatBusiness2 = (AdLynxStatBusiness) nut3.LIZ(AdLynxStatBusiness.class)) != null) {
            adLynxStatBusiness2.LJII(true);
        }
        NVO rootContainer3 = ((C59232NMm) LIZ(R.id.hxj)).getRootContainer();
        if (rootContainer3 != null && (nut2 = rootContainer3.LJLIL) != null && (adWebStatBusiness2 = (com.ss.android.ugc.aweme.bullet.business.AdWebStatBusiness) nut2.LIZ(com.ss.android.ugc.aweme.bullet.business.AdWebStatBusiness.class)) != null) {
            adWebStatBusiness2.LJIILJJIL(true);
        }
        NVO rootContainer4 = ((C59232NMm) LIZ(R.id.hxj)).getRootContainer();
        if (rootContainer4 != null && (nut = rootContainer4.LJLIL) != null && (adLynxStatBusiness = (AdLynxStatBusiness) nut.LIZ(AdLynxStatBusiness.class)) != null) {
            adLynxStatBusiness.LJII(true);
        }
        if (CommerceWebCrossToSparkExt.LIZIZ()) {
            ((NWI) LIZ(R.id.uv)).LIZ(str);
            return;
        }
        AdPopUpWebPageContainer adPopUpWebPageContainer = this.LJLILLLLZI;
        if (adPopUpWebPageContainer == null || (c59484NWe = adPopUpWebPageContainer.LJLJJL) == null || (adWebStatBusiness = (AdWebStatBusiness) c59484NWe.LIZ(AdWebStatBusiness.class)) == null) {
            return;
        }
        adWebStatBusiness.LJIIIZ(true, ((NZQ) LIZ(R.id.hxh)).getWebBackForwardList(), getWebView(), str);
    }

    /* JADX WARN: Code restructure failed: missing block: B:285:0x066e, code lost:
    
        if (android.text.TextUtils.equals(com.bytedance.mt.protector.impl.UriProtector.getQueryParameter(com.bytedance.mt.protector.impl.UriProtector.parse(r11), "hide_nav_bar"), "1") == false) goto L294;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0148, code lost:
    
        if (android.text.TextUtils.equals(com.bytedance.mt.protector.impl.UriProtector.getQueryParameter(com.bytedance.mt.protector.impl.UriProtector.parse(r11), "hide_nav_bar"), "1") == false) goto L294;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0672, code lost:
    
        r0 = false;
     */
    /* JADX WARN: Removed duplicated region for block: B:51:0x013c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJ(X.NOJ r16) {
        /*
            Method dump skipped, instructions count: 1708
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.NWF.LJJ(X.NOJ):void");
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent != null) {
            if (((C59501NWv) LIZ(R.id.hx7)).getActionMode().LIZJ == 3 && ((C59501NWv) LIZ(R.id.hx7)).getBehavior().LJIIIIZZ != 3) {
                getActionMode().LIZIZ(motionEvent);
            }
            getWebViewGestureDetector().onTouchEvent(motionEvent);
            Integer valueOf = Integer.valueOf(motionEvent.getAction());
            if (valueOf != null) {
                if (valueOf.intValue() == 0) {
                    this.LLIIIJ = (int) motionEvent.getX();
                    this.LLIIIL = (int) motionEvent.getY();
                    if (LJIIL() && ((C59501NWv) LIZ(R.id.hx7)).getBehavior().LJIIIIZZ != 4) {
                        requestDisallowInterceptTouchEvent(true);
                    }
                } else if (valueOf.intValue() == 2) {
                    if (Math.abs(motionEvent.getX() - this.LLIIIJ) > Math.abs(motionEvent.getY() - this.LLIIIL)) {
                        if (LJIIL() && ((C59501NWv) LIZ(R.id.hx7)).getBehavior().LJIIIIZZ != 4) {
                            requestDisallowInterceptTouchEvent(true);
                        }
                    } else {
                        requestDisallowInterceptTouchEvent(false);
                    }
                }
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @QD3(threadMode = ThreadMode.MAIN)
    public final void onPopUpPageCloseEvent(C40488Fum event) {
        SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS sparkView;
        InterfaceC60761Nsz kitView;
        View LIZJ;
        o.LJIIIZ(event, "event");
        if (event.LJLILLLLZI) {
            if (CommerceWebCrossToSparkExt.LIZIZ()) {
                WebKitView webView = ((NWI) LIZ(R.id.uv)).getWebView();
                if (webView != null && event.LJLIL == webView.hashCode()) {
                    LIZLLL(false);
                    return;
                }
                return;
            }
            if (event.LJLIL != LIZ(R.id.hxh).hashCode()) {
                return;
            }
            LIZLLL(false);
            return;
        }
        if (this.LJLJJLL) {
            C59232NMm c59232NMm = (C59232NMm) LIZ(R.id.hxj);
            if (c59232NMm != null && (sparkView = c59232NMm.getSparkView()) != null && (kitView = sparkView.getKitView()) != null && (LIZJ = kitView.LIZJ()) != null && LIZJ.hashCode() == event.LJLIL) {
                LIZLLL(false);
                return;
            }
            return;
        }
        if (event.LJLIL != LIZ(R.id.hxi).hashCode()) {
            return;
        }
        LIZLLL(false);
    }

    public final void setFromAdButtonClick(boolean z) {
        this.LL = z;
    }

    public final void setFromTitleBarClick(boolean z) {
        this.LLD = z;
    }

    public final void setKeyDownCallBack(NX0 nx0) {
        this.LJLLILLLL = nx0;
    }

    public final void setMBehaviorCallback(InterfaceC59489NWj interfaceC59489NWj) {
        this.LJLLI = interfaceC59489NWj;
    }

    public final void setMDownX(int i) {
        this.LLIIIJ = i;
    }

    public final void setMDownY(int i) {
        this.LLIIIL = i;
    }

    public final void setParams(NWW nww) {
        this.LJLJLLL = nww;
    }

    public final void setRenderType(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.LLFFF = str;
    }

    public final void setShouldStartAnimation(boolean z) {
        this.LJLLLLLL = z;
    }

    public final void setTitleBarCallback(NWE nwe) {
        this.LJLL = nwe;
    }

    public final void setUseLynxLandingPage(boolean z) {
        this.LJLJJL = z;
    }

    public final void LJI(int i, Bundle bundle) {
        if (bundle.getBoolean("isFromChallenge")) {
            if (i > C17N.LJIILL(32.0d)) {
                if (LIZ(R.id.hxp).getVisibility() == 8) {
                    LIZ(R.id.hxp).setVisibility(0);
                }
            } else {
                if (LIZ(R.id.hxp).getVisibility() != 0) {
                    return;
                }
                LIZ(R.id.hxp).setVisibility(8);
            }
        }
    }

    public final void LJIILLIIL(String str, String str2) {
        String uuid;
        C59273NOb c59273NOb;
        String str3;
        C59273NOb c59273NOb2;
        C59273NOb c59273NOb3;
        C59273NOb c59273NOb4;
        int i;
        C59273NOb c59273NOb5;
        C59273NOb c59273NOb6;
        C59314NPq c59314NPq;
        C59273NOb c59273NOb7;
        String uuid2;
        String str4;
        String str5 = str2;
        NOJ noj = this.LJLLL;
        if (noj != null) {
            if (!C78857UxB.LJJJIL(str5)) {
                if (C78857UxB.LJJJIL(noj.LJ)) {
                    str5 = noj.LJ;
                } else {
                    str5 = NNT.LIZ(Integer.valueOf(noj.LIZLLL));
                }
            }
            String str6 = null;
            if (CommerceWebCrossToSparkExt.LIZIZ()) {
                C59222NMc adWebModel = ((NWI) LIZ(R.id.uv)).getAdWebModel();
                if (adWebModel != null) {
                    adWebModel.LJIIL = noj.LJIIJ;
                }
                C59222NMc adWebModel2 = ((NWI) LIZ(R.id.uv)).getAdWebModel();
                if (adWebModel2 != null) {
                    adWebModel2.LJIILIIL = System.currentTimeMillis();
                }
                C59222NMc adWebModel3 = ((NWI) LIZ(R.id.uv)).getAdWebModel();
                if (adWebModel3 != null) {
                    adWebModel3.LJ = str5;
                }
                C59222NMc adWebModel4 = ((NWI) LIZ(R.id.uv)).getAdWebModel();
                if (adWebModel4 == null || (uuid2 = adWebModel4.LJIIJ) == null || ujb.o.LJJJJJL(uuid2)) {
                    uuid2 = UUID.randomUUID().toString();
                    C59222NMc adWebModel5 = ((NWI) LIZ(R.id.uv)).getAdWebModel();
                    if (adWebModel5 != null) {
                        o.LJIIIZ(uuid2, "<set-?>");
                        adWebModel5.LJIIJ = uuid2;
                    }
                }
                IAdWebLogService LJFF = AdWebLogService.LJFF();
                AwemeRawAd awemeRawAd = noj.LIZIZ;
                if (awemeRawAd != null) {
                    str4 = awemeRawAd.getCreativeIdStr();
                } else {
                    str4 = null;
                }
                AwemeRawAd awemeRawAd2 = noj.LIZIZ;
                if (awemeRawAd2 != null) {
                    str6 = awemeRawAd2.getLogExtra();
                }
                LJFF.LJ(noj.LJIIJ, str4, noj.LJIIJJI, str6, 1, uuid2, str5, str);
                return;
            }
            AdPopUpWebPageContainer adPopUpWebPageContainer = this.LJLILLLLZI;
            if (adPopUpWebPageContainer != null && (c59314NPq = adPopUpWebPageContainer.LJLJJI) != null && (c59273NOb7 = c59314NPq.LIZIZ) != null) {
                c59273NOb7.LJJIFFI = noj.LJIIJ;
            }
            C59314NPq crossPlatformParams = ((NZQ) LIZ(R.id.hxh)).getCrossPlatformParams();
            if (crossPlatformParams != null && (c59273NOb6 = crossPlatformParams.LIZIZ) != null) {
                c59273NOb6.LJJLI = System.currentTimeMillis();
            }
            C59314NPq crossPlatformParams2 = ((NZQ) LIZ(R.id.hxh)).getCrossPlatformParams();
            if (crossPlatformParams2 != null && (c59273NOb5 = crossPlatformParams2.LIZIZ) != null) {
                c59273NOb5.LJIIIZ = str5;
            }
            C59314NPq crossPlatformParams3 = ((NZQ) LIZ(R.id.hxh)).getCrossPlatformParams();
            if (crossPlatformParams3 != null && (c59273NOb4 = crossPlatformParams3.LIZIZ) != null) {
                AwemeRawAd awemeRawAd3 = noj.LIZIZ;
                if (awemeRawAd3 != null) {
                    i = awemeRawAd3.getPreloadH5Type();
                } else {
                    i = 0;
                }
                c59273NOb4.LJJLIIIJJIZ = i;
            }
            C59314NPq crossPlatformParams4 = ((NZQ) LIZ(R.id.hxh)).getCrossPlatformParams();
            if (crossPlatformParams4 != null && (c59273NOb3 = crossPlatformParams4.LIZIZ) != null) {
                c59273NOb3.LJJLIIIJJI = noj.LJIIL;
            }
            C59314NPq crossPlatformParams5 = ((NZQ) LIZ(R.id.hxh)).getCrossPlatformParams();
            if (crossPlatformParams5 == null || (c59273NOb2 = crossPlatformParams5.LIZIZ) == null || (uuid = c59273NOb2.LJJL) == null || ujb.o.LJJJJJL(uuid)) {
                uuid = UUID.randomUUID().toString();
                C59314NPq crossPlatformParams6 = ((NZQ) LIZ(R.id.hxh)).getCrossPlatformParams();
                if (crossPlatformParams6 != null && (c59273NOb = crossPlatformParams6.LIZIZ) != null) {
                    o.LJIIIZ(uuid, "<set-?>");
                    c59273NOb.LJJL = uuid;
                }
            }
            IAdWebLogService LJFF2 = AdWebLogService.LJFF();
            AwemeRawAd awemeRawAd4 = noj.LIZIZ;
            if (awemeRawAd4 != null) {
                str3 = awemeRawAd4.getCreativeIdStr();
            } else {
                str3 = null;
            }
            AwemeRawAd awemeRawAd5 = noj.LIZIZ;
            if (awemeRawAd5 != null) {
                str6 = awemeRawAd5.getLogExtra();
            }
            LJFF2.LJ(noj.LJIIJ, str3, noj.LJIIJJI, str6, 1, uuid, str5, str);
        }
    }

    public final void LJIJJLI(int i, View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
            marginLayoutParams.topMargin = i;
            view.setLayoutParams(marginLayoutParams);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:238:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x05ed  */
    /* JADX WARN: Removed duplicated region for block: B:296:0x00c0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIILL(java.lang.String r15, int r16, X.NOJ r17) {
        /*
            Method dump skipped, instructions count: 1674
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.NWF.LJIILL(java.lang.String, int, X.NOJ):void");
    }
}
