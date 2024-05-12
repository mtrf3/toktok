package X;

import android.os.Bundle;
import com.bytedance.android.live.liveinteract.multiguestv3.main.guest.distribute.MultiGuestConnectDistributeDialog;
import kotlin.jvm.internal.o;

/* renamed from: X.TaD, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C74885TaD {
    public static MultiGuestConnectDistributeDialog LIZ(String requestPage, int i) {
        boolean z;
        boolean z2 = true;
        if ((i & 2) != 0) {
            z = true;
        } else {
            z = false;
        }
        if ((i & 4) == 0) {
            z2 = false;
        }
        o.LJIIIZ(requestPage, "requestPage");
        MultiGuestConnectDistributeDialog multiGuestConnectDistributeDialog = new MultiGuestConnectDistributeDialog();
        Bundle bundle = new Bundle();
        bundle.putString("request_page", requestPage);
        bundle.putBoolean("show_back_icon", z);
        bundle.putBoolean("is_cancelable", z2);
        multiGuestConnectDistributeDialog.setArguments(bundle);
        return multiGuestConnectDistributeDialog;
    }
}
