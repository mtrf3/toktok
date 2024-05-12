package X;

import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.Nb2, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C59648Nb2 implements InterfaceC77682UeE {
    public final /* synthetic */ C59650Nb4 LIZ;

    public C59648Nb2(C59650Nb4 c59650Nb4) {
        this.LIZ = c59650Nb4;
    }

    @Override // X.InterfaceC77682UeE
    public final void LIZ(Exception exc) {
        this.LIZ.LJLIL.onFail();
    }

    @Override // X.InterfaceC77682UeE
    public final void onSuccess(long j) {
        this.LIZ.LJLIL.onSuccess();
    }

    @Override // X.InterfaceC77682UeE
    public final void LIZIZ(int i, int i2, String str) {
        if (i == 1) {
            C09900aA.LJIIJJI("promote_iap_charge_show", 0, null);
            FMX.LJIIL("promote_iap_recharge_panel_show", C78920UyC.LIZJ(((RBX) HG3.LJIILL()).getCurUser().getAccountType(), "user_account_type").LIZ);
        } else {
            if (i != 0) {
                return;
            }
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("error_status_code ", i2);
                jSONObject.put("error_message", str);
            } catch (JSONException e) {
                C16880lQ.LLLLIIL(e);
            }
            C09900aA.LJIIJJI("promote_iap_charge_show", 1, jSONObject);
        }
    }
}
