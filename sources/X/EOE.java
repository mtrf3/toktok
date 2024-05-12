package X;

import com.ss.android.ugc.aweme.opt.BackendApiCallerOptService;
import com.ss.android.ugc.aweme.profile.model.User;

/* loaded from: classes7.dex */
public final class EOE implements LEA {
    public final /* synthetic */ BackendApiCallerOptService LJLIL;

    public EOE(BackendApiCallerOptService backendApiCallerOptService) {
        this.LJLIL = backendApiCallerOptService;
    }

    @Override // X.LEA
    public final void onAccountResult(int i, boolean z, int i2, User user) {
        if (i != 1 && i != 2 && i != 3) {
            return;
        }
        this.LJLIL.LJ(true);
        this.LJLIL.LIZ.set(false);
        EOJ.LIZ().erase("key_last_store_ts");
        EOJ.LIZ().erase("key_backend_params_data");
        this.LJLIL.LIZJ();
    }
}
