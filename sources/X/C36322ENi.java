package X;

import Y.IDuS318S0100000_6;
import Y.IDxS76S0000000_6;
import android.content.Context;
import org.json.JSONObject;

/* renamed from: X.ENi, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C36322ENi {
    public static C36322ENi LIZIZ;
    public final Context LIZ = EF7.LIZIZ();

    public C36322ENi() {
        AbstractC73672Svk.LJIIJ(new IDuS318S0100000_6(this, 1)).LJJJ(C73969T1h.LIZIZ()).LJJL(T16.LIZ()).LIZ(new IDxS76S0000000_6(1));
    }

    public final void LIZ(JSONObject jSONObject) {
        if (jSONObject != null) {
            C36323ENj c36323ENj = new C36323ENj();
            jSONObject.optInt("update_sdk", 1);
            jSONObject.optInt("pre_download_version", 0);
            jSONObject.optInt("pre_download_start_time", 0);
            jSONObject.optInt("pre_download_delay_days", 0);
            jSONObject.optLong("pre_download_delay_second", -1L);
            C38776FJs.LJIIL().LJIIJ(this.LIZ, c36323ENj, "update_params");
        }
    }
}
