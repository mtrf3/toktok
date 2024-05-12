package X;

import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.ss.android.ugc.aweme.topic.trendingtopic.api.VideoTrendingTopicApi;

/* renamed from: X.9Sz, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C237299Sz {
    public static final /* synthetic */ C237299Sz LIZ = new C237299Sz();

    public static VideoTrendingTopicApi LIZ() {
        IRetrofitFactory LIZLLL = RetrofitFactory.LIZLLL();
        String str = EFJ.LIZJ;
        return (VideoTrendingTopicApi) C770830u.LIZJ(str, "API_URL_PREFIX_SI", LIZLLL, str).LIZ.LIZ(VideoTrendingTopicApi.class);
    }
}
