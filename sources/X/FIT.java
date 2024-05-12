package X;

import com.bytedance.ies.abmock.ClientExpManager;

/* loaded from: classes7.dex */
public final class FIT extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final FIT LJLIL = new FIT();

    public FIT() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean fix_active_user_experiment;
        if (!C38686FGg.LJ) {
            fix_active_user_experiment = false;
        } else {
            FFL LJIIIZ = FFL.LJIIIZ();
            fix_active_user_experiment = ClientExpManager.fix_active_user_experiment();
            LJIIIZ.getClass();
            try {
                fix_active_user_experiment = ((Boolean) LJIIIZ.LJI("fix_active_user_experiment", Boolean.valueOf(fix_active_user_experiment))).booleanValue();
            } catch (Throwable unused) {
            }
        }
        return Boolean.valueOf(fix_active_user_experiment);
    }
}
