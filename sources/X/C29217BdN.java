package X;

import com.bytedance.android.live.liveinteract.multiguestv3.main.guest.DobDialogCanceledEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.main.guest.EditBirthFailedWithoutConfirm;
import com.bytedance.android.live.liveinteract.multiguestv3.main.guest.EditBirthSucc;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import kotlin.jvm.internal.o;

/* renamed from: X.BdN, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C29217BdN implements InterfaceC05250In {
    public final /* synthetic */ DataChannel LIZ;
    public final /* synthetic */ int LIZIZ;

    @Override // X.InterfaceC05250In
    public final C76800UCe LJI() {
        C75017TcL.LJIJJLI(this.LIZIZ);
        DataChannel dataChannel = this.LIZ;
        if (dataChannel != null) {
            dataChannel.pv0(DobDialogCanceledEvent.class);
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC05250In
    public final C76800UCe onFailed(String str) {
        DataChannel dataChannel;
        if (o.LJ(str, "") && this.LIZIZ == 2 && (dataChannel = this.LIZ) != null) {
            dataChannel.pv0(EditBirthFailedWithoutConfirm.class);
        }
        return C76800UCe.LIZ;
    }

    public C29217BdN(int i, DataChannel dataChannel) {
        this.LIZ = dataChannel;
        this.LIZIZ = i;
    }

    @Override // X.InterfaceC05250In
    public final C76800UCe LJFF(String str, String str2) {
        C78963Uyt.LJLIL = true;
        C78963Uyt.LJLILLLLZI = true;
        DataChannel dataChannel = this.LIZ;
        if (dataChannel != null) {
            dataChannel.qv0(EditBirthSucc.class, Integer.valueOf(this.LIZIZ));
        }
        return C76800UCe.LIZ;
    }
}
