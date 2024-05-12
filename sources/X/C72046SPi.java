package X;

import com.ss.android.ugc.aweme.compliance.privacy.sdk.SdkLaunchTask;
import com.ss.android.ugc.aweme.profile.model.User;

/* renamed from: X.SPi, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C72046SPi implements LEA {
    public final /* synthetic */ SdkLaunchTask LJLIL;

    public C72046SPi(SdkLaunchTask sdkLaunchTask) {
        this.LJLIL = sdkLaunchTask;
    }

    @Override // X.LEA
    public final void onAccountResult(int i, boolean z, int i2, User user) {
        if (i != 1 && i != 2) {
            if (i != 3) {
                return;
            }
            this.LJLIL.LJLIL.getClass();
            C72042SPe.LIZJ(null);
            C72042SPe.LIZIZ = null;
            this.LJLIL.LJLIL.getClass();
            C72044SPg.LIZ(null);
            C72044SPg.LIZIZ(null);
            return;
        }
        if (C71945SLl.LJ().LJFF().isChildrenMode()) {
            return;
        }
        this.LJLIL.LJLIL.getClass();
        C72043SPf.LIZ();
        this.LJLIL.LJLIL.getClass();
        C72042SPe.LIZJ(null);
        C72042SPe.LIZIZ = null;
        this.LJLIL.LJLIL.getClass();
        C72045SPh.LIZ(true);
    }
}
