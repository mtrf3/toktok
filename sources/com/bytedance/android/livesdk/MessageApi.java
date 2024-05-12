package com.bytedance.android.livesdk;

import X.E8M;
import X.InterfaceC195737mD;
import X.InterfaceC195757mF;
import X.InterfaceC36229EJt;
import X.InterfaceC36332ENs;
import X.InterfaceC37276Ek4;
import X.InterfaceC64985Pev;
import X.Q9I;
import java.util.Map;

/* loaded from: classes12.dex */
public interface MessageApi {
    @E8M("/webcast/im/fetch/")
    @InterfaceC195757mF
    InterfaceC37276Ek4<Q9I> fetchMessagePbByteArraySource(@InterfaceC64985Pev("room_id") long j, @InterfaceC36229EJt Map<String, String> map, @InterfaceC64985Pev("fetch_rule") int i, @InterfaceC64985Pev("account_type") int i2, @InterfaceC195737mD Object obj);

    @E8M("/webcast/im/fetch/")
    @InterfaceC195757mF
    InterfaceC37276Ek4<Q9I> fetchMessagePbByteArraySource(@InterfaceC64985Pev("room_id") long j, @InterfaceC36229EJt Map<String, String> map, @InterfaceC64985Pev("fetch_rule") int i, @InterfaceC64985Pev("account_type") int i2, @InterfaceC195737mD Object obj, @InterfaceC64985Pev("filter_welcome_msg") String str);

    @E8M("/webcast/room/{room_id}/_fetch_message_polling/")
    @InterfaceC195757mF
    InterfaceC37276Ek4<Q9I> fetchMessagePbByteArraySource(@InterfaceC36332ENs("room_id") long j, @InterfaceC36229EJt Map<String, String> map, @InterfaceC195737mD Object obj);

    @E8M("/webcast/im/fetch/preview/")
    @InterfaceC195757mF
    InterfaceC37276Ek4<Q9I> fetchPreviewMessagePbByteArraySource(@InterfaceC64985Pev("room_id") long j, @InterfaceC36229EJt Map<String, String> map, @InterfaceC64985Pev("fetch_rule") int i, @InterfaceC64985Pev("account_type") int i2, @InterfaceC195737mD Object obj, @InterfaceC64985Pev("filter_welcome_msg") String str);

    @E8M("/webcast/im/pre_fetch/")
    @InterfaceC195757mF
    InterfaceC37276Ek4<Q9I> prefetchMessagePbByteArraySource(@InterfaceC64985Pev("room_id") long j, @InterfaceC36229EJt Map<String, String> map, @InterfaceC64985Pev("fetch_rule") int i, @InterfaceC195737mD Object obj);
}
