package com.bytedance.android.live.share;

import X.AbstractC73672Svk;
import X.C28467BFf;
import X.E8L;
import X.E8M;
import X.InterfaceC195757mF;
import X.InterfaceC36229EJt;
import X.InterfaceC64985Pev;
import X.InterfaceC64986Pew;
import com.bytedance.android.live.share.response.BatchShareUsersResult;
import com.bytedance.android.livesdk.chatroom.model.ShareReportResult;
import java.util.HashMap;

/* loaded from: classes6.dex */
public interface ShareApi {
    @E8L("/webcast/interaction/share/list/")
    AbstractC73672Svk<C28467BFf<BatchShareUsersResult>> getBatchShareUsers(@InterfaceC64986Pew("room_id") long j);

    @E8M("/webcast/room/share/")
    @InterfaceC195757mF
    AbstractC73672Svk<C28467BFf<ShareReportResult>> sendShare(@InterfaceC64985Pev("room_id") long j, @InterfaceC36229EJt HashMap<String, String> hashMap);

    @E8M("/webcast/interaction/share/submit/")
    @InterfaceC195757mF
    AbstractC73672Svk<C28467BFf<Void>> submitShare(@InterfaceC64985Pev("room_id") long j, @InterfaceC64985Pev("to_user_ids") String str);
}
