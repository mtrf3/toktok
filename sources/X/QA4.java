package X;

import Y.ARunnableS30S0200000_11;
import com.ss.android.ugc.aweme.profile.edit.YoutubePresenter;

/* loaded from: classes12.dex */
public final class QA4 implements QAN {
    public final /* synthetic */ YoutubePresenter LIZ;

    public QA4(YoutubePresenter youtubePresenter) {
        this.LIZ = youtubePresenter;
    }

    @Override // X.QAN
    public final void LIZ(QA1 qa1, C66543Q9r c66543Q9r) {
        if (c66543Q9r != null) {
            YoutubePresenter.onError$default(this.LIZ, c66543Q9r, null, "redirect_and_get_token", null, 10, null);
        } else if (qa1 == null) {
            YoutubePresenter.onError$default(this.LIZ, new Exception("Token exchange completed with null TokenResponse"), null, "redirect_and_get_token", null, 10, null);
        } else {
            C82544WaS.LIZ(new ARunnableS30S0200000_11(qa1, this.LIZ, 18));
        }
    }
}
