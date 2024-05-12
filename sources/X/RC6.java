package X;

import android.os.Bundle;
import com.ss.android.ugc.aweme.account.agegate.ftc.FtcCreatePasswordFragment;

/* loaded from: classes12.dex */
public final class RC6 extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public final /* synthetic */ FtcCreatePasswordFragment LJLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RC6(FtcCreatePasswordFragment ftcCreatePasswordFragment) {
        super(0);
        this.LJLIL = ftcCreatePasswordFragment;
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z;
        Bundle arguments = this.LJLIL.getArguments();
        if (arguments != null) {
            z = arguments.getBoolean("age_gate_block");
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
