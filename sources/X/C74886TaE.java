package X;

import android.os.Bundle;
import com.bytedance.android.live.liveinteract.multiguestv3.main.guest.distribute.MultiGuestConnectDistributeDialog;

/* renamed from: X.TaE, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C74886TaE extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public final /* synthetic */ MultiGuestConnectDistributeDialog LJLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C74886TaE(MultiGuestConnectDistributeDialog multiGuestConnectDistributeDialog) {
        super(0);
        this.LJLIL = multiGuestConnectDistributeDialog;
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        Bundle arguments = this.LJLIL.getArguments();
        boolean z = true;
        if (arguments != null) {
            z = arguments.getBoolean("is_cancelable", true);
        }
        return Boolean.valueOf(z);
    }
}