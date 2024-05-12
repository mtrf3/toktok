package X;

import com.bytedance.android.live.design.app.LiveDialog;
import com.bytedance.ies.sdk.datachannel.DataChannel;

/* renamed from: X.BFm, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C28474BFm implements C0K7 {
    public final /* synthetic */ C41071jL LJLIL;
    public final /* synthetic */ BIR LJLILLLLZI;
    public final /* synthetic */ String LJLJI;
    public final /* synthetic */ DataChannel LJLJJI;

    public C28474BFm(C41071jL c41071jL, BIR bir, String str, DataChannel dataChannel) {
        this.LJLIL = c41071jL;
        this.LJLILLLLZI = bir;
        this.LJLJI = str;
        this.LJLJJI = dataChannel;
    }

    @Override // X.C0K7
    public final void LJIILLIIL(LiveDialog liveDialog) {
        liveDialog.dismiss();
        C41071jL c41071jL = this.LJLIL;
        if (c41071jL != null) {
            c41071jL.setChecked(false);
        }
        BIR bir = this.LJLILLLLZI;
        String str = this.LJLJI;
        DataChannel dataChannel = this.LJLJJI;
        bir.getClass();
        BIR.LJIIIIZZ(dataChannel, str, false);
    }
}
