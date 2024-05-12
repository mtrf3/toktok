package com.ss.android.ugc.aweme.duetmode.api;

import X.C76L;
import X.E4Q;
import X.InterfaceC64989Pez;
import com.ss.android.ugc.aweme.duetmode.model.DuetDiscoverAwemeList;

/* loaded from: classes2.dex */
public interface API {
    @E4Q("/tiktok/duet/discover/v1")
    C76L<DuetDiscoverAwemeList> getDuetDiscoverAwemeList(@InterfaceC64989Pez("offset") long j, @InterfaceC64989Pez("count") long j2);
}
