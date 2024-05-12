package X;

import android.os.Bundle;
import com.ss.android.ugc.aweme.account.setpwd.VerifyPasswordFragment;

/* renamed from: X.Xj6, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C85628Xj6 extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public final /* synthetic */ VerifyPasswordFragment LJLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C85628Xj6(VerifyPasswordFragment verifyPasswordFragment) {
        super(0);
        this.LJLIL = verifyPasswordFragment;
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
