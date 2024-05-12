package com.ss.android.ugc.aweme.toptab.repo;

import X.C76L;
import X.E6L;
import X.E8L;
import X.InterfaceC64986Pew;
import com.ss.android.ugc.aweme.toptab.data.LiveAwemeData;

/* loaded from: classes10.dex */
public interface ILiveFeedApi {
    @E6L(2)
    @E8L("/webcast/feed/v2/")
    C76L<LiveAwemeData> fetchLiveFeedList(@InterfaceC64986Pew("req_from") String str);
}
