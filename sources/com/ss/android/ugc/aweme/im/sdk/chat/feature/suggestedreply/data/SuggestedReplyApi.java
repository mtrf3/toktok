package com.ss.android.ugc.aweme.im.sdk.chat.feature.suggestedreply.data;

import X.C77800Ug8;
import X.E8L;
import X.EFJ;
import X.InterfaceC64986Pew;
import X.InterfaceC67352kd;
import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;

/* loaded from: classes2.dex */
public final class SuggestedReplyApi implements ISuggestedReplyApi {
    public static final SuggestedReplyApi LIZIZ = new SuggestedReplyApi();
    public final /* synthetic */ ISuggestedReplyApi LIZ;

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.feature.suggestedreply.data.ISuggestedReplyApi
    @E8L("/tiktok/v1/im/chat/msg/suggested_reply")
    public Object fetchSuggestedReplies(@InterfaceC64986Pew("conversation_id") String str, @InterfaceC64986Pew("message_id") long j, @InterfaceC64986Pew("message_type") int i, @InterfaceC64986Pew("video_id") long j2, InterfaceC67352kd<? super SuggestedReplyResponse> interfaceC67352kd) {
        return this.LIZ.fetchSuggestedReplies(str, j, i, j2, interfaceC67352kd);
    }

    public SuggestedReplyApi() {
        IRetrofitFactory LIZLLL = RetrofitFactory.LIZLLL();
        String str = EFJ.LIZJ;
        this.LIZ = (ISuggestedReplyApi) C77800Ug8.LIZIZ(str, "API_URL_PREFIX_SI", LIZLLL, str, ISuggestedReplyApi.class);
    }
}
