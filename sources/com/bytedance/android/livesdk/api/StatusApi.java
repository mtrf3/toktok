package com.bytedance.android.livesdk.api;

import X.AbstractC73672Svk;
import X.C28467BFf;
import X.E8L;
import X.InterfaceC64986Pew;
import com.bytedance.android.livesdk.chatroom.model.UpdateStatusResponse;

/* loaded from: classes6.dex */
public interface StatusApi {
    @E8L("/webcast/room/ping/anchor/")
    AbstractC73672Svk<C28467BFf<UpdateStatusResponse>> sendStatus(@InterfaceC64986Pew("room_id") long j, @InterfaceC64986Pew("status") int i, @InterfaceC64986Pew("stream_id") long j2, @InterfaceC64986Pew("reason_no") int i2, @InterfaceC64986Pew("source") String str, @InterfaceC64986Pew("frame_rate") long j3, @InterfaceC64986Pew("bit_rate") long j4);

    @E8L("/webcast/room/stream_status/")
    AbstractC73672Svk<C28467BFf<Void>> sendStreamStatus(@InterfaceC64986Pew("room_id") long j, @InterfaceC64986Pew("status") int i, @InterfaceC64986Pew("stream_id") long j2, @InterfaceC64986Pew("timestamp") long j3);
}
