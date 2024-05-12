package X;

import android.os.Bundle;
import com.ss.android.ugc.aweme.account.login.twostep.TwoStepVerificationManageActivity;
import com.ss.android.ugc.aweme.services.PasswordService;
import java.util.List;

/* renamed from: X.XbB, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C85137XbB implements C2YO {
    public final /* synthetic */ TwoStepVerificationManageActivity LIZ;
    public final /* synthetic */ boolean LIZIZ;
    public final /* synthetic */ String LIZJ = "trusted_environment";
    public final /* synthetic */ String LIZLLL;
    public final /* synthetic */ List<String> LJ;
    public final /* synthetic */ int LJFF;

    @Override // X.C2YO
    public final void onUpdateFailed(String str) {
        this.LIZ.LLIIJI(null, str);
    }

    @Override // X.C2YO
    public final void onUpdateSuccess(boolean z) {
        if (z) {
            C85115Xap.LIZ = true;
            TwoStepVerificationManageActivity twoStepVerificationManageActivity = this.LIZ;
            boolean z2 = this.LIZIZ;
            twoStepVerificationManageActivity.LLFZ(this.LJ, this.LIZJ, this.LIZLLL, this.LJFF, z2);
            return;
        }
        PasswordService LJFF = R41.LJFF();
        TwoStepVerificationManageActivity twoStepVerificationManageActivity2 = this.LIZ;
        Bundle LLII = twoStepVerificationManageActivity2.LLII();
        TwoStepVerificationManageActivity twoStepVerificationManageActivity3 = this.LIZ;
        boolean z3 = this.LIZIZ;
        LJFF.setPassword(twoStepVerificationManageActivity2, LLII, new C85157XbV(this.LJFF, twoStepVerificationManageActivity3, this.LIZJ, this.LIZLLL, this.LJ, z3));
    }

    public C85137XbB(int i, TwoStepVerificationManageActivity twoStepVerificationManageActivity, String str, List list, boolean z) {
        this.LIZ = twoStepVerificationManageActivity;
        this.LIZIZ = z;
        this.LIZLLL = str;
        this.LJ = list;
        this.LJFF = i;
    }
}
