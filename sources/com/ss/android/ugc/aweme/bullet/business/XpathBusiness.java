package com.ss.android.ugc.aweme.bullet.business;

import X.C16880lQ;
import X.C59472NVs;
import X.C59478NVy;
import X.N5S;
import X.NP0;
import X.NP1;
import X.NP6;
import android.text.TextUtils;
import android.webkit.WebView;
import com.ss.android.ugc.aweme.bullet.business.BulletBusinessService;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class XpathBusiness extends BulletBusinessService.Business {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public XpathBusiness(N5S bulletBusiness) {
        super(bulletBusiness);
        o.LJIIIZ(bulletBusiness, "bulletBusiness");
    }

    public final void xpathDirect(WebView webView) {
        NP1 np1;
        long j;
        NP1 np12;
        C59478NVy c59478NVy;
        NP0 np0;
        Long value;
        C59472NVs c59472NVs = this.LIZ.LIZIZ;
        String str = null;
        if (c59472NVs instanceof NP1) {
            np1 = (NP1) c59472NVs;
        } else {
            np1 = null;
        }
        if (np1 != null && (np0 = np1.LJJZ) != null && (value = np0.getValue()) != null) {
            j = value.longValue();
        } else {
            j = 0;
        }
        C59472NVs c59472NVs2 = this.LIZ.LIZIZ;
        if ((c59472NVs2 instanceof NP1) && (np12 = (NP1) c59472NVs2) != null && (c59478NVy = np12.LJLLL) != null) {
            str = (String) c59478NVy.getValue();
        }
        if (j > 0 && !TextUtils.isEmpty(str) && !TextUtils.isEmpty("") && webView != null) {
            C16880lQ.LLZZ(webView, "");
        }
        NP6.LIZ.getClass();
    }
}
