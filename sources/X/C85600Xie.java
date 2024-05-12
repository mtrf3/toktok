package X;

import android.os.Bundle;
import com.ss.android.ugc.aweme.account.login.v2.ui.fragments.EmailPasswordLoginFragment;
import com.ss.android.ugc.aweme.account.login.v2.ui.fragments.PhoneEmailLoginFragment;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.Xie, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C85600Xie extends AbstractC65781Prl implements InterfaceC65784Pro<C85603Xih> {
    public final /* synthetic */ PhoneEmailLoginFragment LJLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C85600Xie(PhoneEmailLoginFragment phoneEmailLoginFragment) {
        super(0);
        this.LJLIL = phoneEmailLoginFragment;
    }

    @Override // X.InterfaceC65784Pro
    public final C85603Xih invoke() {
        EmailPasswordLoginFragment emailPasswordLoginFragment = new EmailPasswordLoginFragment();
        emailPasswordLoginFragment.setArguments(new Bundle(this.LJLIL.getArguments()));
        Bundle arguments = emailPasswordLoginFragment.getArguments();
        o.LJI(arguments);
        arguments.putInt("current_page", EnumC69113RAn.INPUT_EMAIL_LOGIN.getValue());
        Bundle arguments2 = emailPasswordLoginFragment.getArguments();
        o.LJI(arguments2);
        arguments2.remove("next_page");
        String string = this.LJLIL.getString(R.string.do0);
        o.LJIIIIZZ(string, "getString(R.string.common_login_email_input_tab)");
        return new C85603Xih(emailPasswordLoginFragment, string);
    }
}
