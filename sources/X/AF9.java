package X;

import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.experiment.FollowFeedViewStubExperiment;
import com.ss.android.ugc.aweme.feed.api.FeedStatsApi;
import com.ss.android.ugc.aweme.feed.model.PrivateUrlModel;
import com.ss.android.ugc.aweme.services.RetrofitService;

/* loaded from: classes5.dex */
public final class AF9 extends C8BS<PrivateUrlModel> {
    public static FeedStatsApi LJLIL;

    public AF9() {
        if ((Keva.getRepo(FollowFeedViewStubExperiment.REPO_NAME).getInt("cold_boot_mainAct_degradation", 0) & 32) != 0) {
            return;
        }
        LJLIL = (FeedStatsApi) RetrofitService.createIRetrofitServicebyMonsterPlugin(false).createNewRetrofit(com.ss.android.ugc.aweme.app.api.Api.LIZ).create(FeedStatsApi.class);
    }

    @Override // X.C8BS
    public final boolean checkParams(Object... objArr) {
        if (objArr != null && objArr.length == 2) {
            return true;
        }
        return false;
    }

    @Override // X.C8BS
    public final boolean sendRequest(Object... objArr) {
        if (!super.sendRequest(objArr)) {
            return false;
        }
        FGR.LIZIZ().LIZ(this.mHandler, new CallableC67193QYr(1, objArr), 0);
        return true;
    }
}
