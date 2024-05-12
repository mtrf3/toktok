package X;

import com.ss.android.ugc.aweme.push.downgrade.OptimizePushProcessImpl;

/* loaded from: classes7.dex */
public final class FG7 implements InterfaceC64592gB<Boolean> {
    @Override // X.InterfaceC64592gB
    public final void accept(Boolean bool) {
        if (bool.booleanValue()) {
            OptimizePushProcessImpl.LIZ.getClass();
            if (!OptimizePushProcessImpl.LIZLLL) {
                OptimizePushProcessImpl.LIZLLL = true;
                FGG.LJ = true;
                C37179EiV.LIZ().postDelayed(EI1.LJLIL, C00F.LIZ(31744, 0, "optimize_push_process_delay_time", true));
            }
        }
    }
}
