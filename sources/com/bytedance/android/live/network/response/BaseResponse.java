package com.bytedance.android.live.network.response;

import X.C64672PZs;
import X.C64738Paw;
import X.InterfaceC65349Pkn;
import com.bytedance.android.livesdk.model.Extra;

/* loaded from: classes6.dex */
public class BaseResponse<T, R extends Extra> {
    public C64672PZs LIZ;
    public String LIZIZ;
    public C64738Paw LIZJ;
    public int LIZLLL;
    public transient RequestError LJ;

    @InterfaceC65349Pkn("data")
    public T data;

    @InterfaceC65349Pkn("extra")
    public R extra;

    @InterfaceC65349Pkn("status_code")
    public int statusCode;
}
