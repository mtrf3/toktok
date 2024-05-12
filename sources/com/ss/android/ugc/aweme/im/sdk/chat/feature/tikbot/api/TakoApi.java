package com.ss.android.ugc.aweme.im.sdk.chat.feature.tikbot.api;

import X.E4Q;
import X.E4T;
import X.InterfaceC64989Pez;
import X.InterfaceC67352kd;

/* loaded from: classes2.dex */
public interface TakoApi {
    @E4Q("im/tikbot/process_info/")
    Object getTakoProcessInfo(@InterfaceC64989Pez("query_server_message_id") String str, InterfaceC67352kd<? super TakoProcessInfoResponse> interfaceC67352kd);

    @E4Q("im/tikbot/sug/")
    Object getTakoSugList(@InterfaceC64989Pez("source") int i, @InterfaceC64989Pez("conv_id") String str, @InterfaceC64989Pez("gid") Long l, @InterfaceC64989Pez("feed_bar") String str2, @InterfaceC64989Pez("entry_time") Long l2, @InterfaceC64989Pez("query_server_message_id") String str3, @InterfaceC64989Pez("chat_sug_key") String str4, @InterfaceC64989Pez("view_duration") Long l3, @InterfaceC64989Pez("viewed_guide_card") Boolean bool, @InterfaceC64989Pez("front_end_state") String str5, InterfaceC67352kd<? super TakoSugResponse> interfaceC67352kd);

    @E4T("im/tikbot/msg_ack/")
    Object sendTakoReceiveMsgAck(@InterfaceC64989Pez("inbox_type") int i, @InterfaceC64989Pez("msg_type") int i2, @InterfaceC64989Pez("server_message_id") String str, @InterfaceC64989Pez("scene") String str2, @InterfaceC64989Pez("is_ws") int i3, InterfaceC67352kd<? super TakoMsgAckResponse> interfaceC67352kd);
}
