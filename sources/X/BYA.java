package X;

import com.bytedance.android.livesdk.gift.model.SendGiftResult;
import com.bytedance.android.livesdk.revenue.level.api.event.ShowFansClubToastEvent;
import com.bytedance.android.livesdk.revenue.level.impl.fansclub.ui.FansClubJoinGiftDialog;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class BYA implements InterfaceC32497CpB {
    public final /* synthetic */ FansClubJoinGiftDialog LJLIL;

    @Override // X.InterfaceC32497CpB
    public final void LIZIZ(Throwable t) {
        o.LJIIIZ(t, "t");
    }

    public BYA(FansClubJoinGiftDialog fansClubJoinGiftDialog) {
        this.LJLIL = fansClubJoinGiftDialog;
    }

    @Override // X.InterfaceC32497CpB
    public final void LIZJ(SendGiftResult sendGiftResult) {
        String toast = C15380j0.LJIILJJIL(R.string.l76);
        C29474BhW.LIZLLL(this.LJLIL.dataChannel, "fans_club_gift");
        DataChannel dataChannel = this.LJLIL.dataChannel;
        if (dataChannel != null) {
            o.LJIIIIZZ(toast, "toast");
            dataChannel.qv0(ShowFansClubToastEvent.class, toast);
        }
    }
}
