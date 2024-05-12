package com.ss.android.ugc.aweme.feed.api;

import X.C46104I7o;
import X.C76L;
import X.E8L;
import X.EFJ;
import X.InterfaceC64986Pew;
import com.ss.android.ugc.aweme.feed.model.AwemeStatisticsResponse;

/* loaded from: classes4.dex */
public final class BackUpApi {
    public static final IBackUpApi LIZ = (IBackUpApi) C46104I7o.LJIIZILJ(EFJ.LIZJ, IBackUpApi.class);

    /* loaded from: classes4.dex */
    public interface IBackUpApi {
        @E8L("aweme/v1/aweme/statistics/")
        C76L<AwemeStatisticsResponse> queryAwemeStatistics(@InterfaceC64986Pew("aweme_ids") String str, @InterfaceC64986Pew("type") int i);
    }
}
