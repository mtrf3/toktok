package X;

import android.os.Bundle;
import com.bytedance.android.live.liveinteract.multiguestv3.main.guest.distribute.MultiGuestConnectDistributeParentFragment;
import kotlin.jvm.internal.o;

/* renamed from: X.Sk1, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C72945Sk1 {
    public static MultiGuestConnectDistributeParentFragment LIZ(String requestPage, InterfaceC65784Pro interfaceC65784Pro, boolean z) {
        o.LJIIIZ(requestPage, "requestPage");
        MultiGuestConnectDistributeParentFragment multiGuestConnectDistributeParentFragment = new MultiGuestConnectDistributeParentFragment();
        multiGuestConnectDistributeParentFragment.LJLJI = interfaceC65784Pro;
        Bundle bundle = new Bundle();
        bundle.putString("request_page", requestPage);
        bundle.putBoolean("show_back_icon", z);
        multiGuestConnectDistributeParentFragment.setArguments(bundle);
        return multiGuestConnectDistributeParentFragment;
    }
}
