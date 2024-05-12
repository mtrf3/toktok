package com.ss.android.ugc.aweme.feed.interest;

import X.AbstractC73672Svk;
import X.E8L;
import X.LAQ;
import com.ss.android.ugc.aweme.feed.interest.model.InterestListResponse;

/* loaded from: classes10.dex */
public interface InterestApi {
    public static final LAQ LIZ = LAQ.LIZ;

    @E8L("/aweme/v1/user/interest/list/")
    AbstractC73672Svk<InterestListResponse> getInterestList();
}
