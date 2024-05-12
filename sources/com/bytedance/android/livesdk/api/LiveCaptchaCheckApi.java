package com.bytedance.android.livesdk.api;

import X.AbstractC73672Svk;
import X.E8M;
import X.InterfaceC195757mF;
import X.InterfaceC64985Pev;
import tikcast.api.eco.CaptchaCheckResponse;

/* loaded from: classes6.dex */
public interface LiveCaptchaCheckApi {
    @E8M("/webcast/eco/captcha_check/")
    @InterfaceC195757mF
    AbstractC73672Svk<CaptchaCheckResponse> getCaptchaCheckResponse(@InterfaceC64985Pev("captcha_record_id") long j, @InterfaceC64985Pev("room_id") long j2, @InterfaceC64985Pev("check_failed") boolean z);
}
