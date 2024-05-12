package X;

import android.os.Bundle;
import com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment;
import com.ss.android.ugc.aweme.account.login.v2.ui.fragments.CombinedEmailSignupLoginFragment;
import com.ss.android.ugc.aweme.account.login.v2.ui.fragments.EmailSignUpFragment;
import com.ss.android.ugc.aweme.account.login.v2.ui.fragments.PhoneEmailSignUpFragment;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.Xik, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C85606Xik extends AbstractC65781Prl implements InterfaceC65784Pro<C85603Xih> {
    public final /* synthetic */ PhoneEmailSignUpFragment LJLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C85606Xik(PhoneEmailSignUpFragment phoneEmailSignUpFragment) {
        super(0);
        this.LJLIL = phoneEmailSignUpFragment;
    }

    @Override // X.InterfaceC65784Pro
    public final C85603Xih invoke() {
        boolean z;
        BaseI18nLoginFragment emailSignUpFragment;
        int i;
        Bundle bundle = new Bundle(this.LJLIL.getArguments());
        if (this.LJLIL.Al() == EnumC69113RAn.COMBINED_LOGIN_SIGN_UP) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            bundle.putInt("current_page", EnumC69113RAn.COMBINED_INPUT_EMAIL_LOGIN_SIGN_UP.getValue());
            emailSignUpFragment = new CombinedEmailSignupLoginFragment();
            i = R.string.do0;
        } else {
            bundle.putInt("current_page", EnumC69113RAn.INPUT_EMAIL_SIGN_UP.getValue());
            emailSignUpFragment = new EmailSignUpFragment();
            i = R.string.iba;
        }
        bundle.remove("next_page");
        emailSignUpFragment.setArguments(bundle);
        String string = this.LJLIL.getString(i);
        o.LJIIIIZZ(string, "getString(tabTitleId)");
        return new C85603Xih(emailSignUpFragment, string);
    }
}
