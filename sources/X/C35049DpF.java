package X;

import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.experiment.FollowFeedViewStubExperiment;
import defpackage.e1;

/* renamed from: X.DpF, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C35049DpF extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C35049DpF LJLIL = new C35049DpF();

    public C35049DpF() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean LIZ;
        if (C35820E4a.LIZIZ(FKM.LIZ(), "optimize_kevasp", false)) {
            LIZ = Keva.getRepo(FollowFeedViewStubExperiment.REPO_NAME).getBoolean("ttk_a11y_system_setting_track_enabled", false);
        } else {
            LIZ = e1.LIZ(31744, "ttk_a11y_system_setting_track_enabled", true, false);
        }
        return Boolean.valueOf(LIZ);
    }
}
