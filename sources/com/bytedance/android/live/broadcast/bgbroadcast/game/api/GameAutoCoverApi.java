package com.bytedance.android.live.broadcast.bgbroadcast.game.api;

import X.AbstractC73672Svk;
import X.C28467BFf;
import X.E8M;
import X.InterfaceC195757mF;
import X.InterfaceC64985Pev;

/* loaded from: classes.dex */
public interface GameAutoCoverApi {
    @E8M("/webcast/room/screenshot_cover/update/")
    @InterfaceC195757mF
    AbstractC73672Svk<C28467BFf<Void>> updateScreenShotStatus(@InterfaceC64985Pev("status") int i);
}
