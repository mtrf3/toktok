package com.ss.android.ugc.aweme.music.app.auth.addtodsp.model;

import X.InterfaceC65349Pkn;
import X.X1D;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes34.dex */
public final class DspPlatformListResponse extends BaseResponse {

    @InterfaceC65349Pkn("tt_to_dsp_platform_list")
    public final List<TT2DSPPlatformInfo> platformList;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof DspPlatformListResponse) && o.LJ(this.platformList, ((DspPlatformListResponse) obj).platformList);
    }

    public final int hashCode() {
        List<TT2DSPPlatformInfo> list = this.platformList;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("DspPlatformListResponse(platformList=");
        LIZ.append(this.platformList);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public DspPlatformListResponse(List<TT2DSPPlatformInfo> list) {
        this.platformList = list;
    }
}
