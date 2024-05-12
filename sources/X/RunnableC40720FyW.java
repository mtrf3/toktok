package X;

import android.content.Intent;
import android.os.Bundle;
import com.ss.android.ugc.aweme.journey.step.slogan.ControlSloganFragment;
import com.ss.android.ugc.aweme.journey.step.slogan.SloganFragment;

/* renamed from: X.FyW, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class RunnableC40720FyW implements Runnable {
    public final /* synthetic */ SloganFragment LJLIL;

    public RunnableC40720FyW(ControlSloganFragment controlSloganFragment) {
        this.LJLIL = controlSloganFragment;
    }

    public final void LIZ() {
        Intent intent;
        Intent intent2;
        C56662Kg.LIZ().LJFF("cold_boot_start_to_preload_main", false);
        Bundle arguments = this.LJLIL.getArguments();
        if (arguments != null && arguments.getInt("extra_optimize_option", 0) == 2 && !arguments.getBoolean("extra_is_saveinstance", false) && !C40721FyX.LIZ) {
            C40721FyX.LIZ = true;
            ActivityC45651qj mo49getActivity = this.LJLIL.mo49getActivity();
            if (mo49getActivity != null && (intent2 = mo49getActivity.getIntent()) != null) {
                intent = intent2.setClassName(this.LJLIL.requireActivity(), G2G.LIZIZ.getSplashActivityClass().getName());
                if (intent != null) {
                    Intent flags = intent.setFlags(268435456);
                    if (flags != null) {
                        flags.addFlags(67108864);
                    }
                    intent.putExtra("reorder_new_journey_front", true);
                    intent.putExtra("from_new_user_journey", true);
                    intent.putExtra("pre_mainactivity_first_enter", true);
                }
            } else {
                intent = null;
            }
            ActivityC45651qj mo49getActivity2 = this.LJLIL.mo49getActivity();
            if (mo49getActivity2 != null) {
                C16880lQ.LIZLLL(mo49getActivity2, intent);
            }
            FFX.LIZ(1, "is_preload_main");
            FAJ.LIZ("cold_boot_new_user_pre_main", false);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            LIZ();
        } finally {
            if (LIZ) {
            }
        }
    }
}
