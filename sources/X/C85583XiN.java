package X;

import android.os.Bundle;
import com.ss.android.ugc.aweme.account.login.auth.I18nSignUpActivity;
import com.ss.android.ugc.aweme.account.login.auth.SignupViewModel;
import kotlin.jvm.internal.o;

/* renamed from: X.XiN, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C85583XiN implements InterfaceC68974R5e {
    public final /* synthetic */ I18nSignUpActivity LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ String LJLJI;
    public final /* synthetic */ Bundle LJLJJI;

    @Override // X.InterfaceC68974R5e
    public final String LJJLIIIJJI() {
        SignupViewModel signupViewModel = this.LJLIL.LJLJLJ;
        if (signupViewModel != null) {
            String enterFrom = signupViewModel.getEnterFrom();
            o.LJIIIIZZ(enterFrom, "dependencies.enterFrom");
            return enterFrom;
        }
        o.LJIJI("dependencies");
        throw null;
    }

    @Override // X.InterfaceC68974R5e
    public final String LJJLIIIJLLLLLLLZ() {
        SignupViewModel signupViewModel = this.LJLIL.LJLJLJ;
        if (signupViewModel != null) {
            String enterMethod = signupViewModel.getEnterMethod();
            o.LJIIIIZZ(enterMethod, "dependencies.enterMethod");
            return enterMethod;
        }
        o.LJIJI("dependencies");
        throw null;
    }

    @Override // X.InterfaceC68974R5e
    public final String channel() {
        SignupViewModel signupViewModel = this.LJLIL.LJLJLJ;
        if (signupViewModel != null) {
            String str = (String) signupViewModel.LJLL.getValue();
            o.LJIIIIZZ(str, "dependencies.channel");
            return str;
        }
        o.LJIJI("dependencies");
        throw null;
    }

    @Override // X.InterfaceC68974R5e
    public final String LLZZ() {
        return this.LJLJI;
    }

    @Override // X.InterfaceC68974R5e
    public final String Xg() {
        return this.LJLILLLLZI;
    }

    @Override // X.InterfaceC68974R5e
    public final Bundle getExtras() {
        return this.LJLJJI;
    }

    public C85583XiN(I18nSignUpActivity i18nSignUpActivity, String str, String str2, Bundle bundle) {
        this.LJLIL = i18nSignUpActivity;
        this.LJLILLLLZI = str;
        this.LJLJI = str2;
        this.LJLJJI = bundle;
    }
}
