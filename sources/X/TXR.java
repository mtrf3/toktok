package X;

import android.content.DialogInterface;
import com.bytedance.android.live.liveinteract.multiguestv3.main.guest.MultiGuestV3GuestWidget;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class TXR implements InterfaceC29883Bo7 {
    public final /* synthetic */ MultiGuestV3GuestWidget LIZ;

    public TXR(MultiGuestV3GuestWidget multiGuestV3GuestWidget) {
        this.LIZ = multiGuestV3GuestWidget;
    }

    @Override // X.InterfaceC29883Bo7
    public final void LIZ(DialogInterface dialog) {
        o.LJIIIZ(dialog, "dialog");
        MultiGuestV3GuestWidget multiGuestV3GuestWidget = this.LIZ;
        multiGuestV3GuestWidget.interactApplyDialog = null;
        multiGuestV3GuestWidget.dialogPresenter = null;
    }
}
