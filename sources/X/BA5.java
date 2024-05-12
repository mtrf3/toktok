package X;

import android.view.View;
import com.bytedance.android.live.UserWannaSendMessageEvent;
import com.bytedance.android.livesdk.interaction.drawguess.ui.DrawGuessAudienceSummaryDialog;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class BA5 extends AbstractC65781Prl implements InterfaceC88472Yns<View, C76800UCe> {
    public final /* synthetic */ DrawGuessAudienceSummaryDialog LJLIL;
    public final /* synthetic */ long LJLILLLLZI;
    public final /* synthetic */ int LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BA5(DrawGuessAudienceSummaryDialog drawGuessAudienceSummaryDialog, long j, int i) {
        super(1);
        this.LJLIL = drawGuessAudienceSummaryDialog;
        this.LJLILLLLZI = j;
        this.LJLJI = i;
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(View it) {
        o.LJIIIZ(it, "it");
        DrawGuessAudienceSummaryDialog drawGuessAudienceSummaryDialog = this.LJLIL;
        long j = this.LJLILLLLZI;
        int i = this.LJLJI;
        drawGuessAudienceSummaryDialog.getClass();
        BZI LIZ = C28787BRn.LIZ("livesdk_audience_pictionary_click_send_result");
        LIZ.LJIILLIIL(drawGuessAudienceSummaryDialog.dataChannel);
        BAI.LIZ(LIZ);
        LIZ.LJIJJ(String.valueOf(j), "pictionary_session_id");
        LIZ.LJIJJ(String.valueOf(i), "correct_cnt");
        LIZ.LJJIIJZLJL();
        int i2 = this.LJLJI;
        C30926CBu c30926CBu = new C30926CBu(3, C15380j0.LJIIIIZZ(R.plurals.kt, i2, Integer.valueOf(i2)));
        DataChannel dataChannel = this.LJLIL.dataChannel;
        if (dataChannel != null) {
            dataChannel.qv0(UserWannaSendMessageEvent.class, c30926CBu);
        }
        this.LJLIL.dismiss();
        return C76800UCe.LIZ;
    }
}
