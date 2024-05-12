package X;

import android.os.Bundle;
import com.bytedance.android.livesdk.interaction.drawguess.ui.DrawGuessNewStartDialog;
import com.bytedance.android.livesdk.interaction.drawguess.ui.DrawGuessStartFragment;

/* renamed from: X.BAd, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C28335BAd extends AbstractC65781Prl implements InterfaceC65784Pro<DrawGuessStartFragment> {
    public final /* synthetic */ DrawGuessNewStartDialog LJLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C28335BAd(DrawGuessNewStartDialog drawGuessNewStartDialog) {
        super(0);
        this.LJLIL = drawGuessNewStartDialog;
    }

    @Override // X.InterfaceC65784Pro
    public final DrawGuessStartFragment invoke() {
        DrawGuessNewStartDialog drawGuessNewStartDialog = this.LJLIL;
        boolean z = drawGuessNewStartDialog.LJLJJI;
        boolean z2 = drawGuessNewStartDialog.LJLJI;
        DrawGuessStartFragment drawGuessStartFragment = new DrawGuessStartFragment();
        Bundle bundle = new Bundle();
        bundle.putBoolean("argument_is_custom_next_word", z2);
        bundle.putBoolean("argument_is_from_round_summary", z);
        drawGuessStartFragment.setArguments(bundle);
        return drawGuessStartFragment;
    }
}
