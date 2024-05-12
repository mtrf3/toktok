package X;

import android.os.Bundle;
import com.ss.android.ugc.aweme.account.login.v2.ui.fragments.InputPhoneFragment;

/* renamed from: X.XkW, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C85716XkW extends AbstractC65781Prl implements InterfaceC65784Pro<C76800UCe> {
    public final /* synthetic */ InputPhoneFragment LJLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C85716XkW(InputPhoneFragment inputPhoneFragment) {
        super(0);
        this.LJLIL = inputPhoneFragment;
    }

    @Override // X.InterfaceC65784Pro
    public final C76800UCe invoke() {
        Bundle arguments = this.LJLIL.getArguments();
        if (arguments != null) {
            InputPhoneFragment inputPhoneFragment = this.LJLIL;
            arguments.putInt("next_page", EnumC69113RAn.OPTIONAL_SIGNUP_PAGES.getValue());
            arguments.putInt("previous_page", inputPhoneFragment.Al().getValue());
            arguments.putBoolean("is_new_3p_signup", true);
            inputPhoneFragment.rh(arguments);
        }
        return C76800UCe.LIZ;
    }
}
