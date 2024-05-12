package X;

import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.feed.ui.FeedRecommendFragmentProvider;
import com.ss.android.ugc.aweme.feed.ui.IFeedRecommendFragmentProvider;

/* renamed from: X.LKh, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C54079LKh implements IFeedRecommendFragmentProvider {
    public static final C54079LKh LIZIZ = new C54079LKh();
    public final /* synthetic */ IFeedRecommendFragmentProvider LIZ;

    @Override // com.ss.android.ugc.aweme.feed.ui.IFeedRecommendFragmentProvider
    public final Fragment LIZ() {
        return this.LIZ.LIZ();
    }

    public C54079LKh() {
        IFeedRecommendFragmentProvider iFeedRecommendFragmentProvider;
        Object LIZ = C58096Mr6.LIZ(IFeedRecommendFragmentProvider.class, false);
        if (LIZ != null) {
            iFeedRecommendFragmentProvider = (IFeedRecommendFragmentProvider) LIZ;
        } else {
            if (C58096Mr6.N0 == null) {
                synchronized (IFeedRecommendFragmentProvider.class) {
                    if (C58096Mr6.N0 == null) {
                        C58096Mr6.N0 = new FeedRecommendFragmentProvider();
                    }
                }
            }
            iFeedRecommendFragmentProvider = C58096Mr6.N0;
        }
        this.LIZ = iFeedRecommendFragmentProvider;
    }
}
