package com.ss.android.ugc.aweme.shortvideo.duet;

import X.InterfaceC65349Pkn;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.feed.model.Aweme;

/* loaded from: classes3.dex */
public final class CheckDuetReactPermissionResponse extends BaseResponse {

    @InterfaceC65349Pkn("origin")
    public Aweme aweme;

    @InterfaceC65349Pkn("allow_current")
    public boolean allowCurrent = true;

    @InterfaceC65349Pkn("allow_origin")
    public boolean allowOrigin = true;

    @InterfaceC65349Pkn("reason")
    public String reason = "";
}
