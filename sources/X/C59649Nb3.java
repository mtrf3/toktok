package X;

import android.os.SystemClock;
import com.ss.android.ugc.aweme.bullet.bridge.ad.OpenRechargePanel;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.Nb3, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C59649Nb3 implements InterfaceC77682UeE {
    public final /* synthetic */ int LIZ;
    public final /* synthetic */ OpenRechargePanel LIZIZ;
    public final /* synthetic */ C68322mC<java.util.Map<String, Object>> LIZJ;

    @Override // X.InterfaceC77682UeE
    public final void LIZ(Exception e) {
        o.LJIIIZ(e, "e");
        if (this.LIZ == 5) {
            OpenRechargePanel openRechargePanel = this.LIZIZ;
            JSONObject LIZLLL = C770830u.LIZLLL("code", 0);
            LIZLLL.put("args", C770830u.LIZLLL("error_code", 10001));
            openRechargePanel.sendEvent("coinsRechargeStatus", LIZLLL);
            return;
        }
        this.LIZJ.element.put("code", CardStruct.IStatusCode.DEFAULT);
        this.LIZJ.element.put("error_code", 10001);
        long currentThreadTimeMillis = SystemClock.currentThreadTimeMillis();
        new F15();
        C72818Shy.LIZ(new C76052yf(currentThreadTimeMillis, F15.LIZLLL(this.LIZJ.element), "coinsRechargeStatus"));
    }

    @Override // X.InterfaceC77682UeE
    public final void onSuccess(long j) {
        if (this.LIZ == 5) {
            this.LIZIZ.sendEvent("coinsRechargeStatus", C770830u.LIZLLL("code", 1));
            return;
        }
        this.LIZJ.element.put("code", "1");
        long currentThreadTimeMillis = SystemClock.currentThreadTimeMillis();
        new F15();
        C72818Shy.LIZ(new C76052yf(currentThreadTimeMillis, F15.LIZLLL(this.LIZJ.element), "coinsRechargeStatus"));
    }

    public C59649Nb3(int i, OpenRechargePanel openRechargePanel, C68322mC<java.util.Map<String, Object>> c68322mC) {
        this.LIZ = i;
        this.LIZIZ = openRechargePanel;
        this.LIZJ = c68322mC;
    }

    @Override // X.InterfaceC77682UeE
    public final void LIZIZ(int i, int i2, String str) {
        if (this.LIZ == 5) {
            if (i != 0) {
                if (i != 1) {
                    return;
                }
                Integer num = null;
                C09900aA.LJIIJJI("promote_iap_charge_show", 0, null);
                C188727au c188727au = new C188727au();
                C58909NAb.LIZ.getClass();
                if (NH3.LIZ() != null) {
                    num = Integer.valueOf(NTF.LJFF());
                }
                c188727au.LJFF(num, "user_account_type");
                FMX.LJIIL("promote_iap_recharge_panel_show", c188727au.LIZ);
                return;
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("error_status_code ", i2);
            jSONObject.put("error_message", str);
            C09900aA.LJIIJJI("promote_iap_charge_show", 1, jSONObject);
        }
    }
}
