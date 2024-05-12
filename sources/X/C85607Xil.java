package X;

import android.os.Bundle;
import com.ss.android.ugc.aweme.account.login.v2.ui.fragments.PhoneEmailSignUpFragment;
import com.ss.android.ugc.aweme.account.login.v2.ui.fragments.PhoneSignUpFragment;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.Xil, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C85607Xil extends AbstractC65781Prl implements InterfaceC65784Pro<C85603Xih> {
    public final /* synthetic */ PhoneEmailSignUpFragment LJLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C85607Xil(PhoneEmailSignUpFragment phoneEmailSignUpFragment) {
        super(0);
        this.LJLIL = phoneEmailSignUpFragment;
    }

    @Override // X.InterfaceC65784Pro
    public final C85603Xih invoke() {
        PhoneSignUpFragment phoneSignUpFragment = new PhoneSignUpFragment();
        Bundle bundle = new Bundle(this.LJLIL.getArguments());
        bundle.putInt("current_page", EnumC69113RAn.INPUT_PHONE_SIGN_UP.getValue());
        bundle.remove("next_page");
        phoneSignUpFragment.setArguments(bundle);
        String string = this.LJLIL.getString(R.string.idn);
        o.LJIIIIZZ(string, "getString(R.string.mus_phone)");
        return new C85603Xih(phoneSignUpFragment, string);
    }
}
