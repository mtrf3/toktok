package X;

import android.text.TextUtils;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.simkit.model.bitrateselect.AutoBitrateSet;
import com.ss.android.ugc.aweme.simkit.model.bitrateselect.RateSettingsResponse;
import com.ss.ttvideoengine.TTVideoEngine;
import org.json.JSONObject;

/* renamed from: X.Ibp, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C46957Ibp implements InterfaceC46972Ic4 {
    public InterfaceC46926IbK LIZ;
    public int LIZIZ = 1;

    @Override // X.InterfaceC46972Ic4
    public final synchronized InterfaceC46926IbK create() {
        if (C46880Iaa.LIZ.LIZ() == null) {
            return null;
        }
        if (this.LIZ == null || this.LIZIZ != 1) {
            LIZ();
        }
        return this.LIZ;
    }

    public final void LIZ() {
        int i;
        C47307IhT c47307IhT = C46880Iaa.LIZ;
        RateSettingsResponse LIZ = c47307IhT.LIZ();
        AutoBitrateSet autoBitrateSet = LIZ.getAutoBitrateSet();
        RateSettingsResponse LIZ2 = c47307IhT.LIZ();
        if (IXN.LIZJ.getBitrateSelectMode() == 1) {
            C46954Ibm c46954Ibm = new C46954Ibm(LIZ2.getAdaptiveGearGroup());
            c46954Ibm.LIZIZ = LIZ2.getGearSet();
            c46954Ibm.LIZJ = LIZ2.getBandwidthSet();
            c46954Ibm.LIZLLL = autoBitrateSet;
            this.LIZ = c46954Ibm.LIZ();
        } else {
            C46955Ibn c46955Ibn = new C46955Ibn(LIZ2.getAdaptiveGearGroup());
            c46955Ibn.LIZIZ = LIZ2.getGearSet();
            c46955Ibn.LIZJ = LIZ2.getBandwidthSet();
            c46955Ibn.LIZLLL = autoBitrateSet;
            this.LIZ = c46955Ibn.LIZ();
        }
        if (IZ8.LJJII()) {
            try {
                String LJIILL = new Gson().LJIILL(LIZ);
                if (!TextUtils.isEmpty(LJIILL)) {
                    JSONObject jSONObject = new JSONObject(LJIILL);
                    jSONObject.put("cache_check", new JSONObject());
                    String LJJIJL = IZ8.LJJIJL();
                    if (!TextUtils.isEmpty(LJJIJL)) {
                        JSONObject jSONObject2 = new JSONObject(LJJIJL);
                        if (!jSONObject2.has("find_cache") && IZ8.LJJIII()) {
                            if (IZ8.LJJIII()) {
                                i = 1;
                            } else {
                                i = 0;
                            }
                            jSONObject2.put("find_cache", i);
                        }
                        jSONObject.put("extra_config", jSONObject2);
                    }
                    JSONObject jSONObject3 = new JSONObject();
                    jSONObject3.put("vod_strategy_select_bitrate", jSONObject);
                    TTVideoEngine.LJJLIL(31006, jSONObject3.toString());
                }
            } catch (Throwable unused) {
            }
        }
        this.LIZIZ = 1;
    }
}
