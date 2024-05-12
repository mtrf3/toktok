package X;

import android.os.Bundle;
import com.ss.android.ugc.aweme.account.login.twostep.VerifyPhoneForTicketFragment;

/* renamed from: X.Xj8, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C85630Xj8 extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public final /* synthetic */ VerifyPhoneForTicketFragment LJLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C85630Xj8(VerifyPhoneForTicketFragment verifyPhoneForTicketFragment) {
        super(0);
        this.LJLIL = verifyPhoneForTicketFragment;
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        Bundle arguments = this.LJLIL.getArguments();
        boolean z = false;
        if (arguments != null) {
            z = arguments.getBoolean("is_idv", false);
        }
        return Boolean.valueOf(z);
    }
}
