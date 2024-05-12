package X;

import com.ss.android.ugc.aweme.account.login.twostep.TwoStepVerificationManageActivity;
import kotlin.jvm.internal.AqS181S0100000_15;
import kotlin.jvm.internal.o;

/* renamed from: X.Xaq, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C85116Xaq extends AbstractC67056QTk {
    public final /* synthetic */ TwoStepVerificationManageActivity LIZ;

    public C85116Xaq(TwoStepVerificationManageActivity twoStepVerificationManageActivity) {
        this.LIZ = twoStepVerificationManageActivity;
    }

    @Override // X.AbstractC67055QTj
    public final void onSuccess(QQI qqi) {
        C69076R9c response = (C69076R9c) qqi;
        o.LJIIIZ(response, "response");
        if (response.LJIIJ) {
            TwoStepVerificationManageActivity twoStepVerificationManageActivity = this.LIZ;
            String str = response.LJIIIZ;
            o.LJIIIIZZ(str, "response.ticket");
            TwoStepVerificationManageActivity.LLJILJILJ(twoStepVerificationManageActivity, str, true, "update", null, 8);
            return;
        }
        AqS181S0100000_15 aqS181S0100000_15 = new AqS181S0100000_15(this.LIZ, 276);
        if (this.LIZ.LLIL()) {
            TwoStepVerificationManageActivity twoStepVerificationManageActivity2 = this.LIZ;
            String str2 = response.LJIIIZ;
            o.LJIIIIZZ(str2, "response.ticket");
            twoStepVerificationManageActivity2.LLJJJJJIL(str2, aqS181S0100000_15);
            return;
        }
        TwoStepVerificationManageActivity twoStepVerificationManageActivity3 = this.LIZ;
        String str3 = response.LJIIIZ;
        o.LJIIIIZZ(str3, "response.ticket");
        twoStepVerificationManageActivity3.LLJJJJ(str3, aqS181S0100000_15);
    }

    @Override // X.AbstractC67055QTj
    public final void onError(QQI qqi, int i) {
        String str;
        TwoStepVerificationManageActivity twoStepVerificationManageActivity = this.LIZ;
        Integer valueOf = Integer.valueOf(i);
        if (qqi == null || (str = qqi.LJFF) == null) {
            str = "";
        }
        twoStepVerificationManageActivity.LLIIJI(valueOf, str);
    }
}
