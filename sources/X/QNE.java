package X;

import android.app.Activity;
import android.content.Context;
import com.bytedance.bdturing.verify.RiskControlService;
import com.bytedance.bdturing.verify.TwiceVerifyService;
import java.util.HashMap;

/* loaded from: classes12.dex */
public final class QNE {
    public QN4 LIZ;
    public boolean LIZIZ;
    public RiskControlService LIZJ;
    public final HashMap<String, QNG> LIZLLL = new HashMap<>();
    public long LJ = 0;

    public final void LIZLLL() {
        RiskControlService riskControlService = new RiskControlService();
        this.LIZJ = riskControlService;
        LIZ(riskControlService);
        LIZ(new TwiceVerifyService());
        try {
            LIZ((QNG) Class.forName("com.bytedance.bdturing.verify.IdentityService").newInstance());
        } catch (ClassNotFoundException e) {
            C61349O5x.LIZIZ(e);
        } catch (IllegalAccessException e2) {
            C61349O5x.LIZIZ(e2);
        } catch (InstantiationException e3) {
            C61349O5x.LIZIZ(e3);
        }
    }

    public static void LIZIZ(QN4 qn4) {
        if (qn4.LJIIJJI != null) {
            if (qn4.LJIIZILJ == null) {
                try {
                    qn4.LJIIZILJ = (InterfaceC65229Pir) Class.forName("com.bytedance.bdturing.ttnet.TTNetHttpClient").getConstructor(Context.class).newInstance(qn4.LJIIJJI);
                } catch (Exception e) {
                    C16880lQ.LLLLIIL(e);
                }
            }
            if (qn4.LJIIZILJ != null && qn4.LJIILLIIL != null) {
                return;
            } else {
                throw new RuntimeException("httpClient or eventClient is null");
            }
        }
        throw new RuntimeException("config or applicationContext is null");
    }

    public final void LIZ(QNG qng) {
        if (this.LIZLLL.containsKey(qng.getClass().getName())) {
            return;
        }
        this.LIZLLL.put(qng.getClass().getName(), qng);
    }

    public final boolean LIZJ(Activity activity, QNS qns) {
        boolean z;
        if (!this.LIZIZ || activity == null) {
            qns.onFail(2);
            return false;
        }
        if (System.currentTimeMillis() - this.LJ < 500) {
            z = true;
        } else {
            z = false;
        }
        this.LJ = System.currentTimeMillis();
        if (!z) {
            return true;
        }
        qns.onFail(1000);
        return false;
    }

    public final void LJ(Activity activity, QNY qny, QNS qns) {
        qny.LJ();
        if (!LIZJ(activity, qns)) {
            return;
        }
        qny.LJ();
        LJFF(activity, qny, qns);
    }

    public final void LJFF(Activity activity, QNH qnh, QNS qns) {
        qnh.LIZ = activity;
        for (QNG qng : this.LIZLLL.values()) {
            if (qng.isProcess(qnh.LJ())) {
                qng.execute(qnh, qns);
                return;
            }
        }
        qns.onFail(996);
    }
}
