package X;

import android.os.Bundle;
import com.bytedance.android.live.liveinteract.multiguestv3.main.guest.distribute.MultiGuestConnectDistributeFragment;

/* renamed from: X.SkE, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C72958SkE extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public final /* synthetic */ MultiGuestConnectDistributeFragment LJLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C72958SkE(MultiGuestConnectDistributeFragment multiGuestConnectDistributeFragment) {
        super(0);
        this.LJLIL = multiGuestConnectDistributeFragment;
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        Bundle arguments = this.LJLIL.getArguments();
        boolean z = true;
        if (arguments != null) {
            z = arguments.getBoolean("show_back_icon", true);
        }
        return Boolean.valueOf(z);
    }
}
