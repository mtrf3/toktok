package com.bytedance.android.live.publicscreen.impl.api;

import X.AbstractC73672Svk;
import X.C28467BFf;
import X.E8M;
import X.InterfaceC195757mF;
import X.InterfaceC64985Pev;

/* loaded from: classes2.dex */
public interface GiftListHistoryApi {
    @E8M("/webcast/gift/history/")
    @InterfaceC195757mF
    AbstractC73672Svk<C28467BFf<Object>> fetchGiftHistory(@InterfaceC64985Pev("room_id") long j, @InterfaceC64985Pev("cursor") String str, @InterfaceC64985Pev("count") Long l);
}
