package X;

import android.os.Bundle;
import com.ss.android.ugc.aweme.account.unbind.UnbindConfirmFragment;

/* renamed from: X.Xlj, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C85791Xlj extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public final /* synthetic */ UnbindConfirmFragment LJLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C85791Xlj(UnbindConfirmFragment unbindConfirmFragment) {
        super(0);
        this.LJLIL = unbindConfirmFragment;
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z;
        Bundle arguments = this.LJLIL.getArguments();
        if (arguments != null) {
            z = arguments.getBoolean("is_2sv_env");
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
