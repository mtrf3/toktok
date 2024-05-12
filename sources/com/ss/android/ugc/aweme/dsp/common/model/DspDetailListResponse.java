package com.ss.android.ugc.aweme.dsp.common.model;

import X.C61878OQg;
import X.InterfaceC65349Pkn;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import java.io.Serializable;
import java.util.List;

/* loaded from: classes22.dex */
public final class DspDetailListResponse extends BaseResponse implements Serializable {

    @InterfaceC65349Pkn("dsp_list")
    public final List<DspStruct> dspList = C61878OQg.INSTANCE;

    public final List<DspStruct> getDspList() {
        return this.dspList;
    }
}
