package X;

import android.view.View;
import com.bytedance.android.live.design.view.sheet.action.LiveActionSheetDialog;
import com.bytedance.android.live.liveinteract.multiguestv3.main.guest.MultiGuestV3GuestWidget;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class TXU implements InterfaceC14120gy {
    public final /* synthetic */ MultiGuestV3GuestWidget LJLIL;

    public TXU(MultiGuestV3GuestWidget multiGuestV3GuestWidget) {
        this.LJLIL = multiGuestV3GuestWidget;
    }

    @Override // X.InterfaceC14120gy
    public final void LJ(View view, C0KG c0kg, LiveActionSheetDialog liveActionSheetDialog) {
        o.LJIIIZ(view, "<anonymous parameter 0>");
        liveActionSheetDialog.dismiss();
        this.LJLIL.showDisconnectSecondWindow();
    }
}