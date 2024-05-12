package com.ss.android.ugc.aweme.bullet.business;

import X.C59472NVs;
import X.C78983UzD;
import X.InterfaceC59229NMj;
import X.N5S;
import X.NP1;
import com.ss.android.ugc.aweme.bullet.business.BulletBusinessService;
import kotlin.jvm.internal.o;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class PlayableBusiness extends BulletBusinessService.Business {
    public boolean LIZIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlayableBusiness(N5S bulletBusiness) {
        super(bulletBusiness);
        o.LJIIIZ(bulletBusiness, "bulletBusiness");
    }

    public final void LIZ(boolean z, boolean z2) {
        Integer value;
        C59472NVs c59472NVs = this.LIZ.LIZIZ;
        if (!(c59472NVs instanceof NP1) || (value = ((NP1) c59472NVs).LJL.getValue()) == null || value.intValue() != 1) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("endcard_mute", z);
            jSONObject.put("endcard_show", z2);
            InterfaceC59229NMj interfaceC59229NMj = this.LIZ.LIZLLL;
            if (interfaceC59229NMj != null) {
                interfaceC59229NMj.LIZ("endcard_control_event", jSONObject);
            }
        } catch (JSONException e) {
            C78983UzD.LJIIZILJ(e);
        }
    }
}
