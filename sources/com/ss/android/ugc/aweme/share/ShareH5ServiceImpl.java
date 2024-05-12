package com.ss.android.ugc.aweme.share;

import X.AbstractC37353ElJ;
import X.C113554cx;
import X.C16880lQ;
import X.C38049EwX;
import X.C38281F0r;
import X.C51029K0z;
import X.C59484NWe;
import X.C61861OPp;
import X.C61868OPw;
import X.C73969T1h;
import X.F3T;
import X.NTL;
import X.NUT;
import X.NZR;
import X.OM1;
import X.OQ1;
import X.OSZ;
import X.X1D;
import Y.ARunnableS46S0100000_10;
import android.text.TextUtils;
import android.webkit.WebView;
import com.ss.android.ugc.aweme.bullet.bridge.framework.ShareMethod;
import com.ss.android.ugc.aweme.bullet.bridge.framework.ShareSearchMethod;
import com.ss.android.ugc.aweme.bullet.business.AbsShareBusiness;
import com.ss.android.ugc.aweme.bullet.business.ShareBusiness;
import com.ss.android.ugc.aweme.fe.method.PushOperationMethod;
import com.ss.android.ugc.aweme.fe.method.ShareLiveEventMethod;
import com.ss.android.ugc.aweme.spark.business.AbsSparkShareBusiness;
import com.ss.android.ugc.aweme.spark.business.SparkShareBusiness;
import java.util.Map;
import kotlin.jvm.internal.o;
import ujb.s;

/* loaded from: classes11.dex */
public final class ShareH5ServiceImpl implements ShareH5Service {
    @Override // com.ss.android.ugc.aweme.share.ShareH5Service
    public final Map<String, Class<?>> LIZIZ() {
        return C113554cx.LJJL(new OSZ("share", ShareMethod.class), new OSZ("shareSearch", ShareSearchMethod.class));
    }

    @Override // com.ss.android.ugc.aweme.share.ShareH5Service
    public final void LJFF() {
    }

    @Override // com.ss.android.ugc.aweme.share.ShareH5Service
    public final void LJII() {
    }

    @Override // com.ss.android.ugc.aweme.share.ShareH5Service
    public final void LJIILLIIL() {
    }

    @Override // com.ss.android.ugc.aweme.share.ShareH5Service
    public final ShareSearchMethod LIZJ(F3T contextProviderFactory) {
        o.LJIIIZ(contextProviderFactory, "contextProviderFactory");
        return new ShareSearchMethod(contextProviderFactory);
    }

    @Override // com.ss.android.ugc.aweme.share.ShareH5Service
    public final void LJIIIIZZ(AbstractC37353ElJ abstractC37353ElJ) {
        AbsSparkShareBusiness absSparkShareBusiness = (AbsSparkShareBusiness) abstractC37353ElJ.LIZ(SparkShareBusiness.class);
        if (absSparkShareBusiness != null) {
            C73969T1h.LIZIZ().LIZIZ(new ARunnableS46S0100000_10(absSparkShareBusiness, 170));
        }
    }

    @Override // com.ss.android.ugc.aweme.share.ShareH5Service
    public final void LJIIJ(NUT bulletBusiness) {
        o.LJIIIZ(bulletBusiness, "bulletBusiness");
        AbsShareBusiness absShareBusiness = (AbsShareBusiness) bulletBusiness.LIZ(ShareBusiness.class);
        if (absShareBusiness != null) {
            C73969T1h.LIZIZ().LIZIZ(new ARunnableS46S0100000_10(absShareBusiness, 123));
        }
    }

    @Override // com.ss.android.ugc.aweme.share.ShareH5Service
    public final Map<String, Object> LJIILIIL(NUT bulletBusiness) {
        o.LJIIIZ(bulletBusiness, "bulletBusiness");
        AbsShareBusiness absShareBusiness = (AbsShareBusiness) bulletBusiness.LIZ(ShareBusiness.class);
        if (absShareBusiness != null) {
            return C51029K0z.LJJIIZI(new OSZ("local_obj", absShareBusiness.LJII));
        }
        return C113554cx.LJJJLIIL();
    }

