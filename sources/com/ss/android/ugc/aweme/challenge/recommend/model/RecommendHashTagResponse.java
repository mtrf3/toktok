package com.ss.android.ugc.aweme.challenge.recommend.model;

import X.InterfaceC65349Pkn;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import java.util.List;

/* loaded from: classes8.dex */
public class RecommendHashTagResponse extends BaseResponse {

    @InterfaceC65349Pkn("intervene_list")
    public List<RecommendHashTagData> data;

    @InterfaceC65349Pkn("fill_history_end")
    public boolean fillHistoryEnd;

    @InterfaceC65349Pkn("need_history")
    public boolean needHistory;

    @InterfaceC65349Pkn("need_privacy_history")
    public boolean needPrivacyHistory;

    @InterfaceC65349Pkn("show_privacy_count")
    public int showPrivacyCount;
}
