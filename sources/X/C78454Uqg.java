package X;

import android.os.Bundle;
import com.ss.android.ugc.aweme.account.agegate.customdataforsdk.TTKAgeGateRegistrationFragment;

/* renamed from: X.Uqg, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C78454Uqg extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public final /* synthetic */ TTKAgeGateRegistrationFragment LJLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C78454Uqg(TTKAgeGateRegistrationFragment tTKAgeGateRegistrationFragment) {
        super(0);
        this.LJLIL = tTKAgeGateRegistrationFragment;
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z;
        Bundle arguments = this.LJLIL.getArguments();
        if (arguments != null) {
            z = arguments.getBoolean("isFtc");
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
