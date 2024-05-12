package X;

import com.ss.android.ugc.aweme.account.login.twostep.TwoStepVerificationManageActivity;
import com.ss.android.ugc.aweme.account.login.twostep.TwoSvUserData;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.XbE, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C85140XbE implements R47 {
    public final /* synthetic */ TwoStepVerificationManageActivity LIZ;
    public final /* synthetic */ boolean LIZIZ;
    public final /* synthetic */ String LIZJ;
    public final /* synthetic */ String LIZLLL;
    public final /* synthetic */ List<String> LJ;
    public final /* synthetic */ int LJFF;

    public C85140XbE(int i, TwoStepVerificationManageActivity twoStepVerificationManageActivity, String str, String str2, List list, boolean z) {
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
            C85115Xap.LIZJ = true;
            TwoSvUserData twoSvUserData = this.LIZ.LJLL;
            o.LJI(twoSvUserData);
            twoSvUserData.setHas_email(Boolean.TRUE);
            TwoStepVerificationManageActivity twoStepVerificationManageActivity = this.LIZ;
            boolean z = this.LIZIZ;
            twoStepVerificationManageActivity.LLFZ(this.LJ, this.LIZJ, this.LIZLLL, this.LJFF, z);
        }
    }
}
