package com.ss.android.ugc.aweme.services.external;

import java.util.List;

/* loaded from: classes8.dex */
public interface IAVDraftFeedbackService {
    String getDBCreationTime();

    String getDBEventAsJSON();

    String getReadableDBPath();

    List<Integer> queryUserDraftCounts(boolean z);

    /* loaded from: classes8.dex */
    public static final class DefaultImpls {
        public static /* synthetic */ List queryUserDraftCounts$default(IAVDraftFeedbackService iAVDraftFeedbackService, boolean z, int i, Object obj) {
            if (obj == null) {
                if ((i & 1) != 0) {
                    z = true;
                }
                return iAVDraftFeedbackService.queryUserDraftCounts(z);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: queryUserDraftCounts");
        }
    }
}
