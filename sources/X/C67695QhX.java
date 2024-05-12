package X;

import android.os.Bundle;
import com.google.android.gms.auth.api.signin.internal.SignInHubActivity;

/* renamed from: X.QhX, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C67695QhX implements C09M {
    public final /* synthetic */ SignInHubActivity LIZ;

    public /* synthetic */ C67695QhX(SignInHubActivity signInHubActivity) {
        this.LIZ = signInHubActivity;
    }

    @Override // X.C09M
    public final void LIZIZ() {
    }

    @Override // X.C09M
    public final C0ZP LIZ(Bundle bundle) {
        SignInHubActivity signInHubActivity = this.LIZ;
        java.util.Set<AbstractC67709Qhl> set = AbstractC67709Qhl.LJLIL;
        synchronized (set) {
        }
        return new C67286Qaw(signInHubActivity, set);
    }

    @Override // X.C09M
    public final /* bridge */ /* synthetic */ void LIZJ(Object obj) {
        SignInHubActivity signInHubActivity = this.LIZ;
        signInHubActivity.setResult(signInHubActivity.LJLJJI, signInHubActivity.LJLJJL);
        this.LIZ.finish();
    }
}
