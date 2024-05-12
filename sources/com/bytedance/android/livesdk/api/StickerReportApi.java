package com.bytedance.android.livesdk.api;

import X.AbstractC73672Svk;
import X.C28467BFf;
import X.E8M;
import X.InterfaceC195757mF;
import X.InterfaceC64985Pev;

/* loaded from: classes6.dex */
public interface StickerReportApi {
    @E8M("/webcast/room/event_report/")
    @InterfaceC195757mF
    AbstractC73672Svk<C28467BFf<Void>> reportEffectChange(@InterfaceC64985Pev("room_id") long j, @InterfaceC64985Pev("event") int i, @InterfaceC64985Pev("effect_id") String str, @InterfaceC64985Pev("last_effect_id") String str2, @InterfaceC64985Pev("resource_id") String str3, @InterfaceC64985Pev("last_resource_id") String str4, @InterfaceC64985Pev("event_scene") int i2);
}
