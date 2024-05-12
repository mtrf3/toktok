package X;

import android.os.Bundle;
import com.ss.android.ugc.aweme.deeplink.DeepLinkHandlerActivity;
import com.ss.android.ugc.aweme.login.LoginUtilsServiceImpl;
import com.ss.android.ugc.aweme.services.MainServiceImpl;
import com.zhiliaoapp.musically.R;

/* renamed from: X.LqE, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C55494LqE implements R4B {
    public final /* synthetic */ Bundle LJLIL;
    public final /* synthetic */ DeepLinkHandlerActivity LJLILLLLZI;

    @Override // X.R4B
    public final void onSuccess() {
        FMX.LJIIL("switch_account_result", C78920UyC.LIZJ(1, "status").LIZ);
    }

    public C55494LqE(DeepLinkHandlerActivity deepLinkHandlerActivity, Bundle bundle) {
        this.LJLILLLLZI = deepLinkHandlerActivity;
        this.LJLIL = bundle;
    }

    @Override // X.R4B
    public final void LIZJ(Integer num, String str) {
        this.LJLILLLLZI.getClass();
        if (!DeepLinkHandlerActivity.LLII()) {
            LoginUtilsServiceImpl.LIZ().restartApp(this.LJLIL);
            return;
        }
        if (Boolean.valueOf(MainServiceImpl.createIMainServicebyMonsterPlugin(false).isAwemeAppDataEmpty()).booleanValue()) {
            AnonymousClass114.LIZ(C84763XOl.LJIIIIZZ(), R.string.g5w);
        }
        C188727au c188727au = new C188727au();
        c188727au.LIZLLL(0, "status");
        c188727au.LJFF(num, "fail_info");
        FMX.LJIIL("switch_account_result", c188727au.LIZ);
    }
}
