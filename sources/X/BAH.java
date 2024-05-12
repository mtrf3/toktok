package X;

import android.os.Bundle;
import androidx.fragment.app.FragmentManager;
import com.bytedance.android.live.network.response.BaseResponse;
import com.bytedance.android.livesdk.interaction.drawguess.DrawGuessChangeWordEvent;
import com.bytedance.android.livesdk.interaction.drawguess.network.DrawGuessEndResponse;
import com.bytedance.android.livesdk.interaction.drawguess.ui.DrawGuessRoundSummaryDialog;
import com.bytedance.ies.sdk.datachannel.DataChannel;

/* loaded from: classes6.dex */
public final class BAH<T> implements InterfaceC64592gB {
    public final /* synthetic */ int LJLIL;
    public final /* synthetic */ DataChannel LJLILLLLZI;
    public final /* synthetic */ String LJLJI;
    public final /* synthetic */ InterfaceC65784Pro<C76800UCe> LJLJJI;

    public BAH(int i, DataChannel dataChannel, String str, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        this.LJLIL = i;
        this.LJLILLLLZI = dataChannel;
        this.LJLJI = str;
        this.LJLJJI = interfaceC65784Pro;
    }

    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Boolean, O] */
    @Override // X.InterfaceC64592gB
    public final void accept(Object obj) {
        BaseResponse baseResponse = (BaseResponse) obj;
        if (this.LJLIL == 4) {
            this.LJLILLLLZI.pv0(DrawGuessChangeWordEvent.class);
        } else {
            BAI.LJIIIZ(this.LJLILLLLZI, Long.valueOf(((DrawGuessEndResponse) baseResponse.data).statistics.guessCorrectUv), this.LJLJI);
            if (C0GA.LIZ(this.LJLILLLLZI) && ((DrawGuessEndResponse) baseResponse.data).statistics.guessCorrectUv > 0) {
                DrawGuessRoundSummaryDialog drawGuessRoundSummaryDialog = new DrawGuessRoundSummaryDialog();
                Bundle bundle = new Bundle();
                bundle.putBoolean("argument_is_auto_show", true);
                drawGuessRoundSummaryDialog.setArguments(bundle);
                FragmentManager LJFF = C29306Beo.LJFF(this.LJLILLLLZI);
                if (LJFF == null) {
                    return;
                } else {
                    drawGuessRoundSummaryDialog.show(LJFF, "DrawGuessUtil");
                }
            }
            BAF.LJJII(((DrawGuessEndResponse) baseResponse.data).statistics.guessCorrectUv, this.LJLILLLLZI);
            BAF.LJIIZILJ(this.LJLILLLLZI);
        }
        ((C32537Cpp) this.LJLILLLLZI.gv0(BCZ.class)).LIZ = Boolean.TRUE;
        this.LJLJJI.invoke();
    }
}
