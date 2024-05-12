package com.bytedance.android.livesdk.chatroom.api;

import X.AbstractC73672Svk;
import X.C28467BFf;
import X.E8M;
import X.InterfaceC195757mF;
import X.InterfaceC36229EJt;
import X.InterfaceC64985Pev;
import com.bytedance.android.livesdk.chatroom.model.ShareReportResult;
import java.util.HashMap;

/* loaded from: classes6.dex */
public interface RetrofitApi {
    @E8M("/webcast/room/share/")
    @InterfaceC195757mF
    AbstractC73672Svk<C28467BFf<ShareReportResult>> sendShare(@InterfaceC64985Pev("room_id") long j, @InterfaceC36229EJt HashMap<String, String> hashMap);
}
