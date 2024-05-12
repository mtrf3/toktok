package X;

import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.livesdk.interaction.drawguess.ui.DrawGuessAnchorSummaryDialog;
import com.bytedance.android.livesdk.model.message.PictionaryInfo;
import com.bytedance.android.livesdkapi.depend.model.live.PictionaryFullInfo;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class BA7 extends C0A6 {
    public final /* synthetic */ DrawGuessAnchorSummaryDialog LJLIL;
    public final /* synthetic */ List<PictionaryFullInfo> LJLILLLLZI;

    public BA7(DrawGuessAnchorSummaryDialog drawGuessAnchorSummaryDialog, List<PictionaryFullInfo> list) {
        this.LJLIL = drawGuessAnchorSummaryDialog;
        this.LJLILLLLZI = list;
    }

    @Override // X.C0A6
    public final void LJIILJJIL(int i, RecyclerView recyclerView) {
        long j;
        PictionaryInfo pictionaryInfo;
        o.LJIIIZ(recyclerView, "recyclerView");
        if (i == 0) {
            DrawGuessAnchorSummaryDialog drawGuessAnchorSummaryDialog = this.LJLIL;
            List<PictionaryFullInfo> list = this.LJLILLLLZI;
            drawGuessAnchorSummaryDialog.getClass();
            BZI LIZ = C28787BRn.LIZ("livesdk_anchor_pictionary_endpage_roll");
            LIZ.LJIILLIIL(drawGuessAnchorSummaryDialog.dataChannel);
            PictionaryFullInfo pictionaryFullInfo = (PictionaryFullInfo) ORZ.LJLLLL(list);
            if (pictionaryFullInfo != null && (pictionaryInfo = pictionaryFullInfo.pictionaryInfo) != null) {
                j = pictionaryInfo.sessionId;
            } else {
                j = 0;
            }
            LIZ.LJIJJ(Long.valueOf(j), "pictionary_session_id");
            LIZ.LJIJJ(Integer.valueOf(list.size()), "number_cnt");
            LIZ.LJJIIJZLJL();
        }
    }
}
