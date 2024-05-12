package com.ss.android.ugc.gamora.recorder.sticker.templateeffect.service;

import X.E8L;
import X.EQU;
import X.InterfaceC64986Pew;
import X.InterfaceC67352kd;
import com.ss.android.ugc.gamora.recorder.sticker.templateeffect.models.MyEffectsResponse;

/* loaded from: classes7.dex */
public interface TemplateEffectsService {
    public static final EQU LIZ = EQU.LIZ;

    @E8L("/aweme/v1/original/effects/")
    Object getMyEffects(@InterfaceC64986Pew("app_version") String str, InterfaceC67352kd<? super MyEffectsResponse> interfaceC67352kd);
}
