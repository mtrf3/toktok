package X;

import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.experiment.FollowFeedViewStubExperiment;

/* renamed from: X.4hr, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C116594hr extends AbstractC65781Prl implements InterfaceC65784Pro<Float> {
    public static final C116594hr LJLIL = new C116594hr();

    public C116594hr() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Float invoke() {
        return Float.valueOf(Keva.getRepo(FollowFeedViewStubExperiment.REPO_NAME).getFloat("lowend_device_key", -1.0f));
    }
}
