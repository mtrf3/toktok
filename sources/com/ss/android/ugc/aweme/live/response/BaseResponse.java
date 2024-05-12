package com.ss.android.ugc.aweme.live.response;

import X.InterfaceC65349Pkn;
import com.ss.android.ugc.aweme.live.response.Extra;

/* loaded from: classes6.dex */
public class BaseResponse<T, R extends Extra> {

    @InterfaceC65349Pkn("data")
    public T data;

    @InterfaceC65349Pkn("extra")
    public R extra;

    @InterfaceC65349Pkn("status_code")
    public int statusCode;
}
