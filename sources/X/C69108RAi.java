package X;

import android.os.Bundle;
import com.ss.android.ugc.aweme.account.login.v2.ui.fragments.InputCodeFragment;

/* renamed from: X.RAi, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C69108RAi extends AbstractC65781Prl implements InterfaceC65784Pro<C76800UCe> {
    public final /* synthetic */ InputCodeFragment LJLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C69108RAi(InputCodeFragment inputCodeFragment) {
        super(0);
        this.LJLIL = inputCodeFragment;
    }

    @Override // X.InterfaceC65784Pro
    public final C76800UCe invoke() {
        Bundle arguments = this.LJLIL.getArguments();
        if (arguments != null) {
            InputCodeFragment inputCodeFragment = this.LJLIL;
            arguments.putInt("next_page", EnumC69113RAn.OPTIONAL_SIGNUP_PAGES.getValue());
            arguments.putInt("previous_page", EnumC69113RAn.PHONE_SMS_BIND.getValue());
            arguments.putBoolean("is_new_3p_signup", true);
            inputCodeFragment.rh(arguments);
        }
        return C76800UCe.LIZ;
    }
}
