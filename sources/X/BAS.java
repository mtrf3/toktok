package X;

import com.bytedance.android.live.design.app.LiveDialog;
import com.bytedance.android.livesdk.broadcast.AgeRestrictedChannel;
import com.bytedance.ies.sdk.datachannel.DataChannel;

/* loaded from: classes6.dex */
public final class BAS implements C0K7 {
    public final /* synthetic */ DataChannel LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ String LJLJI;

    public BAS(DataChannel dataChannel, String str, String str2) {
        this.LJLIL = dataChannel;
        this.LJLILLLLZI = str;
        this.LJLJI = str2;
    }

    @Override // X.C0K7
    public final void LJIILLIIL(LiveDialog liveDialog) {
        liveDialog.dismiss();
        DataChannel dataChannel = this.LJLIL;
        if (dataChannel != null) {
            dataChannel.rv0(AgeRestrictedChannel.class, 4);
        }
        BZI LIZ = C28787BRn.LIZ("livesdk_mature_theme_popup_click");
        LIZ.LJIIZILJ();
        LIZ.LJIJJ(this.LJLILLLLZI, "enter_from");
        LIZ.LJIJJ("1", "action_type");
        LIZ.LJIJJ(String.valueOf(((C29374Bfu) B83.LIZ().LIZIZ()).getCurrentUserId()), "anchor_id");
        LIZ.LJIJJ(this.LJLJI, "source");
        LIZ.LJJIIJZLJL();
    }
}
