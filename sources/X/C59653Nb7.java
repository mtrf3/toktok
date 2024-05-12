package X;

import com.ss.android.ugc.aweme.fe.method.OpenRechargePanel;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.Nb7, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C59653Nb7 implements InterfaceC77682UeE {
    public final /* synthetic */ OpenRechargePanel LIZ;

    @Override // X.InterfaceC77682UeE
    public final void LIZIZ(int i, int i2, String str) {
    }

    public C59653Nb7(OpenRechargePanel openRechargePanel) {
        this.LIZ = openRechargePanel;
    }

    @Override // X.InterfaceC77682UeE
    public final void LIZ(Exception e) {
        o.LJIIIZ(e, "e");
        OpenRechargePanel openRechargePanel = this.LIZ;
        JSONObject LIZLLL = C770830u.LIZLLL("code", 0);
        LIZLLL.put("args", C770830u.LIZLLL("error_code", 10001));
        openRechargePanel.sendEvent("coinsRechargeStatus", LIZLLL, 3);
    }

    @Override // X.InterfaceC77682UeE
    public final void onSuccess(long j) {
        this.LIZ.sendEvent("coinsRechargeStatus", C770830u.LIZLLL("code", 1), 3);
    }
}
