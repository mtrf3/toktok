package X;

import com.ss.android.ugc.aweme.account.login.twostep.TwoStepVerificationManageActivity;
import java.util.List;

/* renamed from: X.XbV, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C85157XbV implements R47 {
    public final /* synthetic */ TwoStepVerificationManageActivity LIZ;
    public final /* synthetic */ boolean LIZIZ;
    public final /* synthetic */ String LIZJ;
    public final /* synthetic */ String LIZLLL;
    public final /* synthetic */ List<String> LJ;
    public final /* synthetic */ int LJFF;

    public C85157XbV(int i, TwoStepVerificationManageActivity twoStepVerificationManageActivity, String str, String str2, List list, boolean z) {
        this.LIZ = twoStepVerificationManageActivity;
        this.LIZIZ = z;
        this.LIZJ = str;
        this.LIZLLL = str2;
        this.LJ = list;
        this.LJFF = i;
    }

    @Override // X.R47
    public final void onResult(int i, int i2, Object obj) {
        if (i2 == 1) {
            C85115Xap.LIZ = true;
            TwoStepVerificationManageActivity twoStepVerificationManageActivity = this.LIZ;
            boolean z = this.LIZIZ;
            twoStepVerificationManageActivity.LLFZ(this.LJ, this.LIZJ, this.LIZLLL, this.LJFF, z);
        }
        this.LIZ.LLIIJLIL();
    }
}