    @Override // com.ss.android.ugc.aweme.share.ShareH5Service
    public final ShareMethod LJIILJJIL(F3T contextProviderFactory) {
        o.LJIIIZ(contextProviderFactory, "contextProviderFactory");
        return new ShareMethod(contextProviderFactory);
    }

    @Override // com.ss.android.ugc.aweme.share.ShareH5Service
    public final ShareLiveEventMethod LJIIZILJ(C38049EwX c38049EwX) {
        return new ShareLiveEventMethod(c38049EwX);
    }

    @Override // com.ss.android.ugc.aweme.share.ShareH5Service
    public final com.ss.android.ugc.aweme.fe.method.ShareMethod LJIJI(C38049EwX c38049EwX) {
        return new com.ss.android.ugc.aweme.fe.method.ShareMethod(c38049EwX);
    }

    @Override // com.ss.android.ugc.aweme.share.ShareH5Service
    public final Map LJIL(AbstractC37353ElJ abstractC37353ElJ) {
        AbsSparkShareBusiness absSparkShareBusiness = (AbsSparkShareBusiness) abstractC37353ElJ.LIZ(SparkShareBusiness.class);
        if (absSparkShareBusiness != null) {
            return C51029K0z.LJJIIZI(new OSZ("local_obj", absSparkShareBusiness.LJII));
        }
        return C113554cx.LJJJLIIL();
    }

    @Override // com.ss.android.ugc.aweme.share.ShareH5Service
    public final PushOperationMethod LJJII(C38049EwX c38049EwX) {
        return new PushOperationMethod(c38049EwX);
    }

    @Override // com.ss.android.ugc.aweme.share.ShareH5Service
    public final void LIZ(AbstractC37353ElJ abstractC37353ElJ, WebView webView) {
        if (abstractC37353ElJ.LIZ(SparkShareBusiness.class) != null && webView != null) {
            C16880lQ.LLZZ(webView, "javascript: function getMetaContent(name) {            var item = document.getElementsByTagName('meta')[name];            if (item != null) {            return item.getAttribute('content');}            else {return null}        }        function getAwemeMetaDatas() {        var aweme = new Object();        aweme.source = 'native';        aweme.title = getMetaContent('aweme:title');        aweme.desc = getMetaContent('aweme:description');        aweme.image = getMetaContent('aweme:image');        aweme.url = getMetaContent('aweme:url');        aweme.innerUrl = getMetaContent('aweme:innerUrl');        aweme.qrcode = getMetaContent('aweme:qrcode');        aweme.shareitems = getMetaContent('aweme:shareitems');        aweme.sharetips = getMetaContent('aweme:share:tips');        return JSON.stringify(aweme);        }        window.local_obj.showSource(window.__title__, getAwemeMetaDatas());");
        }
    }

    @Override // com.ss.android.ugc.aweme.share.ShareH5Service
    public final void LIZLLL(NUT bulletBusiness, String str) {
        o.LJIIIZ(bulletBusiness, "bulletBusiness");
        AbsShareBusiness absShareBusiness = (AbsShareBusiness) bulletBusiness.LIZ(ShareBusiness.class);
        if (absShareBusiness != null) {
            absShareBusiness.LJ = str;
        }
    }

    @Override // com.ss.android.ugc.aweme.share.ShareH5Service
    public final void LJ(NUT bulletBusiness, String str) {
        o.LJIIIZ(bulletBusiness, "bulletBusiness");
        AbsShareBusiness absShareBusiness = (AbsShareBusiness) bulletBusiness.LIZ(ShareBusiness.class);
        if (absShareBusiness != null && !TextUtils.isEmpty(str)) {
            absShareBusiness.LIZJ = null;
            absShareBusiness.LJ = str;
        }
    }

