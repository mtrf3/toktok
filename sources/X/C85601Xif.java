package X;

import android.os.Bundle;
import com.ss.android.ugc.aweme.account.login.v2.ui.fragments.PhoneEmailLoginFragment;
import com.ss.android.ugc.aweme.account.login.v2.ui.fragments.PhoneLoginFragment;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.Xif, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C85601Xif extends AbstractC65781Prl implements InterfaceC65784Pro<C85603Xih> {
    public final /* synthetic */ PhoneEmailLoginFragment LJLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C85601Xif(PhoneEmailLoginFragment phoneEmailLoginFragment) {
        super(0);
        this.LJLIL = phoneEmailLoginFragment;
    }

    @Override // X.InterfaceC65784Pro
    public final C85603Xih invoke() {
        PhoneLoginFragment phoneLoginFragment = new PhoneLoginFragment();
        phoneLoginFragment.setArguments(new Bundle(this.LJLIL.getArguments()));
        Bundle arguments = phoneLoginFragment.getArguments();
        o.LJI(arguments);
        arguments.putInt("current_page", EnumC69113RAn.INPUT_PHONE_LOGIN.getValue());
        Bundle arguments2 = phoneLoginFragment.getArguments();
        o.LJI(arguments2);
        arguments2.putInt("current_scene", phoneLoginFragment.xl().getValue());
        Bundle arguments3 = phoneLoginFragment.getArguments();
        o.LJI(arguments3);
        arguments3.remove("next_page");
        String string = this.LJLIL.getString(R.string.idn);
        o.LJIIIIZZ(string, "getString(R.string.mus_phone)");
        return new C85603Xih(phoneLoginFragment, string);
    }
}
