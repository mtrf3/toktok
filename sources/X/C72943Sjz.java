package X;

import android.os.Bundle;
import com.bytedance.android.live.liveinteract.multiguestv3.main.guest.distribute.MultiGuestConnectDistributeFragment;
import com.bytedance.android.live.liveinteract.multiguestv3.main.guest.distribute.MultiGuestConnectDistributeParentFragment;

/* renamed from: X.Sjz, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C72943Sjz extends AbstractC65781Prl implements InterfaceC65784Pro<MultiGuestConnectDistributeFragment> {
    public final /* synthetic */ MultiGuestConnectDistributeParentFragment LJLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C72943Sjz(MultiGuestConnectDistributeParentFragment multiGuestConnectDistributeParentFragment) {
        super(0);
        this.LJLIL = multiGuestConnectDistributeParentFragment;
    }

    @Override // X.InterfaceC65784Pro
    public final MultiGuestConnectDistributeFragment invoke() {
        String string;
        MultiGuestConnectDistributeFragment multiGuestConnectDistributeFragment = new MultiGuestConnectDistributeFragment();
        MultiGuestConnectDistributeParentFragment multiGuestConnectDistributeParentFragment = this.LJLIL;
        Bundle bundle = new Bundle();
        Bundle arguments = multiGuestConnectDistributeParentFragment.getArguments();
        String str = "";
        if (arguments != null && (string = arguments.getString("request_page", "")) != null) {
            str = string;
        }
        bundle.putString("request_page", str);
        Bundle arguments2 = multiGuestConnectDistributeParentFragment.getArguments();
        boolean z = true;
        if (arguments2 != null) {
            z = arguments2.getBoolean("show_back_icon", true);
        }
        bundle.putBoolean("show_back_icon", z);
        multiGuestConnectDistributeFragment.setArguments(bundle);
        return multiGuestConnectDistributeFragment;
    }
}
