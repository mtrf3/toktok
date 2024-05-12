package X;

import Y.ARunnableS13S0000000_6;
import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.lego.RunnableIdleTask;

/* loaded from: classes7.dex */
public final class EH5 implements F67 {
    public static final EH5 LJLIL = new EH5();

    @Override // X.F67
    public final void onChanged() {
        try {
            SettingsManager.LIZLLL().getClass();
            if (SettingsManager.LIZ("ab_test_local_allocate", false)) {
                C36089EEj c36089EEj = new C36089EEj(false, false);
                c36089EEj.LIZIZ(new RunnableIdleTask(new ARunnableS13S0000000_6(2), "LocalExperimentTest", 1000L, EE4.CPU), true);
                c36089EEj.LIZJ();
            }
        } catch (Throwable unused) {
        }
    }
}
