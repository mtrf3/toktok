package X;

import com.ss.android.ugc.aweme.account.login.v2.base.BaseAccountFlowFragment;
import com.ss.android.ugc.aweme.account.login.v2.network.SetPasswordMobHelper;
import com.ss.android.ugc.aweme.account.login.v2.ui.SignUpOrLoginActivity;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public final class RAD<T> implements InterfaceC64592gB {
    public final /* synthetic */ SetPasswordMobHelper LJLIL;
    public final /* synthetic */ BaseAccountFlowFragment LJLILLLLZI;
    public final /* synthetic */ String LJLJI;
    public final /* synthetic */ InterfaceC65784Pro<C76800UCe> LJLJJI;
    public final /* synthetic */ InterfaceC88471Ynr<String, Integer, C76800UCe> LJLJJL;
    public final /* synthetic */ SignUpOrLoginActivity LJLJJLL;

    /* JADX WARN: Multi-variable type inference failed */
    public RAD(SetPasswordMobHelper setPasswordMobHelper, BaseAccountFlowFragment baseAccountFlowFragment, String str, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro, InterfaceC88471Ynr<? super String, ? super Integer, C76800UCe> interfaceC88471Ynr, SignUpOrLoginActivity signUpOrLoginActivity) {
        this.LJLIL = setPasswordMobHelper;
        this.LJLILLLLZI = baseAccountFlowFragment;
        this.LJLJI = str;
        this.LJLJJI = interfaceC65784Pro;
        this.LJLJJL = interfaceC88471Ynr;
        this.LJLJJLL = signUpOrLoginActivity;
    }

    @Override // X.InterfaceC64592gB
    public final void accept(Object obj) {
        Throwable th = (Throwable) obj;
        o.LJII(th, "null cannot be cast to non-null type com.ss.android.ugc.aweme.account.login.v2.network.NetworkException");
        C69084R9k c69084R9k = (C69084R9k) th;
        SetPasswordMobHelper setPasswordMobHelper = this.LJLIL;
        String enterFrom = this.LJLILLLLZI.getEnterFrom();
        o.LJIIIIZZ(enterFrom, "it.enterFrom");
        String enterMethod = this.LJLILLLLZI.getEnterMethod();
        o.LJIIIIZZ(enterMethod, "it.enterMethod");
        String wl = this.LJLILLLLZI.wl();
        o.LJIIIIZZ(wl, "it.loginPanelType");
        setPasswordMobHelper.LIZ(false, "email", enterFrom, enterMethod, wl, c69084R9k.getErrorCode(), this.LJLILLLLZI, this.LJLJI);
        C68972R5c.LJFF(true, c69084R9k.getErrorCode(), "email", this.LJLILLLLZI, null);
        C68986R5q.LIZ.LIZJ(1, c69084R9k.getErrorCode(), c69084R9k.getDetailErrorMsg());
        int errorCode = c69084R9k.getErrorCode();
        if (SignUpOrLoginActivity.LJLLLLLL.contains(Integer.valueOf(errorCode))) {
            this.LJLJJI.invoke();
            return;
        }
        if (SignUpOrLoginActivity.LJLZ.contains(Integer.valueOf(errorCode))) {
            InterfaceC88471Ynr<String, Integer, C76800UCe> interfaceC88471Ynr = this.LJLJJL;
            String message = th.getMessage();
            if (message == null) {
                message = this.LJLJJLL.getString(R.string.g5w);
                o.LJIIIIZZ(message, "getString(R.string.error_unknown)");
            }
            interfaceC88471Ynr.invoke(message, 1);
            return;
        }
        InterfaceC88471Ynr<String, Integer, C76800UCe> interfaceC88471Ynr2 = this.LJLJJL;
        String message2 = th.getMessage();
        if (message2 == null) {
            message2 = this.LJLJJLL.getString(R.string.g5w);
            o.LJIIIIZZ(message2, "getString(R.string.error_unknown)");
        }
        interfaceC88471Ynr2.invoke(message2, 0);
    }
}
