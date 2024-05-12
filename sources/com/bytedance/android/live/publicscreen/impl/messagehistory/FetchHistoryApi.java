package com.bytedance.android.live.publicscreen.impl.messagehistory;

import X.E8M;
import X.InterfaceC195757mF;
import X.InterfaceC36229EJt;
import X.InterfaceC37276Ek4;
import X.InterfaceC64985Pev;
import X.Q9I;
import java.util.Map;

/* loaded from: classes6.dex */
public interface FetchHistoryApi {
    @E8M("/webcast/im/fetch/history/")
    @InterfaceC195757mF
    InterfaceC37276Ek4<Q9I> fetchCommentHistory(@InterfaceC64985Pev("room_id") long j, @InterfaceC64985Pev("account_type") int i, @InterfaceC64985Pev("history_comment_cursor") String str, @InterfaceC36229EJt Map<String, String> map);
}
