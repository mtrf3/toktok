package X;

import com.ss.android.ugc.aweme.account.login.twostep.TwoStepVerificationManageActivity;
import java.util.List;

/* renamed from: X.XbQ, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C85152XbQ implements R47 {
    public final /* synthetic */ TwoStepVerificationManageActivity LIZ;
    public final /* synthetic */ boolean LIZIZ;
    public final /* synthetic */ String LIZJ = "trusted_environment";
    public final /* synthetic */ String LIZLLL;
    public final /* synthetic */ List<String> LJ;
    public final /* synthetic */ int LJFF;

    public C85152XbQ(int i, TwoStepVerificationManageActivity twoStepVerificationManageActivity, String str, List list, boolean z) {
        this.LIZ = twoStepVerificationManageActivity;
        this.LIZIZ = z;
        this.LIZLLL = str;
        this.LJ = list;
        this.LJFF = i;
    }

    @Override // X.R47
    public final void onResult(int i, int i2, Object obj) {
        if (i2 == 1) {
            C85115Xap.LIZIZ = true;
            TwoStepVerificationManageActivity twoStepVerificationManageActivity = this.LIZ;
            boolean z = this.LIZIZ;
            twoStepVerificationManageActivity.LLFZ(this.LJ, this.LIZJ, this.LIZLLL, this.LJFF, z);
        }
        this.LIZ.LLIIJLIL();
    }
}