    @Override // com.ss.android.ugc.aweme.share.ShareH5Service
    public final void LJI(AbstractC37353ElJ abstractC37353ElJ, boolean z) {
        AbsSparkShareBusiness absSparkShareBusiness = (AbsSparkShareBusiness) abstractC37353ElJ.LIZ(SparkShareBusiness.class);
        if (absSparkShareBusiness != null) {
            absSparkShareBusiness.LJFF = z;
        }
    }

    @Override // com.ss.android.ugc.aweme.share.ShareH5Service
    public final void LJIIIZ(NUT bulletBusiness, OM1 om1) {
        o.LJIIIZ(bulletBusiness, "bulletBusiness");
        ShareBusiness shareBusiness = (ShareBusiness) bulletBusiness.LIZ(ShareBusiness.class);
        if (shareBusiness != null) {
            shareBusiness.LJIIIIZZ = om1;
        }
    }

    @Override // com.ss.android.ugc.aweme.share.ShareH5Service
    public final void LJIIL(AbstractC37353ElJ abstractC37353ElJ, WebView webView) {
        SparkShareBusiness sparkShareBusiness = (SparkShareBusiness) abstractC37353ElJ.LIZ(SparkShareBusiness.class);
        if (sparkShareBusiness != null) {
            sparkShareBusiness.LJIIIIZZ = webView;
        }
    }

    @Override // com.ss.android.ugc.aweme.share.ShareH5Service
    public final void LJIILL(NUT bulletBusiness, OM1 om1) {
        o.LJIIIZ(bulletBusiness, "bulletBusiness");
        if (bulletBusiness.LIZ(ShareBusiness.class) != null && om1 != null) {
            C16880lQ.LLZZ(om1, "javascript: function getMetaContent(name) {            var item = document.getElementsByTagName('meta')[name];            if (item != null) {            return item.getAttribute('content');}            else {return null}        }        function getAwemeMetaDatas() {        var aweme = new Object();        aweme.source = 'native';        aweme.title = getMetaContent('aweme:title');        aweme.desc = getMetaContent('aweme:description');        aweme.image = getMetaContent('aweme:image');        aweme.url = getMetaContent('aweme:url');        aweme.innerUrl = getMetaContent('aweme:innerUrl');        aweme.qrcode = getMetaContent('aweme:qrcode');        aweme.shareitems = getMetaContent('aweme:shareitems');        aweme.sharetips = getMetaContent('aweme:share:tips');        return JSON.stringify(aweme);        }        window.local_obj.showSource(window.__title__, getAwemeMetaDatas());");
        }
    }

    @Override // com.ss.android.ugc.aweme.share.ShareH5Service
    public final void LJIJ(AbstractC37353ElJ abstractC37353ElJ, Map map) {
        Map<String, String> params;
        C61868OPw LIZ = abstractC37353ElJ.LIZ(SparkShareBusiness.class);
        if (LIZ != null && (params = LIZ.LIZ.getParams()) != null) {
            params.putAll(map);
        }
    }

