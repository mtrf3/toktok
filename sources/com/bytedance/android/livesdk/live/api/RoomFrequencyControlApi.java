package com.bytedance.android.livesdk.live.api;

import X.AbstractC73672Svk;
import X.E8L;
import X.InterfaceC64986Pew;
import webcast.api.room.FrequencyControlResponse;
import webcast.api.room.UpdateFrequencyControlResponse;

/* loaded from: classes6.dex */
public interface RoomFrequencyControlApi {
    @E8L("/webcast/room/frequency_control/")
    AbstractC73672Svk<FrequencyControlResponse> frequencyControl(@InterfaceC64986Pew("fc_type") long j, @InterfaceC64986Pew("room_id") long j2);

    @E8L("/webcast/room/update_frequency_control/")
    AbstractC73672Svk<UpdateFrequencyControlResponse> updateFrequencyControl(@InterfaceC64986Pew("fc_type") long j, @InterfaceC64986Pew("room_id") long j2);
}
