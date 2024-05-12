package X;

import android.os.Bundle;
import com.ss.android.ugc.aweme.account.agegate.ftc.FtcCreatePasswordFragment;

/* loaded from: classes12.dex */
public final class RC7 extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public final /* synthetic */ FtcCreatePasswordFragment LJLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RC7(FtcCreatePasswordFragment ftcCreatePasswordFragment) {
        super(0);
        this.LJLIL = ftcCreatePasswordFragment;
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
