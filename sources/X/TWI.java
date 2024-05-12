package X;

import android.view.View;
import com.bytedance.android.live.design.view.sheet.action.LiveActionSheetDialog;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.channel.OpenMultiGuestModeratorsManageDialogEvent;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class TWI implements InterfaceC14120gy {
    public final /* synthetic */ TWH LJLIL;

    public TWI(TWH twh) {
        this.LJLIL = twh;
    }

    @Override // X.InterfaceC14120gy
    public final void LJ(View view, C0KG c0kg, LiveActionSheetDialog liveActionSheetDialog) {
        o.LJIIIZ(view, "<anonymous parameter 0>");
        liveActionSheetDialog.dismiss();
        DataChannel dataChannel = this.LJLIL.LJLIL;
        if (dataChannel != null) {
            dataChannel.qv0(OpenMultiGuestModeratorsManageDialogEvent.class, new IPJ(EnumC46470ILq.LINKED_POP_ACTION_SHEET_DIALOG, 2, 0));
        }
    }
}
