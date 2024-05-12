package X;

import com.bytedance.android.livesdk.gift.model.SendGiftResult;
import com.bytedance.android.livesdk.revenue.level.api.event.OpenFansClubPageEvent;
import com.bytedance.android.livesdk.revenue.level.api.event.ShowFansClubToastEvent;
import com.bytedance.android.livesdk.revenue.level.impl.fansclub.ui.FansClubJoinDialog;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class BYB implements InterfaceC32497CpB {
    public final /* synthetic */ FansClubJoinDialog LJLIL;

    @Override // X.InterfaceC32497CpB
    public final void LIZIZ(Throwable t) {
        o.LJIIIZ(t, "t");
    }

    public BYB(FansClubJoinDialog fansClubJoinDialog) {
        this.LJLIL = fansClubJoinDialog;
    }

    @Override // X.InterfaceC32497CpB
    public final void LIZJ(SendGiftResult sendGiftResult) {
        String toast = C15380j0.LJIILJJIL(R.string.l76);
        FansClubJoinDialog fansClubJoinDialog = this.LJLIL;
        C29474BhW.LIZLLL(fansClubJoinDialog.dataChannel, fansClubJoinDialog.LJLLILLLL);
        DataChannel dataChannel = this.LJLIL.dataChannel;
        if (dataChannel != null) {
            o.LJIIIIZZ(toast, "toast");
            dataChannel.qv0(ShowFansClubToastEvent.class, toast);
        }
        FansClubJoinDialog fansClubJoinDialog2 = this.LJLIL;
        DataChannel dataChannel2 = fansClubJoinDialog2.dataChannel;
        if (dataChannel2 != null) {
            dataChannel2.qv0(OpenFansClubPageEvent.class, fansClubJoinDialog2.LJLLILLLL);
        }
    }
}
