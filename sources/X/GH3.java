package X;

import android.os.Bundle;
import com.ss.android.ugc.aweme.compliance.privacy.paprompt.ui.PaPromptProcessFragment;

/* loaded from: classes8.dex */
public final class GH3 {
    public static PaPromptProcessFragment LIZ(int i, int i2, String str) {
        PaPromptProcessFragment paPromptProcessFragment = new PaPromptProcessFragment();
        Bundle LIZLLL = C1DG.LIZLLL("private_account_prompt", i, "private_account_prompt_type", i2);
        LIZLLL.putString("enter_position", str);
        paPromptProcessFragment.setArguments(LIZLLL);
        return paPromptProcessFragment;
    }
}
