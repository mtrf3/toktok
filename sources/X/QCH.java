package X;

import android.os.Bundle;
import java.util.List;

/* loaded from: classes12.dex */
public final class QCH implements QB8 {
    @Override // X.QB8
    public final List<QCI> LIZ() {
        QCM qcm = new QCM();
        qcm.LIZ = 2;
        QCK qck = new QCK();
        qck.LIZ = 2;
        C40644FxI c40644FxI = new C40644FxI();
        c40644FxI.LIZ().putString("google_auth_redirect_uri", "com.googleusercontent.apps.616463764658-p01hhcj82u4mqjnp1oca04i3o67fjsm1:/oauthredirect");
        qck.LIZLLL = c40644FxI.LIZ();
        QCN qcn = new QCN();
        qcn.LIZ = 2;
        QCL qcl = new QCL();
        qcl.LIZ = 2;
        QCQ qcq = new QCQ();
        qcq.LIZ = 2;
        QCO qco = new QCO();
        qco.LIZ = 2;
        Bundle LIZJ = AnonymousClass036.LIZJ("ig_scope", "user_profile", "ig_redirect_url", "https://api.tiktokv.com/passport/auth/wap_login_success/");
        LIZJ.putString("ig_login_auth_url", "https://api.instagram.com/oauth/authorize/");
        qco.LIZLLL = LIZJ;
        QCR qcr = new QCR();
        qcr.LIZ = 2;
        qcr.LIZLLL = C0H1.LIZ("twitter_consumer_secret", "w981H5bEdxghiDenDVAu2dTutdsQsh71LU0w4sLmVO8UMdbe6Q");
        QCP qcp = new QCP();
        qcp.LIZ = 2;
        QCS qcs = new QCS();
        qcs.LIZ = 2;
        return C47261Igj.LJJIJIL(new QCI(qcm), new QCI(qck), new QCI(qcn), new QCI(qcl), new QCI(qcq), new QCI(qco), new QCI(qcr), new QCI(qcp), new QCI(qcs));
    }

    @Override // X.QB8
    public final boolean LIZIZ() {
        return !EU2.LIZ();
    }
}
