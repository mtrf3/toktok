package X;

import com.ss.android.ugc.aweme.fe.method.OpenRechargePanel;
import org.json.JSONObject;

/* renamed from: X.Nb6, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C59652Nb6 implements InterfaceC59655Nb9 {
    public final /* synthetic */ OpenRechargePanel LIZ;

    @Override // X.InterfaceC59655Nb9
    public final void onFail() {
        OpenRechargePanel openRechargePanel = this.LIZ;
        JSONObject LIZLLL = C770830u.LIZLLL("code", 0);
        LIZLLL.put("args", C770830u.LIZLLL("error_code", 10001));
        openRechargePanel.sendEvent("coinsRechargeStatus", LIZLLL, 3);
    }

    @Override // X.InterfaceC59655Nb9
    public final void onSuccess() {
        this.LIZ.sendEvent("coinsRechargeStatus", C770830u.LIZLLL("code", 1), 3);
    }

    public C59652Nb6(OpenRechargePanel openRechargePanel) {
        this.LIZ = openRechargePanel;
    }
}
