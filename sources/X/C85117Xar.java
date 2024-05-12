package X;

import com.ss.android.ugc.aweme.account.login.twostep.TurnOnTwoStepVerificationFragment;
import com.ss.android.ugc.aweme.account.login.twostep.TwoStepVerificationManageActivity;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AqS7S0211000_15;
import kotlin.jvm.internal.o;

/* renamed from: X.Xar, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C85117Xar extends AbstractC67056QTk {
    public final /* synthetic */ TwoStepVerificationManageActivity LIZ;
    public final /* synthetic */ List<String> LIZIZ;
    public final /* synthetic */ boolean LIZJ;
    public final /* synthetic */ int LIZLLL;

    @Override // X.AbstractC67055QTj
    public final void onSuccess(QQI qqi) {
        String str;
        C69076R9c response = (C69076R9c) qqi;
        o.LJIIIZ(response, "response");
        if (!(this.LIZ.getSupportFragmentManager().LJJJI(R.id.dm7) instanceof TurnOnTwoStepVerificationFragment)) {
            str = "on";
        } else {
            str = "off";
        }
        List<String> list = this.LIZIZ;
        boolean LLIILII = this.LIZ.LLIILII();
        String enterFrom = this.LIZ.getEnterFrom();
        o.LJIIIIZZ(enterFrom, "enterFrom");
        C85144XbI.LJIIIIZZ(str, enterFrom, list, LLIILII);
        if (response.LJIIJ) {
            TwoStepVerificationManageActivity twoStepVerificationManageActivity = this.LIZ;
            boolean z = this.LIZJ;
            String str2 = response.LJIIIZ;
            o.LJIIIIZZ(str2, "response.ticket");
            twoStepVerificationManageActivity.LLFZ(this.LIZIZ, "trust_environment", str2, this.LIZLLL, z);
            return;
        }
        TwoStepVerificationManageActivity twoStepVerificationManageActivity2 = this.LIZ;
        boolean z2 = this.LIZJ;
        AqS7S0211000_15 aqS7S0211000_15 = new AqS7S0211000_15(this.LIZLLL, twoStepVerificationManageActivity2, this.LIZIZ, z2, 0);
        if (this.LIZ.LLIL()) {
            TwoStepVerificationManageActivity twoStepVerificationManageActivity3 = this.LIZ;
            String str3 = response.LJIIIZ;
            o.LJIIIIZZ(str3, "response.ticket");
            twoStepVerificationManageActivity3.LLJJJJJIL(str3, aqS7S0211000_15);
            return;
        }
        TwoStepVerificationManageActivity twoStepVerificationManageActivity4 = this.LIZ;
        String str4 = response.LJIIIZ;
        o.LJIIIIZZ(str4, "response.ticket");
        twoStepVerificationManageActivity4.LLJJJJ(str4, aqS7S0211000_15);
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

    public C85117Xar(int i, TwoStepVerificationManageActivity twoStepVerificationManageActivity, List list, boolean z) {
        this.LIZ = twoStepVerificationManageActivity;
        this.LIZIZ = list;
        this.LIZJ = z;
        this.LIZLLL = i;
    }
}
