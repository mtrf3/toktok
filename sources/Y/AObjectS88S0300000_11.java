package Y;

import X.ActivityC45651qj;
import X.C10K;
import X.C58725N2z;
import X.C66504Q8e;
import X.C66597QBt;
import X.C67641Qgf;
import X.C67646Qgk;
import X.C67651Qgp;
import X.C67656Qgu;
import X.C67658Qgw;
import X.C67663Qh1;
import X.C67664Qh2;
import X.C67665Qh3;
import X.C68517Qun;
import X.C68972R5c;
import X.C69101RAb;
import X.ExecutorC46398IIw;
import X.InterfaceC88472Yns;
import X.QTZ;
import X.R41;
import android.content.Intent;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.lobby.auth.AuthResult;
import com.bytedance.lobby.google.GoogleOneTapAuth;
import com.google.android.gms.auth.api.identity.BeginSignInRequest;
import com.ss.android.ugc.aweme.account.login.authorize.AuthorizeActivity;
import com.ss.android.ugc.aweme.account.login.model.CommonUserInfo;
import com.ss.android.ugc.aweme.account.login.model.TPLoginMethod;
import com.ss.android.ugc.aweme.account.login.model.TPUserInfo;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.services.IAccountHelperService;

/* loaded from: classes12.dex */
public class AObjectS88S0300000_11 implements InterfaceC88472Yns {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;

    @Override // X.InterfaceC88472Yns
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AObjectS88S0300000_11 aObjectS88S0300000_11, Object obj) {
        GoogleOneTapAuth googleOneTapAuth = (GoogleOneTapAuth) aObjectS88S0300000_11.l0;
        ActivityC45651qj activityC45651qj = (ActivityC45651qj) aObjectS88S0300000_11.l1;
        Bundle bundle = (Bundle) aObjectS88S0300000_11.l2;
        String str = (String) obj;
        if (str != null) {
            googleOneTapAuth.LJLJJLL = str;
            BeginSignInRequest hv0 = googleOneTapAuth.hv0(Boolean.TRUE);
            Long valueOf = Long.valueOf(SystemClock.elapsedRealtime());
            C67646Qgk LJ = googleOneTapAuth.LJLJJI.LJ(hv0);
            C67665Qh3 c67665Qh3 = new C67665Qh3(bundle, activityC45651qj, googleOneTapAuth, valueOf);
            LJ.getClass();
            ExecutorC46398IIw executorC46398IIw = C67641Qgf.LIZ;
            C67651Qgp c67651Qgp = new C67651Qgp(executorC46398IIw, c67665Qh3);
            LJ.LIZIZ.LIZIZ(c67651Qgp);
            C67663Qh1.LJIIIZ(activityC45651qj).LJIIJ(c67651Qgp);
            LJ.LJIJJ();
            C67656Qgu c67656Qgu = new C67656Qgu(executorC46398IIw, new C67664Qh2(bundle, activityC45651qj, googleOneTapAuth, valueOf));
            LJ.LIZIZ.LIZIZ(c67656Qgu);
            C67663Qh1.LJIIIZ(activityC45651qj).LJIIJ(c67656Qgu);
            LJ.LJIJJ();
            C67658Qgw c67658Qgw = new C67658Qgw(executorC46398IIw, new C66597QBt(googleOneTapAuth));
            LJ.LIZIZ.LIZIZ(c67658Qgw);
            C67663Qh1.LJIIIZ(activityC45651qj).LJIIJ(c67658Qgw);
            LJ.LJIJJ();
            return null;
        }
        googleOneTapAuth.getClass();
        googleOneTapAuth.iv0(new C66504Q8e(10, "Fail to generate nonce"));
        return null;
    }

    public static final Object invoke$1(AObjectS88S0300000_11 aObjectS88S0300000_11, Object obj) {
        C10K c10k = (C10K) obj;
        User LIZJ = R41.LIZJ();
        String uid = LIZJ.getUid();
        if (!TextUtils.isEmpty(uid) && ((AuthorizeActivity) aObjectS88S0300000_11.l2).getIntent().getBooleanExtra("need_remember_login_method", true)) {
            C68517Qun.LIZ.LJIIL(new TPLoginMethod(uid, ((AuthorizeActivity) aObjectS88S0300000_11.l2).LJLJJLL, TPUserInfo.from(LIZJ), false, CommonUserInfo.defaultCommonUserInfo(), Long.valueOf(System.currentTimeMillis())));
        }
        if (R41.LJI()) {
            R41.LJIIL(1, 1, "");
            R41.LJIIIIZZ(R41.LIZJ());
        }
        if (((AuthorizeActivity) aObjectS88S0300000_11.l2).LJLJJI != null) {
            IAccountHelperService iAccountHelperService = (IAccountHelperService) C58725N2z.LIZIZ(IAccountHelperService.class);
            AuthorizeActivity authorizeActivity = (AuthorizeActivity) aObjectS88S0300000_11.l2;
            String str = authorizeActivity.LJLJJLL;
            AuthResult authResult = authorizeActivity.LJLJJI;
            iAccountHelperService.friendUploadToken(str, authResult.mToken, authResult.mTokenSecret);
        }
        if (c10k.LJIILJJIL()) {
            ((AuthorizeActivity) aObjectS88S0300000_11.l2).LLIIIJ(0, (Intent) aObjectS88S0300000_11.l0);
        } else {
            C69101RAb.LIZIZ(11);
            ((AuthorizeActivity) aObjectS88S0300000_11.l2).LLIIIJ(-1, (Intent) aObjectS88S0300000_11.l0);
            QTZ qtz = (QTZ) aObjectS88S0300000_11.l1;
            boolean z = qtz.LJ;
            AuthorizeActivity authorizeActivity2 = (AuthorizeActivity) aObjectS88S0300000_11.l2;
            C68972R5c.LJIIIZ(z, authorizeActivity2.LJLJJLL, authorizeActivity2, qtz, null);
        }
        return null;
    }

    public AObjectS88S0300000_11(Object obj, Object obj2, Object obj3, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
        this.l2 = obj3;
    }
}
