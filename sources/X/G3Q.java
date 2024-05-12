package X;

import android.os.Bundle;
import com.ss.android.ugc.aweme.account.login.v2.ui.AccountPrivateAccountTipsFragment;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class G3Q implements InterfaceC239229aA {
    public final /* synthetic */ AccountPrivateAccountTipsFragment LIZ;

    @Override // X.InterfaceC239229aA
    public final void next() {
        Bundle arguments = this.LIZ.getArguments();
        o.LJI(arguments);
        arguments.putInt("next_page", EnumC69113RAn.FINISH.getValue());
        AccountPrivateAccountTipsFragment accountPrivateAccountTipsFragment = this.LIZ;
        Bundle arguments2 = accountPrivateAccountTipsFragment.getArguments();
        o.LJI(arguments2);
        accountPrivateAccountTipsFragment.rh(arguments2);
    }

    public G3Q(AccountPrivateAccountTipsFragment accountPrivateAccountTipsFragment) {
        this.LIZ = accountPrivateAccountTipsFragment;
    }
}
