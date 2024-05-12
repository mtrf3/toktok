package com.ss.android.ugc.aweme.crossplatform.business;

import X.C16880lQ;
import X.C38049EwX;
import X.C59484NWe;
import com.ss.android.ugc.aweme.crossplatform.business.BusinessService;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public class PlayableBusiness extends BusinessService.Business {
    public C38049EwX LIZLLL;
    public boolean LJ;

    public PlayableBusiness(C59484NWe c59484NWe) {
        super(c59484NWe);
    }

    public final void LIZ(boolean z, boolean z2) {
        if (this.LIZIZ.LIZIZ.LJJIIZ == 1 && this.LIZLLL != null) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("endcard_mute", z);
                jSONObject.put("endcard_show", z2);
                this.LIZLLL.LJIIIIZZ("endcard_control_event", jSONObject);
            } catch (JSONException e) {
                C16880lQ.LLLLIIL(e);
            }
        }
    }
}
