package com.ss.android.ugc.aweme.bullet.business;

import X.C40307Frr;
import X.C78983UzD;
import X.InterfaceC59229NMj;
import X.N5S;
import android.webkit.WebView;
import com.ss.android.ugc.aweme.bullet.business.BulletBusinessService;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class PreRenderWebViewBusiness extends BulletBusinessService.Business {
    public static final /* synthetic */ int LIZLLL = 0;
    public int LIZIZ;
    public String LIZJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PreRenderWebViewBusiness(N5S bulletBusiness) {
        super(bulletBusiness);
        o.LJIIIZ(bulletBusiness, "bulletBusiness");
    }

    public final void LIZ(String str) {
        this.LIZIZ = 2;
        N5S n5s = this.LIZ;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("clickFrom", str);
        } catch (Exception e) {
            C78983UzD.LJIIZILJ(e);
        }
        InterfaceC59229NMj interfaceC59229NMj = n5s.LIZLLL;
        if (interfaceC59229NMj != null) {
            interfaceC59229NMj.LIZ("webViewDidShow", jSONObject);
        }
        this.LIZJ = str;
    }

    public final void LIZIZ(C40307Frr c40307Frr) {
        WebView webView;
        if (c40307Frr != null && c40307Frr.LJLILLLLZI != null && (webView = this.LIZ.LJFF) != null && c40307Frr.LJLIL == webView.hashCode()) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("appearanceState", this.LIZIZ);
            jSONObject.put("code", 1);
            jSONObject.put("preloadType", 1);
            jSONObject.put("clickFrom", this.LIZJ);
            c40307Frr.LJLILLLLZI.LIZIZ(jSONObject);
        }
    }
}
