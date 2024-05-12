package X;

import android.app.Activity;
import android.text.TextUtils;
import com.ss.android.ugc.aweme.awemeservice.AwemeService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.PrivateUrlModel;

/* renamed from: X.7Wh, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C187197Wh extends AbstractC187217Wj {
    public Aweme LJLJJI;
    public int LJLJJL;
    public final Activity LJLJJLL;

    @Override // X.C8BR, X.C8BT
    public final void onSuccess() {
        Aweme aweme = this.LJLJJI;
        if (aweme != null) {
            aweme.getStatus().setPrivateStatus(this.LJLJJL);
            if (this.LJLJJL != 0) {
            }
            AwemeService.LIZ().R1(this.LJLJJI);
            C2U8.LIZ(new C187227Wk(this.LJLJJI, (PrivateUrlModel) this.LJLIL.getData()));
        }
    }

    public C187197Wh(Activity activity) {
        this.LJLJJLL = activity;
    }

    public final void LJJIII(Aweme aweme) {
        this.LJLJJI = aweme;
        if (aweme.getStatus() == null) {
            return;
        }
        this.LJLJJI.getStatus().getPrivateStatus();
        this.LJLJJL = 0;
    }

    @Override // X.C8BR, X.C8BT
    public final void onFailed(Exception exc) {
        Throwable LJ = C1A7.LJ(exc);
        if (LJ instanceof C38333F2r) {
            C38333F2r c38333F2r = (C38333F2r) LJ;
            if (!TextUtils.isEmpty(c38333F2r.getErrorMsg())) {
                C1FJ.LJI(c38333F2r, new C26045AKb(this.LJLJJLL));
            }
        }
    }
}
