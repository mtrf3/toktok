package com.ss.android.ugc.aweme.crossplatform.business;

import X.C113554cx;
import X.C16880lQ;
import X.C38049EwX;
import X.C40292Frc;
import X.C59484NWe;
import X.NXI;
import X.NZC;
import X.NZR;
import X.OSZ;
import X.WM7;
import android.view.View;
import com.ss.android.ugc.aweme.crossplatform.business.BusinessService;
import java.util.Map;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class PreRenderWebViewBusiness extends BusinessService.Business {
    public static final Map<Integer, String> LJI = C113554cx.LJJL(new OSZ(2, "video_bottom_button"), new OSZ(3, "video_mask_button"), new OSZ(6, "comment_end_button"), new OSZ(8, "profile_bottom_button"), new OSZ(33, "ad_card"), new OSZ(46, "ads_explain_clic"), new OSZ(47, "ad_desc_label"));
    public C38049EwX LIZLLL;
    public int LJ;
    public String LJFF;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PreRenderWebViewBusiness(C59484NWe crossPlatformBusiness) {
        super(crossPlatformBusiness);
        o.LJIIIZ(crossPlatformBusiness, "crossPlatformBusiness");
    }

    public final void LIZIZ(String str) {
        this.LJ = 2;
        C38049EwX c38049EwX = this.LIZLLL;
        if (c38049EwX != null) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("clickFrom", str);
            } catch (Exception e) {
                C16880lQ.LLLLIIL(e);
            }
            c38049EwX.LJIIIIZZ("webViewDidShow", jSONObject);
        }
        this.LJFF = str;
    }

    public final void LIZJ(NZC crossPlatformWebView, C40292Frc c40292Frc) {
        int i;
        View view;
        o.LJIIIZ(crossPlatformWebView, "crossPlatformWebView");
        if (c40292Frc == null || c40292Frc.LJLILLLLZI == null) {
            return;
        }
        int i2 = c40292Frc.LJLIL;
        NZR LIZ = ((NXI) crossPlatformWebView.LJI(NXI.class)).LIZ();
        if (LIZ != null && (view = LIZ.getView()) != null) {
            i = view.hashCode();
        } else {
            i = 0;
        }
        if (i2 == i) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("appearanceState", this.LJ);
            jSONObject.put("code", 1);
            jSONObject.put("preloadType", 1);
            jSONObject.put("clickFrom", this.LJFF);
            String str = this.LIZIZ.LIZIZ.LJJIJL;
            if (o.LJ("splash", str)) {
                jSONObject.put(WM7.SCENE_SERVICE, 2);
            } else if (o.LJ("feedad", str)) {
                jSONObject.put(WM7.SCENE_SERVICE, 1);
            }
            c40292Frc.LJLILLLLZI.LIZIZ(jSONObject);
        }
    }
}
