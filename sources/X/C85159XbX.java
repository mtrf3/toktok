package X;

import com.ss.android.ugc.aweme.account.login.twostep.TwoStepVerificationManageActivity;
import java.util.List;

/* renamed from: X.XbX, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C85159XbX implements R47 {
    public final /* synthetic */ List<String> LIZ;
    public final /* synthetic */ TwoStepVerificationManageActivity LIZIZ;
    public final /* synthetic */ boolean LIZJ;
    public final /* synthetic */ String LIZLLL;
    public final /* synthetic */ String LJ;
    public final /* synthetic */ int LJFF;

    public C85159XbX(int i, TwoStepVerificationManageActivity twoStepVerificationManageActivity, String str, String str2, List list, boolean z) {
        this.LIZ = list;
        this.LIZIZ = twoStepVerificationManageActivity;
        this.LIZJ = z;
        this.LIZLLL = str;
        this.LJ = str2;
        this.LJFF = i;
    }

    @Override // X.R47
    public final void onResult(int i, int i2, Object obj) {
        if (i2 == 1) {
            C85115Xap.LIZIZ = true;
            this.LIZ.add("mobile_sms_verify");
        }
        TwoStepVerificationManageActivity twoStepVerificationManageActivity = this.LIZIZ;
        boolean z = this.LIZJ;
        twoStepVerificationManageActivity.LLFII(this.LIZ, this.LIZLLL, this.LJ, this.LJFF, z);
        this.LIZIZ.LLIIJLIL();
    }
}
