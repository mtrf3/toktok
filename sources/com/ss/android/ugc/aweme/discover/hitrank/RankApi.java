package com.ss.android.ugc.aweme.discover.hitrank;

import X.C76L;
import X.E4Q;
import X.InterfaceC64989Pez;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import java.util.List;

/* loaded from: classes2.dex */
public interface RankApi {
    @E4Q("aweme/v1/spotpoint/set/hitrank/")
    C76L<BaseResponse> finishHitRankTask(@InterfaceC64989Pez("to_userid") String str, @InterfaceC64989Pez("rank_type") int i, @InterfaceC64989Pez("action_type") int i2, @InterfaceC64989Pez("hashtag_names") List<String> list, @InterfaceC64989Pez("sec_to_userid") String str2);

    @E4Q("aweme/v1/spotpoint/hit/notice/star/list/")
    C76L<HitNotice> getActivityInfo(@InterfaceC64989Pez("user_id") String str, @InterfaceC64989Pez("sec_user_id") String str2);
}
