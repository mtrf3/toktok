package X;

import android.content.Context;
import com.ss.android.common.applog.AppLog;
import com.ss.android.ugc.aweme.sec.DmtSec;
import com.ss.android.ugc.aweme.sec.captcha.SecCaptcha;
import com.ss.android.ugc.aweme.utils.ActivityStack;
import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public final class QNX<TTaskResult, TContinuationResult> implements C10I {
    public final /* synthetic */ QND LIZ;
    public final /* synthetic */ boolean LIZIZ;
    public final /* synthetic */ String LIZJ;
    public final /* synthetic */ int LIZLLL;
    public final /* synthetic */ String LJ;
    public final /* synthetic */ String LJFF;
    public final /* synthetic */ Context LJI;

    public QNX(Context context, String str, int i, String str2, String str3, boolean z, QND qnd) {
        this.LIZ = qnd;
        this.LIZIZ = z;
        this.LIZJ = str;
        this.LIZLLL = i;
        this.LJ = str2;
        this.LJFF = str3;
        this.LJI = context;
    }

    @Override // X.C10I
    public final Object then(C10K c10k) {
        String did;
        long currentTimeMillis = System.currentTimeMillis();
        String sessionId = this.LIZ.getSessionId();
        String iid = "";
        if (sessionId == null) {
            sessionId = "";
        }
        long currentTimeMillis2 = System.currentTimeMillis();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("initSCCheckUtil getSessionTime = ");
        LIZ.append(currentTimeMillis2 - currentTimeMillis);
        String msg = X1D.LIZIZ(LIZ);
        o.LJIIIZ(msg, "msg");
        long currentTimeMillis3 = System.currentTimeMillis();
        DmtSec dmtSec = DmtSec.INSTANCE;
        C66895QNf msManager = dmtSec.getMsManager();
        if (msManager != null) {
            msManager.LIZ(sessionId);
        }
        long currentTimeMillis4 = System.currentTimeMillis();
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("init setSessionTime = ");
        LIZ2.append(currentTimeMillis4 - currentTimeMillis3);
        String msg2 = X1D.LIZIZ(LIZ2);
        o.LJIIIZ(msg2, "msg");
        if (AppLog.getServerDeviceId() == null) {
            did = "";
        } else {
            did = AppLog.getServerDeviceId();
        }
        if (AppLog.getInstallId() != null) {
            iid = AppLog.getInstallId();
        }
        DmtSec.updateCollectMode$default(dmtSec, null, 1, null);
        C66895QNf msManager2 = dmtSec.getMsManager();
        if (msManager2 != null) {
            msManager2.LIZIZ(did);
        }
        C66895QNf msManager3 = dmtSec.getMsManager();
        if (msManager3 != null) {
            msManager3.LIZLLL(iid);
        }
        if (this.LIZIZ) {
            StringBuilder LIZLLL = C06540Nm.LIZLLL("initCaptchaParams:did = ", did, "  iid = ", iid, "  sid = ");
            LIZLLL.append(sessionId);
            C36922EeM.LIZLLL(4, "Sec", X1D.LIZIZ(LIZLLL));
            String str = this.LIZJ;
            int i = this.LIZLLL;
            String str2 = this.LJ;
            o.LJIIIIZZ(iid, "iid");
            o.LJIIIIZZ(did, "did");
            QN8 qn8 = new QN8(str, i, str2, iid, did, this.LJFF, sessionId);
            long currentTimeMillis5 = System.currentTimeMillis();
            Context LLLLL = C16880lQ.LLLLL(this.LJI);
            o.LJIIIIZZ(LLLLL, "context.applicationContext");
            DmtSec.captcha = new SecCaptcha(LLLLL, qn8, this.LIZ);
            long currentTimeMillis6 = System.currentTimeMillis();
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append("init createSecCaptchaTime = ");
            LIZ3.append(currentTimeMillis6 - currentTimeMillis5);
            String msg3 = X1D.LIZIZ(LIZ3);
            o.LJIIIZ(msg3, "msg");
        }
        DmtSec.initSuccess = true;
        C36922EeM.LIZLLL(4, "Sec", "secInitSuccessFlag");
        DmtSec.finishInitAndProcessPending();
        ActivityStack.addAppBackGroundListener(DmtSec.appBackgroundListener);
        return C76800UCe.LIZ;
    }
}
