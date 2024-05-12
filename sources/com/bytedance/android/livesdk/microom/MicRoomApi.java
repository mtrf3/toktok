package com.bytedance.android.livesdk.microom;

import X.AbstractC73672Svk;
import X.C28467BFf;
import X.E8L;
import X.InterfaceC64986Pew;
import com.bytedance.android.livesdk.microom.model.MicRoomDialogOfficialInfo;
import com.bytedance.android.livesdk.microom.model.NextRoomData;

/* loaded from: classes6.dex */
public interface MicRoomApi {
    @E8L("/webcast/room/official/info")
    AbstractC73672Svk<C28467BFf<MicRoomDialogOfficialInfo>> getMicOfficeInfo(@InterfaceC64986Pew("channel_uid") long j, @InterfaceC64986Pew("anchor_id") long j2);

    @E8L("/webcast/room/next_event_show/")
    AbstractC73672Svk<C28467BFf<NextRoomData>> getNextRoomData(@InterfaceC64986Pew("channel_uid") long j, @InterfaceC64986Pew("now_anchor_id") long j2);
}
