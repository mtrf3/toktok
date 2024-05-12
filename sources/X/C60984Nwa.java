package X;

import Y.AObserverS74S0200000_10;
import android.R;
import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.lifecycle.ViewModelProviders;
import com.bytedance.lynx.hybrid.webkit.WebKitView;
import com.ss.android.ugc.aweme.search.thirdpartylandingpage.core.model.SearchLandingPageButtonInfo;
import com.ss.android.ugc.aweme.search.thirdpartylandingpage.core.viewmodel.SearchLandingPageViewModel;
import kotlin.jvm.internal.o;
import q03.IDaS203S0200000_10;

/* renamed from: X.Nwa, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C60984Nwa extends AbstractC60811Ntn {
    public final boolean LJLILLLLZI;
    public final FP9 LJLJI;
    public boolean LJLJJI;
    public View LJLJJL;
    public boolean LJLJJLL;

    @Override // X.AbstractC60673NrZ
    public final void LJJJJJ(InterfaceC60761Nsz view) {
        WebKitView webKitView;
        o.LJIIIZ(view, "view");
        if (C19N.LJ("search_third_party_perf_js", false) && (view instanceof WebKitView) && view != null && (webKitView = (WebKitView) view) != null) {
            if (o.LJ(C60983NwZ.LIZ, "safe") || o.LJ(C60983NwZ.LIZ, "loading")) {
                webKitView.evaluateJavascript("\"use strict\";(function(){function perfReport(){function getFCP(){var _performance$getEntri,_performance$getEntri2;return((_performance$getEntri=performance.getEntriesByName('first-contentful-paint'))===null||_performance$getEntri===void 0?void 0:(_performance$getEntri2=_performance$getEntri[0])===null||_performance$getEntri2===void 0?void 0:_performance$getEntri2.startTime)||-1}function getPerfTiming(){const obj={};for(let i in performance.timing){const val=performance.timing[i];if(typeof val==='number'){obj[i]=val}}return obj}function calcPerfDuration(pf){return{connect:pf.connectEnd-pf.connectStart,domReady:pf.domComplete-pf.responseEnd,request:pf.responseEnd-pf.requestStart,redirect:pf.redirectEnd-pf.redirectStart,ttfb:pf.responseStart-pf.navigationStart,loadPage:pf.loadEventEnd-pf.navigationStart,lookupDomain:pf.domainLookupEnd-pf.domainLookupStart}}const perf=getPerfTiming();return{eventName:'search_third_party',url:location.href,...perf,...calcPerfDuration(perf),fcp:getFCP()}}return perfReport()})();", new C35974E9y(webKitView));
            }
        }
    }

    @Override // X.AbstractC60673NrZ
    public final void LJJJJLI(InterfaceC60761Nsz interfaceC60761Nsz) {
        String str;
        if (C60986Nwc.LJI != null && (interfaceC60761Nsz instanceof WebKitView)) {
            WebKitView webKitView = (WebKitView) interfaceC60761Nsz;
            TextView textView = new TextView(webKitView.getContext());
            SearchLandingPageButtonInfo searchLandingPageButtonInfo = C60986Nwc.LJI;
            if (searchLandingPageButtonInfo == null || (str = searchLandingPageButtonInfo.getButtonText()) == null) {
                str = "";
            }
            textView.setText(str);
            if (Build.VERSION.SDK_INT >= 23) {
                textView.setTextAppearance(R.style.TextAppearance.Material.Body2);
            } else {
                textView.setTypeface(null, 1);
            }
            textView.setTextSize(1, 14.0f);
            textView.setTextColor(-1);
            textView.setBackgroundResource(com.zhiliaoapp.musically.R.drawable.c16);
            textView.setPadding(C7MY.LIZIZ(20), C7MY.LIZIZ(10), C7MY.LIZIZ(20), O6R.LJJIIZ(C32151Nz.LJIIZILJ(10)));
            textView.setLines(1);
            C023107f.LIZIZ(textView, 12, 14, 1, 1);
            textView.setElevation(C32151Nz.LJIIZILJ(1));
            textView.setEllipsize(TextUtils.TruncateAt.END);
            textView.setGravity(17);
            textView.setIncludeFontPadding(false);
            C16880lQ.LJIIJ(new IDaS203S0200000_10(interfaceC60761Nsz, this, 1), textView);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
            layoutParams.gravity = 81;
            layoutParams.bottomMargin = C7MY.LIZIZ(50);
            layoutParams.leftMargin = C7MY.LIZIZ(16);
            layoutParams.rightMargin = C7MY.LIZIZ(16);
            textView.setLayoutParams(layoutParams);
            this.LJLJJL = textView;
            webKitView.setWebScrollListener(new C60985Nwb(interfaceC60761Nsz, this));
            Context context = webKitView.getContext();
            o.LJIIIIZZ(context, "view.context");
            ActivityC45651qj LJJIFFI = C45804HyK.LJJIFFI(context);
            if (LJJIFFI != null) {
                ((SearchLandingPageViewModel) ViewModelProviders.of(LJJIFFI).get(SearchLandingPageViewModel.class)).LJLJJLL.observe(LJJIFFI, new AObserverS74S0200000_10(interfaceC60761Nsz, this, 2));
            }
        }
    }

    public C60984Nwa(boolean z, FP9 fp9) {
        this.LJLILLLLZI = z;
        this.LJLJI = fp9;
    }

    @Override // X.AbstractC60673NrZ
    public final void LJJJJJL(InterfaceC60761Nsz view, String url) {
        FP9 fp9;
        o.LJIIIZ(view, "view");
        o.LJIIIZ(url, "url");
        if (this.LJLILLLLZI && (fp9 = this.LJLJI) != null) {
            fp9.LIZ(url);
        }
        if (this.LJLJJI) {
            if (o.LJ(C60983NwZ.LIZ, "no_internet") || o.LJ(C60983NwZ.LIZ, "broken")) {
                C60983NwZ.LIZ = "safe";
                SearchLandingPageViewModel searchLandingPageViewModel = C60983NwZ.LJI;
                if (searchLandingPageViewModel != null) {
                    searchLandingPageViewModel.gv0("safe");
                    C60983NwZ.LIZLLL = true;
                } else {
                    o.LJIJI("pageViewModel");
                    throw null;
                }
            }
            this.LJLJJI = false;
            C60983NwZ.LIZLLL = false;
        }
        super.LJJJJJL(view, url);
    }

    @Override // X.AbstractC60673NrZ
    public final void LJJJJI(InterfaceC60761Nsz view, String url, String str) {
        o.LJIIIZ(view, "view");
        o.LJIIIZ(url, "url");
        super.LJJJJI(view, url, str);
        if (!this.LJLJJI) {
            this.LJLJJI = true;
            C60983NwZ.LIZLLL = true;
        }
    }
}
