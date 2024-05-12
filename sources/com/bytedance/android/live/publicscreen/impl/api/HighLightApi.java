package com.bytedance.android.live.publicscreen.impl.api;

import X.AbstractC73672Svk;
import X.C28467BFf;
import X.E8M;
import X.InterfaceC195757mF;
import X.InterfaceC64985Pev;
import com.bytedance.android.livesdk.game.model.CreateHighLightResult;

/* loaded from: classes6.dex */
public interface HighLightApi {
    @E8M("/webcast/game/live_fragment/cut/")
    @InterfaceC195757mF
    AbstractC73672Svk<C28467BFf<CreateHighLightResult>> createHighLightVideo(@InterfaceC64985Pev("fragment_id") Long l, @InterfaceC64985Pev("room_id") long j, @InterfaceC64985Pev("start_time") long j2, @InterfaceC64985Pev("end_time") long j3, @InterfaceC64985Pev("title") String str, @InterfaceC64985Pev("cut_case") int i);
}
