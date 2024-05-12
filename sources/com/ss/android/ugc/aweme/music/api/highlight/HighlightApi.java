package com.ss.android.ugc.aweme.music.api.highlight;

import X.AbstractC73672Svk;
import X.E8L;
import X.E8M;
import X.InterfaceC195757mF;
import X.InterfaceC64985Pev;
import X.InterfaceC64986Pew;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.music.model.NewReleasedList;

/* loaded from: classes5.dex */
public final class HighlightApi {
    public static HighlightOperatorApi LIZ;

    /* loaded from: classes5.dex */
    public interface HighlightOperatorApi {
        @E8L("/tiktok/user/new_release_music/list/v1/")
        AbstractC73672Svk<NewReleasedList> getNewReleasedList(@InterfaceC64986Pew("sec_user_id") String str, @InterfaceC64986Pew("scene") String str2);

        @E8M("/tiktok/user/highlight_music/delete/v1/")
        @InterfaceC195757mF
        AbstractC73672Svk<BaseResponse> highlightDelete(@InterfaceC64985Pev("sec_user_id") String str);

        @E8M("/tiktok/user/highlight_music/set/v1/")
        @InterfaceC195757mF
        AbstractC73672Svk<BaseResponse> highlightMusic(@InterfaceC64985Pev("sec_user_id") String str, @InterfaceC64985Pev("music_id") String str2);
    }
}
