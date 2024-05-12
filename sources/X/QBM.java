package X;

import Y.ARunnableS11S0101000_7;
import com.ss.android.ugc.aweme.profile.edit.TwitterPresenter;
import com.ss.android.ugc.aweme.profile.edit.api.TwitterApi;

/* loaded from: classes12.dex */
public final class QBM implements QBQ {
    public final /* synthetic */ String LIZ;
    public final /* synthetic */ String LIZIZ;
    public final /* synthetic */ String LIZJ;
    public final /* synthetic */ String LIZLLL;
    public final /* synthetic */ TwitterPresenter LJ;

    @Override // X.QBQ
    public final String execute() {
        return TwitterApi.LIZ(this.LIZ, this.LIZIZ, this.LIZJ, this.LIZLLL);
    }

    @Override // X.QBQ
    public final void onFailed() {
        this.LJ.logFailure("Failed to store data to TikTok server", "send_token_to_sever");
        TwitterPresenter twitterPresenter = this.LJ;
        ActivityC45651qj activityC45651qj = twitterPresenter.mActivity;
        if (activityC45651qj != null && twitterPresenter.mTwitterView != null) {
            activityC45651qj.runOnUiThread(new ARunnableS11S0101000_7(3, this, 15));
        }
    }

    @Override // X.QBQ
    public final void onSuccess() {
        HG3.LJIILL().queryUser(this.LJ.mHandler);
    }

    public static /* synthetic */ void LIZ(QBM qbm) {
        qbm.LJ.mTwitterView.or(null);
    }

    public QBM(TwitterPresenter twitterPresenter, String str, String str2, String str3, String str4) {
        this.LJ = twitterPresenter;
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = str3;
        this.LIZLLL = str4;
    }
}
