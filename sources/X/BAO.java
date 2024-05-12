package X;

import android.os.Bundle;
import com.bytedance.android.livesdk.interaction.drawguess.ui.DrawGuessNewStartDialog;

/* loaded from: classes6.dex */
public final class BAO {
    public static DrawGuessNewStartDialog LIZ(boolean z, boolean z2) {
        DrawGuessNewStartDialog drawGuessNewStartDialog = new DrawGuessNewStartDialog();
        Bundle bundle = new Bundle();
        bundle.putBoolean("argument_is_from_round_summary", z);
        bundle.putBoolean("argument_is_custom_next_word", z2);
        drawGuessNewStartDialog.setArguments(bundle);
        return drawGuessNewStartDialog;
    }
}
