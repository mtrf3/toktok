package X;

import Y.ARunnableS15S0101000_11;
import com.ss.android.ugc.aweme.profile.edit.TwitterPresenter;
import com.ss.android.ugc.aweme.profile.edit.api.TwitterApi;

/* loaded from: classes12.dex */
public final class QBN implements QBQ {
    public final /* synthetic */ TwitterPresenter LIZ;

    @Override // X.QBQ
    public final void onFailed() {
        TwitterPresenter twitterPresenter = this.LIZ;
        ActivityC45651qj activityC45651qj = twitterPresenter.mActivity;
        if (activityC45651qj != null && twitterPresenter.mTwitterView != null) {
            activityC45651qj.runOnUiThread(new ARunnableS15S0101000_11(5, this, 15));
        }
    }

    @Override // X.QBQ
    public final String execute() {
        return TwitterApi.LIZIZ();
    }

    @Override // X.QBQ
    public final void onSuccess() {
        HG3.LJIILL().queryUser(this.LIZ.mHandler);
    }

    public QBN(TwitterPresenter twitterPresenter) {
        this.LIZ = twitterPresenter;
    }

    public static /* synthetic */ void LIZ(QBN qbn) {
        qbn.LIZ.mTwitterView.Go();
    }
}
