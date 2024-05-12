package com.ss.android.ugc.gamora.recorder.sticker.templateeffect.service;

import X.E8M;
import X.EQX;
import X.InterfaceC195727mC;
import X.InterfaceC36317ENd;
import X.InterfaceC36318ENe;
import X.InterfaceC36332ENs;
import X.InterfaceC64986Pew;
import X.InterfaceC67352kd;
import com.ss.android.ugc.gamora.recorder.sticker.templateeffect.models.CreateMobileEffectRequest;
import com.ss.android.ugc.gamora.recorder.sticker.templateeffect.models.MobileEffectResponse;
import com.ss.android.ugc.gamora.recorder.sticker.templateeffect.models.UpdateMobileEffectRequest;

/* loaded from: classes7.dex */
public interface TTEPEffectService {
    public static final EQX LIZ = EQX.LIZ;

    @E8M("/api/app/mobile-effect")
    Object createMobileEffect(@InterfaceC195727mC CreateMobileEffectRequest createMobileEffectRequest, @InterfaceC64986Pew("device_platform") String str, InterfaceC67352kd<? super MobileEffectResponse> interfaceC67352kd);

    @InterfaceC36317ENd("/api/app/mobile-effect/{id}")
    Object deleteMobileEffect(@InterfaceC36332ENs("id") String str, @InterfaceC64986Pew("effect_source") int i, InterfaceC67352kd<? super MobileEffectResponse> interfaceC67352kd);

    @InterfaceC36318ENe("/api/app/mobile-effect/{id}")
    Object updateMobileEffect(@InterfaceC36332ENs("id") String str, @InterfaceC64986Pew("effect_source") int i, @InterfaceC195727mC UpdateMobileEffectRequest updateMobileEffectRequest, InterfaceC67352kd<? super MobileEffectResponse> interfaceC67352kd);
}
