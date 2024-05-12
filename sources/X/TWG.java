package X;

import android.view.View;
import com.bytedance.android.live.design.view.sheet.action.LiveActionSheetDialog;
import com.bytedance.android.live.liveinteract.multiguestv3.main.guest.GuestDisconnectByWindowWithConfirmEvent;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class TWG implements InterfaceC14120gy {
    public final /* synthetic */ TWH LJLIL;

    public TWG(TWH twh) {
        this.LJLIL = twh;
    }

    @Override // X.InterfaceC14120gy
    public final void LJ(View view, C0KG c0kg, LiveActionSheetDialog liveActionSheetDialog) {
        o.LJIIIZ(view, "<anonymous parameter 0>");
        liveActionSheetDialog.dismiss();
        TWH twh = this.LJLIL;
        twh.getClass();
        C74824TYe.LIZ.LJIJI(((C29374Bfu) B83.LIZ().LIZIZ()).getCurrentUserId(), "guest", "guest_icon", twh.LIZIZ().LJJJJI, C78886Uxe.LJJJJLL(C8E.LJ()));
        DataChannel dataChannel = twh.LJLIL;
        if (dataChannel != null) {
            dataChannel.qv0(GuestDisconnectByWindowWithConfirmEvent.class, new OSZ("guest_icon", 10002));
        }
    }
}
