package com.ss.android.ugc.aweme.account.security;

import X.AbstractC73638SvC;
import X.C55673Lt7;
import X.E4Q;
import X.E4T;
import X.InterfaceC195787mI;
import X.InterfaceC64987Pex;
import X.InterfaceC64989Pez;
import com.ss.android.ugc.aweme.base.api.BaseResponse;

/* loaded from: classes10.dex */
public interface SafeInfoNoticeApi {
    public static final C55673Lt7 LIZ = C55673Lt7.LIZ;

    @InterfaceC195787mI
    @E4T("/safe_info/user/confirm/notice/")
    AbstractC73638SvC<BaseResponse> safeInfoConfirm(@InterfaceC64987Pex("notice_id") String str, @InterfaceC64987Pex("notice_type") String str2);

    @E4Q("/safe_info/user/message/notice/")
    AbstractC73638SvC<SafeInfoNoticeMsgResponse> safeInfoNoticeMsg(@InterfaceC64989Pez("adolescent_model") boolean z);
}
