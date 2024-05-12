package X;

import android.text.TextUtils;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.lynx.hybrid.webkit.WebKitView;
import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.aweme.experiment.MusicThirdPartyPerformanceConfigModel;
import kotlin.jvm.internal.o;

/* renamed from: X.FlN, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39905FlN extends AbstractC60811Ntn {
    public final String LJLILLLLZI;
    public boolean LJLJI;

    public C39905FlN(String str) {
        this.LJLILLLLZI = str;
    }

    @Override // X.AbstractC60673NrZ
    public final void LJJJJJ(InterfaceC60761Nsz view) {
        WebKitView webKitView;
        o.LJIIIZ(view, "view");
        if (o.LJ(C60119Nid.LIZ, "safe") || o.LJ(C60119Nid.LIZ, "loading")) {
            String anchorSubType = this.LJLILLLLZI;
            o.LJIIIZ(anchorSubType, "anchorSubType");
            MusicThirdPartyPerformanceConfigModel musicThirdPartyPerformanceConfigModel = (MusicThirdPartyPerformanceConfigModel) SettingsManager.LIZLLL().LJIIIIZZ("music_third_party_performance_config", MusicThirdPartyPerformanceConfigModel.class, C35973E9x.LIZ);
            if (musicThirdPartyPerformanceConfigModel == null) {
                musicThirdPartyPerformanceConfigModel = new MusicThirdPartyPerformanceConfigModel();
            }
            if (musicThirdPartyPerformanceConfigModel.enable && musicThirdPartyPerformanceConfigModel.subType.contains(anchorSubType) && (view instanceof WebKitView) && view != null && (webKitView = (WebKitView) view) != null) {
                String url = webKitView.getUrl();
                if (TextUtils.isEmpty(url)) {
                    return;
                }
                webKitView.evaluateJavascript("\"use strict\";(function(){function perfReport(){function getFCP(){var _performance$getEntri,_performance$getEntri2;return((_performance$getEntri=performance.getEntriesByName('first-contentful-paint'))===null||_performance$getEntri===void 0?void 0:(_performance$getEntri2=_performance$getEntri[0])===null||_performance$getEntri2===void 0?void 0:_performance$getEntri2.startTime)||-1}function getPerfTiming(){const obj={};for(let i in performance.timing){const val=performance.timing[i];if(typeof val==='number'){obj[i]=val}}return obj}function calcPerfDuration(pf){return{connect:pf.connectEnd-pf.connectStart,domReady:pf.domComplete-pf.responseEnd,request:pf.responseEnd-pf.requestStart,redirect:pf.redirectEnd-pf.redirectStart,ttfb:pf.responseStart-pf.navigationStart,loadPage:pf.loadEventEnd-pf.navigationStart,lookupDomain:pf.domainLookupEnd-pf.domainLookupStart}}const perf=getPerfTiming();return{eventName:'music_third_party_performance',url:(location.origin+location.pathname),...perf,...calcPerfDuration(perf),fcp:getFCP()}}return perfReport()})();", new C37754Erm(UriProtector.parse(url), webKitView));
            }
        }
    }

    @Override // X.AbstractC60673NrZ
    public final void LJJJJJL(InterfaceC60761Nsz view, String url) {
        o.LJIIIZ(view, "view");
        o.LJIIIZ(url, "url");
        if (this.LJLJI) {
            C60119Nid.LIZ();
            this.LJLJI = false;
            C60119Nid.LIZLLL = false;
        }
        super.LJJJJJL(view, url);
    }

    @Override // X.AbstractC60673NrZ
    public final void LJJJJI(InterfaceC60761Nsz view, String url, String str) {
        o.LJIIIZ(view, "view");
        o.LJIIIZ(url, "url");
        super.LJJJJI(view, url, str);
        if (!this.LJLJI) {
            this.LJLJI = true;
            C60119Nid.LIZLLL = true;
        }
    }
}
