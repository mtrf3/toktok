package X;

import android.os.Bundle;
import com.ss.android.ugc.aweme.account.agegate.ftc.FtcCreateAccountFragment;

/* renamed from: X.Xk0, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C85684Xk0 extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public final /* synthetic */ FtcCreateAccountFragment LJLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C85684Xk0(FtcCreateAccountFragment ftcCreateAccountFragment) {
        super(0);
        this.LJLIL = ftcCreateAccountFragment;
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        Bundle arguments = this.LJLIL.getArguments();
        boolean z = false;
        if (arguments != null) {
            z = arguments.getBoolean("is_existing_user", false);
        }
        return Boolean.valueOf(z);
    }
}
