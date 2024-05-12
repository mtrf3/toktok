package X;

import com.bytedance.android.live.liveinteract.multiguestv3.main.guest.DobDialogCanceledEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.main.guest.EditBirthFailedWithoutConfirm;
import com.bytedance.android.live.liveinteract.multiguestv3.main.guest.EditBirthSucc;
import com.bytedance.android.live.liveinteract.multiguestv3.main.guest.MultiGuestV3GuestWidget;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import kotlin.jvm.internal.o;

/* renamed from: X.Bdi, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C29238Bdi implements InterfaceC05250In {
    public final /* synthetic */ MultiGuestV3GuestWidget LIZ;
    public final /* synthetic */ int LIZIZ;

    @Override // X.InterfaceC05250In
    public final C76800UCe LJI() {
        C0NB.LIZIZ("MultiGuestV3GuestWidget", "canceled dialog for edit dob");
        C75017TcL.LJIJJLI(this.LIZIZ);
        DataChannel dataChannel = this.LIZ.dataChannel;
        if (dataChannel != null) {
            dataChannel.pv0(DobDialogCanceledEvent.class);
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC05250In
    public final C76800UCe onFailed(String str) {
        DataChannel dataChannel;
        if (o.LJ(str, "") && this.LIZIZ == 2 && (dataChannel = this.LIZ.dataChannel) != null) {
            dataChannel.pv0(EditBirthFailedWithoutConfirm.class);
        }
        String logTAG = this.LIZ.logTAG(790);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("edit dob failed and msg:");
        LIZ.append(str);
        C32014ChO.LIZJ(logTAG, X1D.LIZIZ(LIZ), null);
        return C76800UCe.LIZ;
    }

    public C29238Bdi(int i, MultiGuestV3GuestWidget multiGuestV3GuestWidget) {
        this.LIZ = multiGuestV3GuestWidget;
        this.LIZIZ = i;
    }

    @Override // X.InterfaceC05250In
    public final C76800UCe LJFF(String str, String str2) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(" enter edit dob succeed and dob:");
        LIZ.append(str);
        LIZ.append(", appealUrl:");
        LIZ.append(str2);
        C0NB.LIZIZ("MultiGuestV3GuestWidget", X1D.LIZIZ(LIZ));
        C78963Uyt.LJLIL = true;
        C78963Uyt.LJLILLLLZI = true;
        DataChannel dataChannel = this.LIZ.dataChannel;
        if (dataChannel != null) {
            dataChannel.qv0(EditBirthSucc.class, Integer.valueOf(this.LIZIZ));
        }
        return C76800UCe.LIZ;
    }
}
