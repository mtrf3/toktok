package com.ss.android.ugc.aweme.im.sdk.chat.feature.suggestedreply.data;

import X.E8L;
import X.InterfaceC64986Pew;
import X.InterfaceC67352kd;

/* loaded from: classes2.dex */
public interface ISuggestedReplyApi {
    @E8L("/tiktok/v1/im/chat/msg/suggested_reply")
    Object fetchSuggestedReplies(@InterfaceC64986Pew("conversation_id") String str, @InterfaceC64986Pew("message_id") long j, @InterfaceC64986Pew("message_type") int i, @InterfaceC64986Pew("video_id") long j2, InterfaceC67352kd<? super SuggestedReplyResponse> interfaceC67352kd);
}
