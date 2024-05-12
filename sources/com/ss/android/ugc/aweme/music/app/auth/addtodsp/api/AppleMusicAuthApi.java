package com.ss.android.ugc.aweme.music.app.auth.addtodsp.api;

import X.E8M;
import X.EKC;
import X.InterfaceC36348EOi;
import X.InterfaceC67352kd;
import com.ss.android.ugc.aweme.music.app.auth.addtodsp.model.AppleMusicRefreshTokenResponse;

/* loaded from: classes34.dex */
public interface AppleMusicAuthApi {
    @E8M("/v1/me/renew-music-user-token")
    @EKC({"x-tt-dataflow-id: AppleMusicAuth"})
    Object refreshAppleMusicAccessToken(@InterfaceC36348EOi("Authorization") String str, @InterfaceC36348EOi("Music-User-Token") String str2, InterfaceC67352kd<? super AppleMusicRefreshTokenResponse> interfaceC67352kd);
}
