package com.ss.android.ugc.aweme.feedback.reply;

import X.C770830u;
import X.E4Q;
import X.InterfaceC37276Ek4;
import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;

/* loaded from: classes7.dex */
public final class FeedbackNewestReplyApi {
    public static final Api LIZ;

    /* loaded from: classes7.dex */
    public interface Api {
        @E4Q("/api/feedback/v1/newest_reply/")
        InterfaceC37276Ek4<NewestReply> getNewestReply();
    }

    static {
        IRetrofitFactory LIZLLL = RetrofitFactory.LIZLLL();
        String str = com.ss.android.ugc.aweme.app.api.Api.LIZ;
        LIZ = (Api) C770830u.LIZJ(str, "API_URL_PREFIX_SI", LIZLLL, str).LIZ.LIZ(Api.class);
    }
}
