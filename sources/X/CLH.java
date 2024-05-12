package X;

import android.content.DialogInterface;
import com.bytedance.android.livesdk.RechargeDialogDismissEvent;
import com.bytedance.ies.sdk.datachannel.DataChannel;

/* loaded from: classes6.dex */
public final class CLH implements DialogInterface.OnDismissListener {
    public final /* synthetic */ CLB LJLIL;
    public final /* synthetic */ DataChannel LJLILLLLZI;
    public final /* synthetic */ C15960jw LJLJI;

    public CLH(CLB clb, DataChannel dataChannel, C15960jw c15960jw) {
        this.LJLIL = clb;
        this.LJLILLLLZI = dataChannel;
        this.LJLJI = c15960jw;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        CLK clk = this.LJLIL.LIZJ;
        Long l = clk.LIZJ;
        if (l == null) {
            clk.LIZIZ = true;
            clk.LIZJ = Long.valueOf(System.currentTimeMillis());
        } else if (System.currentTimeMillis() - l.longValue() >= clk.LIZ) {
            clk.LIZIZ = true;
            clk.LIZJ = Long.valueOf(System.currentTimeMillis());
        } else if (!clk.LIZIZ) {
            clk.LIZIZ = true;
            clk.LIZJ = Long.valueOf(System.currentTimeMillis());
        } else {
            return;
        }
        this.LJLILLLLZI.qv0(RechargeDialogDismissEvent.class, this.LJLJI.LJIIJJI);
    }
}
