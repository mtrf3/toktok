package X;

import com.ss.android.ugc.aweme.feed.consumption.impl.RecommendConsumeServiceImpl;
import com.ss.android.ugc.aweme.utils.IFeedRecommendConsumeService;
import com.ss.android.ugc.aweme.utils.RecommendConsumeParams;

/* loaded from: classes9.dex */
public final class JCL implements IFeedRecommendConsumeService {
    public static final JCL LIZIZ = new JCL();
    public final /* synthetic */ IFeedRecommendConsumeService LIZ;

    @Override // com.ss.android.ugc.aweme.utils.IFeedRecommendConsumeService
    public final RecommendConsumeParams LIZ() {
        return this.LIZ.LIZ();
    }

    public JCL() {
        IFeedRecommendConsumeService iFeedRecommendConsumeService;
        Object LIZ = C58096Mr6.LIZ(IFeedRecommendConsumeService.class, false);
        if (LIZ != null) {
            iFeedRecommendConsumeService = (IFeedRecommendConsumeService) LIZ;
        } else {
            if (C58096Mr6.D0 == null) {
                synchronized (IFeedRecommendConsumeService.class) {
                    if (C58096Mr6.D0 == null) {
                        C58096Mr6.D0 = new RecommendConsumeServiceImpl();
                    }
                }
            }
            iFeedRecommendConsumeService = C58096Mr6.D0;
        }
        this.LIZ = iFeedRecommendConsumeService;
    }
}
