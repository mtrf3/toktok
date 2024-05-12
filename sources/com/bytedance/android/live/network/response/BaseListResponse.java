package com.bytedance.android.live.network.response;

import X.C64672PZs;
import X.C64738Paw;
import X.InterfaceC65349Pkn;
import com.bytedance.android.livesdk.model.Extra;
import java.util.List;

/* loaded from: classes6.dex */
public class BaseListResponse<T, R extends Extra> {
    public C64672PZs LIZ;
    public C64738Paw LIZIZ;
    public String LIZJ;
    public transient RequestError LIZLLL;

    @InterfaceC65349Pkn("data")
    public List<T> data;

    @InterfaceC65349Pkn("extra")
    public R extra;

    @InterfaceC65349Pkn("status_code")
    public int statusCode;
}
