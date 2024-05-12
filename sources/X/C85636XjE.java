package X;

import android.os.Bundle;
import com.ss.android.ugc.aweme.account.agegate.ftc.FtcCreateAccountFragment;

/* renamed from: X.XjE, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C85636XjE extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public final /* synthetic */ FtcCreateAccountFragment LJLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C85636XjE(FtcCreateAccountFragment ftcCreateAccountFragment) {
        super(0);
        this.LJLIL = ftcCreateAccountFragment;
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
