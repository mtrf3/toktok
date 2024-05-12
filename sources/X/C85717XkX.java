package X;

import android.os.Bundle;
import com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BindEmailWithoutVerifyFragment;

/* renamed from: X.XkX, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C85717XkX extends AbstractC65781Prl implements InterfaceC65784Pro<C76800UCe> {
    public final /* synthetic */ BindEmailWithoutVerifyFragment LJLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C85717XkX(BindEmailWithoutVerifyFragment bindEmailWithoutVerifyFragment) {
        super(0);
        this.LJLIL = bindEmailWithoutVerifyFragment;
    }

    @Override // X.InterfaceC65784Pro
    public final C76800UCe invoke() {
        Bundle arguments = this.LJLIL.getArguments();
        if (arguments != null) {
            BindEmailWithoutVerifyFragment bindEmailWithoutVerifyFragment = this.LJLIL;
            arguments.putInt("next_page", EnumC69113RAn.OPTIONAL_SIGNUP_PAGES.getValue());
            arguments.putInt("previous_page", EnumC69113RAn.BIND_EMAIL_WITHOUT_VERIFY_ON_SIGN_UP_OR_LOGIN.getValue());
            arguments.putBoolean("is_new_3p_signup", true);
            bindEmailWithoutVerifyFragment.rh(arguments);
        }
        return C76800UCe.LIZ;
    }
}
