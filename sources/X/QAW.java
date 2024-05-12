package X;

import Y.ARunnableS8S1300000_11;
import com.ss.android.ugc.aweme.profile.edit.YoutubeRefreshTask;

/* loaded from: classes12.dex */
public final class QAW implements QAN {
    public final /* synthetic */ YoutubeRefreshTask LIZ;
    public final /* synthetic */ String LIZIZ;

    public QAW(YoutubeRefreshTask youtubeRefreshTask, String str) {
        this.LIZ = youtubeRefreshTask;
        this.LIZIZ = str;
    }

    @Override // X.QAN
    public final void LIZ(QA1 qa1, C66543Q9r c66543Q9r) {
        C82544WaS.LIZIZ(new ARunnableS8S1300000_11(this.LIZ, this.LIZIZ, qa1, c66543Q9r, 0), "YoutubeRefreshTask");
    }
}
