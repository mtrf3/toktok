package com.ss.android.ugc.gamora.editor.recommendhashtag;

import X.InterfaceC65349Pkn;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes8.dex */
public final class RecommendHashtagResponse extends BaseResponse {

    @InterfaceC65349Pkn("challenge_list")
    public List<RecommendHashtag> items = new ArrayList();

    @InterfaceC65349Pkn("log_id")
    public String logId = "";

    @InterfaceC65349Pkn("request_order")
    public int requestOrder;
}
