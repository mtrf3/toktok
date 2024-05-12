package com.ss.android.ugc.aweme.shortvideo.edit.audioedit.common.vc;

import X.InterfaceC65349Pkn;
import com.ss.android.ugc.effectmanager.common.model.BaseNetResponse;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public final class VCAudioResponse extends BaseNetResponse {

    @InterfaceC65349Pkn("extra")
    public final VCExtra extra;

    @InterfaceC65349Pkn("results")
    public final List<VCAudioResult> results = new ArrayList();

    @InterfaceC65349Pkn("status_msg")
    public final String statusMsg;
}
