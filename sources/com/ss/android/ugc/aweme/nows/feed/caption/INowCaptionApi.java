package com.ss.android.ugc.aweme.nows.feed.caption;

import X.AbstractC73672Svk;
import X.E8M;
import X.InterfaceC195757mF;
import X.InterfaceC64985Pev;
import com.ss.android.ugc.aweme.base.api.BaseResponse;

/* loaded from: classes4.dex */
public interface INowCaptionApi {
    @E8M("/tiktok/post/edit/v1/")
    @InterfaceC195757mF
    AbstractC73672Svk<BaseResponse> editCaption(@InterfaceC64985Pev("aweme_id") String str, @InterfaceC64985Pev("is_text_changed") boolean z, @InterfaceC64985Pev("markup_text") String str2, @InterfaceC64985Pev("text_extra") Integer[] numArr);
}
