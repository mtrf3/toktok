package X;

import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.experiment.FollowFeedViewStubExperiment;
import com.ss.android.ugc.aweme.settings.SparkWebViewOptimizeExperiment;

/* renamed from: X.9ub, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C251899ub extends AbstractC65781Prl implements InterfaceC65784Pro<SparkWebViewOptimizeExperiment.WebViewOptimizeModel> {
    public static final C251899ub LJLIL = new C251899ub();

    public C251899ub() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [com.ss.android.ugc.aweme.settings.SparkWebViewOptimizeExperiment$WebViewOptimizeModel, java.lang.Object] */
    @Override // X.InterfaceC65784Pro
    public final SparkWebViewOptimizeExperiment.WebViewOptimizeModel invoke() {
        ?? LIZ = C75792yF.LIZ(Keva.getRepo(FollowFeedViewStubExperiment.REPO_NAME).getString("spark_webview_optimize_experiment", "{}"), SparkWebViewOptimizeExperiment.WebViewOptimizeModel.class);
        if (LIZ == 0) {
            return SparkWebViewOptimizeExperiment.LIZ;
        }
        return LIZ;
    }
}
