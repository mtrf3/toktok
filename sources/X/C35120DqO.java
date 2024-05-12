package X;

import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.experiment.FollowFeedViewStubExperiment;
import com.ss.android.ugc.aweme.settings.SparkEcomOptimizeExperiment;

/* renamed from: X.DqO, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C35120DqO extends AbstractC65781Prl implements InterfaceC65784Pro<SparkEcomOptimizeExperiment.EcomOptimizeModel> {
    public static final C35120DqO LJLIL = new C35120DqO();

    public C35120DqO() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, com.ss.android.ugc.aweme.settings.SparkEcomOptimizeExperiment$EcomOptimizeModel] */
    @Override // X.InterfaceC65784Pro
    public final SparkEcomOptimizeExperiment.EcomOptimizeModel invoke() {
        ?? LIZ = C75792yF.LIZ(Keva.getRepo(FollowFeedViewStubExperiment.REPO_NAME).getString("spark_ecom_optimize_experiment", "{}"), SparkEcomOptimizeExperiment.EcomOptimizeModel.class);
        if (LIZ == 0) {
            return SparkEcomOptimizeExperiment.LIZ;
        }
        return LIZ;
    }
}
