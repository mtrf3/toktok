package X;

import android.graphics.Bitmap;
import android.net.http.SslError;
import android.os.Build;
import android.view.inputmethod.InputMethodManager;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.widget.FrameLayout;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.experiment.MusicThirdPartyPerformanceConfigModel;
import com.ss.android.ugc.aweme.setting.services.ISettingService;
import com.ss.android.ugc.aweme.setting.services.SettingServiceImpl;
import com.ss.android.ugc.aweme.wiki.AddWikiActivity;
import com.ss.android.ugc.aweme.wiki.CheckAnchorModerationResultResponse;
import com.ss.android.ugc.aweme.wiki.CheckAnchorModerationService;
import com.zhiliaoapp.musically.R;
import ujb.o;
import ujb.s;

/* renamed from: X.NgC, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C59968NgC implements NZX {
    public boolean LJLIL;
    public final /* synthetic */ AddWikiActivity LJLILLLLZI;

    @Override // X.NZX
    public final void LJIILIIL(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
    }

    @Override // X.NZX
    public final boolean LJIILJJIL(WebView webView, String str, WebResourceRequest webResourceRequest, boolean z) {
        return false;
    }

    @Override // X.NZX
    public final void onPageCommitVisible(WebView webView, String str) {
    }

    @Override // X.NZX
    public final void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
    }

    public C59968NgC(AddWikiActivity addWikiActivity) {
        this.LJLILLLLZI = addWikiActivity;
    }

    @Override // X.NZX
    public final void LIZ(WebView webView, String str) {
        boolean z;
        String str2;
        boolean z2;
        String str3;
        C76L<CheckAnchorModerationResultResponse> postCheckAnchorReviewResult;
        AddWikiActivity addWikiActivity = this.LJLILLLLZI;
        addWikiActivity.getClass();
        FrameLayout frameLayout = addWikiActivity.LJLILLLLZI;
        if (frameLayout != null) {
            frameLayout.setVisibility(8);
            if (this.LJLIL) {
                this.LJLILLLLZI.LLILLL("close", true);
                this.LJLILLLLZI.LLILLL("back", true);
                this.LJLILLLLZI.LLILLL("more", false);
                this.LJLILLLLZI.A90(false);
                String LLJJIJIIJIL = C16880lQ.LLJJIJIIJIL(this.LJLILLLLZI.getIntent(), "enter_from");
                if (LLJJIJIIJIL == null || LLJJIJIIJIL.length() == 0) {
                    return;
                }
                if (o.LJJJJIZL(this.LJLILLLLZI.LJLJLLL, "Yelp", true)) {
                    C188727au c188727au = new C188727au();
                    c188727au.LJIIIZ("enter_from", C16880lQ.LLJJIJIIJIL(this.LJLILLLLZI.getIntent(), "enter_from"));
                    c188727au.LJIIIZ("anchor_type", "Yelp");
                    c188727au.LJIIIZ("anchor_entry", C16880lQ.LLJJIJIIJIL(this.LJLILLLLZI.getIntent(), "anchor_entry"));
                    c188727au.LJIIIZ("author_id", C16880lQ.LLJJIJIIJIL(this.LJLILLLLZI.getIntent(), "author_id"));
                    c188727au.LJIIIZ("group_id", C16880lQ.LLJJIJIIJIL(this.LJLILLLLZI.getIntent(), "group_id"));
                    c188727au.LIZLLL(0, "status");
                    c188727au.LJ(System.currentTimeMillis() - this.LJLILLLLZI.LJLLJ, "duration");
                    FMX.LJIIL("request_anchor_detail", c188727au.LIZ);
                    return;
                }
                if (o.LJJJJIZL(this.LJLILLLLZI.LJLJLLL, "TripAdvisor", true)) {
                    C188727au c188727au2 = new C188727au();
                    c188727au2.LJIIIZ("enter_from", C16880lQ.LLJJIJIIJIL(this.LJLILLLLZI.getIntent(), "enter_from"));
                    c188727au2.LJIIIZ("anchor_type", "TripAdvisor");
                    c188727au2.LJIIIZ("anchor_entry", C16880lQ.LLJJIJIIJIL(this.LJLILLLLZI.getIntent(), "anchor_entry"));
                    c188727au2.LJIIIZ("author_id", C16880lQ.LLJJIJIIJIL(this.LJLILLLLZI.getIntent(), "author_id"));
                    c188727au2.LJIIIZ("group_id", C16880lQ.LLJJIJIIJIL(this.LJLILLLLZI.getIntent(), "group_id"));
                    c188727au2.LIZLLL(0, "status");
                    c188727au2.LJ(System.currentTimeMillis() - this.LJLILLLLZI.LJLLJ, "duration");
                    FMX.LJIIL("request_anchor_detail", c188727au2.LIZ);
                    return;
                }
                AddWikiActivity addWikiActivity2 = this.LJLILLLLZI;
                C188727au c188727au3 = new C188727au();
                addWikiActivity2.LLII(c188727au3);
                c188727au3.LIZLLL(0, "status");
                c188727au3.LJ(System.currentTimeMillis() - this.LJLILLLLZI.LJLLJ, "duration");
                FMX.LJIIL("request_wiki_detail", c188727au3.LIZ);
                return;
            }
            android.net.Uri uri = UriProtector.parse(str);
            AddWikiActivity addWikiActivity3 = this.LJLILLLLZI;
            kotlin.jvm.internal.o.LJIIIIZZ(uri, "uri");
            addWikiActivity3.getClass();
            String LLIIJI = AddWikiActivity.LLIIJI(uri, "title");
            if ((((LLIIJI == null || LLIIJI.length() == 0) && (LLIIJI = this.LJLILLLLZI.LJZ) == null) || LLIIJI.length() == 0) && (webView == null || (LLIIJI = webView.getTitle()) == null)) {
                LLIIJI = "";
            }
            if (o.LJJJJIZL(this.LJLILLLLZI.LJLJLLL, "Yelp", true) || o.LJJJJIZL(this.LJLILLLLZI.LJLJLLL, "TripAdvisor", true) || o.LJJJJIZL(this.LJLILLLLZI.LJLJLLL, "Quizlet", true)) {
                z = true;
            } else {
                this.LJLILLLLZI.getClass();
                z = o.LJJJJIZL(AddWikiActivity.LLIIJI(uri, "addButton"), "true", true);
            }
            ISettingService LIZ = SettingServiceImpl.LIZ();
            AddWikiActivity addWikiActivity4 = this.LJLILLLLZI;
            addWikiActivity4.getClass();
            String LLIIJI2 = AddWikiActivity.LLIIJI(uri, "lang");
            if (LLIIJI2 == null) {
                LLIIJI2 = LIZ.getAppLanguage();
            }
            addWikiActivity4.LJLL = LLIIJI2;
            if (o.LJJJJIZL(this.LJLILLLLZI.LJLJLLL, "TripAdvisor", true)) {
                str2 = (String) ListProtector.get(s.LJLJJL(LLIIJI, new String[]{" - "}, 0, 6), 0);
            } else {
                str2 = LLIIJI;
            }
            if (!o.LJJJJIZL(this.LJLILLLLZI.LJLJLLL, "TripAdvisor", true)) {
                o.LJJJJIZL(this.LJLILLLLZI.LJLJLLL, "Yelp", true);
            }
            if (kotlin.jvm.internal.o.LJ(this.LJLILLLLZI.LJLJLLL, "Wiki")) {
                AddWikiActivity addWikiActivity5 = this.LJLILLLLZI;
                if ((z || addWikiActivity5.LLD) && str2.length() > 0) {
                    C59969NgD c59969NgD = CheckAnchorModerationService.LIZ;
                    String currentUrl = this.LJLILLLLZI.LLIL().getCurrentUrl();
                    String str4 = this.LJLILLLLZI.LJLL;
                    if (str4 != null) {
                        c59969NgD.getClass();
                        postCheckAnchorReviewResult = C59969NgD.LIZIZ.postCheckAnchorReviewResult(0, currentUrl, str2, str4, null);
                    } else {
                        kotlin.jvm.internal.o.LJIJI("language");
                        throw null;
                    }
                } else {
                    postCheckAnchorReviewResult = null;
                }
                addWikiActivity5.LJLLI = postCheckAnchorReviewResult;
            }
            String LLJJIJIIJIL2 = C16880lQ.LLJJIJIIJIL(this.LJLILLLLZI.getIntent(), "enter_from");
            if (LLIIJI != null && LLIIJI.length() != 0 && (LLJJIJIIJIL2 == null || LLJJIJIIJIL2.length() == 0 || (str3 = this.LJLILLLLZI.LJLZ) == null || str3.length() == 0)) {
                AddWikiActivity addWikiActivity6 = this.LJLILLLLZI;
                addWikiActivity6.LJLZ = LLIIJI;
                C252709vu LLIIIZ = addWikiActivity6.LLIIIZ();
                C9KF c9kf = new C9KF();
                c9kf.LIZ(LLIIJI);
                String string = this.LJLILLLLZI.getString(R.string.bqa);
                kotlin.jvm.internal.o.LJIIIIZZ(string, "getString(R.string.ancho…webview_you_are_visiting)");
                this.LJLILLLLZI.getClass();
                c9kf.LIZLLL = o.LJJJJZ(string, "%@", AddWikiActivity.LLILLIZIL(str), false);
                LLIIIZ.LJIILLIIL(c9kf);
            }
            AddWikiActivity addWikiActivity7 = this.LJLILLLLZI;
            addWikiActivity7.getClass();
            addWikiActivity7.LJLJLJ = AddWikiActivity.LLIIJI(uri, "keyword");
            AddWikiActivity addWikiActivity8 = this.LJLILLLLZI;
            addWikiActivity8.getClass();
            addWikiActivity8.LJLJL = o.LJJJJIZL(AddWikiActivity.LLIIJI(uri, "noRedirect"), "true", true);
            AddWikiActivity addWikiActivity9 = this.LJLILLLLZI;
            if (!addWikiActivity9.LL) {
                addWikiActivity9.LLILIL(uri);
            }
            this.LJLILLLLZI.getClass();
            AddWikiActivity addWikiActivity10 = this.LJLILLLLZI;
            if (o.LJJJJIZL(addWikiActivity10.LJLJLLL, "Yelp", true)) {
                z2 = false;
                NZQ.LJIJI(addWikiActivity10.LLIL(), "javascript:(function extra(){[].forEach.call(document.getElementsByClassName('lemon--div__32e33__1mboc banner__32e33__39b4o border-color--default__32e33__2oFDT'), el => el.style.display = 'none');document.getElementById('smart-banner').style.display = 'none';document.getElementById('fullscreen-pitch').style.display = 'none';[].forEach.call(document.getElementsByClassName('fullscreen-pitch_close'), el => el.click());})();", false, null, 14);
            } else {
                z2 = false;
                if (o.LJJJJIZL(addWikiActivity10.LJLJLLL, "TripAdvisor", true)) {
                    NZQ.LJIJI(addWikiActivity10.LLIL(), "javascript:(function extra(){[].forEach.call(document.getElementsByClassName('social-ugc-actions-UploaderActionButton__upload_container--1wUKt social-ugc-actions-SocialFab__overlay--31Qvx'), el => el.style.display = 'none');[].forEach.call(document.getElementsByClassName('ppr_rup ppr_priv_daodao_mobile_open_app_smart_button_component'), el => el.style.display = 'none');[].forEach.call(document.getElementsByClassName('cpm-ad-target-mobile-adhesion-MobileAdhesion__fixedAd--23r8Y cpm-ad-target-mobile-adhesion-MobileAdhesion__loaded--24Qa9'), el => el.style.display = 'none');[].forEach.call(document.getElementsByClassName(' daodao-mobile-app-smartbutton-SmartButton__open_app_smartbutton--YE-xh daodao-mobile-app-smartbutton-SmartButton__is_shown--35tcaedAd--23r8Y cpm-ad-target-mobile-adhesion-MobileAdhesion__loaded--24Qa9'), el => el.style.display = 'none');[].forEach.call(document.getElementsByClassName('hotels-hotel-review-persistent-header-and-footer-PersistentHeaderAndFooter__ui_persistent_footer--1MGGe hotels-hotel-review-persistent-header-and-footer-PersistentHeaderAndFooter__fixed--8x8LO'), el => el.style.display = 'none');})();", false, null, 14);
                }
            }
            String anchorSubType = this.LJLILLLLZI.LLI;
            kotlin.jvm.internal.o.LJIIIZ(anchorSubType, "anchorSubType");
            MusicThirdPartyPerformanceConfigModel musicThirdPartyPerformanceConfigModel = (MusicThirdPartyPerformanceConfigModel) SettingsManager.LIZLLL().LJIIIIZZ("music_third_party_performance_config", MusicThirdPartyPerformanceConfigModel.class, C35973E9x.LIZ);
            if (musicThirdPartyPerformanceConfigModel == null) {
                musicThirdPartyPerformanceConfigModel = new MusicThirdPartyPerformanceConfigModel();
            }
            if (musicThirdPartyPerformanceConfigModel.enable && musicThirdPartyPerformanceConfigModel.subType.contains(anchorSubType)) {
                this.LJLILLLLZI.LLIL().LJLLLL.LIZ().evaluateJavascript("\"use strict\";(function(){function perfReport(){function getFCP(){var _performance$getEntri,_performance$getEntri2;return((_performance$getEntri=performance.getEntriesByName('first-contentful-paint'))===null||_performance$getEntri===void 0?void 0:(_performance$getEntri2=_performance$getEntri[0])===null||_performance$getEntri2===void 0?void 0:_performance$getEntri2.startTime)||-1}function getPerfTiming(){const obj={};for(let i in performance.timing){const val=performance.timing[i];if(typeof val==='number'){obj[i]=val}}return obj}function calcPerfDuration(pf){return{connect:pf.connectEnd-pf.connectStart,domReady:pf.domComplete-pf.responseEnd,request:pf.responseEnd-pf.requestStart,redirect:pf.redirectEnd-pf.redirectStart,ttfb:pf.responseStart-pf.navigationStart,loadPage:pf.loadEventEnd-pf.navigationStart,lookupDomain:pf.domainLookupEnd-pf.domainLookupStart}}const perf=getPerfTiming();return{eventName:'music_third_party_performance',url:(location.origin+location.pathname),...perf,...calcPerfDuration(perf),fcp:getFCP()}}return perfReport()})();", new C59970NgE(uri, this.LJLILLLLZI));
            }
            this.LJLILLLLZI.A90(z2);
            if (LLJJIJIIJIL2 != null && LLJJIJIIJIL2.length() != 0) {
                if (o.LJJJJIZL(this.LJLILLLLZI.LJLJLLL, "Yelp", true)) {
                    C188727au c188727au4 = new C188727au();
                    c188727au4.LJIIIZ("enter_from", C16880lQ.LLJJIJIIJIL(this.LJLILLLLZI.getIntent(), "enter_from"));
                    c188727au4.LJIIIZ("anchor_type", "Yelp");
                    c188727au4.LJIIIZ("anchor_entry", C16880lQ.LLJJIJIIJIL(this.LJLILLLLZI.getIntent(), "anchor_entry"));
                    c188727au4.LJIIIZ("author_id", C16880lQ.LLJJIJIIJIL(this.LJLILLLLZI.getIntent(), "author_id"));
                    c188727au4.LJIIIZ("group_id", C16880lQ.LLJJIJIIJIL(this.LJLILLLLZI.getIntent(), "group_id"));
                    c188727au4.LIZLLL(1, "status");
                    c188727au4.LJ(System.currentTimeMillis() - this.LJLILLLLZI.LJLLJ, "duration");
                    FMX.LJIIL("request_anchor_detail", c188727au4.LIZ);
                } else if (o.LJJJJIZL(this.LJLILLLLZI.LJLJLLL, "TripAdvisor", true)) {
                    C188727au c188727au5 = new C188727au();
                    c188727au5.LJIIIZ("enter_from", C16880lQ.LLJJIJIIJIL(this.LJLILLLLZI.getIntent(), "enter_from"));
                    c188727au5.LJIIIZ("anchor_type", "TripAdvisor");
                    c188727au5.LJIIIZ("anchor_entry", C16880lQ.LLJJIJIIJIL(this.LJLILLLLZI.getIntent(), "anchor_entry"));
                    c188727au5.LJIIIZ("author_id", C16880lQ.LLJJIJIIJIL(this.LJLILLLLZI.getIntent(), "author_id"));
                    c188727au5.LJIIIZ("group_id", C16880lQ.LLJJIJIIJIL(this.LJLILLLLZI.getIntent(), "group_id"));
                    c188727au5.LIZLLL(1, "status");
                    c188727au5.LJ(System.currentTimeMillis() - this.LJLILLLLZI.LJLLJ, "duration");
                    FMX.LJIIL("request_anchor_detail", c188727au5.LIZ);
                } else if (o.LJJJJIZL(this.LJLILLLLZI.LJLJLLL, "Quizlet", true)) {
                    C188727au c188727au6 = new C188727au();
                    c188727au6.LJIIIZ("enter_from", C16880lQ.LLJJIJIIJIL(this.LJLILLLLZI.getIntent(), "enter_from"));
                    c188727au6.LJIIIZ("anchor_type", "Quizlet");
                    c188727au6.LJIIIZ("anchor_entry", C16880lQ.LLJJIJIIJIL(this.LJLILLLLZI.getIntent(), "anchor_entry"));
                    c188727au6.LJIIIZ("author_id", C16880lQ.LLJJIJIIJIL(this.LJLILLLLZI.getIntent(), "author_id"));
                    c188727au6.LJIIIZ("group_id", C16880lQ.LLJJIJIIJIL(this.LJLILLLLZI.getIntent(), "group_id"));
                    c188727au6.LIZLLL(1, "status");
                    c188727au6.LJ(System.currentTimeMillis() - this.LJLILLLLZI.LJLLJ, "duration");
                    FMX.LJIIL("request_anchor_detail", c188727au6.LIZ);
                } else {
                    AddWikiActivity addWikiActivity11 = this.LJLILLLLZI;
                    C188727au c188727au7 = new C188727au();
                    addWikiActivity11.LLII(c188727au7);
                    c188727au7.LIZLLL(1, "status");
                    c188727au7.LJ(System.currentTimeMillis() - this.LJLILLLLZI.LJLLJ, "duration");
                    FMX.LJIIL("request_wiki_detail", c188727au7.LIZ);
                }
            }
            AddWikiActivity addWikiActivity12 = this.LJLILLLLZI;
            if (addWikiActivity12.LJLLILLLL) {
                addWikiActivity12.LJLLILLLL = false;
                Object LLILZLL = C16880lQ.LLILZLL(addWikiActivity12, "input_method");
                kotlin.jvm.internal.o.LJII(LLILZLL, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
                ((InputMethodManager) LLILZLL).showSoftInput(this.LJLILLLLZI.LLIIJLIL().getView(), 1);
                return;
            }
            return;
        }
        kotlin.jvm.internal.o.LJIJI("webViewMask");
        throw null;
    }

    @Override // X.NZX
    public final void LJ(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        if (webResourceRequest != null && webResourceRequest.isForMainFrame()) {
            this.LJLIL = true;
        }
    }

    @Override // X.NZX
    public final void LJIIL(WebView webView, String str, Bitmap bitmap) {
        this.LJLIL = false;
        if (kotlin.jvm.internal.o.LJ(C16880lQ.LLJJIJIIJIL(this.LJLILLLLZI.getIntent(), "anchor_type"), "News")) {
            String str2 = this.LJLILLLLZI.LJZ;
            if (str2.length() == 0 && (webView == null || (str2 = webView.getTitle()) == null)) {
                str2 = "";
            }
            AddWikiActivity addWikiActivity = this.LJLILLLLZI;
            addWikiActivity.LJLZ = str2;
            C252709vu LLIIIZ = addWikiActivity.LLIIIZ();
            C9KF c9kf = new C9KF();
            c9kf.LIZJ = str2;
            String string = this.LJLILLLLZI.getString(R.string.bqa);
            kotlin.jvm.internal.o.LJIIIIZZ(string, "getString(R.string.ancho…webview_you_are_visiting)");
            this.LJLILLLLZI.getClass();
            c9kf.LIZLLL = o.LJJJJZ(string, "%@", AddWikiActivity.LLILLIZIL(str), false);
            LLIIIZ.LJIILLIIL(c9kf);
            AddWikiActivity addWikiActivity2 = this.LJLILLLLZI;
            android.net.Uri parse = UriProtector.parse(str);
            kotlin.jvm.internal.o.LJIIIIZZ(parse, "parse(url)");
            addWikiActivity2.LLILIL(parse);
        }
    }

    @Override // X.NZX
    public final void LJFF(WebView webView, int i, String str, String str2) {
        if (Build.VERSION.SDK_INT >= 23) {
            return;
        }
        this.LJLIL = true;
    }
}
