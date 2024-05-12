package com.ss.android.ugc.aweme.crossplatform.business;

import X.C16880lQ;
import X.C59273NOb;
import X.C59314NPq;
import X.C59484NWe;
import X.NP6;
import android.text.TextUtils;
import android.webkit.WebView;
import com.ss.android.ugc.aweme.crossplatform.business.BusinessService;

/* loaded from: classes11.dex */
public class XpathBusiness extends BusinessService.Business {
    public XpathBusiness(C59484NWe c59484NWe) {
        super(c59484NWe);
    }

    public void xpathDirect(C59314NPq c59314NPq, WebView webView) {
        if (c59314NPq == null) {
            return;
        }
        C59273NOb c59273NOb = c59314NPq.LIZIZ;
        long j = c59273NOb.LIZ;
        String str = c59273NOb.LJIIZILJ;
        if (j > 0 && !TextUtils.isEmpty(str) && !TextUtils.isEmpty(null) && webView != null) {
            C16880lQ.LLZZ(webView, null);
        }
        NP6.LIZ.getClass();
    }
}
