package com.ss.android.ugc.aweme.profile.edit.api;

import X.AbstractC73638SvC;
import X.E4Q;
import X.QBL;
import com.ss.android.ugc.aweme.base.api.BaseResponse;

/* loaded from: classes12.dex */
public interface InstagramAPI {
    public static final QBL LIZ = QBL.LIZ;

    @E4Q("/aweme/v1/instagram/unbind/")
    AbstractC73638SvC<BaseResponse> unlink();
}
