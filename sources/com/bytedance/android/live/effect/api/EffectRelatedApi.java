package com.bytedance.android.live.effect.api;

import X.AbstractC73672Svk;
import X.C28467BFf;
import X.C76800UCe;
import X.E8L;
import X.E8M;
import X.EKC;
import X.InterfaceC195727mC;
import X.InterfaceC195757mF;
import X.InterfaceC64985Pev;
import X.InterfaceC64986Pew;
import com.bytedance.android.live.effect.api.soundeffect.SoundEffectResponse;
import tikcast.api.anchor.PinSoundEffectRequest;

/* loaded from: classes.dex */
public interface EffectRelatedApi {
    @E8L("/webcast/room/sound_effect/")
    AbstractC73672Svk<C28467BFf<SoundEffectResponse>> fetchSoundEffect(@InterfaceC64986Pew("room_id") long j);

    @E8M("/webcast/live_center/task/event_report/")
    @InterfaceC195757mF
    AbstractC73672Svk<C28467BFf<C76800UCe>> finishEffectTask(@InterfaceC64985Pev("event_type") int i);

    @E8M("/webcast/room/internal_ci_info/")
    @InterfaceC195757mF
    AbstractC73672Svk<C28467BFf<Void>> uploadBeautyParams(@InterfaceC64985Pev("room_id") long j, @InterfaceC64985Pev("filter_name") String str, @InterfaceC64985Pev("brightening") int i, @InterfaceC64985Pev("beauty_skin") int i2, @InterfaceC64985Pev("big_eyes") int i3, @InterfaceC64985Pev("face_lift") int i4, @InterfaceC64985Pev("use_filter") boolean z);

    @E8M("/webcast/room/modification/upload/")
    @EKC({"Content-Type: application/json"})
    AbstractC73672Svk<C28467BFf<Void>> uploadEffectRelatedUseLog(@InterfaceC195727mC ModificationUploadRequest modificationUploadRequest);

    @E8M("/webcast/anchor/sound_effect/pin/")
    @EKC({"Content-Type: application/json"})
    AbstractC73672Svk<C28467BFf<Void>> uploadSoundEffectOrder(@InterfaceC195727mC PinSoundEffectRequest pinSoundEffectRequest);
}
