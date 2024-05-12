package X;

import com.bytedance.android.live.liveinteract.multiguestv3.main.guest.MultiGuestV3GuestWidget;

/* loaded from: classes14.dex */
public final class TXJ implements InterfaceC74790TWw {
    public final /* synthetic */ MultiGuestV3GuestWidget LJLIL;

    public TXJ(MultiGuestV3GuestWidget multiGuestV3GuestWidget) {
        this.LJLIL = multiGuestV3GuestWidget;
    }

    @Override // X.InterfaceC74790TWw
    public final void LIZ(boolean z) {
        this.LJLIL.onModeratorPermissionChange(z);
    }
}