    @Override // com.ss.android.ugc.aweme.share.ShareH5Service
    public final void LJIJJ(NTL ntl, int i) {
        if (ntl != null) {
            com.ss.android.ugc.aweme.crossplatform.business.AbsShareBusiness absShareBusiness = (com.ss.android.ugc.aweme.crossplatform.business.AbsShareBusiness) ((C59484NWe) ntl).LIZ(OQ1.LIZ(i));
            if (absShareBusiness != null) {
                C73969T1h.LIZIZ().LIZIZ(new ARunnableS46S0100000_10(absShareBusiness, 235));
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.share.ShareH5Service
    public final void LJJI(NUT bulletBusiness, boolean z) {
        o.LJIIIZ(bulletBusiness, "bulletBusiness");
        AbsShareBusiness absShareBusiness = (AbsShareBusiness) bulletBusiness.LIZ(ShareBusiness.class);
        if (absShareBusiness != null) {
            absShareBusiness.LJFF = z;
        }
    }

    @Override // com.ss.android.ugc.aweme.share.ShareH5Service
    public final void LJJIFFI(AbstractC37353ElJ abstractC37353ElJ, String str) {
        AbsSparkShareBusiness absSparkShareBusiness = (AbsSparkShareBusiness) abstractC37353ElJ.LIZ(SparkShareBusiness.class);
        if (absSparkShareBusiness != null) {
            absSparkShareBusiness.LJ = str;
        }
    }

    @Override // com.ss.android.ugc.aweme.share.ShareH5Service
    public final void LJIIJJI(NTL ntl, NZR webView, int i) {
        o.LJIIIZ(webView, "webView");
        if (ntl != null) {
            com.ss.android.ugc.aweme.crossplatform.business.AbsShareBusiness absShareBusiness = (com.ss.android.ugc.aweme.crossplatform.business.AbsShareBusiness) ((C59484NWe) ntl).LIZ(OQ1.LIZ(i));
            if (absShareBusiness != null) {
                absShareBusiness.LJIIIZ = webView;
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("javascript: function getMetaContent(name) {            var item = document.getElementsByTagName('meta')[name];            if (item != null) {            return item.getAttribute('content');}            else {return null}        }        function getAwemeMetaDatas() {        var aweme = new Object();        aweme.source = 'native';        aweme.title = getMetaContent('aweme:title');        aweme.desc = getMetaContent('aweme:description');        aweme.image = getMetaContent('aweme:image');        aweme.url = getMetaContent('aweme:url');        aweme.innerUrl = getMetaContent('aweme:innerUrl');        aweme.qrcode = getMetaContent('aweme:qrcode');        aweme.shareitems = getMetaContent('aweme:shareitems');        aweme.sharetips = getMetaContent('aweme:share:tips');        return JSON.stringify(aweme);        }");
                LIZ.append("window.local_obj.showSource(window.__title__, getAwemeMetaDatas());");
                webView.loadUrl(X1D.LIZIZ(LIZ));
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.share.ShareH5Service
    public final void LJIJJLI(NTL ntl, NZR webView, int i) {
        o.LJIIIZ(webView, "webView");
        if (ntl != null) {
            com.ss.android.ugc.aweme.crossplatform.business.AbsShareBusiness absShareBusiness = (com.ss.android.ugc.aweme.crossplatform.business.AbsShareBusiness) ((C59484NWe) ntl).LIZ(OQ1.LIZ(i));
            if (absShareBusiness != null) {
                if (absShareBusiness.LJIIIIZZ == null) {
                    absShareBusiness.LJIIIIZZ = new C61861OPp(absShareBusiness);
                }
                webView.setJavaScriptEnabled(true);
                C61861OPp c61861OPp = absShareBusiness.LJIIIIZZ;
                o.LJI(c61861OPp);
                webView.addJavascriptInterfaceOut(c61861OPp, "local_obj");
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.share.ShareH5Service
    public final void LJJ(NTL ntl, String str, int i) {
        if (ntl != null) {
            com.ss.android.ugc.aweme.crossplatform.business.AbsShareBusiness absShareBusiness = (com.ss.android.ugc.aweme.crossplatform.business.AbsShareBusiness) ((C59484NWe) ntl).LIZ(OQ1.LIZ(i));
            if (absShareBusiness != null && !TextUtils.isEmpty(str)) {
                absShareBusiness.LIZLLL = null;
                if (absShareBusiness.LIZIZ.LIZIZ.LIZ != 0 && str != null && !s.LJJJLZIJ(str, "is_ad_landing_page=1", false)) {
                    C38281F0r c38281F0r = new C38281F0r(str);
                    c38281F0r.LIZ(1, "is_ad_landing_page");
                    str = c38281F0r.LJ();
                }
                absShareBusiness.LJI = str;
            }
        }
    }
}
