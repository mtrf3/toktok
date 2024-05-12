package com.ss.android.ugc.aweme.toptab.repo;

import X.C76L;
import X.C85990Xow;
import X.E6L;
import X.E8L;
import X.InterfaceC64986Pew;
import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.ss.android.ugc.aweme.toptab.data.LiveAwemeData;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class LiveFeedApi implements ILiveFeedApi {
    public static final LiveFeedApi LIZIZ = new LiveFeedApi();
    public final /* synthetic */ ILiveFeedApi LIZ;

    @Override // com.ss.android.ugc.aweme.toptab.repo.ILiveFeedApi
    @E6L(2)
    @E8L("/webcast/feed/v2/")
    public C76L<LiveAwemeData> fetchLiveFeedList(@InterfaceC64986Pew("req_from") String reqFrom) {
        o.LJIIIZ(reqFrom, "reqFrom");
        return this.LIZ.fetchLiveFeedList(reqFrom);
    }

    public LiveFeedApi() {
        String str;
        IRetrofitFactory LIZLLL = RetrofitFactory.LIZLLL();
        if (C85990Xow.LJIIIZ()) {
            str = "https://webcast.tiktokv.com";
        } else {
            str = "https://webcast-va.tiktokv.com";
        }
        this.LIZ = (ILiveFeedApi) LIZLLL.create(str).create(ILiveFeedApi.class);
    }
}
