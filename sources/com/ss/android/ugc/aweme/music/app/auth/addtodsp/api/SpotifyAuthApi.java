package com.ss.android.ugc.aweme.music.app.auth.addtodsp.api;

import X.E8M;
import X.InterfaceC195787mI;
import X.InterfaceC64987Pex;
import X.InterfaceC67352kd;
import com.ss.android.ugc.aweme.music.app.auth.addtodsp.model.SpotifyAccessTokenResponse;

/* loaded from: classes34.dex */
public interface SpotifyAuthApi {
    @InterfaceC195787mI
    @E8M("/tiktok/music/tt_to_dsp/token/v1")
    Object getSpotifyAccessToken(@InterfaceC64987Pex("platform") int i, @InterfaceC64987Pex("client_id") String str, @InterfaceC64987Pex("grant_type") int i2, @InterfaceC64987Pex("authentication_code") String str2, @InterfaceC64987Pex("redirect_uri") String str3, InterfaceC67352kd<? super SpotifyAccessTokenResponse> interfaceC67352kd);

    @InterfaceC195787mI
    @E8M("/tiktok/music/tt_to_dsp/token/v1")
    Object refreshSpotifyAccessToken(@InterfaceC64987Pex("platform") int i, @InterfaceC64987Pex("client_id") String str, @InterfaceC64987Pex("grant_type") int i2, @InterfaceC64987Pex("refresh_token") String str2, @InterfaceC64987Pex("redirect_uri") String str3, InterfaceC67352kd<? super SpotifyAccessTokenResponse> interfaceC67352kd);
}
