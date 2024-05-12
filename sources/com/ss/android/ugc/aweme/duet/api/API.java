package com.ss.android.ugc.aweme.duet.api;

import X.C76L;
import X.E4Q;
import X.InterfaceC64989Pez;
import com.ss.android.ugc.aweme.duet.model.DuetAwemeList;
import com.ss.android.ugc.aweme.duet.model.DuetDetailModel;

/* loaded from: classes2.dex */
public interface API {
    @E4Q("/aweme/v1/anchor/aweme/")
    C76L<DuetAwemeList> getDuetDetailList(@InterfaceC64989Pez("anchor_id") String str, @InterfaceC64989Pez("cursor") long j, @InterfaceC64989Pez("count") long j2, @InterfaceC64989Pez("top_item_ids") String str2, @InterfaceC64989Pez("anchor_type") int i);

    @E4Q("/tiktok/v1/duet/detail/")
    C76L<DuetDetailModel> getDuetDetailModel(@InterfaceC64989Pez("origin_item_id") String str);
}
