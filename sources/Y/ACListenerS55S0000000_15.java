package Y;

import android.view.View;
import com.ss.android.ugc.aweme.setting.ui.SettingNewVersionFragment;

/* loaded from: classes16.dex */
public class ACListenerS55S0000000_15 implements View.OnClickListener {
    public final int $t;

    public static final void onClick$2(ACListenerS55S0000000_15 aCListenerS55S0000000_15, View view) {
    }

    public static final void onClick$3(ACListenerS55S0000000_15 aCListenerS55S0000000_15, View view) {
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.$t) {
            case 0:
                SettingNewVersionFragment.lambda$initUnits$13(view);
                return;
            case 1:
                SettingNewVersionFragment.lambda$initUnits$4(view);
                return;
            case 2:
                onClick$2(this, view);
                return;
            case 3:
                onClick$3(this, view);
                return;
            default:
                return;
        }
    }

    public ACListenerS55S0000000_15(int i) {
        this.$t = i;
    }
}
