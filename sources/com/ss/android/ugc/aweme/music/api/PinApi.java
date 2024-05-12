package com.ss.android.ugc.aweme.music.api;

import X.AbstractC73672Svk;
import X.E4T;
import X.InterfaceC195757mF;
import X.InterfaceC64985Pev;
import com.ss.android.ugc.aweme.base.api.BaseResponse;

/* loaded from: classes5.dex */
public final class PinApi {
    public static PinOperatorApi LIZ;

    /* loaded from: classes5.dex */
    public interface PinOperatorApi {
        @InterfaceC195757mF
        @E4T("/tiktok/user/pinned_pgc_music/create/v1/")
        AbstractC73672Svk<BaseResponse> pinMusic(@InterfaceC64985Pev("sec_user_id") String str, @InterfaceC64985Pev("music_id") String str2);

        @InterfaceC195757mF
        @E4T("/tiktok/user/pinned_pgc_music/delete/v1/")
        AbstractC73672Svk<BaseResponse> unpinMusic(@InterfaceC64985Pev("sec_user_id") String str, @InterfaceC64985Pev("music_id") String str2);
    }
}
