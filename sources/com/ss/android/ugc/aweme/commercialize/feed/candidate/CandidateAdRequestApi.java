package com.ss.android.ugc.aweme.commercialize.feed.candidate;

import X.AbstractC73672Svk;
import X.C55736Lu8;
import X.E8L;
import X.InterfaceC64986Pew;
import com.ss.android.ugc.aweme.ad.feed.candidate.CandidateResponse;

/* loaded from: classes10.dex */
public interface CandidateAdRequestApi {
    public static final C55736Lu8 LIZ = C55736Lu8.LIZ;

    @E8L("/tiktok/v1/ad/candidate/")
    AbstractC73672Svk<CandidateResponse> request(@InterfaceC64986Pew("cmpl_enc") String str, @InterfaceC64986Pew("ad_user_agent") String str2, @InterfaceC64986Pew("recent_items_from_client") String str3);
}
