package com.ss.android.ugc.aweme.auth;

import X.AbstractC73672Svk;
import X.C221108m2;
import X.C243929hk;
import X.C62822Ol8;
import X.E8M;
import X.InterfaceC195757mF;
import X.InterfaceC64985Pev;
import X.InterfaceC65349Pkn;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import java.io.Serializable;

/* loaded from: classes5.dex */
public final class MusicAuthorizationApi {
    public static final C62822Ol8 LIZ = C221108m2.LIZIZ(C243929hk.LJLIL);

    /* loaded from: classes5.dex */
    public interface MusicAuthorizationOperatorApi {
        @E8M("/tiktok/music/dsp/auth/v2/")
        @InterfaceC195757mF
        AbstractC73672Svk<AuthResponse> authMusic(@InterfaceC64985Pev("code") String str, @InterfaceC64985Pev("sec_uid") String str2);
    }

    /* loaded from: classes5.dex */
    public static final class AuthResponse extends BaseResponse implements Serializable {

        @InterfaceC65349Pkn("openid")
        public final String openid = "";

        public final String getOpenid() {
            return this.openid;
        }
    }
}
