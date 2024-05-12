package X;

import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.experiment.FollowFeedViewStubExperiment;

/* renamed from: X.99e, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2321499e extends AbstractC65781Prl implements InterfaceC65784Pro<Long> {
    public static final C2321499e LJLIL = new C2321499e();

    public C2321499e() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Long invoke() {
        return Long.valueOf(Keva.getRepo(FollowFeedViewStubExperiment.REPO_NAME).getLong("optimize_logbootfinishtaskinterval", 10L));
    }
}
