package X;

import android.content.DialogInterface;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;

/* renamed from: X.BFo, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class DialogInterfaceOnShowListenerC28476BFo implements DialogInterface.OnShowListener {
    public final /* synthetic */ BIR LJLIL;
    public final /* synthetic */ String LJLILLLLZI;

    public DialogInterfaceOnShowListenerC28476BFo(BIR bir, String str) {
        this.LJLIL = bir;
        this.LJLILLLLZI = str;
    }

    @Override // android.content.DialogInterface.OnShowListener
    public final void onShow(DialogInterface dialogInterface) {
        Room room;
        BIR bir = this.LJLIL;
        String str = this.LJLILLLLZI;
        bir.getClass();
        DataChannel LIZJ = C30446BxC.LIZJ(C30446BxC.LIZ);
        Long l = null;
        if (LIZJ != null) {
            room = (Room) LIZJ.kv0(RoomChannel.class);
        } else {
            room = null;
        }
        BZI LIZ = C28787BRn.LIZ("livesdk_sub_only_live_use_music_popup_show");
        LIZ.LJIIZILJ();
        if (room != null) {
            l = Long.valueOf(room.getOwnerUserId());
        }
        LIZ.LJIJJ(l, "anchor_id");
        LIZ.LJIJJ(str, "click_position");
        LIZ.LJJIIJZLJL();
    }
}
