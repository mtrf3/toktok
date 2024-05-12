package X;

import android.content.DialogInterface;
import com.bytedance.android.livesdk.chatroom.widget.followguide.FollowGuideDialogWidget;
import com.bytedance.android.livesdk.dataChannel.RemindFollowDialogVisibilityChannel;
import com.bytedance.ies.sdk.datachannel.DataChannel;

/* renamed from: X.Bno, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class DialogInterfaceOnShowListenerC29864Bno implements DialogInterface.OnShowListener {
    public final /* synthetic */ FollowGuideDialogWidget LJLIL;

    public DialogInterfaceOnShowListenerC29864Bno(FollowGuideDialogWidget followGuideDialogWidget) {
        this.LJLIL = followGuideDialogWidget;
    }

    @Override // android.content.DialogInterface.OnShowListener
    public final void onShow(DialogInterface dialogInterface) {
        DataChannel dataChannel = this.LJLIL.dataChannel;
        if (dataChannel != null) {
            dataChannel.rv0(RemindFollowDialogVisibilityChannel.class, Boolean.TRUE);
        }
    }
}
