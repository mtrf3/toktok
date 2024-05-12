package X;

import android.app.Activity;
import android.os.Bundle;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.IPrevLoginPlatformService;
import com.ss.android.ugc.aweme.account.login.prevlogin.PrevLoginPlatformService;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public final class R4C extends AbstractC68940R3w {
    public final /* synthetic */ Bundle LIZ;
    public final /* synthetic */ R4B LIZIZ;
    public final /* synthetic */ String LIZJ;
    public final /* synthetic */ boolean LIZLLL;
    public final /* synthetic */ Bundle LJ;

    @Override // X.AbstractC67055QTj
    public final void onSuccess(QQI qqi) {
        R6R response = (R6R) qqi;
        o.LJIIIZ(response, "response");
        R4D.LIZIZ(response.LJIIIZ, this.LIZ, this.LIZIZ);
        IPrevLoginPlatformService LJIIL = PrevLoginPlatformService.LJIIL();
        if (LJIIL.LJFF(response.LJIIIZ.LIZ).length() == 0) {
            LJIIL.LJIIJJI(response.LJIIIZ.LIZ, LJIIL.LIZLLL());
        }
        LJIIL.LJIIIIZZ(LJIIL.LJFF(response.LJIIIZ.LIZ));
    }

    @Override // X.AbstractC67055QTj
    public final void onError(QQI qqi, int i) {
        String optString;
        R4I response = (R4I) qqi;
        o.LJIIIZ(response, "response");
        if (i == 1 || i == 4) {
            long currentTimeMillis = System.currentTimeMillis();
            C68517Qun c68517Qun = C68517Qun.LIZ;
            String str = this.LIZJ;
            c68517Qun.LJIJ(currentTimeMillis, str, false);
            c68517Qun.LJIIZILJ(currentTimeMillis, str);
            c68517Qun.LJIJJLI(R41.LIZ().findSignificanUserInfo(str));
            R4D.LIZ().delete(this.LIZJ, "switch error:1|4");
        }
        Integer valueOf = Integer.valueOf(response.LIZLLL);
        String str2 = response.LJFF;
        HashMap LIZJ = C03660Ck.LIZJ("event", "switch account failed");
        LIZJ.put("errorCode", String.valueOf(valueOf));
        String str3 = "";
        if (str2 == null) {
            str2 = "";
        }
        LIZJ.put("errorMsg", str2);
        R4J r4j = R4J.LIZ;
        String abstractMap = LIZJ.toString();
        o.LJIIIIZZ(abstractMap, "map.toString()");
        r4j.LIZIZ(abstractMap);
        Integer valueOf2 = Integer.valueOf(response.LIZLLL);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(response.LJFF);
        LIZ.append('|');
        LIZ.append(response.LJI);
        Q13.LIZIZ("monitor_switch_account", 1, C36180EHw.LIZ(valueOf2, X1D.LIZIZ(LIZ), ""));
        if (R4D.LIZIZ != null && this.LIZLLL) {
            int i2 = R4D.LIZ - 1;
            R4D.LIZ = i2;
            if (i2 >= 0) {
                List<String> list = R4D.LIZIZ;
                o.LJI(list);
                R4D.LIZJ((String) ListProtector.get(list, R4D.LIZ), this.LJ, true, false, this.LIZIZ);
                return;
            }
        }
        if (i != 1349 && i != 1364) {
            if (i == 1450) {
                Activity LJIIIIZZ = C84763XOl.LJIIIIZZ();
                JSONObject jSONObject = response.LJII;
                o.LJIIIIZZ(jSONObject, "response.result");
                R49 r49 = new R49(this.LIZ, this.LIZIZ, response);
                if (LJIIIIZZ != null) {
                    JSONObject optJSONObject = jSONObject.optJSONObject("data");
                    if (optJSONObject != null && (optString = optJSONObject.optString("webapp_url", "")) != null) {
                        str3 = optString;
                    }
                    if (str3.length() != 0) {
                        C79156V4u.LJLJJI = r49;
                        SmartRouter.buildRoute(LJIIIIZZ, str3).open();
                        return;
                    }
                }
            }
            Integer valueOf3 = Integer.valueOf(response.LIZLLL);
            String str4 = response.LJFF;
            R4B r4b = this.LIZIZ;
            Iterator it = ((CopyOnWriteArrayList) R41.LIZ).iterator();
            while (it.hasNext()) {
                ((LEA) it.next()).onAccountResult(2, false, 0, null);
            }
            if (r4b == null) {
                return;
            }
            r4b.LIZJ(valueOf3, str4);
            return;
        }
        C40437Ftx.LIZ(C84763XOl.LJIIIIZZ(), new R4A(this.LIZJ, this.LJ, this.LIZLLL, this.LIZIZ, i, response), response.LJFF, "switch_account_bind");
    }

    public R4C(Bundle bundle, R4B r4b, String str, boolean z, Bundle bundle2) {
        this.LIZ = bundle;
        this.LIZIZ = r4b;
        this.LIZJ = str;
        this.LIZLLL = z;
        this.LJ = bundle2;
    }
}
