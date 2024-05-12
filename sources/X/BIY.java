package X;

import com.bytedance.android.live.design.app.LiveDialog;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;

/* loaded from: classes6.dex */
public final class BIY implements C0K7 {
    public final /* synthetic */ C41071jL LJLIL;
    public final /* synthetic */ BIR LJLILLLLZI;
    public final /* synthetic */ DataChannel LJLJI;
    public final /* synthetic */ String LJLJJI;
    public final /* synthetic */ Room LJLJJL;

    public BIY(C41071jL c41071jL, BIR bir, Room room, DataChannel dataChannel, String str) {
        this.LJLIL = c41071jL;
        this.LJLILLLLZI = bir;
        this.LJLJI = dataChannel;
        this.LJLJJI = str;
        this.LJLJJL = room;
    }

    @Override // X.C0K7
    public final void LJIILLIIL(LiveDialog liveDialog) {
        C41071jL c41071jL = this.LJLIL;
        if (c41071jL != null) {
            c41071jL.setChecked(false);
        }
        this.LJLILLLLZI.LJIIJJI(this.LJLIL, true, null);
        liveDialog.dismiss();
        BIR bir = this.LJLILLLLZI;
        DataChannel dataChannel = this.LJLJI;
        String str = this.LJLJJI;
        Room room = this.LJLJJL;
        bir.getClass();
        BIR.LJI(room, dataChannel, str, "cancel");
    }
}
